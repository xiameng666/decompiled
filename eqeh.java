import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

class eqeh {
    public static final baun a;
    protected final epzg b;
    public final Context c;
    public final eqme d;
    public final erql e;
    public final int f;
    protected eqea g;
    protected eqdb h;
    protected boolean i;
    public String j;
    public boolean k;

    static {
        eqeh.a = new erqc(new String[]{"D2D", "eqeh"});
    }

    protected eqeh(epzg epzg0, erql erql0, int v) {
        this.i = false;
        this.k = false;
        this.b = epzg0;
        this.e = erql0;
        this.f = v;
        this.c = epzg0.a;
        this.d = (eqme)epzg0.c;
    }

    public static void e(eqiw eqiw0, Status status0) {
        try {
            eqiw0.b(status0);
        }
        catch(RemoteException remoteException0) {
            eqeh.a.l(remoteException0);
        }
    }

    public static void f(eqiw eqiw0, Status status0) {
        try {
            eqiw0.c(status0);
        }
        catch(RemoteException remoteException0) {
            eqeh.a.l(remoteException0);
        }
    }

    public static void g(eqiw eqiw0, Status status0) {
        try {
            eqiw0.d(status0, null);
        }
        catch(RemoteException remoteException0) {
            eqeh.a.l(remoteException0);
        }
    }

    public static void h(eqiw eqiw0, Status status0, String s) {
        try {
            eqiw0.g(status0, s);
        }
        catch(RemoteException remoteException0) {
            eqeh.a.l(remoteException0);
        }
    }

    public static void i(eqiw eqiw0, Status status0) {
        try {
            eqiw0.h(status0);
        }
        catch(RemoteException remoteException0) {
            eqeh.a.l(remoteException0);
        }
    }
}

