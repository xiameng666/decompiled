import java.util.Arrays;

public final class hbjv {
    public final hbju a;
    public final Integer b;
    private final Integer c;
    private final Boolean d;

    public hbjv(hbjt hbjt0) {
        this.a = hbjt0.a;
        this.b = hbjt0.b;
        this.c = null;
        this.d = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof hbjv) ? bata.b(this.a, ((hbjv)object0).a) && bata.b(this.b, ((hbjv)object0).b) && bata.b(null, null) && bata.b(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, 0, 0});
    }
}

