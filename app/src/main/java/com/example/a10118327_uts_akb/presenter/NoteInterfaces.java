package com.example.a10118327_uts_akb.presenter;

import android.database.Cursor;

import com.example.a10118327_uts_akb.model.Note;

public interface NoteInterfaces {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
// 3 JUNI 2021
//10118327
// DERAN DERIYANA FAUZZAN
//IF-8