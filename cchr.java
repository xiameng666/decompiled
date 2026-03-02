import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import j..util.Objects;

public final class cchr {
    private final TransitionDrawable a;
    private boolean b;
    private final cchq c;

    public cchr(ProductLockupView productLockupView0, int v, int v1) {
        Context context0 = productLockupView0.getContext();
        Drawable drawable0 = (Drawable)Objects.requireNonNull(context0.getDrawable(0x7F080499));
        Drawable drawable1 = (Drawable)Objects.requireNonNull(context0.getDrawable(0x7F080499));
        this.c = new cchq(productLockupView0, v1, v);
        BitmapDrawable bitmapDrawable0 = (BitmapDrawable)Objects.requireNonNull(cchr.b(context0, drawable0));
        BitmapDrawable bitmapDrawable1 = (BitmapDrawable)Objects.requireNonNull(cchr.b(context0, drawable1));
        bitmapDrawable1.setTint(0xFF000000);
        TransitionDrawable transitionDrawable0 = new TransitionDrawable(new Drawable[]{bitmapDrawable0, bitmapDrawable1});
        this.a = transitionDrawable0;
        transitionDrawable0.setCrossFadeEnabled(true);
        productLockupView0.b(transitionDrawable0);
        this.b = false;
    }

    public final void a(boolean z, boolean z1) {
        if(z && this.b || !z && !this.b) {
            return;
        }
        int v = z1 ? 0 : 100;
        this.b = z;
        this.c.a.d((z ? this.c.b : this.c.c));
        if(z) {
            this.a.startTransition(v);
            return;
        }
        this.a.reverseTransition(v);
    }

    private static final BitmapDrawable b(Context context0, Drawable drawable0) {
        Bitmap bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
        drawable0.draw(canvas0);
        return new BitmapDrawable(context0.getResources(), bitmap0);
    }
}

