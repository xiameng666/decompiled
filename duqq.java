import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.pay.MdocIntentArgs;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.material.button.MaterialButton;
import dagger.internal.Preconditions;
import j..util.Objects;

public final class duqq extends dokz implements ednc {
    final gfsx a;
    public gtxf ag;
    public ProvisioningId ah;
    private View ai;
    dvfh b;
    dtze c;
    fuok d;

    public duqq() {
        this.a = gfqx.a;
        this.ag = gtxf.a;
    }

    private final void A() {
        edqf.b(((TextView)this.ai.findViewById(0x7F0B012C)), 0x7F151EB7, "cancel your application", new duqj(this), false);  // id:Callout
    }

    private final void B() {
        Toolbar toolbar0 = (Toolbar)this.ai.findViewById(0x7F0B08D8);  // id:Toolbar
        toolbar0.t(0x7F151C03);  // string:pay_back "Back"
        toolbar0.x((/* MISSING LAMBDA PARAMETER */) -> {
            dmqm dmqm0 = new dmqm();
            dmqm0.h(29);
            dmqm0.i(true);
            Intent intent0 = dmqm0.c();
            intent0.addFlags(0x4000000);
            this.startActivity(intent0);
        });
    }

    @Override  // ednc
    public final boolean F() {
        return hwev.c();
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dump dump0 = new dump(dolg0, dpsw.a(doly0, this.ap()), dxee.a(doly0), doly0);
        this.a.f(dump0);
        dump0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        String s2;
        this.ag = (gtxf)Objects.requireNonNull(gtxf.b(((Bundle)Objects.requireNonNull(this.getArguments())).getInt("mdoc_type", 0)));
        String s = this.z().a;
        gftb.check(s);
        this.ah = new ProvisioningId(s);
        if(hwev.c()) {
            this.ai = layoutInflater0.inflate(0x7F0E0590, viewGroup0, false);  // layout:mdoc_under_review_component_view
            this.B();
            fryh fryh0 = new fryh(0x7F080697);  // drawable:hourglass_top
            fryu fryu0 = new fryu("");
            frxp frxp0 = new frxp(0);
            fuhm fuhm0 = new fuhm(new fugt(fryh0, fryu0, null, fugw.a, frxp0), new fryr(0x7F151EC8), new fryr(0x7F151EC7));  // string:pay_id_card_under_review_title "Your info is under review for identity verification"
            ((ComposeViewHeader)this.ai.findViewById(0x7F0B020D)).b(fuhm0);  // id:ComposeViewHeader
            this.A();
            ComposeActionBar composeActionBar0 = (ComposeActionBar)this.ai.findViewById(0x7F0B00EB);  // id:BottomActionBar
            ftuy ftuy0 = new ftuy();
            ftuy0.h(ftts.a(new fryr(0x7F150820), new duqp(this)).a());  // string:common_done "Done"
            ftux ftux0 = ftts.a(new fryr(0x7F151EC0), new duqo(this));  // string:pay_id_card_how_to_use_label "How to use a digital ID"
            ftux0.c(ftvc.a);
            ftuy0.i(ftux0.a());
            composeActionBar0.d(ftuy0.a());
            fuop.a(this.d, this.ai.findViewById(0x7F0B022B));  // id:ContentView
            return this.ai;
        }
        this.ai = layoutInflater0.inflate(0x7F0E0591, viewGroup0, false);  // layout:mdoc_under_review_fragment
        this.ag = (gtxf)Objects.requireNonNull(gtxf.b(((Bundle)Objects.requireNonNull(this.getArguments())).getInt("mdoc_type", 0)));
        String s1 = this.z().a;
        gftb.check(s1);
        this.ah = new ProvisioningId(s1);
        this.B();
        ((ImageView)this.ai.findViewById(0x7F0B0498)).setImageDrawable(this.c.a(0x7F080699, 0x7F080698));  // id:Icon
        this.A();
        ((ImageView)this.ai.findViewById(0x7F0B04A1)).setImageDrawable(this.c.a((hwmp.G() ? 0x7F080696 : 0x7F08029E), (hwmp.G() ? 0x7F080695 : 0x7F08029D)));  // id:Image
        MaterialButton materialButton0 = (MaterialButton)this.ai.findViewById(0x7F0B089A);  // id:TextButton
        if(hwmp.B()) {
            materialButton0.setText(0x7F151EC0);  // string:pay_id_card_how_to_use_label "How to use a digital ID"
            materialButton0.setOnClickListener(new duqh(this));
        }
        else {
            materialButton0.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                dmqm dmqm0 = new dmqm();
                dmqm0.h(29);
                dmqm0.i(true);
                Intent intent0 = dmqm0.c();
                intent0.addFlags(0x4000000);
                this.startActivity(intent0);
            });
        }
        MaterialButton materialButton1 = (MaterialButton)this.ai.findViewById(0x7F0B057A);  // id:MaterialButton
        if(hwmp.B()) {
            s2 = this.getString(0x7F150870);  // string:common_got_it "Got it"
        }
        else {
            int v = this.ag.ordinal();
            if(v != 0 && v != 1) {
                switch(v) {
                    case 2: {
                        s2 = this.getString(0x7F151ED3, new Object[]{this.getString(0x7F151ED6)});  // string:pay_id_how_to_use_label "How to use an %1$s"
                        break;
                    }
                    case 3: 
                    case 4: {
                        s2 = this.getString(0x7F151EC1);  // string:pay_id_card_how_to_use_title "How to use your digital ID"
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException(String.format("Unknown mdoc type: %s", this.ag.name()));
                    }
                }
            }
            else {
                s2 = this.getString(0x7F151EC1);  // string:pay_id_card_how_to_use_title "How to use your digital ID"
            }
        }
        materialButton1.setText(s2);
        if(hwmp.B()) {
            materialButton1.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                dmqm dmqm0 = new dmqm();
                dmqm0.h(29);
                dmqm0.i(true);
                Intent intent0 = dmqm0.c();
                intent0.addFlags(0x4000000);
                this.startActivity(intent0);
            });
            return this.ai;
        }
        materialButton1.setOnClickListener(new duqm(this));
        return this.ai;
    }

    // Detected as a lambda impl.
    public final void y() {
        dmqm dmqm0 = new dmqm();
        dmqm0.h(29);
        dmqm0.i(true);
        Intent intent0 = dmqm0.c();
        intent0.addFlags(0x4000000);
        this.startActivity(intent0);
    }

    private final MdocIntentArgs z() {
        MdocIntentArgs mdocIntentArgs0 = ednn.b(this).K;
        return mdocIntentArgs0 == null ? new dlge().a : mdocIntentArgs0;
    }
}

