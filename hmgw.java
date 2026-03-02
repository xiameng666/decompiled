import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class hmgw extends Enum {
    private static final hmgw[] a;

    static {
        hmgw.a = new hmgw[0];
    }

    public static int a(byte b) {
        if((b & 0xFF) > 0x84) {
            throw new hmdm("Incorrect first byte of length. Max value 0x84");
        }
        if((b & 0xFF) != 0x80) {
            switch(b) {
                case 0xFFFFFF81: {
                    return 2;
                }
                case 0xFFFFFF82: {
                    return 3;
                }
                case 0xFFFFFF83: {
                    return 4;
                }
                case 0xFFFFFF84: {
                    return 5;
                }
                default: {
                    return 1;
                }
            }
        }
        throw new hmdm("Incorrect first byte of length. Cannot be 0x80");
    }

    public static long b(List list0) {
        long v = 0L;
        for(Object object0: list0) {
            v += (long)((hmht)object0).b;
        }
        return v;
    }

    public static long c(byte[] arr_b) {
        if(arr_b == null || arr_b.length <= 0) {
            throw new hmdl("Null or empty input");
        }
        if(arr_b.length >= 5) {
            return (((long)arr_b[0]) & 0xFFL) << 0x20 | (0xFFL & ((long)arr_b[1])) << 24 | ((long)((arr_b[2] & 0xFF) << 16)) | ((long)((arr_b[3] & 0xFF) << 8)) | ((long)(arr_b[4] & 0xFF));
        }
        if(arr_b.length == 4) {
            return (((long)arr_b[0]) & 0xFFL) << 24 | ((long)((arr_b[1] & 0xFF) << 16)) | ((long)((arr_b[2] & 0xFF) << 8)) | ((long)(arr_b[3] & 0xFF));
        }
        if(arr_b.length == 3) {
            return (long)(arr_b[2] & 0xFF | ((arr_b[0] & 0xFF) << 16 | (arr_b[1] & 0xFF) << 8));
        }
        return arr_b.length == 2 ? ((long)(arr_b[1] & 0xFF | (arr_b[0] & 0xFF) << 8)) : ((long)(arr_b[0] & 0xFF));
    }

    public static hmgz d(List list0) {
        hmgz hmgz0 = new hmgz(0);
        for(Object object0: list0) {
            hmgz0.s(((hmht)object0).a);
            hmgz0.r(((hmht)object0).b);
        }
        return hmgz0;
    }

    public static hmgz e(Iterable iterable0) {
        int v = 0;
        int v1 = 0;
        for(Object object0: iterable0) {
            v1 += ((hmgz)object0).b();
        }
        hmgz hmgz0 = new hmgz(v1);
        try {
            for(Object object1: iterable0) {
                hmgz0.n(v, ((hmgz)object1).a);
                v += ((hmgz)object1).b();
            }
            return hmgz0;
        }
        catch(hmdl unused_ex) {
            throw new RuntimeException("Implementation error");
        }
    }

    public static hmgz f(byte[] arr_b, int v) {
        if(arr_b == null || arr_b.length <= 0) {
            throw new hmdl("Null or empty input");
        }
        if(v >= arr_b.length) {
            throw new hmdl("Offset beyond array bounds");
        }
        int v1 = arr_b[v];
        if((v1 & 0x1F) == 0x1F) {
            hmgz hmgz0 = new hmgz(((byte)v1));
            for(int v2 = v + 1; v2 < arr_b.length; ++v2) {
                hmgz0.r(arr_b[v2]);
                if((arr_b[v2] & 0xFFFFFF80) != 0xFFFFFF80) {
                    break;
                }
            }
            if(hmgz0.b() == 1 && (hmgz0.a(0) & 0x1F) == 0x1F) {
                throw new hmdl("Missing octet");
            }
            if(hmgz0.b() > 1 && (hmgz0.a(hmgz0.b() - 1) & 0xFFFFFF80) == 0xFFFFFF80) {
                throw new hmdl("Missing octet");
            }
            return hmgz0;
        }
        return new hmgz(((byte)v1));
    }

    public static String g(hmgz hmgz0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < hmgz0.b(); ++v) {
            int v1 = hmgz0.a(v);
            for(int v2 = 7; v2 >= 0; --v2) {
                stringBuilder0.append(((char)(hmgw.i(((byte)v1), v2) ? 49 : 0x30)));
            }
        }
        return stringBuilder0.toString();
    }

    public static List h(byte[] arr_b) {
        List list0 = new ArrayList();
        int v = 0;
        while(v < arr_b.length) {
            hmgz hmgz0 = hmgw.f(arr_b, v);
            if(arr_b.length <= hmgz0.b() + v) {
                throw new hmdm("Not enough data in length field (no length field)");
            }
            if(hmgw.a(arr_b[hmgz0.b() + v]) > 1) {
                throw new hmfq(hmfl.R);
            }
            list0.add(new hmht(hmgz0.a, arr_b[hmgz0.b() + v]));
            v += hmgz0.b() + 1;
            continue;
        }
        return list0;
    }

    public static boolean i(byte b, int v) {
        return (b & 1 << v) != 0;
    }

    public static byte[] j(int v) {
        return ByteBuffer.allocate(4).putInt(v).array();
    }

    public static byte[] k(long v) {
        return ByteBuffer.allocate(8).putLong(v).array();
    }

    public static hmgw[] values() {
        return (hmgw[])hmgw.a.clone();
    }
}

