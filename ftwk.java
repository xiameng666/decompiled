import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ftwk {
    public static final void a(hfc hfc0, long v, float f, fryv fryv0, boolean z, boolean z1, fryk fryk0, long v1, fryv fryv1, long v2, fryk fryk1, long v3, ibth ibth0, goz goz0, int v4, int v5, int v6) {
        ibth ibth3;
        fryv fryv4;
        long v34;
        long v33;
        long v32;
        long v31;
        long v30;
        long v29;
        int v28;
        int v27;
        long v25;
        long v24;
        boolean z5;
        float f3;
        hfc hfc3;
        fryk fryk7;
        fryk fryk6;
        ibth ibth2;
        long v23;
        fryv fryv3;
        boolean z4;
        long v22;
        long v21;
        fryk fryk5;
        fryk fryk4;
        long v20;
        float f2;
        hfc hfc2;
        goz goz2;
        ibth ibth1;
        long v19;
        fryv fryv2;
        boolean z3;
        boolean z2;
        int v18;
        int v17;
        int v16;
        int v12;
        float f1;
        int v10;
        long v9;
        hfc hfc1;
        int v7;
        fryk fryk2 = fryk0;
        fryk fryk3 = fryk1;
        goz goz1 = goz0.ao(0x1A290A58);
        if((v6 & 1) != 0) {
            v7 = v4 | 6;
            hfc1 = hfc0;
        }
        else if((v4 & 6) == 0) {
            hfc1 = hfc0;
            v7 = (goz1.X(hfc1) ? 4 : 2) | v4;
        }
        else {
            hfc1 = hfc0;
            v7 = v4;
        }
        int v8 = 0x20;
        if((v4 & 0x30) == 0) {
            if((v6 & 2) == 0) {
                v9 = v;
                v10 = goz1.W(v9) ? 0x20 : 16;
            }
            else {
                v9 = v;
                v10 = 16;
            }
            v7 |= v10;
        }
        else {
            v9 = v;
        }
        int v11 = 0x100;
        if((v6 & 4) != 0) {
            v7 |= 0x180;
            f1 = f;
            v12 = v6 & 1;
        }
        else if((v4 & 0x180) == 0) {
            f1 = f;
            v12 = v6 & 1;
            v7 |= (goz1.U(f1) ? 0x100 : 0x80);
        }
        else {
            f1 = f;
            v12 = v6 & 1;
        }
        if((v6 & 8) != 0) {
            v7 |= 0xC00;
        }
        else if((v4 & 0xC00) == 0) {
            v7 |= (goz1.Z(fryv0) ? 0x800 : 0x400);
        }
        if((v6 & 16) != 0) {
            v7 |= 0x6000;
        }
        else if((v4 & 0x6000) == 0) {
            v7 |= (goz1.Y(((int)z)) ? 0x4000 : 0x2000);
        }
        if((v6 & 0x20) != 0) {
            v7 |= 0x30000;
        }
        else if((v4 & 0x30000) == 0) {
            v7 |= (goz1.Y(((int)z1)) ? 0x20000 : 0x10000);
        }
        int v13 = 0x80000;
        if((0x180000 & v4) == 0) {
            if((v6 & 0x40) == 0 && ((0x200000 & v4) == 0 ? goz1.X(fryk2) : goz1.Z(fryk2))) {
                v13 = 0x100000;
            }
            v7 |= v13;
        }
        int v14 = 0x400000;
        if((0xC00000 & v4) == 0) {
            if((v6 & 0x80) == 0 && goz1.W(v1)) {
                v14 = 0x800000;
            }
            v7 |= v14;
        }
        if((v6 & 0x100) != 0) {
            v7 |= 0x6000000;
        }
        else if((v4 & 0x6000000) == 0) {
            v7 |= (goz1.Z(fryv1) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v4) == 0) {
            v7 |= ((v6 & 0x200) != 0 || !goz1.W(v2) ? 0x10000000 : 0x20000000);
        }
        int v15 = (v5 & 6) == 0 ? v5 | ((v6 & 0x400) != 0 || !((v5 & 8) == 0 ? goz1.X(fryk3) : goz1.Z(fryk3)) ? 2 : 4) : v5;
        if((v5 & 0x30) == 0) {
            if((v6 & 0x800) != 0 || !goz1.W(v3)) {
                v8 = 16;
            }
            v16 = v15 | v8;
        }
        else {
            v16 = v15;
        }
        if((v6 & 0x1000) != 0) {
            v17 = v16 | 0x180;
            v18 = v6 & 0x1000;
        }
        else if((v5 & 0x180) == 0) {
            v18 = v6 & 0x1000;
            if(!goz1.Z(ibth0)) {
                v11 = 0x80;
            }
            v17 = v16 | v11;
        }
        else {
            v18 = v6 & 0x1000;
            v17 = v16;
        }
        if((306783379 & v7) == 306783378 && (v17 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            z2 = (int)z;
            z3 = (int)z1;
            fryv2 = fryv1;
            v19 = v3;
            ibth1 = ibth0;
            goz2 = goz1;
            hfc2 = hfc1;
            f2 = f1;
            v20 = v2;
            fryk4 = fryk2;
            fryk5 = fryk3;
            v21 = v9;
            v22 = v1;
        }
        else {
            goz1.I();
            if((v4 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                z4 = (int)z1;
                fryv3 = fryv1;
                v23 = v3;
                ibth2 = ibth0;
                fryk6 = fryk2;
                fryk7 = fryk3;
                hfc3 = hfc1;
                f3 = f1;
                z5 = (int)z;
                v24 = v1;
                v25 = v2;
            }
            else {
                if(v12 != 0) {
                    hfc1 = hfc.e;
                }
                if((v6 & 2) != 0) {
                    if(hyxx.c()) {
                        goz1.M(0x4DEDDFD0);
                        v9 = fpu.a(goz1).h;
                    }
                    else {
                        goz1.M(1307498107);
                        v9 = fpu.a(goz1).p;
                    }
                    goz1.x();
                }
                if((v6 & 4) != 0) {
                    f1 = 1.0f;
                }
                int v26 = ((v6 & 0x20) == 0 ? 1 : 0) & ((int)z1);
                if((v6 & 0x40) == 0) {
                    v27 = v6 & 0x400;
                }
                else {
                    v27 = v6 & 0x400;
                    fryk2 = new fryh(0x7F08056E);  // drawable:gs_error_vd_theme_24
                }
                if((v6 & 0x80) == 0) {
                    v28 = v6 & 0x200;
                    v29 = v1;
                }
                else if(hyxx.c()) {
                    goz1.M(0x4DF3340E);
                    v28 = v6 & 0x200;
                    v29 = fpu.a(goz1).i;
                    goz1.x();
                }
                else {
                    v28 = v6 & 0x200;
                    goz1.M(0x4DF4323B);
                    v29 = fpu.a(goz1).a;
                    goz1.x();
                }
                fryv3 = (v6 & 0x100) == 0 ? fryv1 : null;
                if(v28 == 0) {
                    v30 = v29;
                    v31 = v2;
                }
                else if(hyxx.c()) {
                    goz1.M(1307984590);
                    v30 = v29;
                    v31 = fpu.a(goz1).i;
                    goz1.x();
                }
                else {
                    v30 = v29;
                    goz1.M(0x4DF740FB);
                    v31 = fpu.a(goz1).a;
                    goz1.x();
                }
                if(v27 != 0) {
                    fryk3 = new fryh(0);
                }
                if((v6 & 0x800) == 0) {
                    v32 = v31;
                    v33 = v3;
                }
                else if(hyxx.c()) {
                    goz1.M(1308202830);
                    v32 = v31;
                    v33 = fpu.a(goz1).i;
                    goz1.x();
                }
                else {
                    v32 = v31;
                    goz1.M(0x4DFA957B);
                    v33 = fpu.a(goz1).a;
                    goz1.x();
                }
                if(v18 == 0) {
                    v34 = v33;
                    ibth2 = ibth0;
                    fryk6 = fryk2;
                    fryk7 = fryk3;
                    z4 = v26;
                    hfc3 = hfc1;
                }
                else {
                    goz1.M(0x6E3C21FE);
                    Object object0 = goz1.j();
                    v34 = v33;
                    if(object0 == gop.a) {
                        object0 = new ftvy();
                        goz1.P(object0);
                    }
                    goz1.x();
                    fryk6 = fryk2;
                    fryk7 = fryk3;
                    z4 = v26;
                    hfc3 = hfc1;
                    ibth2 = (ibth)object0;
                }
                f3 = f1;
                z5 = ((v6 & 16) == 0 ? 1 : 0) & ((int)z);
                v24 = v30;
                v25 = v32;
                v23 = v34;
            }
            goz1.w();
            goz1.M(873490046);
            eaa eaa0 = hyxx.c() ? fulh.a(fule.a, goz1) : eah.b(16.0f);
            goz1.x();
            CharSequence charSequence0 = fryv0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            ibuq.d(charSequence0, "null cannot be cast to non-null type kotlin.String");
            String s = (String)charSequence0;
            goz1.M(0x6E3C21FE);
            Object object1 = goz1.j();
            Object object2 = gop.a;
            if(object1 == object2) {
                object1 = new hix();
                goz1.P(object1);
            }
            goz1.x();
            goz1.M(873500278);
            hfc hfc4 = hyxx.c() || !(f3 > 0.0f) ? hfc3 : crd.c(hfc3, f3, hll.h(fpu.a(goz1).B, 0.5f), eaa0);
            goz1.x();
            gaq.c(csm.b(hiz.a(dls.w(hhi.a(iqn.a(hfc4, "Background"), eaa0)), ((hix)object1)), 3), null, v9, 0L, 0.0f, 0.0f, null, gzf.e(0x6022FF1D, new ftwi(fryv3, ibth2, z5, fryk6, v24, v9, fryv0, v25, fryk7, v23), goz1), goz1, 0x7A);
            if(z4) {
                ibom ibom0 = ibom.a;
                goz1.M(5004770);
                Object object3 = goz1.j();
                fryv4 = fryv3;
                if(object3 == object2) {
                    ibth3 = ibth2;
                    object3 = new ftwj(((hix)object1), null);
                    goz1.P(object3);
                }
                else {
                    ibth3 = ibth2;
                }
                goz1.x();
                gqe.f(ibom0, ((ibtw)object3), goz1);
            }
            else {
                fryv4 = fryv3;
                ibth3 = ibth2;
            }
            goz2 = goz1;
            hfc2 = hfc3;
            ibth1 = ibth3;
            fryv2 = fryv4;
            v22 = v24;
            z2 = z5;
            v21 = v9;
            z3 = z4;
            fryk4 = fryk6;
            v19 = v23;
            f2 = f3;
            fryk5 = fryk7;
            v20 = v25;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftvz(hfc2, v21, f2, fryv0, z2, z3, fryk4, v22, fryv2, v20, fryk5, v19, ibth1, v4, v5, v6);
        }
    }

    public static final void b(hfc hfc0, ftwl ftwl0, boolean z, goz goz0, int v, int v1) {
        hfc hfc2;
        boolean z1;
        hfc hfc1;
        int v2;
        ibuq.f(ftwl0, "calloutState");
        goz goz1 = goz0.ao(0x19D920A);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (((v & 0x40) == 0 ? goz1.X(ftwl0) : goz1.Z(ftwl0)) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            z1 = z;
        }
        else {
            if((v1 & 1) != 0) {
                hfc0 = hfc.e;
            }
            int v3 = ((v1 & 4) == 0 ? 1 : 0) & z;
            switch(ftwl0.a.ordinal()) {
                case 0: {
                    goz1.M(0xFFA98DDA);
                    fryv fryv0 = ftwl0.b;
                    fryk fryk0 = ftwl0.c;
                    if(!fryl.c(fryk0)) {
                        fryk0 = hyxx.c() ? new fryh(0x7F08059F) : new fryh(0x7F08056E);  // drawable:gs_info_vd_theme_24
                    }
                    fryv fryv1 = ftwl0.d;
                    fryk fryk1 = ftwl0.e;
                    ibth ibth0 = ftwl0.f;
                    goz1.M(0x108196AC);
                    if(ibth0 == null) {
                        goz1.M(0x6E3C21FE);
                        Object object0 = goz1.j();
                        if(object0 == gop.a) {
                            object0 = new ftvs();
                            goz1.P(object0);
                        }
                        ibth0 = (ibth)object0;
                        goz1.x();
                    }
                    goz1.x();
                    hfc2 = hfc0;
                    ftwk.d(hfc2, fryv0, fryk0, fryv1, ((boolean)v3), fryk1, ibth0, goz1, v2 & 14 | v2 << 6 & 0xE000);
                    goz1.x();
                    break;
                }
                case 1: {
                    goz1.M(-5063329);
                    fryv fryv2 = ftwl0.b;
                    fryk fryk2 = ftwl0.c;
                    if(!fryl.c(fryk2)) {
                        fryk2 = new fryh((hyxx.c() ? 0x7F080569 : 0x7F08067B));  // drawable:gs_error_fill1_vd_theme_24
                    }
                    fryv fryv3 = ftwl0.d;
                    fryk fryk3 = ftwl0.e;
                    ibth ibth1 = ftwl0.f;
                    goz1.M(0x1081E9AC);
                    if(ibth1 == null) {
                        goz1.M(0x6E3C21FE);
                        Object object1 = goz1.j();
                        if(object1 == gop.a) {
                            object1 = new ftvt();
                            goz1.P(object1);
                        }
                        ibth1 = (ibth)object1;
                        goz1.x();
                    }
                    goz1.x();
                    hfc2 = hfc0;
                    ftwk.c(hfc2, fryv2, fryk2, fryv3, ((boolean)v3), fryk3, ibth1, goz1, v2 & 14 | v2 << 6 & 0xE000);
                    goz1.x();
                    break;
                }
                case 2: {
                    goz1.M(0xFFBCA497);
                    ftwk.f(null, ftwl0.b, goz1, 0);
                    goz1.x();
                    hfc2 = hfc0;
                    break;
                }
                case 3: {
                    goz1.M(0xFFBE3398);
                    ftwk.e(null, ftwl0.b, goz1, 0);
                    goz1.x();
                    hfc2 = hfc0;
                    break;
                }
                default: {
                    goz1.M(0x108152F1);
                    goz1.x();
                    throw new ibnq();
                }
            }
            hfc1 = hfc2;
            z1 = v3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftvu(hfc1, ftwl0, z1, v, v1);
        }
    }

    public static final void c(hfc hfc0, fryv fryv0, fryk fryk0, fryv fryv1, boolean z, fryk fryk1, ibth ibth0, goz goz0, int v) {
        long v6;
        long v5;
        long v3;
        goz goz2;
        ibth ibth1;
        boolean z1;
        goz goz1 = goz0.ao(0xBC5476F1);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(fryv1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            z1 = z;
            v1 |= (goz1.Y(z1) ? 0x4000 : 0x2000);
        }
        else {
            z1 = z;
        }
        if((0x30000 & v) == 0) {
            v1 |= (((0x40000 & v) == 0 ? goz1.X(fryk1) : goz1.Z(fryk1)) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            ibth1 = ibth0;
            v1 |= (goz1.Z(ibth1) ? 0x100000 : 0x80000);
        }
        else {
            ibth1 = ibth0;
        }
        if((0x92493 & v1) == 0x92492 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
            }
            goz1.w();
            long v2 = fpu.a(goz1).y;
            if(hyxx.c()) {
                goz1.M(0x2945EEA0);
                v3 = fpu.a(goz1).w;
            }
            else {
                goz1.M(692503829);
                v3 = fpu.a(goz1).z;
            }
            goz1.x();
            long v4 = fpu.a(goz1).w;
            if(hyxx.c()) {
                goz1.M(0x294A27C0);
                v5 = v4;
                v6 = fpu.a(goz1).w;
            }
            else {
                v5 = v4;
                goz1.M(0x294AFE35);
                v6 = fpu.a(goz1).z;
            }
            goz1.x();
            goz2 = goz1;
            ftwk.a(hfc0, v2, 0.0f, fryv0, false, z1, fryk0, v3, fryv1, v5, fryk1, v6, ibth1, goz2, v1 & 14 | 0x180 | v1 << 6 & 0x1C00 | v1 << 3 & 0x70000 | v1 << 12 & 0x380000 | v1 << 15 & 0xE000000, v1 >> 15 & 14 | v1 >> 12 & 0x380, 16);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftwa(hfc0, fryv0, fryk0, fryv1, z, fryk1, ibth0, v);
        }
    }

    public static final void d(hfc hfc0, fryv fryv0, fryk fryk0, fryv fryv1, boolean z, fryk fryk1, ibth ibth0, goz goz0, int v) {
        goz goz2;
        boolean z1;
        goz goz1 = goz0.ao(0xC001A943);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(fryv1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            z1 = z;
            v1 |= (goz1.Y(z1) ? 0x4000 : 0x2000);
        }
        else {
            z1 = z;
        }
        if((0x30000 & v) == 0) {
            v1 |= (((0x40000 & v) == 0 ? goz1.X(fryk1) : goz1.Z(fryk1)) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v1) == 0x92492 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
            }
            goz1.w();
            goz2 = goz1;
            ftwk.a(hfc0, 0L, 0.0f, fryv0, false, z1, fryk0, 0L, fryv1, 0L, fryk1, 0L, ibth0, goz2, v1 & 14 | v1 << 6 & 0x1C00 | 0x70000 & v1 << 3 | 0x380000 & v1 << 12 | 0xE000000 & v1 << 15, v1 >> 15 & 14 | v1 >> 12 & 0x380, 2710);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftvx(hfc0, fryv0, fryk0, fryv1, z, fryk1, ibth0, v);
        }
    }

    public static final void e(hfc hfc0, fryv fryv0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        goz goz1 = goz0.ao(0x8246AF1B);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(fryv0) ? 0x20 : 16) : v | 6;
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            goz2 = goz1;
            hfc1 = hfc.e;
            ftwk.a(hfc1, 0L, 0.0f, fryv0, false, false, new fryh(0x7F080B5C), 0L, null, 0L, null, 0L, null, goz2, v1 & 14 | v1 << 6 & 0x1C00, 0, 0x1FB6);  // drawable:quantum_gm_ic_downloading_vd_theme_24
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftvw(hfc1, fryv0, v);
        }
    }

    public static final void f(hfc hfc0, fryv fryv0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        goz goz1 = goz0.ao(0x5717F5F9);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(fryv0) ? 0x20 : 16) : v | 6;
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            goz2 = goz1;
            hfc1 = hfc.e;
            ftwk.a(hfc1, 0L, 0.0f, fryv0, true, false, null, 0L, null, 0L, null, 0L, null, goz2, v1 & 14 | 0x6000 | v1 << 6 & 0x1C00, 0, 0x1FE6);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftvv(hfc1, fryv0, v);
        }
    }
}

