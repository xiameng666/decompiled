import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class buvk extends cjtm {
    public final buwt a;
    public final buuk b;
    private final icck c;

    public buvk(buuk buuk0, icck icck0, buwt buwt0, azug azug0) {
        ibuq.f(buuk0, "accountManager");
        ibuq.f(icck0, "coroutineScope");
        ibuq.f(buwt0, "callbacks");
        super(349, "SelectedAccount", azug0);
        this.b = buuk0;
        this.c = icck0;
        this.a = buwt0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        buvj buvj0 = new buvj(this, null);
        icbb.b(this.c, null, null, buvj0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.a.a(status0, null, ApiMetadata.b);
    }
}

