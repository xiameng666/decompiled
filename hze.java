import android.graphics.Rect;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

public final class hze extends kfx implements View.OnAttachStateChangeListener, Runnable, keg {
    public final bzk a;
    public final SnapshotStateList b;
    public final gtl c;
    public final bzd d;
    private boolean f;
    private int g;
    private kgq h;

    public hze() {
        super(1);
        bzk bzk0 = new bzk(9);
        idd idd0 = new idd("caption bar");
        bzk0.k(icz.a, idd0);
        idd idd1 = new idd("display cutout");
        bzk0.k(icz.b, idd1);
        idd idd2 = new idd("ime");
        bzk0.k(icz.c, idd2);
        idd idd3 = new idd("mandatory system gestures");
        bzk0.k(icz.d, idd3);
        idd idd4 = new idd("navigation bars");
        bzk0.k(icz.e, idd4);
        idd idd5 = new idd("status bars");
        bzk0.k(icz.f, idd5);
        idd idd6 = new idd("system gestures");
        bzk0.k(icz.g, idd6);
        idd idd7 = new idd("tappable element");
        bzk0.k(icz.h, idd7);
        idd idd8 = new idd("waterfall");
        bzk0.k(icz.i, idd8);
        this.a = bzk0;
        this.c = new ParcelableSnapshotMutableIntState(0);
        this.d = new bzd(4);
        this.b = new SnapshotStateList();
    }

    @Override  // kfx
    public final kfw b(kga kga0, kfw kfw0) {
        kgq kgq0 = this.h;
        this.f = false;
        this.h = null;
        if(kga0.d() > 0L && kgq0 != null) {
            int v = kga0.c();
            this.g |= v;
            ida ida0 = (ida)idc.a.a(v);
            if(ida0 != null) {
                Object object0 = this.a.a(ida0);
                ibuq.c(object0);
                jxn jxn0 = kgq0.f(v);
                long v1 = ((idd)object0).c;
                long v2 = ((long)jxn0.e) | (((long)jxn0.d) << 16 | (((long)jxn0.b) << 0x30 | ((long)jxn0.c) << 0x20));
                if(!icu.a(v2, v1)) {
                    ((idd)object0).e = v1;
                    ((idd)object0).f = v2;
                    ((idd)object0).b(true);
                    hze.g(((idd)object0), kga0);
                    int v3 = this.c.e() + 1;
                    this.c.i(v3);
                    hbl.e();
                }
            }
        }
        return kfw0;
    }

    @Override  // kfx
    public final kgq c(kgq kgq0, List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            kga kga0 = (kga)list0.get(v1);
            int v2 = kga0.c();
            ida ida0 = (ida)idc.a.a(v2);
            if(ida0 != null) {
                Object object0 = this.a.a(ida0);
                ibuq.c(object0);
                idd idd0 = (idd)object0;
                if(idd0.f()) {
                    hze.g(idd0, kga0);
                }
            }
        }
        this.f(kgq0);
        return kgq0;
    }

    @Override  // kfx
    public final void d(kga kga0) {
        this.f = false;
        int v = kga0.c();
        this.g &= ~v;
        this.h = null;
        ida ida0 = (ida)idc.a.a(v);
        if(ida0 != null) {
            Object object0 = this.a.a(ida0);
            ibuq.c(object0);
            ((idd)object0).d(0.0f);
            ((idd)object0).a(1.0f);
            ((idd)object0).c(0L);
            ((idd)object0).d(0.0f);
            ((idd)object0).b(false);
            ((idd)object0).e = -1L;
            ((idd)object0).f = -1L;
            int v1 = this.c.e() + 1;
            this.c.i(v1);
            hbl.e();
        }
    }

    @Override  // kfx
    public final void e(kga kga0) {
        this.f = true;
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        if(this.f) {
            this.h = kgq0;
            return kgq0;
        }
        if(this.g == 0) {
            this.f(kgq0);
        }
        return kgq0;
    }

    private final void f(kgq kgq0) {
        long v10;
        Object[] arr_object2;
        int[] arr_v5;
        long[] arr_v4;
        long v8;
        Object[] arr_object1;
        int[] arr_v3;
        long[] arr_v2;
        boolean z1;
        boolean z;
        int[] arr_v = idc.a.b;
        Object[] arr_object = idc.a.c;
        long[] arr_v1 = idc.a.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            z = false;
            z1 = false;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v4 = arr_v1;
                    arr_v5 = arr_v;
                    arr_object2 = arr_object;
                    goto label_65;
                }
                int v3 = 0;
                while(true) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    if(v3 >= v4) {
                        break;
                    }
                    if((v2 & 0xFFL) < 0x80L) {
                        int v5 = (v1 << 3) + v3;
                        int v6 = arr_v[v5];
                        ida ida0 = (ida)arr_object[v5];
                        jxn jxn0 = kgq0.f(v6);
                        arr_v2 = arr_v1;
                        arr_v3 = arr_v;
                        Object object0 = this.a.a(ida0);
                        ibuq.c(object0);
                        idd idd0 = (idd)object0;
                        arr_object1 = arr_object;
                        long v7 = ((long)jxn0.b) << 0x30 | ((long)jxn0.c) << 0x20 | ((long)jxn0.d) << 16 | ((long)jxn0.e);
                        if(!icu.a(v7, idd0.c)) {
                            idd0.c = v7;
                            if(icu.a(v7, 0L)) {
                                z = true;
                            }
                            else {
                                z = true;
                                z1 = true;
                            }
                        }
                        if(v6 == 8) {
                            v8 = v2;
                        }
                        else {
                            jxn jxn1 = kgq0.g(v6);
                            v8 = v2;
                            long v9 = ((long)jxn1.e) | (((long)jxn1.b) << 0x30 | ((long)jxn1.c) << 0x20 | ((long)jxn1.d) << 16);
                            if(!icu.a(idd0.d, v9)) {
                                idd0.d = v9;
                                if(icu.a(v9, 0L)) {
                                    z = true;
                                }
                                else {
                                    z = true;
                                    z1 = true;
                                }
                            }
                        }
                        idd0.e(kgq0.x(v6));
                    }
                    else {
                        arr_v2 = arr_v1;
                        arr_v3 = arr_v;
                        arr_object1 = arr_object;
                        v8 = v2;
                    }
                    v2 = v8 >> 8;
                    ++v3;
                    arr_v1 = arr_v2;
                    arr_v = arr_v3;
                    arr_object = arr_object1;
                }
                arr_v4 = arr_v1;
                arr_v5 = arr_v;
                arr_object2 = arr_object;
                if(v4 == 8) {
                label_65:
                    if(v1 != v) {
                        ++v1;
                        arr_v1 = arr_v4;
                        arr_v = arr_v5;
                        arr_object = arr_object2;
                        continue;
                    }
                }
                else {
                    break;
                }
                break;
            }
        }
        else {
            z = false;
            z1 = false;
        }
        kdp kdp0 = kgq0.l();
        if(kdp0 == null) {
            v10 = 0L;
        }
        else {
            jxn jxn2 = kdp0.a();
            v10 = ((long)jxn2.b) << 0x30 | ((long)jxn2.c) << 0x20 | ((long)jxn2.d) << 16 | ((long)jxn2.e);
        }
        Object object1 = this.a.a(icz.i);
        ibuq.c(object1);
        ((idd)object1).e(((boolean)(icu.a(v10, 0L) ^ 1)));
        if(!icu.a(((idd)object1).c, v10)) {
            ((idd)object1).c = v10;
            ((idd)object1).d = v10;
            if(icu.a(v10, 0L)) {
                z = true;
            }
            else {
                z = true;
                z1 = true;
            }
        }
        if(kdp0 == null) {
            bzd bzd0 = this.d;
            if(bzd0.b > 0) {
                bzd0.k();
                this.b.clear();
                z = true;
            }
        }
        else {
            List list0 = kdp0.a.getBoundingRects();
            bzd bzd1 = this.d;
            if(list0.size() < bzd1.b) {
                bzd1.l(list0.size(), bzd1.b);
                int v11 = this.b.a();
                this.b.e(list0.size(), v11);
                z = true;
            }
            else {
                int v12 = list0.size() - bzd1.b;
                int v13 = 0;
                while(v13 < v12) {
                    bzd1.p(new ParcelableSnapshotMutableState(list0.get(bzd1.b), gul.a));
                    this.b.add(new ibu("display cutout rect " + bzd1.b));
                    ++v13;
                    z = true;
                }
            }
            int v14 = list0.size();
            for(int v15 = 0; v15 < v14; ++v15) {
                Rect rect0 = (Rect)list0.get(v15);
                gra gra0 = (gra)bzd1.c(v15);
                if(!ibuq.m(gra0.a(), rect0)) {
                    gra0.b(rect0);
                    z = true;
                }
            }
            if(!list0.isEmpty()) {
                z1 = true;
            }
        }
        if((z1 || this.c.e() != 0) && z) {
            int v16 = this.c.e() + 1;
            this.c.i(v16);
            hbl.e();
        }
    }

    private static final void g(idd idd0, kga kga0) {
        idd0.d(kga0.b());
        idd0.a(kga0.a());
        idd0.c(kga0.d());
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        ViewParent viewParent0 = view0.getParent();
        View view1 = (viewParent0 instanceof View) ? ((View)viewParent0) : null;
        if(view1 != null) {
            view0 = view1;
        }
        kex.b(view0, this);
        kfz.a(view0, this);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        ViewParent viewParent0 = view0.getParent();
        View view1 = (viewParent0 instanceof View) ? ((View)viewParent0) : null;
        if(view1 != null) {
            view0 = view1;
        }
        kex.b(view0, null);
        kfz.a(view0, null);
    }

    @Override
    public final void run() {
        if(this.f) {
            this.g = 0;
            this.f = false;
            kgq kgq0 = this.h;
            if(kgq0 != null) {
                this.f(kgq0);
                this.h = null;
            }
        }
    }
}

