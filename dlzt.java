import android.content.Context;

public final class dlzt implements dmba {
    private final Context a;

    public dlzt(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b == 61) {
            return !((hjuz)hjwe0.c).b || !hyoz.f() || !bbmn.t(this.a);
        }
        throw new IllegalArgumentException("Cannot evaluate filter that is not PublicManagedProfileFilter");
    }
}

