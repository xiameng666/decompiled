import android.content.Context;
import android.os.Bundle;

public final class aad implements acl {
    public final aao a;

    public aad(aao aao0) {
        this.a = aao0;
    }

    @Override  // acl
    public final void a(Context context0) {
        aao aao0 = this.a;
        Bundle bundle0 = aao0.getSavedStateRegistry().a("android:support:activity-result");
        if(bundle0 != null) {
            aao0.h.d(bundle0);
        }
    }
}

