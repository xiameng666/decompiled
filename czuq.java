import android.content.Context;
import android.net.Network;
import j..util.Objects;

final class czuq extends czvg {
    public gyxo a;
    final czus b;
    private final Context c;
    private final cuqs d;
    private final czkx e;
    private final String f;
    private final Network g;

    public czuq(czus czus0, Context context0, cuqs cuqs0, czkx czkx0, String s, Network network0) {
        Objects.requireNonNull(czus0);
        this.b = czus0;
        super(czus0.a());
        this.a = gyxo.b;
        this.c = context0;
        this.d = cuqs0;
        this.e = czkx0;
        this.f = s;
        this.g = network0;
    }

    @Override  // czvg
    public final czvf a() {
        if(!czlc.b()) {
            gymd gymd0 = czlc.a();
            czke.m(this.b.c, this.f, 6, gylz.c, gymd0);
            this.a = gyxo.ay;
            return czvf.c;
        }
        if(!czlc.c(this.c)) {
            czke.m(this.b.c, this.f, 6, gylz.c, gymd.D);
            this.a = gyxo.ax;
            return czvf.c;
        }
        cuqs cuqs0 = this.d;
        czkx czkx0 = this.e;
        if(!cuqs0.e(this.g, czkx0)) {
            gymd gymd1 = czlc.a();
            czke.m(this.b.c, this.f, 6, gylz.d, gymd1);
            this.a = gyxo.dM;
            czkq.a.b().p("Discovering mDNS services failed.", new Object[0]);
            return czvf.c;
        }
        String s = this.f;
        if(!czkx0.a(s)) {
            if(cuqs0.c(czkx0)) {
                czkx0.b(s);
            }
            this.a = gyxo.dM;
            czkq.a.b().p("Registering discoveryListener failed", new Object[0]);
            return czvf.c;
        }
        czkq.a.b().i("Successfully started mDNS discovery for serviceID %s on %s.", s, this.b.c.name());
        return czvf.b;
    }

    @Override  // czvg
    public final void g() {
        czkx czkx0 = this.e;
        if(!this.d.c(czkx0)) {
            gymd gymd0 = czlc.a();
            czke.m(this.b.c, this.f, 7, gylz.d, gymd0);
            czkq.a.b().p("Stop mDNS discovery services failed.", new Object[0]);
            return;
        }
        czkx0.b(this.f);
    }
}

