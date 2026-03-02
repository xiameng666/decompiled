import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

public final class bgoo implements azys {
    public final CredentialManagerAccount a;
    public final int b;

    public bgoo(CredentialManagerAccount credentialManagerAccount0, int v) {
        this.a = credentialManagerAccount0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bgos bgos0 = (bgos)object0;
        bgol bgol0 = (bgol)bgos0.H();
        bdib bdib0 = new bdib(((evqp)object1));
        CredentialManagerInvocationParams credentialManagerInvocationParams0 = new CredentialManagerInvocationParams(this.a, null);
        ApiMetadata apiMetadata0 = cclr.a(bgos0.r);
        bgol0.b(bdib0, credentialManagerInvocationParams0, this.b, apiMetadata0);
    }
}

