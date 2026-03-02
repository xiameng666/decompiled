import android.view.View;
import android.widget.PopupWindow;

final class jo extends kfu {
    final jp a;

    public jo(jp jp0) {
        this.a = jp0;
        super();
    }

    @Override  // kfu
    public final void a(View view0) {
        ka ka0 = this.a.a;
        ka0.p.setVisibility(8);
        PopupWindow popupWindow0 = ka0.q;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
        else if((ka0.p.getParent() instanceof View)) {
            ((View)ka0.p.getParent()).requestApplyInsets();
        }
        ka0.p.i();
        ka0.s.h(null);
        ka0.s = null;
        ka0.u.requestApplyInsets();
    }
}

