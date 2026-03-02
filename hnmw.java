import java.util.Arrays;

public final class hnmw {
    public byte[] a;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof hnmw) ? Arrays.equals(this.a, ((hnmw)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}

