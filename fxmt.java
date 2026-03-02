public final class fxmt {
    public final fxmv a;
    private static volatile fxmt b;

    public fxmt(fxmv fxmv0) {
        this.a = fxmv0;
    }

    public final void a(String s, long v, int v1, int v2) {
        long v5;
        String s1;
        int v3 = 13;
        if(v2 <= 13) {
            int v4 = fxmt.c(v1);
            switch(v2) {
                case 1: {
                    v3 = 2;
                    break;
                }
                case 2: {
                    v3 = 3;
                    break;
                }
                case 3: {
                    v3 = 6;
                    break;
                }
                case 4: {
                    v3 = 7;
                    break;
                }
                case 5: {
                    v3 = 8;
                    break;
                }
                case 6: {
                    v3 = 10;
                    break;
                }
                case 7: {
                    v3 = 5;
                    break;
                }
                case 8: {
                    v3 = 4;
                    break;
                }
                case 9: {
                    v3 = 11;
                    break;
                }
                case 10: {
                    v3 = 15;
                    break;
                }
                case 11: {
                    v3 = 12;
                    break;
                }
                case 12: {
                    break;
                }
                default: {
                    v3 = 14;
                }
            }
            s1 = s;
            v5 = v;
            cczb cczb0 = cedm.v().b(((gful_cronetEngineProvider)new fxmw(s1, v5, v4, v3)));
            cczb0.c = (int)26;
            cczb0.a();
        }
        else {
            s1 = s;
            v5 = v;
        }
        fxmv.a(v5);
        Object[] arr_object = {s1, fxmv.a(v5)};
        this.a.f(v1 * 1000 + v2, "%s:%s", arr_object);
    }

    public static fxmt b() {
        if(fxmt.b == null) {
            synchronized(fxmt.class) {
                bboh.a("EAlert");
            }
            return fxmt.d();
        }
        return fxmt.b;
    }

    public static int c(int v) {
        switch(v) {
            case 0: {
                return 2;
            }
            case 1: {
                return 8;
            }
            case 2: {
                return 9;
            }
            case 3: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 5: {
                return 3;
            }
            case 6: {
                return 6;
            }
            case 7: {
                return 7;
            }
            case 8: {
                return 10;
            }
            case 9: {
                return 11;
            }
            case 10: {
                return 12;
            }
            case 11: {
                return 13;
            }
            default: {
                return 1;
            }
        }
    }

    public static fxmt d() {
        if(fxmt.b == null) {
            Class class0 = fxmt.class;
            synchronized(class0) {
                if(fxmt.b == null) {
                    fxmt.b = new fxmt(new fxmv(50, new fxms()));
                }
            }
            return fxmt.b;
        }
        return fxmt.b;
    }
}

