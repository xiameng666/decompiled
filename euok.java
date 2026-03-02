import com.google.android.libraries.tapandpay.ui.callout.Callout;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class euok implements Consumer {
    @Override
    public final void accept(Object object0) {
        ((Callout)object0).setVisibility(8);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

