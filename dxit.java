import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;

public final class dxit implements View.OnClickListener {
    public final PopupWindow a;
    public final dxjk b;
    public final int c;
    public final int d;

    public dxit(PopupWindow popupWindow0, dxjk dxjk0, int v, int v1) {
        this.a = popupWindow0;
        this.b = dxjk0;
        this.c = v;
        this.d = v1;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dxjk dxjk0 = this.b;
        View view1 = dxjk0.ah;
        View view2 = null;
        if(view1 == null) {
            ibuq.j("infoButton");
            view1 = null;
        }
        int v = this.d;
        int v1 = this.c;
        PopupWindow popupWindow0 = this.a;
        popupWindow0.showAsDropDown(view1, v1, v);
        if(popupWindow0.isAboveAnchor()) {
            popupWindow0.dismiss();
            View view3 = dxjk0.ah;
            if(view3 == null) {
                ibuq.j("infoButton");
            }
            else {
                view2 = view3;
            }
            popupWindow0.showAsDropDown(view2, v1, -v);
        }
    }
}

