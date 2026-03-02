import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.activity.result.ActivityResult;
import com.android.onboarding.contracts.annotations.OnboardingNode;
import com.android.onboarding.utils.persistable.PersistableIntent;
import java.util.ArrayList;
import java.util.List;

@OnboardingNode(c = @rka(b = rjz.f), e = "com.google.android.gms/auth", f = "TargetFallback")
public final class fncy extends rjr {
    @Override  // rjr
    public final Object d(Intent intent0) {
        ibuq.f(intent0, "intent");
        ibuq.f(intent0, "intent");
        List list0 = sde.b(new PersistableIntent(intent0).a, "accounts", fncv.a);
        if(list0 != null) {
            return new fncw(ibpo.ag(list0));
        }
        throw new IllegalArgumentException("Missing persistableAccounts");
    }

    @Override  // rjr
    public final Intent e(Context context0, Object object0) {
        fncw fncw0 = (fncw)object0;
        ibuq.f(context0, "context");
        ibuq.f(fncw0, "arg");
        ComponentName componentName0 = new ComponentName(context0, "com.google.android.gms.smartdevice.quickstart.ui.TargetFallbackActivity");
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sde.d(persistableBundle0, "accounts", fncw0.a);
        return new PersistableIntent(null, persistableBundle0, null, componentName0, null, 0xEB).b();
    }

    @Override  // rjr
    public final Object k(ActivityResult activityResult0) {
        ibuq.f(activityResult0, "result");
        int v = activityResult0.a;
        ArrayList arrayList0 = null;
        switch(v) {
            case -1: {
                Intent intent0 = activityResult0.b;
                if(intent0 != null) {
                    arrayList0 = intent0.getStringArrayListExtra("accounts");
                }
                return new fncx(-1, arrayList0);
            }
            case 0: {
                return new fncx(0, null);
            }
            default: {
                throw new IllegalArgumentException("Invalid result code " + v);
            }
        }
    }
}

