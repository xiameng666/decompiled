import j..util.Objects;
import java.security.InvalidParameterException;
import java.util.Arrays;

public final class bmcg extends bmck {
    private final byte a;

    public bmcg(int v, byte b, byte[] arr_b) {
        super(arr_b);
        gftb.check(arr_b);
        this.d = v;
        if(b < 0) {
            throw new InvalidParameterException("Provided sequence invalid");
        }
        if(arr_b.length > 59) {
            throw new InvalidParameterException("Data size is greater than maximum of 59");
        }
        if(arr_b.length == 0) {
            throw new InvalidParameterException("Data size must be greater than 0");
        }
        this.a = b;
    }

    @Override  // bmck
    public final byte[] a() {
        byte[] arr_b = new byte[5];
        int v = 0;
        int v1 = 3;
        while(v1 >= 0) {
            arr_b[v] = (byte)(this.d >>> v1 * 8);
            --v1;
            ++v;
        }
        arr_b[v] = this.a;
        return glwl.d(new byte[][]{arr_b, this.c, new byte[59 - this.c.length]});
    }

    @Override  // bmck
    public final boolean equals(Object object0) {
        return (object0 instanceof bmcg) ? super.equals(object0) && this.a == ((bmcg)object0).a : false;
    }

    @Override  // bmck
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.c);
        return Objects.hash(new Object[]{((byte)this.a), integer0, ((int)this.d)});
    }
}

