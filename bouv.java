import j..util.Collection.-EL;
import j..util.Objects;
import j..util.stream.Stream;

public final class bouv {
    public static boolean a(fqzm fqzm0) {
        gtas gtas0 = gtas.b(((fqzl)fqzm0).g);
        if(gtas0 == null) {
            gtas0 = gtas.a;
        }
        return bouv.b(gtas0);
    }

    public static boolean b(gtas gtas0) {
        return gtas0 == gtas.d || gtas0 == gtas.e;
    }

    public static boolean c(fqzm fqzm0) {
        gtas gtas0 = gtas.b(((fqzl)fqzm0).g);
        if(gtas0 == null) {
            gtas0 = gtas.a;
        }
        return bouv.d(gtas0);
    }

    public static boolean d(gtas gtas0) {
        return gtas0 != gtas.a;
    }

    public static boolean e(fqzm fqzm0) {
        gtas gtas0 = gtas.b(((fqzl)fqzm0).g);
        if(gtas0 == null) {
            gtas0 = gtas.a;
        }
        return bouv.f(gtas0);
    }

    public static boolean f(gtas gtas0) {
        return gtas0 == gtas.c || gtas0 == gtas.e;
    }

    public static boolean g(fqzm fqzm0) {
        gtas gtas0 = gtas.b(((fqzl)fqzm0).g);
        if(gtas0 == null) {
            gtas0 = gtas.a;
        }
        return bouv.h(gtas0);
    }

    public static boolean h(gtas gtas0) {
        return gtas0 == gtas.b || gtas0 == gtas.c;
    }

    public static boolean i(fqzm fqzm0) {
        fqyp fqyp0 = ((fqzl)fqzm0).f;
        if(fqyp0 == null) {
            fqyp0 = fqyp.b;
        }
        int v = fqyo.a(fqyp0.e) == 0 ? 1 : fqyo.a(fqyp0.e);
        return v == 2 || v == 4;
    }

    public static boolean j(fqzm fqzm0) {
        return ((fqzl)fqzm0).c == 22 ? ((fqza)((fqzl)fqzm0).d).e : fqza.a.e;
    }

    public static boolean k(fqzl fqzl0) {
        fqza fqza0 = fqzl0.c == 22 ? ((fqza)fqzl0.d) : fqza.a;
        return !(fqyz.b(fqza0.f) == null ? fqyz.a : fqyz.b(fqza0.f)).equals(fqyz.a);
    }

    public static boolean l(fqzl fqzl0) {
        if((fqzl0.b & 0x20) != 0) {
            fqzk fqzk0 = fqzl0.u == null ? fqzk.a : fqzl0.u;
            int v = fqzi.a(fqzk0.d) == 0 ? 1 : fqzi.a(fqzk0.d);
            switch(v - 1) {
                case 0: {
                    break;
                }
                case 1: {
                    return true;
                }
                default: {
                    switch(v - 1) {
                        case 4: {
                            return false;
                        }
                        case 3: 
                        case 5: {
                            return true;
                        }
                        default: {
                            Integer integer0 = (int)fqzk0.f;
                            if(fqzk0.g.contains(integer0)) {
                                Stream stream0 = Collection.-EL.stream(fqzk0.h).map(new bout());
                                Objects.requireNonNull(integer0);
                                return !stream0.anyMatch(new bouu(integer0));
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

