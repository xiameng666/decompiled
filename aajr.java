import android.content.res.Resources;
import android.view.animation.AnimationUtils;

public final class aajr implements lqj {
    public final aakb a;

    public aajr(aakb aakb0) {
        this.a = aakb0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        aakb aakb0 = this.a;
        if(((aaqg)object0) == aaqg.a) {
            aaka aaka0 = aakb0.ag;
            aaka0.d();
            aaka0.c.d.setVisibility(0);
            aaka0.a = AnimationUtils.loadAnimation(aaka0.c.requireContext(), 0x7F010012);  // anim:as_splash_screen_branding_anim
            aaka0.a.setAnimationListener(new aajv(aaka0));
            aaka0.c.d.startAnimation(aaka0.a);
            return;
        }
        if(((aaqg)object0) == aaqg.b) {
            aaka aaka1 = aakb0.ag;
            aaka1.c();
            if(hoju.j() && hoju.g()) {
                aaka1.c.d.setVisibility(8);
                aaka1.c.c.setVisibility(8);
                aaka1.c.ai.setVisibility(0);
                return;
            }
            aaka1.c.c.hI();
            aaka1.c.d.setVisibility(8);
            aaka1.c.c.setVisibility(0);
            aaka1.c.c.q(0, 0x87);
            aaka1.c.c.hH(false);
            aaka1.a(new aajw(aaka1));
            aaka1.c.c.k();
            return;
        }
        if(hoju.j() && hoju.g() && (((aaqg)object0) == aaqg.c || ((aaqg)object0) == aaqg.d)) {
            aaka aaka2 = aakb0.ag;
            aaka2.c();
            aaka2.c.d.setVisibility(8);
            aaka2.c.c.setVisibility(8);
            aaka2.c.ai.setVisibility(0);
            aaka2.c.a.b();
            return;
        }
        if(((aaqg)object0) == aaqg.d) {
            Resources resources0 = aakb0.requireContext().getResources();
            float f = (float)resources0.getDimensionPixelSize(0x7F07019D);  // dimen:as_expanded_avatar_size
            int v = resources0.getDimensionPixelSize(0x7F070172);  // dimen:as_appbar_expanded_avatar_top_margin_plus_ring
            aakb0.ag.b(f, ((float)(v + aakb0.aj)));
            return;
        }
        if(((aaqg)object0) == aaqg.c) {
            Resources resources1 = aakb0.requireContext().getResources();
            float f1 = (float)resources1.getDimensionPixelSize(0x7F0701AB);  // dimen:as_ob_avatar_size
            int v1 = resources1.getDimensionPixelSize(0x7F0701AA);  // dimen:as_ob_avatar_margin_top
            aakb0.ag.b(f1, ((float)(v1 + aakb0.aj)));
        }
    }
}

