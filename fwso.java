public final class fwso {
    public static void a(fvwz fvwz0, boolean z) {
        fwso.n(fvwz0, 5, z);
    }

    public static void b(fvwz fvwz0, fwzf fwzf0) {
        fvwz0.a(new fvwx(29, fvwz0.f(), "%1$s", fwzf0, fwzf0.ordinal(), -1, -1));
    }

    public static void c(fvwz fvwz0, fwzf fwzf0, long v, boolean z) {
        fvwz0.a(new fwsg(fvwz0.f(), fwzf0.ordinal(), ((int)v), ((int)z) ^ 1, fwzf0, v, ((boolean)(((int)z)))));
    }

    public static void d(fvwz fvwz0, fwzf fwzf0, int v, boolean z) {
        fvwz0.a(new fvwx(6, fvwz0.f(), "%1$s, late by %3$dms, inDozeMode %4$d", fwzf0, fwzf0.ordinal(), v, ((int)z)));
    }

    public static void e(fvwz fvwz0, fvtm fvtm0, int v) {
        long v1 = fvtm0 == null ? -1L : fvtm0.a();
        fvwz0.a(new fvwy(8, fvwz0.f(), null, fvtm0, ((int)(v1 >> 0x20)), ((int)v1), (fvtm0 == null ? 0 : fvtm0.g.size()) << 16 | ((char)v)));
    }

    public static void f(fvwz fvwz0, int v) {
        fvwz0.a(new fwsi(fvwz0.f(), v, v));
    }

    public static void g(fvwz fvwz0, boolean z) {
        fwso.o(fvwz0, 25, z);
    }

    public static void h(fvwz fvwz0, iapl iapl0) {
        fvwz0.a(new fvwx(0x91, fvwz0.f(), "status is " + iapl0.a, null, iapl0.a.t.r, -1, -1));
    }

    public static void i(fvwz fvwz0, int v, int v1) {
        fvwz0.a(new fvwy(0x95, fvwz0.f(), "statusType=%2$d, details=%3$d", null, v, v1, 0));
    }

    public static void j(fvwz fvwz0, long v, int v1, int v2, int v3, int v4) {
        fvwz0.a(new fvwy(0x84, fvwz0.f(), "a0=%2$d, a1=%3$d, a2=%4$d", null, ((int)v), ((int)(v >>> 0x20)) | v2 << 16, v1 & 0xFF | v3 / 8 << 8 & 0xFF00 | 0xFF0000 & v4 << 16));
    }

    public static void k(fvwz fvwz0, long v, int v1, int v2) {
        fvwz0.a(new fvwy(50, fvwz0.f(), "durationMs=%2$d, type=%3$d, subtype=%4$d", null, ((int)v), v1, v2));
    }

    public static void l(fvwz fvwz0, hecp hecp0, int v, int v1, boolean z) {
        int v6;
        int v5;
        int v4;
        String s;
        long v2 = fvwz0.f();
        if(v1 == 0) {
            int v3 = hecp0.d();
            s = hecp0 + ", scanStatus=0";
            v4 = v & 0xFF | (z ? 0x40000000 : 0x80000000);
            v5 = (int)(v2 - hecp0.m());
            v6 = v3;
        }
        else {
            s = "scanStatus=" + v1;
            v4 = v1 & 0xFF | 0xC0000000;
            v6 = -1;
            v5 = -1;
        }
        fvwz0.a(new fvwy(20, v2, "%s", s, v6, v4, v5));
    }

    public static void m(fvwz fvwz0, boolean z) {
        fwso.n(fvwz0, 21, z);
    }

    public static void n(fvwz fvwz0, int v, boolean z) {
        fvwz0.j(v, (z ? "enabled" : "disabled"), ((int)z));
    }

    public static void o(fvwz fvwz0, int v, boolean z) {
        fvwz0.j(v, (z ? "on" : "off"), ((int)z));
    }

    public static void p(fvwz fvwz0, cjds cjds0) {
        fvwz0.a(new fvwy(15, fvwz0.f(), "[%2$d, %3$d], accuracy=%4$d mm", "MmAcc", GeoMath.l(cjds0.b()), GeoMath.l(cjds0.c()), Math.round(cjds0.d() * 1000.0f)));
    }
}

