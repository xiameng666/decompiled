import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.accountsettings.mg.poc.ui.viewpager.LockableViewPager;
import com.google.android.gms.accountsettings.widget.PagerTabContainer;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class aaiu extends aakw {
    public aapb a;
    public ViewPager ag;
    public PagerTabContainer ah;
    public TabLayout ai;
    List aj;
    boolean ak;
    int al;
    private aait am;
    private final aaiv an;
    public zem b;
    public aanx c;
    public grxw d;

    public aaiu() {
        this.aj = ggna.a;
        this.al = 1;
        this.an = new aaiv(aauc.a);
    }

    private final void A(grxw grxw0) {
        int v = gggq.a(this.aj, new aaig(grxw0));
        ViewPager viewPager0 = this.ag;
        if(v != -1 && v != viewPager0.c) {
            this.ak = true;
            viewPager0.i(v);
            this.ak = false;
            View view0 = this.getView();
            if(this.al == 2 && view0 != null) {
                ((NavigationView)view0.findViewById(0x7F0B19CB)).i(grxw0.c);  // id:navigation_view
            }
        }
    }

    @Override  // aakz
    public final void B(aanx aanx0) {
        zho zho0 = aanx0.a;
        if(this.D(zho0)) {
            grxw grxw0 = zho0.a.e == null ? grxw.a : zho0.a.e;
            if(!bata.b(grxw0, this.d)) {
                this.d = grxw0;
                this.A(grxw0);
            }
        }
    }

    @Override  // aakz
    public final boolean D(zho zho0) {
        return bata.b(zhp.d(zho0.a()), this.a.a.a) || bata.b(zhp.a(zho0.a()), this.a.a());
    }

    @Override  // aakz
    public final grxw fT() {
        return this.d;
    }

    @Override  // aakz
    public final void fU(long v) {
        TabLayout tabLayout0 = this.ai;
        if(tabLayout0.y == 0) {
            if(!aabu.r(tabLayout0.getContext())) {
                if(tabLayout0.b() == 0) {
                label_6:
                    this.ah.c(1);
                    TabLayout tabLayout1 = this.ai;
                    if(tabLayout1.y == 0) {
                        int v1 = aabu.r(tabLayout1.getContext());
                        boolean z = this.ai.isSmoothScrollingEnabled();
                        this.ai.setSmoothScrollingEnabled(false);
                        this.ai.fullScroll((v1 ? 17 : 66));
                        this.ai.setSmoothScrollingEnabled(z);
                        int v2 = v1 ^ 1;
                        int v3 = v1 == 0 ? this.ai.c() : this.ai.c() - 1;
                        while(v2 < v3) {
                            fyyh fyyh0 = this.ai.d(v2);
                            if(fyyh0 == null) {
                                break;
                            }
                            fyyh0.i.setTranslationX(((float)(v1 ? -1 : 1)) * this.ai.getResources().getDimension(0x7F0701DC));  // dimen:as_tabs_startup_animation_shift
                            ++v2;
                        }
                    }
                    TabLayout tabLayout2 = this.ai;
                    Resources resources0 = tabLayout2.getResources();
                    int v4 = resources0.getInteger(0x7F0C0013);  // integer:as_tabs_startup_animation_duration
                    int v5 = resources0.getInteger(0x7F0C0011);  // integer:as_tab_startup_animation_delay
                    int v6 = resources0.getInteger(0x7F0C0012);  // integer:as_tab_startup_animation_diff
                    boolean z1 = aabu.r(tabLayout2.getContext());
                    ArrayList arrayList0 = new ArrayList(tabLayout2.c() + 1);
                    lnt lnt0 = new lnt();
                    ObjectAnimator objectAnimator0 = ObjectAnimator.ofInt(tabLayout2, "scrollX", new int[]{tabLayout2.getScrollX(), (z1 ? tabLayout2.getChildAt(0).getWidth() - tabLayout2.getWidth() : 0)});
                    objectAnimator0.setDuration(((long)v4));
                    objectAnimator0.setInterpolator(lnt0);
                    arrayList0.add(objectAnimator0);
                    long v7 = (long)v5;
                    for(int v8 = 1; v8 < tabLayout2.c(); ++v8) {
                        fyyh fyyh1 = tabLayout2.d((z1 ? tabLayout2.c() - v8 - 1 : v8));
                        if(fyyh1 != null) {
                            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(fyyh1.i, "translationX", new float[]{fyyh1.i.getTranslationX(), 0.0f});
                            objectAnimator1.setDuration(((long)v4));
                            objectAnimator1.setInterpolator(lnt0);
                            objectAnimator1.setStartDelay(v7);
                            arrayList0.add(objectAnimator1);
                            v7 += (long)v6;
                        }
                    }
                    AnimatorSet animatorSet0 = new AnimatorSet();
                    animatorSet0.playTogether(arrayList0);
                    animatorSet0.setStartDelay(v);
                    animatorSet0.start();
                    animatorSet0.addListener(new aair(this));
                }
            }
            else if(tabLayout0.b() == tabLayout0.c() - 1) {
                goto label_6;
            }
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        ((aais)zgm.a(aais.class, this)).f(this);
        if(aald.b(this.requireContext()) && !Objects.equals(zhp.a, this.a.a())) {
            this.al = 2;
            lsa.b(this.a.c, new aaov()).g(this, new aain(this));
            return;
        }
        this.al = 1;
        lsa.b(this.a.b, new aaow()).g(this, new aaio(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E00DB, viewGroup0, false);  // layout:as_pager_frame_fragment
        this.am = new aait(this, this.getChildFragmentManager());
        ViewPager viewPager0 = (ViewPager)view0.findViewById(0x7F0B1BAD);  // id:pager
        this.ag = viewPager0;
        viewPager0.h(this.am);
        this.ag.d(new aaip(this));
        PagerTabContainer pagerTabContainer0 = (PagerTabContainer)view0.findViewById(0x7F0B2218);  // id:tab_layout_parent
        this.ah = pagerTabContainer0;
        this.ai = pagerTabContainer0.a;
        du du0 = this.getParentFragment();
        if(du0 != null) {
            View view1 = du0.getView();
            if(view1 != null) {
                AppBarLayout appBarLayout0 = (AppBarLayout)view1.findViewById(0x7F0B0BD1);  // id:appbar
                if(appBarLayout0 != null) {
                    Drawable drawable0 = appBarLayout0.getBackground();
                    if((drawable0 instanceof fyuj)) {
                        this.ah.b(((fyuj)drawable0).J);
                        appBarLayout0.h(new aail(this));
                    }
                }
            }
        }
        NavigationView navigationView0 = (NavigationView)view0.findViewById(0x7F0B19CB);  // id:navigation_view
        if(navigationView0 != null) {
            navigationView0.setBackgroundColor(fyho.b(navigationView0, (hoju.j() ? 0x7F040339 : 0x7F040332)));  // attr:colorSurfaceContainer
        }
        if(this.al == 2 && navigationView0 != null) {
            navigationView0.setVisibility(0);
            ViewPager viewPager1 = this.ag;
            if((viewPager1 instanceof LockableViewPager)) {
                ((LockableViewPager)viewPager1).h = false;
                ((LockableViewPager)viewPager1).i = true;
            }
        }
        else {
            this.ah.setVisibility(0);
        }
        PagerTabContainer pagerTabContainer1 = this.ah;
        pagerTabContainer1.a.a = new aaim();
        pagerTabContainer1.setStateListAnimator(null);
        this.ai.r(this.ag);
        if(aabu.r(this.requireContext())) {
            this.ai.setLayoutDirection(0);
        }
        if(bundle0 == null) {
            grxw grxw0 = this.c.a.a.e == null ? grxw.a : this.c.a.a.e;
            this.d = grxw0;
            this.z(gged_interceptors.l(new aaoz("", null, null, grxw0)));
        }
        else {
            grxw grxw1 = zhp.g(bundle0.getByteArray("screenKey"));
            this.d = grxw1;
            this.z(gged_interceptors.l(new aaoz("", null, null, grxw1)));
        }
        this.ah.c(2);
        return view0;
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putByteArray("screenKey", this.d.toBytesArray());
    }

    public final void z(gged_interceptors gged0) {
        this.aj = gged0;
        this.ak = true;
        this.am.m();
        this.ak = false;
        this.A(this.d);
    }
}

