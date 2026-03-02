import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CallerVerificationRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.List;

public final class ahwl extends azts implements ahqg {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        ahwl.b = azss0;
        ahvz ahvz0 = new ahvz();
        ahwl.c = ahvz0;
        ahwl.a = new azta_api("Auth.Api.Identity.Internal.API", ahvz0, azss0);
    }

    public ahwl(Context context0, ahqf ahqf0) {
        super(context0, ahwl.a, ahqf0, aztr_settings.a);
    }

    @Override  // ahqg
    public final evql b(String s, String s1, String s2, String s3, InternalSignInCredentialWrapper internalSignInCredentialWrapper0, String s4, String s5, int v, String s6, List list0) {
        batl.q(s);
        batl.s(s1);
        batl.s(s2);
        batl.s(internalSignInCredentialWrapper0);
        if(s4 != null) {
            batl.s(s5);
        }
        azzc azzc0 = new azzc();
        azzc0.a = new ahvf(this, s, s1, s2, s3, internalSignInCredentialWrapper0, s4, s5, v, s6, list0);
        azzc0.d = 0x602;
        return this.iG(azzc0.a());
    }

    @Override  // ahqg
    public final evql c(String s, String s1) {
        batl.q(s1);
        azzc azzc0 = new azzc();
        azzc0.a = new ahvg(this, s, s1);
        azzc0.d = 0x67E;
        return this.iG(azzc0.a());
    }

    @Override  // ahqg
    public final evql d(Account account0, String s, String s1) {
        batl.s(account0);
        batl.q(s);
        batl.q(s1);
        azzc azzc0 = new azzc();
        azzc0.a = new ahvi(this, account0, s, s1);
        azzc0.d = 0x670;
        return this.iG(azzc0.a());
    }

    @Override  // ahqg
    public final evql e(CallerVerificationRequest callerVerificationRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ahuy(this, callerVerificationRequest0);
        azzc0.d = 0x6BD;
        return this.iG(azzc0.a());
    }

    @Override  // ahqg
    public final evql f(String s, BeginSignInRequest beginSignInRequest0, boolean z) {
        batl.q(s);
        azzc azzc0 = new azzc();
        azzc0.a = new ahur(this, s, beginSignInRequest0, z);
        azzc0.d = 0x601;
        return this.iG(azzc0.a());
    }

    @Override  // ahqg
    public final evql g(SavePasswordRequest savePasswordRequest0, List list0, String s) {
        batl.c(((boolean)(list0.isEmpty() ^ 1)), "At least 1 Account is required.");
        batl.q(s);
        azzc azzc0 = new azzc();
        azzc0.a = new ahuw(this, savePasswordRequest0, list0, s);
        azzc0.d = 0x608;
        return this.jn(azzc0.a());
    }

    @Override  // ahqg
    public final evql h(List list0, String s) {
        batl.s(list0);
        if(list0.size() < 2) {
            return evrg.d(gged_interceptors.i(list0));
        }
        azzc azzc0 = new azzc();
        azzc0.a = new ahvp(this, list0, s);
        azzc0.d = 1703;
        return this.jn(azzc0.a());
    }

    @Override  // ahqg
    public final evql i(CallerVerificationRequest callerVerificationRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ahvj(this, callerVerificationRequest0);
        azzc0.d = 0x6BE;
        return this.iG(azzc0.a());
    }

    @Override  // ahqg
    public final void j(Account account0) {
        batl.s(account0);
        azzc azzc0 = new azzc();
        azzc0.a = new ahva(this, account0);
        azzc0.d = 1702;
        this.jn(azzc0.a());
    }

    @Override  // ahqg
    public final void k(String s, Account account0, String s1, int v, String s2) {
        batl.q(s);
        batl.s(account0);
        batl.s(s1);
        azzc azzc0 = new azzc();
        azzc0.a = new ahuz(this, s1, s, account0, v, s2);
        azzc0.d = 0x603;
        this.iG(azzc0.a());
    }

    @Override  // ahqg
    public final void l(String s, String s1) {
        batl.q(s);
        batl.q(s1);
        azzc azzc0 = new azzc();
        azzc0.a = new ahuv(this, s, s1);
        azzc0.d = 0x60F;
        this.jn(azzc0.a());
    }

    @Override  // ahqg
    public final void m(String s, Account account0, String s1) {
        batl.q(s);
        batl.s(account0);
        batl.s(s1);
        azzc azzc0 = new azzc();
        azzc0.a = new ahux(this, s1, s, account0);
        azzc0.d = 0x604;
        this.iG(azzc0.a());
    }
}

