public final class cho {
    public static final cht a(cmc cmc0, Object object0) {
        cht cht0 = (cht)cmc0.a.a(object0);
        cht0.d();
        return cht0;
    }

    public static chn b(float f, float f1, int v) {
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        chp chp0 = new chp(f1);
        return new chn(cmv.a, f, chp0, 0x8000000000000000L, 0x8000000000000000L, false);
    }

    public static chn c(chn chn0, float f, float f1, int v) {
        if((v & 1) != 0) {
            f = ((Number)chn0.a()).floatValue();
        }
        if((v & 2) != 0) {
            f1 = ((chp)chn0.a).a;
        }
        long v1 = chn0.b;
        long v2 = chn0.c;
        boolean z = chn0.d;
        chp chp0 = new chp(f1);
        return new chn(chn0.e, f, chp0, v1, v2, z);
    }
}

