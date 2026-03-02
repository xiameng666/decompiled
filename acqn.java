import android.content.Context;
import com.google.android.gms.audit.LogAuditRecordsRequest;

public final class acqn extends azts implements acqj {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        acqn.b = azss0;
        acql acql0 = new acql();
        acqn.c = acql0;
        acqn.a = new azta_api("Audit.API", acql0, azss0);
    }

    public acqn(Context context0) {
        super(context0, acqn.a, null, aztr_settings.a);
    }

    @Override  // acqj
    public final evql b(LogAuditRecordsRequest logAuditRecordsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.d = 6901;
        azzc0.a = new acqk(this, logAuditRecordsRequest0);
        return this.jn(azzc0.a());
    }
}

