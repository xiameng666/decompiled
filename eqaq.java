import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

public final class eqaq extends eqao implements epwt {
    public epzx k;
    private static final baun l;

    static {
        eqaq.l = new erqc(new String[]{"D2D", "eqaq"});
    }

    public eqaq(epzg epzg0) {
        super(epzg0, new eqam(eqrn.a(epzg0.a, "smartdevice"), epzg0.a, epzg0.b), eqrn.d(epzg0.a), eqgn.b(epzg0.a));
    }

    @Override  // epwt
    public final void a(String s) {
        eqie eqie0 = this.g;
        if(eqie0 != null) {
            try {
                eqie0.b(s);
            }
            catch(RemoteException remoteException0) {
                eqaq.l.l(remoteException0);
            }
        }
    }

    @Override  // epwt
    public final void b(BootstrapCompletionResult bootstrapCompletionResult0) {
        eqie eqie0 = this.g;
        if(eqie0 != null) {
            try {
                eqie0.a();
            }
            catch(RemoteException remoteException0) {
                eqaq.l.l(remoteException0);
            }
        }
        this.b.d.m();
    }

    @Override  // epwt
    public final boolean c(BootstrapProgressResult bootstrapProgressResult0) {
        eqie eqie0 = this.g;
        if(eqie0 != null) {
            try {
                eqie0.c(bootstrapProgressResult0);
                return false;
            }
            catch(RemoteException remoteException0) {
                eqaq.l.l(remoteException0);
            }
        }
        return false;
    }

    @Override  // epwt
    public final void d(int v, eqoc eqoc0) {
        this.b.d.o(v, eqoc0);
    }

    @Override  // eqao
    protected final eqmj e(eqih eqih0) {
        this.k = new epzx(this.b, this, eqih0);
        return new eqap(this, this.k, eqih0);
    }

    @Override  // eqao
    protected final void p() {
        eqaq.l.j("resetBootstrapController()", new Object[0]);
        epzx epzx0 = this.k;
        if(epzx0 != null) {
            epzx0.c();
            this.k = null;
        }
    }

    @Override  // eqao
    protected final boolean s() {
        return this.k != null;
    }
}

