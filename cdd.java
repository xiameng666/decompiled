import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cdd {
    public static final void a(Object object0, hfc hfc0, cii cii0, String s, ibtx ibtx0, goz goz0, int v, int v1) {
        cii cii3;
        hfc hfc3;
        String s2;
        int v3;
        hfc hfc2;
        cii cii1;
        hfc hfc1;
        goz goz1 = goz0.ao(0xE168F013);
        boolean z = true;
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
            cii1 = cii0;
        }
        else if((v & 0x180) == 0) {
            cii1 = cii0;
            v2 |= (goz1.Z(cii1) ? 0x100 : 0x80);
        }
        else {
            cii1 = cii0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (goz1.X(s) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= (goz1.Z(ibtx0) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) == 9362) {
            z = false;
        }
        if(goz1.ad(z, v2 & 1)) {
            if((v1 & 2) == 0) {
                v3 = v1 & 8;
                hfc2 = hfc1;
            }
            else {
                hfc2 = hfc.e;
                v3 = v1 & 8;
            }
            cii cii2 = (v1 & 4) == 0 ? cii1 : chm.c(0, 0, null, 7);
            String s1 = v3 == 0 ? s : "Crossfade";
            cdd.b(clz.d(object0, s1, goz1, v2 >> 6 & 0x70 | v2 & 14, 0), hfc2, cii2, null, ibtx0, goz1, v2 & 0xE3F0);
            s2 = s1;
            hfc3 = hfc2;
            cii3 = cii2;
        }
        else {
            goz1.G();
            hfc3 = hfc1;
            cii3 = cii1;
            s2 = s;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ccu(object0, hfc3, cii3, s2, ibtx0, v, v1);
        }
    }

    public static final void b(clj clj0, hfc hfc0, cii cii0, ibts ibts0, ibtx ibtx0, goz goz0, int v) {
        ibts ibts1;
        goz goz1 = goz0.ao(0x901999A2);
        int v1 = (v & 6) == 0 ? (goz1.X(clj0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(cii0) ? 0x100 : 0x80);
        }
        int v2 = (v & 0x6000) == 0 ? v1 | 0xC00 | (goz1.Z(ibtx0) ? 0x4000 : 0x2000) : v1 | 0xC00;
        if(goz1.ad((v2 & 9363) != 9362, v2 & 1)) {
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = ccv.a;
                goz1.P(object0);
            }
            ibts1 = (ibts)object0;
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new SnapshotStateList();
                ((SnapshotStateList)object2).add(clj0.f());
                goz1.P(object2);
            }
            Object object3 = goz1.j();
            if(object3 == object1) {
                object3 = new bzk(null);
                goz1.P(object3);
            }
            if(ibuq.m(clj0.f(), clj0.g())) {
                goz1.M(0x1324F7C8);
                if(((SnapshotStateList)object2).a() == 1 && ibuq.m(((SnapshotStateList)object2).get(0), clj0.g())) {
                    goz1.M(0x12DAF7E0);
                }
                else {
                    goz1.M(0x1327049A);
                    Object object4 = goz1.j();
                    if((v2 & 14) == 4 || object4 == object1) {
                        object4 = new ccw(clj0);
                        goz1.P(object4);
                    }
                    ibpo.G(((SnapshotStateList)object2), ((ibts)object4));
                    ((bzk)object3).j();
                }
                goz1.x();
            }
            else {
                goz1.M(0x12DAF7E0);
            }
            goz1.x();
            if(((bzk)object3).b(clj0.g())) {
                goz1.M(0x12DAF7E0);
            }
            else {
                goz1.M(0x132AF01B);
                int v3 = 0;
                hcz hcz0 = new hcz(((SnapshotStateList)object2), 0);
                while(true) {
                    if(!hcz0.hasNext()) {
                        v3 = -1;
                        break;
                    }
                    Object object5 = hcz0.next();
                    if(ibuq.m(ibts1.a(object5), ibts1.a(clj0.g()))) {
                        break;
                    }
                    ++v3;
                }
                if(v3 == -1) {
                    ((SnapshotStateList)object2).add(clj0.g());
                }
                else {
                    ((SnapshotStateList)object2).set(v3, clj0.g());
                }
                ((bzk)object3).j();
                int v4 = ((SnapshotStateList)object2).a();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Object object6 = ((SnapshotStateList)object2).get(v5);
                    ((bzk)object3).k(object6, gzf.e(0xC84D180B, new cdb(clj0, cii0, object6, ibtx0), goz1));
                }
            }
            goz1.x();
            iau iau0 = dhw.a(hei.a, false);
            long v6 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v7 = (int)(v6 ^ v6 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                Integer integer0 = v7;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            goz1.M(-1312707512);
            int v8 = ((SnapshotStateList)object2).a();
            for(int v9 = 0; v9 < v8; ++v9) {
                Object object7 = ((SnapshotStateList)object2).get(v9);
                goz1.K(0x45D4D0B9, ibts1.a(object7));
                ibtw ibtw1 = (ibtw)((bzk)object3).a(object7);
                if(ibtw1 == null) {
                    goz1.M(0x74C5D4D0);
                }
                else {
                    goz1.M(0x45D4D551);
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
            ibts1 = ibts0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cdc(clj0, hfc0, cii0, ibts1, ibtx0, v);
        }
    }
}

