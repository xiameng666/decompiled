import com.google.android.gms.wallet.ui.component.pageheader.PageHeaderView;
import j..util.Objects;

public final class fccc implements Runnable {
    final PageHeaderView a;

    public fccc(PageHeaderView pageHeaderView0) {
        Objects.requireNonNull(pageHeaderView0);
        this.a = pageHeaderView0;
        super();
    }

    @Override
    public final void run() {
        PageHeaderView pageHeaderView0 = this.a;
        int[] arr_v = pageHeaderView0.e;
        pageHeaderView0.b.getLocationOnScreen(arr_v);
        int[] arr_v1 = pageHeaderView0.d;
        if(arr_v1[0] == 0) {
            pageHeaderView0.c.getLocationOnScreen(arr_v1);
        }
        pageHeaderView0.c.setTranslationX(((float)(arr_v[0] - arr_v1[0])));
        pageHeaderView0.c.setTranslationY(((float)Math.max(0, arr_v[1] - arr_v1[1])));
        pageHeaderView0.c.setVisibility(0);
    }
}

