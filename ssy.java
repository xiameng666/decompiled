import java.math.BigInteger;

public final class ssy {
    public final int a;

    public ssy(int v) {
        if(v > 0xFFFF) {
            throw new IllegalArgumentException("Tag must fit into two bytes");
        }
        if(v <= 0) {
            throw new IllegalArgumentException("Tag must be greater then zero");
        }
        byte[] arr_b = sto.h(sto.g(((short)v)));
        if(arr_b.length == 2 && (arr_b[1] & 0x80) != 0) {
            throw new IllegalArgumentException("Second byte must not have bit 8 set");
        }
        this.a = v;
    }

    public final int a() {
        return new BigInteger(1, this.d()).intValue();
    }

    public final boolean b() {
        return (this.e()[0] & 0x20) != 0;
    }

    public final boolean c() {
        return this.a < 0xDF30 || this.a > 0xDF7F ? this.a >= 0xFF30 && this.a <= 0xFF7F : true;
    }

    final byte[] d() {
        byte[] arr_b = this.e();
        arr_b[0] = (byte)(arr_b[0] & 0xDF);
        return arr_b;
    }

    public final byte[] e() {
        return sto.h(sto.g(((short)this.a)));
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a == ((ssy)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }
}

