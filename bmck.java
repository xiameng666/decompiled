import j..util.Objects;
import java.util.Arrays;

public abstract class bmck {
    protected byte[] c;
    protected int d;

    protected bmck() {
        this.c = new byte[0];
    }

    protected bmck(byte[] arr_b) {
        if(arr_b == null) {
            this.c = new byte[0];
            return;
        }
        this.c = arr_b;
    }

    public abstract byte[] a();

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof bmck) ? Arrays.equals(this.c, ((bmck)object0).c) && this.d == ((bmck)object0).d : false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(this.c), ((int)this.d)});
    }
}

