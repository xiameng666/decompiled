import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.appdatasearch.CorpusStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.TWR;

public abstract class abxz extends ccsp {
    public final Context a;
    public final elbu b;
    public final abya c;

    public abxz(Context context0, int v, abya abya0) {
        elcl elcl0 = new elcl(context0, null);
        super(context0, "icing_contacts.db", v);
        this.a = context0;
        this.b = elcl0;
        this.c = abya0;
    }

    public final long a(abyc abyc0) {
        SQLiteDatabase sQLiteDatabase0 = this.c();
        long v = 0L;
        if(sQLiteDatabase0 != null) {
            Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT MAX(seqno) FROM [" + abxy.c(abyc0) + "]", null);
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToNext()) {
                        v = cursor0.getLong(0);
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
                cursor0.close();
                return v;
            }
        }
        return 0L;
    }

    public static final Cursor b(Cursor cursor0, abyc abyc0, SQLiteDatabase sQLiteDatabase0) {
        if(cursor0 == null) {
            return null;
        }
        String s = abxx.a(sQLiteDatabase0, abyc0);
        return s == null ? cursor0 : abxi.a(cursor0, s);
    }

    public final SQLiteDatabase c() {
        try {
            return super.getReadableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            Log.e("AppDataSearchHelper", "Failed to get a readable database", sQLiteException0);
            return null;
        }
    }

    public final SQLiteDatabase d() {
        try {
            return super.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            Log.e("AppDataSearchHelper", "Failed to get a writable database", sQLiteException0);
            return null;
        }
    }

    public static String e(String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        ArrayList arrayList0 = new ArrayList();
        stringBuilder0.append("[");
        stringBuilder0.append(s);
        stringBuilder0.append("].[");
        stringBuilder0.append(s1);
        stringBuilder0.append("]");
        return fpza.a(stringBuilder0, arrayList0).a;
    }

    public static void f(SQLiteDatabase sQLiteDatabase0, abyc abyc0) {
        String s = abxy.c(abyc0);
        abyd.c(sQLiteDatabase0, s);
        sQLiteDatabase0.execSQL("CREATE TABLE [" + s + "] (seqno INTEGER PRIMARY KEY AUTOINCREMENT,action_type INTEGER,uri TEXT,tag TEXT DEFAULT NULL)");
        sQLiteDatabase0.execSQL("INSERT INTO [" + s + "] (action_type,uri) SELECT 0,[" + abyc0.d + "] FROM [" + abyc0.c + "]");
        Integer integer0 = (int)1;
        abxx.c(sQLiteDatabase0, abyc0, true);
        String s1 = abxy.b(abyc0);
        String s2 = abxy.a(abyc0);
        String s3 = abxy.d(abyc0);
        abyd.d(sQLiteDatabase0, s1);
        abyd.d(sQLiteDatabase0, s3);
        abyd.d(sQLiteDatabase0, s2);
        ContentValues contentValues0 = new ContentValues(3);
        contentValues0.put("corpus_name", abyc0.a);
        contentValues0.put("incarnation", String.format("%d-%s", System.currentTimeMillis(), Long.toHexString(new Random().nextLong())));
        contentValues0.put("seqno_table_complete", integer0);
        sQLiteDatabase0.replace("incarnation_appdatasearch", null, contentValues0);
        String s4 = a.a(s, "INSERT INTO [", "]  (action_type,uri) VALUES (%s,%s);");
        StringBuilder stringBuilder0 = new StringBuilder();
        String s5 = String.format(s4, ((int)0), a.a(abyc0.d, "new.[", "]"));
        sQLiteDatabase0.execSQL(a.ak(s5, abyc0.b, stringBuilder0, s1, "CREATE TRIGGER [", "] AFTER INSERT ON [", "] FOR EACH ROW BEGIN ", " END"));
        sQLiteDatabase0.execSQL("CREATE TRIGGER [" + s2 + "] AFTER DELETE ON [" + abyc0.b + "] FOR EACH ROW BEGIN " + String.format(s4, integer0, a.a(abyc0.d, "old.[", "]")) + " END");
        StringBuilder stringBuilder2 = new StringBuilder();
        sQLiteDatabase0.execSQL(a.ak(s5, abyc0.b, stringBuilder2, s3, "CREATE TRIGGER [", "] AFTER UPDATE ON [", "] FOR EACH ROW BEGIN ", " END"));
    }

    protected abstract void g(SQLiteDatabase arg1);

    protected abstract void h(SQLiteDatabase arg1, int arg2, int arg3);

    public final boolean i(abyc abyc0, long v) {
        long v1;
        if(!Arrays.asList(this.c.b).contains(abyc0)) {
            throw new IllegalArgumentException("The table " + abyc0.a + " does not have a registered CorpusTableMapping.");
        }
        String s = abyc0.a;
        evql evql0 = this.b.b("com.google.android.gms", s);
        try {
            evrg.o(evql0, v, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            Log.e("AppDataSearchHelper", "Couldn\'t fetch status for corpus " + abyc0.a);
            return false;
        }
        CorpusStatus corpusStatus0 = (CorpusStatus)evql0.j();
        if(!corpusStatus0.a) {
            Log.e("AppDataSearchHelper", "Couldn\'t find corpus \'" + abyc0.a + "\'");
            return false;
        }
        String s1 = abxx.a(this.c(), abyc0);
        if(corpusStatus0.g != null && !corpusStatus0.g.equals(s1)) {
            azzc azzc0 = new azzc();
            azzc0.a = new elci("com.google.android.gms", s);
            azzc0.d = 8109;
            azzd azzd0 = azzc0.a();
            evql evql1 = ((azts)this.b).iG(azzd0);
            v1 = 0L;
            try {
                evrg.o(evql1, v, TimeUnit.MILLISECONDS);
            }
            catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                Log.w("AppDataSearchHelper", "Couldn\'t clear corpus " + abyc0.a);
            }
        }
        else {
            long v2 = corpusStatus0.c;
            SQLiteDatabase sQLiteDatabase0 = this.d();
            if(sQLiteDatabase0 == null) {
                return false;
            }
            sQLiteDatabase0.beginTransaction();
            try {
                sQLiteDatabase0.delete(abxy.c(abyc0), "seqno < ?", new String[]{String.valueOf(v2)});
                abxx.c(sQLiteDatabase0, abyc0, false);
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            v1 = corpusStatus0.b;
        }
        long v4 = this.a(abyc0);
        if(v4 > v1) {
            evql evql2 = this.b.c("com.google.android.gms", s, v4);
            try {
                return ((Boolean)evrg.o(evql2, v, TimeUnit.MILLISECONDS)).booleanValue();
            }
            catch(TimeoutException | ExecutionException | InterruptedException unused_ex) {
                Log.w("AppDataSearchHelper", "Couldn\'t request indexing for corpus \'" + abyc0.a + "\'");
                return false;
            }
        }
        return true;
    }

    private final void j(SQLiteDatabase sQLiteDatabase0) {
        int v1;
        SQLiteDatabase sQLiteDatabase1;
        abxx.b(sQLiteDatabase0);
        if(abyd.e(sQLiteDatabase0, "version_appdatasearch")) {
            sQLiteDatabase1 = sQLiteDatabase0;
            Cursor cursor0 = sQLiteDatabase1.query("version_appdatasearch", new String[]{"version"}, null, null, null, null, null);
            if(cursor0 == null) {
                Log.w("AppDataSearchHelper", "Empty version table.");
                v1 = 0;
            }
            else {
                try {
                    if(cursor0.moveToNext()) {
                        goto label_17;
                    }
                    else {
                        Log.w("AppDataSearchHelper", "Empty version table.");
                        goto label_14;
                    }
                    goto label_23;
                }
                catch(Throwable throwable0) {
                    goto label_20;
                }
            label_14:
                cursor0.close();
                v1 = 0;
                goto label_23;
                try {
                label_17:
                    v1 = cursor0.getInt(cursor0.getColumnIndex("version"));
                }
                catch(Throwable throwable0) {
                label_20:
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
                cursor0.close();
            }
        }
        else {
            sQLiteDatabase1 = sQLiteDatabase0;
            v1 = 0;
        }
    label_23:
        if(v1 < 6) {
            if(v1 <= 0) {
                for(Object object0: abyd.a(sQLiteDatabase1, new String[]{"_appdatasearch_seqno_table"})) {
                    abyd.c(sQLiteDatabase1, ((String)object0));
                }
                for(Object object1: abyd.b(sQLiteDatabase1, new String[]{"_appdatasearch_insert_trigger", "_appdatasearch_delete_trigger", "_appdatasearch_update_trigger"})) {
                    abyd.d(sQLiteDatabase1, ((String)object1));
                }
            }
            if(v1 == 2) {
                sQLiteDatabase1.execSQL(String.format("ALTER TABLE [%s] ADD COLUMN [%s] INTEGER", "incarnation_appdatasearch", "seqno_table_complete"));
            }
            else if(v1 >= 3) {
                for(Object object2: abxy.e(sQLiteDatabase1)) {
                    abyd.c(sQLiteDatabase1, ((String)object2));
                }
                for(Object object3: abxy.f(sQLiteDatabase1)) {
                    abyd.d(sQLiteDatabase1, ((String)object3));
                }
            }
            ContentValues contentValues0 = new ContentValues(1);
            contentValues0.put("version", Integer.valueOf(6));
            sQLiteDatabase1.update("version_appdatasearch", contentValues0, null, null);
        }
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        abyc[] arr_abyc = this.c.b;
        for(int v2 = 0; v2 < 4; ++v2) {
            abyc abyc0 = arr_abyc[v2];
            hashSet0.add(abxy.c(abyc0));
            hashSet1.addAll(abxy.g(abyc0));
        }
        Set set0 = abxy.e(sQLiteDatabase1);
        for(Object object4: set0) {
            String s = (String)object4;
            if(!hashSet0.contains(s)) {
                abyd.c(sQLiteDatabase1, s);
            }
        }
        Set set1 = abxy.f(sQLiteDatabase1);
        for(Object object5: set1) {
            String s1 = (String)object5;
            if(!hashSet1.contains(s1)) {
                abyd.d(sQLiteDatabase1, s1);
            }
        }
        for(int v = 0; v < 4; ++v) {
            abyc abyc1 = arr_abyc[v];
            if(!set0.contains(abxy.c(abyc1)) || !set1.containsAll(abxy.g(abyc1))) {
                abxz.f(sQLiteDatabase1, abyc1);
            }
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        this.g(sQLiteDatabase0);
        abxx.b(sQLiteDatabase0);
        abyc[] arr_abyc = this.c.b;
        for(int v = 0; v < 4; ++v) {
            abxz.f(sQLiteDatabase0, arr_abyc[v]);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        this.j(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        this.h(sQLiteDatabase0, v, v1);
        this.j(sQLiteDatabase0);
    }
}

