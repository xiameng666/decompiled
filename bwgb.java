import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.TWR;

public final class bwgb {
    public final AtomicBoolean a;
    public final gful_cronetEngineProvider b;
    private static bwgb c;
    private final Object d;
    private bxd e;

    private bwgb(Context context0, boolean z) {
        this.a = new AtomicBoolean(true);
        this.d = new Object();
        this.e = new bxd();
        this.b = z ? gfus.a(((gful_cronetEngineProvider)() -> {
            bwfv bwfv0;
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskWrites();
            try {
                bwfv0 = new bwfv(bbox.c("gservices.db", context0));
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
            return bwfv0;
        })) : new gfur_Suppliers(bwgb.b(context0));
        ContentResolver contentResolver0 = context0.getContentResolver();
        bwga bwga0 = new bwga(this);
        contentResolver0.registerContentObserver(ffto.a, true, bwga0);
    }

    public final bxd a(SQLiteDatabase sQLiteDatabase0) {
        synchronized(this.d) {
            if(this.a.getAndSet(false)) {
                Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT name, value FROM overrides", null);
                TWR.declareResource(cursor0);
                if(cursor0 != null) {
                    TWR.useResource$NT(cursor0);
                    bxd bxd0 = new bxd(cursor0.getCount());
                    while(true) {
                        TWR.useResource$NT(cursor0);
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        TWR.useResource$NT(cursor0);
                        String s = cursor0.getString(0);
                        gftb.check(s);
                        String s1 = cursor0.getString(1);
                        gftb.check(s1);
                        bxd0.put(s, s1);
                    }
                    TWR.useResource$NT(cursor0);
                    this.e = bxd0;
                    goto label_23;
                }
                TWR.useResource$NT(null);
                throw new SQLiteException("null cursor");
            }
        }
    label_23:
        return this.e;
    }

    // Detected as a lambda impl.
    public static bwfv b(Context context0) {
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

    public static bwgb c(Context context0, boolean z) {
        synchronized(bwgb.class) {
            if(bwgb.c == null) {
                bwgb.c = new bwgb(context0, z);
            }
        }
        return bwgb.c;
    }
}

