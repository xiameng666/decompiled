import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googleone.escalation.ReportActionRequest;
import java.util.concurrent.CancellationException;

public final class bugr extends cjtm {
    public final bugk a;
    public final ReportActionRequest b;
    private final icck c;

    public bugr(bugk bugk0, ReportActionRequest reportActionRequest0, icck icck0, azug azug0) {
        ibuq.f(bugk0, "escalationCardServiceImpl");
        ibuq.f(icck0, "coroutineScope");
        super(436, "ReportAction", azug0);
        this.a = bugk0;
        this.b = reportActionRequest0;
        this.c = icck0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        String s = this.b == null ? null : this.b.a;
        if(s == null) {
            this.j(new Status(13, "Missing id"));
            return;
        }
        bugq bugq0 = new bugq(this, context0, s, null);
        icbb.b(this.c, null, null, bugq0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        CancellationException cancellationException0 = new CancellationException(status0.j);
        iccl.e(this.c, cancellationException0);
    }
}

