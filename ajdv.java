import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

abstract class ajdv extends azzd {
    private evqp a;

    public ajdv(int v) {
        super(null, false, v);
    }

    @Override  // azzd
    protected final void a(azsr azsr0, evqp evqp0) {
        ajgu ajgu0 = (ajgu)azsr0;
        this.a = evqp0;
        this.b(((ajgx)ajgu0.H()), cclr.a(ajgu0.r));
    }

    protected abstract void b(ajgx arg1, ApiMetadata arg2);

    public final void d(Status status0) {
        this.a.a(new ajet(status0));
    }

    public final void e(Object object0) {
        this.a.b(object0);
    }
}

