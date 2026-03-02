import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

final class fohq {
    public static final Property a;
    public final ViewTreeObserver.OnScrollChangedListener b;
    public final ViewTreeObserver.OnGlobalLayoutListener c;
    public final View d;
    private final ObjectAnimator e;
    private boolean f;

    static {
        fohq.a = new fohp(Float.class);
    }

    public fohq(ExpandableDialogView expandableDialogView0, Property property0, View view0) {
        this.b = () -> {
            if(this.f == this.d.canScrollVertically(-1)) {
                return;
            }
            this.f ^= 1;
            this.e.cancel();
            float f = (float)(((Float)this.e.getAnimatedValue()));
            this.e.setFloatValues(new float[]{f, (this.f ? 1.0f : 0.0f)});
            this.e.start();
        };
        this.c = () -> {
            if(this.f == this.d.canScrollVertically(-1)) {
                return;
            }
            this.f ^= 1;
            this.e.cancel();
            float f = (float)(((Float)this.e.getAnimatedValue()));
            this.e.setFloatValues(new float[]{f, (this.f ? 1.0f : 0.0f)});
            this.e.start();
        };
        this.f = true;
        this.d = view0;
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(expandableDialogView0, property0, new float[]{0.0f, 1.0f});
        this.e = objectAnimator0;
        objectAnimator0.setDuration(0x73L);
        objectAnimator0.setInterpolator(new LinearInterpolator());
        this.b();
        if(!view0.canScrollVertically(-1)) {
            this.f = false;
        }
    }

    // Detected as a lambda impl.
    public final void a() {
        if(this.f == this.d.canScrollVertically(-1)) {
            return;
        }
        this.f ^= 1;
        this.e.cancel();
        float f = (float)(((Float)this.e.getAnimatedValue()));
        this.e.setFloatValues(new float[]{f, (this.f ? 1.0f : 0.0f)});
        this.e.start();
    }

    final void b() {
        this.d.getViewTreeObserver().addOnScrollChangedListener(this.b);
        this.d.getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }
}

