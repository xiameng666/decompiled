import android.content.Context;
import android.os.ParcelUuid;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public final class czup {
    public static final UUID a;
    public static final UUID b;
    public static final UUID c;
    static final UUID d;
    static final UUID e;
    public static final UUID f;
    public static final UUID g;
    static final UUID h;
    static final byte[] i;

    static {
        czup.a = UUID.fromString("0000FEF3-0004-1000-8000-001A11000100");
        czup.b = UUID.fromString("0000FEF3-0000-1000-8000-00805F9B34FB");
        czup.c = UUID.fromString("0000FC73-0000-1000-8000-00805F9B34FB");
        UUID uUID0 = UUID.fromString("00000100-0004-1000-8000-001A11000101");
        czup.d = uUID0;
        UUID uUID1 = UUID.fromString("00000100-0004-1000-8000-001A11000102");
        czup.e = uUID1;
        czup.f = uUID1;
        czup.g = uUID0;
        czup.h = UUID.fromString("00002902-0000-1000-8000-00805F9B34FB");
        czup.i = new byte[]{0, 0, 1};
    }

    static czle a(Context context0, String s, String s1, boolean z) {
        bsaq bsaq0 = cumz.e(context0, "Utils");
        if(bsaq0 == null) {
            czke.i(s, 8, gylz.d, gymd.i);
            return z ? new czle(gyxo.bu) : new czle(gyxo.bt);
        }
        try {
            return new czle(bsaq0.g(s1), gyxo.b);
        }
        catch(IllegalArgumentException unused_ex) {
            czke.j(s, 8, gymb.d, gymd.cn, String.format("LE MAC Address : %s", s1));
            return new czle(gyxo.bX);
        }
    }

    public static cztp b(cunz cunz0, ParcelUuid parcelUuid0) {
        Map map0 = cunz0.b;
        if(map0 != null && map0.containsKey(parcelUuid0)) {
            return cztp.a(((byte[])map0.get(parcelUuid0)), true);
        }
        String s = cunz0.d;
        if(s != null) {
            try {
                return cztp.a(bbmu.g(s.getBytes()), false);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        return null;
    }

    public static String c() {
        byte[] arr_b = new byte[16];
        new SecureRandom().nextBytes(arr_b);
        return bbmu.c(arr_b);
    }

    public static UUID d(int v) {
        return new UUID(0x3000L, ((long)v) | 0x8000000000000000L);
    }

    public static UUID e(boolean z) {
        return z ? czup.a : czup.b;
    }

    public static byte[] f(byte[] arr_b) {
        return czmk.Y(arr_b, 4);
    }

    public static byte[] g(String s) {
        byte[] arr_b = czmk.Y(s.getBytes(), 3);
        return czup.j(arr_b) ? arr_b : czup.i;
    }

    public static byte[] h(String s, String s1) {
        if(s1.equals("")) {
            return czup.g(s);
        }
        byte[] arr_b = czmk.Y(glwl.d(new byte[][]{s.getBytes(), s1.getBytes()}), 3);
        return czup.j(arr_b) ? arr_b : czup.i;
    }

    public static byte[] i(int v) {
        if(v == -1) {
            v = 0;
        }
        return glxf.d(((short)v));
    }

    private static boolean j(byte[] arr_b) {
        return !Arrays.equals(new byte[3], arr_b);
    }
}

