import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;
import java.util.List;

public final class ercv implements Runnable {
    public final TargetQuickStartChimeraActivity a;
    public final List b;

    public ercv(TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0, List list0) {
        this.a = targetQuickStartChimeraActivity0;
        this.b = list0;
    }

    @Override
    public final void run() {
        Bundle bundle0 = new Bundle();
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a;
        String s = targetQuickStartChimeraActivity0.n;
        if(s != null) {
            bundle0.putString("theme", s);
        }
        for(Object object0: this.b) {
            Account account0 = (Account)object0;
            if(eqsh.s(targetQuickStartChimeraActivity0.getApplicationContext()) && bbmn.w(targetQuickStartChimeraActivity0.getApplicationContext(), account0.name)) {
                targetQuickStartChimeraActivity0.z = account0;
            }
            if(targetQuickStartChimeraActivity0.A.c(account0)) {
                eqlf eqlf0 = targetQuickStartChimeraActivity0.A;
                int v = 0;
                switch((targetQuickStartChimeraActivity0.H == null ? 0 : targetQuickStartChimeraActivity0.H.f)) {
                    case 3: {
                        v = 2;
                        break;
                    }
                    case 4: {
                        v = 1;
                    }
                }
                Intent intent0 = eqlf0.a(account0, bundle0, new ManagedAuthOptions(v, 4));
                if(intent0 != null) {
                    targetQuickStartChimeraActivity0.B.add(intent0);
                }
            }
        }
        targetQuickStartChimeraActivity0.runOnUiThread(new ercw(targetQuickStartChimeraActivity0));
    }
}

