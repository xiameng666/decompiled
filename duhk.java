import android.view.View.OnClickListener;
import android.view.View;

public final class duhk implements View.OnClickListener {
    public final duhq a;
    public final int b;

    public duhk(duhq duhq0, int v) {
        this.a = duhq0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        duhq duhq0 = this.a;
        fyfv fyfv0 = duhq0.ap;
        if(fyfv0 != null) {
            fyfv0.dismiss();
        }
        if(hwmp.F()) {
            duhq0.ai.f(duhq0.getString(0x7F1520D9), duhq0.getString(0x7F151D0C), Integer.valueOf(1));  // string:pay_screen_unlock_title "Verify it\'s you"
        }
        else {
            duhq0.ai.e(duhq0.getString(0x7F1520D9), duhq0.getString(0x7F151D0C));  // string:pay_screen_unlock_title "Verify it\'s you"
        }
        duhq0.ah.g(4, 6, this.b, 0, 0, duhq0.am);
    }
}

