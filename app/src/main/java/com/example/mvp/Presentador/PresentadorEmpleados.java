package com.example.mvp.Presentador;

import android.content.Context;

import com.example.mvp.Modelo.ConstructorEmpleados;
import com.example.mvp.Modelo.Empleado;
import com.example.mvp.Vista.Fragmentos.FragmentoEmpleados;

import java.util.ArrayList;

public class PresentadorEmpleados {

   private FragmentoEmpleados   fragmento ;
   private Context              contexto  ;
   private ArrayList<Empleado>  empleados ;
   private ConstructorEmpleados constructorEmpleados ;

   public PresentadorEmpleados( FragmentoEmpleados  fragmento, Context contexto ){
      this.fragmento = fragmento ;
      this.contexto  = contexto  ;
      obtenerEmpleados();
   }

   public void obtenerEmpleados(){
      constructorEmpleados = new ConstructorEmpleados(contexto);
      empleados = constructorEmpleados.obtenerDatos();
      mostrarEmpleados();
   }

   public void mostrarEmpleados(){
      fragmento.inicializarAdaptadorRV(fragmento.crearAdaptador(empleados));
      fragmento.generarLayout();
   }

}
