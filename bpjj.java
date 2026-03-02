import com.google.android.gms.findmydevice.spot.locationreporting.SightedDeviceInteractionIntentOperation;

public final class bpjj implements glzn {
    public final SightedDeviceInteractionIntentOperation a;
    public final gtea b;

    public bpjj(SightedDeviceInteractionIntentOperation sightedDeviceInteractionIntentOperation0, gtea gtea0) {
        this.a = sightedDeviceInteractionIntentOperation0;
        this.b = gtea0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ggfp ggfp0;
        Void void0 = (Void)object0;
        fqhr fqhr0 = (fqhr)this.a.b.a.get();
        fqhr0.getClass();
        fqiv fqiv0 = ((fqix)this.a.b.b).a();
        Object object1 = this.a.b.c.get();
        gmch gmch0 = (gmch)this.a.b.d.get();
        gmch0.getClass();
        fqne fqne0 = ((fqnf)this.a.b.e).a();
        this.b.getClass();
        boik boik0 = new boik(fqhr0, fqiv0, ((fqod)object1), gmch0, fqne0, this.b);
        gged_interceptors gged0 = ggch.j(boik0.c.b).l(new boii()).n();
        fqoh fqoh0 = fqoi.a();
        fqoh0.e(gged0);
        fqoh0.d(boik0.g.d());
        fqoi fqoi0 = fqoh0.a();
        fqgh fqgh0 = fqgi.a();
        fqgh0.b(((int)hsxv.a.y().an()));
        fqgh0.g(true);
        fqgh0.d(((int)hsxv.a.y().am()));
        fqgi fqgi0 = fqgh0.a();
        fqhr fqhr1 = boik0.d;
        gfsx gfsx0 = fqoi0.c;
        gfqx gfqx0 = gfqx.a;
        if(gfsx0.i() && fqhr1.e != null) {
            if(gfsx0.i()) {
                Object object2 = gfsx0.d();
                ggfn ggfn0 = new ggfn();
                if(fqoi0.a.i() || (fqoi0.b.C() || fqoi0.b.u(fqus.a))) {
                    ggfn0.i(fqux.a(((gsyz)object2)));
                }
                ggqj ggqj0 = fqoi0.b.r().om();
                while(ggqj0.hasNext()) {
                    Object object3 = ggqj0.next();
                    ggfn0.i(new fqux(((gsyz)object2), ((fqus)object3)));
                }
                ggfp0 = ggfn0.h();
            }
            else {
                ggfp0 = ggnj.a;
            }
            ggqj ggqj1 = ggfp0.om();
            while(ggqj1.hasNext()) {
                Object object4 = ggqj1.next();
                fqux fqux0 = (fqux)object4;
                gfsx gfsx1 = fqhr1.d(fqux0);
                if(gfsx1.i()) {
                    ggsf.a.r(bbop.a, Integer.valueOf(284));
                    gfsx1.d();
                    fqgh fqgh1 = new fqgh(fqgi0);
                    fqgh1.c(fqux0);
                    fqgi fqgi1 = fqgh1.a();
                    gdsy gdsy0 = fqhr1.c(fqux0, ((String)gfsx1.d()), fqgi1).e(new fqhj(fqux0), fqhr1.d);
                    fqhk fqhk0 = new fqhk(fqhr1, fqoi0, fqgi0, gfqx0);
                    return frap.a(Throwable.class, gdsy0, fqhk0, fqhr1.d).f(new glzt(new boij(boik0)), boik0.b).g();
                }
            }
        }
        return fqhr1.f(fqoi0, fqgi0).f(new glzt(new boij(boik0)), boik0.b).g();
    }
}

