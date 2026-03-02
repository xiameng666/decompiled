import java.nio.ByteBuffer;
import java.util.Arrays;

public final class ssc extends ssi {
    public ssc(byte[] arr_b) {
        super(arr_b);
    }

    public static ssc a(byte[] arr_b) {
        int v = 2;
        switch(ssc.o(arr_b)) {
            case 2: 
            case 3: {
                int v1 = arr_b[0];
                if(stn.e(((byte)v1), ((byte)4)) && !stn.e(arr_b[1], ((byte)1))) {
                    v = 3;
                }
                if(stn.e(((byte)v1), ((byte)3))) {
                    v += 2;
                }
                return new ssc(Arrays.copyOf(arr_b, v));
            }
            default: {
                throw new IllegalStateException("Invalid key type, key flags are not from an authentication key");
            }
        }
    }

    public final short b() {
        if(!this.e()) {
            throw new IllegalStateException("Trying to get pseudo-random seed from AuthenticationKeysetFlags without pseudo random mode");
        }
        byte[] arr_b = Arrays.copyOfRange(this.a, this.a.length - 2, this.a.length);
        if(arr_b.length < 2) {
            arr_b = new byte[]{0, arr_b[0]};
        }
        return ByteBuffer.wrap(arr_b).getShort();
    }

    public final boolean c() {
        return this.l(3);
    }

    public final boolean d() {
        return stn.e(this.a[0], ((byte)5));
    }

    public final boolean e() {
        return stn.e(this.a[0], ((byte)3));
    }

    public final boolean f() {
        return this.l(2);
    }

    @Override  // ssi
    public final byte[] g() {
        byte[] arr_b = super.g();
        if(this.n() != 3) {
            arr_b[stn.e(this.a[0], ((byte)4)) + 1] = 0;
        }
        return stm.a(arr_b);
    }

    public final byte[] h() {
        return super.g();
    }

    public final int i() {
        if(this.f()) {
            return 1;
        }
        return this.c() ? 2 : 3;
    }
}

