package com.example.mvp.Vista.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp.Adaptadores.AdaptadorEmpleados;
import com.example.mvp.Modelo.Empleado;
import com.example.mvp.Presentador.PresentadorEmpleados;
import com.example.mvp.R;

import java.util.ArrayList;


public class FragmentoEmpleados extends Fragment {

    private RecyclerView reciclerView ;
    private PresentadorEmpleados presentador ;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_empleados, container, false);
        reciclerView = view.findViewById(R.id.recViewEmpleados) ;
        presentador = new PresentadorEmpleados( this, getContext() ) ;
        return view ;
    }

    public void generarLayout(){
        reciclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public AdaptadorEmpleados crearAdaptador(ArrayList<Empleado> empleado) {
        AdaptadorEmpleados adapter = new AdaptadorEmpleados(empleado,getActivity());
        return adapter;
    }

    public void inicializarAdaptadorRV(AdaptadorEmpleados adaptador) {
        reciclerView.setAdapter(adaptador);
    }

}