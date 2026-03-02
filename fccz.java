import android.accounts.Account;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.ui.verifypin.KeyPadView;

public final class fccz implements View.OnClickListener {
    public final KeyPadView a;

    public fccz(KeyPadView keyPadView0) {
        this.a = keyPadView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fcdd fcdd0 = this.a.a;
        if(fcdd0 != null) {
            int v = ((TextView)view0).getText().charAt(0) - 0x30;
            if(fcdd0.c.length() < 4) {
                fcdd0.d.setVisibility(4);
                fcdd0.c.append(v);
                fcdd0.i.c(fcdd0.c.length());
                if(fcdd0.c.length() == 4) {
                    fcdd0.n(false);
                    fcdd0.i.b(1);
                    Account account0 = fcdd0.k();
                    int v1 = fcdd0.f;
                    fcdd0.f = v1 + 1;
                    ReauthProofTokenRequest reauthProofTokenRequest0 = new ReauthProofTokenRequest(account0, fcdd0.c.toString(), 2, v1);
                    fcdd0.e = gcfz.n(fcdd0.b, 6);
                    fcdd0.l().b.m(reauthProofTokenRequest0);
                }
            }
        }
    }
}

