import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

public class epzn implements eqmj {
    private static final erqc a;
    private final epzx b;
    private final eqih c;

    static {
        epzn.a = new erqc(new String[]{"SourceConnectionCallbacks"});
    }

    public epzn(epzx epzx0, eqih eqih0) {
        this.b = epzx0;
        this.c = eqih0;
    }

    @Override  // eqmj
    public final void a(epyj epyj0, TargetConnectionArgs targetConnectionArgs0) {
        epzx.f.d("Connected to target device.", new Object[0]);
        this.b.i = epyj0;
    }

    @Override  // eqmj
    public final void b(byte[] arr_b) {
        this.b.f(arr_b);
    }

    @Override  // eqmj
    public void c() {
        try {
            this.c.b();
        }
        catch(RemoteException remoteException0) {
            epzn.a.l(remoteException0);
        }
        this.b.c();
    }

    @Override  // eqmj
    public void d(int v, eqoc eqoc0) {
        try {
            this.c.c(v);
        }
        catch(RemoteException remoteException0) {
            epzn.a.l(remoteException0);
        }
    }

    @Override  // eqmj
    public final void e(VerificationInfo verificationInfo0) {
        try {
            this.c.d(verificationInfo0);
        }
        catch(RemoteException remoteException0) {
            epzn.a.l(remoteException0);
        }
    }
}

