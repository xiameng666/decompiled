import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

public class re extends vl {
    final ArrayList a;
    final ArrayList b;
    final ArrayList c;
    final ArrayList d;
    final ArrayList e;
    final ArrayList f;
    final ArrayList g;
    private static TimeInterpolator l;
    private final ArrayList m;
    private final ArrayList n;
    private final ArrayList o;
    private final ArrayList p;

    public re() {
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
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
        ArrayList arrayList0 = this.o;
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(((rd)arrayList0.get(v)).a == uq0) {
                view0.setTranslationY(0.0f);
                view0.setTranslationX(0.0f);
                this.l(uq0);
                arrayList0.remove(v);
            }
        }
        this.v(this.p, uq0);
        if(this.m.remove(uq0)) {
            view0.setAlpha(1.0f);
            this.l(uq0);
        }
        if(this.n.remove(uq0)) {
            view0.setAlpha(1.0f);
            this.l(uq0);
        }
        ArrayList arrayList1 = this.c;
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
        ArrayList arrayList3 = this.b;
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
            while(((rd)arrayList4.get(v3)).a != uq0);
            view0.setTranslationY(0.0f);
            view0.setTranslationX(0.0f);
            this.l(uq0);
            arrayList4.remove(v3);
            if(arrayList4.isEmpty()) {
                arrayList3.remove(v2);
            }
        }
        ArrayList arrayList5 = this.a;
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
        this.f.remove(uq0);
        this.d.remove(uq0);
        this.g.remove(uq0);
        this.e.remove(uq0);
        this.a();
    }

    @Override  // tr
    public final void c() {
        ArrayList arrayList0 = this.o;
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            uq uq0 = ((rd)arrayList0.get(v)).a;
            uq0.a.setTranslationY(0.0f);
            uq0.a.setTranslationX(0.0f);
            this.l(uq0);
            arrayList0.remove(v);
        }
        ArrayList arrayList1 = this.m;
        int v1 = arrayList1.size();
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            this.l(((uq)arrayList1.get(v1)));
            arrayList1.remove(v1);
        }
        ArrayList arrayList2 = this.n;
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
        ArrayList arrayList3 = this.p;
        int v3 = arrayList3.size();
        while(true) {
            --v3;
            if(v3 < 0) {
                break;
            }
            this.w(((rc)arrayList3.get(v3)));
        }
        arrayList3.clear();
        if(!this.i()) {
            return;
        }
        ArrayList arrayList4 = this.b;
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
                uq uq2 = ((rd)arrayList5.get(v5)).a;
                uq2.a.setTranslationY(0.0f);
                uq2.a.setTranslationX(0.0f);
                this.l(uq2);
                arrayList5.remove(v5);
                if(arrayList5.isEmpty()) {
                    arrayList4.remove(arrayList5);
                }
            }
        }
        ArrayList arrayList6 = this.a;
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
        ArrayList arrayList8 = this.c;
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
                this.w(((rc)arrayList9.get(v9)));
                if(arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
            }
        }
        re.k(this.f);
        re.k(this.e);
        re.k(this.d);
        re.k(this.g);
        this.m();
    }

    @Override  // tr
    public final void d() {
        int v3;
        int v2;
        ArrayList arrayList0 = this.m;
        boolean z = arrayList0.isEmpty();
        ArrayList arrayList1 = this.o;
        boolean z1 = arrayList1.isEmpty();
        ArrayList arrayList2 = this.p;
        int v = arrayList2.isEmpty();
        int v1 = v ^ 1;
        ArrayList arrayList3 = this.n;
        boolean z2 = arrayList3.isEmpty();
        if(!z || !z1 || !z2) {
            v2 = arrayList0.size();
            v3 = 0;
        label_17:
            while(v3 < v2) {
                uq uq0 = (uq)arrayList0.get(v3);
                ViewPropertyAnimator viewPropertyAnimator0 = uq0.a.animate();
                this.f.add(uq0);
                viewPropertyAnimator0.setDuration(this.i).alpha(0.0f).setListener(new qx(this, uq0, viewPropertyAnimator0, uq0.a)).start();
                ++v3;
            }
            arrayList0.clear();
            if(!z1) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(arrayList1);
                this.b.add(arrayList4);
                arrayList1.clear();
                qu qu0 = new qu(this, arrayList4);
                if(z) {
                    qu0.run();
                }
                else {
                    ((rd)arrayList4.get(0)).a.a.postOnAnimationDelayed(qu0, this.i);
                }
            }
            if(v1 != 0) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.c.add(arrayList5);
                arrayList2.clear();
                qv qv0 = new qv(this, arrayList5);
                if(z) {
                    qv0.run();
                }
                else {
                    ((rc)arrayList5.get(0)).a.a.postOnAnimationDelayed(qv0, this.i);
                }
            }
            if(!z2) {
                long v4 = 0L;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.a.add(arrayList6);
                arrayList3.clear();
                qw qw0 = new qw(this, arrayList6);
                if(z && z1 && v1 == 0) {
                    qw0.run();
                    return;
                }
                long v5 = z ? 0L : this.i;
                if(v1 != 0) {
                    v4 = 0xFAL;
                }
                ((uq)arrayList6.get(0)).a.postOnAnimationDelayed(qw0, v5 + Math.max((z1 ? 0L : 0xFAL), v4));
            }
        }
        else if(v == 0) {
            v1 = 1;
            v2 = arrayList0.size();
            v3 = 0;
            goto label_17;
        }
    }

    @Override  // vl
    public final boolean e(uq uq0) {
        this.x(uq0);
        uq0.a.setAlpha(0.0f);
        this.n.add(uq0);
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
        this.x(uq0);
        uq0.a.setTranslationX(f);
        uq0.a.setTranslationY(f1);
        uq0.a.setAlpha(f2);
        if(uq1 != null) {
            this.x(uq1);
            uq1.a.setTranslationX(((float)(-((int)(((float)(v2 - v)) - f)))));
            uq1.a.setTranslationY(((float)(-((int)(((float)(v3 - v1)) - f1)))));
            uq1.a.setAlpha(0.0f);
        }
        rc rc0 = new rc(uq0, uq1, v, v1, v2, v3);
        this.p.add(rc0);
        return true;
    }

    @Override  // vl
    public final boolean g(uq uq0, int v, int v1, int v2, int v3) {
        View view0 = uq0.a;
        int v4 = (int)view0.getTranslationX();
        int v5 = (int)view0.getTranslationY();
        this.x(uq0);
        int v6 = v + v4;
        int v7 = v2 - v6;
        int v8 = v1 + v5;
        int v9 = v3 - v8;
        if(v7 == 0 && v9 == 0) {
            this.l(uq0);
            return false;
        }
        if(v7 != 0) {
            view0.setTranslationX(((float)(-v7)));
        }
        if(v9 != 0) {
            view0.setTranslationY(((float)(-v9)));
        }
        rd rd0 = new rd(uq0, v6, v8, v2, v3);
        this.o.add(rd0);
        return true;
    }

    @Override  // tr
    public final boolean h(uq uq0, List list0) {
        return !list0.isEmpty() || this.r(uq0);
    }

    @Override  // tr
    public final boolean i() {
        return !this.n.isEmpty() || !this.p.isEmpty() || !this.o.isEmpty() || !this.m.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.d.isEmpty() || !this.g.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    @Override  // vl
    public final void j(uq uq0) {
        this.x(uq0);
        this.m.add(uq0);
    }

    static final void k(List list0) {
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            ((uq)list0.get(v)).a.animate().cancel();
        }
    }

    private final void v(List list0, uq uq0) {
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            rc rc0 = (rc)list0.get(v);
            if(this.y(rc0, uq0) && rc0.a == null && rc0.b == null) {
                list0.remove(rc0);
            }
        }
    }

    private final void w(rc rc0) {
        uq uq0 = rc0.a;
        if(uq0 != null) {
            this.y(rc0, uq0);
        }
        uq uq1 = rc0.b;
        if(uq1 != null) {
            this.y(rc0, uq1);
        }
    }

    private final void x(uq uq0) {
        if(re.l == null) {
            re.l = new ValueAnimator().getInterpolator();
        }
        uq0.a.animate().setInterpolator(re.l);
        this.b(uq0);
    }

    private final boolean y(rc rc0, uq uq0) {
        if(rc0.b == uq0) {
            rc0.b = null;
            goto label_5;
        }
        if(rc0.a == uq0) {
            rc0.a = null;
        label_5:
            uq0.a.setAlpha(1.0f);
            uq0.a.setTranslationX(0.0f);
            uq0.a.setTranslationY(0.0f);
            this.l(uq0);
            return true;
        }
        return false;
    }
}

