import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

public final class bece implements azys {
    public final CredentialManagerAccount a;
    public final CallerInfo b;

    public bece(CredentialManagerAccount credentialManagerAccount0, CallerInfo callerInfo0) {
        this.a = credentialManagerAccount0;
        this.b = callerInfo0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        beci beci0 = (beci)object0;
        ((becl)beci0.H()).a(new bdib(((evqp)object1)), new CredentialManagerInvocationParams(this.a, this.b), cclr.a(beci0.r));
    }
}

