import android.content.Context;

public final class dlyi implements dmba {
    private final Context a;

    public dlyi(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b == 71) {
            return !((hjto)hjwe0.c).b || !hyoz.e() || !bbmn.t(this.a);
        }
        throw new IllegalArgumentException("Cannot evaluate filter that is not GoogleManagedProfileFilter");
    }
}

