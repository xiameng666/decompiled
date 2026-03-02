import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class dogi implements doey {
    private final Context a;

    public dogi(Context context0) {
        this.a = context0;
    }

    @Override  // doey
    public final uq a(ViewGroup viewGroup0) {
        return doix.a(viewGroup0);
    }

    @Override  // doey
    public final void b(uq uq0, Object object0) {
        gftb.checkTrue(uq0 instanceof doiy);
        gftb.checkTrue(((edxb)object0) instanceof dohe);
        long v = ((dohe)(((edxb)object0))).a;
        if(hwgz.h()) {
            ((doiy)uq0).J().b(ftyi.a(((doiy)uq0).J().a(), null, null, null, null, null, null, null, true, null, 0x77FF));
            return;
        }
        ((doiy)uq0).E().setVisibility(0);
        Animation animation0 = AnimationUtils.loadAnimation(this.a, 0x7F0100B7);  // anim:shimmer_loader_animation
        animation0.setStartOffset(v);
        ((doiy)uq0).E().startAnimation(animation0);
    }

    @Override  // doey
    public final void c(uq uq0) {
        gftb.checkTrue(uq0 instanceof doiy);
        View view0 = ((doiy)uq0).a;
        view0.clearAnimation();
        view0.findViewById(0x7F0B0645).clearAnimation();  // id:PassListLoadingItem
    }
}

