public final class sun extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        int v = svs0.c;
        if(v == 0x3F) {
            if(svs0.d == -1) {
                return new suq(arr_b);
            }
            v = 0x3F;
        }
        throw sxf.i(Byte.valueOf(((byte)v)), Byte.valueOf(svs0.d));
    }

    @Override  // svj
    public final boolean b() {
        return true;
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return svs0.e(true) && svs0.b == -53;
    }

    @Override  // svj
    public final boolean f() {
        return true;
    }
}

