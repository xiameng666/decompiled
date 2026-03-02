import android.content.Context;
import android.content.Intent;

public final class dusl implements ibts {
    public final dusw a;
    public final gtxf b;

    public dusl(dusw dusw0, gtxf gtxf0) {
        this.a = dusw0;
        this.b = gtxf0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((hkas)object0), "selectedIssuer");
        dusw dusw0 = this.a;
        Context context0 = dusw0.requireContext();
        byte[] arr_b = ((hkas)object0).toBytesArray();
        dlnd dlnd0 = dvcm.a(dusw0.am());
        Intent intent0 = new Intent("com.google.android.gms.pay.pass.idcard.view.provisioning.valueprop.VIEW_ID_VALUE_PROP").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("mdoc_type", ftqn.a(gtxf.class, this.b)).putExtra("id_card_issuer", arr_b);
        if(dlnd0 != null) {
            intent0.putExtra("INITIATION_SOURCE", dlnd0.E);
        }
        dusw0.startActivity(intent0);
        dusw0.ar();
        return ibom.a;
    }
}

