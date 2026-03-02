import java.util.Iterator;
import java.util.logging.Level;

public final class esqj {
    public static final int a;
    private static final bboh b;

    static {
        esqj.b = bboh.b("TapAndPay", bbcu.aM);
    }

    public static gfsx a(esqo esqo0, gfsx gfsx0) {
        boolean z;
        gfsx gfsx1 = gfqx.a;
        Iterator iterator0 = esqo0.a.a().iterator();
        gfsx gfsx2 = gfsx1;
        while(true) {
            z = true;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            int v = (int)(((Integer)object0));
            byte[] arr_b = esqo0.d(v);
            try {
                switch(v) {
                    case 0x9F58: {
                        gfsx1 = gfsx.m(arr_b);
                        break;
                    }
                    case 40806: {
                        gfsx2 = gfsx.m(arr_b);
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException | IllegalArgumentException exception0) {
                Level level0 = esgh.a();
                ((ggtj)esqj.b.g(level0).s(exception0)).z("Unable to parse tag %s", v);
            }
        }
        if(gfsx1.i() && gfsx0.i() && ((String)gfsx0.d()).equals("canonical_interac_v2_bundle")) {
            if(((byte[])gfsx1.d())[0] != 4) {
                z = false;
            }
            return gfsx.m(Boolean.valueOf(z));
        }
        if(gfsx2.i() && gfsx0.i() && ((String)gfsx0.d()).equals("canonical_discover_v2_bundle")) {
            if((((byte[])gfsx2.d())[1] & 4) == 0) {
                z = false;
            }
            return gfsx.m(Boolean.valueOf(z));
        }
        return gfqx.a;
    }

    public static boolean b(short v) {
        return v == 0x100F || v == 0x1023 || v == 0x12B0 || v == 7523;
    }

    public static boolean c(esqo esqo0) {
        gfsx gfsx0 = gfqx.a;
        gfsx gfsx1 = gfsx0;
        for(Object object0: esqo0.a.a()) {
            int v = (int)(((Integer)object0));
            byte[] arr_b = esqo0.d(v);
            try {
                switch(v) {
                    case 0x9F02: {
                        gfsx0 = gfsx.m(Long.valueOf(esyw.a(arr_b)));
                        break;
                    }
                    case 0x9F35: {
                        gfsx1 = gfsx.m(Short.valueOf(((short)(((int)esyw.a(arr_b))))));
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException | IllegalArgumentException unused_ex) {
            }
        }
        if(gfsx0.i() && ((long)(((Long)gfsx0.d()))) == 0L && gfsx1.i()) {
            switch(((short)(((Short)gfsx1.d())))) {
                case 24: 
                case 25: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean d(esqo esqo0) {
        gfsx gfsx0 = gfqx.a;
        gfsx gfsx1 = gfsx0;
        for(Object object0: esqo0.a.a()) {
            int v = (int)(((Integer)object0));
            byte[] arr_b = esqo0.d(v);
            try {
                switch(v) {
                    case 0x9F02: {
                        gfsx1 = gfsx.m(Long.valueOf(esyw.a(arr_b)));
                        continue;
                    }
                    case 0x9F15: {
                        gfsx0 = gfsx.m(Short.valueOf(((short)(((int)esyw.a(arr_b))))));
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException | IllegalArgumentException exception0) {
                Level level0 = esgh.a();
                ((ggtj)esqj.b.g(level0).s(exception0)).z("Unable to parse tag %s", v);
            }
        }
        return gfsx0.i() && esqj.b(((Short)gfsx0.d()).shortValue()) && gfsx1.i() && ((long)(((Long)gfsx1.d()))) <= hyua.c();
    }
}

