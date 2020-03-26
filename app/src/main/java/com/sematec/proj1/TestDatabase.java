package com.sematec.proj1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TestDatabase extends SQLiteOpenHelper {
    String TABLE_NAME = "student";
    public TestDatabase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREAE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT, " +
                "family TEXT, " +
                "grade INTEGER " +
                ")";
        db.execSQL(CREAE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public  void  insertStudent (String name, String family, int grade){
        String INSERT_STUDENT_QUERY = "INSERT INTO " + TABLE_NAME + "(name,family,grade) VALUES("
                +"'"+name+"'"+","
                +"'"+family+"'"+","
                +grade
                +")";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(INSERT_STUDENT_QUERY);
        db.close();
    }

    public String getALLStudentsName (){
        String GET_ALL_STUDENT_NAME = "SELECT name FROM " + TABLE_NAME;
        String names = "";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(GET_ALL_STUDENT_NAME,null);
        while (c.moveToNext()) {
            names = names + c.getString(0) + "\n";
        }

        db.close();
        return names;
    }

    }

