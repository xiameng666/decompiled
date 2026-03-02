import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;

public final class ftzd {
    public static final void a(fryv fryv0, hfc hfc0, long v, long v1, jeu jeu0, long v2, jjy jjy0, long v3, int v4, boolean z, int v5, int v6, Map map0, ibts ibts0, jbn jbn0, goz goz0, int v7, int v8, int v9) {
        Map map4;
        ibts ibts3;
        jeu jeu4;
        long v38;
        hfc hfc3;
        long v37;
        int v36;
        int v35;
        jbn jbn2;
        ibts ibts2;
        Map map2;
        int v34;
        boolean z2;
        long v33;
        jjy jjy2;
        long v32;
        jeu jeu2;
        long v31;
        int v30;
        boolean z1;
        long v29;
        jeu jeu1;
        hfc hfc2;
        long v28;
        int v27;
        goz goz2;
        jbn jbn1;
        ibts ibts1;
        Map map1;
        int v26;
        jjy jjy1;
        long v25;
        int v24;
        int v23;
        int v22;
        int v21;
        int v20;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        long v12;
        hfc hfc1;
        int v10;
        ibuq.f(fryv0, "textResource");
        goz goz1 = goz0.ao(0x3F7161D);
        if((v9 & 1) == 0) {
            v10 = (v7 & 6) == 0 ? (goz1.Z(fryv0) ? 4 : 2) | v7 : v7;
        }
        else {
            v10 = v7 | 6;
        }
        if((v9 & 2) != 0) {
            v10 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v7 & 0x30) == 0) {
            hfc1 = hfc0;
            v10 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        int v11 = 0x100;
        if((v9 & 4) == 0) {
            v12 = v;
            if((v7 & 0x180) == 0) {
                v10 |= (goz1.W(v12) ? 0x100 : 0x80);
            }
        }
        else {
            v10 |= 0x180;
            v12 = v;
        }
        if((v9 & 8) == 0) {
            v13 = v9 & 8;
            if((v7 & 0xC00) == 0) {
                v10 |= (goz1.W(v1) ? 0x800 : 0x400);
            }
        }
        else {
            v10 |= 0xC00;
            v13 = v9 & 8;
        }
        if((v9 & 16) == 0) {
            v14 = (v7 & 0x6000) == 0 ? v10 | (goz1.X(null) ? 0x4000 : 0x2000) : v10;
        }
        else {
            v14 = v10 | 0x6000;
        }
        if((v9 & 0x20) != 0) {
            v14 |= 0x30000;
        }
        else if((v7 & 0x30000) == 0) {
            v14 |= (goz1.X(jeu0) ? 0x20000 : 0x10000);
        }
        if((v9 & 0x40) != 0) {
            v14 |= 0x180000;
        }
        else if((v7 & 0x180000) == 0) {
            v14 |= (goz1.X(null) ? 0x100000 : 0x80000);
        }
        if((v9 & 0x80) != 0) {
            v14 |= 0xC00000;
            v15 = v9 & 0x80;
        }
        else if((v7 & 0xC00000) == 0) {
            v15 = v9 & 0x80;
            v14 |= (goz1.W(v2) ? 0x800000 : 0x400000);
        }
        else {
            v15 = v9 & 0x80;
        }
        if((v9 & 0x100) != 0) {
            v14 |= 0x6000000;
        }
        else if((v7 & 0x6000000) == 0) {
            v14 |= (goz1.X(null) ? 0x4000000 : 0x2000000);
        }
        if((v9 & 0x200) != 0) {
            v14 |= 0x30000000;
            v16 = v9 & 0x200;
        }
        else if((v7 & 0x30000000) == 0) {
            v16 = v9 & 0x200;
            v14 |= (goz1.X(jjy0) ? 0x20000000 : 0x10000000);
        }
        else {
            v16 = v9 & 0x200;
        }
        if((v9 & 0x400) != 0) {
            v17 = v9 & 0x400;
            v18 = v8 | 6;
        }
        else if((v8 & 6) == 0) {
            v17 = v9 & 0x400;
            v18 = v8 | (goz1.W(v3) ? 4 : 2);
        }
        else {
            v17 = v9 & 0x400;
            v18 = v8;
        }
        if((v9 & 0x800) != 0) {
            v18 |= 0x30;
            v19 = v4;
            v20 = v9 & 0x800;
        }
        else if((v8 & 0x30) == 0) {
            v19 = v4;
            v20 = v9 & 0x800;
            v18 |= (goz1.V(v19) ? 0x20 : 16);
        }
        else {
            v19 = v4;
            v20 = v9 & 0x800;
        }
        if((v9 & 0x1000) != 0) {
            v18 |= 0x180;
        }
        else if((v8 & 0x180) == 0) {
            if(!goz1.Y(((int)z))) {
                v11 = 0x80;
            }
            v18 |= v11;
        }
        if((v9 & 0x2000) != 0) {
            v18 |= 0xC00;
            v21 = v5;
            v22 = v9 & 0x2000;
        }
        else if((v8 & 0xC00) == 0) {
            v21 = v5;
            v22 = v9 & 0x2000;
            v18 |= (goz1.V(v21) ? 0x800 : 0x400);
        }
        else {
            v21 = v5;
            v22 = v9 & 0x2000;
        }
        if((v9 & 0x4000) != 0) {
            v18 |= 0x6000;
        }
        else if((v8 & 0x6000) == 0) {
            v18 |= (goz1.V(v6) ? 0x4000 : 0x2000);
        }
        if((0x8000 & v9) != 0) {
            v18 |= 0x30000;
            v23 = 0x8000 & v9;
        }
        else if((v8 & 0x30000) == 0) {
            v23 = 0x8000 & v9;
            v18 |= (goz1.Z(map0) ? 0x20000 : 0x10000);
        }
        else {
            v23 = 0x8000 & v9;
        }
        if((0x10000 & v9) != 0) {
            v18 |= 0x180000;
            v24 = 0x10000 & v9;
        }
        else if((v8 & 0x180000) == 0) {
            v24 = 0x10000 & v9;
            v18 |= (goz1.Z(ibts0) ? 0x100000 : 0x80000);
        }
        else {
            v24 = 0x10000 & v9;
        }
        if((0xC00000 & v8) == 0) {
            v18 |= ((v9 & 0x20000) != 0 || !goz1.X(jbn0) ? 0x400000 : 0x800000);
        }
        if((306783379 & v14) == 306783378 && (0x492493 & v18) == 4793490 && goz1.ac()) {
            goz1.G();
            v25 = v1;
            jjy1 = jjy0;
            v26 = v6;
            map1 = map0;
            ibts1 = ibts0;
            jbn1 = jbn0;
            goz2 = goz1;
            v27 = v21;
            v28 = v12;
            hfc2 = hfc1;
            jeu1 = jeu0;
            v29 = v3;
            z1 = (int)z;
            v30 = v19;
            v31 = v2;
        }
        else {
            goz1.I();
            if((v7 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v9 & 0x20000) != 0) {
                    v18 &= 0xFE3FFFFF;
                }
                jeu2 = jeu0;
                v32 = v2;
                jjy2 = jjy0;
                v33 = v3;
                z2 = (int)z;
                v34 = v6;
                map2 = map0;
                ibts2 = ibts0;
                jbn2 = jbn0;
                v35 = v21;
                v36 = v19;
                v37 = v12;
                hfc3 = hfc1;
                v38 = v1;
            }
            else {
                if((v9 & 2) != 0) {
                    hfc1 = hfc.e;
                }
                long v39 = (v9 & 4) == 0 ? v12 : hll.i;
                long v40 = v13 == 0 ? v1 : jlp.a;
                jeu jeu3 = (v9 & 0x20) == 0 ? jeu0 : null;
                long v41 = v15 == 0 ? v2 : jlp.a;
                long v42 = v17 == 0 ? v3 : jlp.a;
                if(v20 != 0) {
                    v19 = 1;
                }
                if(v22 != 0) {
                    v21 = 0x7FFFFFFF;
                }
                Map map3 = v23 == 0 ? map0 : ibpt.a;
                if(v24 == 0) {
                    jeu4 = jeu3;
                    ibts3 = ibts0;
                }
                else {
                    goz1.M(0x6E3C21FE);
                    Object object0 = goz1.j();
                    jeu4 = jeu3;
                    if(object0 == gop.a) {
                        object0 = new ftzb();
                        goz1.P(object0);
                    }
                    ibts3 = (ibts)object0;
                    goz1.x();
                }
                if((v9 & 0x20000) == 0) {
                    jbn2 = jbn0;
                    ibts2 = ibts3;
                }
                else {
                    v18 &= 0xFE3FFFFF;
                    ibts2 = ibts3;
                    jbn2 = (jbn)goz1.h(gdh.a);
                }
                v36 = v19;
                z2 = ((v9 & 0x1000) == 0 ? 1 : 0) ^ 1 | ((int)z);
                v37 = v39;
                hfc3 = hfc1;
                v32 = v41;
                v35 = v21;
                v34 = ((v9 & 0x4000) == 0 ? 1 : 0) ^ 1 | v6;
                v38 = v40;
                jjy2 = v16 == 0 ? jjy0 : null;
                v33 = v42;
                map2 = map3;
                jeu2 = jeu4;
            }
            goz1.w();
            if((fryv0 instanceof fryq)) {
                goz1.M(-494246170);
                goz2 = goz1;
                gdh.c(((fryq)fryv0).a, hfc3, v37, v38, null, jeu2, null, v32, null, jjy2, v33, v36, z2, v35, v34, map2, ibts2, jbn2, goz2, v14 & 0x3F0 | v14 << 3 & 0xE000 | v14 << 3 & 0x70000 | v14 << 3 & 0x380000 | v14 << 3 & 0x1C00000 | v14 << 3 & 0xE000000 | v14 << 3 & 0x70000000, v18 << 3 & 0x380000 | (v14 >> 27 & 14 | v18 << 3 & 0x70 | v18 << 3 & 0x380 | v18 << 3 & 0x1C00 | v18 << 3 & 0xE000 | v18 << 3 & 0x70000) | v18 << 3 & 0x1C00000 | v18 << 3 & 0xE000000, 8);
                map4 = map2;
                goz2.x();
            }
            else {
                map4 = map2;
                if(!(fryv0 instanceof fryu) && !(fryv0 instanceof fryr) && !(fryv0 instanceof frys)) {
                    if((fryv0 instanceof fryt)) {
                        goz1.M(0xE28B0A5E);
                        String s = kak.a(((fryt)fryv0).a);
                        goz1.M(0x9312BC28);
                        jat jat0 = new jat(fpu.a(goz1).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jjz.b, null, 0xEFFE);
                        goz1.x();
                        iwj iwj0 = iwx.b(s, new jbf(jat0, 14), 4);
                        int v43 = iwj0.b();
                        do {
                            --v43;
                        }
                        while(v43 > 0 && ibzk.D(String.valueOf(iwj0.a(v43))));
                        goz2 = goz1;
                        gdh.c(iwj0.e(0, v43 + 1), hfc3, v37, v38, null, jeu2, null, v32, null, jjy2, v33, v36, z2, v35, v34, null, ibts2, jbn2, goz2, v14 & 0x3F0 | v14 << 3 & 0xE000 | v14 << 3 & 0x70000 | v14 << 3 & 0x380000 | v14 << 3 & 0x1C00000 | v14 << 3 & 0xE000000 | v14 << 3 & 0x70000000, v14 >> 27 & 14 | v18 << 3 & 0x70 | v18 << 3 & 0x380 | v18 << 3 & 0x1C00 | v18 << 3 & 0xE000 | v18 << 3 & 0x70000 | v18 << 3 & 0x1C00000 | v18 << 3 & 0xE000000, 0x10008);
                        goz1.x();
                        goto label_258;
                    }
                    goz1.M(0xE28A662E);
                    goz1.x();
                    throw new ibnq();
                }
                else {
                    goz1.M(0xE28ABC5F);
                    gdh.b(fryv0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b))).toString(), hfc3, v37, v38, jeu2, v32, null, jjy2, v33, v36, z2, v35, v34, ibts2, jbn2, goz1, v14 & 0x3F0 | v14 << 3 & 0xE000 | v14 << 3 & 0x70000 | v14 << 3 & 0x380000 | v14 << 3 & 0x1C00000 | v14 << 3 & 0xE000000 | v14 << 3 & 0x70000000, v18 & 0x1C00000 | (v18 << 3 & 0x70 | v14 >> 27 & 14 | v18 << 3 & 0x380 | v18 << 3 & 0x1C00 | v18 << 3 & 0xE000 | v18 << 3 & 0x70000 | v18 & 0x380000), 8);
                    ibts2 = ibts2;
                    jbn2 = jbn2;
                    goz2 = goz1;
                    v35 = v35;
                    v34 = v34;
                    v36 = v36;
                    z2 = z2;
                    v33 = v33;
                    jjy2 = jjy2;
                    v32 = v32;
                    jeu2 = jeu2;
                    goz2.x();
                }
            }
        label_258:
            hfc2 = hfc3;
            v28 = v37;
            v25 = v38;
            v31 = v32;
            jjy1 = jjy2;
            v29 = v33;
            v30 = v36;
            z1 = z2;
            v26 = v34;
            ibts1 = ibts2;
            jbn1 = jbn2;
            map1 = map4;
            jeu1 = jeu2;
            v27 = v35;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftzc(fryv0, hfc2, v28, v25, jeu1, v31, jjy1, v29, v30, z1, v27, v26, map1, ibts1, jbn1, v7, v8, v9);
        }
    }

    public static final void b(fryv fryv0, hfc hfc0, long v, long v1, int v2, boolean z, int v3, int v4, Map map0, ibts ibts0, jbn jbn0, long v5, float f, float f1, goz goz0, int v6, int v7, int v8) {
        long v23;
        int v22;
        ibts ibts2;
        Map map2;
        int v21;
        boolean z2;
        hfc hfc2;
        Map map1;
        int v20;
        long v19;
        int v18;
        goz goz2;
        ibts ibts1;
        boolean z1;
        long v17;
        hfc hfc1;
        int v15;
        int v14;
        long v12;
        fryv fryv1;
        int v9;
        goz goz1 = goz0.ao(0x4EABAEB);
        if((v8 & 1) != 0) {
            v9 = v6 | 6;
            fryv1 = fryv0;
        }
        else if((v6 & 6) == 0) {
            fryv1 = fryv0;
            v9 = (goz1.Z(fryv1) ? 4 : 2) | v6;
        }
        else {
            fryv1 = fryv0;
            v9 = v6;
        }
        if((v8 & 2) != 0) {
            v9 |= 0x30;
        }
        else if((v6 & 0x30) == 0) {
            v9 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v8 & 4) != 0) {
            v9 |= 0x180;
        }
        else if((v6 & 0x180) == 0) {
            v9 |= (goz1.W(v) ? 0x100 : 0x80);
        }
        if((v8 & 8) != 0) {
            v9 |= 0xC00;
        }
        else if((v6 & 0xC00) == 0) {
            v9 |= (goz1.X(null) ? 0x800 : 0x400);
        }
        if((v8 & 16) != 0) {
            v9 |= 0x6000;
        }
        else if((v6 & 0x6000) == 0) {
            v9 |= (goz1.X(null) ? 0x4000 : 0x2000);
        }
        int v10 = 0x10000;
        if((v8 & 0x20) != 0) {
            v9 |= 0x30000;
        }
        else if((v6 & 0x30000) == 0) {
            v9 |= (goz1.X(null) ? 0x20000 : 0x10000);
        }
        int v11 = 0x80000;
        if((v8 & 0x40) == 0) {
            v12 = v1;
            if((v6 & 0x180000) == 0) {
                v9 |= (goz1.W(v12) ? 0x100000 : 0x80000);
            }
        }
        else {
            v9 |= 0x180000;
            v12 = v1;
        }
        int v13 = 0x800000;
        if((v8 & 0x80) != 0) {
            v9 |= 0xC00000;
        }
        else if((v6 & 0xC00000) == 0) {
            v9 |= (goz1.X(null) ? 0x800000 : 0x400000);
        }
        if((v8 & 0x100) != 0) {
            v9 |= 0x6000000;
        }
        else if((v6 & 0x6000000) == 0) {
            v9 |= (goz1.X(null) ? 0x4000000 : 0x2000000);
        }
        if((v8 & 0x200) == 0) {
            v14 = v8 & 0x200;
            if((v6 & 0x30000000) == 0) {
                v15 = v2;
                v9 |= (goz1.V(v15) ? 0x20000000 : 0x10000000);
            }
            else {
                v15 = v2;
            }
        }
        else {
            v9 |= 0x30000000;
            v14 = v8 & 0x200;
            v15 = v2;
        }
        int v16 = ((v7 & 0x30) == 0 ? v7 | 6 | (goz1.V(v3) ? 0x20 : 16) : v7 | 6) | 0x6D80;
        if((v7 & 0x30000) == 0) {
            if(goz1.X(jbn0)) {
                v10 = 0x20000;
            }
            v16 |= v10;
        }
        if((v7 & 0x180000) == 0) {
            if(goz1.W(v5)) {
                v11 = 0x100000;
            }
            v16 |= v11;
        }
        if((v7 & 0xC00000) == 0) {
            if(!goz1.U(f)) {
                v13 = 0x400000;
            }
            v16 |= v13;
        }
        if((v7 & 0x6000000) == 0) {
            v16 |= (goz1.U(f1) ? 0x4000000 : 0x2000000);
        }
        if((306783379 & v9) == 306783378 && (0x2492493 & v16) == 0x2492492 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            v17 = v;
            z1 = z;
            ibts1 = ibts0;
            goz2 = goz1;
            v18 = v15;
            v19 = v12;
            v20 = v4;
            map1 = map0;
        }
        else {
            goz1.I();
            if((v6 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                hfc2 = hfc0;
                z2 = z;
                v21 = v4;
                map2 = map0;
                ibts2 = ibts0;
                v22 = v15;
                v23 = v;
            }
            else {
                hfc2 = (v8 & 2) == 0 ? hfc0 : hfc.e;
                long v24 = (v8 & 4) == 0 ? v : hll.i;
                if((v8 & 0x40) != 0) {
                    v12 = jlp.a;
                }
                if(v14 != 0) {
                    v15 = 1;
                }
                ibpt ibpt0 = ibpt.a;
                goz1.M(0x6E3C21FE);
                Object object0 = goz1.j();
                if(object0 == gop.a) {
                    object0 = new ftyz();
                    goz1.P(object0);
                }
                goz1.x();
                map2 = ibpt0;
                ibts2 = (ibts)object0;
                z2 = true;
                v21 = 1;
                v22 = v15;
                v23 = v24;
            }
            goz1.w();
            jks jks0 = (jks)goz1.h(ipa.d);
            long v25 = jks0.em(jks0.eg(f1) * (jlp.a(v5) / f));
            jlq.g(v25);
            goz2 = goz1;
            ftzd.a(fryv1, hfc2, v23, v25, null, v12, null, jlq.f(v25 & 0xFF00000000L, ((float)(1.2 * ((double)jlp.a(v25))))), v22, z2, v3, v21, map2, ibts2, jbn0, goz2, v9 & 0x3FE | 0xE000 & v9 << 3 | 0x70000 & v9 << 3 | 0x380000 & v9 << 3 | 0x1C00000 & v9 << 3 | 0xE000000 & v9 << 3 | v9 << 3 & 0x70000000, v9 >> 24 & 0x70 | v16 << 6 & 0x380 | v16 << 6 & 0x1C00 | 0xE000 & v16 << 6 | 0x70000 & v16 << 6 | 0x380000 & v16 << 6 | v16 << 6 & 0x1C00000, 0);
            hfc1 = hfc2;
            v17 = v23;
            v19 = v12;
            v18 = v22;
            z1 = z2;
            v20 = v21;
            map1 = map2;
            ibts1 = ibts2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftza(fryv0, hfc1, v17, v19, v18, z1, v3, v20, map1, ibts1, jbn0, v5, f, f1, v6, v7, v8);
        }
    }
}

