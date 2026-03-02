import java.nio.ByteBuffer;

public final class sto {
    public static int a(byte[] arr_b) {
        return sto.b(arr_b, 0, arr_b.length);
    }

    public static int b(byte[] arr_b, int v, int v1) {
        int v2 = v1 - v;
        if(v2 == 4) {
            return ByteBuffer.wrap(arr_b, v, 4).getInt();
        }
        if(v2 >= 4) {
            while(true) {
                if(v >= v1) {
                    v = -1;
                    break;
                }
                if(arr_b[v] != 0) {
                    break;
                }
                ++v;
            }
            if(v == -1) {
                return 0;
            }
            if(v1 - v <= 4) {
                return ByteBuffer.wrap(arr_b, v1 - 4, 4).getInt();
            }
            throw new IllegalArgumentException("Value of byte array does not fit in Int");
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        byteBuffer0.position(4 - v2);
        byteBuffer0.put(arr_b, v, v2);
        byteBuffer0.position(0);
        return byteBuffer0.getInt();
    }

    public static boolean c(byte[] arr_b, byte[] arr_b1) {
        int v = sto.d(arr_b, arr_b1);
        return arr_b.length == arr_b1.length ? 1 & v : 0;
    }

    public static boolean d(byte[] arr_b, byte[] arr_b1) {
        int v = arr_b1.length;
        if(arr_b.length != 0) {
            int v1 = arr_b.length - v >>> 0x1F;
            for(int v2 = 0; v2 < v; ++v2) {
                v1 = (byte)(v1 | arr_b1[v2] ^ arr_b[v2 % arr_b.length]);
            }
            v = v1;
        }
        return v == 0;
    }

    public static byte[] e(byte[][] arr2_b) {
        int v2 = 0;
        for(int v1 = 0; v1 < arr2_b.length; ++v1) {
            v2 += arr2_b[v1].length;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v2);
        for(int v = 0; v < arr2_b.length; ++v) {
            byteBuffer0.put(arr2_b[v]);
        }
        return byteBuffer0.array();
    }

    public static byte[] f(byte[] arr_b) {
        if(arr_b.length != 8) {
            throw new IllegalArgumentException("Long buffer must be 8 bytes long");
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.put(arr_b);
        byteBuffer0.position(0);
        long v = byteBuffer0.getLong();
        byteBuffer0.position(0);
        byteBuffer0.putLong(v + 1L);
        return byteBuffer0.array();
    }

    public static byte[] g(short v) {
        return ByteBuffer.allocate(2).putShort(v).array();
    }

    public static byte[] h(byte[] arr_b) {
        int v = arr_b.length;
        int v1 = 0;
        while(v1 < arr_b.length) {
            if(arr_b[v1] == 0) {
                ++v1;
                continue;
            }
            else {
                v = v1;
            }
            break;
        }
        int v2 = arr_b.length - v;
        byte[] arr_b1 = new byte[v2];
        System.arraycopy(arr_b, v, arr_b1, 0, v2);
        return arr_b1;
    }

    public static byte[] i() {
        return new byte[srk.b.d];
    }
}

