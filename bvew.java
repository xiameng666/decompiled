import java.util.ArrayList;

public final class bvew {
    public static final void a(eoqf eoqf0, bvgq bvgq0, goz goz0, int v) {
        ibuq.f(eoqf0, "owner");
        ibuq.f(bvgq0, "uiModel");
        goz goz1 = goz0.ao(-1600037755);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(eoqf0) : goz1.Z(eoqf0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(bvgq0) : goz1.Z(bvgq0)) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            grx grx0 = cmdp.a;
            cmdi cmdi0 = (cmdi)goz1.h(grx0);
            goz1.M(5004770);
            boolean z = goz1.X(cmdi0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = bvgq0.e.a(cmdi0);
                goz1.P(object0);
            }
            goz1.x();
            ibuq.f(eoqf0, "owner");
            ibuq.f(bvgq0, "uiModel");
            ibuq.f(((cmdi)object0), "activityLauncher");
            ArrayList arrayList0 = new ArrayList(ibpo.q(bvgq0.c, 10));
            int v2 = 0;
            for(Object object1: bvgq0.c) {
                if(v2 < 0) {
                    ibpo.m();
                }
                ibuq.f(eoqf0, "owner");
                ibuq.f(((bvgr)object1).a, "name");
                ibuq.f(eoqf0, "owner");
                ibuq.f(((bvgr)object1).a, "entryName");
                ibuq.f(((bvgr)object1).a, "label");
                ibuq.f(((bvgr)object1).a, "name");
                ibuq.f(eoqf0, "owner");
                ibuq.f(((bvgr)object1).a, "label");
                gze gze0 = new gze(0x133E8185, true, new bvev(v2, ((bvgr)object1), bvgq0, ((cmdi)object0)));
                ibuq.f(((bvgr)object1).a, "name");
                ibuq.f(eoqf0, "owner");
                arrayList0.add(new eopy(eosl.a((((bvgr)object1).a + ":" + eoqf0.a + "(null-null)")), ((bvgr)object1).a, ((bvgr)object1).a, eoqf0, eoqa.a, eopz.a, gze0));
                ++v2;
            }
            gpo.a(grx0.c(((cmdi)object0)), gzf.e(0xC4D0D145, new bvep(bvgq0, arrayList0), goz1), goz1, 56);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvel(eoqf0, bvgq0, v);
        }
    }

    public static final void b(hfc hfc0, String s, hmu hmu0, ibth ibth0, cmhx cmhx0, goz goz0, int v) {
        ibuq.f(s, "title");
        ibuq.f(hmu0, "shape");
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(1017831822);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(hmu0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.X(cmhx0) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.g(cmhx0, gzf.e(0xEAD0C0CC, new bves(hfc0, hmu0, ibth0, s), goz1), goz1, v1 >> 12 & 14 | 0x30);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvem(hfc0, s, hmu0, ibth0, cmhx0, v);
        }
    }
}

