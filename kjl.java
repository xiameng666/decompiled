import android.content.Context;
import java.util.concurrent.Executor;

public final class kjl {
    public final Context a;

    public kjl(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    public final void a(Context context0, kis kis0, Executor executor0, kjk kjk0) {
        ibuq.f(kis0, "request");
        ibuq.f(executor0, "executor");
        kjo kjo0 = kjp.b(new kjp(this.a), kis0);
        if(kjo0 == null) {
            kjk0.a(new klh("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
            return;
        }
        if(context0.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            kjk0.a(new klj("createCredential is not supported on this device"));
            return;
        }
        kjo0.onCreateCredential(context0, kis0, null, executor0, kjk0);
    }

    public static final void b(Context context0, kka kka0, Executor executor0, kjk kjk0) {
        ibuq.f(executor0, "executor");
        kjo kjo0 = kjp.b(new kjp(context0), kka0);
        if(kjo0 == null) {
            kjk0.a(new klp("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
            return;
        }
        kjo0.onGetCredential(context0, kka0, null, executor0, kjk0);
    }
}

