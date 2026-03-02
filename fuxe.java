import java.util.Arrays;
import java.util.List;

public final class fuxe {
    public final int a;
    public final List b;

    public fuxe(int v, List list0) {
        this.a = v;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fuxe) && this.a == ((fuxe)object0).a && this.b.equals(((fuxe)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }
}

