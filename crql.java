import android.os.Bundle;
import com.google.android.gms.measurement.internal.EventParcel;
import j..util.Objects;

final class crql implements Runnable {
    final String a;
    final String b;
    final Bundle c;
    final crqm d;

    public crql(crqm crqm0, String s, String s1, Bundle bundle0) {
        this.a = s;
        this.b = s1;
        this.c = bundle0;
        Objects.requireNonNull(crqm0);
        this.d = crqm0;
        super();
    }

    @Override
    public final void run() {
        crqx crqx0 = this.d.a.A();
        this.d.a.av();
        EventParcel eventParcel0 = crqx0.ah(this.a, this.b, this.c, "auto", System.currentTimeMillis(), false);
        batl.s(eventParcel0);
        this.d.a.O(eventParcel0, this.a);
    }
}

