import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class duwd implements acn {
    public final duwt a;

    public duwd(duwt duwt0) {
        this.a = duwt0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        Intent intent0 = ((ActivityResult)object0).b;
        duwt duwt0 = this.a;
        if(intent0 == null) {
            duwt0.startActivity(dlnf.Y(duwt0.requireContext(), String.valueOf(hajr.a(5))));
            duwt0.ar();
            return;
        }
        gfsx gfsx0 = dtzg.b(intent0);
        boolean z = dtzg.d(intent0);
        gtxb gtxb0 = dtzg.c(intent0);
        dttm dttm0 = null;
        if(!z && gfsx0.i()) {
            Object object1 = gfsx0.d();
            duyb duyb0 = duwt0.z();
            ibuq.c(gtxb0);
            ibuq.f(gtxb0, "status");
            duxl duxl0 = new duxl();
            duxm duxm0 = new duxm();
            duyb0.d.f(((ProvisioningId)object1), gtxb0, duxl0, duxm0);
            dttm dttm1 = duwt0.d;
            if(dttm1 == null) {
                ibuq.j("contentRefreshTaskOperation");
            }
            else {
                dttm0 = dttm1;
            }
            dttm0.b(duwt0.requireContext());
            if(hwmp.a.l().N()) {
                Context context0 = duwt0.requireContext();
                duwt0.startActivity(new Intent("com.google.android.gms.pay.pass.idcard.view.provisioning.VIEW_ID_PROVISIONING_STATUS").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("mdoc_provisioning_id", ((ProvisioningId)object1).a).putExtra("mdoc_type", ftqn.a(gtxf.class, gtxf.e)));
            }
            else {
                duwt0.startActivity(dlnf.Z(duwt0.requireContext(), ((ProvisioningId)object1).a, gtxf.e));
            }
            duwt0.ar();
            return;
        }
        if(gfsx0.i()) {
            duyb duyb1 = duwt0.z();
            Object object2 = gfsx0.d();
            icck icck0 = lsc.a(duyb1);
            duxo duxo0 = new duxo(duyb1, ((ProvisioningId)object2), null);
            icbb.b(icck0, cclw.d, null, duxo0, 2);
        }
        duwt0.ar();
    }
}

