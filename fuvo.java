import com.google.android.gms.location.ActivityRecognitionResult;
import j..util.Objects;

public abstract class fuvo {
    final fuvs e;

    public fuvo(fuvs fuvs0) {
        Objects.requireNonNull(fuvs0);
        this.e = fuvs0;
        super();
    }

    public abstract String a();

    public void b(ActivityRecognitionResult activityRecognitionResult0) {
    }

    protected void c() {
    }

    protected void d(fuvo fuvo0) {
        fuvs fuvs0 = this.e;
        if(fuvs0.f != -1L) {
            fuvs0.b.b(fwzf.l);
            fuvs0.f = -1L;
        }
    }

    protected void e() {
    }

    protected void f() {
    }

    public void g(boolean z) {
        if(!z) {
            fuvn fuvn0 = new fuvn(this.e);
            this.e.a(fuvn0);
        }
    }
}

