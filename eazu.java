import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetPayApiAvailabilityStatusRequest;

public final class eazu extends ebaw {
    private static final bboh a;
    private final GetPayApiAvailabilityStatusRequest b;
    private final donp c;

    static {
        eazu.a = bboh.b("Pay", bbcu.cZ);
    }

    public eazu(GetPayApiAvailabilityStatusRequest getPayApiAvailabilityStatusRequest0, String s, donp donp0, azug azug0) {
        super("GetPayApiAvailabilityStatus", s, azug0);
        this.b = getPayApiAvailabilityStatusRequest0;
        this.c = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        GetPayApiAvailabilityStatusRequest getPayApiAvailabilityStatusRequest0 = this.b;
        if(getPayApiAvailabilityStatusRequest0.a != 1 && getPayApiAvailabilityStatusRequest0.a != 2 && getPayApiAvailabilityStatusRequest0.a != 3 && getPayApiAvailabilityStatusRequest0.a != 4) {
            ((ggtj)((ggtj)eazu.a.j()).ar(12020)).z("Request type %d is not supported", getPayApiAvailabilityStatusRequest0.a);
            this.c.i(Status.b, 1);
            return;
        }
        this.c.i(Status.b, 0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.i(status0, 3);
    }
}

