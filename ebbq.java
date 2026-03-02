import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.SetClockSkewMillisRequest;

public final class ebbq extends ebaw {
    edmh a;
    eayi b;
    private final donp c;
    private final SetClockSkewMillisRequest d;

    public ebbq(SetClockSkewMillisRequest setClockSkewMillisRequest0, String s, donp donp0, azug azug0) {
        super("SetClockSkewMillis", s, azug0);
        this.c = donp0;
        this.d = setClockSkewMillisRequest0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        if(this.b == null) {
            this.b = new eayi();
        }
        this.b.inject(this);
        this.a.d(new edmb(this.d.a));
        this.c.x(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.x(Status.d);
    }
}

