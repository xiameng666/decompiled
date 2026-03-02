import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

final class kp extends kfu {
    final kt a;

    public kp(kt kt0) {
        this.a = kt0;
        super();
    }

    @Override  // kfu
    public final void a(View view0) {
        kt kt0 = this.a;
        if(kt0.j) {
            View view1 = kt0.e;
            if(view1 != null) {
                view1.setTranslationY(0.0f);
                kt0.c.setTranslationY(0.0f);
            }
        }
        kt0.c.setVisibility(8);
        kt0.c.a(false);
        kt0.m = null;
        ly ly0 = kt0.h;
        if(ly0 != null) {
            ly0.a(kt0.g);
            kt0.g = null;
            kt0.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout0 = kt0.b;
        if(actionBarOverlayLayout0 != null) {
            actionBarOverlayLayout0.requestApplyInsets();
        }
    }
}

