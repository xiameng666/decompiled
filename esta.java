import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class esta {
    public static final esta a;
    public static final esta b;
    public static final esta c;
    public static final esta d;
    public static final esta e;
    public static final esta f;
    public static final esta g;
    public static final esta h;
    public static final esta i;
    public static final esta j;
    public static final esta k;
    public static final esta l;
    public static final esta m;
    public static final esta n;
    public final byte[] o;
    public final int p;
    private final long q;

    static {
        esta.a = esta.c(27013);
        esta.b = esta.c(27015);
        esta.c = esta.c(27270);
        esta.d = esta.c(0x6A82);
        esta.e = esta.c(0x6A80);
        esta.f = esta.c(0x6700);
        esta.g = esta.c(0x6E00);
        esta.h = esta.c(0x6D00);
        esta.i = esta.c(0x9000);
        esta.j = esta.c(27010);
        esta.k = esta.c(0x6A83);
        esta.l = esta.c(0x6A81);
        esta.m = esta.c(27012);
        esta.c(0x6A88);
        esta.n = esta.c(0x6F00);
    }

    public esta(byte[] arr_b, int v, long v1) {
        this.o = (byte[])arr_b.clone();
        this.p = v;
        this.q = v1;
    }

    public static esta a(byte[] arr_b, int v) {
        return esta.b(glwl.d(new byte[][]{arr_b, glxf.d(((short)v))}));
    }

    public static esta b(byte[] arr_b) {
        long v = TimeUnit.MILLISECONDS.toMillis(-1L);
        gftb.k(arr_b.length >= 2, "Invalid response APDU after %sms. Must be at least 2 bytes long: [%s]", v, essz.a(arr_b));
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        byte[] arr_b1 = new byte[arr_b.length - 2];
        byteBuffer0.get(arr_b1, 0, arr_b.length - 2);
        return new esta(arr_b1, ((int)(((char)byteBuffer0.getShort()))), v);
    }

    public static esta c(int v) {
        return esta.b(glxf.d(((short)v)));
    }

    public final byte[] d() {
        return (byte[])this.o.clone();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == null ? false : this.getClass() == object0.getClass() && Arrays.equals(this.o, ((esta)object0).o) && this.p == ((esta)object0).p;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(this.o), ((int)this.p)});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Response: ");
        byte[] arr_b = this.o;
        if(arr_b != null && arr_b.length > 0) {
            stringBuilder0.append(essz.a(arr_b));
            stringBuilder0.append(", ");
        }
        stringBuilder0.append(String.format("SW=%04x", ((int)this.p)));
        long v = this.q;
        if(v > -1L) {
            stringBuilder0.append(String.format(Locale.getDefault(), ", elapsed: %dms", v));
        }
        return stringBuilder0.toString();
    }
}

