import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public class gz extends Activity implements kdr, lps {
    public final lpw f;

    public gz() {
        new bzs(null);
        this.f = new lpw(this);
    }

    @Override  // android.app.Activity
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        ibuq.f(keyEvent0, "event");
        ibuq.e(this.getWindow().getDecorView(), "getDecorView(...)");
        return kds.a(this, keyEvent0);
    }

    @Override  // android.app.Activity
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        ibuq.f(keyEvent0, "event");
        ibuq.e(this.getWindow().getDecorView(), "getDecorView(...)");
        return super.dispatchKeyShortcutEvent(keyEvent0);
    }

    @Override  // lps
    public final lpg getLifecycle() {
        return this.f;
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        lqz.b(this);
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle0) {
        ibuq.f(bundle0, "outState");
        this.f.g(lpf.c);
        super.onSaveInstanceState(bundle0);
    }

    @Override  // kdr
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent0) {
        ibuq.f(keyEvent0, "event");
        return super.dispatchKeyEvent(keyEvent0);
    }
}

