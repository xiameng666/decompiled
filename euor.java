import android.widget.ImageView;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class euor implements Consumer {
    @Override
    public final void accept(Object object0) {
        ((ImageView)object0).setVisibility(8);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

