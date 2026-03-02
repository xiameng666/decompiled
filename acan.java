import android.content.Context;
import com.google.android.gms.apperrors.SetFilterParameters;
import com.google.android.gms.common.api.Status;

public final class acan extends cjtm {
    private final abzp a;
    private final SetFilterParameters b;

    public acan(abzp abzp0, SetFilterParameters setFilterParameters0) {
        super(334, "SetFilter");
        this.a = abzp0;
        this.b = setFilterParameters0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        acah acah0 = new acah(this.b);
        gmbu.t(this.a.b.b.b(acah0, gmap.a), new abzo(this.a), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
    }
}

