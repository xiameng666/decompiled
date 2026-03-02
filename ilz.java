import android.view.View;
import android.view.translation.ViewTranslationCallback;

final class ilz implements ViewTranslationCallback {
    public static final ilz a;

    static {
        ilz.a = new ilz();
    }

    @Override  // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view0) {
        ibuq.d(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((ili)view0).o.l = 1;
        ((ili)view0).o.i(((ili)view0).o.a.k, hgj.a);
        return true;
    }

    @Override  // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view0) {
        ibuq.d(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((ili)view0).o.l = 1;
        ((ili)view0).o.i(((ili)view0).o.a.k, hgk.a);
        return true;
    }

    @Override  // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view0) {
        ibuq.d(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((ili)view0).o.l = 2;
        ((ili)view0).o.i(((ili)view0).o.a.k, hgm.a);
        return true;
    }
}

