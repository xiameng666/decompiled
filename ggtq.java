public enum ggtq {
    STRING('s', ggts.a, "-#", true),
    BOOLEAN('b', ggts.b, "-", true),
    CHAR('c', ggts.c, "-", true),
    DECIMAL('d', ggts.d, "-0+ ,(", false),
    OCTAL('o', ggts.d, "-#0(", false),
    HEX('x', ggts.d, "-#0(", true),
    FLOAT('f', ggts.e, "-#0+ ,(", false),
    EXPONENT('e', ggts.e, "-#0+ (", true),
    GENERAL('g', ggts.e, "-0+ ,(", true),
    EXPONENT_HEX('a', ggts.e, "-#0+ ", true);

    public static final ggtq[] k;
    public final char l;
    public final ggts m;
    public final int n;
    public final String o;

    static {
        ggtq.k = new ggtq[26];
        ggtq[] arr_ggtq = ggtq.values();
        for(int v = 0; v < arr_ggtq.length; ++v) {
            ggtq ggtq0 = arr_ggtq[v];
            ggtq.k[ggtq.a(ggtq0.l)] = ggtq0;
        }
    }

    private ggtq(char c, ggts ggts0, String s1, boolean z) {
        this.l = c;
        this.m = ggts0;
        int v1 = 0;
        int v2 = z ? 0x80 : 0;
        while(v1 < s1.length()) {
            int v3 = ggtr.a(s1.charAt(v1));
            if(v3 < 0) {
                throw new IllegalArgumentException("invalid flags: " + s1);
            }
            v2 |= 1 << v3;
            ++v1;
            continue;
        }
        this.n = v2;
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | 0x20) - 97;
    }
}

