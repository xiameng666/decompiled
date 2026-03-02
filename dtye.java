import com.google.android.gms.mdocstore.types.ProvisioningId;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dtye implements Predicate {
    public final ProvisioningId a;

    public dtye(ProvisioningId provisioningId0) {
        this.a = provisioningId0;
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
        if(((gtxi)object0).b.equals(this.a.a)) {
            switch(((gtxi)object0).c) {
                case 3: {
                    return true;
                }
                case 4: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

