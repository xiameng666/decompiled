import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.api.Status;

public final class bcxk extends cjtm {
    private static final bboh a;
    private final bhbv b;
    private final bhbp c;
    private final String d;

    static {
        bcxk.a = bboh.b("AdviseEndOfCuiOperation", bbcu.dH);
    }

    public bcxk(bhbv bhbv0, bhbp bhbp0, String s) {
        ibuq.f(bhbv0, "callbacks");
        ibuq.f(bhbp0, "cui");
        super(403, "AdviseEndOfCui");
        this.b = bhbv0;
        this.c = bhbp0;
        this.d = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        ModuleManager.get(context0).resumeModuleUpdates(this.d);
        ((ggtj)bcxk.a.h()).B("Module updates resumed for CUI %s.", this.c);
        this.b.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        ((ggtj)bcxk.a.j()).B("Failed to resume module updates for CUI %s.", this.c);
        this.b.a(status0);
    }
}

