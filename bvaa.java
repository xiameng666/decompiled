import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleRequest;

public final class bvaa extends bvaf implements bvag {
    private final ibrt a;
    private final gmcd b;

    public bvaa(ibrt ibrt0, gmcd gmcd0) {
        this.a = ibrt0;
        this.b = gmcd0;
    }

    public final Object a(SessionLifecycleRequest sessionLifecycleRequest0, bvad bvad0, ibrl ibrl0) {
        buzz buzz0;
        if((ibrl0 instanceof buzz)) {
            buzz0 = (buzz)ibrl0;
            int v = buzz0.d;
            if((v & 0x80000000) == 0) {
                buzz0 = new buzz(this, ibrl0);
            }
            else {
                buzz0.d = v - 0x80000000;
            }
        }
        else {
            buzz0 = new buzz(this, ibrl0);
        }
        Object object0 = buzz0.b;
        Object object1 = ibrx.a;
        switch(buzz0.d) {
            case 0: {
                ibnx.b(object0);
                buzz0.e = sessionLifecycleRequest0;
                buzz0.a = bvad0;
                buzz0.d = 1;
                object0 = icpu.c(this.b, buzz0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                bvad0 = buzz0.a;
                sessionLifecycleRequest0 = buzz0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((bvag)object0).c(sessionLifecycleRequest0, bvad0);
        return ibom.a;
    }

    @Override  // bvag
    public final void c(SessionLifecycleRequest sessionLifecycleRequest0, bvad bvad0) {
        ibuq.f(sessionLifecycleRequest0, "request");
        ibuq.f(bvad0, "callbacks");
        buzy buzy0 = new buzy(this, sessionLifecycleRequest0, bvad0, null);
        icbb.b(iccl.b(this.a), null, null, buzy0, 3);
    }
}

