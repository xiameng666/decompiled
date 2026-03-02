import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.ReportInAppTransactionCompletedRequest;
import j..util.Objects;

final class etbe extends esem {
    public etbe(etbt etbt0, aztw aztw0) {
        Objects.requireNonNull(etbt0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return status0;
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        etau etau0 = (etau)azsr0;
        etbl etbl0 = new etbl(this);
        ReportInAppTransactionCompletedRequest reportInAppTransactionCompletedRequest0 = new ReportInAppTransactionCompletedRequest();
        ((eszv)etau0.H()).U(reportInAppTransactionCompletedRequest0, etbl0, cclr.a(etau0.r));
    }
}

