import java.util.Map;

public abstract class igl extends ibq implements ihd, ihg {
    private static final ibts f;
    private igi g;
    private ija h;
    public ibts i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final ibp m;
    public ijd n;
    public bzk o;

    static {
        igl.f = igh.a;
    }

    public igl() {
        this.m = new iah(this);
    }

    public abstract long I();

    public abstract hzk J();

    public abstract iav K();

    @Override  // ihd
    public abstract ify L();

    public final igi M() {
        igi igi0 = this.g;
        if(igi0 == null) {
            igi0 = new igi(this);
            this.g = igi0;
        }
        return igi0;
    }

    public abstract igl N();

    public abstract igl O();

    public final void P(ify ify0, ica ica0) {
        int v14;
        int v13;
        int v12;
        long v8;
        long[] arr_v2;
        Object[] arr_object2;
        bzk bzk2;
        bzk bzk0 = this.o;
        if(bzk0 == null) {
        label_80:
            bzk bzk1 = this.o;
            if(bzk1 == null) {
            label_105:
                bzk2 = this.o;
                if(bzk2 == null) {
                    bzk2 = new bzk(null);
                    this.o = bzk2;
                }
            }
            else {
                long[] arr_v4 = bzk1.a;
                int v15 = arr_v4.length - 2;
                if(v15 >= 0) {
                    int v16 = 0;
                    while(true) {
                        long v17 = arr_v4[v16];
                        if((~v17 << 7 & v17 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_102;
                        }
                        int v18 = 8 - (~(v16 - v15) >>> 0x1F);
                        for(int v19 = 0; v19 < v18; ++v19) {
                            if((v17 & 0xFFL) < 0x80L) {
                                int v20 = (v16 << 3) + v19;
                                Object object0 = bzk1.b[v20];
                                bzn bzn1 = (bzn)bzk1.c[v20];
                                ica ica1 = (ica)object0;
                                if(bzn1.b()) {
                                    bzk1.i(v20);
                                }
                            }
                            v17 >>= 8;
                        }
                        if(v18 == 8) {
                        label_102:
                            if(v16 != v15) {
                                ++v16;
                                continue;
                            }
                        }
                        goto label_105;
                    }
                }
                else {
                    goto label_105;
                }
            }
        }
        else {
            Object[] arr_object = bzk0.c;
            long[] arr_v = bzk0.a;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_73;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((v2 & 0xFFL) < 0x80L) {
                            bzn bzn0 = (bzn)arr_object[(v1 << 3) + v4];
                            Object[] arr_object1 = bzn0.b;
                            long[] arr_v1 = bzn0.a;
                            int v5 = arr_v1.length - 2;
                            if(v5 >= 0) {
                                arr_object2 = arr_object;
                                int v6 = 0;
                                while(true) {
                                    long v7 = arr_v1[v6];
                                    arr_v2 = arr_v;
                                    v8 = v2;
                                    if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_48;
                                    }
                                    int v9 = 8 - (~(v6 - v5) >>> 0x1F);
                                    int v10 = 0;
                                    while(v10 < v9) {
                                        if((v7 & 0xFFL) < 0x80L) {
                                            int v11 = (v6 << 3) + v10;
                                            ify ify1 = (ify)((ijp)arr_object1[v11]).get();
                                            v12 = v10;
                                            if(ify1 == null) {
                                                v13 = v4;
                                                bzn0.i(v11);
                                            }
                                            else {
                                                v13 = v4;
                                                if(!ify1.am()) {
                                                    bzn0.i(v11);
                                                }
                                            }
                                        }
                                        else {
                                            v12 = v10;
                                            v13 = v4;
                                        }
                                        v7 >>= 8;
                                        v10 = v12 + 1;
                                        v4 = v13;
                                    }
                                    v14 = v4;
                                    if(v9 == 8) {
                                        goto label_49;
                                    label_48:
                                        v14 = v4;
                                    label_49:
                                        if(v6 != v5) {
                                            ++v6;
                                            arr_v = arr_v2;
                                            v2 = v8;
                                            v4 = v14;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            else {
                                arr_v2 = arr_v;
                                v8 = v2;
                                v14 = v4;
                                arr_object2 = arr_object;
                            }
                        }
                        else {
                            arr_v2 = arr_v;
                            v8 = v2;
                            v14 = v4;
                            arr_object2 = arr_object;
                        }
                        v2 = v8 >> 8;
                        arr_object = arr_object2;
                        v4 = v14 + 1;
                        arr_v = arr_v2;
                    }
                    long[] arr_v3 = arr_v;
                    Object[] arr_object3 = arr_object;
                    if(v3 == 8) {
                        goto label_75;
                    label_73:
                        arr_v3 = arr_v;
                        arr_object3 = arr_object;
                    label_75:
                        if(v1 != v) {
                            ++v1;
                            arr_object = arr_object3;
                            arr_v = arr_v3;
                            continue;
                        }
                    }
                    goto label_80;
                }
            }
            else {
                goto label_80;
            }
        }
        Object object1 = bzk2.a(ica0);
        if(object1 == null) {
            object1 = new bzn(null);
            bzk2.k(ica0, object1);
        }
        ((bzn)object1).h(new ijp(ify0));
    }

    public final void Q(ija ija0, long v, long v1) {
        boolean z2;
        boolean z1;
        bzk bzk0 = this.o;
        ijd ijd0 = this.n;
        if(ijd0 == null) {
            ijd0 = new ijd();
            this.n = ijd0;
        }
        iio iio0 = this.L().j;
        if(iio0 != null) {
            iiy iiy0 = ((ili)iio0).z;
            if(iiy0 != null) {
                igj igj0 = new igj(this, v, v1, ija0);
                iiy0.a.c(ija0, igl.f, igj0);
            }
        }
        boolean z = this.ep();
        int v2 = ijd0.a;
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = ijd0.d[v3];
            if(v4 == 3) {
                ica ica0 = ijd0.b[v3];
                ibuq.c(ica0);
                ijd0.f.h(ica0);
            }
            else if(v4 != 0 && bzk0 != null) {
                ica ica1 = ijd0.b[v3];
                ibuq.c(ica1);
                bzn bzn0 = (bzn)bzk0.h(ica1);
                if(bzn0 != null) {
                    ijd0.e.f(bzn0);
                }
            }
        }
        int v5 = ijd0.a;
        int v7 = 0;
        for(int v6 = 0; v6 < v5; ++v6) {
            byte[] arr_b = ijd0.d;
            if(arr_b[v6] == 2) {
                ++v7;
            }
            else if(v7 > 0) {
                ijd0.b[v6 - v7] = ijd0.b[v6];
            }
            arr_b[v6] = 2;
        }
        int v8 = ijd0.a;
        for(int v9 = v8 - v7; v9 < v8; ++v9) {
            ijd0.b[v9] = null;
        }
        ijd0.a -= v7;
        igl igl0 = this.O();
        bzn bzn1 = ijd0.f;
        Object[] arr_object = bzn1.b;
        long[] arr_v = bzn1.a;
        int v10 = arr_v.length - 2;
        if(v10 >= 0) {
            int v11 = 0;
            while(true) {
                long v12 = arr_v[v11];
                if((~v12 << 7 & v12 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_88;
                }
                int v13 = 8 - (~(v11 - v10) >>> 0x1F);
                int v14 = 0;
                while(v14 < v13) {
                    if((v12 & 0xFFL) < 0x80L) {
                        ica ica2 = (ica)arr_object[(v11 << 3) + v14];
                        igl igl1 = igl0 == null ? this : igl0;
                        igl igl2 = igl1;
                        while(true) {
                            ijd ijd1 = igl2.n;
                            if(ijd1 == null) {
                                z1 = z;
                            }
                            else {
                                z1 = z;
                                if(ibpg.V(ijd1.b, ica2)) {
                                    break;
                                }
                            }
                            igl igl3 = igl2.O();
                            if(igl3 == null) {
                                break;
                            }
                            igl2 = igl3;
                            z = z1;
                        }
                        bzn bzn2 = igl2.o == null ? null : ((bzn)igl2.o.h(ica2));
                        if(bzn2 != null) {
                            igl1.V(bzn2);
                        }
                    }
                    else {
                        z1 = z;
                    }
                    v12 >>= 8;
                    ++v14;
                    z = z1;
                }
                z2 = z;
                if(v13 == 8) {
                    goto label_89;
                label_88:
                    z2 = z;
                label_89:
                    if(v11 != v10) {
                        ++v11;
                        z = z2;
                        continue;
                    }
                }
                break;
            }
        }
        else {
            z2 = z;
        }
        bzn1.d();
        bzn bzn3 = ijd0.e;
        Object[] arr_object1 = bzn3.b;
        long[] arr_v1 = bzn3.a;
        int v15 = arr_v1.length - 2;
        if(v15 >= 0) {
            int v16 = 0;
            while(true) {
                long v17 = arr_v1[v16];
                if((~v17 << 7 & v17 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v18 = 8 - (~(v16 - v15) >>> 0x1F);
                    for(int v19 = 0; v19 < v18; ++v19) {
                        if((v17 & 0xFFL) < 0x80L) {
                            ify ify0 = (ify)((ijp)arr_object1[(v16 << 3) + v19]).get();
                            if(ify0 != null) {
                                if(z2) {
                                    ify0.X(false);
                                }
                                else {
                                    ify0.Y(false);
                                }
                            }
                        }
                        v17 >>= 8;
                    }
                    if(v18 == 8) {
                        goto label_117;
                    }
                    break;
                }
            label_117:
                if(v16 == v15) {
                    break;
                }
                ++v16;
            }
        }
        bzn3.d();
    }

    public final void R(iav iav0) {
        bzk bzk0 = this.o;
        if(!this.l) {
            ibts ibts0 = iav0.f();
            int v = 0;
            if(ibts0 != null) {
                int v6 = this.i == ibts0 ? 0 : 1;
                long v7 = 0x7FFFFFFF7FFFFFFFL;
                long v8 = 0L;
                if(v6 == 0 && this.M().a) {
                    hzk hzk0 = this.J();
                    v7 = jlg.b(hzl.c(hzk0));
                    v8 = hzk0.g();
                    if(!jlf.f(v7, this.M().b) || !jlk.c(v8, this.M().c)) {
                        v = 1;
                    }
                    v6 = v;
                }
                if(v6 != 0) {
                    ija ija0 = this.h;
                    if(ija0 == null) {
                        ija0 = new ija(iav0, this);
                        this.h = ija0;
                    }
                    else {
                        ija0.a = iav0;
                    }
                    this.Q(ija0, v7, v8);
                    this.i = iav0.f();
                }
            }
            else if(bzk0 != null) {
                Object[] arr_object = bzk0.c;
                long[] arr_v = bzk0.a;
                int v1 = arr_v.length - 2;
                if(v1 >= 0) {
                    int v2 = 0;
                    while(true) {
                        long v3 = arr_v[v2];
                        if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                            for(int v4 = 0; true; ++v4) {
                                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                                if(v4 >= v5) {
                                    break;
                                }
                                if((0xFFL & v3) < 0x80L) {
                                    this.V(((bzn)arr_object[(v2 << 3) + v4]));
                                }
                                v3 >>= 8;
                            }
                            if(v5 == 8) {
                                goto label_22;
                            }
                            break;
                        }
                    label_22:
                        if(v2 == v1) {
                            break;
                        }
                        ++v2;
                    }
                }
                bzk0.j();
            }
        }
    }

    public abstract void S();

    @Override  // ihg
    public final void T(boolean z) {
        igl igl0 = this.O();
        ify ify0 = igl0 == null ? null : igl0.L();
        if(ibuq.m(ify0, this.L())) {
            this.j = z;
            return;
        }
        if(ify0 != null && ify0.aC() == 3 || ify0 != null && ify0.aC() == 4) {
            this.j = z;
        }
    }

    public abstract boolean U();

    public final void V(bzn bzn0) {
        Object[] arr_object = bzn0.b;
        long[] arr_v = bzn0.a;
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
                            ify ify0 = (ify)((ijp)arr_object[(v1 << 3) + v3]).get();
                            if(ify0 != null) {
                                if(this.ep()) {
                                    ify0.X(false);
                                }
                                else {
                                    ify0.Y(false);
                                }
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_21;
                    }
                    break;
                }
            label_21:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    protected static final void W(ihy ihy0) {
        if(!ibuq.m((ihy0.w == null ? null : ihy0.w.t), ihy0.t)) {
            ((ihc)ihy0.ag()).w.e();
            return;
        }
        ids ids0 = ihy0.ag().h();
        if(ids0 != null) {
            idr idr0 = ((ihc)ids0).w;
            if(idr0 != null) {
                idr0.e();
            }
        }
    }

    @Override  // jlc
    public final float ea(long v) {
        return jlb.a(this, v);
    }

    @Override  // jks
    public final float eb(float f) {
        return jkr.a(this, f);
    }

    @Override  // jks
    public final float ec(int v) {
        return jkr.b(this, v);
    }

    @Override  // jks
    public final float ed(long v) {
        return jkr.c(this, v);
    }

    @Override  // iay
    public final int ee(hxw hxw0) {
        if(this.U()) {
            int v = this.q(hxw0);
            if(v != 0x80000000) {
                return (hxw0 instanceof icv) ? v + jlf.a(this.e) : v + jlf.b(this.e);
            }
        }
        return 0x80000000;
    }

    @Override  // jks
    public final float eg(float f) {
        return jkr.d(this, f);
    }

    @Override  // jks
    public final int eh(long v) {
        return jkr.e(this, v);
    }

    @Override  // jks
    public final int ei(float f) {
        return jkr.f(this, f);
    }

    @Override  // jks
    public final long ej(long v) {
        return jkr.g(this, v);
    }

    @Override  // jks
    public final long ek(long v) {
        return jkr.h(this, v);
    }

    @Override  // jlc
    public final long el(float f) {
        return jlb.b(this, f);
    }

    @Override  // jks
    public final long em(float f) {
        return jkr.i(this, f);
    }

    @Override  // iax
    public final iav en(int v, int v1, Map map0, ibts ibts0) {
        return iaw.a(this, v, v1, map0, ibts0);
    }

    @Override  // iax
    public final iav eo(int v, int v1, Map map0, ibts ibts0, ibts ibts1) {
        if((v & 0xFF000000) != 0 || (0xFF000000 & v1) != 0) {
            hxt.d(a.x(v1, v, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new igk(v, v1, map0, ibts0, ibts1, this);
    }

    @Override  // hzg
    public boolean ep() {
        return false;
    }

    public abstract int q(hxw arg1);
}

