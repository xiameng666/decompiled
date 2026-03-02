import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView;
import com.google.android.wallet.ui.common.DateEditText;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.MaterialFieldLayout;
import com.google.android.wallet.ui.common.SummaryTextLayout;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

public final class fcbg extends gdak implements View.OnFocusChangeListener {
    TextView a;
    MaterialFieldLayout ag;
    CvcHintImageView ah;
    private View ai;
    private View aj;
    private SummaryExpanderWrapper ak;
    private SummaryTextLayout al;
    private final ArrayList am;
    private final ArrayList an;
    private final gamj ao;
    private final gdew ap;
    DateEditText b;
    public FormEditText c;
    MaterialFieldLayout d;

    public fcbg() {
        this.am = new ArrayList(1);
        this.an = new ArrayList(2);
        this.ao = new gamj(0x673);
        this.ap = new gdew();
    }

    @Override  // gami
    public final gamj B() {
        return this.ao;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((gfaq)this.aA).d;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gfaq.b).jf(7, null);
    }

    @Override  // gdcm
    protected final void M() {
        if(this.ak == null) {
            return;
        }
        boolean z = this.ca;
        this.d.setEnabled(z);
        this.ag.setEnabled(z);
        this.ah.setEnabled(z);
        this.ak.setEnabled(z);
    }

    public final boolean Q() {
        return !new hfuh(((gfaq)this.aA).q, gfaq.a).contains(gfap.b);
    }

    public final boolean R() {
        boolean z = new hfuh(((gfaq)this.aA).q, gfaq.a).contains(gfap.c) ^ 1;
        if(z == (new hfuh(((gfaq)this.aA).q, gfaq.a).contains(gfap.d) ^ 1)) {
            return z;
        }
        throw new IllegalArgumentException("Month and year must both shown, or both hidden.");
    }

    @Override  // gdak
    public final ArrayList aY() {
        return this.am;
    }

    @Override  // gdak
    public final long bs() {
        return 0L;
    }

    @Override  // gdak
    public final String lL(String s) {
        if(!this.lb(null)) {
            return "";
        }
        boolean z = ((gfaq)this.aA).f.isEmpty();
        boolean z1 = this.R();
        if(!z && z1) {
            return String.format("%1$s, Expires %2$s", ((gfaq)this.aA).f, this.b.aX(null));
        }
        if(z1) {
            return String.format("Expires %1$s", this.b.aX(null));
        }
        return z ? "CVC" : ((gfaq)this.aA).f;
    }

    @Override  // gdak
    public final void lW(int v) {
        this.aj.setVisibility(v);
    }

    @Override  // gdaa
    public final boolean la() {
        return this.lb(null);
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.an;
    }

    @Override  // gami
    public final List li() {
        return null;
    }

    @Override  // gdcm
    protected final long lq() {
        gewg gewg0 = ((gfaq)this.aA).d;
        if(gewg0 == null) {
            gewg0 = gewg.a;
        }
        return gewg0.d;
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        if((getg0.b == null ? gesr.a : getg0.b).b.equals(((gfaq)this.aA).e)) {
            gfap gfap0 = gfap.b((getg0.b == null ? gesr.a : getg0.b).c);
            if(gfap0 == null) {
                return false;
            }
            if(!new hfuh(((gfaq)this.aA).q, gfaq.a).contains(gfap0)) {
                switch(gfap0.ordinal()) {
                    case 1: {
                        this.c.nT(getg0.c, true);
                        return true;
                    }
                    case 2: 
                    case 3: {
                        this.b.nT(getg0.c, true);
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
            throw new IllegalArgumentException("Cannot apply message to hidden field: " + gfap0.g);
        }
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ap;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        if(view0 == this.c) {
            this.ah.setVisibility((z ? 0 : 8));
        }
    }

    @Override  // gdcm
    public final void onResume() {
        super.onResume();
        if(this.al != null) {
            StringBuilder stringBuilder0 = new StringBuilder(((gfaq)this.aA).f);
            if(this.R()) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(this.d.g);
            }
            if(this.Q()) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(this.ag.g);
            }
            this.al.b(stringBuilder0.toString());
        }
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ProtoLiteBuilder hftp1;
        gcxy gcxy0;
        int v = 0;
        View view0 = layoutInflater0.inflate(0x7F0E0D32, null, false);  // layout:wallet_fragment_expiration_date_form
        this.ai = view0;
        SummaryExpanderWrapper summaryExpanderWrapper0 = (SummaryExpanderWrapper)view0.findViewById(0x7F0B134E);  // id:expiration_date_form_wrapper
        this.ak = summaryExpanderWrapper0;
        summaryExpanderWrapper0.f(this, 0x7F0B134C, 0x7F0B134D);  // id:expiration_date_form_image
        this.al = (SummaryTextLayout)this.ai.findViewById(0x7F0B134D);  // id:expiration_date_form_summary
        this.aj = this.ai.findViewById(0x7F0B1349);  // id:expiration_date_content
        this.d = (MaterialFieldLayout)this.ai.findViewById(0x7F0B1339);  // id:exp_date_material_field_container
        this.ag = (MaterialFieldLayout)this.ai.findViewById(0x7F0B1089);  // id:cvc_material_field_container
        this.a = (TextView)this.ai.findViewById(0x7F0B0E19);  // id:card_label_text
        this.b = (DateEditText)this.ai.findViewById(0x7F0B1337);  // id:exp_date
        boolean z = this.R();
        if(z) {
            this.b.R(this.cM());
            gfjj gfjj0 = fbed.b(this.getContext(), ((gfaq)this.aA).k, ((gfaq)this.aA).l, ((gfaq)this.aA).m, ((gfaq)this.aA).n);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfjj0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gfjj0));
            long v1 = this.cL(5);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfjj gfjj1 = (gfjj)hftp0.b_message;
            gfjj1.b |= 2;
            gfjj1.f = v1;
            gdcd.d(((gfjj)hftp0.N_build()), this.b);
            this.d.h();
        }
        this.c = (FormEditText)this.ai.findViewById(0x7F0B1086);  // id:cvc
        boolean z1 = this.Q();
        if(z1) {
            this.c.R(this.cM());
            this.c.V(this.cL(1));
            gcxy0 = new gcxy(this.c, ((gfaq)this.aA).g);
            this.c.B(gcxy0);
            this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((gfaq)this.aA).g)});
            this.c.setOnFocusChangeListener(this);
        }
        else {
            gcxy0 = null;
        }
        if(!((gfaq)this.aA).f.isEmpty()) {
            this.am.add(this.a);
            this.a.setText(((gfaq)this.aA).f);
            this.a.setVisibility(0);
            gczs gczs0 = new gczs(0L, this.a, null);
            this.an.add(gczs0);
        }
        if(z) {
            gfaq gfaq0 = (gfaq)this.aA;
            if((gfaq0.c & 0x2000) != 0 && (gfaq0.p == null ? gfar.a : gfaq0.p).e > 0) {
                DateEditText dateEditText0 = this.b;
                gfar gfar0 = ((gfaq)this.aA).p;
                if(gfar0 == null) {
                    gfar0 = gfar.a;
                }
                String s = String.valueOf(gfar0.e);
                gfar gfar1 = ((gfaq)this.aA).p;
                if(gfar1 == null) {
                    gfar1 = gfar.a;
                }
                dateEditText0.n(s, String.valueOf(gfar1.f), 6);
            }
        }
        if(z && z1) {
            this.b.E(this.b, this.b, false);
            this.b.setNextFocusDownId(0x7F0B1086);  // id:cvc
            this.c.E(gcxy0, this.c, true);
            this.c.setNextFocusUpId(0x7F0B1337);  // id:exp_date
        }
        else {
            if(z) {
                this.ag.setVisibility(8);
                this.b.E(this.b, this.b, false);
                goto label_68;
            }
            if(!z1) {
                throw new IllegalArgumentException("Expiration date or CVC must be shown");
            }
            this.d.setVisibility(8);
            this.c.E(gcxy0, this.c, false);
        }
    label_68:
        if(z) {
            if((((gfaq)this.aA).c & 0x2000) == 0) {
                hftp1 = null;
            }
            else {
                hftp1 = ((ProtoLiteMessage)gepn.a).v_newBuilder();
                gfar gfar2 = ((gfaq)this.aA).p;
                if(gfar2 == null) {
                    gfar2 = gfar.a;
                }
                int v2 = gfar2.e;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gepn)hftv0).b |= 2;
                ((gepn)hftv0).d = v2;
                gfar gfar3 = ((gfaq)this.aA).p;
                if(gfar3 == null) {
                    gfar3 = gfar.a;
                }
                int v3 = gfar3.f;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gepn gepn0 = (gepn)hftp1.b_message;
                gepn0.b |= 1;
                gepn0.c = v3;
            }
            DateEditText dateEditText1 = this.b;
            ProtoLiteMessage hftv1 = hftp1 == null ? null : hftp1.N_build();
            this.an.add(new gczs(0L, dateEditText1, hftv1));
        }
        if(z1) {
            gczs gczs1 = new gczs(0L, this.c, null);
            this.an.add(gczs1);
        }
        CvcHintImageView cvcHintImageView0 = (CvcHintImageView)this.ai.findViewById(0x7F0B1088);  // id:cvc_hint_image
        this.ah = cvcHintImageView0;
        cvcHintImageView0.a = this.getChildFragmentManager();
        CvcHintImageView cvcHintImageView1 = this.ah;
        String s1 = ((gfaq)this.aA).j;
        String s2 = ((gfaq)this.aA).i;
        gfgo gfgo0 = ((gfaq)this.aA).h;
        if(gfgo0 == null) {
            gfgo0 = gfgo.a;
        }
        cvcHintImageView1.a(s1, s2, gfgo0);
        CvcHintImageView cvcHintImageView2 = this.ah;
        if(!this.c.isFocused()) {
            v = 8;
        }
        cvcHintImageView2.setVisibility(v);
        this.am.add(this.aj);
        return this.ai;
    }
}

