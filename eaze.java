import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class eaze extends ebaw {
    edmh a;
    eauq b;
    private final donp c;

    public eaze(String s, donp donp0, azug azug0) {
        super("GetClockSkewMillis", s, azug0);
        this.c = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        if(this.b == null) {
            this.b = new eauq();
        }
        this.b.inject(this);
        long v = this.a.a().f;
        this.c.j(Status.b, v);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.x(Status.d);
    }
}

