import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

final class cx extends gr {
    public final List a;
    public final gw b;
    public final gw c;
    public final gi d;
    public final bxd e;
    public final boolean f;
    public Object g;
    public boolean h;
    private final Object k;
    private final ArrayList l;
    private final ArrayList m;
    private final bxd n;
    private final ArrayList o;
    private final ArrayList p;
    private final bxd q;
    private final jyv r;

    public cx(List list0, gw gw0, gw gw1, gi gi0, Object object0, ArrayList arrayList0, ArrayList arrayList1, bxd bxd0, ArrayList arrayList2, ArrayList arrayList3, bxd bxd1, bxd bxd2, boolean z) {
        this.a = list0;
        this.b = gw0;
        this.c = gw1;
        this.d = gi0;
        this.k = object0;
        this.l = arrayList0;
        this.m = arrayList1;
        this.n = bxd0;
        this.o = arrayList2;
        this.p = arrayList3;
        this.q = bxd1;
        this.e = bxd2;
        this.f = z;
        this.r = new jyv();
    }

    @Override  // gr
    public final void a(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        this.r.a();
    }

    @Override  // gr
    public final void b(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        if(viewGroup0.isLaidOut() && !this.h) {
            Object object0 = this.g;
            if(object0 == null) {
                gw gw0 = this.c;
                gw gw1 = this.b;
                ibns ibns0 = this.g(viewGroup0, gw0, gw1);
                Object object1 = ibns0.b;
                ArrayList arrayList0 = (ArrayList)ibns0.a;
                ArrayList arrayList1 = new ArrayList(ibpo.q(this.a, 10));
                for(Object object2: this.a) {
                    arrayList1.add(((cy)object2).a);
                }
                for(Object object3: arrayList1) {
                    cr cr0 = new cr(((gw)object3), this);
                    this.d.r(object1, this.r, cr0);
                }
                this.i(arrayList0, viewGroup0, new cs(this, viewGroup0, object1));
                if(fm.ar(2)) {
                    Objects.toString(gw1);
                    Objects.toString(gw0);
                }
            }
            else {
                this.d.t(object0);
                if(fm.ar(2)) {
                    Objects.toString(this.b);
                    Objects.toString(this.c);
                    return;
                }
            }
            return;
        }
        for(Object object4: this.a) {
            gw gw2 = ((cy)object4).a;
            if(fm.ar(2)) {
                if(!this.h) {
                    Objects.toString(viewGroup0);
                }
                Objects.toString(gw2);
            }
            gw2.f(this);
        }
        this.h = false;
    }

    @Override  // gr
    public final void c(zu zu0, ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        Object object0 = this.g;
        if(object0 != null) {
            this.d.w(object0, zu0.b);
        }
    }

    @Override  // gr
    public final void d(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        if(!viewGroup0.isLaidOut()) {
            for(Object object0: this.a) {
                gw gw0 = ((cy)object0).a;
                if(fm.ar(2)) {
                    Objects.toString(viewGroup0);
                    Objects.toString(gw0);
                }
            }
            return;
        }
        if(this.f()) {
            Object object1 = this.k;
            if(object1 != null && !this.e()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + object1 + " between " + this.b + " and " + this.c + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
        }
        if(this.e() && this.f()) {
            ibvd ibvd0 = new ibvd();
            ibns ibns0 = this.g(viewGroup0, this.c, this.b);
            Object object2 = ibns0.b;
            ArrayList arrayList0 = (ArrayList)ibns0.a;
            ArrayList arrayList1 = new ArrayList(ibpo.q(this.a, 10));
            for(Object object3: this.a) {
                arrayList1.add(((cy)object3).a);
            }
            for(Object object4: arrayList1) {
                ct ct0 = new ct(ibvd0);
                cu cu0 = new cu(((gw)object4), this);
                this.d.z(object2, this.r, ct0, cu0);
            }
            this.i(arrayList0, viewGroup0, new cv(this, viewGroup0, object2, ibvd0));
        }
    }

    @Override  // gr
    public final boolean e() {
        gi gi0 = this.d;
        if(gi0.n()) {
            List list0 = this.a;
            if(!list0.isEmpty()) {
                for(Object object0: list0) {
                    if(Build.VERSION.SDK_INT >= 34) {
                        Object object1 = ((cy)object0).b;
                        if(object1 == null || !gi0.o(object1)) {
                            return false;
                        }
                        continue;
                    }
                    return false;
                }
            }
            return this.k == null || gi0.o(this.k);
        }
        return false;
    }

    public final boolean f() {
        List list0 = this.a;
        if(list0.isEmpty()) {
            return true;
        }
        for(Object object0: list0) {
            if(!((cy)object0).a.c.s) {
                return false;
            }
        }
        return true;
    }

    private final ibns g(ViewGroup viewGroup0, gw gw0, gw gw1) {
        Object object8;
        ArrayList arrayList6;
        List list1;
        View view0 = new View(viewGroup0.getContext());
        Rect rect0 = new Rect();
        List list0 = this.a;
        View view1 = null;
        int v = 0;
        for(Object object0: list0) {
            if(((cy)object0).c() && gw1 != null && gw0 != null && !this.n.isEmpty()) {
                Object object1 = this.k;
                if(object1 != null) {
                    bxd bxd0 = this.q;
                    ga.a(gw0.c, gw1.c, this.f, bxd0, true);
                    keh.b(viewGroup0, new co(gw0, gw1, this));
                    ArrayList arrayList0 = this.l;
                    arrayList0.addAll(bxd0.values());
                    ArrayList arrayList1 = this.p;
                    if(!arrayList1.isEmpty()) {
                        Object object2 = arrayList1.get(0);
                        ibuq.e(object2, "get(...)");
                        view1 = (View)bxd0.get(((String)object2));
                        this.d.j(object1, view1);
                    }
                    ArrayList arrayList2 = this.m;
                    bxd bxd1 = this.e;
                    arrayList2.addAll(bxd1.values());
                    ArrayList arrayList3 = this.o;
                    list1 = list0;
                    if(!arrayList3.isEmpty()) {
                        Object object3 = arrayList3.get(0);
                        ibuq.e(object3, "get(...)");
                        View view2 = (View)bxd1.get(((String)object3));
                        if(view2 != null) {
                            keh.b(viewGroup0, new cp(view2, rect0));
                            v = 1;
                        }
                    }
                    this.d.k(object1, view0, arrayList0);
                    this.d.q(object1, null, null, object1, arrayList2);
                    goto label_38;
                }
            }
            list1 = list0;
        label_38:
            list0 = list1;
        }
        ArrayList arrayList4 = new ArrayList();
        Object object4 = null;
        Object object5 = null;
        Iterator iterator1 = list0.iterator();
        while(iterator1.hasNext()) {
            Object object6 = iterator1.next();
            cy cy0 = (cy)object6;
            gw gw2 = cy0.a;
            gi gi0 = this.d;
            Object object7 = gi0.a(cy0.b);
            if(object7 == null) {
                object5 = object5;
                object4 = object4;
            }
            else {
                ArrayList arrayList5 = new ArrayList();
                du du0 = gw2.c;
                View view3 = du0.P;
                ibuq.e(view3, "mView");
                this.h(arrayList5, view3);
                if(this.k != null && (gw2 == gw1 || gw2 == gw0)) {
                    if(gw2 == gw1) {
                        arrayList5.removeAll(ibpo.ay(this.l));
                    }
                    else {
                        arrayList5.removeAll(ibpo.ay(this.m));
                    }
                }
                if(arrayList5.isEmpty()) {
                    gi0.d(object7, view0);
                    arrayList6 = arrayList5;
                    object8 = object7;
                }
                else {
                    gi0.e(object7, arrayList5);
                    gi0.q(object7, object7, arrayList5, null, null);
                    object8 = object7;
                    arrayList6 = arrayList5;
                    if(gw2.a == gv.c) {
                        gw2.h();
                        ArrayList arrayList7 = new ArrayList(arrayList6);
                        arrayList7.remove(du0.P);
                        gi0.h(object8, du0.P, arrayList7);
                        keh.b(viewGroup0, new cq(arrayList6));
                    }
                }
                if(gw2.a == gv.b) {
                    arrayList4.addAll(arrayList6);
                    if(v != 0) {
                        gi0.i(object8, rect0);
                    }
                    if(fm.ar(2)) {
                        Objects.toString(object8);
                        Iterator iterator2 = arrayList6.iterator();
                        ibuq.e(iterator2, "iterator(...)");
                        while(iterator2.hasNext()) {
                            Object object9 = iterator2.next();
                            ibuq.e(object9, "next(...)");
                            Objects.toString(((View)object9));
                        }
                    }
                }
                else {
                    gi0.j(object8, view1);
                    if(fm.ar(2)) {
                        Objects.toString(object8);
                        Iterator iterator3 = arrayList6.iterator();
                        ibuq.e(iterator3, "iterator(...)");
                        while(iterator3.hasNext()) {
                            Object object10 = iterator3.next();
                            ibuq.e(object10, "next(...)");
                            Objects.toString(((View)object10));
                        }
                    }
                }
                if(cy0.c) {
                    object5 = gi0.p(object5, object8);
                    iterator1 = iterator1;
                    v = v;
                    object4 = object4;
                }
                else {
                    object5 = object5;
                    v = v;
                    object4 = gi0.p(object4, object8);
                    iterator1 = iterator1;
                }
            }
        }
        Object object11 = this.d.b(object5, object4, this.k);
        if(fm.ar(2)) {
            Objects.toString(object11);
            Objects.toString(viewGroup0);
        }
        return new ibns(arrayList4, object11);
    }

    private final void h(ArrayList arrayList0, View view0) {
        if((view0 instanceof ViewGroup)) {
            if(!((ViewGroup)view0).isTransitionGroup()) {
                goto label_5;
            }
            if(!arrayList0.contains(view0)) {
                arrayList0.add(view0);
                return;
            label_5:
                int v = ((ViewGroup)view0).getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view1 = ((ViewGroup)view0).getChildAt(v1);
                    if(view1.getVisibility() == 0) {
                        ibuq.c(view1);
                        this.h(arrayList0, view1);
                    }
                }
            }
        }
        else if(!arrayList0.contains(view0)) {
            arrayList0.add(view0);
        }
    }

    private final void i(ArrayList arrayList0, ViewGroup viewGroup0, ibth ibth0) {
        ga.b(arrayList0, 4);
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = this.m;
        int v = arrayList2.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)arrayList2.get(v1);
            arrayList1.add(view0.getTransitionName());
            view0.setTransitionName(null);
        }
        if(fm.ar(2)) {
            Iterator iterator0 = this.l.iterator();
            ibuq.e(iterator0, "iterator(...)");
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ibuq.e(object0, "next(...)");
                Objects.toString(((View)object0));
                ((View)object0).getTransitionName();
            }
            Iterator iterator1 = arrayList2.iterator();
            ibuq.e(iterator1, "iterator(...)");
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                ibuq.e(object1, "next(...)");
                Objects.toString(((View)object1));
                ((View)object1).getTransitionName();
            }
        }
        ibth0.a();
        gi gi0 = this.d;
        ArrayList arrayList3 = this.l;
        bxd bxd0 = this.n;
        int v2 = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view1 = (View)arrayList3.get(v3);
            String s = view1.getTransitionName();
            arrayList4.add(s);
            if(s != null) {
                view1.setTransitionName(null);
                String s1 = (String)bxd0.get(s);
                for(int v4 = 0; v4 < v2; ++v4) {
                    if(s1.equals(arrayList1.get(v4))) {
                        ((View)arrayList2.get(v4)).setTransitionName(s);
                        break;
                    }
                }
            }
        }
        keh.b(viewGroup0, new gh(v2, arrayList2, arrayList1, arrayList3, arrayList4));
        ga.b(arrayList0, 0);
        gi0.l(this.k, arrayList3, arrayList2);
    }
}

