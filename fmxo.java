import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

public final class fmxo extends vl {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    private final ArrayList e;
    private final ArrayList f;
    private final ArrayList g;
    private final ArrayList l;
    private final ArrayList m;
    private final ArrayList n;
    private final ArrayList o;
    private final int p;
    private final long q;

    public fmxo(Context context0) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.u();
        this.i = 0xD9L;
        this.h = 0xD9L;
        this.p = context0.getResources().getDimensionPixelSize(0x7F070BE7);  // dimen:message_bubble_initial_offset
        flba.a();
        this.q = System.currentTimeMillis();
    }

    final void a() {
        if(!this.i()) {
            this.m();
        }
    }

    @Override  // tr
    public final void b(uq uq0) {
        View view0 = uq0.a;
        view0.animate().cancel();
        ArrayList arrayList0 = this.g;
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(((fmxn)arrayList0.get(v)).a == uq0) {
                view0.setTranslationY(0.0f);
                view0.setTranslationX(0.0f);
                this.l(uq0);
                arrayList0.remove(v);
            }
        }
        this.v(this.l, uq0);
        if(this.e.remove(uq0)) {
            view0.setAlpha(1.0f);
            this.l(uq0);
        }
        if(this.f.remove(uq0)) {
            view0.setAlpha(1.0f);
            this.l(uq0);
        }
        ArrayList arrayList1 = this.o;
        int v1 = arrayList1.size();
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList)arrayList1.get(v1);
            this.v(arrayList2, uq0);
            if(arrayList2.isEmpty()) {
                arrayList1.remove(v1);
            }
        }
        ArrayList arrayList3 = this.n;
        int v2 = arrayList3.size();
    alab1:
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            ArrayList arrayList4 = (ArrayList)arrayList3.get(v2);
            int v3 = arrayList4.size();
            do {
                --v3;
                if(v3 < 0) {
                    continue alab1;
                }
            }
            while(((fmxn)arrayList4.get(v3)).a != uq0);
            view0.setTranslationY(0.0f);
            view0.setTranslationX(0.0f);
            this.l(uq0);
            arrayList4.remove(v3);
            if(arrayList4.isEmpty()) {
                arrayList3.remove(v2);
            }
        }
        ArrayList arrayList5 = this.m;
        int v4 = arrayList5.size();
        while(true) {
            --v4;
            if(v4 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList)arrayList5.get(v4);
            if(arrayList6.remove(uq0)) {
                view0.setAlpha(1.0f);
                this.l(uq0);
                if(arrayList6.isEmpty()) {
                    arrayList5.remove(v4);
                }
            }
        }
        this.a();
    }

    @Override  // tr
    public final void c() {
        ArrayList arrayList0 = this.g;
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            uq uq0 = ((fmxn)arrayList0.get(v)).a;
            uq0.a.setTranslationY(0.0f);
            uq0.a.setTranslationX(0.0f);
            this.l(uq0);
            arrayList0.remove(v);
        }
        ArrayList arrayList1 = this.e;
        int v1 = arrayList1.size();
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            this.l(((uq)arrayList1.get(v1)));
            arrayList1.remove(v1);
        }
        ArrayList arrayList2 = this.f;
        int v2 = arrayList2.size();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            uq uq1 = (uq)arrayList2.get(v2);
            uq1.a.setAlpha(1.0f);
            this.l(uq1);
            arrayList2.remove(v2);
        }
        ArrayList arrayList3 = this.l;
        int v3 = arrayList3.size();
        while(true) {
            --v3;
            if(v3 < 0) {
                break;
            }
            this.w(((fmxm)arrayList3.get(v3)));
        }
        arrayList3.clear();
        if(!this.i()) {
            return;
        }
        ArrayList arrayList4 = this.n;
        int v4 = arrayList4.size();
        while(true) {
            --v4;
            if(v4 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList)arrayList4.get(v4);
            int v5 = arrayList5.size();
            while(true) {
                --v5;
                if(v5 < 0) {
                    break;
                }
                uq uq2 = ((fmxn)arrayList5.get(v5)).a;
                uq2.a.setTranslationY(0.0f);
                uq2.a.setTranslationX(0.0f);
                this.l(uq2);
                arrayList5.remove(v5);
                if(arrayList5.isEmpty()) {
                    arrayList4.remove(arrayList5);
                }
            }
        }
        ArrayList arrayList6 = this.m;
        int v6 = arrayList6.size();
        while(true) {
            --v6;
            if(v6 < 0) {
                break;
            }
            ArrayList arrayList7 = (ArrayList)arrayList6.get(v6);
            int v7 = arrayList7.size();
            while(true) {
                --v7;
                if(v7 < 0) {
                    break;
                }
                uq uq3 = (uq)arrayList7.get(v7);
                uq3.a.setAlpha(1.0f);
                this.l(uq3);
                arrayList7.remove(v7);
                if(arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.o;
        int v8 = arrayList8.size();
        while(true) {
            --v8;
            if(v8 < 0) {
                break;
            }
            ArrayList arrayList9 = (ArrayList)arrayList8.get(v8);
            int v9 = arrayList9.size();
            while(true) {
                --v9;
                if(v9 < 0) {
                    break;
                }
                this.w(((fmxm)arrayList9.get(v9)));
                if(arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
            }
        }
        fmxo.k(this.c);
        fmxo.k(this.b);
        fmxo.k(this.a);
        fmxo.k(this.d);
        this.m();
    }

    @Override  // tr
    public final void d() {
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            uq uq0 = (uq)arrayList0.get(v2);
            ViewPropertyAnimator viewPropertyAnimator0 = uq0.a.animate();
            this.c.add(uq0);
            viewPropertyAnimator0.setDuration(this.i).alpha(0.0f).setListener(new fmxh(this, uq0, viewPropertyAnimator0, uq0.a)).start();
        }
        ArrayList arrayList1 = this.g;
        int v3 = arrayList1.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            fmxn fmxn0 = (fmxn)arrayList1.get(v4);
            uq uq1 = fmxn0.a;
            View view0 = uq1.a;
            int v5 = fmxn0.d - fmxn0.b;
            int v6 = fmxn0.e - fmxn0.c;
            if(v5 != 0) {
                view0.animate().translationX(0.0f);
            }
            if(v6 != 0) {
                view0.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimator1 = view0.animate();
            if(v5 != 0) {
                viewPropertyAnimator1.translationX(0.0f);
            }
            if(v6 != 0) {
                viewPropertyAnimator1.translationY(0.0f);
            }
            this.b.add(uq1);
            viewPropertyAnimator1.setDuration(0xFAL).setInterpolator(new lnt()).setListener(new fmxj(this, uq1, v5, view0, v6, viewPropertyAnimator1)).start();
        }
        ArrayList arrayList2 = this.l;
        int v7 = arrayList2.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            fmxm fmxm0 = (fmxm)arrayList2.get(v8);
            View view1 = null;
            View view2 = fmxm0.a == null ? null : fmxm0.a.a;
            uq uq2 = fmxm0.b;
            if(uq2 != null) {
                view1 = uq2.a;
            }
            if(view2 != null) {
                ViewPropertyAnimator viewPropertyAnimator2 = view2.animate().setDuration(0xFAL);
                this.d.add(fmxm0.a);
                viewPropertyAnimator2.translationX(((float)(fmxm0.e - fmxm0.c)));
                viewPropertyAnimator2.translationY(((float)(fmxm0.f - fmxm0.d)));
                viewPropertyAnimator2.alpha(0.0f).setListener(new fmxk(this, fmxm0, viewPropertyAnimator2, view2)).start();
            }
            if(view1 != null) {
                ViewPropertyAnimator viewPropertyAnimator3 = view1.animate();
                this.d.add(fmxm0.b);
                viewPropertyAnimator3.translationX(0.0f).translationY(0.0f).setDuration(0xFAL).alpha(1.0f).setListener(new fmxl(this, fmxm0, viewPropertyAnimator3, view1)).start();
            }
        }
        ArrayList arrayList3 = this.f;
        int v9 = arrayList3.size();
        for(int v1 = 0; v1 < v9; ++v1) {
            uq uq3 = (uq)arrayList3.get(v1);
            ViewPropertyAnimator viewPropertyAnimator4 = uq3.a.animate();
            this.a.add(uq3);
            viewPropertyAnimator4.setInterpolator(new lnt()).translationX(0.0f).translationY(0.0f).setDuration(this.h).setListener(new fmxi(this, uq3, uq3.a, viewPropertyAnimator4)).start();
        }
        arrayList0.clear();
        arrayList1.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    @Override  // vl
    public final boolean e(uq uq0) {
        this.b(uq0);
        if(this.y(uq0)) {
            return false;
        }
        View view0 = uq0.a;
        view0.setTranslationY(((float)view0.getHeight()));
        if((view0 instanceof fmvz)) {
            view0.setTranslationX(((float)(-this.p)));
        }
        this.f.add(uq0);
        return true;
    }

    @Override  // vl
    public final boolean f(uq uq0, uq uq1, int v, int v1, int v2, int v3) {
        if(uq0 == uq1) {
            return this.g(uq0, v, v1, v2, v3);
        }
        float f = uq0.a.getTranslationX();
        float f1 = uq0.a.getTranslationY();
        float f2 = uq0.a.getAlpha();
        this.b(uq0);
        uq0.a.setTranslationX(f);
        uq0.a.setTranslationY(f1);
        uq0.a.setAlpha(f2);
        if(uq1 != null) {
            this.b(uq1);
            uq1.a.setTranslationX(((float)(-((int)(((float)(v2 - v)) - f)))));
            uq1.a.setTranslationY(((float)(-((int)(((float)(v3 - v1)) - f1)))));
            uq1.a.setAlpha(0.0f);
        }
        fmxm fmxm0 = new fmxm(uq0, uq1, v, v1, v2, v3);
        this.l.add(fmxm0);
        return true;
    }

    @Override  // vl
    public final boolean g(uq uq0, int v, int v1, int v2, int v3) {
        int v4 = 0;
        if(this.y(uq0)) {
            return false;
        }
        View view0 = uq0.a;
        int v5 = v + ((int)view0.getTranslationX());
        int v6 = v1 + ((int)view0.getTranslationY());
        this.b(uq0);
        int v7 = v2 - v5;
        int v8 = v3 - v6;
        if(v7 != 0) {
            v4 = v7;
        }
        else if(v8 == 0) {
            this.l(uq0);
            return false;
        }
        if(v4 != 0) {
            view0.setTranslationX(((float)(-v4)));
        }
        if(v8 != 0) {
            view0.setTranslationY(((float)(-v8)));
        }
        fmxn fmxn0 = new fmxn(uq0, v5, v6, v2, v3);
        this.g.add(fmxn0);
        return true;
    }

    @Override  // tr
    public final boolean h(uq uq0, List list0) {
        return !list0.isEmpty() || this.r(uq0);
    }

    @Override  // tr
    public final boolean i() {
        return !this.f.isEmpty() || !this.l.isEmpty() || !this.g.isEmpty() || !this.e.isEmpty() || !this.b.isEmpty() || !this.c.isEmpty() || !this.a.isEmpty() || !this.d.isEmpty() || !this.n.isEmpty() || !this.m.isEmpty() || !this.o.isEmpty();
    }

    @Override  // vl
    public final void j(uq uq0) {
        this.b(uq0);
        this.e.add(uq0);
    }

    static final void k(List list0) {
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            try {
                ((uq)list0.get(v)).a.animate().cancel();
            }
            catch(IndexOutOfBoundsException unused_ex) {
            }
        }
    }

    @Override  // vl
    public final boolean q(uq uq0, tq tq0, tq tq1) {
        int v = tq0.a;
        int v1 = tq1.a;
        if(v == v1 && tq0.b == tq1.b) {
            this.l(uq0);
            return false;
        }
        return this.g(uq0, v, tq0.b, v1, tq1.b);
    }

    private final void v(List list0, uq uq0) {
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            fmxm fmxm0 = (fmxm)list0.get(v);
            if(this.x(fmxm0, uq0) && fmxm0.a == null && fmxm0.b == null) {
                list0.remove(fmxm0);
            }
        }
    }

    private final void w(fmxm fmxm0) {
        uq uq0 = fmxm0.a;
        if(uq0 != null) {
            this.x(fmxm0, uq0);
        }
        uq uq1 = fmxm0.b;
        if(uq1 != null) {
            this.x(fmxm0, uq1);
        }
    }

    private final boolean x(fmxm fmxm0, uq uq0) {
        if(fmxm0.b == uq0) {
            fmxm0.b = null;
            goto label_5;
        }
        if(fmxm0.a == uq0) {
            fmxm0.a = null;
        label_5:
            uq0.a.setAlpha(1.0f);
            uq0.a.setTranslationX(0.0f);
            uq0.a.setTranslationY(0.0f);
            this.l(uq0);
            return true;
        }
        return false;
    }

    private final boolean y(uq uq0) {
        flba.a();
        if(System.currentTimeMillis() - this.q < 1000L) {
            this.l(uq0);
            return true;
        }
        return false;
    }
}

