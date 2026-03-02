import j..util.function.Predicate.-CC;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;

public final class atmh implements Predicate {
    public final Set a;

    public atmh(Set set0) {
        this.a = set0;
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
        if(((aqhy)((Map.Entry)object0).getValue()).c) {
            Object object1 = ((Map.Entry)object0).getKey();
            return !this.a.contains(object1);
        }
        return false;
    }
}

