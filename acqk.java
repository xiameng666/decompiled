import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class acqk implements azys {
    public final acqn a;
    public final LogAuditRecordsRequest b;

    public acqk(acqn acqn0, LogAuditRecordsRequest logAuditRecordsRequest0) {
        this.a = acqn0;
        this.b = logAuditRecordsRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acqt acqt0 = (acqt)object0;
        acqm acqm0 = new acqm(this.a, ((evqp)object1));
        acqw acqw0 = (acqw)acqt0.H();
        ApiMetadata apiMetadata0 = cclr.a(acqt0.r);
        acqw0.a(this.b, acqm0, apiMetadata0);
    }
}

