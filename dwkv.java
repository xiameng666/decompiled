import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class dwkv implements View.OnClickListener {
    public final dwkz a;

    public dwkv(dwkz dwkz0) {
        this.a = dwkz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dwkz dwkz0 = this.a;
        Context context0 = dwkz0.getContext();
        if(context0 == null) {
            return;
        }
        Context context1 = dwkz0.getContext();
        xob xob0 = dwkz0.an();
        if(context1 != null && xob0 != null) {
            View view1 = xob0.getCurrentFocus();
            if(view1 != null) {
                InputMethodManager inputMethodManager0 = (InputMethodManager)context1.getSystemService("input_method");
                if(inputMethodManager0 != null) {
                    inputMethodManager0.hideSoftInputFromWindow(view1.getWindowToken(), 0);
                }
            }
        }
        dwkz0.av.setVisibility(8);
        dwkz0.an.setVisibility(8);
        dwkz0.N(false);
        dwkz0.au.b(context0, dwkz0, dwkz0.ap);
        dwkz0.au.e(dwkz0.I(), new dwks(dwkz0), new dwkw(dwkz0));
        dwkz0.au.d(dwkz0.I(), new dwkt(dwkz0), new dwkx(dwkz0));
        dwkz0.au.setVisibility(0);
        dwkz0.au.announceForAccessibility(dwkz0.getString(0x7F1520D0));  // string:pay_scan_barcode_a11y_announcement "Please scan barcode of your card"
        dwkz0.au.sendAccessibilityEvent(0x4000);
        dwkz0.al.setVisibility(0);
        dwkz0.al.animate().translationY(dwkz0.J((hwev.c() ? 40.0f : -100.0f)));
    }
}

