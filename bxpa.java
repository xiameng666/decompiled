import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j..util.Objects;

final class bxpa extends fyfl {
    final BottomSheetBehavior a;
    final bxpb b;

    public bxpa(bxpb bxpb0, BottomSheetBehavior bottomSheetBehavior0) {
        this.a = bottomSheetBehavior0;
        Objects.requireNonNull(bxpb0);
        this.b = bxpb0;
        super();
    }

    @Override  // fyfl
    public final void a(View view0, float f) {
        this.b.d = (int)((1.0f - f) * ((float)this.a.t()) + f * ((float)view0.getMeasuredHeight()));
    }

    @Override  // fyfl
    public final void b(View view0, int v) {
    }
}

