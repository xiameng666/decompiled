import android.support.v7.widget.Toolbar;
import android.util.Pair;
import android.widget.TextView;
import com.google.android.gms.pay.pass.common.template.detail.ListItemImage;
import com.google.android.material.button.MaterialButton;

public final class dulq implements evqf {
    public final duls a;
    public final Pair b;

    public dulq(duls duls0, Pair pair0) {
        this.a = duls0;
        this.b = pair0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        String s;
        duls duls0 = this.a;
        if(duls0.aw()) {
            return;
        }
        gtxg gtxg0 = (gtxg)this.b.second;
        Toolbar toolbar0 = (Toolbar)duls0.ag.findViewById(0x7F0B08D8);  // id:Toolbar
        toolbar0.t(0x7F151C03);  // string:pay_back "Back"
        toolbar0.x(new dulp(duls0));
        hkar hkar0 = ((hjzq)object0).c;
        if(hkar0 == null) {
            hkar0 = hkar.a;
        }
        if(((hkar0.c == null ? hkao.a : hkar0.c).b & 1) == 0) {
            s = null;
        }
        else {
            hkar hkar1 = ((hjzq)object0).c;
            if(hkar1 == null) {
                hkar1 = hkar.a;
            }
            hkao hkao0 = hkar1.c == null ? hkao.a : hkar1.c;
            hkaq hkaq0 = hkao0.c == null ? hkaq.a : hkao0.c;
            s = hkaq0.c == 4 ? ((String)hkaq0.d) : "";
        }
        guez guez0 = dtzu.a(s);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gugz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gugz gugz0 = (gugz)hftp0.b_message;
        guez0.getClass();
        gugz0.e = guez0;
        gugz0.b |= 1;
        gugz gugz1 = (gugz)hftp0.N_build();
        ListItemImage listItemImage0 = (ListItemImage)duls0.ag.findViewById(0x7F0B016A);  // id:CardImage
        listItemImage0.g(duls0);
        gubi gubi0 = duiu.a();
        listItemImage0.f(gugz1, guhl.a, gufs.a, gufo.c, gubi0);
        ((TextView)duls0.ag.findViewById(0x7F0B08BD)).setText(duls0.getString(0x7F151F19, new Object[]{duix.a(duls0.requireContext(), gtxg0, ((hjzq)object0))}));  // id:Title
        TextView textView0 = (TextView)duls0.ag.findViewById(0x7F0B00E0);  // id:Body
        String s1 = duix.a(duls0.requireContext(), gtxg0, ((hjzq)object0));
        textView0.setText(duls0.getString(0x7F151F18, new Object[]{s1, s1}));  // string:pay_id_verification_cta_body "To prevent fraud and protect your %1$s, Google 
                                                                               // needs to verify your identity again. This helps keep your %2$s secure in Google 
                                                                               // Wallet."
        MaterialButton materialButton0 = (MaterialButton)duls0.ag.findViewById(0x7F0B001D);  // id:ActionButton
        materialButton0.setText(duls0.getString(0x7F151CC1));  // string:pay_continue "Continue"
        materialButton0.setOnClickListener(new dulo(duls0, gtxg0));
    }
}

