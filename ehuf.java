import java.math.BigInteger;
import java.util.Locale;

public final class ehuf {
    public static String a(gxax gxax0) {
        try {
            return new BigInteger(1, gxax0.c.toByteArray()).toString(16).toUpperCase(Locale.getDefault()).replaceAll("(.{2})", "$1:").substring(0, 17);
        }
        catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException0) {
            a.ae(eicd.a.i(), "Failed to parse MAC address from advertising report", stringIndexOutOfBoundsException0);
            return null;
        }
    }

    public static void b(short v, byte[] arr_b) {
        arr_b[0] = (byte)(v & 0xFF);
        arr_b[1] = (byte)(v >> 8 & 0xFF);
    }

    public static void c(byte[] arr_b, int v, byte[] arr_b1) {
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b1[v1 + 2] = arr_b[v1];
        }
    }
}

