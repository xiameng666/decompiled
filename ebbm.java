import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class ebbm extends ebaw {
    private final donp a;

    public ebbm(String s, donp donp0, azug azug0) {
        super("RequestPayModule", s, azug0);
        this.a = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        this.a.x(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.x(status0);
    }
}

