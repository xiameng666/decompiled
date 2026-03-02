import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

public final class epzs implements evqf {
    public final epzx a;

    public epzs(epzx epzx0) {
        this.a = epzx0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        WorkProfilePayload workProfilePayload0 = (WorkProfilePayload)object0;
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.ao(workProfilePayload0);
        this.a.n(messagePayload0);
        this.a.h.v(workProfilePayload0.q());
    }
}

