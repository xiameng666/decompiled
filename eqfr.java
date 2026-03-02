import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.RegistrationInfo;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eqfr {
    public static final baun a;
    public eqfo b;
    private final epzg c;

    static {
        eqfr.a = new erqc(new String[]{"D2D", "TargetDirectTransferServiceController"});
    }

    public eqfr(epzg epzg0) {
        this.c = epzg0;
    }

    public final void a(eqfq eqfq0) {
        synchronized(this) {
            eqfo eqfo0 = this.b;
            if(eqfo0 == null) {
                eqfr.a.f("Bootstrap cannot be aborted -- no bootstrap in progress.", new Object[0]);
                eqfq0.a(new Status(10565));
                return;
            }
            eqfo0.s();
            this.b = null;
            eqfq0.a(new Status(0));
        }
    }

    public final void b(eqfq eqfq0, BootstrapOptions bootstrapOptions0, ParcelFileDescriptor[] arr_parcelFileDescriptor, epyl epyl0) {
        synchronized(this) {
            erpv erpv0 = new erpv(arr_parcelFileDescriptor[0]);
            erpy erpy0 = new erpy(arr_parcelFileDescriptor[1]);
            epzg epzg0 = this.c;
            ((eqme)epzg0.c).F(3);
            if(this.b != null) {
                eqfr.a.f("Bootstrap cannot be started -- bootstrap already in progress.", new Object[0]);
                eqfq0.b(new Status(10561));
                return;
            }
            if(hyim.c() > 0L) {
                this.d(new einq(epzg0.a));
            }
            eqfo eqfo0 = new eqfo(epzg0, bootstrapOptions0, erpv0, erpy0, new eqfp(this, epyl0));
            this.b = eqfo0;
            eqfo.h.h("startDirectTransfer.", new Object[0]);
            eqfo0.j.L(16);
            eqfo0.p(new eqhl(false, eqfo0, 9), hyim.a.e().C());
            eqfo0.m.a(eqfo0);
            eqfq0.b(new Status(0));
        }
    }

    static void c(eqfr eqfr0) {
        eqfr0.b = null;
    }

    final void d(einq einq0) {
        long v = SystemClock.elapsedRealtime();
        evql evql0 = einq0.k(new RegistrationInfo[]{new RegistrationInfo("com.google.android.gms.smartdevice", 0xF1B18AD, new String[]{"SMART_SETUP"}, new byte[0], true, new int[0], "com.google.android.gms", RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.auth.blockstore", 0xF1B18AD, new String[]{"BLOCKSTORE"}, new byte[0], true, new int[0], "com.google.android.gms", RegistrationInfo.b)}).g(new eqru(einq0));
        evql0.A(new eqrv(eqfr.a));
        evql0.b(new eqrw(eqfr.a));
        try {
            evrg.o(evql0, hyim.c(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException exception0) {
            int v1 = glwy.a(SystemClock.elapsedRealtime() - v);
            ((eqme)this.c.c).l(false, v1);
            eqfr.a.n("Failed to sync Phenotype flags.", exception0, new Object[0]);
        }
        catch(TimeoutException timeoutException0) {
            int v2 = glwy.a(SystemClock.elapsedRealtime() - v);
            ((eqme)this.c.c).l(false, v2);
            eqfr.a.n("Syncing Phenotype flags times out.", timeoutException0, new Object[0]);
        }
        if(evql0.n()) {
            int v3 = glwy.a(SystemClock.elapsedRealtime() - v);
            ((eqme)this.c.c).l(true, v3);
        }
        evql0.n();
    }
}

