import android.view.View;

final class dm implements lpp {
    final du a;

    public dm(du du0) {
        this.a = du0;
        super();
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        if(lpe0 == lpe.ON_STOP) {
            View view0 = this.a.P;
            if(view0 != null) {
                view0.cancelPendingInputEvents();
            }
        }
    }
}

