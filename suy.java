public final class suy extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        int v = svs0.c;
        if(v == 0x3F) {
            if(svs0.d == -1) {
                return new suz(arr_b);
            }
            v = 0x3F;
        }
        throw sxf.i(Byte.valueOf(((byte)v)), Byte.valueOf(svs0.d));
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return svs0.f() && svs0.b == -37;
    }

    @Override  // svj
    public final boolean f() {
        return true;
    }
}

