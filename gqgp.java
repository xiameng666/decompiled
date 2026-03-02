public abstract class gqgp {
    public abstract float a(int arg1);

    public static gqgp b() {
        return new gqgq(((float)huli.b()));
    }

    public static gqgp c(gqhi gqhi0) {
        int v1;
        int v = gqhi0.b;
        switch(v) {
            case 0: {
                v1 = 3;
                break;
            }
            case 1: {
                v1 = 1;
                break;
            }
            case 2: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 0;
            }
        }
        if(v1 != 0) {
            switch(v1 - 1) {
                case 0: {
                    return v == 1 ? new gqgr(((gqhw)gqhi0.c)) : new gqgr(gqhw.a);
                }
                case 1: {
                    return v == 2 ? new gqgs(((gqhx)gqhi0.c)) : new gqgs(gqhx.a);
                }
                default: {
                    return gqgp.b();
                }
            }
        }
        throw null;
    }
}

