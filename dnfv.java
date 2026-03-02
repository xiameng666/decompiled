import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.widget.componentlayouts.DropdownIcon;

public final class dnfv implements View.OnClickListener {
    public final dngl a;

    public dnfv(dngl dngl0) {
        this.a = dngl0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.i.d(hami.x);
        if(view0.findViewById(0x7F0B00E9).getVisibility() != 0 && !((DropdownIcon)view0.findViewById(0x7F0B0377)).a) {  // id:BodyText
            view0.findViewById(0x7F0B00E9).setVisibility(0);  // id:BodyText
            ((DropdownIcon)view0.findViewById(0x7F0B0377)).b();  // id:DropdownIcon
            return;
        }
        view0.findViewById(0x7F0B00E9).setVisibility(8);  // id:BodyText
        ((DropdownIcon)view0.findViewById(0x7F0B0377)).a();  // id:DropdownIcon
    }
}

