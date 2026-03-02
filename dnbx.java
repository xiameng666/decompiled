import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.foldable.WalletSlidingPaneLayout;

public final class dnbx implements View.OnClickListener {
    public final dnci a;

    public dnbx(dnci dnci0) {
        this.a = dnci0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dnci dnci0 = this.a;
        du du0 = dnci0.getChildFragmentManager().g(0x7F0B03EF);  // id:FopCardFragment
        WalletSlidingPaneLayout walletSlidingPaneLayout0 = null;
        dndr dndr0 = (du0 instanceof dndr) ? ((dndr)du0) : null;
        haey haey0 = dndr0 == null ? null : dndr0.ad();
        if(hwhu.a.b().b()) {
            WalletSlidingPaneLayout walletSlidingPaneLayout1 = dnci0.b;
            if(walletSlidingPaneLayout1 == null) {
                ibuq.j("slidingPaneLayout");
                walletSlidingPaneLayout1 = null;
            }
            if(walletSlidingPaneLayout1.n()) {
                WalletSlidingPaneLayout walletSlidingPaneLayout2 = dnci0.b;
                if(walletSlidingPaneLayout2 == null) {
                    ibuq.j("slidingPaneLayout");
                }
                else {
                    walletSlidingPaneLayout0 = walletSlidingPaneLayout2;
                }
                if(!walletSlidingPaneLayout0.c) {
                    goto label_17;
                }
            }
            else {
            label_17:
                if(haey0 == haey.y || haey0 == haey.A) {
                    Intent intent0 = new dmqm().c();
                    intent0.addFlags(0x4000000);
                    dnci0.startActivity(intent0);
                    dnci0.ar();
                    return;
                }
            }
        }
        if(!dnci0.G()) {
            dnci0.ar();
        }
    }
}

