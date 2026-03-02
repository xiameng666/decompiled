import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import j..util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class uf {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    public ue f;
    public final RecyclerView g;

    public uf(RecyclerView recyclerView0) {
        this.g = recyclerView0;
        super();
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList0);
        this.e = 2;
    }

    public final int a(int v) {
        if(v >= 0) {
            RecyclerView recyclerView0 = this.g;
            un un0 = recyclerView0.N;
            if(v < un0.a()) {
                return un0.g ? recyclerView0.f.a(v) : v;
            }
        }
        throw new IndexOutOfBoundsException("invalid position " + v + ". State item count is " + this.g.N.a() + this.g.t());
    }

    public final ue b() {
        if(this.f == null) {
            this.f = new ue();
            this.f();
        }
        return this.f;
    }

    public final View c(int v) {
        return this.q(v, 0x7FFFFFFFFFFFFFFFL).a;
    }

    final void d(uq uq0, boolean z) {
        RecyclerView.F(uq0);
        RecyclerView recyclerView0 = this.g;
        View view0 = uq0.a;
        us us0 = recyclerView0.S;
        if(us0 != null) {
            kdl kdl0 = us0.j();
            kfe.j(view0, ((kdl0 instanceof ur) ? ((kdl)((ur)kdl0).b.remove(view0)) : null));
        }
        if(z) {
            List list0 = recyclerView0.o;
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((ug)list0.get(v1)).a();
            }
            tk tk0 = recyclerView0.m;
            if(tk0 != null) {
                tk0.l(uq0);
            }
            if(recyclerView0.N != null) {
                recyclerView0.h.h(uq0);
            }
        }
        uq0.r = null;
        uq0.q = null;
        ue ue0 = this.b();
        int v2 = uq0.f;
        ArrayList arrayList0 = ue0.a(v2).a;
        ud ud0 = (ud)ue0.a.get(v2);
        if(arrayList0.size() >= 5) {
            kzk.b(view0);
            return;
        }
        uq0.l();
        arrayList0.add(uq0);
    }

    public final void e() {
        this.a.clear();
        this.j();
    }

    public final void f() {
        ue ue0 = this.f;
        if(ue0 != null) {
            tk tk0 = this.g.m;
            if(tk0 != null && this.g.q) {
                ue0.c.add(tk0);
            }
        }
    }

    public final void g(tk tk0) {
        this.h(tk0, false);
    }

    public final void h(tk tk0, boolean z) {
        ue ue0 = this.f;
        if(ue0 != null) {
            ue0.c.remove(tk0);
            if(ue0.c.size() != 0 || z) {
                return;
            }
            for(int v = 0; true; ++v) {
                SparseArray sparseArray0 = ue0.a;
                if(v >= sparseArray0.size()) {
                    break;
                }
                ArrayList arrayList0 = ((ud)sparseArray0.get(sparseArray0.keyAt(v))).a;
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    kzk.b(((uq)arrayList0.get(v1)).a);
                }
            }
        }
    }

    final void i(View view0) {
        uq uq0 = RecyclerView.p(view0);
        uq0.m = null;
        uq0.n = false;
        uq0.i();
        this.m(uq0);
    }

    public final void j() {
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            this.k(v);
        }
        arrayList0.clear();
        this.g.M.b();
    }

    public final void k(int v) {
        this.d(((uq)this.c.get(v)), true);
        this.c.remove(v);
    }

    public final void l(View view0) {
        uq uq0 = RecyclerView.p(view0);
        if(uq0.x()) {
            this.g.removeDetachedView(view0, false);
        }
        if(uq0.w()) {
            uq0.p();
        }
        else if(uq0.B()) {
            uq0.i();
        }
        this.m(uq0);
        RecyclerView recyclerView0 = this.g;
        if(recyclerView0.D != null && !uq0.u()) {
            recyclerView0.D.b(uq0);
        }
    }

    final void m(uq uq0) {
        int v3;
        boolean z = true;
        int v = 0;
        if(!uq0.w()) {
            View view0 = uq0.a;
            if(view0.getParent() == null) {
                if(uq0.x()) {
                    throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + uq0 + this.g.t());
                }
                if(uq0.A()) {
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.g.t());
                }
                boolean z1 = (uq0.j & 16) == 0 && view0.hasTransientState();
                RecyclerView recyclerView0 = this.g;
                if((recyclerView0.m == null || !z1 || !recyclerView0.m.m(uq0)) && !uq0.u()) {
                    z = false;
                }
                else {
                    if(this.e > 0 && !uq0.q(0x20E)) {
                        ArrayList arrayList0 = this.c;
                        int v1 = arrayList0.size();
                        if(v1 >= this.e && v1 > 0) {
                            this.k(0);
                            --v1;
                        }
                        if(v1 > 0 && !recyclerView0.M.d(uq0.c)) {
                            do {
                                --v1;
                                if(v1 < 0) {
                                    break;
                                }
                                int v2 = ((uq)arrayList0.get(v1)).c;
                            }
                            while(recyclerView0.M.d(v2));
                            ++v1;
                        }
                        arrayList0.add(v1, uq0);
                        v3 = 1;
                    }
                    else {
                        v3 = 0;
                    }
                    if(v3 == 0) {
                        this.d(uq0, true);
                    }
                    else {
                        z = false;
                    }
                    v = v3;
                }
                recyclerView0.h.h(uq0);
                if(v == 0 && !z && z1) {
                    kzk.b(view0);
                    uq0.r = null;
                    uq0.q = null;
                }
                return;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        stringBuilder0.append(uq0.w());
        stringBuilder0.append(" isAttached:");
        if(uq0.a.getParent() == null) {
            z = false;
        }
        stringBuilder0.append(z);
        stringBuilder0.append(this.g.t());
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    final void n(View view0) {
        uq uq0 = RecyclerView.p(view0);
        if(!uq0.q(12) && uq0.y()) {
            tr tr0 = this.g.D;
            if(tr0 != null && !tr0.h(uq0, uq0.d())) {
                if(this.b == null) {
                    this.b = new ArrayList();
                }
                uq0.o(this, true);
                this.b.add(uq0);
                return;
            }
        }
        if(uq0.t() && !uq0.v()) {
            RecyclerView recyclerView0 = this.g;
            if(!recyclerView0.m.c) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView0.t());
            }
        }
        uq0.o(this, false);
        this.a.add(uq0);
    }

    public final void o(uq uq0) {
        if(uq0.n) {
            this.b.remove(uq0);
        }
        else {
            this.a.remove(uq0);
        }
        uq0.m = null;
        uq0.n = false;
        uq0.i();
    }

    public final void p() {
        tx tx0 = this.g.n;
        this.e = (tx0 == null ? 0 : tx0.C) + 2;
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0 || arrayList0.size() <= this.e) {
                break;
            }
            this.k(v);
        }
    }

    final uq q(int v, long v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams2;
        boolean z2;
        boolean z1;
        View view0;
        boolean z;
        uq uq0;
        if(v >= 0) {
            RecyclerView recyclerView0 = this.g;
            un un0 = recyclerView0.N;
            if(v < un0.a()) {
                if(un0.g) {
                    ArrayList arrayList0 = this.b;
                    if(arrayList0 != null) {
                        int v2 = arrayList0.size();
                        if(v2 != 0) {
                            int v3 = 0;
                            while(v3 < v2) {
                                uq0 = (uq)this.b.get(v3);
                                if(!uq0.B() && uq0.c() == v) {
                                    uq0.f(0x20);
                                    goto label_31;
                                }
                                ++v3;
                            }
                            if(recyclerView0.m.c) {
                                int v4 = recyclerView0.f.a(v);
                                if(v4 > 0 && v4 < recyclerView0.m.b()) {
                                    long v5 = recyclerView0.m.dy(v4);
                                    int v6 = 0;
                                    while(v6 < v2) {
                                        uq uq1 = (uq)this.b.get(v6);
                                        if(!uq1.B() && uq1.e == v5) {
                                            uq1.f(0x20);
                                            uq0 = uq1;
                                            goto label_31;
                                        }
                                        ++v6;
                                    }
                                }
                            }
                        }
                    }
                    uq0 = null;
                label_31:
                    z = uq0 != null;
                }
                else {
                    z = false;
                    uq0 = null;
                }
                if(uq0 == null) {
                    ArrayList arrayList1 = this.a;
                    int v7 = arrayList1.size();
                    int v8 = 0;
                alab1:
                    while(true) {
                        if(v8 < v7) {
                            uq uq2 = (uq)arrayList1.get(v8);
                            if(!uq2.B() && uq2.c() == v && !uq2.t() && (un0.g || !uq2.v())) {
                                uq2.f(0x20);
                                uq0 = uq2;
                                break;
                            }
                            ++v8;
                            continue;
                        }
                        List list0 = recyclerView0.g.b;
                        int v9 = list0.size();
                        int v10 = 0;
                        while(true) {
                            view0 = null;
                            if(v10 < v9) {
                                view0 = (View)list0.get(v10);
                                uq uq3 = RecyclerView.p(view0);
                                if(uq3.c() != v || uq3.t() || uq3.v()) {
                                    ++v10;
                                    continue;
                                }
                            }
                            break;
                        }
                        if(view0 == null) {
                            ArrayList arrayList2 = this.c;
                            int v13 = arrayList2.size();
                            int v14 = 0;
                            while(true) {
                                uq0 = null;
                                if(v14 < v13) {
                                    uq uq5 = (uq)arrayList2.get(v14);
                                    if(!uq5.t() && uq5.c() == v && !uq5.r()) {
                                        arrayList2.remove(v14);
                                        uq0 = uq5;
                                        break alab1;
                                    }
                                    ++v14;
                                    continue;
                                }
                                break alab1;
                            }
                        }
                        else {
                            uq uq4 = RecyclerView.p(view0);
                            qo qo0 = recyclerView0.g;
                            int v11 = qo0.e.b(view0);
                            if(v11 >= 0) {
                                qn qn0 = qo0.a;
                                if(qn0.f(v11)) {
                                    qn0.b(v11);
                                    qo0.l(view0);
                                    int v12 = recyclerView0.g.c(view0);
                                    if(v12 == -1) {
                                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + uq4 + recyclerView0.t());
                                    }
                                    recyclerView0.g.h(v12);
                                    this.n(view0);
                                    uq4.f(0x2020);
                                    uq0 = uq4;
                                    break;
                                }
                                Objects.toString(view0);
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view0.toString());
                            }
                            Objects.toString(view0);
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view0.toString());
                        }
                        goto label_118;
                    }
                    if(uq0 != null) {
                        if(!uq0.v()) {
                            if(uq0.c < 0 || uq0.c >= recyclerView0.m.b()) {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + uq0 + recyclerView0.t());
                            }
                            if(un0.g) {
                            label_104:
                                if(recyclerView0.m.c && uq0.e != recyclerView0.m.dy(uq0.c)) {
                                label_105:
                                    uq0.f(4);
                                    if(uq0.w()) {
                                        recyclerView0.removeDetachedView(uq0.a, false);
                                        uq0.p();
                                    }
                                    else if(uq0.B()) {
                                        uq0.i();
                                    }
                                    this.m(uq0);
                                    uq0 = null;
                                }
                                else {
                                    z = true;
                                }
                            }
                            else {
                                int v15 = uq0.f;
                                if(recyclerView0.m.dx(uq0.c) == v15) {
                                    goto label_104;
                                }
                                else {
                                    goto label_105;
                                }
                            }
                        }
                        else if(un0.g) {
                            z = true;
                        }
                        else {
                            goto label_105;
                        }
                    }
                }
            label_118:
                if(uq0 == null) {
                    int v16 = recyclerView0.f.a(v);
                    if(v16 < 0 || v16 >= recyclerView0.m.b()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + v + "(offset:" + v16 + ").state:" + un0.a() + recyclerView0.t());
                    }
                    int v17 = recyclerView0.m.dx(v16);
                    tk tk0 = recyclerView0.m;
                    if(tk0.c) {
                        long v18 = tk0.dy(v16);
                        ArrayList arrayList3 = this.a;
                        int v19 = arrayList3.size() - 1;
                    alab2:
                        while(true) {
                            if(v19 < 0) {
                                ArrayList arrayList4 = this.c;
                                for(int v20 = arrayList4.size() - 1; v20 >= 0; --v20) {
                                    uq uq7 = (uq)arrayList4.get(v20);
                                    if(uq7.e == v18 && !uq7.r()) {
                                        if(v17 == uq7.f) {
                                            arrayList4.remove(v20);
                                            uq0 = uq7;
                                            break alab2;
                                        }
                                        this.k(v20);
                                        break;
                                    }
                                }
                                uq0 = null;
                                break;
                            }
                            uq uq6 = (uq)arrayList3.get(v19);
                            if(uq6.e == v18 && !uq6.B()) {
                                if(v17 == uq6.f) {
                                    uq6.f(0x20);
                                    if(uq6.v() && !un0.g) {
                                        uq6.m(2, 14);
                                    }
                                    uq0 = uq6;
                                    break;
                                }
                                arrayList3.remove(v19);
                                recyclerView0.removeDetachedView(uq6.a, false);
                                this.i(uq6.a);
                            }
                            --v19;
                            v18 = v18;
                        }
                        if(uq0 != null) {
                            uq0.c = v16;
                            z = true;
                        }
                    }
                    if(uq0 == null) {
                        uq uq8 = null;
                        ud ud0 = (ud)this.b().a.get(v17);
                        if(ud0 != null) {
                            ArrayList arrayList5 = ud0.a;
                            if(!arrayList5.isEmpty()) {
                                int v21 = arrayList5.size() - 1;
                                while(v21 >= 0) {
                                    if(((uq)arrayList5.get(v21)).r()) {
                                        --v21;
                                        continue;
                                    }
                                    else {
                                        uq8 = (uq)arrayList5.remove(v21);
                                    }
                                    break;
                                }
                            }
                        }
                        if(uq8 != null) {
                            uq8.l();
                        }
                        uq0 = uq8;
                    }
                    if(uq0 == null) {
                        long v22 = System.nanoTime();
                        if(Long.compare(v1, 0x7FFFFFFFFFFFFFFFL) != 0) {
                            long v23 = this.f.a(v17).c;
                            if(v23 != 0L && v23 + v22 >= v1) {
                                return null;
                            }
                        }
                        uq0 = recyclerView0.m.o(recyclerView0, v17);
                        RecyclerView recyclerView1 = RecyclerView.q(uq0.a);
                        if(recyclerView1 != null) {
                            uq0.b = new WeakReference(recyclerView1);
                        }
                        ud ud1 = this.f.a(v17);
                        ud1.c = ue.d(ud1.c, System.nanoTime() - v22);
                    }
                }
                if(z && !un0.g && uq0.q(0x2000)) {
                    uq0.m(0, 0x2000);
                    if(un0.j) {
                        tr.t(uq0);
                        recyclerView0.af(uq0, tr.s(uq0));
                    }
                }
                if(un0.g && uq0.s()) {
                    uq0.g = v;
                    z1 = false;
                }
                else if(!uq0.s() || uq0.z() || uq0.t()) {
                    int v24 = recyclerView0.f.a(v);
                    uq0.r = null;
                    uq0.q = recyclerView0;
                    int v25 = uq0.f;
                    long v26 = System.nanoTime();
                    if(Long.compare(v1, 0x7FFFFFFFFFFFFFFFL) == 0) {
                    label_213:
                        if(uq0.x()) {
                            int v28 = recyclerView0.getChildCount();
                            ViewGroup.LayoutParams viewGroup$LayoutParams0 = uq0.a.getLayoutParams();
                            recyclerView0.attachViewToParent(uq0.a, v28, viewGroup$LayoutParams0);
                            z2 = true;
                        }
                        else {
                            z2 = false;
                        }
                        recyclerView0.m.p(uq0, v24);
                        if(z2) {
                            recyclerView0.detachViewFromParent(uq0.a);
                        }
                        ud ud2 = this.f.a(uq0.f);
                        ud2.d = ue.d(ud2.d, System.nanoTime() - v26);
                        if(recyclerView0.aB()) {
                            View view1 = uq0.a;
                            if(view1.getImportantForAccessibility() == 0) {
                                view1.setImportantForAccessibility(1);
                            }
                            us us0 = recyclerView0.S;
                            if(us0 != null) {
                                kdl kdl0 = us0.j();
                                if((kdl0 instanceof ur)) {
                                    kdl kdl1 = kfe.b(view1);
                                    if(kdl1 != null && kdl1 != ((ur)kdl0)) {
                                        ((ur)kdl0).b.put(view1, kdl1);
                                    }
                                }
                                kfe.j(view1, kdl0);
                            }
                        }
                        if(un0.g) {
                            uq0.g = v;
                        }
                        z1 = true;
                    }
                    else {
                        long v27 = this.f.a(v25).d;
                        if(v27 != 0L && v27 + v26 >= v1) {
                            z1 = false;
                            goto label_242;
                        }
                        goto label_213;
                    }
                }
                else {
                    z1 = false;
                }
            label_242:
                View view2 = uq0.a;
                ViewGroup.LayoutParams viewGroup$LayoutParams1 = view2.getLayoutParams();
                if(viewGroup$LayoutParams1 == null) {
                    viewGroup$LayoutParams2 = recyclerView0.generateDefaultLayoutParams();
                    view2.setLayoutParams(viewGroup$LayoutParams2);
                }
                else if(recyclerView0.checkLayoutParams(viewGroup$LayoutParams1)) {
                    viewGroup$LayoutParams2 = (ty)viewGroup$LayoutParams1;
                }
                else {
                    viewGroup$LayoutParams2 = recyclerView0.generateLayoutParams(viewGroup$LayoutParams1);
                    view2.setLayoutParams(viewGroup$LayoutParams2);
                }
                ((ty)viewGroup$LayoutParams2).c = uq0;
                ((ty)viewGroup$LayoutParams2).f = z && z1;
                return uq0;
            }
        }
        throw new IndexOutOfBoundsException("Invalid item position " + v + "(" + v + "). Item count:" + this.g.N.a() + this.g.t());
    }
}

