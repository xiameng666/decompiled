import j..util.Objects;
import java.util.Arrays;

public final class akwj {
    public final byte[] a;
    public final long b;
    public final long c;

    public akwj(byte[] arr_b, long v, long v1) {
        this.a = arr_b;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof akwj) ? Arrays.equals(this.a, ((akwj)object0).a) && this.b == ((akwj)object0).b && this.c == ((akwj)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(this.a), ((long)this.b), ((long)this.c)});
    }
}

