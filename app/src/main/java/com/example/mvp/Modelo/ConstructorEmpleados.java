package com.example.mvp.Modelo;

import android.content.ContentValues;
import android.content.Context;

import com.example.mvp.Datos.BaseDatos;
import com.example.mvp.R;

import java.util.ArrayList;

public class ConstructorEmpleados {

    private Context contexto ;


    public ConstructorEmpleados(Context contexto) {
        this.contexto = contexto ;
    }

    public ArrayList<Empleado> obtenerDatos(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        BaseDatos db = new BaseDatos(contexto) ;
        insertarEmpleados(db);
        return db.obtenerTodosLosEmpleados();
    }

    public void insertarEmpleados( BaseDatos db ){
        ContentValues contentValues = new ContentValues() ;
        contentValues.put("CODIGO",120);
        contentValues.put("NOMBRE","CARLOS PEREZ");
        contentValues.put("FOTO", R.drawable.persona);
        db.insertarEmpleados(contentValues);

        contentValues = new ContentValues() ;
        contentValues.put("CODIGO",140);
        contentValues.put("NOMBRE","JOSE VASQUEZ");
        contentValues.put("FOTO", R.drawable.persona);
        db.insertarEmpleados(contentValues);

        contentValues = new ContentValues() ;
        contentValues.put("CODIGO",205);
        contentValues.put("NOMBRE","ROSA MEZA");
        contentValues.put("FOTO", R.drawable.persona);
        db.insertarEmpleados(contentValues);

        contentValues = new ContentValues() ;
        contentValues.put("CODIGO",345);
        contentValues.put("NOMBRE","JUAN VALDEZ");
        contentValues.put("FOTO", R.drawable.persona);
        db.insertarEmpleados(contentValues);

        contentValues = new ContentValues() ;
        contentValues.put("CODIGO",422);
        contentValues.put("NOMBRE","ZOILA MADRINA");
        contentValues.put("FOTO", R.drawable.persona);
        db.insertarEmpleados(contentValues);

    }

}
