package com.example.mvp.Adaptadores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.Modelo.ConstructorEmpleados;
import com.example.mvp.Modelo.Empleado;
import com.example.mvp.R;

import java.util.ArrayList;

public class AdaptadorEmpleados extends RecyclerView.Adapter<AdaptadorEmpleados.ViewHolder> {

    ArrayList<Empleado>  empleados ;
    Activity             activity  ;

    public AdaptadorEmpleados(ArrayList<Empleado>  empleados, Activity activity) {
        this.empleados = empleados ;
        this.activity  = activity  ;
    }

    @NonNull
    @Override
    public AdaptadorEmpleados.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from( parent.getContext() ).inflate(R.layout.empleados_card,null,false) ;
        return new ViewHolder( vista );
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorEmpleados.ViewHolder holder, int position) {
        ConstructorEmpleados constructorEmpleados = new ConstructorEmpleados(activity) ;
        holder.tvCodigo.setText( String.valueOf( empleados.get(position).getCodigo() ) ) ;
        holder.tvNombre.setText( empleados.get(position).getNombre() );
        holder.imgFoto.setImageResource( empleados.get(position).getFoto() );
    }

    @Override
    public int getItemCount() {
        return empleados.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvNombre, tvCodigo ;
        ImageView imgFoto ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCodigo = itemView.findViewById(R.id.txtCodigoEmpleado) ;
            tvNombre = itemView.findViewById(R.id.txtNombreEmpleado) ;
            imgFoto = itemView.findViewById(R.id.imgEmpleado) ;
        }
    }
}
