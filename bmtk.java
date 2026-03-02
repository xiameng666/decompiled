import android.view.View;
import android.view.ViewGroup.LayoutParams;

public final class bmtk implements Runnable {
    public final bmtp a;

    public bmtk(bmtp bmtp0) {
        this.a = bmtp0;
    }

    @Override
    public final void run() {
        bmtp bmtp0 = this.a;
        bmtp0.a.l(blhf.y);
        bmtp0.a.b();
        View view0 = bmtp0.getView();
        if(view0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            viewGroup$LayoutParams0.height = bmtp0.b.getMinimumHeight() + 50;
            view0.setLayoutParams(viewGroup$LayoutParams0);
        }
    }
}

