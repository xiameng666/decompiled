import android.content.Intent;
import java.util.ArrayList;

public final class dwgq implements evqf {
    public final dwgt a;

    public dwgq(dwgt dwgt0) {
        this.a = dwgt0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Intent intent0;
        dwgt dwgt0 = this.a;
        dvkz dvkz0 = dwgt0.b;
        gftb.check(dvkz0);
        gged_interceptors gged0 = gged_interceptors.l(dvkz0.c);
        if(hwvf.g()) {
            intent0 = dlnf.h(gged0, ((gged_interceptors)object0), dwgt0.c, dwgt0.d, dwgt0.ag);
        }
        else {
            int v = dwgt0.d;
            boolean z = dwgt0.ag;
            intent0 = new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.add.VIEW_VALUABLE_ADD_DETECTED_PASS").setClassName("com.google.android.gms", "com.google.android.gms.pay.main.PayActivity").putParcelableArrayListExtra("DETECTED_PASS", new ArrayList(((gged_interceptors)object0))).putParcelableArrayListExtra("IMAGE_URIS", new ArrayList(gged0)).putExtra("USER_CREATED_PASS_ORIGIN", v).putExtra("UCP_RETURN_WHEN_COMPLETE", z);
        }
        dwgt0.startActivity(intent0.setFlags(0x4000000));
    }
}

