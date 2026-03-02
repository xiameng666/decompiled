import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.List;

public final class ahqh {
    protected final Account a;
    protected final SignInCredential b;
    public List c;
    public boolean d;
    protected boolean e;
    public long f;
    public boolean g;
    public long h;
    public String i;
    public boolean j;
    public Intent k;

    protected ahqh(Account account0, SignInCredential signInCredential0) {
        this.a = account0;
        this.b = signInCredential0;
        this.c = ggna.a;
        this.d = false;
        this.e = false;
        this.f = 0L;
        this.g = false;
        this.h = 0L;
        this.i = null;
        this.j = false;
        this.k = null;
    }

    public ahqh(Account account0, SignInCredential signInCredential0, byte[] arr_b) {
        this(account0, signInCredential0);
        batl.c(TextUtils.isEmpty(signInCredential0.f), "Google account credentials must not contain a password");
    }

    public ahqh(Account account0, SignInCredential signInCredential0, char[] arr_c) {
        this(account0, signInCredential0);
        batl.c(TextUtils.isEmpty(signInCredential0.f), "Linked third-party account credentials must not contain a password");
        this.e = true;
    }

    public ahqh(Account account0, SignInCredential signInCredential0, short[] arr_v) {
        this(account0, signInCredential0);
        batl.c(((boolean)(TextUtils.isEmpty(signInCredential0.f) ^ 1)), "Password credentials must contain a non-empty password");
        batl.c(TextUtils.isEmpty(signInCredential0.g), "Password credentials must not contain a Google ID token");
    }

    public final InternalSignInCredentialWrapper a() {
        return new InternalSignInCredentialWrapper(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final void b(List list0) {
        this.c = gged_interceptors.i(list0);
    }
}

