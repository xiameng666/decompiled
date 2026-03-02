import android.view.View;
import android.view.ViewGroup.LayoutParams;

public final class bmtb implements Runnable {
    public final bmtj a;

    public bmtb(bmtj bmtj0) {
        this.a = bmtj0;
    }

    @Override
    public final void run() {
        bmtj bmtj0 = this.a;
        bmtj0.b.l(blhf.A);
        bmtj0.b.b();
        View view0 = bmtj0.getView();
        if(view0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            viewGroup$LayoutParams0.height = bmtj0.c.getMinimumHeight() + 50;
            view0.setLayoutParams(viewGroup$LayoutParams0);
        }
    }
}

