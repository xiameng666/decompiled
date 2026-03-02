public final class sxj {
    public static sxd a(byte[] arr_b, int v) {
        sxd sxd0 = sxj.c(arr_b, v);
        if(sxd0.d()) {
            sxi sxi0 = (sxi)sxd0.b();
            int v1 = sxi0.c;
            sxd sxd1 = sxj.b(arr_b, v1);
            if(sxd1.d()) {
                sxh sxh0 = (sxh)sxd1.b();
                return new sxd(new sxg(sxi0.a, v1, sxh0.a, sxh0.b));
            }
        }
        return sxd.a;
    }

    public static sxd b(byte[] arr_b, int v) {
        if(v < arr_b.length) {
            int v1 = arr_b[v];
            if((v1 & 0x80) == 0) {
                return new sxd(new sxh(v1 & 0xFF, v + 1));
            }
            if((v1 & 0x7F) <= 4 && (v1 & 0x7F) != 0) {
                int v2 = (v1 & 0x7F) + (v + 1);
                if(v2 <= arr_b.length && v2 - (v + 1) <= 4) {
                    int v3 = sto.b(arr_b, v + 1, v2);
                    return v3 >= 0 ? new sxd(new sxh(v3, v2)) : sxd.a;
                }
            }
        }
        return sxd.a;
    }

    public static sxd c(byte[] arr_b, int v) {
        if(v < arr_b.length) {
            int v1 = v + 1;
            int v2 = arr_b[v];
            boolean z = (v2 & 0x20) == 0x20;
            if((v2 & 0x1F) == 0x1F) {
                while(true) {
                    if(v1 >= arr_b.length) {
                        v1 = -1;
                        break;
                    }
                    if((arr_b[v1] & 0xFFFFFF80) == 0) {
                        break;
                    }
                    ++v1;
                }
                return v1 == -1 || v1 + 1 - v > 4 ? sxd.a : new sxd(new sxi(sto.b(arr_b, v, v1 + 1), z, v1 + 1));
            }
            return new sxd(new sxi(v2 & 0xFF, z, v1));
        }
        return sxd.a;
    }
}

