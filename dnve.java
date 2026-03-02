import com.google.android.libraries.tapandpay.ui.callout.Callout;

public final class dnve implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Callout)object0), "callout");
        if(hyws.h()) {
            ((Callout)object0).setVisibility(8);
            return ibom.a;
        }
        ((Callout)object0).q(0x7F152242);  // string:pay_tokenize_this_might_take_a_moment "This might take a moment"
        return ibom.a;
    }
}

