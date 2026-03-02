import android.view.View.OnLayoutChangeListener;
import android.view.View;
import com.google.android.gms.constellation.ui.widget.ConsentScrollView;

public final class bcpq implements View.OnLayoutChangeListener {
    public final ConsentScrollView a;

    public bcpq(ConsentScrollView consentScrollView0) {
        this.a = consentScrollView0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        int v8 = v3 - v1;
        if(v8 != v7 - v5 && v8 > 0) {
            ConsentScrollView consentScrollView0 = this.a;
            boolean z = consentScrollView0.B() <= 0;
            bcpr bcpr0 = consentScrollView0.i;
            if(bcpr0 != null) {
                bcpr0.o(z);
                return;
            }
            ConsentScrollView.h.d("Listener is null, caching toggle event", new Object[0]);
            consentScrollView0.k = gfsx.m(Boolean.valueOf(z));
        }
    }
}

