import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;

public final class dufb implements View.OnClickListener {
    public final dufr a;
    public final PopupWindow b;

    public dufb(dufr dufr0, PopupWindow popupWindow0) {
        this.a = dufr0;
        this.b = popupWindow0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.c.e(this.a.requireContext(), this.a.d, this.a.al);
        this.a.ah.e(3, this.a.ao);
        dpur.d(this.a.requireContext(), hahn.m);
        this.b.dismiss();
        String s = this.a.an.getString(0x7F151F82, new Object[]{dufr.O(this.a.an, this.a.ao, this.a.ap)});  // string:pay_mdoc_removed_message "%1$s removed"
        Intent intent0 = new Intent();
        intent0.putExtra("snackbar_message", s);
        this.a.ao().setResult(0x5BEE0, intent0);
        this.a.ar();
    }
}

