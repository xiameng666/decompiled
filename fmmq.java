import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.messaging.lighter.richcard.ui.CardCarouselView;
import j..util.Objects;

public final class fmmq extends LinearLayoutManager {
    final fmmp a;
    final fmlz b;

    public fmmq(CardCarouselView cardCarouselView0, fmmp fmmp0, fmlz fmlz0) {
        this.a = fmmp0;
        this.b = fmlz0;
        Objects.requireNonNull(cardCarouselView0);
        super();
    }

    @Override  // android.support.v7.widget.LinearLayoutManager
    protected final void U(un un0, int[] arr_v) {
        int v = this.a.b() * Resources.getSystem().getDisplayMetrics().widthPixels;
        arr_v[0] = v;
        arr_v[1] = v;
    }

    @Override  // android.support.v7.widget.LinearLayoutManager
    public final boolean ad() {
        return this.b.b() == fmly.c;
    }

    @Override  // android.support.v7.widget.LinearLayoutManager
    public final ty f() {
        return new ty(-1, -1);
    }
}

