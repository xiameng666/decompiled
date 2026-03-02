import android.content.Context;
import android.content.Intent;

public final class duzi implements ibth {
    public final duzo a;
    public final gtxf b;
    public final hkas c;

    public duzi(duzo duzo0, gtxf gtxf0, hkas hkas0) {
        this.a = duzo0;
        this.b = gtxf0;
        this.c = hkas0;
    }

    @Override  // ibth
    public final Object a() {
        duzo duzo0 = this.a;
        Context context0 = duzo0.requireContext();
        byte[] arr_b = this.c.toBytesArray();
        dlnd dlnd0 = dvcm.a(duzo0.am());
        Intent intent0 = new Intent("com.google.android.gms.pay.pass.idcard.view.provisioning.VIEW_MDOC_PROVISIONING_FLOW").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("mdoc_type", ftqn.a(gtxf.class, this.b)).putExtra("id_card_issuer", arr_b);
        if(dlnd0 != null) {
            intent0.putExtra("INITIATION_SOURCE", dlnd0.E);
        }
        duzo0.startActivity(intent0);
        duzo0.ar();
        return ibom.a;
    }
}

