import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;

public final class fmua implements View.OnClickListener {
    public final fmuj a;

    public fmua(fmuj fmuj0) {
        this.a = fmuj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fmus fmus0 = this.a.a;
        if(((ConversationView)fmus0.a).j()) {
            fmzg fmzg0 = fmus0.T;
            if(fmzg0 != null) {
                PopupWindow popupWindow0 = fmzg0.a.b;
                if(popupWindow0 != null && popupWindow0.isShowing()) {
                    return;
                }
                flbj.a("ConvPresenter", "showInfoIconTooltip: Showing InfoIconTooltip");
                fmzf fmzf0 = fmus0.T.a;
                fmzf0.b.setClippingEnabled(true);
                fmzf0.b.setAnimationStyle(0x1030002);
                fmzf0.b.setBackgroundDrawable(new ColorDrawable(0));
                fmzf0.b.setOutsideTouchable(fmzf0.c);
                fmzf0.b.setFocusable(true);
                new Handler(Looper.getMainLooper()).post(new fmze(fmzf0));
                fmaj fmaj0 = fmus0.f.b(0x7D).a();
                fmus0.f.g.b(fmaj0);
                return;
            }
        }
        flbj.a("ConvPresenter", "showInfoIconTooltip: tooltip is null or bottom status bar does not exist.");
    }
}

