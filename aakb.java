import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.loadingindicator.LoadingIndicator;
import j..util.Objects;

public final class aakb extends du {
    public aaqh a;
    public aaka ag;
    AccountParticleDisc ah;
    LoadingIndicator ai;
    public int aj;
    public aabl b;
    LottieAnimationView c;
    ProductLockupView d;

    public aakb() {
        this.aj = 0;
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        ((aaju)zgm.a(aaju.class, this)).i(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return hoju.j() ? layoutInflater0.inflate(0x7F0E00E7, viewGroup0, false) : layoutInflater0.inflate(0x7F0E00E8, viewGroup0, false);  // layout:as_splash_screen_fragment
    }

    @Override  // du
    public final void onPause() {
        this.a.c.k(this);
        aaka aaka0 = this.ag;
        aaka0.c();
        aaka0.d();
        ViewPropertyAnimator viewPropertyAnimator0 = aaka0.b;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.setListener(null);
            aaka0.b.cancel();
        }
        super.onPause();
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.a.c.g(this, new aajr(this));
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        view0.setFitsSystemWindows(true);
        kex.b(view0, new aajs(this));
        this.c = (LottieAnimationView)view0.findViewById(0x7F0B1873);  // id:lottie_loading_animation
        ProductLockupView productLockupView0 = (ProductLockupView)view0.findViewById(0x7F0B1D25);  // id:product_lockup
        this.d = productLockupView0;
        productLockupView0.b(kv.a(productLockupView0.getContext(), 0x7F08049C));  // drawable:googlelogo_standard_color_vd_112x36
        ProductLockupView productLockupView1 = this.d;
        productLockupView1.e = new fixj(this.requireContext().getResources(), 0x7F070ED4, 0x7F070917, 0x7F07091A, 0x7F070914, 0x7F070FF0);  // dimen:product_name_text_size_asm
        productLockupView1.f = new int[]{-1, 1, 2};
        productLockupView1.f(-1);
        if(cchl.d()) {
            this.d.a(2);
            this.d.e(0x7F060814);  // color:google_white
        }
        else if(hoju.j()) {
            this.d.a(1);
            this.d.e(0x7F0606BF);  // color:google_black
        }
        AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)view0.findViewById(0x7F0B0C37);  // id:avatar_disc
        this.ah = accountParticleDisc0;
        aabm aabm0 = this.b.a(accountParticleDisc0, false);
        lqd lqd0 = this.a.a.d;
        Objects.requireNonNull(aabm0);
        lqd0.g(this, new aajt(aabm0));
        if(hoju.j() && hoju.g()) {
            this.ai = (LoadingIndicator)view0.findViewById(0x7F0B1841);  // id:loading_indicator
        }
        this.ag = new aaka(this);
    }
}

