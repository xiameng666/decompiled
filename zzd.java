public final class zzd {
    public static final void a(boolean z, hfc hfc0, ibtw ibtw0, goz goz0, int v) {
        goz goz2;
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0xB68206C6);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            gne gne0 = gmv.c(goz1);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = gqe.a(ibru.a, goz1);
                goz1.P(object0);
            }
            gui gui0 = chg.c((z ? 1.0f : 0.0f), chm.c(300, 0, null, 6), goz1, 0x30, 28);
            ibtw0.a(goz1, Integer.valueOf(v1 >> 6 & 14));
            gmm gmm0 = gmm.a;
            long v2 = cchl.d() ? zyp.d : zyp.c;
            long v3 = cchl.d() ? zyp.b : zyp.a;
            goz1.M(505133062);
            goz1.M(5004770);
            boolean z1 = goz1.X(gne0);
            Object object2 = goz1.j();
            if(z1 || object2 == object1) {
                object2 = new zzc(gne0, null);
                goz1.P(object2);
            }
            goz1.x();
            icbb.b(((icck)object0), null, null, ((ibtw)object2), 3);
            goz1.x();
            goz2 = goz1;
            gmm0.a(gne0, true, hlv.c(hfc0, zzd.b(gui0), zzd.b(gui0), 0.0f, 0.0f, null, false, 0x7FFFC), v2, v3, 0.0f, goz2, 0x30, 0x20);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new zzb(z, hfc0, ibtw0, v);
        }
    }

    private static final float b(gui gui0) {
        return ((Number)gui0.a()).floatValue();
    }
}

