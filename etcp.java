import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.firstparty.UnifiedTokenizationRequest;

public final class etcp implements azys {
    public final etgl a;
    public final UnifiedTokenizationRequest b;

    public etcp(etgl etgl0, UnifiedTokenizationRequest unifiedTokenizationRequest0) {
        this.a = etgl0;
        this.b = unifiedTokenizationRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etgg etgg0 = new etgg(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.O(this.b, etgg0, apiMetadata0);
    }
}

