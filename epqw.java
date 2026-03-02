import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqw implements gfsi {
    public final ConsentChimeraActivity a;

    public epqw(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = ((gfsx)object0).i();
        ConsentChimeraActivity consentChimeraActivity0 = this.a;
        if(z) {
            String s = (String)((gfsx)object0).d();
            consentChimeraActivity0.t = new ConsentResult(ajpt.c, ajol.b, s);
            return gfsx.m(Integer.valueOf(400));
        }
        ConsentChimeraActivity.p(new eprh());
        consentChimeraActivity0.a(4, "");
        return gfqx.a;
    }
}

