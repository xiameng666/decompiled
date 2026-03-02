import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class ejvr extends cjtm {
    protected final ejtq a;

    static {
        bboh.b("RemindersApiOp", bbcu.s);
    }

    public ejvr(ejtq ejtq0, String s, azug azug0) {
        super(18, s, azug0);
        this.a = ejtq0;
    }

    @Override  // cjtm
    public void j(Status status0) {
        this.a.d(status0, ApiMetadata.b);
    }
}

