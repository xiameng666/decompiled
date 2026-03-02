import j..util.function.Predicate.-CC;
import java.util.Arrays;
import java.util.function.Predicate;

public final class dgau implements Predicate {
    public final byte[] a;

    public dgau(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override
    public final Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public final Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public final Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        return Arrays.equals(((heax)object0).b.toByteArray(), this.a);
    }
}

