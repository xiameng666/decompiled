import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

public final class eior {
    public static final String[] a;
    public static final String[] b;
    public final SQLiteDatabase c;
    public final eipl d;
    public final eipm e;
    private static final Method f;
    private static final Method g;

    static {
        Method method1;
        Method method0 = null;
        try {
            method1 = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            method1.setAccessible(true);
        }
        catch(Throwable throwable0) {
            a.ae(eiox.a.i(), "Unable to reflect getThreadSession", throwable0);
            method1 = null;
        }
        eior.f = method1;
        if(method1 != null) {
            try {
                method0 = method1.getReturnType().getDeclaredMethod("beginTransaction", Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class);
            }
            catch(Throwable throwable1) {
                a.ae(eiox.a.i(), "Unable to reflect beginTransaction", throwable1);
            }
        }
        eior.g = method0;
        eior.a = new String[0];
        eior.b = new String[0];
    }

    public eior(SQLiteDatabase sQLiteDatabase0, eipl eipl0, eipm eipm0) {
        this.c = sQLiteDatabase0;
        this.d = eipl0;
        this.e = eipm0;
    }

    public final eiog a() {
        eior.d(this.c);
        return new eioh(this, false, false);
    }

    public final eiop b() {
        this.c.beginTransaction();
        return new eioq(this, false, false);
    }

    @Deprecated
    public final eiop c() {
        this.c.beginTransaction();
        return new eioq(this, true, true);
    }

    public static void d(SQLiteDatabase sQLiteDatabase0) {
        if(Build.VERSION.SDK_INT >= 35) {
            sQLiteDatabase0.beginTransactionReadOnly();
            return;
        }
        Method method0 = eior.f;
        if(method0 != null) {
            Method method1 = eior.g;
            if(method1 != null) {
                try {
                    Object object0 = method0.invoke(sQLiteDatabase0, null);
                    gftb.check(object0);
                    Integer integer0 = (int)0;
                    method1.invoke(object0, integer0, 0, integer0, 0);
                }
                catch(Exception exception0) {
                    a.ae(eiox.a.i(), "Unable to use reflective deferred transaction", exception0);
                    sQLiteDatabase0.beginTransaction();
                }
                return;
            }
        }
        sQLiteDatabase0.beginTransaction();
    }
}

