import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleChimeraService;
import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleRequest;
import java.util.LinkedHashMap;
import java.util.Map;

public final class bval extends bvaf implements cjug {
    public final Map a;
    final SessionLifecycleChimeraService b;

    public bval(SessionLifecycleChimeraService sessionLifecycleChimeraService0) {
        this.b = sessionLifecycleChimeraService0;
        super();
        this.a = new LinkedHashMap();
    }

    public final void a(String s, bvad bvad0, boolean z) {
        iced iced0 = (iced)this.a.remove(s);
        if(iced0 != null) {
            iceb.a(iced0);
        }
        bvad0.a(z);
    }

    @Override  // bvag
    public final void c(SessionLifecycleRequest sessionLifecycleRequest0, bvad bvad0) {
        ibuq.f(sessionLifecycleRequest0, "request");
        ibuq.f(bvad0, "callbacks");
        bvaz bvaz0 = (bvaz)this.b.a.a();
        bvak bvak0 = new bvak(this, sessionLifecycleRequest0, bvad0, null);
        cjul.b(bvaz0.a, 349, "createOrUpdateSession", bvak0);
    }
}

