import android.view.View;
import android.view.Window;

public final class aaa implements lpp {
    public final aao a;

    public aaa(aao aao0) {
        this.a = aao0;
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        if(lpe0 == lpe.ON_STOP) {
            Window window0 = this.a.getWindow();
            if(window0 != null) {
                View view0 = window0.peekDecorView();
                if(view0 != null) {
                    view0.cancelPendingInputEvents();
                }
            }
        }
    }
}

