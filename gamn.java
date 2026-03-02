import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class gamn extends kdl {
    public boolean a;
    public String b;

    public gamn() {
        this.a = false;
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        super.c(view0, khb0);
        khb0.ab(this.b);
    }

    @Override  // kdl
    public final boolean g(View view0, AccessibilityEvent accessibilityEvent0) {
        if(accessibilityEvent0.getEventType() == 0x8000) {
            if(this.a) {
                view0.setAccessibilityDelegate(null);
            }
            this.a = true;
        }
        return super.g(view0, accessibilityEvent0);
    }
}

