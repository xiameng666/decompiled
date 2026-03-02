import android.view.View;
import android.view.ViewGroup.LayoutParams;

public final class bmtv implements Runnable {
    public final bmue a;

    public bmtv(bmue bmue0) {
        this.a = bmue0;
    }

    @Override
    public final void run() {
        bmue bmue0 = this.a;
        int v = bmue0.c.getMinimumHeight() + 50;
        bmue0.b.n(v);
        bmue0.b.l(blhf.z);
        bmue0.b.b();
        View view0 = bmue0.getView();
        if(view0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            viewGroup$LayoutParams0.height = bmue0.c.getMinimumHeight() + 50;
            view0.setLayoutParams(viewGroup$LayoutParams0);
        }
    }
}

