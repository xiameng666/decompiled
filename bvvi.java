import com.google.android.gms.growth.ui.widget.pageindicator.PageIndicator;
import j..util.Objects;
import java.util.ArrayList;

public final class bvvi implements Runnable {
    final PageIndicator a;

    public bvvi(PageIndicator pageIndicator0) {
        Objects.requireNonNull(pageIndicator0);
        this.a = pageIndicator0;
        super();
    }

    @Override
    public final void run() {
        PageIndicator pageIndicator0 = this.a;
        pageIndicator0.c = false;
        ArrayList arrayList0 = pageIndicator0.a;
        if(!arrayList0.isEmpty()) {
            pageIndicator0.c(((Integer)arrayList0.remove(0)).intValue());
        }
    }
}

