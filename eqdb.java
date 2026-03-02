import android.os.RemoteException;

public final class eqdb implements eqda {
    public static final erqc a;
    public final eqit b;

    static {
        eqdb.a = new erqc(new String[]{"TargetBootstrapListenerHolder"});
    }

    public eqdb(eqit eqit0) {
        this.b = eqit0;
    }

    public final void a(int v) {
        try {
            this.b.d(v);
        }
        catch(RemoteException remoteException0) {
            eqdb.a.l(remoteException0);
        }
    }

    public final void b(String s) {
        try {
            this.b.f(s);
        }
        catch(RemoteException remoteException0) {
            eqdb.a.l(remoteException0);
        }
    }
}

