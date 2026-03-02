import j..util.function.Predicate.-CC;
import java.util.Arrays;
import java.util.function.Predicate;

public final class aoxq implements Predicate {
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
        return !((amwz)object0).i(ando.k) || !Arrays.asList(hqec.d().split("\\|")).contains(String.valueOf(((amwz)object0).d.a())) ? hqec.e() && ((amwz)object0).c.contains(ando.ap) : true;
    }
}

