import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public class acoq implements evpz {
    protected final Context b;
    protected final hobg c;
    protected final boolean d;
    protected final Bundle e;
    protected final bcqh f;
    protected final bcqx g;
    final acor h;
    protected final int i;

    public acoq(acor acor0, Context context0, bcqx bcqx0, hobg hobg0, boolean z, int v, Bundle bundle0, bcqh bcqh0) {
        Objects.requireNonNull(acor0);
        this.h = acor0;
        super();
        this.b = context0;
        this.g = bcqx0;
        this.c = hobg0;
        this.d = z;
        this.i = v;
        this.e = bundle0;
        this.f = bcqh0;
    }

    protected void b() {
        bbvl.h();
        bbvl.f(this.b, this.h.f, this.c, this.d, this.i, this.e, this.h.i, this.f);
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        if(evql0.n()) {
            this.g.o(this.h.f, gmfz.ba, gmgd.d);
        }
        else {
            acor acor0 = this.h;
            String s = evql0.i().getMessage();
            this.g.j(acor0.f, gmfz.ba, gmfx.aU, s);
            if(!hrcv.f()) {
                try {
                    acor0.j(new Status(34503));
                }
                catch(RemoteException remoteException0) {
                    acor.a.n("Remote exception:", remoteException0, new Object[0]);
                }
                return;
            }
        }
        if(hrcv.e()) {
            bcpv.a(this.b);
            if(!bcpv.b(this.b)) {
                this.g.f(this.h.f, gmfz.ba, gmfx.aY);
                try {
                    Status status0 = new Status(34505);
                    this.h.j(status0);
                }
                catch(RemoteException remoteException1) {
                    acor.a.n("Remote exception:", remoteException1, new Object[0]);
                }
                return;
            }
        }
        this.b();
    }
}

