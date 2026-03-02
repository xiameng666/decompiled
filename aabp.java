import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import j..util.Objects;

final class aabp implements zel {
    final String a;
    final FadeInImageView b;

    public aabp(FadeInImageView fadeInImageView0, String s) {
        this.a = s;
        Objects.requireNonNull(fadeInImageView0);
        this.b = fadeInImageView0;
        super();
    }

    @Override  // zel
    public final void a(Bitmap bitmap0) {
        FadeInImageView fadeInImageView0 = this.b;
        String s = this.a;
        if(Objects.equals(s, fadeInImageView0.a)) {
            fadeInImageView0.setImageBitmap(bitmap0);
        }
        else {
            TransitionDrawable transitionDrawable0 = new TransitionDrawable(new Drawable[]{new ColorDrawable(fadeInImageView0.getContext().getColor(0x106000D)), new BitmapDrawable(fadeInImageView0.getContext().getResources(), bitmap0)});
            transitionDrawable0.setCrossFadeEnabled(true);
            fadeInImageView0.setImageDrawable(transitionDrawable0);
            transitionDrawable0.startTransition(500);
        }
        fadeInImageView0.a = s;
    }
}

