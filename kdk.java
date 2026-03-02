import android.os.Bundle;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class kdk extends View.AccessibilityDelegate {
    final kdl a;

    public kdk(kdl kdl0) {
        this.a = kdl0;
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        return this.a.g(view0, accessibilityEvent0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view0) {
        khe khe0 = this.a.a(view0);
        return khe0 == null ? null : ((AccessibilityNodeProvider)khe0.b);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.b(view0, accessibilityEvent0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
        khb khb0 = new khb(accessibilityNodeInfo0);
        boolean z = kfb.f(view0);
        Boolean.valueOf(z).getClass();
        khb0.V(z);
        boolean z1 = kfb.e(view0);
        Boolean.valueOf(z1).getClass();
        khb0.I(z1);
        khb0.Q(kfb.a(view0));
        khb0.aa(kfd.c(view0));
        this.a.c(view0, khb0);
        accessibilityNodeInfo0.getText();
        List list0 = kdl.Q(view0);
        for(int v = 0; v < list0.size(); ++v) {
            khb0.n(((kgx)list0.get(v)));
        }
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.d(view0, accessibilityEvent0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return this.a.h(viewGroup0, view0, accessibilityEvent0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final boolean performAccessibilityAction(View view0, int v, Bundle bundle0) {
        return this.a.i(view0, v, bundle0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void sendAccessibilityEvent(View view0, int v) {
        this.a.e(view0, v);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.f(view0, accessibilityEvent0);
    }
}

