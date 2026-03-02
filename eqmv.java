import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;

public final class eqmv implements eqmj {
    public final eqdb a;
    private final eqfv b;
    private final eqdn c;

    public eqmv(eqfv eqfv0, eqdb eqdb0, eqdn eqdn0) {
        this.b = eqfv0;
        this.a = eqdb0;
        this.c = eqdn0;
    }

    @Override  // eqmj
    public final void a(epyj epyj0, TargetConnectionArgs targetConnectionArgs0) {
        try {
            this.a.b.b(targetConnectionArgs0);
        }
        catch(RemoteException remoteException0) {
            eqdb.a.l(remoteException0);
        }
        this.c.i = epyj0;
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.w(this.c.h);
        this.c.n(messagePayload0);
    }

    @Override  // eqmj
    public final void b(byte[] arr_b) {
        this.c.f(arr_b);
    }

    @Override  // eqmj
    public final void c() {
        try {
            this.a.b.c();
        }
        catch(RemoteException remoteException0) {
            eqdb.a.l(remoteException0);
        }
    }

    @Override  // eqmj
    public final void d(int v, eqoc eqoc0) {
        this.b.o(v, eqoc0);
        this.a.a(v);
    }

    @Override  // eqmj
    public final void e(VerificationInfo verificationInfo0) {
        this.a.b(verificationInfo0.a);
    }
}

