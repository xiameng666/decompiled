import android.view.View.OnClickListener;
import android.view.View;

public final class dncz implements View.OnClickListener {
    public final dndr a;
    public final String b;

    public dncz(dndr dndr0, String s) {
        this.a = dndr0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.b;
        dnkl dnkl0 = this.a.R();
        ibuq.f(s, "clientTokenId");
        dnkl0.q.l(Boolean.valueOf(true));
        dxzo dxzo0 = dnkl0.f;
        ibuq.f(s, "clientTokenId");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dxfe.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dxfe)hftp0.b_message).b = true;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        dxzh dxzh0 = new dxzh(new dxzg(s, ((dxfe)hftv0)));
        edng.a(dxzo0.b.b(dxzh0, dxzo0.a));
    }
}

