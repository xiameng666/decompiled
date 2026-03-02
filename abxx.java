import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import jeb.synthetic.TWR;

final class abxx {
    public static String a(SQLiteDatabase sQLiteDatabase0, abyc abyc0) {
        String s = null;
        if(sQLiteDatabase0 != null) {
            Cursor cursor0 = sQLiteDatabase0.query("incarnation_appdatasearch", new String[]{"incarnation"}, "corpus_name = ?", new String[]{abyc0.a}, null, null, null);
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToNext()) {
                        s = cursor0.getString(cursor0.getColumnIndex("incarnation"));
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
                cursor0.close();
                return s;
            }
        }
        return null;
    }

    static void b(SQLiteDatabase sQLiteDatabase0) {
        if(!abyd.e(sQLiteDatabase0, "version_appdatasearch")) {
            sQLiteDatabase0.execSQL(String.format("CREATE TABLE [%s] ([%s] INTEGER)", "version_appdatasearch", "version"));
            ContentValues contentValues0 = new ContentValues(1);
            contentValues0.put("version", Integer.valueOf(6));
            sQLiteDatabase0.insert("version_appdatasearch", null, contentValues0);
        }
        if(!abyd.e(sQLiteDatabase0, "incarnation_appdatasearch")) {
            sQLiteDatabase0.execSQL(String.format("CREATE TABLE [%s] ([%s] STRING PRIMARY KEY, [%s] STRING, [%s] INTEGER)", "incarnation_appdatasearch", "corpus_name", "incarnation", "seqno_table_complete"));
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase0, abyc abyc0, boolean z) {
        ContentValues contentValues0 = new ContentValues(1);
        contentValues0.put("seqno_table_complete", Integer.valueOf(((int)z)));
        sQLiteDatabase0.update("incarnation_appdatasearch", contentValues0, "corpus_name = ?", new String[]{abyc0.a});
    }
}

