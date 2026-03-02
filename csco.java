import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse.Filter;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class csco implements Function {
    public final MdpUpsellPlan a;

    public csco(MdpUpsellPlan mdpUpsellPlan0) {
        this.a = mdpUpsellPlan0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return Boolean.valueOf(((boolean)(this.a.l.contains(((MdpUpsellOfferResponse.Filter)object0).a) ^ 1)));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

