import android.content.Intent;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqh implements gfsi {
    public final ConsentChimeraActivity a;

    public epqh(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ConsentChimeraActivity consentChimeraActivity0 = this.a;
        if(((bxki)object0).a == -1) {
            Intent intent0 = ((bxki)object0).b;
            String s = ConsentResult.a;
            if(intent0.hasExtra(s)) {
                intent0.setExtrasClassLoader(ConsentResult.class.getClassLoader());
                consentChimeraActivity0.t = (ConsentResult)intent0.getParcelableExtra(s);
                return gfsx.m(Integer.valueOf(400));
            }
            if(intent0.hasExtra("consent")) {
                String s1 = intent0.getStringExtra("consent");
                gftb.check(s1);
                ajol ajol0 = ajol.a(s1);
                consentChimeraActivity0.t = new ConsentResult((ajol0 == ajol.b ? ajpt.c : ajpt.A), null, null, ajol0, consentChimeraActivity0.q.p);
                return gfsx.m(Integer.valueOf(400));
            }
            String s2 = intent0.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.consent");
            gftb.check(s2);
            ajol ajol1 = ajol.a(s2);
            FACLConfig fACLConfig0 = (FACLConfig)intent0.getParcelableExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.facl");
            consentChimeraActivity0.t = new ConsentResult((ajol1 == ajol.b ? ajpt.c : ajpt.A), intent0.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.pacl"), fACLConfig0, ajol1, consentChimeraActivity0.q.p);
            return gfsx.m(Integer.valueOf(400));
        }
        consentChimeraActivity0.a(4, "");
        return gfqx.a;
    }
}

