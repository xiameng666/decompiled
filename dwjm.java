import android.view.View.OnClickListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

public final class dwjm implements View.OnClickListener {
    public final dwjx a;

    public dwjm(dwjx dwjx0) {
        this.a = dwjx0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dwjx dwjx0 = this.a;
        fhwb fhwb0 = dwjx0.V();
        fhvz fhvz0 = fhwa.a(250397);
        fhvz0.c(fhwp.b(dwjx0.y().name));
        fhvz0.b(douc.a(dwkl.m(dwjx0.T(), dwjx0.X(), gkad.c)));
        fhwb0.a(fhvz0.a());
        AccessibilityManager accessibilityManager0 = dwjx0.aG;
        if(accessibilityManager0 != null && accessibilityManager0.isEnabled()) {
            AccessibilityEvent accessibilityEvent0 = new AccessibilityEvent();
            accessibilityEvent0.setEventType(0x4000);
            accessibilityEvent0.getText().add(dwjx0.getString(0x7F1522CE));  // string:pay_ucp_change_discarded "Changes discarded"
            accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
        }
        dwjx0.ar();
    }
}

