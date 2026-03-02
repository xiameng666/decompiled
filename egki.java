import com.google.android.gms.people.cpg.model.ActionPreferenceDocument;
import j..util.function.Predicate.-CC;
import java.util.Map.Entry;
import java.util.function.Predicate;

public final class egki implements Predicate {
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
        return ((ActionPreferenceDocument)((Map.Entry)object0).getValue()).e == 1;
    }
}

