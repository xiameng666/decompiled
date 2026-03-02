import com.google.android.gms.tapandpay.firstparty.AvailableOtherPaymentMethodsWithInfo;
import java.util.function.IntFunction;

public final class etyf implements IntFunction {
    @Override
    public final Object apply(int v) {
        return new AvailableOtherPaymentMethodsWithInfo[v];
    }
}

