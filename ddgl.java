import java.util.Map;

public final class ddgl {
    public static final void a(iwj iwj0, hfc hfc0, Map map0, long v, jbn jbn0, float f, goz goz0, int v1) {
        Map map3;
        float f2;
        Map map2;
        float f1;
        Map map1;
        long v4;
        hfc hfc1;
        goz goz1 = goz0.ao(877484601);
        int v2 = (v1 & 6) == 0 ? (goz1.X(iwj0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        int v3 = v2 | 0x180;
        if((v1 & 0xC00) == 0) {
            v4 = v;
            v3 |= (goz1.W(v4) ? 0x800 : 0x400);
        }
        else {
            v4 = v;
        }
        if((v1 & 0x6000) == 0) {
            v3 |= (goz1.X(jbn0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x30000) == 0) {
            v3 |= (goz1.V(3) ? 0x20000 : 0x10000);
        }
        if((0x92493 & (v3 | 0x180000)) == 0x92492 && goz1.ac()) {
            goz1.G();
            map1 = map0;
            f1 = f;
        }
        else {
            goz1.I();
            if((v1 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                map2 = map0;
                f2 = f;
            }
            else {
                map2 = ibpt.a;
                f2 = 8.0f;
            }
            goz1.w();
            goz1.M(-1224400529);
            int v5 = (((v3 | 0x180000) & 14) == 4 ? 1 : 0) | (((v3 | 0x180000) & 0x70) == 0x20 ? 1 : 0) | (((v3 | 0x180000) & 0x1C00) == 0x800 ? 1 : 0) | (((0x70000 & (v3 | 0x180000) ^ 0x30000) <= 0x20000 || !goz1.V(3)) && ((v3 | 0x180000) & 0x30000) != 0x20000 ? 0 : 1) | goz1.Z(map2);
            int v6 = ((0xE000 & (v3 | 0x180000) ^ 0x6000) <= 0x4000 || !goz1.X(jbn0)) && ((v3 | 0x180000) & 0x6000) != 0x4000 ? 0 : 1;
            Object object0 = goz1.j();
            if((v5 | v6 | (((v3 | 0x180000) & 0x380000) == 0x100000 ? 1 : 0)) == 0 && object0 != gop.a) {
                map3 = map2;
                f1 = f2;
            }
            else {
                map3 = map2;
                f1 = f2;
                ddgd ddgd0 = new ddgd(iwj0, hfc1, v4, map3, jbn0, f1);
                goz1.P(ddgd0);
                object0 = ddgd0;
            }
            goz1.x();
            icl.a(null, ((ibtw)object0), goz1, 0, 1);
            map1 = map3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddge(iwj0, hfc0, map1, v, jbn0, f1, v1);
        }
    }
}

