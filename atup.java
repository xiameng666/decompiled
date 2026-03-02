import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import j..util.Objects;

final class atup extends fyfl {
    final atus a;

    public atup(atus atus0) {
        Objects.requireNonNull(atus0);
        this.a = atus0;
        super();
    }

    @Override  // fyfl
    public final void a(View view0, float f) {
        fyfv fyfv0 = this.a.ah;
        if(fyfv0 != null) {
            Window window0 = fyfv0.getWindow();
            if(window0 != null) {
                window0.setBackgroundDrawable(new ColorDrawable(jxm.g(0xFF000000, Math.round((f < 0.0f ? 1.0f - Math.abs(f) : Math.abs(f)) * 0.6f * 255.0f))));
            }
        }
    }

    @Override  // fyfl
    public final void b(View view0, int v) {
    }
}

