import java.util.Arrays;
import javax.crypto.SecretKey;

public final class qur {
    public static final ibns a(SecretKey secretKey0, byte[] arr_b) {
        int v1;
        ibuq.f(arr_b, "message");
        try {
            byte[] arr_b1 = (byte[])quq.b(secretKey0, new byte[16]).a;
            if(arr_b1 == null) {
                return new ibns(null, qul.f);
            }
            byte[] arr_b2 = qur.b(arr_b1);
            byte[] arr_b3 = qur.b(arr_b2);
            byte[] arr_b4 = Arrays.copyOf(arr_b, arr_b.length);
            ibuq.e(arr_b4, "copyOf(...)");
            int v = arr_b.length & 15;
            if(arr_b.length == 0) {
                v1 = 16;
            }
            else {
                v1 = v == 0 ? 0 : 16 - v;
            }
            if(v1 > 0) {
                arr_b4 = ibpg.k(arr_b4, ibpg.k(new byte[]{(byte)0x80}, new byte[v1 - 1]));
            }
            ibns ibns0 = new ibns(arr_b4, Boolean.valueOf(v1 > 0));
            byte[] arr_b5 = (byte[])ibns0.a;
            if(((Boolean)ibns0.b).booleanValue()) {
                arr_b2 = arr_b3;
            }
            for(int v2 = arr_b5.length - 16; v2 < arr_b5.length; ++v2) {
                arr_b5[v2] = (byte)(arr_b5[v2] ^ arr_b2[v2 - arr_b5.length + 16]);
            }
            byte[] arr_b6 = new byte[16];
            int v3 = arr_b5.length >> 4;
            int v4 = 0;
            while(v4 < v3) {
                int v5 = v4 * 16;
                ++v4;
                byte[] arr_b7 = ibpg.W(arr_b5, new ibwm(v5, v4 * 16 - 1));
                for(int v6 = 0; v6 < 16; ++v6) {
                    arr_b7[v6] = (byte)(arr_b7[v6] ^ arr_b6[v6]);
                }
                arr_b6 = (byte[])quq.b(secretKey0, arr_b7).a;
                if(arr_b6 == null) {
                    return new ibns(null, qul.f);
                }
            }
            return new ibns(arr_b6, null);
        }
        catch(Exception unused_ex) {
            return new ibns(null, qul.g);
        }
    }

    private static final byte[] b(byte[] arr_b) {
        byte[] arr_b1 = new byte[16];
        for(int v = 0; v < 16; ++v) {
            int v1 = arr_b[v];
            byte b = (byte)(v1 + v1 & 0xFE);
            arr_b1[v] = b;
            if(v < 15) {
                arr_b1[v] = (byte)(arr_b[v + 1] >> 7 & 1 | b);
            }
        }
        if(((byte)(arr_b[0] & 0xFFFFFF80)) == 0xFFFFFF80) {
            arr_b1[15] = (byte)(arr_b1[15] ^ 0xFFFFFF87);
        }
        return arr_b1;
    }
}

