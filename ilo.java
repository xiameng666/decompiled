import android.view.accessibility.AccessibilityEvent;

final class ilo extends ibur implements ibts {
    final ilt a;

    public ilo(ilt ilt0) {
        this.a = ilt0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return Boolean.valueOf(this.a.b.getParent().requestSendAccessibilityEvent(this.a.b, ((AccessibilityEvent)object0)));
    }
}

