import j..util.function.Predicate.-CC;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;

final class bgqz implements Predicate {
    private final Set a;

    public bgqz() {
        this.a = new HashSet();
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
        if(((hgtr)object0) == null) {
            return false;
        }
        if(this.a.add(((hgtr)object0).c.toLowerCase(Locale.ROOT))) {
            return true;
        }
        ((ggtj)bgra.a.i()).B("duplicate lang: %s", ((hgtr)object0).c);
        return false;
    }
}

