import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.android.Activity;
import java.util.List;

final class deud extends ibsl implements ibtw {
    Object a;
    int b;
    final Intent c;
    final dixi d;
    final Activity e;
    final gui f;

    public deud(Intent intent0, dixi dixi0, Activity activity0, gui gui0, ibrl ibrl0) {
        this.c = intent0;
        this.d = dixi0;
        this.e = activity0;
        this.f = gui0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deud)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new deud(this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        List list0;
        boolean z1;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            deco deco0 = devo.b(this.f).c;
            Intent intent0 = this.c;
            Object object3 = this.d;
            boolean z = false;
            if(intent0 == null) {
                z1 = false;
            }
            else {
                Bundle bundle0 = intent0.getExtras();
                z1 = bundle0 == null ? false : bundle0.getBoolean("is_for_send_surface", false);
            }
            if(intent0 != null) {
                z = intent0.hasExtra("direct_share_target_bytes");
            }
            if(ibpo.aB(ibpo.g(new String[]{"android.intent.action.SEND", "android.intent.action.SEND_MULTIPLE", "com.google.android.gms.nearby.SEND_FOLDER", "com.google.android.gms.SHARE_NEARBY"}), (intent0 == null ? null : intent0.getAction())) || z1 || z) {
                if(deco0 == deco.b) {
                    ((dixi)object3).a(dens.a);
                }
            }
            else if(deco0 == deco.a) {
                ((dixi)object3).a(denr.a);
            }
            Activity activity0 = this.e;
            if(activity0 == null) {
                list0 = ibps.a;
                object2 = object3;
            }
            else {
                this.a = object3;
                this.b = 1;
                object0 = devo.c(activity0, intent0, this);
                if(object0 == object1) {
                    return object1;
                }
                object2 = object3;
            label_33:
                list0 = (List)object0;
                if(list0 == null) {
                    list0 = ibps.a;
                    object2 = object2;
                    ((dixi)object2).a(new demw(list0));
                    return ibom.a;
                }
            }
        }
        else {
            object2 = this.a;
            ibnx.b(object0);
            goto label_33;
        }
        ((dixi)object2).a(new demw(list0));
        return ibom.a;
    }
}

