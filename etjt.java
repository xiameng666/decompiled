import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class etjt implements Predicate {
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
        return RequestTokenizeChimeraActivity.l.contains(Integer.valueOf(((Status)object0).i));
    }
}

