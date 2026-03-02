import com.google.android.libraries.tapandpay.foldable.WalletSlidingPaneLayout;

public final class dnbt implements ibts {
    public final dnci a;

    public dnbt(dnci dnci0) {
        this.a = dnci0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            WalletSlidingPaneLayout walletSlidingPaneLayout0 = this.a.b;
            if(walletSlidingPaneLayout0 == null) {
                ibuq.j("slidingPaneLayout");
                walletSlidingPaneLayout0 = null;
            }
            walletSlidingPaneLayout0.s();
        }
        return ibom.a;
    }
}

