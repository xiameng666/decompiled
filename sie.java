import android.app.ActionBar;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingtoolbar.FloatingToolbarLayout;

public final class sie {
    public CollapsingToolbarLayout a;
    public AppBarLayout b;
    public Toolbar c;
    public MaterialButton d;
    public FrameLayout e;
    private final sid f;
    private boolean g;
    private boolean h;

    public sie(sid sid0) {
        this(sid0, null);
    }

    public sie(sid sid0, byte[] arr_b) {
        this.f = sid0;
        this.g = true;
    }

    public final View a(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        int v;
        boolean z = this.g;
        boolean z1 = sku.a(layoutInflater0.getContext());
        this.h = z1;
        if(!z) {
            v = 0x7F0E05FD;  // layout:non_collapsing_toolbar_base_layout
        }
        else if(z1) {
            v = 0x7F0E0956;  // layout:settingslib_expressive_collapsing_toolbar_base_layout
        }
        else {
            v = 0x7F0E01E9;  // layout:collapsing_toolbar_base_layout
        }
        View view0 = layoutInflater0.inflate(v, viewGroup0, false);
        if((view0 instanceof CoordinatorLayout)) {
            CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)view0;
        }
        this.a = (CollapsingToolbarLayout)view0.findViewById(0x7F0B0F34);  // id:collapsing_toolbar
        this.b = (AppBarLayout)view0.findViewById(0x7F0B0BB1);  // id:app_bar
        if(!z) {
            TypedArray typedArray0 = viewGroup0.getContext().obtainStyledAttributes(new int[]{0x1010054});
            Drawable drawable0 = typedArray0.getDrawable(0);
            typedArray0.recycle();
            this.b.setBackground(drawable0);
        }
        CollapsingToolbarLayout collapsingToolbarLayout0 = this.a;
        AppBarLayout appBarLayout0 = this.b;
        if(collapsingToolbarLayout0 != null) {
            fylq fylq0 = collapsingToolbarLayout0.i;
            fylq0.s = 1.1f;
            if(Build.VERSION.SDK_INT >= 33) {
                fylq0.t = 3;
                sib sib0 = new sib();
                if(fylq0.u != sib0) {
                    fylq0.u = sib0;
                    fylq0.m(true);
                }
            }
        }
        if(appBarLayout0 != null) {
            jto jto0 = (jto)appBarLayout0.getLayoutParams();
            AppBarLayout.Behavior appBarLayout$Behavior0 = new AppBarLayout.Behavior();
            appBarLayout$Behavior0.d = new sic(this);
            jto0.b(appBarLayout$Behavior0);
        }
        this.e = (FrameLayout)view0.findViewById(0x7F0B0FE4);  // id:content_frame
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B0ABF);  // id:action_bar
        this.c = toolbar0;
        ActionBar actionBar0 = this.f.a(toolbar0);
        if(actionBar0 != null) {
            actionBar0.setDisplayHomeAsUpEnabled(true);
            actionBar0.setHomeButtonEnabled(true);
            if(this.h) {
                actionBar0.setHomeAsUpIndicator(0x7F080E88);  // drawable:settingslib_expressive_icon_back
            }
            actionBar0.setDisplayShowTitleEnabled(true);
        }
        MaterialButton materialButton0 = (MaterialButton)view0.findViewById(0x7F0B1D10);  // id:primary_button
        MaterialButton materialButton1 = (MaterialButton)view0.findViewById(0x7F0B1F69);  // id:secondary_button
        this.d = (MaterialButton)view0.findViewById(0x7F0B0AC8);  // id:action_button
        FloatingToolbarLayout floatingToolbarLayout0 = (FloatingToolbarLayout)view0.findViewById(0x7F0B140A);  // id:floating_toolbar
        return view0;
    }

    public final void b(CharSequence charSequence0) {
        CollapsingToolbarLayout collapsingToolbarLayout0 = this.a;
        if(collapsingToolbarLayout0 != null) {
            collapsingToolbarLayout0.j(charSequence0);
        }
        this.f.b(charSequence0);
    }
}

