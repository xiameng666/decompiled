import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class aqir implements Predicate {
    public final String a;

    public aqir(String s) {
        this.a = s;
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
        return ((ModuleManager.ModuleInfo)object0).moduleId.equals(this.a);
    }
}

