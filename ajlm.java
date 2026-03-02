import java.util.Arrays;

public final class ajlm {
    public final byte[] a;

    public ajlm(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ajlm) ? Arrays.equals(this.a, ((ajlm)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

