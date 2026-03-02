import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

final class ekqz extends cjtm {
    private final Intent a;
    private final ekqp b;
    private final UserHandle c;

    public ekqz(Intent intent0, ekqp ekqp0, azug azug0, UserHandle userHandle0) {
        super(0xDA, "HandleSchedulerIntent", azug0);
        this.a = intent0;
        this.b = ekqp0;
        this.c = userHandle0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        new ekru(context0, this.a, this.c).run();
        this.b.a(Status.b, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, ApiMetadata.b);
    }
}

