import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.credentials.Credential;
import j..util.Objects;

final class ahji extends View.AccessibilityDelegate {
    final Credential a;
    final ahjj b;

    public ahji(ahjj ahjj0, Credential credential0) {
        this.a = credential0;
        Objects.requireNonNull(ahjj0);
        this.b = ahjj0;
        super();
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
        if(accessibilityEvent0.getEventType() != 0x20) {
            return;
        }
        accessibilityEvent0.getText().clear();
        accessibilityEvent0.getText().add(String.format("Auto signed in as %1$s via Smart Lock", this.a.a));
    }
}

