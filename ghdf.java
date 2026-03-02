import java.util.ArrayList;
import java.util.Collection;

public final class ghdf implements ghbk {
    private final ggza a;
    private final ghde b;
    private final ggyq c;
    private final ghbw d;
    private final ggxm e;
    private final ggxn f;
    private final ggxn g;
    private final ggzu h;

    public ghdf(ghde ghde0) {
        this.c = new ggyq();
        this.d = new ghbw();
        this.e = new ggxm();
        this.f = new ggxn();
        this.g = new ggxn();
        this.b = ghde0;
        this.h = ghde0.a();
        this.a = new ggza(ghde0, new ggyz(2));
    }

    private static void a(ggym ggym0, ggym ggym1, Collection collection0) {
        if(ggym0.equals(ggym1)) {
            collection0.add(ggym0);
            return;
        }
        int v = ggym0.c(ggym1);
        gftb.b(v >= 0, "First and last must have a common ancestor.");
        collection0.add(ggym0.E(v));
    }

    private final boolean b(ghdb ghdb0, ggyi ggyi0) {
        ggxm ggxm0 = this.e;
        ggyi0.j(ggxm0);
        ggxl ggxl0 = ggxm0.a;
        double f = ggze.b;
        if(!ggxl0.j()) {
            ggxl0.d(f);
            ggxm0.b.d(f);
        }
        int v = ggyi0.a;
        ghbx ghbx0 = (ghbx)this.b.c().get(ghdb0.e());
        int v1 = ghdb0.d();
        for(int v2 = 0; v2 < v1; ++v2) {
            ghbx0.p(ghdb0.c(v2), this.d);
            if(ggze.c(this.d.a, this.d.b, v, f, this.f, this.g) && ggze.d(this.f, this.g, ggxm0)) {
                return true;
            }
        }
        return false;
    }

    @Override  // ghbk
    public final ggyh f() {
        ggyq ggyq0 = this.c;
        ArrayList arrayList0 = ggyq0.b;
        arrayList0.clear();
        ggzu ggzu0 = this.h;
        ggzu0.b();
        if(ggzu0.g()) {
            ggym ggym0 = ggzs.b(ggzu0);
            ggzu0.c();
            ggym ggym1 = ggzs.b(ggzu0);
            if(!ggym1.equals(ggym0)) {
                int v = ggym1.c(ggym0) + 1;
                ggym ggym2 = ggym0.E(v);
                for(ggym ggym3 = ggym1.E(v); !ggym3.equals(ggym2); ggym3 = ggym3.C()) {
                    ggym ggym4 = ggym3.F();
                    if(!ggym4.W(ggym1)) {
                        ggzu0.d(ggym4.C());
                        ggzu0.g();
                        ghdf.a(ggym1, ggzs.b(ggzu0), arrayList0);
                        ggzu0.h();
                        ggym1 = ggzs.b(ggzu0);
                    }
                }
            }
            ghdf.a(ggym1, ggym0, arrayList0);
        }
        return ggyq0.f();
    }

    @Override  // ghbk
    public final boolean h(ggyi ggyi0) {
        ggzu ggzu0 = this.h;
        if(ggzs.e(ggzu0, ggyi0.d) != 1) {
            return false;
        }
        ghcc ghcc0 = (ghcc)ggzu0.a();
        ghae ghae0 = ggzs.c(ggzu0);
        for(int v = 0; v < ghcc0.a(); ++v) {
            ghdb ghdb0 = ghcc0.b(v);
            if(!ggzs.b(ggzu0).equals(ggyi0.d)) {
                ((ghbx)this.b.c().get(ghdb0.e())).B();
                if(!this.b(ghdb0, ggyi0)) {
                    ghae ghae1 = ggyi0.e();
                    if(this.a.b(ghae0, ghdb0, ghae1)) {
                        return true;
                    }
                }
            }
            else if(ghdb0.d() == 0 && ghdb0.f()) {
                return true;
            }
        }
        return false;
    }

    @Override  // ghbk
    public final boolean m(ggyi ggyi0) {
        ggzu ggzu0 = this.h;
        int v = ggzs.e(ggzu0, ggyi0.d);
        if(v == 3) {
            return false;
        }
        if(v == 2) {
            return true;
        }
        if(ggzs.a(ggzu0, ggyi0.d) == 0) {
            return true;
        }
        ghcc ghcc0 = (ghcc)ggzu0.a();
        ghae ghae0 = ggzs.c(ggzu0);
        int v1 = 0;
        while(v1 < ghcc0.a()) {
            ghdb ghdb0 = ghcc0.b(v1);
            if(!this.b(ghdb0, ggyi0)) {
                ghae ghae1 = ggyi0.e();
                if(!this.a.b(ghae0, ghdb0, ghae1)) {
                    ++v1;
                    continue;
                }
            }
            return true;
        }
        return false;
    }
}

