import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;

public final class etcx implements azys {
    public final FirstPartyTokenizePanRequest a;
    public final eszx b;

    public etcx(FirstPartyTokenizePanRequest firstPartyTokenizePanRequest0, eszx eszx0) {
        this.a = firstPartyTokenizePanRequest0;
        this.b = eszx0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.l(this.a, this.b, apiMetadata0);
        azzf.c(Status.b, null, ((evqp)object1));
    }
}

