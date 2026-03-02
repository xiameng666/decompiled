import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest;

public final class etep implements azys {
    public final SetQuickAccessWalletCardsRequest a;

    public etep(SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest0) {
        this.a = setQuickAccessWalletCardsRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etas etas0 = new etas(((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.ah(this.a, etas0, apiMetadata0);
    }
}

