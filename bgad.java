import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.materialswitch.MaterialSwitch;

public final class bgad extends bfyq implements kdz {
    public beug a;
    private final ibnn ag;
    public beda b;
    public bgmi c;
    public bfom d;

    public bgad() {
        bfzz bfzz0 = new bfzz(new bfzy(this));
        ibnn ibnn0 = ibno.a(ibnp.c, bfzz0);
        ibuk ibuk0 = new ibuk(bdzc.class);
        bgaa bgaa0 = new bgaa(ibnn0);
        bgab bgab0 = new bgab(ibnn0);
        this.ag = new lsd(ibuk0, bgaa0, new bgac(this, ibnn0), bgab0);
    }

    public final beda A() {
        beda beda0 = this.b;
        if(beda0 != null) {
            return beda0;
        }
        ibuq.j("visualElementViewBinder");
        return null;
    }

    public final void B(goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xF0BF5A26);
        if((v & 1) == 0 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            String s = isq.c(0x7F1508D9, goz1);  // string:common_settings "Settings"
            jbn jbn0 = fpu.d(goz1).g;
            goz2 = goz1;
            gdh.b(s, dls.w(hfc.e), fpu.a(goz1).q, 0L, null, 0L, null, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, goz2, 0x30, 0, 130040);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bfzo(this, v);
        }
    }

    private final bdzc C() {
        return (bdzc)this.ag.a();
    }

    @Override  // kdz
    public final void a(Menu menu0, MenuInflater menuInflater0) {
        ibuq.f(menu0, "menu");
        ibuq.f(menuInflater0, "menuInflater");
        menuInflater0.inflate(0x7F10002F, menu0);  // menu:pwm_appbar_menu
    }

    @Override  // kdz
    public final void b(Menu menu0) {
    }

    @Override  // kdz
    public final void c(Menu menu0) {
    }

    @Override  // kdz
    public final boolean d(MenuItem menuItem0) {
        ibuq.f(menuItem0, "menuItem");
        this.requireContext().getApplicationContext();
        if(menuItem0.getItemId() == 0x7F0B1701) {  // id:in_product_help_button
            bgmi bgmi0 = this.c;
            if(bgmi0 == null) {
                ibuq.j("googleHelpLauncher");
                bgmi0 = null;
            }
            bgmi0.b();
            return true;
        }
        return false;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        bgad bgad0;
        ibuq.f(layoutInflater0, "inflater");
        xob xob0 = (xob)this.requireContext();
        View view0 = layoutInflater0.inflate(0x7F0E0891, viewGroup0, false);  // layout:pwm_settings_screen
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B1FE6);  // id:settings_screen_toolbar
        toolbar0.x(new bfzq(this));
        toolbar0.m(this, this);
        lso lso0 = new lso(xob0);
        ibuq.c(view0);
        if(((bdeq)this.getChildFragmentManager().h("blocklist_fragment_tag")) == null) {
            bdeq bdeq0 = new bdeq();
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.u(0x7F0B0CD3, bdeq0, "blocklist_fragment_tag");  // id:blocklist_container
            ca0.f();
        }
        if(((bdho)this.getChildFragmentManager().h("chromesync_settings_fragment_tag")) == null) {
            bdho bdho0 = new bdho();
            ca ca1 = new ca(this.getChildFragmentManager());
            ca1.u(0x7F0B0F02, bdho0, "chromesync_settings_fragment_tag");  // id:chromesync_settings_container
            ca1.f();
        }
        beos.a(((bemf)lso0.a(bemf.class)).b).g(this.getViewLifecycleOwner(), new bfzj(this, view0));
        betj betj0 = (betj)lso0.a(betj.class);
        Integer integer0 = null;
        if(hsas.c()) {
            this.requireContext();
            this.A().b(237082);
            bdzc bdzc0 = this.C();
            MaterialDivider materialDivider0 = (MaterialDivider)view0.findViewById(0x7F0B1D7C);  // id:pwm_device_settings_separator
            if(hsam.f()) {
                materialDivider0.a(bgnh.a(this.requireContext(), 0x7F04033B));  // attr:colorSurfaceContainerHighest
            }
            else {
                materialDivider0.a(bgnh.a(this.requireContext(), 0x7F0402F9));  // attr:colorOnSurfaceInverse
            }
            materialDivider0.setVisibility(0);
            view0.findViewById(0x7F0B1D7B).setVisibility(0);  // id:pwm_device_settings_section
            MaterialSwitch materialSwitch0 = (MaterialSwitch)view0.findViewById(0x7F0B1D6A);  // id:pwm_bio_reauth_before_filling_switch
            beda beda0 = this.A();
            ibuq.c(materialSwitch0);
            ibuq.f(materialSwitch0, "viewToBind");
            cmeb cmeb0 = beda0.a.b(materialSwitch0, 237083);
            cmeb0.f();
            bfom bfom0 = this.d;
            if(bfom0 == null) {
                ibuq.j("screenLockAuthentication");
                bfom0 = null;
            }
            bfnb bfnb0 = bfom0.a("bioReauthBeforeFillingSetting", new bfzr(materialSwitch0, bdzc0, cmeb0));
            acp acp0 = this.registerForActivityResult(new adt(), new bfzs());
            lps lps0 = this.getViewLifecycleOwner();
            bgad0 = this;
            bfzt bfzt0 = new bfzt(materialSwitch0, view0, bgad0, acp0, bfnb0);
            bdzc0.d.g(lps0, bfzt0);
            lps lps1 = bgad0.getViewLifecycleOwner();
            bfzu bfzu0 = new bfzu(materialSwitch0);
            bdzc0.c.g(lps1, bfzu0);
            lps lps2 = bgad0.getViewLifecycleOwner();
            bfzk bfzk0 = new bfzk(bgad0);
            bdzc0.f.g(lps2, bfzk0);
            lps lps3 = bgad0.getViewLifecycleOwner();
            bfzl bfzl0 = new bfzl(bgad0, view0, bdzc0);
            bdzc0.g.g(lps3, bfzl0);
        }
        else {
            bgad0 = this;
        }
        betj0.a.b.a.a(bbdg.am);
        bgad0.requireContext();
        MaterialDivider materialDivider1 = (MaterialDivider)view0.findViewById(0x7F0B1D6E);  // id:pwm_blocklist_settings_separator
        if(hsam.f()) {
            materialDivider1.a(bgnh.a(bgad0.requireContext(), 0x7F04033B));  // attr:colorSurfaceContainerHighest
            View view1 = view0.findViewById(0x7F0B1FE4);  // id:settings_screen_appbarlayout
            ibuq.e(view1, "findViewById(...)");
            view1.setVisibility(8);
            View view2 = view0.findViewById(0x7F0B0F7F);  // id:composeview_appbar
            ibuq.e(view2, "findViewById(...)");
            ((ComposeView)view2).setVisibility(0);
            ((ComposeView)view2).a(new gze(-1698810214, true, new bfzx(bgad0)));
            ibuq.f(view0, "view");
            Resources resources0 = ((xob)bgad0.requireContext()).getResources();
            if(resources0 != null) {
                Configuration configuration0 = resources0.getConfiguration();
                if(configuration0 != null) {
                    integer0 = (int)configuration0.orientation;
                }
            }
            if(integer0 == null || ((int)integer0) != 1) {
                NestedScrollView nestedScrollView0 = (NestedScrollView)view0.findViewById(0x7F0B1F3A);  // id:scrollView
                ibuq.c(nestedScrollView0);
                bgnh.e(nestedScrollView0, 0.0f);
                nestedScrollView0.setClipToPadding(false);
            }
            return view0;
        }
        materialDivider1.a(bgnh.a(bgad0.requireContext(), 0x7F0402F9));  // attr:colorOnSurfaceInverse
        return view0;
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        if(hsas.c()) {
            this.requireContext();
            bdzc bdzc0 = this.C();
            icbb.b(lsc.a(bdzc0), null, null, new bdza(bdzc0, null), 3);
        }
    }
}

