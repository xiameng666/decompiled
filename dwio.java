import android.view.View;
import android.widget.RadioButton;
import com.google.android.libraries.tapandpay.ui.rowprimary.RowPrimary;

final class dwio extends uq {
    public final RadioButton t;
    public final RowPrimary u;

    public dwio(View view0) {
        ibuq.f(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B01BC);  // id:CategoryOption
        ibuq.e(view1, "findViewById(...)");
        this.t = (RadioButton)view1;
        View view2 = view0.findViewById(0x7F0B0739);  // id:RowPrimaryOption
        ibuq.e(view2, "findViewById(...)");
        this.u = (RowPrimary)view2;
    }
}

