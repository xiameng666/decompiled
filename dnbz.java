import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.tapandpay.foldable.WalletSlidingPaneLayout;

public final class dnbz implements View.OnLayoutChangeListener {
    final dnci a;

    public dnbz(dnci dnci0) {
        this.a = dnci0;
        super();
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        view0.removeOnLayoutChangeListener(this);
        dnci dnci0 = this.a;
        Toolbar toolbar0 = dnci0.c;
        TextView textView0 = null;
        if(toolbar0 == null) {
            ibuq.j("toolbar");
            toolbar0 = null;
        }
        Menu menu0 = toolbar0.g();
        ibuq.e(menu0, "getMenu(...)");
        dnci0.E(menu0);
        dnkl dnkl0 = dnci0.y();
        WalletSlidingPaneLayout walletSlidingPaneLayout0 = dnci0.b;
        if(walletSlidingPaneLayout0 == null) {
            ibuq.j("slidingPaneLayout");
            walletSlidingPaneLayout0 = null;
        }
        dnkl0.c(walletSlidingPaneLayout0.c);
        WalletSlidingPaneLayout walletSlidingPaneLayout1 = dnci0.b;
        if(walletSlidingPaneLayout1 == null) {
            ibuq.j("slidingPaneLayout");
            walletSlidingPaneLayout1 = null;
        }
        if(walletSlidingPaneLayout1.n()) {
            WalletSlidingPaneLayout walletSlidingPaneLayout2 = dnci0.b;
            if(walletSlidingPaneLayout2 == null) {
                ibuq.j("slidingPaneLayout");
                walletSlidingPaneLayout2 = null;
            }
            if(!walletSlidingPaneLayout2.c) {
                goto label_26;
            }
        }
        else {
        label_26:
            TextView textView1 = dnci0.ah;
            if(textView1 == null) {
                ibuq.j("cardNickname");
            }
            else {
                textView0 = textView1;
            }
            textView0.setVisibility(0);
        }
        dnci0.D();
    }
}

