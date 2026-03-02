public final class suw extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        int v = svs0.d;
        boolean z = false;
        if(((v >= 0 ? 0 : 1) | (v <= 3 ? 0 : 1)) != 0) {
            throw sxf.i(null, Byte.valueOf(((byte)v)));
        }
        if(1 == (v & 1)) {
            z = true;
        }
        return new sux(sxe.b(arr_b), (v & 2) == 2, z);
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return svs0.c() && svs0.b == 21 && svs0.c == 1;
    }
}

