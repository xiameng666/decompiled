import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

final class et extends aaw {
    final fm a;

    public et(fm fm0) {
        this.a = fm0;
        super(false);
    }

    @Override  // aaw
    public final void a() {
        if(fm.ar(3)) {
            Objects.toString(this.a);
        }
        fm fm0 = this.a;
        if(fm.ar(3)) {
            Objects.toString(fm0.f);
        }
        ca ca0 = fm0.f;
        if(ca0 != null) {
            ca0.b = false;
            ca0.e();
            fm0.f.A(true, new en(fm0));
            fm0.f.a();
            fm0.g = true;
            fm0.aq();
            fm0.g = false;
            fm0.f = null;
        }
    }

    @Override  // aaw
    public final void b() {
        if(fm.ar(3)) {
            Objects.toString(this.a);
        }
        fm fm0 = this.a;
        fm0.g = true;
        fm0.ap(true);
        fm0.g = false;
        if(fm0.f != null) {
            if(!fm0.m.isEmpty()) {
                LinkedHashSet linkedHashSet0 = new LinkedHashSet(fm.aB(fm0.f));
                ArrayList arrayList0 = fm0.m;
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    fg fg0 = (fg)arrayList0.get(v2);
                    for(Object object0: linkedHashSet0) {
                        fg0.b(((du)object0), true);
                    }
                }
            }
            ArrayList arrayList1 = fm0.f.e;
            int v3 = arrayList1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                du du0 = ((fy)arrayList1.get(v4)).b;
                if(du0 != null) {
                    du0.s = false;
                }
            }
            for(Object object1: fm0.p(new ArrayList(Collections.singletonList(fm0.f)), 0, 1)) {
                fm.ar(3);
                ((gx)object1).j(((gx)object1).c);
                ((gx)object1).e(((gx)object1).c);
            }
            ArrayList arrayList2 = fm0.f.e;
            int v5 = arrayList2.size();
            for(int v = 0; v < v5; ++v) {
                du du1 = ((fy)arrayList2.get(v)).b;
                if(du1 != null && du1.O == null) {
                    fm0.n(du1).e();
                }
            }
            fm0.f = null;
            fm0.ak();
            if(fm.ar(3)) {
                Objects.toString(fm0);
            }
            return;
        }
        if(fm0.h.b) {
            fm.ar(3);
            fm0.av();
            return;
        }
        fm.ar(3);
        fm0.e.d();
    }

    @Override  // aaw
    public final void c(zu zu0) {
        if(fm.ar(2)) {
            Objects.toString(this.a);
        }
        fm fm0 = this.a;
        ca ca0 = fm0.f;
        if(ca0 != null) {
            for(Object object0: fm0.p(new ArrayList(Collections.singletonList(ca0)), 0, 1)) {
                gx gx0 = (gx)object0;
                boolean z = !fm.ar(2);
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: gx0.c) {
                    ibpo.D(arrayList0, ((gw)object1).i);
                }
                List list0 = ibpo.ar(ibpo.ay(arrayList0));
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((gr)list0.get(v2)).c(zu0, gx0.a);
                }
            }
            ArrayList arrayList1 = fm0.m;
            int v3 = arrayList1.size();
            for(int v = 0; v < v3; ++v) {
                ((fg)arrayList1.get(v)).e();
            }
        }
    }

    @Override  // aaw
    public final void d(zu zu0) {
        if(fm.ar(3)) {
            Objects.toString(this.a);
        }
        this.a.N();
        fj fj0 = new fj(this.a);
        this.a.O(fj0, false);
    }
}

