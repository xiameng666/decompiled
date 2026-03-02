import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.appbar.AppBarLayout;
import j..util.Objects;

public final class bfzg extends bfyp implements kdz {
    public beug a;
    public fnle ag;
    public bfnb ah;
    public bczq ai;
    private final fnjf aj;
    private bfbx ak;
    private beqv al;
    public bfom b;
    public bgnm c;
    public bgmi d;

    public bfzg() {
        this.aj = new bfzf(this);
    }

    public final xob A() {
        return (xob)this.requireContext();
    }

    private final void B() {
        this.requireContext().getApplicationContext();
    }

    @Override  // kdz
    public final void a(Menu menu0, MenuInflater menuInflater0) {
        bfbx bfbx0 = this.ak;
        menuInflater0.inflate(0x7F100031, menu0);  // menu:pwm_appbar_search_menu
        bfbx0.e = menu0.findItem(0x7F0B0F13);  // id:clear_search_button
        bfbx0.a();
        kdy.a(bfbx0.e, bfbx0.b.getResources().getText(0x7F150098));  // string:abc_searchview_description_clear "Clear query"
        bfbx0.a.requestFocus();
        this.B();
    }

    @Override  // kdz
    public final void b(Menu menu0) {
    }

    @Override  // kdz
    public final void c(Menu menu0) {
    }

    @Override  // kdz
    public final boolean d(MenuItem menuItem0) {
        bfbx bfbx0 = this.ak;
        if(menuItem0.getItemId() == 0x7F0B0F13) {  // id:clear_search_button
            ((EditText)bfbx0.d.findViewById(0x7F0B1F57)).setText("");  // id:search_edit_text
            return true;
        }
        return false;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        lso lso0 = new lso(this.A());
        this.al = (beqv)lso0.a(beqv.class);
        if(hsam.f() && bundle0 == null) {
            this.al.e();
        }
        this.ah = this.b.a("details", new bfyx(this));
        View view0 = layoutInflater0.inflate(0x7F0E088D, viewGroup0, false);  // layout:pwm_search_screen
        ((EditText)view0.findViewById(0x7F0B1F57)).setText(gfta.b(((String)this.al.b.ij())));  // id:search_edit_text
        bfbx bfbx0 = new bfbx(((Toolbar)view0.findViewById(0x7F0B1F5F)), this.A());  // id:search_screen_toolbar
        bfbv bfbv0 = new bfbv(((InputMethodManager)bfbx0.b.getSystemService("input_method")));
        bfbx0.a.setOnFocusChangeListener(bfbv0);
        bfbw bfbw0 = new bfbw(bfbx0);
        bfbx0.a.addTextChangedListener(bfbw0);
        int v = bfbx0.a.getImeOptions() | 0x12000006;
        bfbx0.a.setImeOptions(v);
        this.ak = bfbx0;
        lps lps0 = this.getViewLifecycleOwner();
        beqv beqv0 = this.al;
        Objects.requireNonNull(beqv0);
        bfyz bfyz0 = new bfyz(beqv0);
        bfbx0.c.g(lps0, bfyz0);
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B1F5F);  // id:search_screen_toolbar
        toolbar0.x(new bfyy(this));
        toolbar0.m(this, this);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1BEE);  // id:password_list_recycler_view
        bgnu bgnu0 = new bgnu();
        bgnq bgnq0 = new bgnq(0x7F0E085E, null, null);  // layout:pwm_fish_bowl_animation
        this.al.c.g(this.getViewLifecycleOwner(), new bfyt(this, bgnu0, bgnq0));
        bfbu bfbu0 = new bfbu(new bfyu(this, ((beln)new lso(this.A()).a(beln.class))));
        this.al.c.g(this.getViewLifecycleOwner(), new bfyv(bfbu0));
        this.requireContext();
        if(bfzi.b(this.requireArguments())) {
            recyclerView0.an(new qq(new tk[]{bgnu0, bgnq0, bfbu0}));
        }
        else {
            betf betf0 = (betf)new lso(this).a(betf.class);
            bgnq bgnq1 = new bgnq(0x7F0E088E, ((int)0x7F0B1DDF), new bfza(betf0));  // layout:pwm_search_switch_to_local_account_item
            bgnq bgnq2 = new bgnq(0x7F0E088F, ((int)0x7F0B1DE2), new bfzb(betf0));  // layout:pwm_search_switch_to_synced_account_item
            recyclerView0.an(new qq(new tk[]{bgnu0, bgnq0, bfbu0, bgnq1, bgnq2}));
            lps lps1 = this.getViewLifecycleOwner();
            Objects.requireNonNull(bgnq1);
            bfzc bfzc0 = new bfzc(bgnq1);
            betf0.d.g(lps1, bfzc0);
            lps lps2 = this.getViewLifecycleOwner();
            Objects.requireNonNull(bgnq2);
            bfzc bfzc1 = new bfzc(bgnq2);
            betf0.c.g(lps2, bfzc1);
            lps lps3 = this.getViewLifecycleOwner();
            bfzd bfzd0 = new bfzd(this);
            betf0.f.g(lps3, bfzd0);
            lps lps4 = this.getViewLifecycleOwner();
            bgnm bgnm0 = this.c;
            Objects.requireNonNull(bgnm0);
            bfys bfys0 = new bfys(bgnm0);
            betf0.h.g(lps4, bfys0);
        }
        if(hsam.f()) {
            this.B();
            bgnh.d(((AppBarLayout)view0.findViewById(0x7F0B1F5E)));  // id:search_screen_appbar
            RecyclerView recyclerView1 = (RecyclerView)view0.findViewById(0x7F0B1BEE);  // id:password_list_recycler_view
            bgnh.f(recyclerView1);
            recyclerView1.setClipToPadding(false);
        }
        ((betj)lso0.a(betj.class)).a.b.a.a(bbdg.ar);
        return view0;
    }

    @Override  // du
    public final void onPrepareOptionsMenu(Menu menu0) {
        this.B();
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        fnle fnle0 = this.ai.a(new bfyr(this), new bfyw(this));
        this.ag = fnle0;
        fnle0.b.c(this.aj);
    }

    @Override  // du
    public final void onStop() {
        super.onStop();
        this.ag.b.d(this.aj);
    }
}

