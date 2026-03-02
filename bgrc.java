import android.location.Location;
import j..util.function.Predicate.-CC;
import java.util.ArrayList;
import java.util.function.Predicate;

public final class bgrc implements Predicate {
    public final Location a;

    public bgrc(Location location0) {
        this.a = location0;
    }

    @Override
    public final Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public final Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public final Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        bgrc bgrc0;
        int v7;
        hfuo hfuo0 = ((hgub)object0).b;
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo0) {
            arrayList0.add(ggzv.i(((hjij)object1).b, ((hjij)object1).c).k());
        }
        ghab ghab0 = new ghab(arrayList0);
        ghab0.z();
        ggzg ggzg0 = new ggzg();
        boolean z = false;
        if(ghab0.e.r() && ghab0.f.r()) {
            for(int v = 0; true; ++v) {
                int v1 = ghab0.d;
                if(v >= v1) {
                    break;
                }
                if(!ggxv.g(ghab0.k(v))) {
                    ggzg0.a(ggzf.k, "Vertex %d is not unit length.", new Object[]{v});
                    bgrc0 = this;
                    gftb.f(z, "Contour is invalid: %s", arrayList0);
                    return ghab0.s(ggzv.i(bgrc0.a.getLatitude(), bgrc0.a.getLongitude()).k());
                }
            }
            if(v1 >= 3) {
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(ghab0.k(v2).t(ghab0.k(v2 + 1))) {
                        ggzg0.a(ggzf.l, "Edge %d is degenerate (duplicate vertex).", new Object[]{v2});
                        bgrc0 = this;
                        gftb.f(z, "Contour is invalid: %s", arrayList0);
                        return ghab0.s(ggzv.i(bgrc0.a.getLatitude(), bgrc0.a.getLongitude()).k());
                    }
                }
            label_31:
                ghde ghde0 = ghab0.c;
                gftb.checkTrue(ghde0.c.size() == 1);
                ggzu ggzu0 = ghde0.a();
                while(!ggzu0.f()) {
                    ghdb ghdb0 = ((ghcc)ggzu0.a()).b(0);
                    int v3 = ghdb0.d();
                    int v4 = 0;
                    while(v4 < v3 - 1) {
                        int v5 = ghdb0.c(v4);
                        int v6 = v5 + 1;
                        if(ghdb0.c(v4 + 1) == v6) {
                            if(v4 + 2 < v3) {
                                v7 = v4 + 2;
                                goto label_46;
                            }
                            else {
                                goto label_63;
                            }
                            goto label_45;
                        }
                        else {
                        label_45:
                            v7 = v4 + 1;
                        }
                    label_46:
                        ggzc ggzc0 = new ggzc(ghab0.k(v5), ghab0.k(v6));
                        int v8 = -2;
                        while(v7 < v3) {
                            int v9 = ghdb0.c(v7);
                            if(v9 - v5 == v1 - 1) {
                                break;
                            }
                            if(v9 != v8 + 1) {
                                ggzc0.c(ghab0.k(v9));
                            }
                            int v10 = ggzc0.a(ghab0.k(v9 + 1));
                            if(v10 < 0) {
                                ++v7;
                                v8 = v9;
                                continue;
                            }
                            if(v10 == 0) {
                                ggzg0.a(ggzf.l, "Edge %d has duplicate vertex with edge %d", new Object[]{v5, v9});
                            }
                            else {
                                ggzg0.a(ggzf.q, "Edge %d crosses edge %d", new Object[]{v5, v9});
                            }
                            bgrc0 = this;
                            gftb.f(z, "Contour is invalid: %s", arrayList0);
                            return ghab0.s(ggzv.i(bgrc0.a.getLatitude(), bgrc0.a.getLongitude()).k());
                        }
                    label_63:
                        ++v4;
                    }
                    ggzu0.h();
                }
                bgrc0 = this;
                z = true;
                gftb.f(z, "Contour is invalid: %s", arrayList0);
                return ghab0.s(ggzv.i(bgrc0.a.getLatitude(), bgrc0.a.getLongitude()).k());
            }
            else if(!ghab0.w()) {
                ggzg0.a(ggzf.p, "Non-empty, non-full loops must have at least 3 vertices", new Object[0]);
            }
            else {
                goto label_31;
            }
        }
        else {
            ggzg0.a(ggzf.k, "Invalid loop bound, possibly due to vertices that are not unit length.", new Object[0]);
        }
        bgrc0 = this;
        gftb.f(z, "Contour is invalid: %s", arrayList0);
        return ghab0.s(ggzv.i(bgrc0.a.getLatitude(), bgrc0.a.getLongitude()).k());
    }
}

