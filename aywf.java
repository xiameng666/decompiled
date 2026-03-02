import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.clearcut.appdoctor.QosTierOverrideRequestParcelable;
import com.google.android.gms.common.api.Status;
import j..time.Instant;
import java.util.concurrent.ExecutionException;

public final class aywf extends cjtm {
    public final QosTierOverrideRequestParcelable a;
    private static final bboh b;
    private final frli c;
    private final aywb d;

    static {
        aywf.b = bboh.b("StartQosTierOverride", bbcu.aa);
    }

    public aywf(aywb aywb0, QosTierOverrideRequestParcelable qosTierOverrideRequestParcelable0, frli frli0) {
        super(445, "StartQosTierOverrideOperation");
        this.d = aywb0;
        this.a = qosTierOverrideRequestParcelable0;
        this.c = frli0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hqzm.c()) {
            Status status0 = new Status(16, "QoS override feature disabled.");
            this.d.a(status0);
            return;
        }
        QosTierOverrideRequestParcelable qosTierOverrideRequestParcelable0 = this.a;
        String s = qosTierOverrideRequestParcelable0.a;
        if(!TextUtils.isEmpty(s)) {
            long v = qosTierOverrideRequestParcelable0.c;
            if(v > 0L) {
                hlqe hlqe0 = hlqe.b(qosTierOverrideRequestParcelable0.b);
                if(hlqe0 == null) {
                    Status status1 = new Status(10);
                    this.d.a(status1);
                    return;
                }
                Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis()).plusMillis(v);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aywa.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((aywa)hftv0).b |= 1;
                ((aywa)hftv0).c = s;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((aywa)hftp0.b_message).d = hlqe0.f;
                ((aywa)hftp0.b_message).b |= 2;
                long v1 = instant0.toEpochMilli();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aywa aywa0 = (aywa)hftp0.b_message;
                aywa0.b |= 4;
                aywa0.e = v1;
                aywa aywa1 = (aywa)hftp0.N_build();
                try {
                    aywe aywe0 = new aywe(this, aywa1);
                    gmde.a(this.c.b(aywe0, gmap.a));
                    this.d.a(Status.b);
                }
                catch(ExecutionException executionException0) {
                    a.ae(aywf.b.i(), "Failed to start QoS tier override.", executionException0);
                    this.d.a(Status.d);
                }
                return;
            }
        }
        Status status2 = new Status(10);
        this.d.a(status2);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.a(status0);
    }
}

