package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import db.DatabaseContract.NoteColumns;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "dbnotes";

    private static final int DATABASE_VERSION = 2;

    private static final String SQL_CREATE_TABLE_NOTE = String.format("CREATE TABLE %s" + " ( %s INTEGER PRIMARY KEY AUTOINCREMENT," + " %s TEXT NOT NULL," + " %s TEXT NOT NULL," + " %s TEXT NOT NULL)", DatabaseContract.TABLE_NAME, NoteColumns._ID, NoteColumns.TITLE, NoteColumns.DESCRIPTION, NoteColumns.DATE);

//    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_NOTE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseContract.TABLE_NAME);
        onCreate(db);
    }
}
