import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.gms.credential.manager.util.FadeInImageView;

public final class bgme implements evqf {
    public final String a;
    public final bgmg b;

    public bgme(bgmg bgmg0, String s) {
        this.b = bgmg0;
        this.a = s;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Bitmap bitmap0 = (Bitmap)((bdvt)object0).a;
        boolean z = ((bdvt)object0).b;
        FadeInImageView fadeInImageView0 = this.b.a;
        if(!this.a.equals(fadeInImageView0.a)) {
            return;
        }
        if(z) {
            fadeInImageView0.setImageBitmap(bitmap0);
            return;
        }
        TransitionDrawable transitionDrawable0 = new TransitionDrawable(new Drawable[]{new ColorDrawable(fadeInImageView0.getContext().getColor(0x106000D)), new BitmapDrawable(fadeInImageView0.getContext().getResources(), bitmap0)});
        transitionDrawable0.setCrossFadeEnabled(true);
        fadeInImageView0.setImageDrawable(transitionDrawable0);
        transitionDrawable0.startTransition(500);
    }
}

