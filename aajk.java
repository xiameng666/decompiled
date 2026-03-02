import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class aajk implements View.OnFocusChangeListener {
    public final aajp a;

    public aajk(aajp aajp0) {
        this.a = aajp0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        aajp aajp0 = this.a;
        if(z) {
            InputMethodManager inputMethodManager0 = aajp0.ah;
            if(inputMethodManager0 != null) {
                inputMethodManager0.showSoftInput(view0.findFocus(), 1);
            }
        }
        else {
            aajp0.ag.setFocusable(false);
            InputMethodManager inputMethodManager1 = aajp0.ah;
            if(inputMethodManager1 != null) {
                inputMethodManager1.hideSoftInputFromWindow(view0.getWindowToken(), 0);
            }
        }
    }
}

