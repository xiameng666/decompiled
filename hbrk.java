public final class hbrk {
    public static hbju a(int v) {
        switch(v) {
            case -1: {
                return hbju.g;
            }
            case 16: {
                return hbju.b;
            }
            case 17: {
                return hbju.c;
            }
            case 35: {
                return hbju.e;
            }
            case 842094169: {
                return hbju.d;
            }
            default: {
                return hbju.a;
            }
        }
    }

    public static hbjv b(int v, int v1) {
        hbjt hbjt0 = new hbjt();
        hbjt0.a = hbrk.a(v);
        Integer.valueOf(v1).getClass();
        hbjt0.b = (int)(0x7FFFFFFF & v1);
        return new hbjv(hbjt0);
    }
}

