import j..util.Objects;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Set;

public final class esvv {
    public final byte a;
    public final byte b;
    public final byte c;
    public final byte d;
    private final int e;
    private final int f;
    private final byte[] g;
    private final Set h;

    public esvv(int v, int v1, int v2, int v3, byte[] arr_b, int v4, esvx[] arr_esvx) {
        boolean z = true;
        this.a = (byte)(v & 0xFF);
        this.b = (byte)(v1 & 0xFF);
        this.c = (byte)(v2 & 0xFF);
        this.d = (byte)(v3 & 0xFF);
        byte[] arr_b1 = arr_b == null ? new byte[0] : ((byte[])arr_b.clone());
        this.g = arr_b1;
        this.e = arr_b1.length;
        this.f = v4;
        gftb.d(arr_b1.length >> 16 == 0, "Lc must be between 0 and 65,535: %s", arr_b1.length);
        ggfp ggfp0 = ggfp.H(arr_esvx);
        this.h = ggfp0;
        for(Object object0: ggfp0) {
            if(esvx.A.contains(((esvx)object0))) {
                continue;
            }
            else {
                z = false;
            }
            break;
        }
        gftb.checkTrue(z);
    }

    public final int a() {
        gftb.q(this.f != -1);
        return this.f;
    }

    public static esvv b(byte[] arr_b) {
        int v6;
        byte[] arr_b2;
        gftb.check(arr_b);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        int v = byteBuffer0.get();
        int v1 = byteBuffer0.get();
        int v2 = byteBuffer0.get();
        int v3 = byteBuffer0.get();
        byte[] arr_b1 = new byte[0];
        int v4 = -1;
        if(byteBuffer0.hasRemaining()) {
            int v5 = esvt.a(byteBuffer0.get());
            if(byteBuffer0.hasRemaining()) {
                arr_b1 = new byte[v5];
                byteBuffer0.get(arr_b1);
                if(byteBuffer0.hasRemaining()) {
                    v4 = esvt.a(byteBuffer0.get());
                }
                arr_b2 = arr_b1;
                v6 = v4;
            }
            else {
                arr_b2 = arr_b1;
                v6 = v5;
            }
        }
        else {
            arr_b2 = arr_b1;
            v6 = -1;
        }
        if(!byteBuffer0.hasRemaining()) {
            return esvu.a(((byte)v), ((byte)v1), ((byte)v2), ((byte)v3), v6, arr_b2);
        }
        throw new IllegalArgumentException("Invalid APDU: " + esxg.a(arr_b));
    }

    public final byte[] c() {
        return (byte[])this.g.clone();
    }

    public final byte[] d() {
        boolean z;
        int v2;
        int v = this.e;
        int v1 = 4;
        if(v > 0) {
            v2 = v + 5;
            if(v > 0xFF) {
                v2 = v + 7;
                z = true;
            }
            else {
                z = false;
            }
        }
        else {
            v2 = 4;
            z = false;
        }
        int v3 = this.f;
        if(v3 >= 0) {
            v2 = z ? v2 + 3 : v2 + 1;
        }
        byte[] arr_b = new byte[v2];
        arr_b[0] = this.a;
        arr_b[1] = this.b;
        arr_b[2] = this.c;
        arr_b[3] = this.d;
        if(v > 0) {
            if(z) {
                arr_b[4] = 0;
                arr_b[5] = (byte)(v >> 8);
                arr_b[6] = (byte)(v & 0xFF);
                System.arraycopy(this.g, 0, arr_b, 7, v);
                v1 = v + 7;
            }
            else {
                arr_b[4] = (byte)v;
                System.arraycopy(this.g, 0, arr_b, 5, v);
                v1 = v + 5;
            }
        }
        if(v3 >= 0) {
            if(z) {
                arr_b[v1] = 0;
                arr_b[v1 + 1] = 0;
                arr_b[v1 + 2] = (byte)v3;
                return arr_b;
            }
            arr_b[v1] = (byte)v3;
        }
        return arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == null ? false : this.getClass() == object0.getClass() && this.a == ((esvv)object0).a && this.b == ((esvv)object0).b && this.c == ((esvv)object0).c && this.d == ((esvv)object0).d && Arrays.equals(this.g, ((esvv)object0).g) && this.f == ((esvv)object0).f && this.h.equals(((esvv)object0).h);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.g);
        return Objects.hash(new Object[]{((byte)this.a), ((byte)this.b), ((byte)this.c), ((byte)this.d), integer0, ((int)this.f), this.h});
    }

    @Override
    public final String toString() {
        StringWriter stringWriter0 = new StringWriter();
        PrintWriter printWriter0 = new PrintWriter(stringWriter0);
        printWriter0.printf("Command : CLA=%02x, INS=%02x, P1=%02x, P2=%02x", new Object[]{((byte)this.a), ((byte)this.b), ((byte)this.c), ((byte)this.d)});
        int v = this.e;
        if(v > 0) {
            printWriter0.printf(", Lc=%04x [%s]", new Object[]{v, esxg.a(this.g)});
        }
        int v1 = this.f;
        if(v1 >= 0) {
            printWriter0.printf(", Le=%04x", new Object[]{v1});
        }
        return stringWriter0.toString();
    }
}

