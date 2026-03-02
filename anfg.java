import j..util.function.IntPredicate.-CC;
import java.util.function.IntPredicate;

public final class anfg implements IntPredicate {
    public final IntPredicate and(IntPredicate intPredicate0) {
        return IntPredicate.-CC.$default$and(this, intPredicate0);
    }

    public final IntPredicate negate() {
        return IntPredicate.-CC.$default$negate(this);
    }

    public final IntPredicate or(IntPredicate intPredicate0) {
        return IntPredicate.-CC.$default$or(this, intPredicate0);
    }

    @Override
    public final boolean test(int v) {
        return v == 0;
    }
}

