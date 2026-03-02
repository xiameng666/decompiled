import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import j..util.Objects;

final class czur extends czvg {
    public gyxo a;
    final czus b;
    private final Context c;
    private final cuqs d;
    private final NsdServiceInfo e;
    private final String f;
    private czla g;
    private final czlb h;

    public czur(czus czus0, Context context0, cuqs cuqs0, NsdServiceInfo nsdServiceInfo0, String s, czlb czlb0) {
        Objects.requireNonNull(czus0);
        this.b = czus0;
        super(czus0.b());
        this.a = gyxo.b;
        this.c = context0;
        this.d = cuqs0;
        this.e = nsdServiceInfo0;
        this.f = s;
        this.h = czlb0;
    }

    @Override  // czvg
    public final czvf a() {
        if(!czlc.b()) {
            gymd gymd0 = czlc.a();
            czke.m(this.b.c, this.f, 2, gylz.c, gymd0);
            this.a = gyxo.ay;
            return czvf.c;
        }
        if(!czlc.c(this.c)) {
            czke.m(this.b.c, this.f, 2, gylz.c, gymd.D);
            this.a = gyxo.ax;
            return czvf.c;
        }
        long v = hvol.h();
        long v1 = hvol.i();
        czla czla0 = new czla(this.d, this.e, this.b.c, v, v1, this.h);
        if(!czla0.b(this.f)) {
            this.a = gyxo.dP;
            czkq.a.b().p("Registering mdnsRegistrationListener failed.", new Object[0]);
            return czvf.d;
        }
        this.g = czla0;
        czkq.a.b().p("Registering mdnsRegistrationListener succeeded.", new Object[0]);
        return czvf.b;
    }

    @Override  // czvg
    public final void g() {
        czla czla0 = this.g;
        if(czla0 == null) {
            czkq.a.b().p("Cannot stop mDNS registration because mdnsRegistrationListener is null.", new Object[0]);
            return;
        }
        czla0.a(this.f);
        this.g = null;
    }
}

