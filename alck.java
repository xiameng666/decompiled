import j..util.function.Predicate.-CC;
import java.util.Set;
import java.util.function.Predicate;

public final class alck implements Predicate {
    public final Set a;
    public final Set b;
    public final Set c;

    public alck(Set set0, Set set1, Set set2) {
        this.a = set0;
        this.b = set1;
        this.c = set2;
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
        if(!this.a.isEmpty() && !this.a.contains(((alcp)object0).a)) {
            return false;
        }
        String s = ((alcp)object0).a;
        return this.b.contains(s) ? false : this.c.isEmpty() || this.c.contains(s);
    }
}

