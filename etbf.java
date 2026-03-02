import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import j..util.Objects;

final class etbf extends esem {
    final RetrieveInAppPaymentCredentialRequest a;

    public etbf(etbt etbt0, aztw aztw0, RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest0) {
        this.a = retrieveInAppPaymentCredentialRequest0;
        Objects.requireNonNull(etbt0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return new etbs(status0, new RetrieveInAppPaymentCredentialResponse());
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        etau etau0 = (etau)azsr0;
        etbq etbq0 = new etbq(this);
        eszv eszv0 = (eszv)etau0.H();
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.X(this.a, etbq0, apiMetadata0);
    }
}

