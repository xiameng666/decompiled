import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Locale;

public final class bmlr {
    public static final int a;
    private static final String[] b;
    private static final String[] c;
    private static final byte[] d;
    private static final char[] e;

    static {
        bmlr.b = new String[]{"cable.ua5v.com", "cable.auth.com"};
        bmlr.c = new String[]{".com", ".org", ".net", ".info"};
        bmlr.d = new byte[]{99, 97, 66, 76, 69, 0x76, 50, 0x20, 0x74, 0x75, 110, 110, 101, 108, 0x20, 0x73, 101, 0x72, 0x76, 101, 0x72, 0x20, 100, 0x6F, 109, 97, 105, 110};
        bmlr.e = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7'};
    }

    public static String a(int v) {
        if(v < 2) {
            return bmlr.b[v];
        }
        if(v < 0x100) {
            bmzx.c("UNKNOWN", "ADVERT_INVALID_DOMAIN");
        }
        gftb.b(v >= 0x100, String.format(Locale.US, "This domainId: %d was an unrecognized assigned domain value.", v));
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(0x1F);
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.put(bmlr.d).putShort(((short)v)).put(0);
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(Arrays.copyOf(blzb.a().digest(byteBuffer0.array()), 8));
        byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
        long v1 = byteBuffer1.getLong();
        long v2 = v1 >>> 2;
        StringBuilder stringBuilder0 = new StringBuilder("cable.");
        while(v2 != 0L) {
            stringBuilder0.append(bmlr.e[((int)(0x1FL & v2))]);
            v2 >>>= 5;
        }
        stringBuilder0.append(bmlr.c[((int)(3L & v1))]);
        return stringBuilder0.toString();
    }

    public static URI b(int v, byte[] arr_b, byte[] arr_b1) {
        return URI.create(("wss://" + bmlr.a(v) + "/cable/connect/" + ghjc.f.f().o(arr_b) + "/" + ghjc.f.f().o(arr_b1)));
    }
}

