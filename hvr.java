import java.util.ArrayList;
import java.util.List;

public final class hvr extends hvs {
    public final hfb a;
    public final hxm b;
    public boolean c;
    private final byi f;
    private hzk g;
    private hvt h;
    private boolean i;
    private boolean j;

    public hvr(hfb hfb0) {
        this.a = hfb0;
        this.b = new hxm();
        this.f = new byi(2);
        this.c = true;
        this.j = true;
    }

    public final void a() {
        Object[] arr_object = this.d.a;
        int v = this.d.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ((hvr)arr_object[v1]).a();
        }
        hfb hfb0 = this.a;
        gwq gwq0 = null;
        while(hfb0 != null) {
            if((hfb0 instanceof ijc)) {
                ((ijc)hfb0).n();
            }
            else if((hfb0.s & 16) != 0 && (hfb0 instanceof iep)) {
                hfb hfb1 = ((iep)hfb0).D;
                int v2 = 0;
                while(hfb1 != null) {
                    if((hfb1.s & 16) != 0) {
                        ++v2;
                        if(v2 == 1) {
                            hfb0 = hfb1;
                        }
                        else {
                            if(gwq0 == null) {
                                gwq0 = new gwq(new hfb[16]);
                            }
                            if(hfb0 != null) {
                                gwq0.n(hfb0);
                            }
                            gwq0.n(hfb1);
                            hfb0 = null;
                        }
                    }
                    hfb1 = hfb1.v;
                }
                if(v2 != 1) {
                    goto label_31;
                }
                continue;
            }
        label_31:
            hfb0 = ien.a(gwq0);
        }
    }

    @Override  // hvs
    public final boolean b(byi byi0, hzk hzk0, hvo hvo0, boolean z) {
        hzk hzk1 = hzk0;
        boolean z1 = super.b(byi0, hzk0, hvo0, z);
        hfb hfb0 = this.a;
        if(hfb0.B) {
            gwq gwq0 = null;
            while(hfb0 != null) {
                if((hfb0 instanceof ijc)) {
                    this.g = ien.e(((ijc)hfb0), 16);
                }
                else if((hfb0.s & 16) != 0 && (hfb0 instanceof iep)) {
                    hfb hfb1 = ((iep)hfb0).D;
                    int v = 0;
                    while(hfb1 != null) {
                        if((hfb1.s & 16) != 0) {
                            ++v;
                            if(v == 1) {
                                hfb0 = hfb1;
                            }
                            else {
                                if(gwq0 == null) {
                                    gwq0 = new gwq(new hfb[16]);
                                }
                                if(hfb0 != null) {
                                    gwq0.n(hfb0);
                                }
                                gwq0.n(hfb1);
                                hfb0 = null;
                            }
                        }
                        hfb1 = hfb1.v;
                    }
                    if(v != 1) {
                        goto label_27;
                    }
                    continue;
                }
            label_27:
                hfb0 = ien.a(gwq0);
            }
            if(this.g != null) {
                int v1 = byi0.b();
                int v2 = 0;
                while(v2 < v1) {
                    long v3 = byi0.c(v2);
                    hwe hwe0 = (hwe)byi0.f(v2);
                    if(this.b.a(v3)) {
                        long v4 = hwe0.g;
                        long v5 = hwe0.c;
                        if(((v4 & 0x7FFFFFFF7FFFFFFFL) + 0x7FFFFF007FFFFFL & 0x8000000080000000L) == 0L && ((v5 & 0x7FFFFFFF7FFFFFFFL) + 0x7FFFFF007FFFFFL & 0x8000000080000000L) == 0L) {
                            ArrayList arrayList0 = new ArrayList(hwe0.a().size());
                            List list0 = hwe0.a();
                            boolean z2 = z1;
                            int v6 = list0.size();
                            int v7 = v1;
                            int v8 = 0;
                            while(v8 < v6) {
                                hvh hvh0 = (hvh)list0.get(v8);
                                long v9 = hvh0.b;
                                if(((v9 & 0x7FFFFFFF7FFFFFFFL) + 0x7FFFFF007FFFFFL & 0x8000000080000000L) == 0L) {
                                    long v10 = v3;
                                    int v11 = v8;
                                    hzk hzk2 = this.g;
                                    ibuq.c(hzk2);
                                    long v12 = hzk2.h(hzk1, v9);
                                    arrayList0.add(new hvh(hvh0.a, v12, hvh0.c));
                                }
                                else {
                                    v11 = v8;
                                    v10 = v3;
                                }
                                v8 = v11 + 1;
                                list0 = list0;
                                v6 = v6;
                                v2 = v2;
                                v3 = v10;
                            }
                            int v13 = v2;
                            byi byi1 = this.f;
                            hzk hzk3 = this.g;
                            ibuq.c(hzk3);
                            long v14 = hzk3.h(hzk1, v4);
                            hzk hzk4 = this.g;
                            ibuq.c(hzk4);
                            long v15 = hzk4.h(hzk1, v5);
                            hwe hwe1 = new hwe(hwe0.a, hwe0.b, v15, hwe0.d, hwe0.e, hwe0.f, v14, hwe0.h, hwe0.i, arrayList0, hwe0.j, hwe0.k);
                            hwe1.l = hwe0.l == null ? hwe0 : hwe0.l;
                            hwe hwe2 = hwe0.l;
                            if(hwe2 != null) {
                                hwe0 = hwe2;
                            }
                            hwe1.l = hwe0;
                            byi1.h(v3, hwe1);
                        }
                        else {
                            z2 = z1;
                            v7 = v1;
                            v13 = v2;
                        }
                    }
                    else {
                        z2 = z1;
                        v7 = v1;
                        v13 = v2;
                    }
                    v2 = v13 + 1;
                    hzk1 = hzk0;
                    z1 = z2;
                    v1 = v7;
                }
                byi byi2 = this.f;
                if(byi2.k()) {
                    this.b.a = 0;
                    this.d.g();
                    return true;
                }
                hxm hxm0 = this.b;
                int v16 = hxm0.a;
                while(true) {
                    --v16;
                    if(v16 < 0) {
                        break;
                    }
                    if(byi0.j(hxm0.b[v16])) {
                        continue;
                    }
                    int v17 = hxm0.a;
                    if(v16 >= v17) {
                        continue;
                    }
                    int v18;
                    for(v18 = v16; v18 < v17 - 1; ++v18) {
                        hxm0.b[v18] = hxm0.b[v18 + 1];
                    }
                    --hxm0.a;
                }
                ArrayList arrayList1 = new ArrayList(byi2.b());
                int v19 = byi2.b();
                for(int v20 = 0; v20 < v19; ++v20) {
                    arrayList1.add(byi2.f(v20));
                }
                hvt hvt0 = new hvt(arrayList1, hvo0);
                List list1 = hvt0.a;
                int v21 = list1.size();
                int v22 = 0;
                while(true) {
                    Object object0 = null;
                    if(v22 < v21) {
                        Object object1 = list1.get(v22);
                        if(hvo0.a(((hwe)object1).a)) {
                            object0 = object1;
                            break;
                        }
                        ++v22;
                        continue;
                    }
                    break;
                }
                if(((hwe)object0) != null) {
                    if(z) {
                        boolean z4 = this.c;
                        if(!z4 && (((hwe)object0).d || ((hwe)object0).h)) {
                            hzk hzk5 = this.g;
                            ibuq.c(hzk5);
                            long v23 = hzk5.g();
                            float f = Float.intBitsToFloat(((int)(((hwe)object0).c >> 0x20)));
                            float f1 = Float.intBitsToFloat(((int)(((hwe)object0).c & 0xFFFFFFFFL)));
                            int v24 = (f1 > ((float)(((int)(v23 & 0xFFFFFFFFL))))) ? true : 0;
                            int v25 = (f1 < 0.0f) ? true : 0;
                            int v26 = (f > ((float)(((int)(v23 >> 0x20))))) ? true : 0;
                            int v27 = (f < 0.0f) ? true : 0;
                            z3 = (v27 | v26 | v25 | v24) ^ 1;
                            this.c = z3;
                        }
                        else {
                            z3 = z4;
                        }
                    }
                    else {
                        boolean z3 = false;
                        this.c = false;
                    }
                    boolean z5 = this.i;
                    int v28 = 5;
                    if(z3 != z5 && (hvt0.e == 3 || hvt0.e == 4 || hvt0.e == 5)) {
                        if(z3) {
                            v28 = 4;
                        }
                        hvt0.e = v28;
                    }
                    else {
                        int v29 = hvt0.e;
                        if(v29 == 4 && z5 && !this.j) {
                            hvt0.e = 3;
                        }
                        else if(v29 == 5 && z3 && ((hwe)object0).d) {
                            hvt0.e = 3;
                        }
                    }
                }
                if(!z1 && hvt0.e == 3) {
                    hvt hvt1 = this.h;
                    if(hvt1 != null) {
                        List list2 = hvt1.a;
                        if(list2.size() == list1.size()) {
                            boolean z6 = false;
                            int v30 = list1.size();
                            int v31 = 0;
                            while(true) {
                                if(v31 >= v30) {
                                    goto label_191;
                                }
                                hwe hwe3 = (hwe)list2.get(v31);
                                hwe hwe4 = (hwe)list1.get(v31);
                                if(hjz.g(hwe3.c, hwe4.c)) {
                                    ++v31;
                                    continue;
                                }
                                break;
                            }
                        }
                    }
                }
                z6 = true;
            label_191:
                this.h = hvt0;
                return z6;
            }
        }
        return true;
    }

    public final boolean c(hvo hvo0) {
        byi byi0 = this.f;
        if(byi0.k()) {
            z = false;
        }
        else {
            hfb hfb0 = this.a;
            if(hfb0.B) {
                hvt hvt0 = this.h;
                ibuq.c(hvt0);
                hzk hzk0 = this.g;
                ibuq.c(hzk0);
                long v = hzk0.g();
                hfb hfb1 = hfb0;
                gwq gwq0 = null;
                while(true) {
                    boolean z = true;
                    if(hfb1 == null) {
                        break;
                    }
                    if((hfb1 instanceof ijc)) {
                        ((ijc)hfb1).q(hvt0, hvv.c, v);
                    }
                    else if((hfb1.s & 16) != 0 && (hfb1 instanceof iep)) {
                        hfb hfb2 = ((iep)hfb1).D;
                        int v1 = 0;
                        while(hfb2 != null) {
                            if((hfb2.s & 16) != 0) {
                                ++v1;
                                if(v1 == 1) {
                                    hfb1 = hfb2;
                                }
                                else {
                                    if(gwq0 == null) {
                                        gwq0 = new gwq(new hfb[16]);
                                    }
                                    if(hfb1 != null) {
                                        gwq0.n(hfb1);
                                    }
                                    gwq0.n(hfb2);
                                    hfb1 = null;
                                }
                            }
                            hfb2 = hfb2.v;
                        }
                        if(v1 != 1) {
                            goto label_34;
                        }
                        continue;
                    }
                label_34:
                    hfb1 = ien.a(gwq0);
                }
                if(hfb0.B) {
                    Object[] arr_object = this.d.a;
                    int v2 = this.d.b;
                    for(int v3 = 0; v3 < v2; ++v3) {
                        ((hvr)arr_object[v3]).c(hvo0);
                    }
                }
            }
            else {
                z = false;
            }
        }
        super.f();
        hvt hvt1 = this.h;
        if(hvt1 != null) {
            this.i = this.c;
            List list0 = hvt1.a;
            int v4 = list0.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                hwe hwe0 = (hwe)list0.get(v5);
                long v6 = hwe0.a;
                boolean z1 = hvo0.a(v6);
                if(!hwe0.d && (!z1 || !this.c)) {
                    this.b.c(v6);
                }
            }
            this.c = false;
            this.j = hvt1.e == 5;
        }
        byi0.g();
        this.g = null;
        return z;
    }

    public final void d(long v, bzd bzd0) {
        hxm hxm0 = this.b;
        if(hxm0.a(v) && !bzd0.e(this)) {
            hxm0.c(v);
            this.f.i(v);
        }
        Object[] arr_object = this.d.a;
        int v1 = this.d.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            ((hvr)arr_object[v2]).d(v, bzd0);
        }
    }

    public final boolean e(hvo hvo0, boolean z) {
        if(this.f.k()) {
            return false;
        }
        hfb hfb0 = this.a;
        if(!hfb0.B) {
            return false;
        }
        hvt hvt0 = this.h;
        ibuq.c(hvt0);
        hzk hzk0 = this.g;
        ibuq.c(hzk0);
        long v = hzk0.g();
        hfb hfb1 = hfb0;
        gwq gwq0 = null;
        while(hfb1 != null) {
            if((hfb1 instanceof ijc)) {
                ((ijc)hfb1).q(hvt0, hvv.a, v);
            }
            else if((hfb1.s & 16) != 0 && (hfb1 instanceof iep)) {
                hfb hfb2 = ((iep)hfb1).D;
                int v1 = 0;
                while(hfb2 != null) {
                    if((hfb2.s & 16) != 0) {
                        ++v1;
                        if(v1 == 1) {
                            hfb1 = hfb2;
                        }
                        else {
                            if(gwq0 == null) {
                                gwq0 = new gwq(new hfb[16]);
                            }
                            if(hfb1 != null) {
                                gwq0.n(hfb1);
                            }
                            gwq0.n(hfb2);
                            hfb1 = null;
                        }
                    }
                    hfb2 = hfb2.v;
                }
                if(v1 != 1) {
                    goto label_34;
                }
                continue;
            }
        label_34:
            hfb1 = ien.a(gwq0);
        }
        if(hfb0.B) {
            Object[] arr_object = this.d.a;
            int v2 = this.d.b;
            for(int v3 = 0; v3 < v2; ++v3) {
                hvr hvr0 = (hvr)arr_object[v3];
                ibuq.c(this.g);
                hvr0.e(hvo0, z);
            }
        }
        if(hfb0.B) {
            gwq gwq1 = null;
            while(hfb0 != null) {
                if((hfb0 instanceof ijc)) {
                    ((ijc)hfb0).q(hvt0, hvv.b, v);
                }
                else if((hfb0.s & 16) != 0 && (hfb0 instanceof iep)) {
                    hfb hfb3 = ((iep)hfb0).D;
                    int v4 = 0;
                    while(hfb3 != null) {
                        if((hfb3.s & 16) != 0) {
                            ++v4;
                            if(v4 == 1) {
                                hfb0 = hfb3;
                            }
                            else {
                                if(gwq1 == null) {
                                    gwq1 = new gwq(new hfb[16]);
                                }
                                if(hfb0 != null) {
                                    gwq1.n(hfb0);
                                }
                                gwq1.n(hfb3);
                                hfb0 = null;
                            }
                        }
                        hfb3 = hfb3.v;
                    }
                    if(v4 != 1) {
                        goto label_70;
                    }
                    continue;
                }
            label_70:
                hfb0 = ien.a(gwq1);
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        return "Node(modifierNode=" + this.a + ", children=" + this.d + ", pointerIds=" + this.b + ')';
    }
}

