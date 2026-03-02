import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class ebtt {
    public final dyfv a;
    public final donp b;
    public final Context c;
    public dypj d;
    private static final bboh e;

    static {
        ebtt.e = bboh.b("Pay", bbcu.cZ);
    }

    public ebtt(dyfv dyfv0, donp donp0, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(context0, "context");
        super();
        this.a = dyfv0;
        this.b = donp0;
        this.c = context0;
    }

    public final void a(Exception exception0) {
        a.ae(ebtt.e.i(), "Failed to get secure element info", exception0);
        this.b.x(Status.d);
    }
}

