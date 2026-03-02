import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class khx implements Runnable {
    public final kia a;

    public khx(kia kia0) {
        this.a = kia0;
    }

    @Override
    public final void run() {
        View view0 = this.a.a;
        ViewParent viewParent0 = view0.getParent();
        if((viewParent0 instanceof ViewGroup)) {
            ((ViewGroup)viewParent0).removeView(view0);
        }
    }
}

