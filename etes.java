import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.firstparty.SendPollingFrameHandlerEventRequest;

public final class etes implements azys {
    public final SendPollingFrameHandlerEventRequest a;

    public etes(SendPollingFrameHandlerEventRequest sendPollingFrameHandlerEventRequest0) {
        this.a = sendPollingFrameHandlerEventRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etas etas0 = new etas(((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.aa(this.a, etas0, apiMetadata0);
    }
}

