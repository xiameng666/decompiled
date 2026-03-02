import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.List;

public final class idx extends hfb implements hhd, hid, hiv, hja, idm, iew, iey, ifi, ifk, iip, iiz, ijc, ije {
    public hfa a;
    public boolean b;
    public final HashSet c;
    public hzk d;
    private ide e;

    public idx(hfa hfa0) {
        this.s = iia.a(hfa0);
        this.a = hfa0;
        this.b = true;
        this.c = new HashSet();
    }

    @Override  // iip
    public final boolean A() {
        return this.B;
    }

    @Override  // ijc
    public final boolean B() {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        hws hws0 = (hws)hfa0;
        return true;
    }

    @Override  // ijc
    public final void E() {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        hws hws0 = (hws)hfa0;
    }

    @Override  // iiz
    public final Object a(Object object0) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        Object object1 = (ibm)hfa0;
        ((ibm)object1).d();
        return object1;
    }

    @Override  // ifk
    public final iav b(iax iax0, ias ias0, long v) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((hzr)hfa0).h(iax0, ias0, v);
    }

    @Override  // hiv
    public final void c(hir hir0) {
        hfa hfa0 = this.a;
        if(!(hfa0 instanceof hii)) {
            hxt.d("applyFocusProperties called on wrong node");
        }
        ((hii)hfa0).d();
    }

    @Override  // hfb
    public final void dH() {
        if((this.a instanceof hws)) {
            this.n();
        }
    }

    @Override  // ije
    public final void dJ(ivj ivj0) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        ity ity0 = ((iub)hfa0).f();
        ibuq.d(ivj0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if(ity0.a) {
            ((ity)ivj0).a = true;
        }
        if(ity0.b) {
            ((ity)ivj0).b = true;
        }
        Object[] arr_object = ity0.c.b;
        Object[] arr_object1 = ity0.c.c;
        long[] arr_v = ity0.c.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            Object object0 = arr_object[v5];
                            Object object1 = arr_object1[v5];
                            ivi ivi0 = (ivi)object0;
                            bzk bzk0 = ((ity)ivj0).c;
                            if(!bzk0.b(ivi0)) {
                                bzk0.k(ivi0, object1);
                            }
                            else if((object1 instanceof itj)) {
                                Object object2 = bzk0.a(ivi0);
                                ibuq.d(object2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                String s = ((itj)object2).a;
                                if(s == null) {
                                    s = ((itj)object1).a;
                                }
                                ibnk ibnk0 = ((itj)object2).b;
                                if(ibnk0 == null) {
                                    ibnk0 = ((itj)object1).b;
                                }
                                bzk0.k(ivi0, new itj(s, ibnk0));
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_42;
                    }
                    break;
                }
            label_42:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @Override  // iey
    public final void dN(hzk hzk0) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        if(!((drp)hfa0).a) {
            ((drp)hfa0).a = true;
            List list0 = ((drp)hfa0).b;
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((ibrl)list0.get(v1)).w(ibom.a);
            }
            list0.clear();
        }
    }

    @Override  // hfb
    public final void dO() {
        this.t(true);
    }

    @Override  // ijc
    public final long dQ() {
        return ijk.a;
    }

    @Override  // hfb
    public final void dR() {
        this.u();
    }

    @Override  // iew
    public final void dU() {
        this.b = true;
        iex.a(this);
    }

    @Override  // ifi
    public final void dV(hzk hzk0) {
        this.d = hzk0;
        hfa hfa0 = this.a;
        if((hfa0 instanceof ibh)) {
            ((ibh)hfa0).d();
        }
    }

    @Override  // iew
    public final void dW(igb igb0) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        if(this.b && (hfa0 instanceof hhk)) {
            hfa hfa1 = this.a;
            if((hfa1 instanceof hhk)) {
                iiy iiy0 = ((ili)ien.f(this)).z;
                idv idv0 = new idv(hfa1);
                iiy0.a.c(this, iea.a, idv0);
            }
            this.b = false;
        }
        ((hhl)hfa0).d(igb0);
    }

    @Override  // ifk
    public final int e(hzg hzg0, hzf hzf0, int v) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((hzr)hfa0).d(hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int f(hzg hzg0, hzf hzf0, int v) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((hzr)hfa0).e(hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int g(hzg hzg0, hzf hzf0, int v) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((hzr)hfa0).f(hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int h(hzg hzg0, hzf hzf0, int v) {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((hzr)hfa0).g(hzg0, hzf0, v);
    }

    @Override  // ifi
    public final void i(long v) {
        hfa hfa0 = this.a;
        if((hfa0 instanceof ibi)) {
            ((ibi)hfa0).d();
        }
    }

    @Override  // hhd
    public final long j() {
        return jll.b(ien.e(this, 0x80).c);
    }

    @Override  // hhd
    public final jks k() {
        return ien.d(this).q;
    }

    @Override  // idm
    public final idk l() {
        idk idk0 = this.e;
        return idk0 != null ? idk0 : idf.a;
    }

    @Override  // ijc
    public final void n() {
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        hwm hwm0 = ((hws)hfa0).c;
        if(hwm0.d == 2) {
            long v = SystemClock.uptimeMillis();
            hwq hwq0 = new hwq(hwm0.c);
            MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
            motionEvent0.setSource(0);
            hwq0.a(motionEvent0);
            motionEvent0.recycle();
            hwm0.b();
        }
    }

    @Override  // hid
    public final void o(hje hje0) {
        hfa hfa0 = this.a;
        if(!(hfa0 instanceof hic)) {
            hxt.d("onFocusEvent called on wrong node");
        }
        ((hic)hfa0).d();
    }

    @Override  // ijc
    public final void q(hvt hvt0, hvv hvv0, long v) {
        boolean z2;
        boolean z1;
        boolean z = true;
        hfa hfa0 = this.a;
        ibuq.d(hfa0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        hwm hwm0 = ((hws)hfa0).c;
        List list0 = hvt0.a;
        int v1 = list0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            hwe hwe0 = (hwe)list0.get(v3);
            if(hvu.d(hwe0) || hvu.f(hwe0)) {
                z = false;
                break;
            }
        }
        if(z) {
            z1 = true;
            int v4 = list0.size();
            int v5 = 0;
            while(true) {
                if(v5 >= v4) {
                    goto label_23;
                }
                if(((hwe)list0.get(v5)).c()) {
                    break;
                }
                ++v5;
            }
        }
        z1 = false;
    label_23:
        hws hws0 = hwm0.c;
        if(hws0.b) {
            z2 = true;
        }
        else {
            int v6 = list0.size();
            int v7 = 0;
            while(v7 < v6) {
                hwe hwe1 = (hwe)list0.get(v7);
                if(!hvu.d(hwe1) && !hvu.f(hwe1)) {
                    ++v7;
                    continue;
                }
                z2 = true;
                goto label_40;
            }
            z2 = z1;
        }
    label_40:
        if(hwm0.d != 3) {
            if(hvv0 == hvv.a && z2) {
                hwm0.b = hvt0;
                hwm0.a(hvt0, !z || hws0.b);
            }
            if(hvv0 == hvv.b && z && ibuq.m(hvt0, hwm0.b) && hws0.b) {
                int v8 = list0.size();
                for(int v9 = 0; v9 < v8; ++v9) {
                    ((hwe)list0.get(v9)).b();
                }
            }
            if(hvv0 == hvv.c && !z2 && !ibuq.m(hvt0, hwm0.b)) {
                hwm0.a(hvt0, true);
            }
        }
        if(hvv0 == hvv.c) {
            int v10 = list0.size();
            for(int v11 = 0; true; ++v11) {
                if(v11 >= v10) {
                    hwm0.b();
                    break;
                }
                if(!hvu.f(((hwe)list0.get(v11)))) {
                    break;
                }
            }
            if(ibuq.m(hvt0, hwm0.b) && z) {
                int v12 = list0.size();
                int v13 = 0;
                while(v13 < v12) {
                    if(!((hwe)list0.get(v13)).c()) {
                        ++v13;
                        continue;
                    }
                    else if(!hws0.b) {
                        hwm0.c(hvt0);
                        return;
                    }
                    break;
                }
                int v14 = list0.size();
                for(int v2 = 0; v2 < v14; ++v2) {
                    ((hwe)list0.get(v2)).b();
                }
            }
        }
    }

    @Override  // ijc
    public final void r() {
        ijb.b(this);
    }

    @Override  // hhd
    public final jlm s() {
        return ien.d(this).r;
    }

    public final void t(boolean z) {
        if(!this.B) {
            hxt.d("initializeModifier called on unattached node");
        }
        hfa hfa0 = this.a;
        if((this.s & 0x20) != 0) {
            if((hfa0 instanceof idh)) {
                this.Q(new idt(this));
            }
            if((hfa0 instanceof ido)) {
                ide ide0 = this.e;
                if(ide0 != null && ide0.c(((ido)hfa0).e())) {
                    ide0.a = (ido)hfa0;
                    idj idj0 = ((ili)ien.f(this)).J;
                    idg idg0 = ((ido)hfa0).e();
                    idj0.a.n(this);
                    idj0.b.n(idg0);
                    idj0.a();
                }
                else {
                    this.e = new ide(((ido)hfa0));
                    if(iea.a(this)) {
                        idj idj1 = ((ili)ien.f(this)).J;
                        idg idg1 = ((ido)hfa0).e();
                        idj1.a.n(this);
                        idj1.b.n(idg1);
                        idj1.a();
                    }
                }
            }
        }
        if((this.s & 4) != 0) {
            if((hfa0 instanceof hhk)) {
                this.b = true;
            }
            if(!z) {
                ifp.a(this);
            }
        }
        if((this.s & 2) != 0) {
            if(iea.a(this)) {
                ihy ihy0 = this.x;
                ibuq.c(ihy0);
                ((ifn)ihy0).H(this);
                ihy0.ap();
            }
            if(!z) {
                ifp.a(this);
                ien.d(this).L();
            }
        }
        if((hfa0 instanceof ibv)) {
            ((ibv)hfa0).d(ien.d(this));
        }
        if((this.s & 0x80) != 0) {
            if((hfa0 instanceof ibi) && iea.a(this)) {
                ien.d(this).L();
            }
            if((hfa0 instanceof ibh)) {
                this.d = null;
                if(iea.a(this)) {
                    iio iio0 = ien.f(this);
                    idu idu0 = new idu(this);
                    ((ili)iio0).A.f.n(idu0);
                    ili.L(((ili)iio0));
                }
            }
        }
        if((this.s & 0x100) != 0 && (hfa0 instanceof drp) && iea.a(this)) {
            ien.d(this).L();
        }
        if((hfa0 instanceof hiy)) {
            ((hiy)hfa0).d().d.n(this);
        }
        int v = this.s;
        if((v & 16) != 0 && (hfa0 instanceof hws)) {
            ((hws)hfa0).c.a = this.x;
        }
        if((v & 8) != 0) {
            ien.f(this).u();
        }
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    public final void u() {
        if(!this.B) {
            hxt.d("unInitializeModifier called on unattached node");
        }
        hfa hfa0 = this.a;
        if((this.s & 0x20) != 0) {
            if((hfa0 instanceof ido)) {
                idj idj0 = ((ili)ien.f(this)).J;
                idg idg0 = ((ido)hfa0).e();
                ify ify0 = ien.d(this);
                idj0.c.n(ify0);
                idj0.d.n(idg0);
                idj0.a();
            }
            if((hfa0 instanceof idh)) {
                ((idh)hfa0).d();
            }
        }
        if((this.s & 8) != 0) {
            ien.f(this).u();
        }
        if((hfa0 instanceof hiy)) {
            ((hiy)hfa0).d().d.m(this);
        }
    }

    @Override  // ije
    public final boolean w() {
        return false;
    }

    @Override  // ije
    public final boolean x() {
        return false;
    }

    @Override  // ije
    public final boolean y() {
        return true;
    }

    public final void z() {
        if(this.B) {
            this.c.clear();
            iiy iiy0 = ((ili)ien.f(this)).z;
            idw idw0 = new idw(this);
            iiy0.a.c(this, iea.b, idw0);
        }
    }
}

