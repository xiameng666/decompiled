import android.content.Context;
import j..util.Optional;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public final class bgtv extends fxpd {
    public static final int a;
    private final Context b;
    private final ibnf c;
    private final Supplier d;
    private final bgtt i;
    private final bbng j;
    private long k;
    private long l;
    private long m;
    private long n;
    private Optional o;

    static {
        bgrz.a("RegSupSt");
    }

    public bgtv(Context context0, ibnf ibnf0, Random random0, Supplier supplier0, bbng bbng0) {
        super("RegSupSt");
        this.o = Optional.empty();
        this.b = context0;
        this.c = ibnf0;
        this.d = supplier0;
        this.j = bbng0;
        this.i = new bgtt(random0, ((int)hsbn.a.e().j()), ((int)hsbn.a.e().m()), hsbn.a.e().r(), hsbn.a.e().q());
    }

    @Override  // fxpd
    public final void a() {
        this.h.l(6, 0L);
        this.h.d(4);
        this.h.i();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        switch(fxpi0.a()) {
            case 1: 
            case 2: 
            case 5: 
            case 10: 
            case 12: 
            case 15: {
                ((fvvp)this.c.get()).g(this.b);
                this.n = this.j.a();
                this.o = Optional.empty();
            }
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        Object object0;
        int v = fxpj0.a;
        if(v != 3 && v != 4) {
            if(v != 6) {
                return false;
            }
            ((fvvp)this.c.get()).f(this.b);
            this.h.l(6, huqg.b());
            return true;
        }
        fxob fxob0 = ((bgsq)this.d).a();
        if(fxob0.a()) {
            fxob0.b.a.getProvider();
            bgtt bgtt0 = this.i;
            ggym ggym0 = ggym.A(ggzv.i(fxob0.b.a.getLatitude(), fxob0.b.a.getLongitude()));
            int v1 = bgtt0.b;
            ggym ggym1 = ggym0.E(v1);
            if(!bgtt0.e.isPresent() || !ggym1.equals(((bgts)bgtt0.e.get()).b)) {
                int v2 = bgtt0.a + 1;
                HashSet hashSet0 = new HashSet(v2);
                hashSet0.add(Long.valueOf(ggym1.c));
                while(hashSet0.size() < v2) {
                    hashSet0.add(Long.valueOf(fhts.m(fhts.h(bgtt0.a(90.0), bgtt0.a(180.0)), v1)));
                }
                ggdy ggdy0 = new ggdy();
                Iterator iterator0 = hashSet0.iterator();
                while(iterator0.hasNext()) {
                    List list0 = bgtt0.d;
                    Object object1 = iterator0.next();
                    long v3 = (long)(((Long)object1));
                    ggdy0.i("ea." + fhts.o(v3));
                    if(!list0.isEmpty()) {
                        for(Object object2: list0) {
                            String s = (String)object2;
                            if(!s.isEmpty()) {
                                ggdy0.i("ea." + s + "." + fhts.o(v3));
                            }
                        }
                    }
                }
                List list1 = bgtt0.c;
                if(list1 != null) {
                    for(Object object3: list1) {
                        ggdy0.i("ea.tst." + ((String)object3));
                    }
                }
                gged_interceptors gged0 = ggdy0.h();
                if(gged0 == null) {
                    throw new NullPointerException("Null regions");
                }
                bgtt0.e = Optional.of(new bgts(gged0, ggym1));
                bgtt0.e.get();
            }
            object0 = bgtt0.e.get();
            if(!this.o.isEmpty() && object0.equals(this.o.get()) && this.j.b() < this.l) {
                this.m = this.j.b();
            }
            else {
                this.o = Optional.of(object0);
                long v4 = this.j.b();
                this.k = v4;
                this.l = v4 + huqg.b() - huqg.c();
                try {
                    fvvp fvvp0 = (fvvp)this.c.get();
                    String s1 = ((bgts)object0).b.K();
                    fvvp0.i(this.b, ((bgts)object0).a, s1);
                }
                catch(fvvr unused_ex) {
                }
                this.h.l(4, hsbn.a.e().n());
                return false;
            }
        }
        this.h.l(4, hsbn.a.e().n());
        return false;
    }

    @Override  // fxpd
    public final void d(PrintWriter printWriter0) {
        String s = (String)this.o.map(new bgtu()).orElse("");
        this.i(printWriter0);
        printWriter0.println("lastReg=[" + s + "]");
        printWriter0.println("lastRegWRt=" + this.k);
        printWriter0.println("lastRegCRt=" + this.m);
        printWriter0.println("delT=" + cnwf.d(this.n));
        this.h(printWriter0);
    }
}

