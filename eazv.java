import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class eazv extends ebaw {
    edov a;
    public eavf b;
    private final donp c;

    public eazv(String s, donp donp0, azug azug0) {
        super("GetPayCapabilities", s, azug0);
        this.c = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        if(this.b == null) {
            this.b = new eavf(new edop());
        }
        this.b.inject(this);
        byte[] arr_b = this.a.a().toBytesArray();
        this.c.b(Status.b, arr_b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.x(status0);
    }
}

