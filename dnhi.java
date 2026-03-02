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

public final class dnhi extends tk {
    public final du a;
    public final dmhi e;
    public final dmsn f;
    public final dmkl g;
    public final dnpp h;
    public final efma i;
    public final dmtl j;
    public final Account k;
    public final List l;
    public dxev m;
    public boolean n;
    public String o;
    public final List p;
    public final etgl q;
    public static final int r;
    private static final int s;
    private static final int t;
    private final tyb u;
    private final bboh v;

    static {
        ghfz ghfz0 = ghgf.e();
        String s = new ibuk(dnhi.class).b();
        ibuq.d(s, "null cannot be cast to non-null type kotlin.CharSequence");
        dnhi.s = ((ghfw)ghfz0.d(s)).a;
        dnhi.t = ((ghfw)ghgf.e().d("FopDetailActionsHeader")).a;
    }

    public dnhi(du du0, dmhi dmhi0, dmsn dmsn0, dmkl dmkl0, tyb tyb0, dnpp dnpp0, efma efma0, etgl etgl0, dmtl dmtl0, Account account0) {
        this.a = du0;
        this.e = dmhi0;
        this.f = dmsn0;
        this.g = dmkl0;
        this.u = tyb0;
        this.h = dnpp0;
        this.i = efma0;
        this.q = etgl0;
        this.j = dmtl0;
        this.k = account0;
        this.v = bboh.b("Pay", bbcu.cZ);
        this.l = new ArrayList();
        this.p = new ArrayList();
    }

    public final gfsx G() {
        du du0 = this.a;
        if(du0.getContext() == null) {
            return gfqx.a;
        }
        String s = du0.getString(dzdm.f.m);
        ibuq.e(s, "getString(...)");
        String s1 = du0.getString(dzdl.a(dyna.i).a);
        String s2 = du0.getString(0x7F1508AA);  // string:common_open "Open"
        String s3 = du0.getString(0x7F151E38);  // string:pay_fops_transactions_in_card_app "To view the full transaction history for 
                                                // this card, open your card issuer\'s app"
        return gfsx.l(new dnfq(null, hwnm.g(), null, null, s, s1, null, null, null, null, s2, null, new dngr(), null, s3, 0xAFFCD));
    }

    public final void H(hami hami0, dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        hktu hktu0 = hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f);
        this.h.e(hami0, hktu0);
    }

    public final void I(uq uq0, dnfq dnfq0) {
        ibuq.f(uq0, "viewHolder");
        ibuq.f(dnfq0, "action");
        Integer integer0 = dnfq0.a;
        ColorStateList colorStateList0 = null;
        if(integer0 == null) {
            String s = dnfq0.b;
            if(s != null) {
                ((txx)this.u.h(s).s(udf.a)).k(((dnhe)uq0).t);
                ((dnhe)uq0).t.setImageTintList(null);
            }
        }
        else {
            ImageView imageView0 = ((dnhe)uq0).t;
            imageView0.setImageResource(integer0.intValue());
            Integer integer1 = dnfq0.c;
            if(integer1 != null) {
                colorStateList0 = ColorStateList.valueOf(integer1.intValue());
            }
            imageView0.setImageTintList(colorStateList0);
        }
        Resources resources0 = this.a.getResources();
        ibuq.e(resources0, "getResources(...)");
        int v = dnfq0.d == null ? resources0.getDimensionPixelSize(0x7F070DE1) : ((int)dnfq0.d);  // dimen:pay_fops_details_action_icon_size
        ImageView imageView1 = ((dnhe)uq0).t;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView1.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            ((ggtj)this.v.j()).x("Icon view layout params are null");
            return;
        }
        if(viewGroup$LayoutParams0.width != v) {
            viewGroup$LayoutParams0.width = v;
            viewGroup$LayoutParams0.height = v;
            imageView1.requestLayout();
        }
        ((dnhe)uq0).u.setText(dnfq0.e);
        funx.e(((dnhe)uq0).v, dnfq0.f);
        ((dnhe)uq0).v.setContentDescription(dnfq0.g);
        funx.e(((dnhe)uq0).w, dnfq0.h);
        ((dnhe)uq0).w.setContentDescription(dnfq0.i);
        String s1 = dnfq0.j;
        boolean z = false;
        if(s1 != null) {
            ((dnhe)uq0).B.setVisibility(0);
            ((dnhe)uq0).x.setText(s1);
            ((dnhe)uq0).x.setAccessibilityLiveRegion(1);
        }
        String s2 = dnfq0.o;
        if(s2 != null) {
            ((dnhe)uq0).C.setVisibility(0);
            ((dnhe)uq0).C.setText(s2);
        }
        String s3 = dnfq0.k;
        if(s3 != null && dnfq0.n != null) {
            ((ggtj)this.v.j()).x("Both action text view and action button view were present for action item.");
        }
        if((s3 != null || dnfq0.n != null) && dnfq0.l != null) {
            ((ggtj)this.v.j()).x("Both action text and switch were present for action item.");
        }
        MaterialButton materialButton0 = ((dnhe)uq0).y;
        funx.e(materialButton0, s3);
        TextView textView0 = ((dnhe)uq0).A;
        String s4 = dnfq0.n;
        funx.e(textView0, s4);
        View.OnClickListener view$OnClickListener0 = dnfq0.m;
        if(view$OnClickListener0 != null) {
            View view0 = ((dnhe)uq0).a;
            view0.setEnabled(true);
            view0.setOnClickListener(view$OnClickListener0);
            if(s3 == null) {
                materialButton0.setEnabled(false);
            }
            else {
                materialButton0.setEnabled(true);
                materialButton0.setOnClickListener(view$OnClickListener0);
            }
            if(s4 == null) {
                textView0.setEnabled(false);
            }
            else {
                textView0.setEnabled(true);
                textView0.setOnClickListener(view$OnClickListener0);
            }
            view0.setEnabled(false);
        }
        SwitchCompat switchCompat0 = ((dnhe)uq0).z;
        Boolean boolean0 = dnfq0.l;
        switchCompat0.setVisibility((boolean0 == null ? 8 : 0));
        if(boolean0 != null) {
            z = boolean0.booleanValue();
        }
        switchCompat0.setChecked(z);
    }

    @Override  // tk
    public final int b() {
        return this.l.isEmpty() ? 0 : this.l.size() + 1;
    }

    @Override  // tk
    public final int dx(int v) {
        return v == 0 ? dnhi.t : dnhi.s;
    }

    @Override  // tk
    public final long dy(int v) {
        if(v == 0) {
            return (long)Arrays.hashCode(new Object[]{((int)0), "", "", "", "", 0});
        }
        dnfq dnfq0 = (dnfq)this.l.get(v - 1);
        return (long)Arrays.hashCode(new Object[]{dnfq0.a, dnfq0.b, dnfq0.e, dnfq0.f, dnfq0.h, dnfq0.k, dnfq0.m});
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == dnhi.t) {
            View view0 = layoutInflater0.inflate(0x7F0E06D4, viewGroup0, false);  // layout:pay_fop_detail_action_header
            ibuq.c(view0);
            return new dnhg(view0);
        }
        View view1 = layoutInflater0.inflate(0x7F0E06D6, viewGroup0, false);  // layout:pay_fop_detail_item
        ibuq.c(view1);
        return new dnhe(view1);
    }

    public final int f() {
        return fipx.a(this.a.requireContext(), 0x7F0402FC);  // attr:colorOnSurfaceVariant
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "viewHolder");
        if(v == 0) {
            TextView textView0 = ((dnhg)uq0).t;
            textView0.setVisibility(8);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = textView0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            viewGroup$LayoutParams0.height = 0;
            textView0.setLayoutParams(viewGroup$LayoutParams0);
            return;
        }
        this.I(uq0, ((dnfq)this.l.get(v - 1)));
    }

    public final gfsx n(hkgs hkgs0, hkir hkir0, boolean z) {
        if(hkgs0 != null && hkir0 != null && z && (hkgs0.b & 2) != 0) {
            du du0 = this.a;
            if(du0.getContext() != null) {
                hjqa hjqa0 = hkgs0.h == null ? hjqa.a : hkgs0.h;
                ibuq.e(hjqa0, "getAppDetails(...)");
                hjwp hjwp0 = hkgs0.g == null ? hjwp.a : hkgs0.g;
                ibuq.e(hjwp0, "getAppIntentInfo(...)");
                String s = frxe.d(du0.requireContext(), hjqa0.e) ? du0.getString(0x7F1508AA) : du0.getString(0x7F151F24);  // string:common_open "Open"
                ibuq.c(s);
                String s1 = du0.getString(0x7F151E38);  // string:pay_fops_transactions_in_card_app "To view the full transaction history for 
                                                        // this card, open your card issuer\'s app"
                ibuq.e(s1, "getString(...)");
                int v = du0.getResources().getDimensionPixelSize(0x7F070DE0);  // dimen:pay_fops_details_action_app_logo_size
                String s2 = hjqa0.b;
                ibuq.e(s2, "getAppName(...)");
                String s3 = hjqa0.c;
                String s4 = (hjqa0.d == null ? hjqk.a : hjqa0.d).b;
                dngz dngz0 = new dngz(this, hkgs0, hjqa0, hjwp0);
                if(dnhf.a(hkir0)) {
                    s1 = null;
                }
                return gfsx.l(new dnfq(null, s4, null, v, s2, s3, null, null, null, null, s, null, dngz0, null, s1, 0xAFFC5));
            }
        }
        return gfqx.a;
    }
}

