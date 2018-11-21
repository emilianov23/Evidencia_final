package com.example.emiliano.evidencia_final;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase_Curp extends SQLiteOpenHelper {

    public static final int DataBase = 4;
    public static final String Base_Nombre = "Curpgenerado.db"

            public DataBase_Curp(Context context){
        super(context, Base_Nombre, null, DataBase);
            }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_Crear);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Version, int nuevaVersion) {
        db.execSQL(SQL_Borrar);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int Version, int nuevaVersion) {
        onUpgrade(db, Version, nuevaVersion);
    }
}
