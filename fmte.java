import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class fmte implements fmoz {
    public final fmus a;

    public fmte(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        fmus fmus0 = this.a;
        fmus0.H = ((Boolean)object0).booleanValue();
        View view0 = fmus0.a;
        if(view0 != null) {
            fmus0.s();
            if(fmus0.H) {
                ((InputMethodManager)view0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view0.getWindowToken(), 0);
            }
        }
    }
}

