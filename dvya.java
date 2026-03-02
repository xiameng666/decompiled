import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;

public final class dvya implements View.OnClickListener {
    public final dvyb a;
    public final PopupWindow b;
    public final int c;
    public final int d;

    public dvya(dvyb dvyb0, PopupWindow popupWindow0, int v, int v1) {
        this.a = dvyb0;
        this.b = popupWindow0;
        this.c = v;
        this.d = v1;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        PopupWindow popupWindow0 = this.b;
        dvyb dvyb0 = this.a;
        int v = this.c;
        int v1 = this.d;
        popupWindow0.showAsDropDown(dvyb0.a, v, v1);
        if(popupWindow0.isAboveAnchor()) {
            popupWindow0.dismiss();
            popupWindow0.showAsDropDown(dvyb0.a, v, -v1);
        }
    }
}

