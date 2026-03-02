import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class ebcf extends ebav {
    private final donp a;

    public ebcf(String s, donp donp0, azug azug0) {
        super("ViewPayOptionalModuleHomescreen", s, azug0);
        this.a = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        PendingIntent pendingIntent0 = fqaw.a(context0, 1600, new dmqm().c(), 0x4C000000);
        this.a.p(Status.b, pendingIntent0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.p(status0, null);
    }
}

