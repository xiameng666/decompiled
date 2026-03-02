import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

public final class czry {
    public final int a;
    public final int b;
    public final boolean c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final int g;
    public final byte[] h;
    public final boolean i;

    public czry(int v, int v1, boolean z, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, int v2, boolean z1, byte[] arr_b3) {
        this.a = v;
        this.b = v1;
        this.c = z;
        this.d = !z && arr_b != null ? Arrays.copyOf(arr_b, 3) : null;
        this.e = Arrays.copyOf(arr_b1, arr_b1.length);
        this.f = arr_b2;
        this.g = v2;
        this.i = z1;
        this.h = arr_b3;
    }

    public static boolean a(int v) {
        return v == 2;
    }

    public static boolean b(int v) {
        return v == 2;
    }

    public static byte[] c(int v, int v1, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, boolean z, boolean z1, int v2, byte[] arr_b3) {
        if(v != 2) {
            czkq.a.b().h("Cannot serialize BleAdvertisement: unsupported Version %d", Integer.valueOf(v));
            return null;
        }
        if(v1 != 2) {
            czkq.a.b().h("Cannot serialize BleAdvertisement: unsupported SocketVersion %d", Integer.valueOf(v1));
            return null;
        }
        if(arr_b != null && arr_b.length != 3) {
            czkq.a.b().i("Cannot serialize BleAdvertisement: expected a serviceIdHash of %d bytes but got %d", Integer.valueOf(3), Integer.valueOf(arr_b.length));
            return null;
        }
        if(arr_b2 != null && arr_b2.length != 2) {
            czkq.a.b().i("Cannot serialize BleAdvertisement: expected a deviceToken of %d bytes but got %d", Integer.valueOf(2), Integer.valueOf(arr_b2.length));
            return null;
        }
        czsa czsa0 = new czsa();
        czsa0.a = v2;
        if(hvol.aJ() && arr_b3 != null) {
            czsa0.b(arr_b3);
        }
        byte[] arr_b4 = czsa0.a().b();
        int v3 = 0;
        int v4 = arr_b2 == null ? 0 : arr_b2.length;
        if(arr_b4 != null) {
            v3 = arr_b4.length;
        }
        int v5 = ((int)z) ? arr_b1.length + 2 + v4 : v3 + (arr_b1.length + 8 + v4);
        int v6 = ((int)z) ? 27 : 0x200;
        if(v5 > v6) {
            czkq.a.b().i("Cannot serialize BleAdvertisement: expected total advertisement length of at most %d bytes but got %d", Integer.valueOf(v6), Integer.valueOf(v5));
            return null;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v5);
        byteBuffer0.put((z1 ? ((byte)(((byte)(72 | ((int)z) + ((int)z) & 2)) | 1)) : ((byte)(72 | ((int)z) + ((int)z) & 2))));
        if(((int)z) == 0 && arr_b != null) {
            byteBuffer0.put(arr_b);
        }
        if(((int)z) == 0) {
            byteBuffer0.putInt(arr_b1.length);
        }
        else {
            byteBuffer0.put(((byte)arr_b1.length));
        }
        byteBuffer0.put(arr_b1);
        if(arr_b2 != null) {
            byteBuffer0.put(arr_b2);
        }
        if(((int)z) == 0 && arr_b4 != null) {
            byteBuffer0.put(arr_b4);
        }
        return byteBuffer0.array();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof czry) ? this.a == ((czry)object0).a && this.b == ((czry)object0).b && Arrays.equals(this.d, ((czry)object0).d) && Arrays.equals(this.e, ((czry)object0).e) && Arrays.equals(this.f, ((czry)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.d);
        Integer integer1 = Arrays.hashCode(this.e);
        Integer integer2 = Arrays.hashCode(this.f);
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), integer0, integer1, integer2});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        String s = czmk.g(this.d);
        String s1 = czmk.g(this.e);
        String s2 = czmk.g(this.f);
        String s3 = czmk.g(this.h);
        return String.format(locale0, "BleAdvertisement { version=%d, socketVersion=%d, isFast=%s, serviceIdHash=%s, data=%s, deviceToken=%s, rxAdvertisement=%s }", ((int)this.a), ((int)this.b), Boolean.valueOf(this.c), s, s1, s2, s3);
    }
}

