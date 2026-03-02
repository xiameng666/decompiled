import android.accounts.Account;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;

public final class ercr implements acn {
    public final TargetQuickStartChimeraActivity a;

    public ercr(TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0) {
        this.a = targetQuickStartChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        int v = ((ActivityResult)object0).a;
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a;
        if(eqsh.s(targetQuickStartChimeraActivity0.getApplicationContext()) && targetQuickStartChimeraActivity0.z != null && v != -1) {
            TargetQuickStartChimeraActivity.i.d("KidSetupActivity failed with error: %s, removing account.", new Object[]{v});
            cchj cchj0 = cchj.b(targetQuickStartChimeraActivity0);
            Account account0 = targetQuickStartChimeraActivity0.z;
            batl.s(account0);
            cchj0.m(account0);
            return;
        }
        targetQuickStartChimeraActivity0.t();
    }
}

