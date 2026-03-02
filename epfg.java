import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import j..util.Objects;

public final class epfg extends gahk {
    final boolean a;

    public epfg(gahd gahd0, boolean z, boolean z1) {
        super(gahd0, z, z1);
        this.a = z;
    }

    @Override  // gahk
    public final void f(gahf gahf0, int v) {
        if(this.a && v == 0) {
            View view0 = gahf0.a;
            Boolean boolean0 = Boolean.valueOf(true);
            if(!Objects.equals(view0.getTag(0x7F0B2222), boolean0)) {  // id:tag_header_margin_removed
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
                int v1 = (int)view0.getResources().getDimension(0x7F070297);  // dimen:bc_section_item_padding_top
                viewGroup$MarginLayoutParams0.topMargin -= v1;
                view0.setLayoutParams(viewGroup$MarginLayoutParams0);
                view0.setTag(0x7F0B2222, boolean0);  // id:tag_header_margin_removed
            }
            v = 0;
        }
        super.f(gahf0, v);
    }

    @Override  // gahk
    public final void h(uq uq0, int v) {
        this.f(((gahf)uq0), v);
    }
}

