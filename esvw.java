import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class esvw {
    public final int a;
    private final byte[] b;
    private final long c;

    static {
        esvw.c(27013);
        esvw.c(27270);
        esvw.c(0x6A82);
        esvw.c(0x6B00);
        esvw.c(0x6A80);
        esvw.c(0x6700);
        esvw.c(0x6E00);
        esvw.c(0x6D00);
        esvw.c(0x6A82);
        esvw.c(0x6F00);
    }

    public esvw(byte[] arr_b, int v, long v1) {
        this.b = arr_b;
        this.a = v;
        this.c = v1;
    }

    public static esvw a(byte[] arr_b, int v) {
        gftb.checkTrue(v >> 16 == 0);
        return esvw.b(glwl.d(new byte[][]{arr_b, glxf.d(((short)v))}));
    }

    public static esvw b(byte[] arr_b) {
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        gftb.check(arr_b);
        long v = timeUnit0.toMillis(-1L);
        gftb.k(arr_b.length >= 2, "Invalid response APDU after %sms. Must be at least 2 bytes long: [%s]", v, esxg.a(arr_b));
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        byte[] arr_b1 = new byte[arr_b.length - 2];
        byteBuffer0.get(arr_b1, 0, arr_b.length - 2);
        return new esvw(arr_b1, ((int)(((char)byteBuffer0.getShort()))), v);
    }

    public static esvw c(int v) {
        gftb.checkTrue(v >> 16 == 0);
        return esvw.b(glxf.d(((short)v)));
    }

    public final byte[] d() {
        return (byte[])this.b.clone();
    }

    public final byte[] e() {
        return glwl.d(new byte[][]{this.b, glxf.d(((short)this.a))});
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == null ? false : this.getClass() == object0.getClass() && Arrays.equals(this.b, ((esvw)object0).b) && this.a == ((esvw)object0).a;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(this.b), ((int)this.a)});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Response: ");
        byte[] arr_b = this.b;
        if(arr_b.length > 0) {
            stringBuilder0.append(esxg.a(arr_b));
            stringBuilder0.append(", ");
        }
        stringBuilder0.append(String.format("SW=%04x", ((int)this.a)));
        long v = this.c;
        if(v > -1L) {
            stringBuilder0.append(String.format(Locale.US, ", elapsed: %dms", v));
        }
        return stringBuilder0.toString();
    }
}

