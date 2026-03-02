import com.google.android.libraries.messaging.lighter.ui.common.LoadingView;

public final class fmri implements Runnable {
    public final LoadingView a;

    public fmri(LoadingView loadingView0) {
        this.a = loadingView0;
    }

    @Override
    public final void run() {
        LoadingView loadingView0 = this.a;
        loadingView0.c = false;
        if(!loadingView0.d) {
            flba.a();
            loadingView0.a = System.currentTimeMillis();
            loadingView0.setVisibility(0);
        }
    }
}

