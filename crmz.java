import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import j..util.Objects;

public final class crmz implements Runnable {
    final Bundle a;
    final crni b;

    public crmz(crni crni0, Bundle bundle0) {
        this.a = bundle0;
        Objects.requireNonNull(crni0);
        this.b = crni0;
        super();
    }

    @Override
    public final void run() {
        EventParcel eventParcel0;
        crni crni0 = this.b;
        crni0.n();
        crni0.a();
        Bundle bundle0 = this.a;
        String s = bundle0.getString("name");
        batl.q(s);
        if(!crni0.y.v()) {
            crni0.aJ().k.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel0 = new UserAttributeParcel(s, 0L, null, "");
        try {
            eventParcel0 = crni0.aq().ah(bundle0.getString("app_id"), bundle0.getString("expired_event_name"), bundle0.getBundle("expired_event_params"), "", bundle0.getLong("creation_timestamp"), true);
        }
        catch(IllegalArgumentException unused_ex) {
            return;
        }
        ConditionalUserPropertyParcel conditionalUserPropertyParcel0 = new ConditionalUserPropertyParcel(bundle0.getString("app_id"), "", userAttributeParcel0, bundle0.getLong("creation_timestamp"), bundle0.getBoolean("active"), bundle0.getString("trigger_event_name"), null, bundle0.getLong("trigger_timeout"), null, bundle0.getLong("time_to_live"), eventParcel0);
        crni0.k().z(conditionalUserPropertyParcel0);
    }
}

