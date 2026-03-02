import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetNotificationSettingsRequest;
import j..util.Objects;

public final class etbc extends esem {
    public etbc(etbt etbt0, aztw aztw0) {
        Objects.requireNonNull(etbt0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return new etbj(status0, new GetNotificationSettingsResponse(null));
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        etau etau0 = (etau)azsr0;
        etbp etbp0 = new etbp(this);
        GetNotificationSettingsRequest getNotificationSettingsRequest0 = new GetNotificationSettingsRequest(false);
        ((eszv)etau0.H()).z(getNotificationSettingsRequest0, etbp0, cclr.a(etau0.r));
    }
}

