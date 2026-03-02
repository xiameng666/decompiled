import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

final class khd extends khc {
    public khd(khe khe0) {
        super(khe0);
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int v, AccessibilityNodeInfo accessibilityNodeInfo0, String s, Bundle bundle0) {
        khb khb0 = new khb(accessibilityNodeInfo0);
        this.a.c(v, khb0, s, bundle0);
    }
}

