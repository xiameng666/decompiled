public final class fufy {
    public static final void a(fufz fufz0, ibtw ibtw0, goz goz0, int v) {
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0x18938C7F);
        int v1 = (v & 6) == 0 ? (goz1.Z(fufz0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(fufz0 == null) {
                goz1.M(0xFA704F10);
                ibtw0.a(goz1, Integer.valueOf(v1 >> 3 & 14));
            }
            else {
                goz1.M(-93525790);
                gpo.b(new gry[]{fsdq.a.c(fufz0.a), fsdq.b.c(fufz0.b)}, gzf.e(0xB5D4F904, new fufx(ibtw0), goz1), goz1, 56);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fufw(fufz0, ibtw0, v);
        }
    }
}

