package com.example.fp1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {
    private static final String name = "memodata.db";
    private static final int version = 1;
    DB(Context context)
    {
        super(context,name,null,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE myTable(event text PRIMARY KEY,year integer NOT NULL,month integer NOT NULL,day integer NOT NULL,notee text NOT NULL)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS myTable");
        onCreate(db);
    }
}