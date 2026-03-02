import java.io.ByteArrayOutputStream;

public final class esyw {
    public static long a(byte[] arr_b) {
        long v = 0L;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        while(v1 < arr_b.length + arr_b.length) {
            int v2 = v1 % 2 == 0 ? arr_b[v1 / 2] >>> 4 : arr_b[v1 / 2];
            if((v2 & 15) == 15) {
                if(z) {
                    z1 = true;
                }
                ++v1;
                continue;
            }
            if((v2 & 15) > 9 || z1) {
                throw new IllegalArgumentException(String.format("Invalid BCD: %s digit: %d", ghjc.f.o(arr_b), ((int)(v2 & 15))));
            }
            v = v * 10L + ((long)(v2 & 15));
            z1 = false;
            z = true;
            ++v1;
            continue;
        }
        return v;
    }

    public static byte[] b(String s) {
        char[] arr_c = s.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(8);
        int v1 = 1;
        int v2 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            int v3 = (byte)(arr_c[v] - 0x30);
            if(v1 == 0) {
                v2 = (byte)(v2 | v3);
                byteArrayOutputStream0.write(v2);
            }
            else {
                v2 = (byte)(v3 << 4);
            }
            v1 ^= 1;
        }
        if(v1 == 0) {
            byteArrayOutputStream0.write(((int)(((byte)(v2 | 15)))));
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public static byte[] c(long v, int v1) {
        char[] arr_c = Long.toString(v).toCharArray();
        if(v1 > 0 && arr_c.length > v1 + v1) {
            throw new IllegalArgumentException("Result too long for desired length");
        }
        int v2 = arr_c.length & 1;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(8);
        if(v1 > 0) {
            int v4 = arr_c.length + 1;
            for(int v5 = 0; v5 < v1 - v4 / 2; ++v5) {
                byteArrayOutputStream0.write(0);
            }
        }
        int v6 = v2 ^ 1;
        int v7 = 0;
        for(int v3 = 0; v3 < arr_c.length; ++v3) {
            int v8 = (byte)(arr_c[v3] - 0x30);
            if(v6 == 0) {
                v7 = (byte)(v7 | v8);
                byteArrayOutputStream0.write(v7);
            }
            else {
                v7 = (byte)(v8 << 4);
            }
            v6 ^= 1;
        }
        return byteArrayOutputStream0.toByteArray();
    }
}

