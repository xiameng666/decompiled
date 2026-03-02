import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import j..util.Objects;

public final class crmy implements Runnable {
    final Bundle a;
    final crni b;

    public crmy(crni crni0, Bundle bundle0) {
        this.a = bundle0;
        Objects.requireNonNull(crni0);
        this.b = crni0;
        super();
    }

    @Override
    public final void run() {
        EventParcel eventParcel2;
        EventParcel eventParcel1;
        EventParcel eventParcel0;
        crni crni0 = this.b;
        crni0.n();
        crni0.a();
        Bundle bundle0 = this.a;
        String s = bundle0.getString("name");
        String s1 = bundle0.getString("origin");
        batl.q(s);
        batl.q(s1);
        batl.s(bundle0.get("value"));
        if(!crni0.y.v()) {
            crni0.aJ().k.a("Conditional property not set since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel0 = new UserAttributeParcel(s, bundle0.getLong("triggered_timestamp"), bundle0.get("value"), s1);
        try {
            eventParcel0 = crni0.aq().ah(bundle0.getString("app_id"), bundle0.getString("triggered_event_name"), bundle0.getBundle("triggered_event_params"), s1, 0L, true);
            eventParcel1 = crni0.aq().ah(bundle0.getString("app_id"), bundle0.getString("timed_out_event_name"), bundle0.getBundle("timed_out_event_params"), s1, 0L, true);
            eventParcel2 = crni0.aq().ah(bundle0.getString("app_id"), bundle0.getString("expired_event_name"), bundle0.getBundle("expired_event_params"), s1, 0L, true);
        }
        catch(IllegalArgumentException unused_ex) {
            return;
        }
        ConditionalUserPropertyParcel conditionalUserPropertyParcel0 = new ConditionalUserPropertyParcel(bundle0.getString("app_id"), s1, userAttributeParcel0, bundle0.getLong("creation_timestamp"), false, bundle0.getString("trigger_event_name"), eventParcel1, bundle0.getLong("trigger_timeout"), eventParcel0, bundle0.getLong("time_to_live"), eventParcel2);
        crni0.k().z(conditionalUserPropertyParcel0);
    }
}

