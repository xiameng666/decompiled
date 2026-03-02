import android.window.OnBackInvokedDispatcher;

public final class aag implements lpp {
    public final abc a;
    public final aao b;

    public aag(abc abc0, aao aao0) {
        this.a = abc0;
        this.b = aao0;
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        if(lpe0 == lpe.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.b.getOnBackInvokedDispatcher();
            ibuq.e(onBackInvokedDispatcher0, "getOnBackInvokedDispatcher(...)");
            this.a.e(onBackInvokedDispatcher0);
        }
    }
}

