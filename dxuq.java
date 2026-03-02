import android.content.Context;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dxuq implements View.OnClickListener {
    public final dxus a;

    public dxuq(dxus dxus0) {
        this.a = dxus0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.n(hagp.e);
        du du0 = this.a.a;
        Context context0 = du0.getContext();
        gftb.check(context0);
        hjwt hjwt0 = this.a.f;
        hjqn hjqn0 = this.a.g;
        long v = this.a.h;
        ftej ftej0 = this.a.j;
        gtum gtum0 = this.a.e;
        Intent intent0 = new Intent("com.google.android.gms.payprocesspayment.view.VIEW_PROCESSPAYMENT_LOW_BALANCE_NOTIFICATION_SETTINGS").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("payment_method_id", hjwt0.toBytesArray()).putExtra("GOOGLE_PAYMENT_METHOD_ID", hjqn0.toBytesArray()).putExtra("issuer_partner_id", v).putExtra("process_payment_config", ftej0.toBytesArray());
        if(gtum0 == null) {
            gtum0 = gtum.a;
        }
        intent0.putExtra("smart_charge_settings", gtum0.toBytesArray());
        Context context1 = du0.getContext();
        gftb.check(context1);
        ((xob)context1).startActivityForResult(intent0, 0x3FD);
    }
}

