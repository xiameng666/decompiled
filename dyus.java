import com.google.android.gms.pay.GooglePaymentMethodId;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dyus implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return (GooglePaymentMethodId)bauc.a(((byte[])object0), GooglePaymentMethodId.CREATOR);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

