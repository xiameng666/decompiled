import com.google.android.libraries.messaging.lighter.ui.common.LoadingView;

public final class fmrh implements Runnable {
    public final LoadingView a;

    public fmrh(LoadingView loadingView0) {
        this.a = loadingView0;
    }

    @Override
    public final void run() {
        this.a.b = false;
        this.a.a = -1L;
        this.a.setVisibility(8);
    }
}

