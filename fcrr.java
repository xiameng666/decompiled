import android.app.backup.RestoreSet;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fcrr implements Predicate {
    public final long a;

    public fcrr(long v) {
        this.a = v;
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
        return ((RestoreSet)object0).token == this.a;
    }
}

