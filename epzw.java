import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class epzw implements epzk {
    final epzx a;

    public epzw(epzx epzx0) {
        Objects.requireNonNull(epzx0);
        this.a = epzx0;
        super();
    }

    @Override  // epzk
    public final void a(int v, String s) {
        epzx epzx0 = this.a;
        if(epzx0.o) {
            epzx.f.m("accountTransferListener onError: " + v, new Object[0]);
            return;
        }
        epzx0.l(v);
        epzx0.g(v, null);
    }

    @Override  // epzk
    public final void b() {
        this.a.k = true;
    }

    @Override  // epzk
    public final void c(PendingIntent pendingIntent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("pendingIntent", pendingIntent0);
        BootstrapProgressResult bootstrapProgressResult0 = new BootstrapProgressResult(1, bundle0);
        this.a.d.c(bootstrapProgressResult0);
    }

    @Override  // epzk
    public final void d(List list0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("accounts", new ArrayList(list0));
        BootstrapProgressResult bootstrapProgressResult0 = new BootstrapProgressResult(1, bundle0);
        this.a.d.c(bootstrapProgressResult0);
    }

    @Override  // epzk
    public final void e(String s) {
        this.a.d.a(s);
    }

    @Override  // epzk
    public final void f(MessagePayload messagePayload0) {
        this.a.n(messagePayload0);
    }
}

