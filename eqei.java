import android.os.RemoteException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import java.util.concurrent.ExecutionException;

public final class eqei extends eqeh implements epwt {
    public eqdn l;
    private static final baun m;

    static {
        eqei.m = new erqc(new String[]{"D2D", "eqei"});
    }

    public eqei(epzg epzg0) {
        super(epzg0, eqrn.d(epzg0.a), ModuleManager.get(epzg0.a).getCurrentModule().moduleVersion);
    }

    @Override  // epwt
    public final void a(String s) {
        eqdb eqdb0 = this.h;
        if(eqdb0 != null) {
            try {
                eqdb0.b.e(s);
            }
            catch(RemoteException remoteException0) {
                eqdb.a.l(remoteException0);
            }
        }
    }

    @Override  // epwt
    public final void b(BootstrapCompletionResult bootstrapCompletionResult0) {
        this.b.d.m();
        eqdb eqdb0 = this.h;
        if(eqdb0 != null) {
            try {
                eqdb0.b.a(bootstrapCompletionResult0);
            }
            catch(RemoteException remoteException0) {
                eqdb.a.l(remoteException0);
            }
        }
        if(this.i) {
            eqea eqea0 = this.g;
            if(eqea0 != null) {
                try {
                    evrg.n(eqea0.a());
                }
                catch(ExecutionException | InterruptedException exception0) {
                    eqei.m.l(exception0);
                }
            }
        }
        this.j();
    }

    @Override  // epwt
    public final boolean c(BootstrapProgressResult bootstrapProgressResult0) {
        eqdb eqdb0 = this.h;
        if(eqdb0 != null) {
            try {
                return eqdb0.b.g(bootstrapProgressResult0);
            }
            catch(RemoteException remoteException0) {
                eqdb.a.l(remoteException0);
            }
        }
        return false;
    }

    @Override  // epwt
    public final void d(int v, eqoc eqoc0) {
        this.b.d.o(v, eqoc0);
        eqdb eqdb0 = this.h;
        if(eqdb0 != null) {
            eqdb0.a(v);
        }
        this.j();
    }

    public final void j() {
        eqei.m.j("resetBootstrapController()", new Object[0]);
        eqdn eqdn0 = this.l;
        if(eqdn0 != null) {
            eqdn0.c();
            this.l = null;
        }
    }
}

