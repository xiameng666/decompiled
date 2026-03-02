import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

public final class eqbz implements evqf {
    public final eqck a;

    public eqbz(eqck eqck0) {
        this.a = eqck0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        WorkProfilePayload workProfilePayload0 = (WorkProfilePayload)object0;
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.ao(workProfilePayload0);
        this.a.m(messagePayload0);
        this.a.k.v(workProfilePayload0.q());
    }
}

