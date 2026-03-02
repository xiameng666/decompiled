import android.graphics.drawable.Drawable;
import j..util.Objects;

final class fmzk extends pbk {
    final fmzl b;

    public fmzk(fmzl fmzl0) {
        Objects.requireNonNull(fmzl0);
        this.b = fmzl0;
        super();
    }

    @Override  // pbk
    public final void b(Drawable drawable0) {
        fmzj fmzj0 = new fmzj(this);
        this.b.b.post(fmzj0);
    }
}

