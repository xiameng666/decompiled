import java.nio.ByteBuffer;

public final class czsq {
    public final int a;
    public final byte[] b;
    public final byte[] c;

    private czsq(int v, byte[] arr_b, byte[] arr_b1) {
        this.a = v;
        this.b = arr_b;
        this.c = arr_b1;
    }

    public static czsq a(byte[] arr_b) {
        Integer integer0 = (int)1;
        if(arr_b.length <= 0) {
            czkq.a.b().i("Cannot deserialize BleL2capPacket: expected at least %d bytes, but got %d.", integer0, Integer.valueOf(0));
            return null;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        int v = byteBuffer0.get();
        if(v != 2 && v != 3 && v != 22 && v != 23 && v != 24) {
            if(byteBuffer0.remaining() <= 2) {
                czkq.a.b().i("Cannot deserialize BleL2capPacket for command %d : expected two bytes length field but remaining %d bytes", Integer.valueOf(v), Integer.valueOf(byteBuffer0.remaining()));
                return null;
            }
            int v1 = byteBuffer0.getShort();
            if(v1 < byteBuffer0.remaining()) {
                czkq.a.b().i("Cannot deserialize BleL2capPacket: expected data length %d bytes but remaining %d", Integer.valueOf(v1), Integer.valueOf(byteBuffer0.remaining()));
                return null;
            }
            if(v == 1) {
                if(v1 < 3) {
                    czkq.a.b().j("Cannot deserialize BleL2capPacket for command %d : expected serviceIdHash length is %d but got %d.", integer0, Integer.valueOf(3), Integer.valueOf(v1));
                    return null;
                }
                byte[] arr_b1 = new byte[v1];
                byteBuffer0.get(arr_b1);
                return new czsq(1, arr_b1, null);
            }
            if(v == 21) {
                if(v1 > 0x200) {
                    czkq.a.b().i("Cannot deserialize BleL2capPacket: expected total advertisement length of at most %d bytes but got %d.", Integer.valueOf(0x200), Integer.valueOf(v1));
                    return null;
                }
                byte[] arr_b2 = new byte[v1];
                byteBuffer0.get(arr_b2);
                return new czsq(21, null, arr_b2);
            }
            czkq.a.b().h("Cannot deserialize BleL2capPacket with unknown command %d", Integer.valueOf(v));
            return null;
        }
        return new czsq(v, null, null);
    }

    public static boolean b(int v) {
        return v > 0 && v < 0x203;
    }

    public static byte[] c(String s) {
        return czmk.Y(s.getBytes(), 3);
    }

    public static byte[] d(int v, byte[] arr_b) {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate((arr_b == null ? 1 : arr_b.length + 3));
        byteBuffer0.put(((byte)(v & 0xFF)));
        if(arr_b != null) {
            byteBuffer0.putShort(((short)arr_b.length));
            byteBuffer0.put(arr_b);
        }
        return byteBuffer0.array();
    }

    public static byte[] e() {
        return czsq.d(24, null);
    }

    public static byte[] f() {
        return czsq.d(22, null);
    }
}

