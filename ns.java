import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class ns implements ViewTreeObserver.OnGlobalLayoutListener {
    final nu a;

    public ns(nu nu0) {
        this.a = nu0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        nu nu0 = this.a;
        if(nu0.x()) {
            sq sq0 = nu0.a;
            if(!sq0.q) {
                if(nu0.c != null && nu0.c.isShown()) {
                    sq0.v();
                    return;
                }
                nu0.m();
            }
        }
    }
}

