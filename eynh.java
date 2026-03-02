import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.AuthenticationFragment;

public final class eynh extends ali {
    final AuthenticationFragment a;

    public eynh(AuthenticationFragment authenticationFragment0) {
        this.a = authenticationFragment0;
        super();
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        ibuq.f(charSequence0, "errString");
        ((ggtj)this.a.y().j()).H("Authentication error: %s: %s", v, charSequence0);
        xoc.b(this.a).finish();
    }

    @Override  // ali
    public final void b() {
        ((ggtj)this.a.y().h()).x("Authentication failure");
        xoc.b(this.a).finish();
    }

    @Override  // ali
    public final void c(alj alj0) {
        AuthenticationFragment authenticationFragment0 = this.a;
        ibts ibts0 = authenticationFragment0.c;
        if(ibts0 == null) {
            ibuq.j("getNavController");
            ibts0 = null;
        }
        ((nry)ibts0.a(authenticationFragment0)).l(authenticationFragment0.d, null, ntm.a(new eynf()));
    }
}

