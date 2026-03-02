import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.settingslib.widget.IllustrationPreference;
import j..util.Objects;

public final class skd extends View.AccessibilityDelegate {
    final IllustrationPreference a;

    public skd(IllustrationPreference illustrationPreference0) {
        Objects.requireNonNull(illustrationPreference0);
        this.a = illustrationPreference0;
        super();
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
        accessibilityNodeInfo0.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, (this.a.b ? "resume" : "pause")));
    }
}

