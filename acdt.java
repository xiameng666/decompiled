import android.content.Context;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import java.util.ArrayList;
import java.util.List;

public final class acdt extends luw {
    public boolean c;
    private final List d;
    private boolean e;
    private acfc f;

    static {
        bboh.b("IdentityLoader", bbcu.aK);
    }

    public acdt(Context context0, LoaderSectionInfo loaderSectionInfo0) {
        super(context0);
        this.d = loaderSectionInfo0.l;
        this.e = true;
    }

    final void c() {
        synchronized(this) {
            if(this.e) {
                this.e = false;
                acfc acfc0 = new acfc();
                this.f = acfc0;
                List list0 = this.d;
                if(list0 != null) {
                    acfc0.b(list0);
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList0;
        synchronized(this) {
            this.c = true;
        }
        if(this.isStarted()) {
            synchronized(this) {
                this.f.c();
                arrayList0 = new ArrayList(this.f.a);
            }
            super.deliverResult(arrayList0);
            if(!this.c) {
                this.onContentChanged();
            }
        }
    }

    @Override  // lvb
    public final void deliverResult(Object object0) {
        ArrayList arrayList0 = (ArrayList)object0;
        this.d();
    }

    @Override  // luw
    public final Object loadInBackground() {
        this.c();
        synchronized(this) {
        }
        return new acfc().a;
    }

    @Override  // lvb
    protected final void onReset() {
        this.cancelLoad();
        synchronized(this) {
            this.e = true;
        }
        this.c = false;
    }

    @Override  // lvb
    protected final void onStartLoading() {
        if(this.c) {
            this.d();
        }
        synchronized(this) {
            if(this.takeContentChanged() || this.e) {
                this.forceLoad();
            }
        }
    }

    @Override  // lvb
    protected final void onStopLoading() {
        this.cancelLoad();
    }
}

