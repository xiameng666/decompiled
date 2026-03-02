import android.os.Bundle;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

public final class crjj {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public crjj(String s, String s1, Bundle bundle0, long v, long v1) {
        this.a = s;
        this.b = s1;
        this.e = bundle0;
        this.c = v;
        this.d = v1;
    }

    public final EventParcel a() {
        EventParams eventParams0 = new EventParams(new Bundle(this.e));
        return new EventParcel(this.a, eventParams0, this.b, this.c, this.d);
    }

    public static crjj b(EventParcel eventParcel0) {
        Bundle bundle0 = eventParcel0.b.a();
        return new crjj(eventParcel0.a, eventParcel0.c, bundle0, eventParcel0.d, eventParcel0.e);
    }

    @Override
    public final String toString() {
        return "origin=" + this.b + ",name=" + this.a + ",params=" + this.e.toString();
    }
}

