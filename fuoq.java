import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;

public final class fuoq {
    public static final int a(Configuration configuration0) {
        return configuration0 == null ? 0 : configuration0.orientation;
    }

    public static final fuos b(Context context0) {
        fuor fuor0;
        ibuq.f(context0, "context");
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        float f = displayMetrics0.density;
        float f1 = ((float)displayMetrics0.widthPixels) / f;
        if((f1 < 600.0f)) {
            fuor0 = fuor.b;
        }
        else {
            fuor0 = f1 < 840.0f ? fuor.c : fuor.d;
        }
        float f2 = ((float)displayMetrics0.heightPixels) / f;
        if((f2 < 480.0f)) {
            return f2 < f1 ? new fuos(fuor0, fuor.b, fuor.b, fuoq.a(context0.getResources().getConfiguration())) : new fuos(fuor0, fuor.b, fuor0, fuoq.a(context0.getResources().getConfiguration()));
        }
        fuor fuor1 = f2 < 900.0f ? fuor.c : fuor.d;
        return f2 < f1 ? new fuos(fuor0, fuor1, fuor1, fuoq.a(context0.getResources().getConfiguration())) : new fuos(fuor0, fuor1, fuor0, fuoq.a(context0.getResources().getConfiguration()));
    }
}

