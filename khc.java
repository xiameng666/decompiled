import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class khc extends AccessibilityNodeProvider {
    final khe a;

    public khc(khe khe0) {
        this.a = khe0;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int v) {
        khb khb0 = this.a.a(v);
        return khb0 == null ? null : khb0.a;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String s, int v) {
        return null;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int v) {
        khb khb0 = this.a.b(v);
        return khb0 == null ? null : khb0.a;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int v, int v1, Bundle bundle0) {
        return this.a.d(v, v1, bundle0);
    }
}

