import android.content.pm.PackageInfo;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class atnf implements Predicate {
    public final atni a;

    public atnf(atni atni0) {
        this.a = atni0;
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
        atni atni0 = this.a;
        if(atni0.c.h(((PackageInfo)object0).packageName)) {
            return aqzg.f(((PackageInfo)object0)) ? aqzg.c(atni0.b, ((PackageInfo)object0)) == aqzf.a : aqzg.a(atni0.b, ((PackageInfo)object0)) == aqzf.a;
        }
        return false;
    }
}

