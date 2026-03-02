import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;

public final class khr extends kht {
    private static final float[] f;
    private final GradientDrawable g;
    private final int[] h;
    private int i;

    static {
        khr.f = new float[100];
        PathInterpolator pathInterpolator0 = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        for(int v = 99; v >= 0; --v) {
            khr.f[v] = pathInterpolator0.getInterpolation(((float)(99 - v)) / 99.0f);
        }
    }

    public khr(int v) {
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        this.g = gradientDrawable0;
        float[] arr_f = khr.f;
        int[] arr_v = new int[100];
        this.h = arr_v;
        this.i = 0;
        gradientDrawable0.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        if(this.i != v) {
            this.i = v;
            for(int v1 = 99; v1 >= 0; --v1) {
                arr_v[v1] = Color.argb(((int)(arr_f[v1] * ((float)Color.alpha(v)))), Color.red(v), Color.green(v), Color.blue(v));
            }
            GradientDrawable gradientDrawable1 = this.g;
            gradientDrawable1.setColors(arr_v);
            this.a.d = gradientDrawable1;
            khv khv0 = this.a.g;
            if(khv0 != null) {
                khv0.b.setBackground(gradientDrawable1);
            }
        }
    }

    @Override  // kht
    public final int a(int v) {
        return (int)(((float)v) * 1.2f);
    }

    @Override  // kht
    public final void b() {
    }
}

