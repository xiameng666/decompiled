import android.app.Dialog;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;

public final class epez extends de {
    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        String s = this.getArguments().getString("policy");
        epev epev0 = (epev)Enum.valueOf(epev.class, s);
        epfb.a.h("Create dialog for policy: " + epev0.name(), new Object[0]);
        if(gaec.t(this.getContext())) {
            TypedValue typedValue0 = new TypedValue();
            this.getContext().getTheme().resolveAttribute(0x7F04084A, typedValue0, true);  // attr:materialAlertDialogTheme
            int v = typedValue0.data;
            return new epey(this.getContext(), epev0, bundle0, v);
        }
        return new epey(this.getContext(), epev0, bundle0);
    }

    @Override  // de
    public final void onSaveInstanceState(Bundle bundle0) {
        WebView webView0 = ((epey)this.getDialog()).b.b();
        if(webView0 != null) {
            bundle0.putBoolean("savedWebView", true);
            webView0.saveState(bundle0);
        }
        super.onSaveInstanceState(bundle0);
    }

    @Override  // de
    public final void onStart() {
        super.onStart();
        if(gaec.t(this.requireContext())) {
            View view0 = this.getDialog().findViewById(0x7F0B0B7B);  // id:alertTitle
            if(view0 != null) {
                View view1 = (View)view0.getParent();
                if(view1 != null) {
                    int v = this.getContext().getResources().getDimensionPixelOffset(0x7F070608);  // dimen:expressive_dialog_title_padding
                    view1.setPadding(v, v, v, v);
                }
            }
        }
    }
}

