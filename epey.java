import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;

final class epey extends iw {
    public final epfa b;

    public epey(Context context0, epev epev0, Bundle bundle0) {
        super(context0, 0);
        epfa epfa0 = new epfa(context0, epev0, bundle0);
        this.b = epfa0;
        this.setTitle(epev0.p);
        this.g(context0.getText(0x7F150783), new epew(this));  // string:close_button_label "Close"
        this.f(epfa0.a());
    }

    public epey(Context context0, epev epev0, Bundle bundle0, int v) {
        super(context0, v);
        epfa epfa0 = new epfa(context0, epev0, bundle0);
        this.b = epfa0;
        this.setTitle(epev0.p);
        this.g(context0.getText(0x7F150783), new epex(this));  // string:close_button_label "Close"
        this.f(epfa0.a());
    }

    @Override  // kc
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(keyEvent0.getKeyCode() == 4 && keyEvent0.getAction() == 0) {
            bbot bbot0 = this.b.a;
            if(bbot0.e.canGoBack()) {
                bbot0.e.goBack();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent0);
    }
}

