import androidx.activity.result.ActivityResult;
import com.google.android.gms.identitycredentials.ui.CredentialSelectorChimeraActivity;

public final class bygo implements ibts {
    public final CredentialSelectorChimeraActivity a;

    public bygo(CredentialSelectorChimeraActivity credentialSelectorChimeraActivity0) {
        this.a = credentialSelectorChimeraActivity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        ibuq.f(activityResult0, "it");
        this.a.a().j(new bxzy(activityResult0.a, activityResult0.b), false);
        return ibom.a;
    }
}

