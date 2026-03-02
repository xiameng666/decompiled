import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import jeb.synthetic.TWR;

public final class flkz extends SQLiteOpenHelper {
    public flkz(Context context0) {
        super(context0, "lighter_registration.db", null, 8);
        flbs.b();
    }

    private static final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE registration ( registration_id INTEGER PRIMARY KEY AUTOINCREMENT, tachyon_app_name TEXT, tachyon_auth_token BLOB, auth_token_expire_at_timestamp_ms INT, identity_key_type INT NOT NULL DEFAULT 1, identity_key_private BLOB, identity_key_public BLOB, server_registration_id BLOB, server_registration_status INTEGER, auth_token_refreshed_at_timestamp_ms INTEGER, registration_properties BLOB);");
        sQLiteDatabase0.execSQL("CREATE TABLE reachability(reachability_id TEXT, reachability_type INT,  registration_id INT,  reachability_normalized_id TEXT, FOREIGN KEY (registration_id) REFERENCES registration(registration_id) ON DELETE CASCADE, PRIMARY KEY (registration_id, reachability_type, reachability_id));");
        sQLiteDatabase0.execSQL("CREATE INDEX registration_tachyon_app_name on registration(tachyon_app_name)");
    }

    private static final void b(SQLiteDatabase sQLiteDatabase0) {
        flnh.d(sQLiteDatabase0);
        flkz.a(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.disableWriteAheadLogging();
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        flkz.a(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        if(v1 < 7) {
            flkz.b(sQLiteDatabase0);
            return;
        }
        flnh.f(sQLiteDatabase0, "registration", "CREATE TABLE registration ( registration_id INTEGER PRIMARY KEY AUTOINCREMENT, tachyon_app_name TEXT, tachyon_auth_token BLOB, auth_token_expire_at_timestamp_ms INT, identity_key_type INT NOT NULL DEFAULT 1, identity_key_private BLOB, identity_key_public BLOB, server_registration_id BLOB, server_registration_status INTEGER, auth_token_refreshed_at_timestamp_ms INTEGER, registration_properties BLOB);", flqu.a);
        flnh.f(sQLiteDatabase0, "reachability", "CREATE TABLE reachability(reachability_id TEXT, reachability_type INT,  registration_id INT,  reachability_normalized_id TEXT, FOREIGN KEY (registration_id) REFERENCES registration(registration_id) ON DELETE CASCADE, PRIMARY KEY (registration_id, reachability_type, reachability_id));", flqs.a);
        sQLiteDatabase0.execSQL("CREATE INDEX registration_tachyon_app_name on registration(tachyon_app_name)");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        if(!sQLiteDatabase0.isReadOnly()) {
            sQLiteDatabase0.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        SQLiteDatabase sQLiteDatabase1;
        if(v < 5) {
            flkz.b(sQLiteDatabase0);
            return;
        }
        int v2 = v + 1;
        while(v2 <= v1) {
            switch(v2) {
                case 6: {
                    sQLiteDatabase0.execSQL("ALTER TABLE reachability ADD COLUMN reachability_normalized_id TEXT;");
                    int v3 = ContactId.ContactType.c.f;
                    sQLiteDatabase1 = sQLiteDatabase0;
                    Cursor cursor0 = sQLiteDatabase1.query("reachability", null, null, null, null, null, null);
                    if(cursor0 != null) {
                        try {
                            if(cursor0.moveToFirst()) {
                                do {
                                    String s = cursor0.getString(0);
                                    int v4 = cursor0.getInt(1);
                                    int v5 = cursor0.getInt(2);
                                    ContentValues contentValues0 = new ContentValues();
                                    contentValues0.put("reachability_normalized_id", (v4 == v3 ? flbd.a(s) : s));
                                    sQLiteDatabase1.update("reachability", contentValues0, "reachability_id = ? AND reachability_type = ? AND registration_id = ?", new String[]{s, Integer.toString(v4), Integer.toString(v5)});
                                }
                                while(cursor0.moveToNext());
                            }
                        }
                        catch(Throwable throwable0) {
                            TWR.safeClose$NT(cursor0, throwable0);
                            throw throwable0;
                        }
                    }
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    break;
                }
                case 7: {
                    sQLiteDatabase0.execSQL("ALTER TABLE registration ADD COLUMN identity_key_type INT NOT NULL DEFAULT 1;");
                    sQLiteDatabase1 = sQLiteDatabase0;
                    break;
                }
                case 8: {
                    sQLiteDatabase0.execSQL("ALTER TABLE registration ADD COLUMN registration_properties BLOB;");
                    sQLiteDatabase1 = sQLiteDatabase0;
                    break;
                }
                default: {
                    sQLiteDatabase1 = sQLiteDatabase0;
                }
            }
            ++v2;
            sQLiteDatabase0 = sQLiteDatabase1;
        }
    }
}

