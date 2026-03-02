final class uda extends udf {
    @Override  // udf
    public final boolean a() {
        return true;
    }

    @Override  // udf
    public final boolean b() {
        return true;
    }

    @Override  // udf
    public final boolean c(uag uag0) {
        return uag0 == uag.b;
    }

    @Override  // udf
    public final boolean d(boolean z, uag uag0, int v) {
        return uag0 != uag.d && uag0 != uag.e;
    }
}

