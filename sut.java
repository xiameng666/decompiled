public final class sut extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        int v = svs0.d;
        switch(v) {
            case 0: {
                return new suu(ssp.a);
            }
            case 1: {
                return new suu(ssp.b);
            }
            case 2: {
                return new suu(ssp.c);
            }
            default: {
                throw sxf.i(null, Byte.valueOf(((byte)v)));
            }
        }
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return svs0.c() && svs0.b == 21 && svs0.c == 3;
    }
}

