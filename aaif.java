import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.tabs.TabLayout;

public final class aaif extends du {
    public aaot a;
    public AccessibilityManager ag;
    public AccountParticleDisc ah;
    public ViewPager ai;
    public LottieAnimationView aj;
    public int ak;
    public boolean al;
    public aabm am;
    public aabl b;
    public grwy c;
    public aaid d;

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        ((aaib)zgm.a(aaib.class, this)).e(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return layoutInflater0.inflate(0x7F0E00D9, viewGroup0, false);  // layout:as_onboarding_flow_fragment
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        view0.setFitsSystemWindows(true);
        zhi zhi0 = this.a.a.a();
        if(zhi0.d != 3) {
            return;
        }
        AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)view0.findViewById(0x7F0B0C37);  // id:avatar_disc
        this.ah = accountParticleDisc0;
        aabm aabm0 = this.b.a(accountParticleDisc0, false);
        this.am = aabm0;
        gfsx gfsx0 = (gfsx)this.a.b.a.a(this.a.b.d()).ij();
        gftb.check(gfsx0);
        aabm0.a(gfsx0);
        this.a.b.d.g(this, new aahv(this));
        this.ah.setVisibility(0);
        this.aj = (LottieAnimationView)view0.findViewById(0x7F0B1874);  // id:lottie_onboarding_animation
        this.ai = (ViewPager)view0.findViewById(0x7F0B1B2D);  // id:onboarding_view_pager
        gftb.check(zhi0.c);
        this.ak = zhi0.c.c;
        gftb.check(zhi0.a);
        this.c = zhi0.a;
        aaie aaie0 = new aaie(this, this.requireContext());
        this.ai.h(aaie0);
        aaot aaot0 = this.a;
        int v = this.ak;
        int v1 = ((grwz)this.c.d.get(0)).f;
        aaot0.c = v1;
        aaot0.b.l.g(0, v, 0, v1);
        gftb.check(zhi0.b);
        this.d = new aaid(this, zhi0.b);
        this.al = false;
        aahx aahx0 = new aahx(this);
        aaid aaid0 = this.d;
        grus grus0 = ((grwz)this.c.d.get(0)).d;
        if(grus0 == null) {
            grus0 = grus.a;
        }
        aaid0.b(grus0, aahx0);
        AccessibilityManager accessibilityManager0 = (AccessibilityManager)this.requireContext().getSystemService("accessibility");
        gftb.check(accessibilityManager0);
        this.ag = accessibilityManager0;
        this.ai.d(new aahy(this, aahx0));
        if(aabu.r(this.requireContext())) {
            this.ai.i(aaie0.j() - 1);
        }
        if(this.ag.isTouchExplorationEnabled()) {
            this.ai.setContentDescription(this.z(0));
            this.ai.requestFocus();
            this.ai.sendAccessibilityEvent(8);
        }
        if(this.c.d.size() > 1) {
            TabLayout tabLayout0 = (TabLayout)view0.findViewById(0x7F0B1BAB);  // id:page_indicator
            tabLayout0.r(this.ai);
            tabLayout0.setVisibility(0);
            if(this.ag.isTouchExplorationEnabled()) {
                for(int v2 = 0; v2 < tabLayout0.c(); ++v2) {
                    int v3 = aabu.r(this.requireContext()) ? tabLayout0.c() - v2 - 1 : v2;
                    String s = ((grwz)this.c.d.get(v3)).b;
                    fyyh fyyh0 = tabLayout0.d(v2);
                    gftb.check(fyyh0);
                    fyyh0.c(this.getResources().getString(0x7F15021B, new Object[]{((int)(v3 + 1)), tabLayout0.c(), s}));  // string:as_warm_welcome_tab_indicator_button_a11y_description "Button for tab number 
                                                                                                                           // %1$d of %2$d: %3$s"
                }
            }
            tabLayout0.setLayoutDirection(0);
        }
        Button button0 = (Button)view0.findViewById(0x7F0B2061);  // id:skip_button
        button0.setOnClickListener(new aahw(this, button0));
        button0.setText(this.c.g);
        xob xob0 = (xob)this.requireContext();
        xob0.getOnBackPressedDispatcher().c(this.getViewLifecycleOwner(), new aaia(this, xob0));
    }

    public final int y(int v) {
        return aabu.r(this.requireContext()) ? this.c.d.size() - v - 1 : v;
    }

    public final String z(int v) {
        return ((grwz)this.c.d.get(v)).b + "\n" + ((grwz)this.c.d.get(v)).c;
    }
}

