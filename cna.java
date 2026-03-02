public final class cna {
    public static final int[] a;
    public static final float[] b;
    public static final chx c;

    static {
        cna.a = new int[0];
        cna.b = new float[0];
        cna.c = new chx(new int[2], new float[2], new float[][]{new float[2], new float[2]});
    }

    public static final long a(cnc cnc0, long v) {
        long v1 = v - ((long)((cnj)cnc0).b);
        if(v1 < 0L) {
            v1 = 0L;
        }
        long v2 = (long)((cnj)cnc0).a;
        return v1 <= v2 ? v1 : v2;
    }

    public static final cht b(cmx cmx0, long v, cht cht0, cht cht1, cht cht2) {
        return cmx0.c(v * 1000000L, cht0, cht1, cht2);
    }
}

