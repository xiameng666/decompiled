import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

public final class czrz {
    public static final Charset a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final byte[] e;
    public final boolean f;
    public final boolean g;
    public final int h;

    static {
        czrz.a = Charset.forName("UTF-8");
    }

    public czrz(int v, byte[] arr_b, byte[] arr_b1, int v1, boolean z, boolean z1) {
        this.b = 2;
        this.c = v;
        this.d = arr_b;
        this.e = arr_b1;
        this.h = v1;
        this.f = z;
        this.g = z1;
    }

    public static czrz a(byte[] arr_b) {
        czrz czrz0 = null;
        if(arr_b != null) {
            try {
                czrz0 = czrz.c(bbmu.g(arr_b));
                return czrz0 == null ? czrz.c(arr_b) : czrz0;
            }
            catch(IllegalArgumentException unused_ex) {
                czkq.a.d().p("Cannot deserialize BleAdvertisementHeader: failed Base64 decoding.", new Object[0]);
                return czrz0 == null ? czrz.c(arr_b) : czrz0;
            }
        }
        czkq.a.d().p("Cannot deserialize BleAdvertisementHeader: null bytes passed in.", new Object[0]);
        return null;
    }

    public static byte[] b(int v, byte[] arr_b, byte[] arr_b1, int v1, boolean z, boolean z1) {
        if(arr_b.length != 10) {
            czkq.a.b().i("Cannot serialize BleAdvertisementHeader: expected serviceIdBloomFilter to be length %d but got %d instead", Integer.valueOf(10), Integer.valueOf(arr_b.length));
            return null;
        }
        if(arr_b1.length != 4) {
            czkq.a.b().i("Cannot serialize BleAdvertisementHeader: expected advertisementHash to be length %d but got %d instead", Integer.valueOf(4), Integer.valueOf(arr_b1.length));
            return null;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(17);
        byteBuffer0.put(((byte)(v & 7 | (((int)z) << 4 & 16 | 0x40 | ((int)z1) << 3 & 8))));
        byteBuffer0.put(arr_b);
        byteBuffer0.put(arr_b1);
        byteBuffer0.put(czup.i(v1));
        return bbmu.c(byteBuffer0.array()).getBytes(czrz.a);
    }

    private static czrz c(byte[] arr_b) {
        int v2;
        if(arr_b.length < 15) {
            czkq.a.d().i("Cannot deserialize BleAdvertisementHeader: expecting at least %d raw bytes, got %d", Integer.valueOf(15), Integer.valueOf(arr_b.length));
            return null;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        int v = byteBuffer0.get();
        int v1 = (v & 0xE0) >> 5;
        if(v1 == 2) {
            byte[] arr_b1 = new byte[10];
            byteBuffer0.get(arr_b1);
            byte[] arr_b2 = new byte[4];
            byteBuffer0.get(arr_b2);
            byte[] arr_b3 = new byte[2];
            boolean z = false;
            if(byteBuffer0.remaining() >= 2) {
                byteBuffer0.get(arr_b3);
                v2 = glxf.b(arr_b3);
            }
            else {
                v2 = 0;
            }
            if(hvol.a.r().bk() && (v & 7) != 5 && (v2 > 0xFF || v2 < 0)) {
                czkq.a.d().h("Drop incorrect advertisement header due to invalid psm : %d", Integer.valueOf(v2));
                return null;
            }
            if(1 == (v & 16) >> 4) {
                z = true;
            }
            return 1 == (v & 8) >> 3 ? new czrz(v & 7, arr_b1, arr_b2, v2, z, true) : new czrz(v & 7, arr_b1, arr_b2, v2, z, false);
        }
        czkq.a.d().h("Cannot deserialize BleAdvertisementHeader: unsupported Version %d", Integer.valueOf(v1));
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof czrz) ? this.c == ((czrz)object0).c && Arrays.equals(this.d, ((czrz)object0).d) && Arrays.equals(this.e, ((czrz)object0).e) && this.h == ((czrz)object0).h && this.f == ((czrz)object0).f : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.d);
        Integer integer1 = Arrays.hashCode(this.e);
        return Arrays.hashCode(new Object[]{((int)2), ((int)this.c), integer0, integer1, ((int)this.h), Boolean.valueOf(this.f)});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        String s = czmk.g(this.d);
        String s1 = czmk.g(this.e);
        return String.format(locale0, "BleAdvertisementHeader { version=%d, numSlots=%d, serviceIdBloomFilter=%s, advertisementHash=%s, psm=%s, supportExtendedAdvertisement=%s}", ((int)2), ((int)this.c), s, s1, ((int)this.h), Boolean.valueOf(this.f));
    }
}

