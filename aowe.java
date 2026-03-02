import com.google.android.gms.autofill.data.Credential;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class aowe implements Predicate {
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
        Object object1 = ((amnm)object0).a;
        return (object1 instanceof Credential) ? true : hqbx.l() && (object1 instanceof amnz);
    }
}

