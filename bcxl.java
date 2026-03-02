import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.api.Status;

public final class bcxl extends cjtm {
    private static final bboh a;
    private final bhbv b;
    private final bhbp c;
    private final String d;

    static {
        bcxl.a = bboh.b("AdviseStartOfCuiOperation", bbcu.dH);
    }

    public bcxl(bhbv bhbv0, bhbp bhbp0, String s) {
        ibuq.f(bhbv0, "callbacks");
        ibuq.f(bhbp0, "cui");
        super(403, "AdviseStartOfCui");
        this.b = bhbv0;
        this.c = bhbp0;
        this.d = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        ModuleManager.get(context0).pauseModuleUpdates(this.d, 3600);
        ((ggtj)bcxl.a.h()).P("Module updates paused for %d seconds for CUI %s.", this.c, 3600);
        this.b.b(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        ((ggtj)bcxl.a.j()).B("Failed to pause module updates for CUI %s.", this.c);
        this.b.b(status0);
    }
}

