import java.util.Arrays;

public final class esvs extends esxf {
    public static final esvs a;
    public static final esvs b;
    public static final esvs c;
    public static final esvs d;
    public static final esvs e;
    public static final esvs f;
    public static final esvs g;
    public static final esvs h;
    public static final esvs i;
    public static final esvs j;
    public static final esvs k;
    public static final esvs l;

    static {
        esvs.a = new esvs(new byte[]{50, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 0x30, 49});
        esvs esvs0 = new esvs(new byte[]{(byte)0xA0, 0, 0, 0, 4});
        esvs.b = esvs0;
        esvs esvs1 = new esvs(new byte[]{(byte)0xA0, 0, 0, 0, 3});
        esvs.c = esvs1;
        esvs esvs2 = new esvs(new byte[]{(byte)0xA0, 0, 0, 3, 36});
        esvs.d = esvs2;
        esvs esvs3 = new esvs(new byte[]{(byte)0xA0, 0, 0, 1, 82});
        esvs.e = esvs3;
        esvs esvs4 = new esvs(new byte[]{(byte)0xA0, 0, 0, 4, -108});
        esvs.f = esvs4;
        esvs esvs5 = new esvs(new byte[]{(byte)0xA0, 0, 0, 0, 37});
        esvs.g = esvs5;
        glwl.d(new byte[][]{esvs1.m, new byte[]{16, 16}});
        glwl.d(new byte[][]{esvs0.m, new byte[]{16, 16}});
        esvs.h = new esvs(glwl.d(new byte[][]{esvs2.m, new byte[]{16, 16}}));
        esvs.i = new esvs(glwl.d(new byte[][]{esvs3.m, new byte[]{0x30, 16}}));
        esvs.j = new esvs(glwl.d(new byte[][]{esvs3.m, new byte[]{0x40, 16}}));
        esvs.k = new esvs(glwl.d(new byte[][]{esvs4.m, new byte[]{0x60, 16}}));
        glwl.d(new byte[][]{esvs5.m, new byte[]{1, 16, 1}});
        esvs.l = new esvs(glwl.d(new byte[][]{esvs5.m, new byte[]{2}}));
    }

    private esvs(byte[] arr_b) {
        super(arr_b);
    }

    public final int a() {
        return this.m.length;
    }

    public static esvs b(byte[] arr_b) {
        return arr_b[0] != 0 || arr_b[1] != -92 || arr_b[2] != 4 || (arr_b[3] & -4) != 0 ? null : esvs.c(Arrays.copyOfRange(arr_b, 5, arr_b[4] + 5));
    }

    public static esvs c(byte[] arr_b) {
        batl.d(arr_b.length >= 5 && arr_b.length <= 16, "Illegal length for AID: %s", new Object[]{((int)arr_b.length)});
        return new esvs(arr_b);
    }

    public final boolean d(esvs esvs0) {
        return this.m.length >= esvs0.m.length && Arrays.equals(Arrays.copyOf(this.m, esvs0.m.length), esvs0.m);
    }

    @Override
    public final String toString() {
        return esxg.a(this.m);
    }
}

