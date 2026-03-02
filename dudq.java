import android.widget.PopupWindow.OnDismissListener;
import android.widget.PopupWindow;

public final class dudq implements PopupWindow.OnDismissListener {
    public final duew a;

    public dudq(duew duew0) {
        this.a = duew0;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        duew duew0 = this.a;
        PopupWindow popupWindow0 = duew0.aT;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
        duew0.y();
    }
}

