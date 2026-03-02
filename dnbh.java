import android.view.View.OnClickListener;
import com.google.android.libraries.tapandpay.ui.card.WalletCard;

public final class dnbh implements ibth {
    public final dnbs a;
    public final WalletCard b;

    public dnbh(dnbs dnbs0, WalletCard walletCard0) {
        this.a = dnbs0;
        this.b = walletCard0;
    }

    @Override  // ibth
    public final Object a() {
        View.OnClickListener view$OnClickListener0 = this.a.l;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this.b);
        }
        return ibom.a;
    }
}

