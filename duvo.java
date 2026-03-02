import android.content.Intent;
import com.google.android.gms.pay.pass.idcard.view.provisioning.push.IdPushProvisioningChimeraActivity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class duvo implements ibts {
    public final IdPushProvisioningChimeraActivity a;

    public duvo(IdPushProvisioningChimeraActivity idPushProvisioningChimeraActivity0) {
        this.a = idPushProvisioningChimeraActivity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        IdPushProvisioningChimeraActivity idPushProvisioningChimeraActivity0 = this.a;
        if(((AccountInfo)object0) == null) {
            String[] arr_s = bbmn.y(bbmn.h(idPushProvisioningChimeraActivity0, "com.google.android.gms"));
            if(arr_s.length == 0) {
                if(hwdx.f() && !idPushProvisioningChimeraActivity0.k) {
                    idPushProvisioningChimeraActivity0.k = true;
                    idPushProvisioningChimeraActivity0.startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS").putExtra("account_types", new String[]{"com.google"}));
                    return ibom.a;
                }
                idPushProvisioningChimeraActivity0.a(new Exception("No accounts available"));
                return ibom.a;
            }
            idPushProvisioningChimeraActivity0.b(((String)ibpg.D(arr_s)));
            return ibom.a;
        }
        if(((Boolean)((AccountInfo)object0).b().e(((gful_cronetEngineProvider)new duvu()))).booleanValue()) {
            idPushProvisioningChimeraActivity0.a(new Exception("Push provisioning not available for a supervised child account"));
            return ibom.a;
        }
        if(idPushProvisioningChimeraActivity0.j == null) {
            boolean z = ((Boolean)((AccountInfo)object0).b().f(Boolean.valueOf(false))).booleanValue();
            idPushProvisioningChimeraActivity0.j = dolo.a(new dola(((AccountInfo)object0).b, ((AccountInfo)object0).a, z));
        }
        idPushProvisioningChimeraActivity0.g();
        return ibom.a;
    }
}

