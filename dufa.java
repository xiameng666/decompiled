import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;

public final class dufa implements View.OnClickListener {
    public final PopupWindow a;

    public dufa(PopupWindow popupWindow0) {
        this.a = popupWindow0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.dismiss();
    }
}

