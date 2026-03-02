import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map.Entry;
import java.util.TreeMap;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class bwfy {
    public DevicePolicyManager a;
    private static final Charset b;
    private static final char[] c;
    private static bwfy d;
    private final Object e;
    private TreeMap f;
    private boolean g;
    private final gful_cronetEngineProvider h;

    static {
        bwfy.b = Charset.forName("UTF-8");
        bwfy.c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    private bwfy(Context context0, boolean z) {
        this.e = new Object();
        this.f = new TreeMap();
        this.g = false;
        if(z) {
            this.h = gfus.a(((gful_cronetEngineProvider)() -> {
                bwfv bwfv0;
                StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskWrites();
                try {
                    bwfv0 = new bwfv(bbox.c("gservices.db", context0));
                }
                finally {
                    StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                }
                return bwfv0;
            }));
            return;
        }
        this.h = new gfur_Suppliers(bwfy.a(context0));
    }

    // Detected as a lambda impl.
    public static bwfv a(Context context0) {
        bwfv bwfv0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskWrites();
        try {
            bwfv0 = new bwfv(bbox.c("gservices.db", context0));
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        return bwfv0;
    }

    public final bwfv b() {
        return (bwfv)this.h.mr();
    }

    public static bwfy c(Context context0, boolean z) {
        synchronized(bwfy.class) {
            if(bwfy.d == null) {
                bwfy.d = new bwfy(context0, z);
            }
            if(!z) {
                bwfy.d.g();
            }
        }
        return bwfy.d;
    }

    public final TreeMap d() {
        synchronized(this.e) {
        }
        return this.f;
    }

    public final void e() {
        synchronized(this.e) {
            this.h();
        }
    }

    public final void f(String[] arr_s, bwfx bwfx0) {
        if(arr_s.length != 0) {
            TreeMap treeMap0 = this.d();
            if(arr_s.length == 1 && arr_s[0].isEmpty()) {
                for(Object object0: treeMap0.entrySet()) {
                    bwfx0.a(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                return;
            }
            for(int v = 0; v < arr_s.length; ++v) {
                String s = null;
                String s1 = arr_s[v];
                int v1 = s1.length();
                while(true) {
                    --v1;
                    if(v1 < 0) {
                        break;
                    }
                    int v2 = s1.charAt(v1);
                    if(v2 < 0xFFFF) {
                        s = s1.substring(0, v1) + ((char)(v2 + 1));
                        break;
                    }
                }
                for(Object object1: (s == null ? treeMap0.tailMap(s1) : treeMap0.subMap(s1, s)).entrySet()) {
                    bwfx0.a(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
                }
            }
        }
    }

    public final void g() {
        synchronized(this.e) {
            if(!this.g) {
                StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskWrites();
                try {
                    this.h();
                }
                catch(SQLiteException sQLiteException0) {
                    Log.w("GservicesPersistence", "Failed to query Gservices database", sQLiteException0);
                }
                finally {
                    StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                }
            }
        }
    }

    private final void h() {
        MessageDigest messageDigest0;
        try {
            messageDigest0 = MessageDigest.getInstance("SHA-1");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
        bwfv bwfv0 = this.b();
        SQLiteDatabase sQLiteDatabase0 = bwfv0.getWritableDatabase();
        sQLiteDatabase0.beginTransaction();
        int v = FIN.finallyOpen$NT();
        TreeMap treeMap0 = new TreeMap();
        Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT name, value FROM main ORDER BY name", null);
        if(cursor0 != null) {
            String s = null;
            try {
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(0);
                    gftb.check(s1);
                    String s2 = cursor0.getString(1);
                    gftb.check(s2);
                    if(s1.equals("digest")) {
                        s = s2;
                    }
                    else {
                        messageDigest0.update(s1.getBytes(bwfy.b));
                        messageDigest0.update(0);
                        messageDigest0.update(s2.getBytes(bwfy.b));
                        messageDigest0.update(0);
                    }
                    treeMap0.put(s1, s2);
                }
            }
            catch(Throwable throwable0) {
                goto label_72;
            }
            cursor0.close();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("1-");
            byte[] arr_b = messageDigest0.digest();
            for(int v1 = 0; v1 < arr_b.length; ++v1) {
                int v2 = arr_b[v1];
                stringBuilder0.append(bwfy.c[v2 >> 4 & 15]);
                stringBuilder0.append(bwfy.c[v2 & 15]);
            }
            String s3 = stringBuilder0.toString();
            if(!s3.equals(s)) {
                treeMap0.put("digest", s3);
                SQLiteStatement sQLiteStatement0 = sQLiteDatabase0.compileStatement("INSERT OR REPLACE INTO main (name, value) VALUES (?, ?)");
                TWR.declareResource(sQLiteStatement0);
                TWR.useResource$NT(sQLiteStatement0);
                sQLiteStatement0.bindString(1, "digest");
                sQLiteStatement0.bindString(2, s3);
                sQLiteStatement0.execute();
            }
            if(bwfv0.a) {
                Cursor cursor1 = sQLiteDatabase0.rawQuery("SELECT name, value FROM overrides", null);
                TWR.declareResource(cursor1);
                if(cursor1 != null) {
                    while(true) {
                        TWR.useResource$NT(cursor1);
                        if(!cursor1.moveToNext()) {
                            goto label_61;
                        }
                        TWR.useResource$NT(cursor1);
                        String s4 = cursor1.getString(0);
                        gftb.check(s4);
                        String s5 = cursor1.getString(1);
                        gftb.check(s5);
                        treeMap0.put(s4, s5);
                    }
                }
                TWR.useResource$NT(null);
                throw new SQLiteException("null cursor");
            }
        label_61:
            __monitor_enter(this.e);
            this.f = treeMap0;
            this.g = true;
            __monitor_exit(this.e);
            sQLiteDatabase0.setTransactionSuccessful();
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        try {
            throw new SQLiteException("null cursor");
        }
        catch(Throwable throwable0) {
        label_72:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    }
}

