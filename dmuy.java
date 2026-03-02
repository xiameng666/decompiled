import android.accounts.Account;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class dmuy extends tk {
    public final du a;
    public final dnpp e;
    public final Account f;
    public final fhwk g;
    public final fhvw h;
    public final List i;
    public final List j;
    public final List k;
    public dxev l;
    public String m;
    public final ArrayList n;
    public static final int o;
    private static final bboh p;
    private static final int q;
    private final tyb r;

    static {
        dmuy.p = bboh.b("Pay", bbcu.cZ);
        dmuy.q = ((ghfw)ghgf.e().d("BankAccountDetailActionItem")).a;
    }

    public dmuy(du du0, tyb tyb0, dnpp dnpp0, Account account0, fhwk fhwk0, fhvw fhvw0) {
        this.a = du0;
        this.r = tyb0;
        this.e = dnpp0;
        this.f = account0;
        this.g = fhwk0;
        this.h = fhvw0;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.n = new ArrayList();
    }

    @Override  // tk
    public final int b() {
        return hwfk.S() ? this.j.size() : this.i.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return dmuy.q;
    }

    @Override  // tk
    public final long dy(int v) {
        if(hwfk.S()) {
            dnfq dnfq0 = (dnfq)this.j.get(v);
            return (long)Arrays.hashCode(new Object[]{dnfq0.a, dnfq0.b, dnfq0.e, dnfq0.f, dnfq0.h, dnfq0.k, dnfq0.m});
        }
        dnfp dnfp0 = (dnfp)this.i.get(v);
        return (long)Arrays.hashCode(new Object[]{dnfp0.a, dnfp0.b, dnfp0.e, dnfp0.f, dnfp0.h, dnfp0.q, dnfp0.s});
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E06D6, viewGroup0, false);  // layout:pay_fop_detail_item
        ibuq.e(view0, "inflate(...)");
        return new dmux(view0);
    }

    public final int f() {
        return fipx.a(this.a.requireContext(), 0x7F0402FC);  // attr:colorOnSurfaceVariant
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "viewHolder");
        int v1 = 8;
        ColorStateList colorStateList0 = null;
        boolean z = false;
        if(hwfk.S()) {
            dnfq dnfq0 = (dnfq)this.j.get(v);
            Integer integer0 = dnfq0.a;
            if(integer0 == null) {
                String s = dnfq0.b;
                if(s != null) {
                    ((txx)this.r.h(s).s(udf.a)).k(((dmux)uq0).t);
                }
            }
            else {
                ImageView imageView0 = ((dmux)uq0).t;
                imageView0.setImageResource(integer0.intValue());
                Integer integer1 = dnfq0.c;
                if(integer1 != null) {
                    colorStateList0 = ColorStateList.valueOf(integer1.intValue());
                }
                imageView0.setImageTintList(colorStateList0);
            }
            Resources resources0 = this.a.getResources();
            ibuq.e(resources0, "getResources(...)");
            int v2 = dnfq0.d == null ? resources0.getDimensionPixelSize(0x7F070DE1) : ((int)dnfq0.d);  // dimen:pay_fops_details_action_icon_size
            ImageView imageView1 = ((dmux)uq0).t;
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView1.getLayoutParams();
            batl.t(viewGroup$LayoutParams0, new dmum());
            if(viewGroup$LayoutParams0.width != v2) {
                viewGroup$LayoutParams0.width = v2;
                viewGroup$LayoutParams0.height = v2;
                imageView1.requestLayout();
            }
            ((dmux)uq0).u.setText(dnfq0.e);
            funx.e(((dmux)uq0).v, dnfq0.f);
            ((dmux)uq0).v.setContentDescription(dnfq0.g);
            funx.e(((dmux)uq0).w, dnfq0.h);
            ((dmux)uq0).w.setContentDescription(dnfq0.i);
            String s1 = dnfq0.k;
            if(s1 != null && dnfq0.n != null) {
                ((ggtj)dmuy.p.j()).x("Both action text view and action button view were present for action item.");
            }
            if((s1 != null || dnfq0.n != null) && dnfq0.l != null) {
                ((ggtj)dmuy.p.j()).x("Both action text and switch were present for action item.");
            }
            MaterialButton materialButton0 = ((dmux)uq0).x;
            funx.e(materialButton0, s1);
            TextView textView0 = ((dmux)uq0).z;
            String s2 = dnfq0.n;
            funx.e(textView0, s2);
            View.OnClickListener view$OnClickListener0 = dnfq0.m;
            if(view$OnClickListener0 == null) {
                ((dmux)uq0).a.setEnabled(false);
            }
            else {
                View view0 = ((dmux)uq0).a;
                view0.setEnabled(true);
                view0.setOnClickListener(view$OnClickListener0);
                if(s1 == null) {
                    materialButton0.setEnabled(false);
                }
                else {
                    materialButton0.setEnabled(true);
                    materialButton0.setOnClickListener(view$OnClickListener0);
                }
                if(s2 == null) {
                    textView0.setEnabled(false);
                }
                else {
                    textView0.setEnabled(true);
                    textView0.setOnClickListener(view$OnClickListener0);
                }
            }
            SwitchCompat switchCompat0 = ((dmux)uq0).y;
            Boolean boolean0 = dnfq0.l;
            if(boolean0 != null) {
                v1 = 0;
            }
            switchCompat0.setVisibility(v1);
            if(boolean0 != null) {
                z = boolean0.booleanValue();
            }
            switchCompat0.setChecked(z);
        }
        else {
            dnfp dnfp0 = (dnfp)this.i.get(v);
            gfsx gfsx0 = dnfp0.a;
            if(gfsx0.i()) {
                ImageView imageView2 = ((dmux)uq0).t;
                imageView2.setImageResource(((Number)gfsx0.d()).intValue());
                gfsx gfsx1 = dnfp0.c;
                if(gfsx1.i()) {
                    colorStateList0 = ColorStateList.valueOf(((Number)gfsx1.d()).intValue());
                }
                else {
                    gfsx gfsx2 = dnfp0.b;
                    if(gfsx2.i()) {
                        String s3 = (String)gfsx2.d();
                        ((txx)this.r.h(s3).s(udf.a)).k(imageView2);
                    }
                }
                imageView2.setImageTintList(colorStateList0);
            }
            Resources resources1 = this.a.getResources();
            ibuq.e(resources1, "getResources(...)");
            gfsx gfsx3 = dnfp0.d;
            Object object0 = gfsx3.i() ? gfsx3.d() : resources1.getDimensionPixelSize(0x7F070DE1);  // dimen:pay_fops_details_action_icon_size
            ImageView imageView3 = ((dmux)uq0).t;
            int v3 = ((Number)object0).intValue();
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = imageView3.getLayoutParams();
            batl.s(viewGroup$LayoutParams1);
            if(viewGroup$LayoutParams1.width != v3) {
                viewGroup$LayoutParams1.width = v3;
                viewGroup$LayoutParams1.height = v3;
                imageView3.requestLayout();
            }
            ((dmux)uq0).u.setText(dnfp0.e);
            String s4 = (String)dnfp0.f.g();
            funx.e(((dmux)uq0).v, s4);
            CharSequence charSequence0 = (CharSequence)dnfp0.g.g();
            ((dmux)uq0).v.setContentDescription(charSequence0);
            String s5 = (String)dnfp0.h.g();
            funx.e(((dmux)uq0).w, s5);
            CharSequence charSequence1 = (CharSequence)dnfp0.i.g();
            ((dmux)uq0).w.setContentDescription(charSequence1);
            gfsx gfsx4 = dnfp0.q;
            if(gfsx4.i() && dnfp0.t.i()) {
                ((ggtj)dmuy.p.j()).x("Both action text view and action button view were present for action item.");
            }
            if((gfsx4.i() || dnfp0.t.i()) && dnfp0.r.i()) {
                ((ggtj)dmuy.p.j()).x("Both action text and switch were present for action item.");
            }
            MaterialButton materialButton1 = ((dmux)uq0).x;
            funx.e(materialButton1, ((String)gfsx4.g()));
            TextView textView1 = ((dmux)uq0).z;
            gfsx gfsx5 = dnfp0.t;
            funx.e(textView1, ((String)gfsx5.g()));
            gfsx gfsx6 = dnfp0.s;
            if(gfsx6.i()) {
                View view1 = ((dmux)uq0).a;
                view1.setEnabled(true);
                view1.setOnClickListener(((View.OnClickListener)gfsx6.d()));
                if(gfsx4.i()) {
                    materialButton1.setEnabled(true);
                    materialButton1.setOnClickListener(((View.OnClickListener)gfsx6.d()));
                }
                else {
                    materialButton1.setEnabled(false);
                }
                if(gfsx5.i()) {
                    textView1.setEnabled(true);
                    textView1.setOnClickListener(((View.OnClickListener)gfsx6.d()));
                }
                else {
                    textView1.setEnabled(false);
                }
            }
            else {
                ((dmux)uq0).a.setEnabled(false);
            }
            SwitchCompat switchCompat1 = ((dmux)uq0).y;
            gfsx gfsx7 = dnfp0.r;
            if(gfsx7.i()) {
                v1 = 0;
            }
            switchCompat1.setVisibility(v1);
            switchCompat1.setChecked(((Boolean)gfsx7.f(Boolean.valueOf(false))).booleanValue());
        }
        fhvo fhvo0 = (fhvo)this.k.get(v);
        this.g.g(uq0.a, fhvo0);
    }

    @Override  // tk
    public final void l(uq uq0) {
        ibuq.f(uq0, "holder");
        this.g.d(uq0.a);
    }
}

