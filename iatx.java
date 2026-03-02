import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class iatx extends ianc {
    final iamu a;
    final iaml b;
    final iauo c;
    final iaup d;
    List e;
    iazk f;
    boolean g;
    boolean h;
    iapr i;
    final ibbd j;

    public iatx() {
        throw null;
    }

    public iatx(ibbd ibbd0, iamu iamu0) {
        Objects.requireNonNull(ibbd0);
        this.j = ibbd0;
        super();
        this.e = iamu0.a;
        this.a = iamu0;
        iaml iaml0 = iaml.b("Subchannel", ibbd0.b());
        this.b = iaml0;
        iaup iaup0 = new iaup(iaml0, ibbd0.m.a(), "Subchannel for " + iamu0.a.toString());
        this.d = iaup0;
        this.c = new iauo(iaup0, ibbd0.m);
    }

    @Override  // ianc
    public final void a() {
        this.j.n.d();
        gftb.r(this.g, "not started");
        if(this.h) {
            return;
        }
        this.f.a();
    }

    @Override  // ianc
    public final void b() {
        ibbd ibbd0 = this.j;
        iaps iaps0 = ibbd0.n;
        iaps0.d();
        if(this.f == null) {
            this.h = true;
            return;
        }
        if(this.h) {
            if(ibbd0.E) {
                iapr iapr0 = this.i;
                if(iapr0 != null) {
                    iapr0.a();
                    this.i = null;
                    goto label_15;
                }
            }
            return;
        }
        else {
            this.h = true;
        }
    label_15:
        if(!ibbd0.E) {
            this.i = iaps0.a(new iazs(new ibbb(this)), 5L, TimeUnit.SECONDS, ibbd0.j.c());
            return;
        }
        this.f.h(ibbd.c);
    }

    @Override  // ianc
    public final void c(iane iane0) {
        this.j.n.d();
        gftb.r(((boolean)(this.g ^ 1)), "already started");
        gftb.r(((boolean)(this.h ^ 1)), "already shutdown");
        gftb.r(((boolean)(this.j.E ^ 1)), "Channel is being terminated");
        this.g = true;
        String s = this.j.b();
        ScheduledExecutorService scheduledExecutorService0 = this.j.j.c();
        iazd iazd0 = new iazd(this, iane0);
        iaun iaun0 = this.j.V.a();
        iazk iazk0 = new iazk(this.a, s, this.j.s, this.j.j, scheduledExecutorService0, this.j.n, iazd0, this.j.J, iaun0, this.b, this.c, this.j.r);
        iamd iamd0 = new iamd();
        iamd0.a = "Child Subchannel started";
        iamd0.b = iame.b;
        iamd0.b(this.j.m.a());
        iamd0.c = iazk0;
        iamf iamf0 = iamd0.a();
        this.j.H.b(iamf0);
        this.f = iazk0;
        iamg.a(this.j.J.d, iazk0);
        this.j.x.add(iazk0);
    }

    @Override  // ianc
    public final void d(List list0) {
        this.j.n.d();
        this.e = list0;
        iazk iazk0 = this.f;
        gftb.z(list0, "newAddressGroups");
        iazk.b(list0, "newAddressGroups contains null entry");
        gftb.b(((boolean)(list0.isEmpty() ^ 1)), "newAddressGroups is empty");
        iayv iayv0 = new iayv(iazk0, DesugarCollections.unmodifiableList(new ArrayList(list0)));
        iazk0.g.execute(iayv0);
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

