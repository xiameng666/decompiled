import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public final class flkx extends SQLiteOpenHelper {
    static final String[] a;
    private final Context b;

    static {
        flkx.a = new String[]{"id", "conversation_type", "conversation_group_id", "conversation_group_app_name", "other_contact_row_id", "update_timestamp_us", "owner_row_id", "conversation_app_data", "conversation_properties"};
    }

    public flkx(Context context0, long v) {
        super(context0, String.format("lighter_messaging_%d.db", v), null, 27);
        flbs.b();
        gftb.b(v >= 0L, "registrationId is invalid; ensure AccountContext is valid");
        this.b = context0;
    }

    private static gfsx a(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hnwb.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return gfsx.m(((hnwb)hftv0));
        }
        catch(hfur unused_ex) {
            return gfqx.a;
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2) {
        boolean z;
        Cursor cursor0;
        try {
            sQLiteDatabase0.execSQL(a.ak(s2, s1, new StringBuilder(), s, "ALTER TABLE ", " ADD COLUMN ", " ", ";"));
        }
        catch(SQLException sQLException0) {
            try {
                cursor0 = null;
                z = false;
                cursor0 = sQLiteDatabase0.rawQuery(a.a(s, "select * from ", " limit 0"), null);
                if(cursor0 != null && cursor0.getColumnIndex(s1) != -1) {
                    goto label_17;
                }
                else {
                    goto label_18;
                }
                throw sQLException0;
            }
            catch(RuntimeException runtimeException0) {
                try {
                    flbj.d("Messaging SqliteHelper", a.d(s, s1, "failed to check column ", " in table ", "."), runtimeException0);
                }
                catch(Throwable throwable0) {
                    goto label_14;
                }
                if(cursor0 != null && !cursor0.isClosed()) {
                    cursor0.close();
                }
                else {
                    goto label_20;
                }
                throw sQLException0;
            }
            catch(Throwable throwable0) {
            label_14:
                if(cursor0 != null && !cursor0.isClosed()) {
                    cursor0.close();
                }
                throw throwable0;
            }
        label_17:
            z = true;
        label_18:
            if(cursor0 != null && !cursor0.isClosed()) {
                cursor0.close();
            }
        label_20:
            if(z) {
                return;
            }
            throw sQLException0;
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL(flqn.b);
        sQLiteDatabase0.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
        sQLiteDatabase0.execSQL("CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, local_update_timestamp_ms INT NOT NULL DEFAULT 0,owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)");
        sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase0.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)");
        sQLiteDatabase0.execSQL("CREATE TABLE kvstore (key TEXT UNIQUE NOT NULL,value BLOB NOT NULL)");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS deleted_conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_id_string TEXT,local_delete_timestamp_ms INT NOT NULL DEFAULT 0)");
    }

    private static void d(SQLiteDatabase sQLiteDatabase0) {
        flnh.d(sQLiteDatabase0);
        flkx.c(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.disableWriteAheadLogging();
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        flkx.c(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        if(v1 < 19) {
            flkx.d(sQLiteDatabase0);
            return;
        }
        while(true) {
            --v;
            if(v < v1) {
                break;
            }
            switch(v) {
                case 19: {
                    flnh.f(sQLiteDatabase0, "messages", flqn.b, flqn.a);
                    flnh.f(sQLiteDatabase0, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, local_update_timestamp_ms INT NOT NULL DEFAULT 0,owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", flkx.a);
                    flnh.f(sQLiteDatabase0, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)", flqi.a);
                    flnh.f(sQLiteDatabase0, "participants", "CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)", flqq.a);
                    flnh.f(sQLiteDatabase0, "blocks", "CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)", flqg.a);
                    flnh.f(sQLiteDatabase0, "notifications", "CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)", flqp.a);
                    sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                    sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                    sQLiteDatabase0.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
                    break;
                }
                case 20: {
                    flnh.f(sQLiteDatabase0, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", flkx.a);
                    break;
                }
                case 26: {
                    sQLiteDatabase0.execSQL("DROP TABLE deleted_conversations");
                }
            }
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        if(!sQLiteDatabase0.isReadOnly()) {
            sQLiteDatabase0.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        int v3;
        ProtoLiteMessage hftv0;
        hfsl hfsl0;
        hftc hftc0;
        gfsx gfsx0;
        Cursor cursor5;
        Cursor cursor4;
        Cursor cursor3;
        Cursor cursor2;
        Cursor cursor1;
        Random random1;
        Cursor cursor0;
        Random random0;
        int v6;
        long v5;
        flkx flkx0 = this;
        SQLiteDatabase sQLiteDatabase1 = sQLiteDatabase0;
        flsl flsl0 = flsl.a(flkx0.b);
        fmai fmai0 = fmaj.a();
        fmai0.g(202);
        fmai0.f(381);
        flsl0.b(fmai0.a());
        if(v < 11) {
            try {
                flkx.d(sQLiteDatabase1);
            }
            catch(RuntimeException runtimeException0) {
                goto label_294;
            }
        }
        else {
            int v2 = v + 1;
            while(v2 <= v1) {
                switch(v2) {
                    case 12: {
                        try {
                            v3 = 12;
                            flnh.e(sQLiteDatabase1, "notifications");
                            sQLiteDatabase1.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY, notification_id TEXT UNIQUE NOT NULL, notification_type INTEGER NOT NULL, notification_metadata BLOB NOT NULL, notification_properties BLOB NOT NULL)");
                            flkx0 = this;
                            goto label_291;
                        label_19:
                            v3 = 13;
                            flkx.b(sQLiteDatabase1, "notifications", "notification_timestamp_received_ms", "INTEGER NOT NULL default 0");
                            flkx0 = this;
                            goto label_291;
                        label_22:
                            v3 = 14;
                            flnh.g(sQLiteDatabase1, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL)");
                            flnh.g(sQLiteDatabase1, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,owner_row_id INT,FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
                            flkx0 = this;
                            goto label_291;
                        label_26:
                            v3 = 15;
                            int v4 = (int)iaea.d();
                            v5 = iaea.c();
                            v6 = v4;
                            random0 = new Random();
                            cursor0 = sQLiteDatabase1.query("conversations", new String[]{"id", "conversation_properties"}, null, null, null, null, null);
                            goto label_32;
                        }
                        catch(RuntimeException runtimeException0) {
                            goto label_84;
                        }
                    }
                    case 13: {
                        goto label_19;
                    }
                    case 14: {
                        goto label_22;
                    }
                    case 15: {
                        goto label_26;
                        try {
                            while(true) {
                            label_32:
                                long v7 = -1L;
                                boolean z = cursor0.moveToNext();
                                if(!z) {
                                    goto label_55;
                                }
                                HashMap hashMap0 = floc.b(cursor0.getBlob(1));
                                long v8 = (long)(((Long)hashMap0.get("last_sync_date")));
                                if(v8 != -1L) {
                                    v7 = v8 + ((long)random0.nextInt(v6)) + v5;
                                }
                                hashMap0.put("expiration_time_ms", Long.valueOf(v7));
                                hashMap0.remove("last_sync_date");
                                try {
                                    byte[] arr_b = flbm.i(hashMap0);
                                    ContentValues contentValues0 = new ContentValues();
                                    contentValues0.put("conversation_properties", arr_b);
                                    sQLiteDatabase1.update("conversations", contentValues0, "id = ?", new String[]{String.valueOf(cursor0.getInt(0))});
                                }
                                catch(IOException unused_ex) {
                                    flbj.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                            if(cursor0 != null) {
                                try {
                                    cursor0.close();
                                }
                                catch(Throwable throwable1) {
                                    try {
                                        throwable0.addSuppressed(throwable1);
                                        throw throwable0;
                                    label_55:
                                        cursor0.close();
                                        random1 = new Random();
                                        cursor1 = sQLiteDatabase1.query("contacts", new String[]{"id", "contact_properties"}, null, null, null, null, null);
                                        goto label_58;
                                    }
                                    catch(RuntimeException runtimeException0) {
                                        goto label_84;
                                    }
                                }
                            }
                            throw throwable0;
                        }
                        try {
                            while(true) {
                            label_58:
                                if(!cursor1.moveToNext()) {
                                    goto label_81;
                                }
                                HashMap hashMap1 = flbm.g(cursor1.getBlob(1));
                                long v9 = (long)(((Long)hashMap1.get("last_sync_date")));
                                long v10 = v9 == -1L ? -1L : v9 + ((long)random1.nextInt(v6)) + v5;
                                hashMap1.put("expiration_time_ms", Long.valueOf(v10));
                                hashMap1.remove("last_sync_date");
                                try {
                                    byte[] arr_b1 = flbm.i(hashMap1);
                                    ContentValues contentValues1 = new ContentValues();
                                    contentValues1.put("contact_properties", arr_b1);
                                    sQLiteDatabase1.update("contacts", contentValues1, "id = ?", new String[]{String.valueOf(cursor1.getInt(0))});
                                }
                                catch(IOException unused_ex) {
                                    flbj.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                }
                            }
                        }
                        catch(Throwable throwable2) {
                            if(cursor1 != null) {
                                try {
                                    cursor1.close();
                                }
                                catch(Throwable throwable3) {
                                    try {
                                        throwable2.addSuppressed(throwable3);
                                        throw throwable2;
                                    label_81:
                                        cursor1.close();
                                        flkx0 = this;
                                        goto label_291;
                                    }
                                    catch(RuntimeException runtimeException0) {
                                    }
                                    goto label_84;
                                }
                            }
                            throw throwable2;
                        }
                    label_84:
                        flkx0 = this;
                        break;
                    }
                    case 16: {
                        try {
                            v3 = 16;
                            flkx.b(sQLiteDatabase1, "blocks", "lighter_id_normalized_id", "TEXT");
                            sQLiteDatabase1.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                            flkx.b(sQLiteDatabase1, "contacts", "lighter_id_normalized_id", "TEXT");
                            cursor2 = sQLiteDatabase1.query("blocks", null, null, null, null, null, null);
                        }
                        catch(RuntimeException runtimeException0) {
                            break;
                        }
                        if(cursor2 != null) {
                            try {
                                if(cursor2.moveToFirst()) {
                                    do {
                                        int v11 = cursor2.getInt(0);
                                        String s = cursor2.getString(2);
                                        ContentValues contentValues2 = new ContentValues();
                                        if(cursor2.getInt(1) == 2) {
                                            s = flbd.a(s);
                                        }
                                        contentValues2.put("lighter_id_normalized_id", s);
                                        sQLiteDatabase1.update("blocks", contentValues2, "id = ? ", new String[]{Integer.toString(v11)});
                                    }
                                    while(cursor2.moveToNext());
                                }
                            }
                            catch(Throwable throwable4) {
                                try {
                                    cursor2.close();
                                    throw throwable4;
                                }
                                catch(Throwable throwable5) {
                                    try {
                                        throwable4.addSuppressed(throwable5);
                                        throw throwable4;
                                    label_110:
                                        if(cursor2 != null) {
                                            cursor2.close();
                                        }
                                        cursor3 = sQLiteDatabase1.query("contacts", null, null, null, null, null, null);
                                        goto label_113;
                                    }
                                    catch(RuntimeException runtimeException0) {
                                        break;
                                    }
                                }
                            }
                        }
                        goto label_110;
                    label_113:
                        if(cursor3 != null) {
                            try {
                                if(cursor3.moveToFirst()) {
                                    do {
                                        int v12 = cursor3.getInt(0);
                                        String s1 = cursor3.getString(2);
                                        ContentValues contentValues3 = new ContentValues();
                                        if(cursor3.getInt(1) == 2) {
                                            s1 = flbd.a(s1);
                                        }
                                        contentValues3.put("lighter_id_normalized_id", s1);
                                        sQLiteDatabase1.update("contacts", contentValues3, "id = ? ", new String[]{Integer.toString(v12)});
                                    }
                                    while(cursor3.moveToNext());
                                }
                            }
                            catch(Throwable throwable6) {
                                try {
                                    cursor3.close();
                                    throw throwable6;
                                }
                                catch(Throwable throwable7) {
                                    try {
                                        throwable6.addSuppressed(throwable7);
                                        throw throwable6;
                                    label_130:
                                        if(cursor3 != null) {
                                            cursor3.close();
                                            goto label_291;
                                        label_133:
                                            v3 = 17;
                                            flkx.b(sQLiteDatabase1, "messages", "needs_delivery_receipt", "INTEGER NOT NULL default 0");
                                            goto label_291;
                                        label_136:
                                            v3 = 18;
                                            flkx.b(sQLiteDatabase1, "conversations", "conversation_app_data", "BLOB NOT NULL default 0");
                                            cursor4 = sQLiteDatabase1.query("conversations", new String[]{"id", "conversation_properties"}, null, null, null, null, null);
                                            goto label_139;
                                        }
                                        goto label_291;
                                    }
                                    catch(RuntimeException runtimeException0) {
                                        break;
                                    }
                                }
                            }
                        }
                        goto label_130;
                    }
                    case 17: {
                        goto label_133;
                    }
                    case 18: {
                        goto label_136;
                        try {
                            while(true) {
                            label_139:
                                if(!cursor4.moveToNext()) {
                                    goto label_158;
                                }
                                HashMap hashMap2 = floc.b(cursor4.getBlob(1));
                                HashMap hashMap3 = (HashMap)hashMap2.get("app_data");
                                hashMap2.remove("app_data");
                                try {
                                    byte[] arr_b2 = flbm.i(hashMap2);
                                    ContentValues contentValues4 = new ContentValues();
                                    contentValues4.put("conversation_properties", arr_b2);
                                    contentValues4.put("conversation_app_data", floc.d(hashMap3));
                                    sQLiteDatabase1.update("conversations", contentValues4, "id = ?", new String[]{String.valueOf(cursor4.getInt(0))});
                                }
                                catch(IOException unused_ex) {
                                    flbj.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                }
                            }
                        }
                        catch(Throwable throwable8) {
                            if(cursor4 != null) {
                                try {
                                    cursor4.close();
                                }
                                catch(Throwable throwable9) {
                                    try {
                                        throwable8.addSuppressed(throwable9);
                                        throw throwable8;
                                    label_158:
                                        cursor4.close();
                                        goto label_291;
                                    label_160:
                                        v3 = 19;
                                        flkx.b(sQLiteDatabase1, "messages", "capability", "INTEGER NOT NULL DEFAULT -1");
                                        goto label_291;
                                    label_163:
                                        v3 = 20;
                                        flkx.b(sQLiteDatabase1, "messages", "rendering_type", "INTEGER NOT NULL DEFAULT " + fmfz.a.g);
                                        sQLiteDatabase1.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
                                        goto label_291;
                                    label_167:
                                        v3 = 21;
                                        flkx.b(sQLiteDatabase1, "conversations", "last_deleted_timestamp_us", "INT NOT NULL DEFAULT 0");
                                        goto label_291;
                                    label_170:
                                        v3 = 22;
                                        flkx.b(sQLiteDatabase1, "messages", "filterable_flags", "INTEGER NOT NULL DEFAULT 0");
                                        goto label_291;
                                    label_173:
                                        v3 = 23;
                                        sQLiteDatabase1.execSQL("CREATE TABLE IF NOT EXISTS kvstore (key TEXT UNIQUE NOT NULL,value BLOB NOT NULL)");
                                        goto label_291;
                                    }
                                    catch(RuntimeException runtimeException0) {
                                        break;
                                    }
                                }
                            }
                            throw throwable8;
                        }
                    }
                    case 19: {
                        goto label_160;
                    }
                    case 20: {
                        goto label_163;
                    }
                    case 21: {
                        goto label_167;
                    }
                    case 22: {
                        goto label_170;
                    }
                    case 23: {
                        goto label_173;
                    }
                    case 24: {
                        v3 = 24;
                        cursor5 = sQLiteDatabase1.query("messages", new String[]{"id", "message_properties"}, "capability <> ?", new String[]{"-1"}, null, null, null);
                        try {
                            while(true) {
                                if(!cursor5.moveToNext()) {
                                    goto label_246;
                                }
                                HashMap hashMap4 = flon.d(cursor5.getBlob(1));
                                byte[] arr_b3 = (byte[])hashMap4.get("message_content");
                                if(arr_b3.length != 0) {
                                    int v13 = fmfn.b(glwy.c(((byte[])hashMap4.get("content_type"))));
                                    if(v13 == 1) {
                                        try {
                                            try {
                                                gfsx0 = flkx.a(Base64.decode(arr_b3, 8));
                                                if(!gfsx0.i()) {
                                                    gfsx0 = flkx.a(arr_b3);
                                                }
                                            }
                                            catch(IllegalArgumentException unused_ex) {
                                                gfsx0 = flkx.a(arr_b3);
                                            }
                                            if(!gfsx0.i()) {
                                                continue;
                                            }
                                            ByteString hfsf0 = ((hnwb)gfsx0.d()).d;
                                            hftc0 = hftc.a();
                                            hfsl0 = hfsf0.k();
                                            hftv0 = ((ProtoLiteMessage)hnub.a).x_newMutableInstance();
                                        }
                                        catch(IOException unused_ex) {
                                            goto label_237;
                                        }
                                        try {
                                            hfwc hfwc0 = hfvu.a.c(hftv0);
                                            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                                            hfwc0.g(hftv0);
                                            goto label_217;
                                        }
                                        catch(hfur hfur0) {
                                        }
                                        catch(hfwr hfwr0) {
                                            goto label_204;
                                        }
                                        catch(IOException iOException0) {
                                            goto label_208;
                                        }
                                        catch(RuntimeException runtimeException1) {
                                            goto label_214;
                                        }
                                        try {
                                            if(hfur0.b) {
                                                hfur0 = new hfur(hfur0);
                                            }
                                            hfur0.a = hftv0;
                                            throw hfur0;
                                        label_204:
                                            hfur hfur1 = hfwr0.a();
                                            hfur1.a = hftv0;
                                            throw hfur1;
                                        label_208:
                                            if((iOException0.getCause() instanceof hfur)) {
                                                throw (hfur)iOException0.getCause();
                                            }
                                            hfur hfur2 = new hfur(iOException0);
                                            hfur2.a = hftv0;
                                            throw hfur2;
                                        label_214:
                                            if((runtimeException1.getCause() instanceof hfur)) {
                                                throw (hfur)runtimeException1.getCause();
                                            }
                                            throw runtimeException1;
                                            try {
                                            label_217:
                                                hfsl0.z(0);
                                            }
                                            catch(hfur hfur3) {
                                                hfur3.a = hftv0;
                                                throw hfur3;
                                            }
                                            ProtoLiteMessage.P_makeImmutable(hftv0);
                                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnqr.a).v_newBuilder();
                                            boolean z1 = hftp0.b_message.isImmutable();
                                            if(!z1) {
                                                hftp0.ensureMutable();
                                            }
                                            hnqr hnqr0 = (hnqr)hftp0.b_message;
                                            ((hnub)hftv0).getClass();
                                            hnqr0.c = (hnub)hftv0;
                                            hnqr0.b |= 1;
                                            hashMap4.put("message_content", ByteString.copyFrom(Base64.encode(((hnqr)hftp0.N_build()).toBytesArray(), 8)).toByteArray());
                                            byte[] arr_b4 = flbm.i(hashMap4);
                                            ContentValues contentValues5 = new ContentValues();
                                            contentValues5.put("message_properties", arr_b4);
                                            sQLiteDatabase1.update("messages", contentValues5, "id = ?", new String[]{String.valueOf(cursor5.getInt(0))});
                                        }
                                        catch(IOException unused_ex) {
                                        label_237:
                                            flbj.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                        }
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable10) {
                            if(cursor5 != null) {
                                try {
                                    cursor5.close();
                                }
                                catch(Throwable throwable11) {
                                    try {
                                        throwable10.addSuppressed(throwable11);
                                        throw throwable10;
                                    label_246:
                                        cursor5.close();
                                        goto label_291;
                                    label_248:
                                        v3 = 25;
                                        Cursor cursor6;
                                        for(cursor6 = sQLiteDatabase1.query("contacts", new String[]{"id"}, "lighter_id_app_name = ?", new String[]{"GMM"}, null, null, null); cursor6.moveToNext(); cursor6 = cursor6) {
                                            int v14 = cursor6.getInt(0);
                                            Cursor cursor7 = sQLiteDatabase0.query("messages", new String[]{"conversation_row_id"}, "sender_contact_row_id = ?  AND message_type = ? ", new String[]{String.valueOf(v14), "0"}, null, null, null);
                                            if(cursor7.moveToNext()) {
                                                String s2 = String.valueOf(cursor7.getInt(0));
                                                Cursor cursor8 = sQLiteDatabase0.query("conversations", new String[]{"conversation_app_data"}, "id = ?  AND conversation_type = ?", new String[]{s2, String.valueOf(ConversationId.IdType.b.c)}, null, null, null);
                                                if(cursor8.moveToNext()) {
                                                    gfsx gfsx1 = flwt.a(flbm.h(cursor8.getBlob(0)));
                                                    if(gfsx1.i()) {
                                                        for(Object object0: ((flto)gfsx1.d()).a) {
                                                            ContactId contactId0 = (ContactId)object0;
                                                            if(contactId0.c().i() && ((String)contactId0.c().d()).equals("lfb")) {
                                                                ContentValues contentValues6 = new ContentValues();
                                                                contentValues6.put("lighter_id_type", Integer.valueOf(contactId0.b().f));
                                                                contentValues6.put("lighter_id_id", contactId0.d());
                                                                String s3 = contactId0.b() == ContactId.ContactType.c ? flbd.a(contactId0.d()) : contactId0.d();
                                                                contentValues6.put("lighter_id_normalized_id", s3);
                                                                contentValues6.put("lighter_handler_id", ((String)contactId0.c().g()));
                                                                contentValues6.put("lighter_id_app_name", contactId0.e());
                                                                sQLiteDatabase0.update("contacts", contentValues6, "id = ? ", new String[]{String.valueOf(v14)});
                                                            }
                                                        }
                                                        if(!cursor8.isClosed()) {
                                                            cursor8.close();
                                                        }
                                                        if(!cursor7.isClosed()) {
                                                            cursor7.close();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        sQLiteDatabase1 = sQLiteDatabase0;
                                        if(!cursor6.isClosed()) {
                                            cursor6.close();
                                            goto label_291;
                                        label_286:
                                            flkx.b(sQLiteDatabase1, "conversations", "local_update_timestamp_ms", "INT NOT NULL DEFAULT 0");
                                            v3 = 26;
                                            goto label_291;
                                        label_289:
                                            sQLiteDatabase1.execSQL("CREATE TABLE IF NOT EXISTS deleted_conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_id_string TEXT,local_delete_timestamp_ms INT NOT NULL DEFAULT 0)");
                                            v3 = 27;
                                        }
                                    label_291:
                                        v2 = v3 + 1;
                                        continue;
                                    }
                                    catch(RuntimeException runtimeException0) {
                                    }
                                    break;
                                }
                            }
                            throw throwable10;
                        }
                    }
                    case 25: {
                        goto label_248;
                    }
                    case 26: {
                        goto label_286;
                    }
                    case 27: {
                        goto label_289;
                    }
                    default: {
                        v3 = v2;
                        goto label_291;
                    }
                }
            label_294:
                flsl flsl1 = flsl.a(flkx0.b);
                fmai fmai1 = fmaj.a();
                fmai1.g(204);
                fmai1.f(381);
                flsl1.b(fmai1.a());
                throw runtimeException0;
            }
        }
        flsl flsl2 = flsl.a(flkx0.b);
        fmai fmai2 = fmaj.a();
        fmai2.g(203);
        fmai2.f(381);
        flsl2.b(fmai2.a());
    }
}

