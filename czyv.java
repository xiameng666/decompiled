import java.util.Arrays;

public final class czyv {
    public final String a;

    public czyv(String s) {
        this.a = s;
    }

    public static czyv a() {
        return czyv.b(czmk.X(0x40));
    }

    public static czyv b(byte[] arr_b) {
        return new czyv(bboy.e(czmk.Y(arr_b, 0x20)));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof czyv) ? bata.b(this.a, ((czyv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final String toString() {
        return String.format("PeerId<id: %s>", this.a);
    }
}

