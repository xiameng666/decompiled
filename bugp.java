import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

public final class bugp extends cjtm {
    public final bugk a;
    public final azxs b;
    public final bugb c;
    private final icck d;

    public bugp(bugk bugk0, azxs azxs0, bugb bugb0, icck icck0, azug azug0) {
        ibuq.f(bugk0, "escalationCardServiceImpl");
        ibuq.f(azxs0, "statusCallback");
        ibuq.f(bugb0, "listener");
        ibuq.f(icck0, "coroutineScope");
        super(436, "RegisterEscalationCardListener", azug0);
        this.a = bugk0;
        this.b = azxs0;
        this.c = bugb0;
        this.d = icck0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        bugo bugo0 = new bugo(this, context0, null);
        icbb.b(this.d, null, null, bugo0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.b.a(status0);
        CancellationException cancellationException0 = new CancellationException(status0.j);
        iccl.e(this.d, cancellationException0);
    }
}

