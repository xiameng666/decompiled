import j..util.concurrent.ConcurrentHashMap;

public final class igdc extends IllegalArgumentException {
    private static final long serialVersionUID = 0x299988B9C68L;

    public igdc(long v, String s) {
        int v6;
        ConcurrentHashMap concurrentHashMap0 = iggs.a;
        iggt iggt0 = (iggt)concurrentHashMap0.get("yyyy-MM-dd\'T\'HH:mm:ss.SSS");
        if(iggt0 == null) {
            ighi ighi0 = new ighi();
            int[] arr_v = new int[1];
            for(int v1 = 0; v1 < 25; v1 = v2 + 1) {
                arr_v[0] = v1;
                String s1 = iggs.b(arr_v);
                int v2 = arr_v[0];
                int v3 = s1.length();
                if(v3 == 0) {
                    break;
                }
                int v4 = 9;
                int v5 = s1.charAt(0);
                switch(v5) {
                    case 39: {
                        String s2 = s1.substring(1);
                        if(s2.length() == 1) {
                            ighi0.q(s2.charAt(0));
                        }
                        else {
                            ighi0.r(new String(s2));
                        }
                        break;
                    }
                    case 67: {
                        ighi0.t(igcr.d, v3, v3);
                        break;
                    }
                    case 68: {
                        ighi0.x(v3);
                        break;
                    }
                    case 69: {
                        if(v3 >= 4) {
                            ighi0.i(igcr.m);
                        }
                        else {
                            ighi0.h(igcr.m);
                        }
                        break;
                    }
                    case 71: {
                        ighi0.i(igcr.b);
                        break;
                    }
                    case 72: {
                        ighi0.z(v3);
                        break;
                    }
                    case 75: {
                        ighi0.n(igcr.o, v3, 2);
                        break;
                    }
                    case 77: {
                        if(v3 < 3) {
                            ighi0.B(v3);
                        }
                        else if(v3 >= 4) {
                            ighi0.i(igcr.h);
                        }
                        else {
                            ighi0.h(igcr.h);
                        }
                        break;
                    }
                    case 83: {
                        ighi0.y(v3, v3);
                        break;
                    }
                    case 90: {
                        if(v3 == 1) {
                            ighi0.j(false);
                        }
                        else if(v3 == 2) {
                            ighi0.j(true);
                        }
                        else {
                            ighi0.g(ighd.a, ighd.a);
                        }
                        break;
                    }
                    case 97: {
                        ighi0.i(igcr.n);
                        break;
                    }
                    case 100: {
                        ighi0.v(v3);
                        break;
                    }
                    case 101: {
                        ighi0.w(v3);
                        break;
                    }
                    case 104: {
                        ighi0.n(igcr.p, v3, 2);
                        break;
                    }
                    case 107: {
                        ighi0.n(igcr.q, v3, 2);
                        break;
                    }
                    case 109: {
                        ighi0.A(v3);
                        break;
                    }
                    case 0x73: {
                        ighi0.C(v3);
                        break;
                    }
                    case 0x77: {
                        ighi0.D(v3);
                        break;
                    }
                    case 89: 
                    case 120: 
                    case 0x79: {
                        if(v3 == 2) {
                            if(v2 + 1 < 25) {
                                ++arr_v[0];
                                v6 = iggs.a(iggs.b(arr_v)) ^ 1;
                                --arr_v[0];
                            }
                            else {
                                v6 = 1;
                            }
                            if(v5 == 120) {
                                igco igco1 = new igco();
                                int v8 = igco1.b.w().a(igco1.a) - 30;
                                ighi0.f(new ighg(igcr.k, v8, ((boolean)v6)));
                            }
                            else {
                                igco igco0 = new igco();
                                int v7 = igco0.b.y().a(igco0.a) - 30;
                                ighi0.f(new ighg(igcr.f, v7, ((boolean)v6)));
                            }
                        }
                        else {
                            if(v2 + 1 < 25) {
                                ++arr_v[0];
                                if(iggs.a(iggs.b(arr_v))) {
                                    v4 = v3;
                                }
                                --arr_v[0];
                            }
                            switch(v5) {
                                case 89: {
                                    ighi0.n(igcr.c, v3, v4);
                                    break;
                                }
                                case 120: {
                                    ighi0.E(v3, v4);
                                    break;
                                }
                                default: {
                                    if(v5 == 0x79) {
                                        ighi0.F(v3, v4);
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 0x7A: {
                        if(v3 >= 4) {
                            ighi0.g(new ighe(0), null);
                        }
                        else {
                            ighe ighe0 = new ighe(1);
                            ighi0.g(ighe0, ighe0);
                        }
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Illegal pattern component: " + s1);
                    }
                }
            }
            iggt0 = ighi0.a();
            if(concurrentHashMap0.size() < 500) {
                iggt iggt1 = (iggt)concurrentHashMap0.putIfAbsent("yyyy-MM-dd\'T\'HH:mm:ss.SSS", iggt0);
                if(iggt1 != null) {
                    iggt0 = iggt1;
                }
            }
        }
        super("Illegal instant due to time zone offset transition (daylight savings time \'gap\'): " + iggt0.b(new igdd(v)) + a.a(s, " (", ")"));
    }

    public igdc(String s) {
        super(s);
    }

    public static boolean a(Throwable throwable0) {
        if((throwable0 instanceof igdc)) {
            return true;
        }
        return throwable0.getCause() == null || throwable0.getCause() == throwable0 ? false : igdc.a(throwable0.getCause());
    }
}

