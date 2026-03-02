import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public final class grcj {
    private static final int a;
    private static final byte[] b;
    private static final byte[] c;

    static {
        grcj.a = gluj.f(12);
        grcj.b = new byte[]{0x30, 0x76, 42, -46, 0x3F, 0x7B, (byte)0xA1, -101, -8, -29, 66, -4, (byte)0xA1, -89, (byte)0x8D, 6, -26, 107, -28, -37, -72, 0x4F, (byte)0x81, 83, -59, 3, -56, -37, -67, -34, -91, 0x20};
        grcj.c = new byte[]{-60, -108, -93, -107, -8, (byte)0xC0, -30, 62, -87, 35, 4, 120, 0x70, 44, 0x72, 24, 86, 84, -103, -77, -23, 33, 24, 108, 33, 26, 1, 34, 60, 69, 74, -6};
    }

    public static String a(String s) {
        ggrj ggrj0 = new ggrj(s, true);
        if(ggrj0.c) {
            s = ggrj0.a;
        }
        return gfqz.c(s.replace(".", ""));
    }

    public static byte[] b(byte[] arr_b, hfjo hfjo0) {
        igpz igpz0 = hfjo0.b.a.p(arr_b);
        gftb.b(igpz0.x(), "Invalid point: the point is not on the curve");
        gftb.b(((boolean)(igpz0.v() ^ 1)), "Invalid point: the point is at infinity");
        byte[] arr_b1 = igpz0.s(hfjo0.a.getS().modInverse(hfjo0.a.getParams().getOrder())).z();
        return ghgc.a.a(arr_b1).e();
    }

    public static byte[] c(String s) {
        byte[] arr_b = glwl.d(new byte[][]{s.getBytes(StandardCharsets.UTF_8), grcj.c});
        byte[] arr_b1 = ghgc.a.a(arr_b).e();
        boolean z = true;
        gftb.checkTrue(arr_b1.length * 8 >= 26);
        grci grci0 = new grci(new BigInteger(1, arr_b1).shiftRight(arr_b1.length * 8 - 26), 26);
        int v = grci0.b;
        int v1 = v + 7 >> 3;
        byte[] arr_b2 = new byte[v1];
        if(v1 * 8 < v) {
            z = false;
        }
        gftb.checkTrue(z);
        byte[] arr_b3 = new grci(grci0.a.shiftLeft(v1 * 8 - v), v1 * 8).a.toByteArray();
        int v2 = arr_b3[0] == 0 ? arr_b3.length - 1 : arr_b3.length;
        System.arraycopy(arr_b3, arr_b3.length - v2, arr_b2, v1 - v2, v2);
        return arr_b2;
    }

    public static byte[] d(String s, grdf grdf0) {
        try {
            byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
            return iekp.a(glwl.d(new byte[][]{arr_b, grdf0.a.getBytes(StandardCharsets.UTF_8)}), glwl.d(new byte[][]{arr_b, grcj.b}), grcj.a, 8, 1, 0x20);
        }
        catch(Throwable throwable0) {
            throw new gqtr("Computing the password hash failed.", throwable0);
        }
    }
}

