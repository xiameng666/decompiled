import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public final class ajfo extends bboo {
    public static final String[] a;
    private static final Object c;
    private static ajfo d;
    private static int e;
    private static final baun f;

    static {
        ajfo.f = new baun(new String[]{"DatabaseHelper"}, null);
        ajfo.c = new Object();
        ajfo.a = new String[]{"CREATE TABLE keys(key_handle STRING NOT NULL, key_name STRING NOT NULL, key_form INTEGER NOT NULL, key_type STRING NOT NULL, account STRING NOT NULL, master_key STRING, public_key STRING, private_key STRING, active_status INTEGER NOT NULL, creation_time INTEGER NOT NULL, exportable INTEGER NOT NULL, expiration_time INTEGER NOT NULL, PRIMARY KEY(key_handle,account));", "CREATE TABLE metadata(identifier STRING NOT NULL, account STRING NOT NULL, client_metadata STRING, PRIMARY KEY(account,identifier));", "CREATE TABLE group_keys(key_name STRING NOT NULL, account STRING NOT NULL, key_state INTEGER, public_key STRING, private_key STRING, PRIMARY KEY(key_name,account,key_state));"};
        ajfo.e = 0;
    }

    private ajfo(Context context0) {
        super(context0, "cryptauthkeys.db", 5);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        baun baun0 = ajfo.f;
        baun0.d("Creating Cryptauth database with version : 5", new Object[0]);
        String[] arr_s = ajfo.a;
        for(int v = 0; v < 3; ++v) {
            String s = arr_s[v];
            baun0.d("Executing: " + s, new Object[0]);
            sQLiteDatabase0.execSQL(s);
        }
    }

    @Override  // bboo
    protected final void b(SQLiteDatabase sQLiteDatabase0) {
        ajfo.f.d("opened database cryptauthkeys.db", new Object[0]);
    }

    public static ajfo c(Context context0) {
        synchronized(ajfo.c) {
            if(ajfo.d == null) {
                ajfo.e = 0;
                ajfo.d = new ajfo(context0);
            }
            ++ajfo.e;
        }
        return ajfo.d;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void close() {
        synchronized(this) {
            Object object0 = ajfo.c;
            synchronized(object0) {
                int v2 = ajfo.e - 1;
                ajfo.e = v2;
                if(v2 == 0) {
                    if(ajfo.d != null) {
                        super.close();
                    }
                    ajfo.d = null;
                }
            }
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        return "cryptauthkeys.db";
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase0;
        synchronized(this) {
            sQLiteDatabase0 = super.getReadableDatabase();
        }
        return sQLiteDatabase0;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase0;
        synchronized(this) {
            try {
                sQLiteDatabase0 = super.getWritableDatabase();
            }
            catch(SQLiteException sQLiteException0) {
                ajfo.f.n("Failed to open Cryptauth database.", sQLiteException0, new Object[0]);
                throw sQLiteException0;
            }
        }
        return sQLiteDatabase0;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        ajfo.f.d(a.z(v1, v, "Updating database version from ", " to new version "), new Object[0]);
        while(true) {
            ++v;
            if(v > v1) {
                break;
            }
            switch(v) {
                case 2: {
                    sQLiteDatabase0.execSQL("ALTER TABLE keys ADD COLUMN exportable INTEGER DEFAULT 2");
                    break;
                }
                case 3: {
                    sQLiteDatabase0.execSQL("CREATE TABLE metadata(identifier STRING NOT NULL, account STRING NOT NULL, client_metadata STRING, PRIMARY KEY(account,identifier));");
                    break;
                }
                case 4: {
                    sQLiteDatabase0.execSQL("CREATE TABLE group_keys(key_name STRING NOT NULL, account STRING NOT NULL, key_state INTEGER, public_key STRING, private_key STRING, PRIMARY KEY(key_name,account,key_state));");
                    break;
                }
                case 5: {
                    sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS group_keys");
                    sQLiteDatabase0.execSQL("CREATE TABLE group_keys(key_name STRING NOT NULL, account STRING NOT NULL, key_state INTEGER, public_key STRING, private_key STRING, PRIMARY KEY(key_name,account,key_state));");
                }
            }
        }
    }
}

