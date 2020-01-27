package db;

import android.provider.BaseColumns;

public class DatabaseContract {
    public static String TABLE_NAME = "note";

    public static final class NoteColumns implements BaseColumns {

//        public static int _ID = Integer.parseInt("id");
        public static String _ID = "id";
        public static String TITLE = "title";
        public static String DESCRIPTION = "description";
        public static String DATE = "date";

    }
}
