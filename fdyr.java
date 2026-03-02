import java.util.Arrays;

public final class fdyr {
    public final int a;
    public final byte[] b;

    public fdyr(int v, byte[] arr_b) {
        this.a = v;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fdyr) ? this.a == ((fdyr)object0).a && Arrays.equals(this.b, ((fdyr)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return this.a * 0x1F + v;
    }
}

