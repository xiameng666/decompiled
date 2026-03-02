import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

public final class eqym implements evqf {
    public final eqyw a;

    public eqym(eqyw eqyw0) {
        this.a = eqyw0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        eqyw.f.d("Sending WorkProfile", new Object[0]);
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.ao(((WorkProfilePayload)object0));
        this.a.n(messagePayload0);
    }
}

