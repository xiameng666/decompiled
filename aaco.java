import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class aaco {
    public static final void a(zhu zhu0, String s, hfc hfc0, boolean z, ibth ibth0, boolean z1, boolean z2, goz goz0, int v, int v1) {
        int v13;
        Object object4;
        Object object0;
        hfc hfc2;
        goz goz2;
        boolean z5;
        boolean z4;
        boolean z3;
        ibth ibth1;
        hfc hfc1;
        String s1;
        int v2;
        goz goz1 = goz0.ao(0x3F469294);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(zhu0) : goz1.Z(zhu0)) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            s1 = s;
        }
        else if((v & 0x30) == 0) {
            s1 = s;
            v2 |= (goz1.X(s1) ? 0x20 : 16);
        }
        else {
            s1 = s;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            hfc1 = hfc0;
        }
        else if((v & 0x180) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x100 : 0x80);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (goz1.Y(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            ibth1 = ibth0;
        }
        else if((v & 0x6000) == 0) {
            ibth1 = ibth0;
            v2 |= (goz1.Z(ibth1) ? 0x4000 : 0x2000);
        }
        else {
            ibth1 = ibth0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (goz1.Y(z1) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (goz1.Y(z2) ? 0x100000 : 0x80000);
        }
        int v3 = 1;
        if((0x92493 & v2) == 0x92492 && goz1.ac()) {
            goz1.G();
            z3 = z;
            z4 = z1;
            z5 = z2;
            goz2 = goz1;
            hfc2 = hfc1;
        }
        else {
            hfc hfc3 = (v1 & 4) == 0 ? hfc1 : hfc.e;
            if((v1 & 16) != 0) {
                ibth1 = null;
            }
            int v4 = ((v1 & 0x20) == 0 ? 1 : 0) & z1;
            int v5 = ((v1 & 0x40) == 0 ? 1 : 0) & z2;
            lps lps0 = (lps)goz1.h(ltr.a);
            aabl aabl0 = (aabl)goz1.h(aadh.h);
            if(zhu0 == null) {
                object0 = null;
            }
            else {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aatc.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                String s2 = zhu0.a;
                ibuq.f(s2, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aatc aatc0 = (aatc)hftp0.b_message;
                s2.getClass();
                aatc0.b = s2;
                String s3 = zhu0.b;
                ibuq.f(s3, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s3.getClass();
                ((aatc)hftv0).c = s3;
                int v6 = zhu0.c;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((aatc)hftv1).d = v6;
                boolean z6 = zhu0.d;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((aatc)hftp0.b_message).e = z6;
                ProtoLiteMessage hftv2 = hftp0.N_build();
                ibuq.e(hftv2, "build(...)");
                object0 = (aatc)hftv2;
            }
            gfsx gfsx0 = gfsx.l(object0);
            goz1.M(0x6E3C21FE);
            Object object1 = goz1.j();
            Object object2 = gop.a;
            if(object1 == object2) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object1 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            int v7 = (int)((jks)goz1.h(ipa.d)).eg(80.0f);
            iau iau0 = dhw.a(hei.a, false);
            long v8 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            int v9 = z | ((v1 & 8) == 0 ? 1 : 0) ^ 1;
            hfc hfc4 = hew.c(goz1, hfc3);
            ibth ibth2 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth2);
            }
            else {
                goz1.T();
            }
            int v10 = (int)(v8 ^ v8 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v10))) {
                Integer integer0 = v10;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc4, iej.c);
            hfc hfc5 = iqn.a(dls.v(hfc.e), "account-particle-disc");
            goz1.M(-1224400529);
            int v11 = goz1.Z(aabl0) | ((0x70000 & v2) == 0x20000 ? 1 : 0) | ((0x380000 & v2) == 0x100000 ? 1 : 0) | goz1.Z(lps0) | goz1.V(v7);
            Object object3 = goz1.j();
            if(v11 == 0) {
                object4 = object2;
                if(object3 == object4) {
                    object3 = new aacl(((gra)object1), aabl0, ((boolean)v4), ((boolean)v5), lps0, v7);
                    goz1.P(object3);
                }
            }
            else {
                object4 = object2;
                object3 = new aacl(((gra)object1), aabl0, ((boolean)v4), ((boolean)v5), lps0, v7);
                goz1.P(object3);
            }
            goz1.x();
            goz1.M(-1224400529);
            int v12 = goz1.Z(gfsx0);
            if((v2 & 0x70) != 0x20) {
                v3 = 0;
            }
            Object object5 = goz1.j();
            if((v12 | ((v2 & 0x1C00) == 0x800 ? 1 : 0) | ((0xE000 & v2) == 0x4000 ? 1 : 0) | v3) == 0 && object5 != object4) {
                v13 = v9;
            }
            else {
                object5 = new aacm(((gra)object1), gfsx0, ((boolean)v9), ibth1, s1);
                v13 = v9;
                goz1.P(object5);
            }
            goz1.x();
            jnl.b(((ibts)object3), hfc5, ((ibts)object5), goz1, 0x30, 0);
            goz2 = goz1;
            goz2.z();
            z3 = v13;
            hfc2 = hfc3;
            z4 = v4;
            z5 = v5;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new aacn(zhu0, s, hfc2, z3, ibth1, z4, z5, v, v1);
        }
    }
}

