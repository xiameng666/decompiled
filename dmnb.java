import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public final class dmnb extends uq {
    public final ibth t;
    public final ImageView u;
    public final TextView v;
    public final TextView w;
    public final CheckBox x;
    public final ImageView y;
    public final ImageView z;

    public dmnb(View view0, ibth ibth0) {
        ibuq.f(view0, "itemView");
        super(view0);
        this.t = ibth0;
        View view1 = view0.findViewById(0x7F0B1C40);  // id:pay_frw_item_card_image
        ibuq.e(view1, "findViewById(...)");
        this.u = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B1C42);  // id:pay_frw_item_card_name
        ibuq.e(view2, "findViewById(...)");
        this.v = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B1C3C);  // id:pay_frw_item_card_balance
        ibuq.e(view3, "findViewById(...)");
        this.w = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B1C3E);  // id:pay_frw_item_card_checkbox
        ibuq.e(view4, "findViewById(...)");
        this.x = (CheckBox)view4;
        View view5 = view0.findViewById(0x7F0B1C3D);  // id:pay_frw_item_card_check_icon
        ibuq.e(view5, "findViewById(...)");
        this.y = (ImageView)view5;
        View view6 = view0.findViewById(0x7F0B1C3F);  // id:pay_frw_item_card_error_icon
        ibuq.e(view6, "findViewById(...)");
        this.z = (ImageView)view6;
    }
}

