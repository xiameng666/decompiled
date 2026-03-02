import android.content.Context;
import android.widget.Toast;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.GiftCard;
import java.util.concurrent.atomic.AtomicInteger;

public final class dwif extends dwkz {
    dvgb a;
    private GiftCard ax;
    final gfsx b;
    public final AtomicInteger c;
    public guxj d;

    public dwif() {
        this.b = gfqx.a;
        this.c = new AtomicInteger();
    }

    @Override  // dwkz
    protected final guxj B() {
        return this.d;
    }

    @Override  // dwkz
    protected final String D() {
        gveu gveu0 = this.ax.a;
        return gveu0.b == 2 ? ((guyb)gveu0.c).g : guyb.a.g;
    }

    @Override  // dwkz
    protected final void E() {
        dwid dwid0 = new dwid(this);
        dpud dpud0 = new dpud(new dwie(this), dwid0);
        String s = this.ai.b;
        dvgb dvgb0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guye.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guye guye0 = (guye)hftp0.b_message;
        s.getClass();
        guye0.b = s;
        guye guye1 = (guye)hftp0.N_build();
        dptv.l(dvgb0.b, dpuj.ct, ((MessageLite)guye1), ((MessageLite)guyf.a), dpud0);
    }

    @Override  // dwkz
    protected final void H() {
        Context context0 = this.getContext();
        if(context0 != null) {
            Toast.makeText(context0, this.getText(0x7F151E71), 1).show();  // string:pay_gift_card_updated_toast_new "Gift card updated"
        }
    }

    @Override  // dwkz
    protected final int I() {
        gveu gveu0 = this.ax.a;
        int v = guuz.a((gveu0.b == 2 ? ((guyb)gveu0.c) : guyb.a).h);
        return v == 0 ? 1 : v;
    }

    @Override  // dwkz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        xob xob0 = (xob)context0;
        xob0.getWindow().setSoftInputMode(16);
        doly doly0 = dolz.a(this);
        dwhy dwhy0 = new dwhy();
        dwhy0.b(this.ap());
        dwhy0.a = dxee.a(doly0);
        dwhy0.b = doly0;
        dwhz dwhz0 = dwhy0.a();
        this.b.f(dwhz0);
        this.ao = dwhz0.a.a();
        this.ap = dwhz0.a.d();
        this.aw = dwhz0.b.a();
        this.aq = dwhz.e();
        this.ar = dwhz.f();
        this.as = dwhz.g();
        this.at = dwhz0.b();
        this.a = new dvgb(dwhz.d(), dwhz0.a(), dwhz0.c());
        xob0.getWindow().setSoftInputMode(16);
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        this.c.incrementAndGet();
    }

    @Override  // dwkz
    public final void onResume() {
        super.onResume();
        this.ax = (GiftCard)this.ai;
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        this.aq.a("VALUABLE_EDIT_GIFT_CARD", this.ap().d());
        Context context0 = this.getContext();
        if(context0 != null) {
            dnqd.c(context0, "Pay_ValuablesEditGiftCard");
        }
    }

    @Override  // dwkz
    protected final dwky y(dpue dpue0) {
        return new dwia(this, dpue0);
    }
}

