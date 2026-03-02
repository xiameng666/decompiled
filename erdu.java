import android.content.Context;
import android.os.Bundle;

public final class erdu implements fs {
    public final ered a;

    public erdu(ered ered0) {
        this.a = ered0;
    }

    @Override  // fs
    public final void a(String s, Bundle bundle0) {
        ered ered0 = this.a;
        boolean z = bundle0.getBoolean("should_retry_user_verification");
        Context context0 = ered0.getContext();
        batl.s(context0);
        if(z) {
            if(hyis.B()) {
                ered0.A(context0, ered0.ai);
                return;
            }
            if(ered0.D()) {
                ered0.B(context0);
                return;
            }
            ered.z(context0, ered0.ah);
            return;
        }
        ered.d.h("User verification cancelled by user.", new Object[0]);
        ered0.ag.C(1);
    }
}

