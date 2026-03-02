import androidx.compose.animation.AnimatedContentTransitionScopeImpl.SizeModifierElement;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cau {
    public static final void a(Object object0, hfc hfc0, ibts ibts0, hel hel0, String s, ibts ibts1, ibty ibty0, goz goz0, int v, int v1) {
        ibts ibts5;
        hel hel3;
        ibts ibts4;
        hfc hfc3;
        String s2;
        ibts ibts3;
        int v4;
        hfc hfc2;
        ibty ibty1;
        hel hel1;
        ibts ibts2;
        hfc hfc1;
        goz goz1 = goz0.ao(0x598416E0);
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(object0) : goz1.Z(object0)) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            ibts2 = ibts0;
        }
        else if((v & 0x180) == 0) {
            ibts2 = ibts0;
            v2 |= (goz1.Z(ibts2) ? 0x100 : 0x80);
        }
        else {
            ibts2 = ibts0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            hel1 = hel0;
        }
        else if((v & 0xC00) == 0) {
            hel1 = hel0;
            v2 |= (goz1.X(hel1) ? 0x800 : 0x400);
        }
        else {
            hel1 = hel0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (goz1.X(s) ? 0x4000 : 0x2000);
        }
        int v3 = v2 | 0x30000;
        if((0x180000 & v) == 0) {
            ibty1 = ibty0;
            v3 |= (goz1.Z(ibty1) ? 0x100000 : 0x80000);
        }
        else {
            ibty1 = ibty0;
        }
        if(goz1.ad((0x92493 & v3) != 0x92492, v3 & 1)) {
            if((v1 & 2) == 0) {
                v4 = v1 & 16;
                hfc2 = hfc1;
            }
            else {
                hfc2 = hfc.e;
                v4 = v1 & 16;
            }
            if((v1 & 4) == 0) {
                ibts3 = ibts2;
            }
            else {
                Object object1 = goz1.j();
                if(object1 == gop.a) {
                    object1 = cah.a;
                    goz1.P(object1);
                }
                ibts3 = (ibts)object1;
            }
            hel hel2 = (v1 & 8) == 0 ? hel1 : hei.a;
            String s1 = v4 == 0 ? s : "AnimatedContent";
            Object object2 = goz1.j();
            if(object2 == gop.a) {
                object2 = cai.a;
                goz1.P(object2);
            }
            cau.b(clz.d(object0, s1, goz1, v3 >> 9 & 0x70 | v3 & 14, 0), hfc2, ibts3, hel2, ((ibts)object2), ibty1, goz1, v3 & 0x1FF0 | 0xE000 & v3 >> 3 | v3 >> 3 & 0x70000);
            s2 = s1;
            hfc3 = hfc2;
            ibts4 = ibts3;
            hel3 = hel2;
            ibts5 = (ibts)object2;
        }
        else {
            goz1.G();
            s2 = s;
            hfc3 = hfc1;
            ibts4 = ibts2;
            hel3 = hel1;
            ibts5 = ibts1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new caj(object0, hfc3, ibts4, hel3, s2, ibts5, ibty0, v, v1);
        }
    }

    public static final void b(clj clj0, hfc hfc0, ibts ibts0, hel hel0, ibts ibts1, ibty ibty0, goz goz0, int v) {
        hfc hfc1;
        clb clb0;
        SnapshotStateList snapshotStateList0;
        cbm cbm1;
        clj clj1 = clj0;
        goz goz1 = goz0.ao(0x1E804E2F);
        int v1 = (v & 6) == 0 ? (goz1.X(clj1) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.X(hel0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibts1) ? 0x4000 : 0x2000);
        }
        ibty ibty1 = ibty0;
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibty1) ? 0x20000 : 0x10000);
        }
        if(goz1.ad((74899 & v1) != 74898, v1 & 1)) {
            jlm jlm0 = (jlm)goz1.h(ipa.i);
            Object object0 = goz1.j();
            if((v1 & 14) == 4 || object0 == gop.a) {
                object0 = new cbm(clj1, hel0, jlm0);
                goz1.P(object0);
            }
            cbm cbm0 = (cbm)object0;
            Object object1 = goz1.j();
            if((v1 & 14) == 4 || object1 == gop.a) {
                Object[] arr_object = {clj1.f()};
                object1 = new SnapshotStateList();
                ((SnapshotStateList)object1).addAll(ibpg.N(arr_object));
                goz1.P(object1);
            }
            Object object2 = goz1.j();
            if((v1 & 14) == 4 || object2 == gop.a) {
                object2 = new bzk(null);
                goz1.P(object2);
            }
            if(!((SnapshotStateList)object1).contains(clj1.f())) {
                ((SnapshotStateList)object1).clear();
                ((SnapshotStateList)object1).add(clj1.f());
            }
            if(ibuq.m(clj1.f(), clj1.g())) {
                if(((SnapshotStateList)object1).a() != 1 || !ibuq.m(((SnapshotStateList)object1).get(0), clj1.f())) {
                    ((SnapshotStateList)object1).clear();
                    ((SnapshotStateList)object1).add(clj1.f());
                }
                if(((bzk)object2).e != 1 || ((bzk)object2).c(clj1.f())) {
                    ((bzk)object2).j();
                }
                cbm0.b = hel0;
                cbm0.c = jlm0;
            }
            if(!ibuq.m(clj1.f(), clj1.g()) && !((SnapshotStateList)object1).contains(clj1.g())) {
                int v2 = 0;
                hcz hcz0 = new hcz(((SnapshotStateList)object1), 0);
                while(true) {
                    if(!hcz0.hasNext()) {
                        v2 = -1;
                        break;
                    }
                    Object object3 = hcz0.next();
                    if(ibuq.m(ibts1.a(object3), ibts1.a(clj1.g()))) {
                        break;
                    }
                    ++v2;
                }
                if(v2 == -1) {
                    ((SnapshotStateList)object1).add(clj1.g());
                }
                else {
                    ((SnapshotStateList)object1).set(v2, clj1.g());
                }
            }
            if(((bzk)object2).c(clj1.g()) && ((bzk)object2).c(clj1.f())) {
                goz1.M(1925990355);
                goz1.x();
                cbm1 = cbm0;
                snapshotStateList0 = (SnapshotStateList)object1;
            }
            else {
                goz1.M(0x7535EF71);
                ((bzk)object2).j();
                int v3 = ((SnapshotStateList)object1).a();
                int v4 = 0;
                while(v4 < v3) {
                    Object object4 = ((SnapshotStateList)object1).get(v4);
                    ((bzk)object2).k(object4, gzf.e(0xFE931559, new car(clj1, object4, ibts0, cbm0, ((SnapshotStateList)object1), ibty1), goz1));
                    ++v4;
                    clj1 = clj0;
                    ibty1 = ibty0;
                    cbm0 = cbm0;
                }
                cbm1 = cbm0;
                snapshotStateList0 = (SnapshotStateList)object1;
                goz1.x();
            }
            cld cld0 = clj0.e();
            int v5 = goz1.X(cbm1);
            int v6 = goz1.X(cld0) | v5;
            Object object5 = goz1.j();
            if(v6 != 0 || object5 == gop.a) {
                object5 = (cct)ibts0.a(cbm1);
                goz1.P(object5);
            }
            boolean z = goz1.X(cbm1);
            Object object6 = goz1.j();
            if(z || object6 == gop.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object6 = parcelableSnapshotMutableState0;
            }
            gui gui0 = guf.a(((cct)object5).d, goz1);
            clj clj2 = cbm1.a;
            if(ibuq.m(clj2.f(), clj2.g())) {
                cbm.g(((gra)object6), false);
            }
            else if(gui0.a() != null) {
                cbm.g(((gra)object6), true);
            }
            if(((Boolean)((gra)object6).a()).booleanValue()) {
                goz1.M(0x50A7E5F9);
                clb0 = clz.h(clj2, cmv.h, goz1, 0);
                boolean z1 = goz1.X(clb0);
                Object object7 = goz1.j();
                if(z1 || object7 == gop.a) {
                    cgq cgq0 = (cgq)gui0.a();
                    object7 = hhi.b(hfc.e);
                    goz1.P(object7);
                }
                hfc1 = (hfc)object7;
                goz1.x();
            }
            else {
                goz1.M(0x50ABF533);
                goz1.x();
                cbm1.e = null;
                hfc1 = hfc.e;
                clb0 = null;
            }
            hfc hfc2 = hfc0.a(hfc1.a(new AnimatedContentTransitionScopeImpl.SizeModifierElement(clb0, gui0, cbm1)));
            Object object8 = goz1.j();
            if(object8 == gop.a) {
                object8 = new caw(cbm1);
                goz1.P(object8);
            }
            long v7 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v8 = (int)(v7 ^ v7 >>> 0x20);
            guo.b(goz1, ((caw)object8), iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v8))) {
                Integer integer0 = v8;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc3, iej.c);
            goz1.M(-860173498);
            int v9 = snapshotStateList0.a();
            for(int v10 = 0; v10 < v9; ++v10) {
                Object object9 = snapshotStateList0.get(v10);
                goz1.K(-2026002954, ibts1.a(object9));
                ibtw ibtw1 = (ibtw)((bzk)object2).a(object9);
                if(ibtw1 == null) {
                    goz1.M(0x6077A733);
                }
                else {
                    goz1.M(-2026001778);
                    ibtw1.a(goz1, Integer.valueOf(0));
                }
                goz1.x();
                goz1.x();
            }
            goz1.x();
            goz1.z();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cas(clj0, hfc0, ibts0, hel0, ibts1, ibty0, v);
        }
    }
}

