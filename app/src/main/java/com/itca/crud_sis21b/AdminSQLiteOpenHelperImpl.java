package com.itca.crud_sis21b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelperImpl extends SQLiteOpenHelper implements View.OnClickListener {
    public AdminSQLiteOpenHelperImpl(@Nullable @org.jetbrains.annotations.Nullable Context context, @Nullable @org.jetbrains.annotations.Nullable String name, @Nullable @org.jetbrains.annotations.Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    private EditText et_codigo, et_descripcio, et_precio;
    private Button btnalta, btnconsultar, btnconsulta2, btneliminar, btnmodificar, btnnuevo, btnsalir;

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists articulos");
        onCreate(db);

    }

    @Override
    public void onClick(View v) {
        Switch (view.getId()){


        }
    }
}
