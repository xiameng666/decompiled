final class udc extends udf {
    @Override  // udf
    public final boolean a() {
        return true;
    }

    @Override  // udf
    public final boolean b() {
        return false;
    }

    @Override  // udf
    public final boolean c(uag uag0) {
        return uag0 != uag.c && uag0 != uag.e;
    }

    @Override  // udf
    public final boolean d(boolean z, uag uag0, int v) {
        return false;
    }
}

