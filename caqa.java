import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import java.util.List;

final class caqa extends ibsl implements ibtw {
    Object a;
    int b;
    final caqb c;

    public caqa(caqb caqb0, ibrl ibrl0) {
        this.c = caqb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((caqa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new caqa(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object1 = ibrx.a;
        boolean z = true;
        Object object2 = Boolean.valueOf(false);
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                object3 = new ComponentName("com.google.android.gms.supervision", "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
                this.a = object3;
                this.b = 1;
                object0 = this.c.d.b(this);
                if(object0 != object1) {
                    goto label_15;
                }
                break;
            }
            case 1: {
                object3 = this.a;
                ibnx.b(object0);
            label_15:
                if(((cbed)ibpo.T(((List)object0))) == null) {
                    ((ggtj)caqb.a.i()).x("Device should have a supervised account for transfer of ownership.");
                    return object2;
                }
                Object object4 = this.c.b.getSystemService("device_policy");
                DevicePolicyManager devicePolicyManager0 = (object4 instanceof DevicePolicyManager) ? ((DevicePolicyManager)object4) : null;
                ComponentName componentName0 = new ComponentName(this.c.b, "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
                if(devicePolicyManager0 == null) {
                    ((ggtj)caqb.a.i()).x("DevicePolicyManager is null, unable to transfer ownership.");
                    return object2;
                }
                try {
                    devicePolicyManager0.transferOwnership(componentName0, ((ComponentName)object3), null);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    a.ae(caqb.a.i(), "Supervision transfer failed.", illegalArgumentException0);
                    return object2;
                }
                catch(SecurityException securityException0) {
                    a.ae(caqb.a.i(), "Security exception during supervision transfer.", securityException0);
                    return object2;
                }
                this.a = null;
                this.b = 2;
                object0 = this.c.c.c(this);
                if(object0 != object1) {
                label_36:
                    if(object0 != cbfn.c) {
                        z = false;
                    }
                    if(!z) {
                        ((ggtj)caqb.a.j()).x("Transfer ownership failed. The current component is still the profile owner.");
                    }
                    return Boolean.valueOf(z);
                }
                break;
            }
            default: {
                ibnx.b(object0);
                goto label_36;
            }
        }
        return object1;
    }
}

