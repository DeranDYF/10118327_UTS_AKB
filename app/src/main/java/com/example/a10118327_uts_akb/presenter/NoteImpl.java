package com.example.a10118327_uts_akb.presenter;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.a10118327_uts_akb.model.Note;

public class NoteImpl extends SQLiteOpenHelper implements NoteInterfaces{

    public NoteImpl(@Nullable Context context) {
        super(context, "db_note", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE tbl_note (id TEXT,title TEXT,category TEXT ,description TEXT,date TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE tbl_note");
    }


    @Override
    public Cursor read() {
        SQLiteDatabase db = getReadableDatabase();
        return db.rawQuery("SELECT * FROM tbl_note ",null);
    }

    @Override
    public boolean create(Note note) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO tbl_note VALUES ('"+note.getId()+"','"+note.getTitle()+"','"+note.getCategory()+"','"+note.getDesc()+"','"+note.getDate()+"')");
        return true;
    }

    @Override
    public boolean update(Note note) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE tbl_note SET title ='"+note.getTitle()+"' , category = '"+note.getCategory()+"' , description = '"+note.getDesc()+"' , date = '"+note.getDate()+"' WHERE id='"+note.getId()+"'");
        return true;
    }

    @Override
    public boolean delete(String id) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM tbl_note WHERE id='"+id+"'");
        return true;
    }

}
// 3 JUNI 2021
//10118327
// DERAN DERIYANA FAUZZAN
//IF-8
