import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.drawerlayout.widget.DrawerLayout;

public final class ljj extends kdl {
    final DrawerLayout a;

    public ljj(DrawerLayout drawerLayout0) {
        this.a = drawerLayout0;
        super();
        new Rect();
    }

    @Override  // kdl
    public final void b(View view0, AccessibilityEvent accessibilityEvent0) {
        super.b(view0, accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        super.c(view0, khb0);
        khb0.y("androidx.drawerlayout.widget.DrawerLayout");
        khb0.G(false);
        khb0.H(false);
        khb0.aq(kgx.a);
        khb0.aq(kgx.b);
    }

    @Override  // kdl
    public final boolean g(View view0, AccessibilityEvent accessibilityEvent0) {
        if(accessibilityEvent0.getEventType() == 0x20) {
            accessibilityEvent0.getText();
            DrawerLayout drawerLayout0 = this.a;
            View view1 = drawerLayout0.e();
            if(view1 != null) {
                Gravity.getAbsoluteGravity(drawerLayout0.b(view1), drawerLayout0.getLayoutDirection());
            }
            return true;
        }
        return super.g(view0, accessibilityEvent0);
    }
}

