import androidx.compose.ui.platform.ComposeView;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class euoh implements Consumer {
    @Override
    public final void accept(Object object0) {
        ComposeView composeView0 = (ComposeView)object0;
        ibuq.f(composeView0, "composeView");
        composeView0.a(evdw.b);
        composeView0.setVisibility(0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

