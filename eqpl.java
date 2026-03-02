import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import java.util.List;

public final class eqpl implements Runnable {
    public final TargetChimeraActivity a;
    public final List b;
    public final Bundle c;

    public eqpl(TargetChimeraActivity targetChimeraActivity0, List list0, Bundle bundle0) {
        this.a = targetChimeraActivity0;
        this.b = list0;
        this.c = bundle0;
    }

    @Override
    public final void run() {
        Bundle bundle0 = new Bundle();
        TargetChimeraActivity targetChimeraActivity0 = this.a;
        bundle0.putString("theme", targetChimeraActivity0.i);
        for(Object object0: this.b) {
            Account account0 = (Account)object0;
            if(eqsh.s(targetChimeraActivity0.getApplicationContext()) && bbmn.w(targetChimeraActivity0.getApplicationContext(), account0.name)) {
                targetChimeraActivity0.q = account0;
            }
            if(targetChimeraActivity0.p.c(account0)) {
                eqlf eqlf0 = targetChimeraActivity0.p;
                boolean z = targetChimeraActivity0.m;
                int v = targetChimeraActivity0.s == null ? 0 : targetChimeraActivity0.s.f;
                int v1 = 4;
                if(v == 3) {
                    z = false;
                }
                else if(v == 4) {
                    z = true;
                }
                if(!targetChimeraActivity0.t()) {
                    v1 = 3;
                }
                Intent intent0 = eqlf0.a(account0, bundle0, new ManagedAuthOptions(((int)z), v1));
                if(intent0 != null) {
                    targetChimeraActivity0.k.add(intent0);
                }
            }
        }
        targetChimeraActivity0.runOnUiThread(new eqpk(targetChimeraActivity0, this.c));
        targetChimeraActivity0.o = null;
    }
}

