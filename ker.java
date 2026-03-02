import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ker {
    private final keq a;

    public ker(View view0) {
        this.a = new kep(view0);
    }

    @Deprecated
    public ker(WindowInsetsController windowInsetsController0) {
        this.a = new kep(windowInsetsController0);
    }

    public final void a() {
        keq keq0 = this.a;
        WindowInsetsController windowInsetsController0 = ((kep)keq0).b;
        if(windowInsetsController0 == null) {
            View view0 = ((kep)keq0).a;
            windowInsetsController0 = view0 == null ? null : view0.getWindowInsetsController();
        }
        if(windowInsetsController0 != null) {
            AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
            keo keo0 = new keo(atomicBoolean0);
            windowInsetsController0.addOnControllableInsetsChangedListener(keo0);
            if(!atomicBoolean0.get()) {
                View view1 = ((kep)keq0).a;
                if(view1 != null) {
                    ((InputMethodManager)view1.getContext().getSystemService("input_method")).hideSoftInputFromWindow(((kep)keq0).a.getWindowToken(), 0);
                }
            }
            windowInsetsController0.removeOnControllableInsetsChangedListener(keo0);
            windowInsetsController0.hide(8);
            return;
        }
        View view2 = keq0.c;
        if(view2 != null) {
            ((InputMethodManager)view2.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
        }
    }

    public final void b() {
        View view2;
        keq keq0 = this.a;
        if(((kep)keq0).a != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager)((kep)keq0).a.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController0 = ((kep)keq0).b;
        if(windowInsetsController0 == null) {
            View view0 = ((kep)keq0).a;
            windowInsetsController0 = view0 == null ? null : view0.getWindowInsetsController();
        }
        if(windowInsetsController0 != null) {
            windowInsetsController0.show(8);
        }
        View view1 = keq0.c;
        if(view1 != null) {
            if(!view1.isInEditMode() && !view1.onCheckIsTextEditor()) {
                view2 = view1.getRootView().findFocus();
            }
            else {
                view1.requestFocus();
                view2 = view1;
            }
            if(view2 == null) {
                view2 = view1.getRootView().findViewById(0x1020002);
            }
            if(view2 != null && view2.hasWindowFocus()) {
                view2.post(new ken(view2));
            }
        }
    }
}

