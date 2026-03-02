import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;

public final class dudo implements View.OnClickListener {
    public final duew a;
    public final boolean b;

    public dudo(duew duew0, boolean z) {
        this.a = duew0;
        this.b = z;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        duew duew0 = this.a;
        if(this.b) {
            duew0.y();
        }
        PopupWindow popupWindow0 = duew0.aS;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
    }
}

