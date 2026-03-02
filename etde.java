import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.internal.firstparty.SetSelectedTokenRequest;

public final class etde implements azys {
    public final etgl a;
    public final SetSelectedTokenRequest b;

    public etde(etgl etgl0, SetSelectedTokenRequest setSelectedTokenRequest0) {
        this.a = etgl0;
        this.b = setSelectedTokenRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etft etft0 = new etft(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.ak(this.b, etft0, apiMetadata0);
    }
}

