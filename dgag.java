import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class dgag {
    public final int a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final int e;
    public final int f;
    private static final ggfp g;
    private final byte[] h;

    static {
        dgag.g = ggfp.K(Byte.valueOf(((byte)1)), Byte.valueOf(((byte)2)));
    }

    public dgag(int v, byte[] arr_b, byte[] arr_b1, int v1, byte[] arr_b2, byte[] arr_b3, int v2) {
        if(arr_b.length != 2 || arr_b1.length != 14) {
            throw new IllegalArgumentException("Advertisement\'s fields should be of required sizes.");
        }
        this.a = v;
        this.b = arr_b2;
        this.c = arr_b;
        this.d = arr_b1;
        this.e = v1;
        this.h = arr_b3;
        this.f = v2;
    }

    public final boolean a() {
        return this.b != null;
    }

    public static boolean b(int v) {
        if(v >= 17) {
            return v == 17;
        }
        throw new IllegalArgumentException("The size cannot be less than the minimum");
    }

    public static dgag c(byte[] arr_b) {
        byte[] arr_b5;
        ggeo ggeo0;
        byte[] arr_b3;
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        if(byteBuffer0.remaining() < 17) {
            dcvz.a.b().h("Failed to parse advertisement %s because it was too short.", dizs.b(arr_b));
            return null;
        }
        int v = byteBuffer0.get();
        int v1 = v >> 5 & 7;
        if(v1 != 0 && v1 != 1) {
            dcvz.a.b().h("Failed to parse advertisement %s because we failed to parse the version number", dizs.b(arr_b));
            return null;
        }
        int v2 = v >> 4 & 1 ^ 1;
        byte[] arr_b1 = new byte[2];
        byteBuffer0.get(arr_b1);
        byte[] arr_b2 = new byte[14];
        byteBuffer0.get(arr_b2);
        int v3 = v2 == 0 || !byteBuffer0.hasRemaining() ? 0 : byteBuffer0.get() & 0xFF;
        if(byteBuffer0.remaining() >= v3 && (v3 != 0 || v2 == 0)) {
            if(v3 > 0) {
                arr_b3 = new byte[v3];
                byteBuffer0.get(arr_b3);
                if(!Arrays.equals(arr_b3, new String(arr_b3).getBytes())) {
                    dcvz.a.b().h("Failed to parse advertisement %s because the device name was corrupted", dizs.b(arr_b));
                    return null;
                }
            }
            else {
                arr_b3 = null;
            }
            ggek ggek0 = new ggek();
            while(byteBuffer0.hasRemaining()) {
                Byte byte0 = byteBuffer0.get();
                if(dgag.g.contains(byte0) && byteBuffer0.hasRemaining()) {
                    int v4 = byteBuffer0.get() & 0xFF;
                    if(byteBuffer0.remaining() >= v4) {
                        byte[] arr_b4 = new byte[v4];
                        byteBuffer0.get(arr_b4);
                        ggek0.i(byte0, arr_b4);
                        continue;
                    }
                }
                ggeo0 = null;
                goto label_36;
            }
            ggeo0 = ggek0.b();
        label_36:
            if(ggeo0 == null) {
                arr_b5 = null;
            }
            else {
                Byte byte1 = (byte)1;
                if(ggeo0.containsKey(byte1)) {
                    arr_b5 = (byte[])ggeo0.get(byte1);
                    if(arr_b5 == null) {
                        dcvz.a.b().h("Failed to parse advertisement %s because the QR Code Advertising Token field length is not correct.", dizs.b(arr_b));
                        return null;
                    }
                }
                else {
                    arr_b5 = null;
                }
                Byte byte2 = (byte)2;
                if(ggeo0.containsKey(byte2)) {
                    byte[] arr_b6 = (byte[])ggeo0.get(byte2);
                    if(arr_b6 != null && arr_b6.length == 1) {
                        return new dgag(v1, arr_b1, arr_b2, v >> 1 & 7, arr_b3, arr_b5, arr_b6[0]);
                    }
                    dcvz.a.b().h("Failed to parse advertisement %s because the vendor ID field length is not correct.", dizs.b(arr_b));
                    return null;
                }
            }
            return new dgag(v1, arr_b1, arr_b2, v >> 1 & 7, arr_b3, arr_b5, 0);
        }
        dcvz.a.b().i("Failed to parse advertisement %s because the device name did not match the expected length %d", dizs.b(arr_b), Integer.valueOf(v3));
        return null;
    }

    public static byte[] d(dgag dgag0) {
        byte[] arr_b = dgag0.b;
        int v = 0;
        int v1 = arr_b == null ? 0 : arr_b.length;
        int v2 = v1 <= 0 ? 0 : 1;
        byte[] arr_b1 = dgag0.h;
        if(arr_b1 != null) {
            v = arr_b1.length;
        }
        int v3 = v <= 0 ? v2 + 17 + v1 : v2 + 17 + v1 + (v + 2);
        int v4 = dgag0.f;
        if(v4 != 0) {
            v3 += 3;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v3);
        byteBuffer0.put(((byte)(((byte)(dgag0.a << 5)) | (dgag0.a() ^ 1) << 4 | dgag0.e + dgag0.e)));
        byteBuffer0.put(dgag0.c);
        byteBuffer0.put(dgag0.d);
        if(arr_b != null && v1 > 0) {
            byteBuffer0.put(((byte)(v1 & 0xFF)));
            byteBuffer0.put(arr_b);
        }
        if(arr_b1 != null && v > 0) {
            byteBuffer0.put(1);
            byteBuffer0.put(((byte)(v & 0xFF)));
            byteBuffer0.put(arr_b1);
        }
        if(v4 != 0) {
            byteBuffer0.put(2);
            byteBuffer0.put(1);
            byteBuffer0.put(((byte)v4));
        }
        return byteBuffer0.array();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dgag) ? this.a == ((dgag)object0).a && Arrays.equals(this.b, ((dgag)object0).b) && Arrays.equals(this.c, ((dgag)object0).c) && Arrays.equals(this.d, ((dgag)object0).d) && this.e == ((dgag)object0).e && Arrays.equals(this.h, ((dgag)object0).h) && this.f == ((dgag)object0).f : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.b);
        Integer integer1 = Arrays.hashCode(this.c);
        Integer integer2 = Arrays.hashCode(this.d);
        Integer integer3 = Arrays.hashCode(this.h);
        return Objects.hash(new Object[]{((int)this.a), integer0, integer1, integer2, ((int)this.e), integer3, ((int)this.f)});
    }
}

