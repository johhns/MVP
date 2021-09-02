package com.example.mvp.Datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.mvp.Modelo.Empleado;

import java.util.ArrayList;

public class BaseDatos extends SQLiteOpenHelper {

    private Context contexto ;


    public BaseDatos(@Nullable Context context) {
        super( context , "MVP_DB" , null , 1 );
        this.contexto = contexto;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        crearEmpleados(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
       eliminarEmpleados(sqLiteDatabase);
       onCreate(sqLiteDatabase);
    }

    public void crearEmpleados(SQLiteDatabase db) {
        String comando = "CREATE TABLE EMPLEADOS (";
        comando += "CODIGO  INTEGER PRIMARY KEY, ";
        comando += "NOMBRE  TEXT , ";
        comando += "FOTO    INTEGER  ";
        comando += ") ; ";
        db.execSQL(comando);
    }

    public void eliminarEmpleados(SQLiteDatabase db) {
        String comando = "DROP TABLE  IF EXISTS  EMPLEADOS ";
        db.execSQL(comando);
    }


    public void insertarEmpleados( ContentValues contentValues ){
        SQLiteDatabase db = this.getWritableDatabase() ;
        db.insert("EMPLEADOS",null, contentValues) ;
        db.close();
    }

    public ArrayList<Empleado> obtenerTodosLosEmpleados(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM EMPLEADOS " ;
        SQLiteDatabase db = this.getWritableDatabase() ;
        Cursor registros = db.rawQuery( query , null) ;

        while ( registros.moveToNext() ) {
            Empleado empleadoaActual = new Empleado() ;
            empleadoaActual.setCodigo(registros.getInt(0));
            empleadoaActual.setNombre(registros.getString(1));
            empleadoaActual.setFoto(registros.getInt(2));
            empleados.add(empleadoaActual) ;
        }
        db.close();

        return empleados ;
    }


}


