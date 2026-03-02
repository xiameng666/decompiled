import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForInAppPaymentRequest;
import j..util.Objects;

public final class etbd extends esem {
    final String a;
    final String d;

    public etbd(etbt etbt0, aztw aztw0, String s, String s1) {
        this.a = s;
        this.d = s1;
        Objects.requireNonNull(etbt0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return new azth(status0, false);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        etau etau0 = (etau)azsr0;
        etbo etbo0 = new etbo(this);
        IsDeviceUnlockedForInAppPaymentRequest isDeviceUnlockedForInAppPaymentRequest0 = new IsDeviceUnlockedForInAppPaymentRequest(this.a, this.d);
        ((eszv)etau0.H()).J(isDeviceUnlockedForInAppPaymentRequest0, etbo0, cclr.a(etau0.r));
    }
}

