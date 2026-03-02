import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

public final class eqff {
    public final eqme a;
    public final eqeh b;
    private static final baun c;
    private final Handler d;
    private final eqfr e;

    static {
        eqff.c = new erqc(new String[]{"D2D", "TargetDeviceServiceImpl"});
    }

    public eqff(epzg epzg0) {
        this.a = (eqme)epzg0.c;
        this.d = epzg0.b;
        this.b = new eqei(epzg0);
        this.e = new eqfr(epzg0);
        eqfe eqfe0 = new eqfe(this, epzg0);
        epzg0.b.post(eqfe0);
    }

    public final void a(eqfq eqfq0) {
        this.a.E(3);
        eqmb.a(this.a, 16);
        this.e.a(eqfq0);
    }

    public final void b() {
        eqff.c.j("Destroying target device API service.", new Object[0]);
        eqeh.a.j("cleanup()", new Object[0]);
        eqeh eqeh0 = this.b;
        eqea eqea0 = eqeh0.g;
        if(eqea0 != null && eqeh0.i) {
            eqea0.a();
        }
        ((eqei)eqeh0).j();
        if(!hyig.d()) {
            eqeh0.e.c(true, false);
        }
        eqfr eqfr0 = this.e;
        eqfr.a.j("cleanup()", new Object[0]);
        eqfo eqfo0 = eqfr0.b;
        if(eqfo0 != null) {
            eqfo0.s();
            eqfr0.b.b();
        }
        eqfr0.b = null;
    }

    public final void c(eqfq eqfq0, BootstrapOptions bootstrapOptions0, ParcelFileDescriptor[] arr_parcelFileDescriptor, epyl epyl0) {
        this.a.E(3);
        eqmb.a(this.a, 15);
        this.e.b(eqfq0, bootstrapOptions0, arr_parcelFileDescriptor, epyl0);
    }
}

