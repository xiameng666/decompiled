import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public final class fgzv {
    public static long a(byte[] arr_b) {
        int v2;
        int v1;
        long v = 0L;
        if(arr_b.length != 0) {
            while(true) {
                v1 = 0;
                v2 = arr_b[0];
                if(v2 != 0) {
                    break;
                }
                arr_b = Arrays.copyOfRange(arr_b, 1, arr_b.length);
            }
            if((v2 & 0xF0) == 0xF0 && (v2 & 15) < 10) {
                v = (long)(v2 & 15);
                v1 = 1;
            }
            while(v1 < arr_b.length) {
                int v3 = arr_b[v1];
                int v4 = v3 & 15;
                int v5 = (byte)((v3 & 0xFF) >>> 4);
                if(v5 > 9 || v4 > 9) {
                    throw new IllegalArgumentException(String.format("Invalid BCD: %s digits: %d, %d", ghjc.f.o(arr_b), ((byte)v5), ((byte)v4)));
                }
                v = v * 100L + ((long)(v5 * 10)) + ((long)v4);
                ++v1;
                continue;
            }
        }
        return v;
    }

    public static byte[] b(String s) {
        int v4;
        char[] arr_c = s.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(8);
        int v1 = 1 == (arr_c.length & 1) ? -16 : 0;
        int v2 = arr_c.length & 1 ^ 1;
        for(int v = 0; v < arr_c.length; ++v) {
            int v3 = (byte)(arr_c[v] - 0x30);
            if(v2 == 0) {
                v4 = (byte)(v3 | v1);
                byteArrayOutputStream0.write(v4);
            }
            else {
                v4 = (byte)(v3 << 4);
            }
            v1 = v4;
            v2 ^= 1;
        }
        return byteArrayOutputStream0.toByteArray();
    }
}

