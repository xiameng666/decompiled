import android.content.Context;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import java.util.List;

public final class acdu extends lvb implements azuk {
    private final List a;
    private acfc b;

    public acdu(Context context0, LoaderSectionInfo loaderSectionInfo0) {
        super(context0);
        this.a = loaderSectionInfo0.l;
    }

    @Override  // azuk
    public final void a(azuj azuj0) {
        if(((efnx)azuj0).a().e()) {
            egil egil0 = ((efnx)azuj0).b();
            if(this.b == null) {
                acfc acfc0 = new acfc();
                this.b = acfc0;
                List list0 = this.a;
                if(list0 != null) {
                    acfc0.b(list0);
                }
            }
            if(egil0.b() > 0) {
                throw null;
            }
            egil0.iz();
            this.b.c();
        }
        if(this.isStarted()) {
            this.deliverResult(this.b.a);
        }
    }

    private final void b() {
        this.b = null;
    }

    @Override  // lvb
    protected final void onForceLoad() {
        this.b();
    }

    @Override  // lvb
    protected final void onReset() {
        this.b();
    }

    @Override  // lvb
    protected final void onStartLoading() {
        if(this.takeContentChanged()) {
            this.forceLoad();
            return;
        }
        acfc acfc0 = this.b;
        if(acfc0 != null) {
            this.deliverResult(acfc0.a);
        }
    }

    @Override  // lvb
    protected final void onStopLoading() {
    }
}

