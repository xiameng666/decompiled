import android.view.View.OnClickListener;
import android.view.View;

public final class ducz implements View.OnClickListener {
    public final duew a;
    public final int b;

    public ducz(duew duew0, int v) {
        this.a = duew0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        duew duew0 = this.a;
        fyfv fyfv0 = duew0.aV;
        if(fyfv0 != null) {
            fyfv0.dismiss();
        }
        duew0.au.f(duew0.getString(0x7F1520D9), duew0.getString(0x7F151D0C), Integer.valueOf(2));  // string:pay_screen_unlock_title "Verify it\'s you"
        duew0.at.g(3, 6, this.b, 0, 0, duew0.aH);
    }
}

