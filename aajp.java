import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import com.google.android.gms.accountsettings.mg.poc.ui.search.SearchItemsListView;
import j..util.Objects;

public final class aajp extends aala {
    public aapz a;
    public SearchView ag;
    public InputMethodManager ah;
    public SwipeRefreshLayout ai;
    private FadeInImageView aj;
    public zem b;
    acp c;
    final acn d;

    public aajp() {
        this.d = new aajg(this);
    }

    @Override  // aalb
    public final boolean E(grul grul0) {
        return (grul0.b & 0x80) != 0;
    }

    @Override  // aakz
    public final grxw fT() {
        return this.a.b();
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 9) {
            this.a.c();
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        ((aajn)zgm.a(aajn.class, this)).g(this);
        this.a.d.g(this, new aajc(this));
        this.a.c.g(this, new aajd(this));
        this.a.g.g(this, new aaje(this));
        this.a.h.g(this, new aajf(this));
        this.ah = (InputMethodManager)this.requireContext().getSystemService("input_method");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate((hoju.j() ? 0x7F0E00E2 : 0x7F0E00E3), viewGroup0, false);  // layout:as_search_screen_fragment
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)view0.findViewById(0x7F0B1F54);  // id:search_close_btn
        if(appCompatImageView0 != null) {
            appCompatImageView0.setScaleType(ImageView.ScaleType.CENTER);
            appCompatImageView0.setMinimumWidth(view0.getContext().getResources().getDimensionPixelSize(0x7F0701DF));  // dimen:as_tappable_item_min_width
        }
        aajh aajh0 = new aajh(this);
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B22D9);  // id:toolbar
        toolbar0.setTouchscreenBlocksFocus(false);
        toolbar0.v((aabu.r(this.requireContext()) ? 0x7F080C90 : 0x7F080C89));  // drawable:quantum_ic_arrow_forward_vd_theme_24
        toolbar0.t(0x7F150086);  // string:abc_action_bar_up_description "Navigate up"
        toolbar0.x(new aaji(this));
        SwipeRefreshLayout swipeRefreshLayout0 = (SwipeRefreshLayout)view0.findViewById(0x7F0B21F4);  // id:swipe_refresh_layout
        this.ai = swipeRefreshLayout0;
        cchs.g(swipeRefreshLayout0, 0x1010031);
        SwipeRefreshLayout swipeRefreshLayout1 = this.ai;
        aapz aapz0 = this.a;
        Objects.requireNonNull(aapz0);
        swipeRefreshLayout1.a = new aajj(aapz0);
        this.ai.o(this.ai.i);
        this.aq = (aabx)view0.findViewById(0x7F0B1F5B);  // id:search_items_list
        ((SearchItemsListView)this.aq).ag = this.b;
        ((SearchItemsListView)this.aq).setOnTouchListener(aajh0);
        SearchItemsListView searchItemsListView0 = (SearchItemsListView)this.aq;
        searchItemsListView0.ac = new aajl(this);
        this.F(bundle0);
        FadeInImageView fadeInImageView0 = (FadeInImageView)view0.findViewById(0x7F0B16D5);  // id:illustration
        this.aj = fadeInImageView0;
        fadeInImageView0.setVisibility(8);
        ((SearchItemsListView)this.aq).setFocusable(false);
        SearchView searchView0 = (SearchView)view0.findViewById(0x7F0B1F52);  // id:search_bar
        this.ag = searchView0;
        View view1 = searchView0.findViewById(0x7F0B1F56);  // id:search_edit_frame
        if(view1 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
                if(aabu.r(this.requireContext())) {
                    ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin = 0;
                }
                else {
                    ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin = 0;
                }
            }
        }
        View view2 = searchView0.findViewById(0x7F0B1F60);  // id:search_src_text
        if(view2 != null) {
            if(aabu.r(this.requireContext())) {
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), 0, view2.getPaddingBottom());
            }
            else {
                view2.setPadding(0, view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
            }
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)view2.getLayoutParams();
            linearLayout$LayoutParams0.height = -1;
            view2.setLayoutParams(linearLayout$LayoutParams0);
        }
        SearchView searchView1 = this.ag;
        searchView1.p = new aajk(this);
        searchView1.o = new aajm(this);
        this.ag.l(this.ag.a.getImeOptions() | 0x12000006);
        ccho.a(this.aq);
        ccho.b(view0);
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        this.ag.setFocusable(true);
        this.ag.requestFocus();
        if(hoju.o()) {
            acn acn0 = this.d;
            if(acn0 != null) {
                this.c = this.registerForActivityResult(new aacj(), ((acn)Objects.requireNonNull(acn0)));
            }
        }
    }

    @Override  // aala
    protected final int y() {
        return ((SearchItemsListView)this.aq).a();
    }
}

