import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;
import com.google.android.libraries.tapandpay.foldable.WalletSlidingPaneLayout;

public final class dnby implements ovt {
    final dnci a;

    public dnby(dnci dnci0) {
        this.a = dnci0;
        super();
    }

    @Override  // ovt
    public final void a() {
        this.a.B();
        TextView textView0 = this.a.ah;
        if(textView0 == null) {
            ibuq.j("cardNickname");
            textView0 = null;
        }
        textView0.setVisibility(0);
    }

    @Override  // ovt
    public final void b() {
        this.a.B();
        TextView textView0 = this.a.ah;
        if(textView0 == null) {
            ibuq.j("cardNickname");
            textView0 = null;
        }
        textView0.setVisibility(8);
    }

    @Override  // ovt
    public final void c() {
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
        WalletSlidingPaneLayout walletSlidingPaneLayout0 = dnci0.b;
        if(walletSlidingPaneLayout0 == null) {
            ibuq.j("slidingPaneLayout");
            walletSlidingPaneLayout0 = null;
        }
        walletSlidingPaneLayout0.r = false;
        TextView textView1 = dnci0.ah;
        if(textView1 == null) {
            ibuq.j("cardNickname");
        }
        else {
            textView0 = textView1;
        }
        textView0.setVisibility(8);
    }
}

