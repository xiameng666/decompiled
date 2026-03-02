import android.accounts.Account;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fcmu implements Predicate {
    public final fcnm a;

    public fcmu(fcnm fcnm0) {
        this.a = fcnm0;
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
        return !bbmn.w(this.a.b, ((Account)object0).name);
    }
}

