import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

abstract class eqao {
    public static final baun a;
    protected final epzg b;
    public final eqlx c;
    public final erql d;
    public final eqgn e;
    public final eqaa f;
    protected eqie g;
    protected eqih h;
    public eqcr i;
    public D2DDevice j;

    static {
        eqao.a = new erqc(new String[]{"D2D", "eqao"});
    }

    protected eqao(epzg epzg0, eqaa eqaa0, erql erql0, eqgn eqgn0) {
        this.b = epzg0;
        this.c = (eqlx)epzg0.c;
        this.d = erql0;
        this.f = eqaa0;
        this.e = eqgn0;
    }

    protected abstract eqmj e(eqih arg1);

    public final void f() {
        eqao.a.j("cleanup()", new Object[0]);
        eqaa eqaa0 = this.f;
        if(((eqam)eqaa0).i != null) {
            eqaa0.b();
        }
        this.r();
        eqaa0.c();
    }

    public static void g(eqik eqik0, Status status0) {
        try {
            eqik0.b(status0);
        }
        catch(RemoteException remoteException0) {
            eqao.a.l(remoteException0);
        }
    }

    public static void h(eqik eqik0, Status status0) {
        try {
            eqik0.d(status0);
        }
        catch(RemoteException remoteException0) {
            eqao.a.l(remoteException0);
        }
    }

    public static void i(eqik eqik0, Status status0) {
        try {
            eqik0.e(status0);
        }
        catch(RemoteException remoteException0) {
            eqao.a.l(remoteException0);
        }
    }

    public static void j(eqik eqik0, Status status0) {
        try {
            eqik0.f(status0);
        }
        catch(RemoteException remoteException0) {
            eqao.a.l(remoteException0);
        }
    }

    public static void k(eqik eqik0, Status status0) {
        try {
            eqik0.h(status0);
        }
        catch(RemoteException remoteException0) {
            eqao.a.l(remoteException0);
        }
    }

    public static void l(eqik eqik0, Status status0) {
        try {
            eqik0.j(status0);
        }
        catch(RemoteException remoteException0) {
            eqao.a.l(remoteException0);
        }
    }

    public static void m(eqik eqik0, Status status0) {
        try {
            eqik0.k(status0);
        }
        catch(RemoteException remoteException0) {
            eqao.a.l(remoteException0);
        }
    }

    public static void n(eqik eqik0, Status status0) {
        try {
            eqik0.l(status0);
        }
        catch(RemoteException remoteException0) {
            eqao.a.l(remoteException0);
        }
    }

    public final void o() {
        eqao.a.j("resetBluetoothController()", new Object[0]);
        this.d.c(false, false);
    }

    protected abstract void p();

    public final void q() {
        this.i = null;
    }

    protected final void r() {
        eqao.a.j("resetState()", new Object[0]);
        this.g = null;
        this.q();
        eqao.a.j("resetTargetDevice()", new Object[0]);
        this.j = null;
        this.o();
        this.p();
    }

    protected abstract boolean s();
}

