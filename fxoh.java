import j..util.function.LongPredicate.-CC;
import java.util.function.LongPredicate;

public final class fxoh implements LongPredicate {
    public final fxot a;
    public final long b;

    public fxoh(fxot fxot0, long v) {
        this.a = fxot0;
        this.b = v;
    }

    public final LongPredicate and(LongPredicate longPredicate0) {
        return LongPredicate.-CC.$default$and(this, longPredicate0);
    }

    public final LongPredicate negate() {
        return LongPredicate.-CC.$default$negate(this);
    }

    public final LongPredicate or(LongPredicate longPredicate0) {
        return LongPredicate.-CC.$default$or(this, longPredicate0);
    }

    @Override
    public final boolean test(long v) {
        if(Long.compare(v, 0L) > 0) {
            long v1 = ((fxos)this.a.c.get(0)).a.a;
            return this.b - v < v1;
        }
        return false;
    }
}

