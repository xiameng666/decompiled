import android.content.Context;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import j..util.Optional;

public final class dufs implements evqf {
    public final dugg a;
    public final Context b;
    public final gtxg c;

    public dufs(dugg dugg0, Context context0, gtxg gtxg0) {
        this.a = dugg0;
        this.b = context0;
        this.c = gtxg0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Object[] arr_object = {duix.a(this.b, this.c, ((hjzq)object0))};
        String s = this.b.getString(0x7F151EEA, arr_object);  // string:pay_id_pass_info_label "%1$s info"
        Context context0 = this.a.requireContext();
        String s1 = dtsz.k(context0, (gtxf.b(this.c.h) == null ? gtxf.f : gtxf.b(this.c.h)));
        frxo frxo0 = new frxo(0x7F04030C);  // attr:colorPrimary
        iwj iwj0 = dsns.c(context0, dsns.d(context0, s1, frxo0), "mdocEducationalLink", frxo0, new duft(this.a, context0));
        ComposeViewHeader composeViewHeader0 = (ComposeViewHeader)this.a.ar.findViewById(0x7F0B0995);  // id:ViewHeader
        Optional optional0 = dvcm.b(((hjzq)object0), dsoa.a(gufa.g));
        composeViewHeader0.b(new fuhm((optional0.isPresent() ? new fugr(new fujl(((fryk)optional0.get()))) : null), new fryu(s), new fryq(iwj0)));
        composeViewHeader0.setVisibility(0);
    }
}

