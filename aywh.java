import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.clearcut.appdoctor.QosTierOverrideRequestParcelable;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class aywh extends cjtm {
    public final QosTierOverrideRequestParcelable a;
    private static final bboh b;
    private final frli c;
    private final aywb d;

    static {
        aywh.b = bboh.b("StopQosTierOverride", bbcu.aa);
    }

    public aywh(aywb aywb0, QosTierOverrideRequestParcelable qosTierOverrideRequestParcelable0, frli frli0) {
        super(445, "StopQosTierOverrideOperation");
        this.d = aywb0;
        this.a = qosTierOverrideRequestParcelable0;
        this.c = frli0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hqzm.c()) {
            Status status0 = new Status(16, "QoS override feature disabled.");
            this.d.b(status0);
            return;
        }
        if(TextUtils.isEmpty(this.a.a)) {
            Status status1 = new Status(10);
            this.d.b(status1);
            return;
        }
        try {
            aywg aywg0 = new aywg(this);
            gmde.a(this.c.b(aywg0, gmap.a));
            this.d.b(Status.b);
        }
        catch(ExecutionException executionException0) {
            a.ae(aywh.b.i(), "Failed to stop QoS tier override.", executionException0);
            this.d.b(Status.d);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.b(status0);
    }
}

