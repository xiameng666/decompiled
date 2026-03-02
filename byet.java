import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;

public final class byet implements gmbg {
    final byeu a;

    public byet(byeu byeu0) {
        this.a = byeu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        Throwable throwable1 = throwable0.getCause();
        if((throwable1 instanceof bxuf)) {
            this.a.c.e(new Status(8, ((bxuf)throwable1).getMessage()), null, ApiMetadata.b);
        }
        else {
            this.a.c.e(new Status(8, throwable0.getMessage()), null, ApiMetadata.b);
        }
        bxzl.d(this.a.a, this.a.b, bxzh.f, this.a.d, true);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        CreateCredentialHandle createCredentialHandle0 = (CreateCredentialHandle)object0;
        ibuq.f(createCredentialHandle0, "result");
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cm);
        this.a.c.e(Status.b, createCredentialHandle0, apiMetadata0);
        bxzl.d(this.a.a, this.a.b, bxzh.c, this.a.d, true);
    }
}

