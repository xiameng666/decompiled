import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import java.util.List;
import jeb.synthetic.FIN;

public final class eqcm {
    public static final baun a;
    public eqck b;
    private final epzg c;

    static {
        eqcm.a = new erqc(new String[]{"D2D", "SourceDirectTransferServiceController"});
    }

    public eqcm(epzg epzg0) {
        this.c = epzg0;
    }

    public final void a(eqcl eqcl0) {
        synchronized(this) {
            eqck eqck0 = this.b;
            if(eqck0 == null) {
                eqcm.a.f("Bootstrap cannot be aborted -- no bootstrap in progress.", new Object[0]);
                eqcl0.a(new Status(10565));
                return;
            }
            eqck0.u();
            this.b();
            eqcl0.a(new Status(0));
        }
    }

    public final void b() {
        eqcm.a.j("cleanup()", new Object[0]);
        eqck eqck0 = this.b;
        if(eqck0 != null) {
            eqck0.b();
            this.b = null;
        }
    }

    public final void c(eqik eqik0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        List list0 = eqck.t(this.c.a);
        eqcm.a.j(a.aA(list0, "getBootstrappableAccounts returning ", " account(s)."), new Object[0]);
        Status status0 = new Status(0);
        try {
            eqik0.c(status0, list0);
            FIN.finallyExec$NT(v);
        }
        catch(RemoteException remoteException0) {
            eqcm.a.g("Error calling ISourceDevice.onBootstrappableAccountsResult(callbacks, Status, List<BootstrapAccount>)", remoteException0, new Object[0]);
            FIN.finallyCodeBegin$NT(v);
        }
    }

    public final void d(eqcl eqcl0, BootstrapConfigurations bootstrapConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, epyl epyl0) {
        synchronized(this) {
            erpv erpv0 = new erpv(arr_parcelFileDescriptor[0]);
            erpy erpy0 = new erpy(arr_parcelFileDescriptor[1]);
            epzg epzg0 = this.c;
            ((eqlx)epzg0.c).u(3);
            if(this.b != null) {
                eqcm.a.f("Bootstrap cannot be started -- bootstrap already in progress.", new Object[0]);
                eqcl0.c(new Status(10561));
                return;
            }
            eqck eqck0 = new eqck(epzg0, bootstrapConfigurations0, erpv0, erpy0, epyl0);
            this.b = eqck0;
            eqck0.z();
            eqcl0.c(new Status(0));
        }
    }
}

