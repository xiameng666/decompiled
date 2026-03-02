import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wallet.ui.verifypin.KeyPadView;

public final class fcda implements View.OnClickListener {
    public final KeyPadView a;

    public fcda(KeyPadView keyPadView0) {
        this.a = keyPadView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fcdd fcdd0 = this.a.a;
        if(fcdd0.c.length() > 0) {
            fcdd0.d.setVisibility(4);
            fcdd0.c.deleteCharAt(fcdd0.c.length() - 1);
            fcdd0.i.c(fcdd0.c.length());
        }
    }
}

