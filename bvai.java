import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleChimeraService;

public final class bvai implements ibth {
    public final SessionLifecycleChimeraService a;

    public bvai(SessionLifecycleChimeraService sessionLifecycleChimeraService0) {
        this.a = sessionLifecycleChimeraService0;
    }

    @Override  // ibth
    public final Object a() {
        SessionLifecycleChimeraService sessionLifecycleChimeraService0 = this.a;
        if(sessionLifecycleChimeraService0.b == null) {
            ibuq.j("coroutineDispatcherProvider");
        }
        return new bvaz(sessionLifecycleChimeraService0);
    }
}

