import android.content.Context;
import android.content.Intent;

public final class dndt implements ibth {
    public final dndv a;
    public final Context b;

    public dndt(dndv dndv0, Context context0) {
        this.a = dndv0;
        this.b = context0;
    }

    @Override  // ibth
    public final Object a() {
        dxev dxev0 = this.a.e;
        Intent intent0 = new Intent("com.google.android.gms.pay.fops.details.VIEW_FOP_CARD_JP_TOKENIZE_VALUE_PROP").setClassName(this.b, "com.google.android.gms.pay.main.PayActivity").putExtra("PAYMENT_METHOD_DATA", dxev0.toBytesArray());
        this.a.a.startActivity(intent0);
        return ibom.a;
    }
}

