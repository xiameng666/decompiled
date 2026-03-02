import android.view.MenuItem;
import android.view.Window.Callback;

final class kj implements my {
    final kl a;

    public kj(kl kl0) {
        this.a = kl0;
        super();
    }

    @Override  // my
    public final void Q(na na0) {
        kl kl0 = this.a;
        if(kl0.c.t()) {
            kl0.a.onPanelClosed(108, na0);
            return;
        }
        Window.Callback window$Callback0 = kl0.a;
        if(window$Callback0.onPreparePanel(0, null, na0)) {
            window$Callback0.onMenuOpened(108, na0);
        }
    }

    @Override  // my
    public final boolean U(na na0, MenuItem menuItem0) {
        return false;
    }
}

