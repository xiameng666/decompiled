import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class flce {
    private static flce a;
    private final Set b;
    private final flcm c;

    private flce() {
        this.b = new HashSet();
        this.c = flcm.a();
    }

    public final List a() {
        List list0;
        boolean z1;
        gfsx gfsx0;
        boolean z;
        synchronized(this) {
            gged_interceptors gged0 = gged_interceptors.B(Integer.valueOf(0xD0), Integer.valueOf(0xC7), Integer.valueOf(2003), Integer.valueOf(204), Integer.valueOf(2002), Integer.valueOf(2000), Integer.valueOf(0xD5), Integer.valueOf(209), Integer.valueOf(205), Integer.valueOf(0xC3), Integer.valueOf(200), Integer.valueOf(210), new Integer[]{((int)2001), ((int)0xC4), ((int)203), ((int)0xD4), ((int)206), ((int)0xC2), ((int)201), ((int)0xC6), ((int)0xD3), ((int)0xC0), ((int)202), ((int)0xC5), ((int)0xC1), ((int)0xCF)});
            ggdy ggdy0 = new ggdy();
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)gged0.get(v2);
                int v3 = (int)integer0;
                if(v3 == 0xC6) {
                    z = iaea.a.g().x();
                }
                else {
                    switch(v3) {
                        case 0xD0: {
                            z = iaea.a.g().C() && !gfta.c(flbc.a().b(1));
                            break;
                        }
                        case 0xD3: {
                            z = iaea.s();
                            break;
                        }
                        case 0xD4: {
                            z = iaea.q();
                            break;
                        }
                        case 209: 
                        case 0xD5: {
                            z = false;
                            break;
                        }
                        case 2001: {
                            this.c.d();
                            z = false;
                            break;
                        }
                        case 2002: {
                            z = iadi.a.b().a();
                            break;
                        }
                        case 2003: {
                            this.c.c();
                            z = false;
                            break;
                        }
                        default: {
                            z = true;
                        }
                    }
                }
                switch(((int)integer0)) {
                    case 0xD3: {
                        z = this.c.b();
                        break;
                    }
                    case 2001: {
                        this.c.d();
                        z = false;
                        break;
                    }
                    case 2003: {
                        this.c.c();
                        z = false;
                    }
                }
                switch(((int)integer0)) {
                    case 0xC0: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 0xC1: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 0xC2: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 0xC3: {
                        gfsx0 = flce.d(new Integer[]{((int)1)});
                        break;
                    }
                    case 0xC4: {
                        gfsx0 = flce.d(new Integer[]{((int)2)});
                        break;
                    }
                    case 0xC5: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 0xC6: {
                        gfsx0 = flce.d(new Integer[]{((int)2)});
                        break;
                    }
                    case 0xC7: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 200: {
                        gfsx0 = flce.d(new Integer[]{((int)1)});
                        break;
                    }
                    case 201: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 202: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 203: {
                        gfsx0 = flce.d(new Integer[]{((int)2)});
                        break;
                    }
                    case 204: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 205: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 206: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 0xCF: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 0xD0: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 209: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 210: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 0xD3: {
                        gfsx0 = flce.d(new Integer[]{((int)2)});
                        break;
                    }
                    case 0xD4: {
                        gfsx0 = flce.d(new Integer[]{((int)2)});
                        break;
                    }
                    case 0xD5: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 2000: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 2001: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 2002: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    case 2003: {
                        gfsx0 = flce.d(new Integer[0]);
                        break;
                    }
                    default: {
                        gfsx0 = gfqx.a;
                    }
                }
                if(gfsx0.i()) {
                    Object object0 = gfsx0.d();
                    z1 = this.b.containsAll(((Collection)object0));
                }
                else {
                    z1 = false;
                }
                if(z && z1) {
                    ggdy0.i(integer0);
                }
            }
            list0 = ggdy0.h();
        }
        return list0;
    }

    public final void b(gged_interceptors gged0) {
        synchronized(this) {
            this.b.addAll(gged0);
        }
    }

    public static flce c() {
        synchronized(flce.class) {
            if(flce.a == null) {
                flce.a = new flce();
            }
        }
        return flce.a;
    }

    @SafeVarargs
    private static gfsx d(Object[] arr_object) {
        return gfsx.m(gged_interceptors.k(arr_object));
    }
}

