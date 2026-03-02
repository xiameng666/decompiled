import android.view.View;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class euop implements Consumer {
    @Override
    public final void accept(Object object0) {
        ((View)object0).setVisibility(0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

