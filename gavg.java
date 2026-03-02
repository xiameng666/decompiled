import com.google.android.wallet.bender3.framework.client.CancelWidgetResult;
import com.google.android.wallet.bender3.framework.client.WidgetResult;
import j..util.Objects;
import java.util.List;

public final class gavg {
    public final WidgetResult a;

    public gavg(WidgetResult widgetResult0) {
        Objects.requireNonNull(widgetResult0);
        this.a = widgetResult0;
        super();
    }

    public final void a(CancelWidgetResult cancelWidgetResult0) {
        this.a.c = cancelWidgetResult0;
        this.a.a = 1;
    }

    public final void b(List list0) {
        this.a.g = list0;
    }

    public final void c(byte[] arr_b) {
        this.a.f = arr_b;
    }
}

