import android.view.View.OnClickListener;
import android.view.View;

public final class dugm implements View.OnClickListener {
    public final dugz a;
    public final int b;

    public dugm(dugz dugz0, int v) {
        this.a = dugz0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dugz dugz0 = this.a;
        fyfv fyfv0 = dugz0.ax;
        if(fyfv0 != null) {
            fyfv0.dismiss();
        }
        if(hwmp.F()) {
            dugz0.am.f(dugz0.getString(0x7F1520D9), dugz0.getString(0x7F151D0C), Integer.valueOf(1));  // string:pay_screen_unlock_title "Verify it\'s you"
        }
        else {
            dugz0.am.e(dugz0.getString(0x7F1520D9), dugz0.getString(0x7F151D0C));  // string:pay_screen_unlock_title "Verify it\'s you"
        }
        dugz0.al.g(4, 6, this.b, 0, 0, dugz0.au);
    }
}

