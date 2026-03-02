import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import j..util.Objects;

final class gbnq extends AccessibilityNodeProvider {
    final gbnr a;
    private final gbnr b;

    public gbnq(gbnr gbnr0, gbnr gbnr1) {
        Objects.requireNonNull(gbnr0);
        this.a = gbnr0;
        super();
        this.b = gbnr1;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int v) {
        gbnr gbnr1;
        if(v == -1) {
            gbnr gbnr0 = this.b;
            AccessibilityNodeInfo accessibilityNodeInfo0 = AccessibilityNodeInfo.obtain(gbnr0);
            for(int v1 = 0; true; ++v1) {
                gbnr1 = this.a;
                FlexboxLayout flexboxLayout0 = gbnr1.V;
                if(v1 >= flexboxLayout0.getChildCount()) {
                    break;
                }
                View view0 = flexboxLayout0.getChildAt(v1);
                if((view0 instanceof TextInputLayout)) {
                    EditText editText0 = ((TextInputLayout)view0).f;
                    gftb.check(editText0);
                    TextInputEditText textInputEditText0 = (TextInputEditText)editText0;
                    if(textInputEditText0.isFocusable()) {
                        accessibilityNodeInfo0.addChild(textInputEditText0);
                    }
                }
                else if((view0 instanceof LinearLayout)) {
                    accessibilityNodeInfo0.addChild(view0);
                }
            }
            TextView textView0 = gbnr1.M;
            if(textView0.getVisibility() == 0) {
                accessibilityNodeInfo0.addChild(textView0);
            }
            gbnr0.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
            return accessibilityNodeInfo0;
        }
        return null;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int v, int v1, Bundle bundle0) {
        return v == -1 ? this.b.performAccessibilityAction(v1, bundle0) : false;
    }
}

