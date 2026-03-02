public final class czvl {
    public static gyty a(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gyty.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gyty gyty0 = (gyty)hftv0;
            switch((gytx.a(gyty0.f) == 0 ? 1 : gytx.a(gyty0.f)) - 1) {
                case 1: {
                    if(gyty0.c == 3) {
                        int v = gytt.a(((gytu)gyty0.d).e);
                        if(v == 0) {
                            v = 1;
                        }
                        return v - 1 != 1 && v - 1 != 2 && v - 1 != 3 || (gyty0.e == null ? gytz.a : gyty0.e).c.toByteArray().length != 4 ? null : gyty0;
                    }
                    return null;
                }
                case 2: {
                    return gyty0.c != 4 || (gyty0.e == null ? gytz.a : gyty0.e).c.toByteArray().length != 4 ? null : gyty0;
                }
                default: {
                    return null;
                }
            }
        }
        catch(hfur hfur0) {
            czkq.a.c().f(hfur0).h("[%s] Failed to parse bytes into a MultiplexFrame.", "MultiplexFrames");
            return null;
        }
    }

    static String b(String s, String s1) {
        return bbmu.c(czvl.c(s, s1));
    }

    static byte[] c(String s, String s1) {
        return s1.isEmpty() ? czmk.Y(s.getBytes(), 4) : czmk.Y(glwl.d(new byte[][]{s.getBytes(), s1.getBytes()}), 4);
    }
}

