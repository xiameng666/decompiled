import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvuj implements kar {
    public final dvuz a;

    public dvuj(dvuz dvuz0) {
        this.a = dvuz0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        dxea dxea0 = (dxea)object0;
        dvuz dvuz0 = this.a;
        if(dvuz0.r.i() && ((Valuable)dvuz0.r.d()).R.equals(guwf.k)) {
            if(hwfk.i() && dvuz0.R.a.a != fuor.b) {
                return;
            }
            dvuz0.d.q(0x7F152354);  // string:pay_valuable_update_notice_pending_update "This pass has an available update."
            dvuo dvuo0 = new dvuo(dvuz0);
            dvuz0.d.p(0x7F152353, dvuo0);  // string:pay_valuable_update_notice_learn_how_to "Learn how to update"
            dvuz0.d.m(0x7F080596);  // drawable:gs_history_vd_theme_24
            dvuz0.d.setVisibility(0);
            dvuz0.B.l(((Valuable)dvuz0.r.d()), 3, 3);
            return;
        }
        ((ggtj)dvuz.a.i()).x("No suitable valuable initialized yet.");
        dvuz0.d.setVisibility(8);
    }
}

