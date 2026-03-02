import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class eprk implements gful_cronetEngineProvider {
    public final ConsentChimeraActivity a;

    public eprk(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Object object0 = new gmcu();
        cchj cchj0 = cchj.b(this.a);
        Account account0 = this.a.q.a();
        Activity activity0 = this.a.getContainerActivity();
        cchj0.z(account0, this.a.q.a, Bundle.EMPTY, activity0, new epre(this.a, ((gmcu)object0)));
        return object0;
    }
}

