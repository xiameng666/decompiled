package com.google.android.gms.accountsettings.widget;

import aabl;
import aabm;
import aabq;
import aald;
import aasw;
import aatc;
import aaws;
import aawt;
import aawu;
import aawv;
import adv;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import cchl;
import cchr;
import cchs;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import fydj;
import gfsx;
import gruj;
import grwe;
import grwp;
import hoju;
import java.util.List;
import kfe;
import wr;
import zey;
import zhz;

public class ProductLockupToolbar extends MaterialToolbar implements fydj {
    public aabl A;
    private cchr B;
    private final ActionMenuView C;
    private View D;
    private View F;
    private aabm G;
    private int H;
    private int I;
    public final ProductLockupView y;
    public aawv z;

    public ProductLockupToolbar(Context context0) {
        this(context0, null, 0x7F040D99);  // attr:toolbarStyle
    }

    public ProductLockupToolbar(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040D99);  // attr:toolbarStyle
    }

    public ProductLockupToolbar(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.I = -1;
        ((aawu)zey.a(aawu.class, context0)).e(this);
        if(this.o != 0) {
            this.o = 0;
            if(this.e() != null) {
                this.requestLayout();
            }
        }
        context0.getTheme().obtainStyledAttributes(attributeSet0, aasw.d, 0, 0).recycle();
        LayoutInflater.from(new adv(context0, (cchl.d() ? 0x7F160073 : 0x7F160074))).inflate((hoju.k() ? 0x7F0E00DD : 0x7F0E00DE), this, true);  // style:AsThemeDarkOverlay
        ProductLockupView productLockupView0 = (ProductLockupView)this.findViewById(0x7F0B1900);  // id:mg_lockup
        this.y = productLockupView0;
        this.C = (ActionMenuView)this.findViewById(0x7F0B1072);  // id:custom_menu
        productLockupView0.f(0);
        productLockupView0.d(cchs.a(context0, 0x7F040133, 0x7F0607A3));  // attr:asProductNameColor
        this.F = this.findViewById(0x7F0B0A84);  // id:account_particle_disc_container
        this.D = this.findViewById(0x7F0B22DE);  // id:toolbar_menu_container
        if(this.A != null) {
            if(hoju.k()) {
                this.G = new aabm(((SelectedAccountDisc)this.findViewById(0x7F0B1F9E)).b, this.A.a, true);  // id:selected_account_disc
            }
            else {
                AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)this.findViewById(0x7F0B0A83);  // id:account_particle_disc
                this.G = this.A.a(accountParticleDisc0, true);
            }
        }
        if(hoju.j()) {
            if(cchl.d()) {
                productLockupView0.a(2);
                return;
            }
            productLockupView0.a(1);
            productLockupView0.d(cchs.a(this.getContext(), 0x7F0402F7, 0x7F0607A3));  // attr:colorOnSurface
            return;
        }
        if(cchl.d()) {
            productLockupView0.a(2);
            return;
        }
        this.B = new cchr(productLockupView0, cchs.a(this.getContext(), 0x7F040133, 0x7F0607A3), cchs.a(this.getContext(), 0x7F0402F7, 0x7F0607A3));  // attr:asProductNameColor
    }

    public final void O() {
        View view0 = this.F;
        if(view0 != null) {
            view0.setVisibility(8);
        }
        if(hoju.j()) {
            this.Y();
        }
    }

    public final void P(String s) {
        View view0 = this.F;
        if(view0 == null) {
            return;
        }
        kfe.j(view0, new aawt(this, s));
    }

    public final void Q(gfsx gfsx0) {
        aabm aabm0 = this.G;
        if(aabm0 != null) {
            aabm0.a(gfsx0);
            if(this.F != null) {
                if(gfsx0.i()) {
                    this.F.setContentDescription(this.getContext().getString(0x7F1507C8, new Object[]{((aatc)gfsx0.d()).c, ((aatc)gfsx0.d()).b}));  // string:common_account_identity_a11y_description "Google Account: %1$s (%2$s)"
                    this.F.setImportantForAccessibility(1);
                    return;
                }
                this.F.setContentDescription("");
                this.F.setImportantForAccessibility(2);
            }
        }
    }

    public final void R(View.OnClickListener view$OnClickListener0) {
        View view0 = this.F;
        if(view0 == null) {
            return;
        }
        view0.setOnClickListener(view$OnClickListener0);
    }

    public final void S(List list0) {
        Menu menu0 = this.C.g();
        menu0.clear();
        for(Object object0: list0) {
            gruj gruj0 = (gruj)object0;
            MenuItem menuItem0 = menu0.add(gruj0.c);
            if((gruj0.b & 4) != 0) {
                Drawable drawable0 = aabq.c(this.getContext(), (gruj0.d == null ? grwe.a : gruj0.d));
                if(drawable0 != null) {
                    menuItem0.setIcon(drawable0);
                }
            }
            if(zhz.c((gruj0.e == null ? grwp.a : gruj0.e))) {
                menuItem0.setOnMenuItemClickListener(new aaws(this, gruj0));
            }
        }
        this.Z();
    }

    public final void T(int v) {
        this.y.setVisibility(v);
        this.Z();
    }

    public final void U() {
        View view0 = this.F;
        if(view0 != null) {
            view0.setVisibility(0);
        }
        if(hoju.j()) {
            this.Y();
        }
    }

    public final void V(boolean z, boolean z1) {
        cchr cchr0 = this.B;
        if(cchr0 != null) {
            cchr0.a(z, z1);
        }
    }

    private final void Y() {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.C.getLayoutParams();
        if(viewGroup$MarginLayoutParams0 != null) {
            View view0 = this.F;
            if(view0 != null) {
                viewGroup$MarginLayoutParams0.setMarginEnd((view0.getVisibility() == 0 ? ((int)this.getResources().getDimension(0x7F070012)) : 0));  // dimen:abc_action_button_min_width_material
            }
        }
    }

    private final void Z() {
        Menu menu0 = this.C.g();
        this.H = 0;
        if(menu0.size() != 0) {
            if(menu0.size() > 1) {
                ProductLockupView productLockupView0 = this.y;
                if(productLockupView0.getVisibility() == 0) {
                    Resources resources0 = this.getResources();
                    int v1 = productLockupView0.d;
                    productLockupView0.f(2);
                    int v2 = resources0.getDisplayMetrics().widthPixels;
                    productLockupView0.measure(View.MeasureSpec.makeMeasureSpec(v2, 0), View.MeasureSpec.makeMeasureSpec(resources0.getDisplayMetrics().heightPixels, 0));
                    int v3 = productLockupView0.getMeasuredWidth();
                    productLockupView0.f(v1);
                    int v4 = v2 - resources0.getDimensionPixelSize(0x7F07018C) - resources0.getDimensionPixelSize(0x7F07018E);  // dimen:as_close_button_size
                    int v5 = resources0.getDimensionPixelSize(0x7F07015B);  // dimen:as_action_menu_item_size
                    this.requestLayout();
                    if(v3 >= v4 - (v5 + v5)) {
                        this.H = 1;
                        for(int v6 = 0; v6 < menu0.size(); ++v6) {
                            menu0.getItem(v6).setShowAsAction(0);
                        }
                        goto label_35;
                    }
                }
                goto label_25;
            }
            else {
            label_25:
                this.H = menu0.size() == 1 ? 1 : 2;
                if(menu0.getItem(0).getIcon() != null) {
                    menu0.getItem(0).setShowAsAction(1);
                    if(menu0.size() == 2 && menu0.getItem(1).getIcon() != null) {
                        menu0.getItem(1).setShowAsAction(1);
                    }
                }
                if(menu0.size() > 2) {
                    for(int v = 1; v < menu0.size(); ++v) {
                        menu0.getItem(v).setShowAsAction(0);
                    }
                }
            }
        }
    label_35:
        ProductLockupView productLockupView1 = this.y;
        wr wr0 = (wr)productLockupView1.getLayoutParams();
        Resources resources1 = this.getResources();
        if(hoju.j() || aald.b(this.getContext())) {
            wr0.a = 0x800013;
        }
        else if(resources1.getDisplayMetrics().widthPixels <= resources1.getDimensionPixelSize(0x7F07018B)) {  // dimen:as_centered_logo_minimum_screen_width
            wr0.a = 0x800013;
        }
        else {
            wr0.a = 17;
        }
        productLockupView1.setLayoutParams(wr0);
        this.requestLayout();
    }

    @Override  // fydd
    public final void a(AppBarLayout appBarLayout0, int v) {
        if(!hoju.j() && this.I != v) {
            this.I = v;
            int v1 = appBarLayout0.f();
            float f = v1 <= 0 || v > 0 ? 1.0f : ((float)Math.abs(v)) / ((float)v1);
            ActionMenuView actionMenuView0 = this.C;
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)actionMenuView0.getLayoutParams();
            if(viewGroup$MarginLayoutParams0 != null) {
                View view0 = this.F;
                if(view0 != null) {
                    viewGroup$MarginLayoutParams0.setMarginEnd(((int)(((float)view0.getWidth()) * f)));
                    actionMenuView0.setLayoutParams(viewGroup$MarginLayoutParams0);
                    this.F.setPivotX(((float)this.F.getWidth()) * 0.8f);
                    this.F.setPivotY(((float)this.F.getHeight()) / 2.0f);
                    this.F.setScaleX(f);
                    this.F.setScaleY(f);
                    this.F.setAlpha(f);
                    this.F.setVisibility((f == 0.0f ? 8 : 0));
                }
            }
        }
    }

    @Override  // android.support.v7.widget.Toolbar
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        ProductLockupView productLockupView0 = this.y;
        if(productLockupView0.getVisibility() == 0) {
            Resources resources0 = this.getResources();
            int v2 = resources0.getDimensionPixelSize(0x7F07015B);  // dimen:as_action_menu_item_size
            int v3 = Math.max(1, this.H) * v2;
            int v4 = View.MeasureSpec.getSize(v) - resources0.getDimensionPixelSize(0x7F07018C) - resources0.getDimensionPixelSize(0x7F07018E) - v3;  // dimen:as_close_button_size
            productLockupView0.measure(View.MeasureSpec.makeMeasureSpec(v4, 0x80000000), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v1), 0x80000000));
            if(this.D != null) {
                if(hoju.a.b().y()) {
                    this.D.measure(View.MeasureSpec.makeMeasureSpec(v3 + resources0.getDimensionPixelSize(0x7F070012), 0x80000000), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v1), 0x80000000));  // dimen:abc_action_button_min_width_material
                    return;
                }
                this.D.measure(View.MeasureSpec.makeMeasureSpec(v4, 0x80000000), View.MeasureSpec.makeMeasureSpec(v3 + resources0.getDimensionPixelSize(0x7F070012), 0x80000000));  // dimen:abc_action_button_min_width_material
            }
        }
    }
}

