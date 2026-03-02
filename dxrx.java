import android.content.Intent;
import j..util.DesugarCollections;

public final class dxrx implements evqf {
    public final dxrz a;
    public final gtlg b;
    public final gtur c;

    public dxrx(dxrz dxrz0, gtlg gtlg0, gtur gtur0) {
        this.a = dxrz0;
        this.b = gtlg0;
        this.c = gtur0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        dxrz dxrz0 = this.a;
        if(dxrz0.aw()) {
            return;
        }
        gtlg gtlg0 = this.b;
        Intent intent0 = new Intent();
        intent0.putExtra("top_up_amount", gtlg0.b);
        intent0.putExtra("top_up_payment_method", ((String)object0));
        intent0.putExtra("top_up_instrument_id", String.valueOf(this.c.g));
        intent0.putExtra("top_up_instrument_descr", this.c.d);
        intent0.putExtra("top_up_new_card_added", dxrz0.ar);
        eagu eagu0 = dzpw.c(dxrz0.getArguments());
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)eagu0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)eagu0));
        eagu eagu1 = (eagu)hftp0.b_message;
        if((eagt.b(eagu1.d) == null ? eagt.k : eagt.b(eagu1.d)) == eagt.c && !DesugarCollections.unmodifiableList(eagu1.f).isEmpty()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dymt.a).v_newBuilder();
            dyna dyna0 = dyna.b(((eagu)hftp0.b_message).c);
            if(dyna0 == null) {
                dyna0 = dyna.k;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dymt dymt0 = (dymt)hftp1.b_message;
            dymt0.c = dyna0.a();
            hkjm hkjm0 = (hkjm)DesugarCollections.unmodifiableList(((eagu)hftp0.b_message).f).get(0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dymt dymt1 = (dymt)hftp1.b_message;
            hkjm0.getClass();
            dymt1.d = hkjm0;
            dymt1.b |= 1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hjin.a).v_newBuilder();
            String s = gtlg0.c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hjin hjin0 = (hjin)hftp2.b_message;
            s.getClass();
            hjin0.b = s;
            long v = gtlg0.b / 1000000L;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hjin)hftp2.b_message).c = v;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dymt dymt2 = (dymt)hftp1.b_message;
            hjin hjin1 = (hjin)hftp2.N_build();
            hjin1.getClass();
            dymt2.e = hjin1;
            dymt2.b |= 2;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dymt dymt3 = (dymt)hftp1.b_message;
            ((String)object0).getClass();
            dymt3.f = (String)object0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            eagu eagu2 = (eagu)hftp0.b_message;
            dymt dymt4 = (dymt)hftp1.N_build();
            dymt4.getClass();
            eagu2.m = dymt4;
            eagu2.b |= 4;
            dxrz0.an.f(new eaby(), ((eagu)hftp0.N_build()));
            return;
        }
        dxrz0.at(-1, intent0);
        dxrz0.ar();
    }
}

