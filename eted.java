import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest;

public final class eted implements azys {
    public final etgl a;
    public final GetQuickAccessWalletConfigRequest b;

    public eted(etgl etgl0, GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest0) {
        this.a = etgl0;
        this.b = getQuickAccessWalletConfigRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etfk etfk0 = new etfk(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.C(this.b, etfk0, apiMetadata0);
    }
}

