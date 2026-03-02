import android.content.Context;
import com.google.android.gms.common.Feature;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

final class aufp extends augg {
    public final Object a;
    public aufn b;
    public final aufr c;
    private final Context k;
    private final Object l;
    private String m;
    private final auim n;
    private int o;

    public aufp(Context context0, augl augl0, ScheduledExecutorService scheduledExecutorService0, aulm aulm0, auhn auhn0, ausg ausg0, atxp atxp0) {
        super(context0, scheduledExecutorService0, atxp0, "C-Chord", aulm0, ausg0);
        this.l = new Object();
        this.a = new Object();
        this.o = 2;
        this.k = context0;
        aufr aufr0 = new aufr(augl0, atxp0);
        this.c = aufr0;
        aufr0.c = new aufq(aufr0);
        aufr0.b.a(aufr0.c);
        auim auim0 = new auim(context0, ausg0, scheduledExecutorService0, auhn0);
        this.n = auim0;
        avjn.e(context0).g(auim0);
        auim0.h = new aufo(this);
    }

    @Override  // augg
    protected final void a(Set set0, int v) {
        this.d(set0, v);
    }

    @Override  // augg
    protected final void b() {
        auim auim0 = this.n;
        auhm auhm0 = auim0.f;
        if(auhm0 != null) {
            auim0.d.l(auhm0);
        }
        if(this.e() == 3) {
            this.f(1);
            return;
        }
        this.c();
    }

    public final void c() {
        synchronized(this.a) {
            switch(this.e()) {
                case 2: 
                case 3: {
                    break;
                }
                default: {
                    if(this.b != null && this.n.e()) {
                        this.f(2);
                        aufn aufn0 = this.b;
                        batl.s(aufn0);
                        fapi fapi0 = new fapi(this.k, fama.a);
                        evqp evqp0 = new evqp();
                        fapd fapd0 = new fapd(evqp0);
                        fapi0.jm(azyg.a(aufn0, fapi.e(fanx.class.getName(), "_googlecast")), 26407).z(fapd0);
                        this.b = null;
                        String s = this.m;
                        aufl aufl0 = new aufl(this, s);
                        evqp0.a.b(aufl0);
                        aufm aufm0 = new aufm(this, s);
                        evqp0.a.A(aufm0);
                    }
                }
            }
        }
    }

    @Override  // augg
    protected final boolean d(Set set0, int v) {
        Object object0;
        boolean z;
        ausg ausg0 = this.j;
        if(!ausg0.f()) {
            String s = ausg0.b(null);
            if(aurf.u(this.m, s)) {
                z = false;
            }
            else {
                this.m = s;
                z = true;
            }
            if(this.m != null) {
                auim auim0 = this.n;
                if(!auim0.e()) {
                    auim0.f = new auig(auim0);
                    auim0.d.g(auim0.f);
                    return true;
                }
                if(z || this.e() == 2) {
                    batl.s(this.m);
                    object0 = this.a;
                    synchronized(object0) {
                        this.b = new aufn(this, this.m);
                        this.f(3);
                        aufn aufn0 = this.b;
                        batl.s(aufn0);
                        fapi fapi0 = new fapi(this.k, fama.a);
                        azyf azyf0 = fapi0.iD(aufn0, fapi.e(fanx.class.getName(), "_googlecast"));
                        azyq azyq0 = new azyq();
                        azyq0.a = new faox(azyf0);
                        azyq0.b = new faoy(azyf0);
                        azyq0.c = azyf0;
                        azyq0.d = new Feature[]{faly.c};
                        azyq0.e = 26406;
                        evql evql0 = fapi0.iH(azyq0.a());
                        String s1 = this.m;
                        evql0.b(new aufj(this, s1));
                        evql0.A(new aufk(this, s1));
                    }
                }
            }
            return true;
        }
        this.d.c("Not subscribing to Usonia. Currently connected to a metered network.", new Object[0]);
        return true;
    }

    public final int e() {
        synchronized(this.l) {
        }
        return this.o;
    }

    public final void f(int v) {
        synchronized(this.l) {
            this.o = v;
        }
    }
}

