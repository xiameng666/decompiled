import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.widget.componentlayouts.DropdownIcon;

public final class dngv implements View.OnClickListener {
    public final dnhi a;

    public dngv(dnhi dnhi0) {
        this.a = dnhi0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.h.d(hami.x);
        ibuq.c(view0);
        View view1 = view0.findViewById(0x7F0B00E9);  // id:BodyText
        ibuq.e(view1, "findViewById(...)");
        if(view1.getVisibility() != 0 && !((DropdownIcon)view0.findViewById(0x7F0B0377)).a) {  // id:DropdownIcon
            view0.findViewById(0x7F0B00E9).setVisibility(0);  // id:BodyText
            ((DropdownIcon)view0.findViewById(0x7F0B0377)).b();  // id:DropdownIcon
            return;
        }
        view0.findViewById(0x7F0B00E9).setVisibility(8);  // id:BodyText
        ((DropdownIcon)view0.findViewById(0x7F0B0377)).a();  // id:DropdownIcon
    }
}

