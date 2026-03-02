import android.view.View;

public final class fmyd implements Runnable {
    public final fmyi a;
    public final fmrs b;

    public fmyd(fmyi fmyi0, fmrs fmrs0) {
        this.a = fmyi0;
        this.b = fmrs0;
    }

    @Override
    public final void run() {
        fmrs fmrs0 = this.b;
        fmyi fmyi0 = this.a;
        if(fmyi0.j == fmrs0.fq()) {
            fmyi0.k.removeCallbacksAndMessages(null);
            fmyi0.j = -1;
            View view0 = fmrs0.a;
            view0.requestFocus();
            view0.sendAccessibilityEvent(8);
        }
    }
}

