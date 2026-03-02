import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;

public final class dudp implements View.OnClickListener {
    public final duew a;

    public dudp(duew duew0) {
        this.a = duew0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        duew duew0 = this.a;
        duew0.ai.e(duew0.requireContext(), duew0.ap, duew0.aP);
        duew0.at.e(3, duew0.aH);
        dpur.d(duew0.requireContext(), hahn.m);
        PopupWindow popupWindow0 = duew0.aS;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
        duew0.y();
    }
}

