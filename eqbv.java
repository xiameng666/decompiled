import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

public final class eqbv {
    public static final baun a;
    public final eqlx b;
    public final Handler c;
    public final eqao d;
    public final eqcm e;
    private final Context f;

    static {
        eqbv.a = new erqc(new String[]{"D2D", "SourceDeviceServiceImpl"});
    }

    public eqbv(epzg epzg0) {
        this.b = (eqlx)epzg0.c;
        this.c = epzg0.b;
        this.f = epzg0.a;
        eqrl.a(epzg0.a);
        this.d = new eqaq(epzg0);
        this.e = new eqcm(epzg0);
        eqbu eqbu0 = new eqbu(this);
        epzg0.b.post(eqbu0);
    }

    public final void a(eqcl eqcl0) {
        eqbv.a.h("Abort DirectTransfer.", new Object[0]);
        batl.e(this.c);
        this.b.t(3);
        eqlz.a(this.b, 16);
        this.e.a(eqcl0);
    }

    public final void b(eqcl eqcl0, Bundle bundle0) {
        eqbv.a.h("isTransferInProgress.", new Object[0]);
        batl.e(this.c);
        this.b.t(3);
        Status status0 = new Status(10565);
        long v = bundle0.getLong("sessionId");
        if(hygx.j()) {
            long v1 = eqck.i;
            if(Long.compare(v, -1L) == 0) {
                if(v1 != -1L) {
                    status0 = Status.b;
                }
            }
            else if(v != v1) {
                status0 = new Status(10581);
            }
            else {
                status0 = Status.b;
            }
            eqcl0.b(status0);
            return;
        }
        eqck eqck0 = this.e.b;
        if(eqck0 != null) {
            eqcm.a.h("SessionId given: " + v + ", sessionId found: " + eqck0.s(), new Object[0]);
            status0 = Status.b;
            if(Long.compare(v, -1L) != 0 && v != eqck0.s()) {
                status0 = new Status(10581);
            }
        }
        eqcl0.b(status0);
    }

    public final void c() {
        batl.e(this.c);
        eqbv.a.j("Destroying source device API service.", new Object[0]);
        eqrl.b(this.f);
        this.d.f();
        this.e.b();
    }

    public final void d(eqcl eqcl0, BootstrapConfigurations bootstrapConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, epyl epyl0) {
        batl.e(this.c);
        eqbv.a.h("Start DirectTransfer.", new Object[0]);
        this.b.t(3);
        eqlz.a(this.b, 15);
        this.e.d(eqcl0, bootstrapConfigurations0, arr_parcelFileDescriptor, epyl0);
    }
}

