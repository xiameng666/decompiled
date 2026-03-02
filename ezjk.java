import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class ezjk implements Predicate {
    public final String a;

    public ezjk() {
        this.a = "auth_trust_agent_pref_trusted_bluetooth_title";
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
        return ((String)object0).startsWith(this.a);
    }
}

