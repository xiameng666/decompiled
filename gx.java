import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

public final class gx {
    public final ViewGroup a;
    public final List b;
    public final List c;
    public boolean d;
    public boolean e;
    private boolean f;

    public gx(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        super();
        this.a = viewGroup0;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final gw a(du du0) {
        for(Object object0: this.b) {
            gw gw0 = (gw)object0;
            if(ibuq.m(gw0.c, du0) && !gw0.d) {
                return (gw)object0;
            }
        }
        return null;
    }

    public final gw b(du du0) {
        for(Object object0: this.c) {
            gw gw0 = (gw)object0;
            if(ibuq.m(gw0.c, du0) && !gw0.d) {
                return (gw)object0;
            }
        }
        return null;
    }

    public static final gx c(ViewGroup viewGroup0, fm fm0) {
        ibuq.f(viewGroup0, "container");
        ew ew0 = fm0.aA();
        ibuq.e(ew0, "getSpecialEffectsControllerFactory(...)");
        return gq.a(viewGroup0, ew0);
    }

    // Detected as a lambda impl.
    public final void d(gw gw0) {
        ibuq.f(gw0, "operation");
        if(gw0.h) {
            gw0.a.a(gw0.c.requireView(), this.a);
            gw0.h();
        }
    }

    public final void e(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ibpo.D(arrayList0, ((gw)object0).i);
        }
        List list1 = ibpo.ar(ibpo.ay(arrayList0));
        int v = list1.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((gr)list1.get(v2)).b(this.a);
        }
        int v3 = list0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            this.d(((gw)list0.get(v4)));
        }
        List list2 = ibpo.ar(list0);
        int v5 = list2.size();
        for(int v1 = 0; v1 < v5; ++v1) {
            gw gw0 = (gw)list2.get(v1);
            if(gw0.i.isEmpty()) {
                gw0.a();
            }
        }
    }

    public final void f(gv gv0, gt gt0, fv fv0) {
        List list0 = this.b;
        synchronized(list0) {
            du du0 = fv0.a;
            ibuq.e(du0, "getFragment(...)");
            gw gw0 = this.a(du0);
            if(gw0 == null) {
                if(!du0.s && !du0.r) {
                    gw0 = null;
                }
                else {
                    ibuq.e(du0, "getFragment(...)");
                    gw0 = this.b(du0);
                }
            }
            if(gw0 != null) {
                gw0.g(gv0, gt0);
                return;
            }
            gs gs0 = new gs(gv0, gt0, fv0);
            list0.add(gs0);
            gs0.c(new go(this, gs0));
            gs0.c(new gp(this, gs0));
        }
    }

    public final void g() {
        boolean z5;
        Iterator iterator17;
        boolean z4;
        Iterator iterator12;
        cx cx0;
        List list5;
        ArrayList arrayList4;
        List list4;
        ViewGroup viewGroup1;
        boolean z1;
        Object object3;
        if(this.e) {
            return;
        }
        ViewGroup viewGroup0 = this.a;
        if(!viewGroup0.isAttachedToWindow()) {
            this.h();
            this.d = false;
            return;
        }
        List list0 = this.b;
        synchronized(list0) {
            List list1 = this.c;
            List list2 = ibpo.at(list1);
            list1.clear();
            for(Object object0: list2) {
                ((gw)object0).f = !list0.isEmpty() && ((gw)object0).c.s;
            }
            for(Object object1: list2) {
                gw gw0 = (gw)object1;
                if(this.f) {
                    if(fm.ar(2)) {
                        Objects.toString(gw0);
                    }
                    gw0.a();
                }
                else {
                    if(fm.ar(2)) {
                        Objects.toString(gw0);
                    }
                    gw0.e(viewGroup0);
                }
                this.f = false;
                if(!gw0.e) {
                    list1.add(gw0);
                }
            }
            if(!list0.isEmpty()) {
                this.k();
                List list3 = ibpo.at(list0);
                if(!list3.isEmpty()) {
                    list0.clear();
                    list1.addAll(list3);
                    fm.ar(2);
                    boolean z = this.d;
                    fm.ar(2);
                    for(Object object2: list3) {
                        View view0 = ((gw)object2).c.P;
                        ibuq.e(view0, "mView");
                        if(gu.b(view0) != gv.b || ((gw)object2).a == gv.b) {
                            continue;
                        }
                        goto label_51;
                    }
                    object2 = null;
                label_51:
                    ListIterator listIterator0 = list3.listIterator(list3.size());
                    while(listIterator0.hasPrevious()) {
                        object3 = listIterator0.previous();
                        View view1 = ((gw)object3).c.P;
                        ibuq.e(view1, "mView");
                        if(gu.b(view1) == gv.b || ((gw)object3).a != gv.b) {
                            continue;
                        }
                        goto label_59;
                    }
                    object3 = null;
                label_59:
                    if(fm.ar(2)) {
                        Objects.toString(((gw)object2));
                        Objects.toString(((gw)object3));
                    }
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    du du0 = ((gw)ibpo.W(list3)).c;
                    for(Object object4: list3) {
                        dq dq0 = ((gw)object4).c.S;
                        dq0.b = du0.S.b;
                        dq0.c = du0.S.c;
                        dq0.d = du0.S.d;
                        dq0.e = du0.S.e;
                    }
                    for(Object object5: list3) {
                        gw gw1 = (gw)object5;
                        arrayList0.add(new ci(gw1, z));
                        if(!z) {
                            if(gw1 == ((gw)object3)) {
                                z1 = true;
                                goto label_87;
                            }
                        }
                        else if(gw1 == ((gw)object2)) {
                            z1 = true;
                            goto label_87;
                        }
                        z1 = false;
                    label_87:
                        arrayList1.add(new cy(gw1, z, z1));
                        gw1.c(() -> {
                            ibuq.f(gw1, "operation");
                            if(gw1.h) {
                                gw1.a.a(gw1.c.requireView(), this.a);
                                gw1.h();
                            }
                        });
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object6: arrayList1) {
                        if(!((cy)object6).b()) {
                            arrayList2.add(object6);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object7: arrayList2) {
                        if(((cy)object7).a() != null) {
                            arrayList3.add(object7);
                        }
                    }
                    gi gi0 = null;
                    for(Object object8: arrayList3) {
                        cy cy0 = (cy)object8;
                        gi gi1 = cy0.a();
                        if(gi0 != null && gi1 != gi0) {
                            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cy0.a.c + " returned Transition " + cy0.b + " which uses a different Transition type than other Fragments.");
                        }
                        gi0 = gi1;
                    }
                    if(gi0 == null) {
                        viewGroup1 = viewGroup0;
                        list4 = list3;
                        arrayList4 = arrayList0;
                    }
                    else {
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        bxd bxd0 = new bxd();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        bxd bxd1 = new bxd();
                        bxd bxd2 = new bxd();
                        ArrayList arrayList9 = arrayList8;
                        Object object9 = null;
                        for(Object object10: arrayList3) {
                            cy cy1 = (cy)object10;
                            if(cy1.c() && ((gw)object2) != null && ((gw)object3) != null) {
                                object9 = gi0.c(gi0.a(cy1.d));
                                du du1 = ((gw)object3).c;
                                ArrayList arrayList10 = du1.iW();
                                du du2 = ((gw)object2).c;
                                ArrayList arrayList11 = du2.iW();
                                ArrayList arrayList12 = du2.iX();
                                int v1 = arrayList12.size();
                                list5 = list3;
                                int v2 = 0;
                                while(v2 < v1) {
                                    int v3 = arrayList10.indexOf(arrayList12.get(v2));
                                    if(v3 != -1) {
                                        arrayList10.set(v3, arrayList11.get(v2));
                                    }
                                    ++v2;
                                    arrayList12 = arrayList12;
                                }
                                ArrayList arrayList13 = du1.iX();
                                ibns ibns0 = z ? new ibns(du2.iV(), du1.gC()) : new ibns(du2.gC(), du1.iV());
                                jwb jwb0 = (jwb)ibns0.a;
                                jwb jwb1 = (jwb)ibns0.b;
                                int v4 = arrayList10.size();
                                int v5 = 0;
                                while(v5 < v4) {
                                    Object object11 = arrayList10.get(v5);
                                    ibuq.e(object11, "get(...)");
                                    Object object12 = arrayList13.get(v5);
                                    ibuq.e(object12, "get(...)");
                                    bxd0.put(((String)object11), ((String)object12));
                                    ++v5;
                                    jwb1 = jwb1;
                                    jwb0 = jwb0;
                                    v4 = v4;
                                }
                                if(fm.ar(2)) {
                                    Iterator iterator9 = arrayList13.iterator();
                                    ibuq.e(iterator9, "iterator(...)");
                                    while(iterator9.hasNext()) {
                                        Object object13 = iterator9.next();
                                        String s = (String)object13;
                                    }
                                    Iterator iterator10 = arrayList10.iterator();
                                    ibuq.e(iterator10, "iterator(...)");
                                    while(iterator10.hasNext()) {
                                        Object object14 = iterator10.next();
                                        String s1 = (String)object14;
                                    }
                                }
                                View view2 = du2.P;
                                ibuq.e(view2, "mView");
                                this.l(bxd1, view2);
                                bxd1.c(arrayList10);
                                if(jwb0 != null) {
                                    if(fm.ar(2)) {
                                        Objects.toString(((gw)object2));
                                    }
                                    throw null;
                                }
                                bxd0.c(bxd1.keySet());
                                View view3 = du1.P;
                                ibuq.e(view3, "mView");
                                this.l(bxd2, view3);
                                bxd2.c(arrayList13);
                                bxd2.c(bxd0.values());
                                if(jwb1 != null) {
                                    if(fm.ar(2)) {
                                        Objects.toString(((gw)object3));
                                    }
                                    throw null;
                                }
                                for(int v6 = bxd0.d_num - 1; v6 >= 0; --v6) {
                                    if(!bxd2.containsKey(((String)bxd0.i(v6)))) {
                                        bxd0.g(v6);
                                    }
                                }
                                gx.m(bxd1, bxd0.keySet());
                                gx.m(bxd2, bxd0.values());
                                if(bxd0.isEmpty()) {
                                    Log.i("FragmentManager", "Ignoring shared elements transition " + object9 + " between " + ((gw)object2) + " and " + ((gw)object3) + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                    arrayList5.clear();
                                    arrayList6.clear();
                                    arrayList9 = arrayList10;
                                    object9 = null;
                                }
                                else {
                                    arrayList9 = arrayList10;
                                }
                                arrayList3 = arrayList3;
                                gi0 = gi0;
                                z = z;
                                viewGroup0 = viewGroup0;
                                arrayList0 = arrayList0;
                                arrayList5 = arrayList5;
                                arrayList7 = arrayList13;
                            }
                            else {
                                list5 = list3;
                                arrayList3 = arrayList3;
                                gi0 = gi0;
                                z = z;
                                viewGroup0 = viewGroup0;
                                arrayList0 = arrayList0;
                                arrayList5 = arrayList5;
                            }
                            list3 = list5;
                        }
                        viewGroup1 = viewGroup0;
                        list4 = list3;
                        arrayList4 = arrayList0;
                        if(object9 != null) {
                            cx0 = new cx(arrayList3, ((gw)object2), ((gw)object3), gi0, object9, arrayList5, arrayList6, bxd0, arrayList7, arrayList9, bxd1, bxd2, z);
                            iterator12 = arrayList3.iterator();
                        label_244:
                            while(iterator12.hasNext()) {
                                Object object16 = iterator12.next();
                                ((cy)object16).a.d(cx0);
                            }
                        }
                        else if(!arrayList3.isEmpty()) {
                            for(Object object15: arrayList3) {
                                if(((cy)object15).b == null) {
                                    continue;
                                }
                                cx0 = new cx(arrayList3, ((gw)object2), ((gw)object3), gi0, null, arrayList5, arrayList6, bxd0, arrayList7, arrayList9, bxd1, bxd2, z);
                                iterator12 = arrayList3.iterator();
                                goto label_244;
                            }
                        }
                    }
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = new ArrayList();
                    for(Object object17: arrayList4) {
                        ibpo.D(arrayList15, ((ci)object17).a.i);
                    }
                    boolean z2 = arrayList15.isEmpty();
                    boolean z3 = false;
                    for(Object object18: arrayList4) {
                        ci ci0 = (ci)object18;
                        gw gw2 = ci0.a;
                        Context context0 = viewGroup1.getContext();
                        ibuq.c(context0);
                        eb eb0 = ci0.a(context0);
                        if(eb0 == null) {
                        }
                        else if(eb0.b == null) {
                            arrayList14.add(ci0);
                        }
                        else {
                            du du3 = gw2.c;
                            if(gw2.i.isEmpty()) {
                                if(gw2.a == gv.c) {
                                    gw2.h();
                                }
                                gw2.d(new ck(ci0));
                                z3 = true;
                            }
                            else {
                                if(!fm.ar(2)) {
                                    continue;
                                }
                                Objects.toString(du3);
                            }
                        }
                    }
                    for(Object object19: arrayList14) {
                        ci ci1 = (ci)object19;
                        gw gw3 = ci1.a;
                        du du4 = gw3.c;
                        if(!z2) {
                            if(!fm.ar(2)) {
                                continue;
                            }
                            Objects.toString(du4);
                        }
                        else if(!z3) {
                            gw3.d(new ch(ci1));
                        }
                        else if(fm.ar(2)) {
                            Objects.toString(du4);
                        }
                    }
                    Iterator iterator16 = list4.iterator();
                    do {
                        z4 = true;
                    label_297:
                        if(!iterator16.hasNext()) {
                            goto label_307;
                        }
                        Object object20 = iterator16.next();
                        List list6 = ((gw)object20).i;
                        if(list6.isEmpty()) {
                            z4 = false;
                            goto label_297;
                        }
                        iterator17 = list6.iterator();
                    label_302:
                    }
                    while(!iterator17.hasNext());
                    Object object21 = iterator17.next();
                    if(((gr)object21).e()) {
                        goto label_302;
                    }
                    z4 = false;
                    goto label_297;
                label_307:
                    if(z4) {
                        ArrayList arrayList16 = new ArrayList();
                        for(Object object22: list4) {
                            ibpo.D(arrayList16, ((gw)object22).i);
                        }
                        z5 = !arrayList16.isEmpty();
                    }
                    else {
                        z5 = false;
                    }
                    int v7 = 1;
                    for(Object object23: list4) {
                        v7 &= ((gw)object23).c.s;
                    }
                    this.f = v7 != 0 && !z5;
                    fm.ar(2);
                    if(v7 == 0) {
                        this.j(list4);
                        this.e(list4);
                    }
                    else if(z5) {
                        this.j(list4);
                        int v8 = list4.size();
                        for(int v9 = 0; v9 < v8; ++v9) {
                            this.d(((gw)list4.get(v9)));
                        }
                    }
                    this.d = false;
                    fm.ar(2);
                    goto label_345;
                }
                return;
            }
        label_345:
        }
    }

    public final void h() {
        fm.ar(2);
        ViewGroup viewGroup0 = this.a;
        boolean z = viewGroup0.isAttachedToWindow();
        List list0 = this.b;
        synchronized(list0) {
            this.k();
            this.j(list0);
            List list1 = ibpo.at(this.c);
            for(Object object0: list1) {
                ((gw)object0).f = false;
            }
            for(Object object1: list1) {
                gw gw0 = (gw)object1;
                if(fm.ar(2)) {
                    if(!z) {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        stringBuilder0.append("Container ");
                        stringBuilder0.append(viewGroup0);
                        stringBuilder0.append(" is not attached to window. ");
                    }
                    Objects.toString(gw0);
                }
                gw0.e(viewGroup0);
            }
            List list2 = ibpo.at(list0);
            for(Object object2: list2) {
                ((gw)object2).f = false;
            }
            for(Object object3: list2) {
                gw gw1 = (gw)object3;
                if(fm.ar(2)) {
                    if(!z) {
                        StringBuilder stringBuilder1 = new StringBuilder();
                        stringBuilder1.append("Container ");
                        stringBuilder1.append(viewGroup0);
                        stringBuilder1.append(" is not attached to window. ");
                    }
                    Objects.toString(gw1);
                }
                gw1.e(viewGroup0);
            }
        }
    }

    public final void i() {
        Object object0;
        du du0;
        List list0 = this.b;
        synchronized(list0) {
            this.k();
            ListIterator listIterator0 = list0.listIterator(list0.size());
            do {
                du0 = null;
                if(!listIterator0.hasPrevious()) {
                    goto label_13;
                }
                object0 = listIterator0.previous();
                View view0 = ((gw)object0).c.P;
                ibuq.e(view0, "mView");
                gv gv0 = gu.b(view0);
            }
            while(((gw)object0).a != gv.b || gv0 == gv.b);
            goto label_14;
        label_13:
            object0 = null;
        label_14:
            if(((gw)object0) != null) {
                du0 = ((gw)object0).c;
            }
            boolean z = false;
            if(du0 != null) {
                dq dq0 = du0.S;
                if(dq0 != null) {
                    z = dq0.u;
                }
            }
            this.e = z;
        }
    }

    public final void j(List list0) {
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((gw)list0.get(v2)).b();
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ibpo.D(arrayList0, ((gw)object0).i);
        }
        List list1 = ibpo.ar(ibpo.ay(arrayList0));
        int v3 = list1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            gr gr0 = (gr)list1.get(v1);
            ViewGroup viewGroup0 = this.a;
            ibuq.f(viewGroup0, "container");
            if(!gr0.i) {
                gr0.d(viewGroup0);
            }
            gr0.i = true;
        }
    }

    private final void k() {
        for(Object object0: this.b) {
            gw gw0 = (gw)object0;
            if(gw0.b == gt.b) {
                gw0.g(gu.a(gw0.c.requireView().getVisibility()), gt.a);
            }
        }
    }

    private final void l(Map map0, View view0) {
        String s = view0.getTransitionName();
        if(s != null) {
            map0.put(s, view0);
        }
        if((view0 instanceof ViewGroup)) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = ((ViewGroup)view0).getChildAt(v1);
                if(view1.getVisibility() == 0) {
                    ibuq.c(view1);
                    this.l(map0, view1);
                }
            }
        }
    }

    private static void m(bxd bxd0, Collection collection0) {
        ibpn.x(bxd0.entrySet(), new ce(collection0), false);
    }
}

