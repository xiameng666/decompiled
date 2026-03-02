import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice.DeviceReference;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class ezjo implements Predicate {
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
        return ((Boolean)((TrustedUiDevice.DeviceReference)object0).a().map(new ezjy()).orElse(Boolean.valueOf(false))).booleanValue();
    }
}

