import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutorService;

public final class eazk extends ebav {
    edmh a;
    eauv b;
    private final donp c;

    public eazk(String s, donp donp0, azug azug0) {
        super("GetLastUserPresentTimestamp", s, azug0);
        this.c = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        if(this.b == null) {
            this.b = new eauv();
        }
        this.b.inject(this);
        long v = hfyn.b(this.a.b());
        this.c.j(Status.b, v);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.x(Status.d);
    }

    @Override  // ebav
    protected final ExecutorService r() {
        return new bblp(0x7FFFFFFF, 9);
    }
}

