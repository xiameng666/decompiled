public final class hzl {
    public static final long a(hzk hzk0) {
        return hzk0.j(0L);
    }

    public static final long b(hzk hzk0) {
        return hzk0.l(0L);
    }

    public static final long c(hzk hzk0) {
        return hzk0.k(0L);
    }

    public static final hka d(hzk hzk0) {
        hzk hzk1 = hzk0.ef();
        return hzk1 == null ? new hka(0.0f, 0.0f, ((float)(((int)(((ibq)hzk0).c >> 0x20)))), ((float)(((int)(((ibq)hzk0).c & 0xFFFFFFFFL))))) : hzj.a(hzk1, hzk0);
    }

    public static final hka e(hzk hzk0) {
        return hzj.a(hzl.g(hzk0), hzk0);
    }

    public static final hka f(hzk hzk0, boolean z) {
        float f4;
        float f2;
        hzk hzk1 = hzl.g(hzk0);
        long v = hzk1.g() >> 0x20;
        long v1 = hzk1.g() & 0xFFFFFFFFL;
        hka hka0 = hzk1.o(hzk0, z);
        float f = (float)(((int)v));
        float f1 = 0.0f;
        if(z) {
            f2 = hka0.b < 0.0f ? 0.0f : hka0.b;
            if((f2 > f)) {
                f2 = f;
            }
        }
        else {
            f2 = hka0.b;
        }
        float f3 = (float)(((int)v1));
        if(z) {
            f4 = hka0.c < 0.0f ? 0.0f : hka0.c;
            if((f4 > f3)) {
                f4 = f3;
            }
        }
        else {
            f4 = hka0.c;
        }
        if(z) {
            float f5 = hka0.d < 0.0f ? 0.0f : hka0.d;
            if(f5 <= f) {
                f = f5;
            }
        }
        else {
            f = hka0.d;
        }
        if(z) {
            float f6 = hka0.e;
            if(f6 >= 0.0f) {
                f1 = f6;
            }
            if(f1 <= f3) {
                f3 = f1;
            }
        }
        else {
            f3 = hka0.e;
        }
        if(f2 == f) {
            return hka.a;
        }
        if(f4 != f3) {
            long v2 = hzk1.l(((long)Float.floatToRawIntBits(f2)) << 0x20 | ((long)Float.floatToRawIntBits(f4)) & 0xFFFFFFFFL);
            long v3 = hzk1.l(((long)Float.floatToRawIntBits(f4)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20);
            long v4 = hzk1.l(((long)Float.floatToRawIntBits(f3)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20);
            long v5 = hzk1.l(((long)Float.floatToRawIntBits(f2)) << 0x20 | ((long)Float.floatToRawIntBits(f3)) & 0xFFFFFFFFL);
            float f7 = Float.intBitsToFloat(((int)(v2 >> 0x20)));
            float f8 = Float.intBitsToFloat(((int)(v3 >> 0x20)));
            float f9 = Float.intBitsToFloat(((int)(v5 >> 0x20)));
            float f10 = Float.intBitsToFloat(((int)(v4 >> 0x20)));
            float f11 = Float.intBitsToFloat(((int)(v2 & 0xFFFFFFFFL)));
            float f12 = Float.intBitsToFloat(((int)(v3 & 0xFFFFFFFFL)));
            float f13 = Float.intBitsToFloat(((int)(v5 & 0xFFFFFFFFL)));
            float f14 = Float.intBitsToFloat(((int)(v4 & 0xFFFFFFFFL)));
            return new hka(Math.min(f7, Math.min(f8, Math.min(f9, f10))), Math.min(f11, Math.min(f12, Math.min(f13, f14))), Math.max(f7, Math.max(f8, Math.max(f9, f10))), Math.max(f11, Math.max(f12, Math.max(f13, f14))));
        }
        return hka.a;
    }

    public static final hzk g(hzk hzk0) {
        hzk hzk3;
        hzk hzk2;
        for(hzk hzk1 = hzk0.ef(); true; hzk1 = hzk0.ef()) {
            hzk2 = hzk0;
            hzk0 = hzk1;
            if(hzk0 == null) {
                break;
            }
        }
        ihy ihy0 = (hzk2 instanceof ihy) ? ((ihy)hzk2) : null;
        if(ihy0 == null) {
            return hzk2;
        }
        do {
            hzk3 = ihy0;
            ihy0 = ihy0.x;
        }
        while(ihy0 != null);
        return hzk3;
    }

    public static hka h(hzk hzk0) {
        return hzl.f(hzk0, true);
    }
}

