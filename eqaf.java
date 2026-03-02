import com.google.android.gms.smartdevice.d2d.D2DDevice;
import j..util.Objects;

final class eqaf extends cuwp {
    final eqam a;

    public eqaf(eqam eqam0) {
        Objects.requireNonNull(eqam0);
        this.a = eqam0;
        super();
    }

    @Override  // cuwp
    public final void b(String s, cuwf cuwf0) {
        eqam.b.d("[EndpointDiscoveryCallback] Found endpoint: %s", new Object[]{s});
        eqmz eqmz0 = eqmy.a(cuwf0.b);
        eqmw eqmw0 = eqmz0.a();
        int v = eqam.m(eqmw0.c());
        this.a.i(eqmz0);
        Object[] arr_object = {eqmw0.d()};
        eqam.b.j("Verification style: %s", arr_object);
        D2DDevice d2DDevice0 = new D2DDevice(eqmz0.c(), s, ((byte)v), eqmw0.d().h);
        this.a.n.put(s, d2DDevice0);
        gftb.z(this.a.h, "ScanController is null.");
        this.a.h.a(d2DDevice0);
    }

    @Override  // cuwp
    public final void c(String s) {
        eqam.b.d("Nearby scan lost endpoint: %s", new Object[]{s});
        eqcr eqcr0 = this.a.h;
        D2DDevice d2DDevice0 = (D2DDevice)this.a.n.remove(s);
        if(eqcr0 != null && d2DDevice0 != null) {
            eqcr0.b(d2DDevice0);
        }
    }
}

