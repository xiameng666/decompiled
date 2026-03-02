import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public class bxrz {
    private static final bxrs a;
    protected final bxtm c;
    protected gful_cronetEngineProvider d;
    protected final List e;
    public final List f;
    public String g;
    public glzm h;

    static {
        bxrz.a = new bxrs(((gful_cronetEngineProvider)new bxry()));
    }

    public bxrz() {
        this("BeginSignInOperation");
    }

    protected bxrz(bxtm bxtm0) {
        this(bxtm0, "Unnamed adapted operation");
    }

    protected bxrz(bxtm bxtm0, String s) {
        this.c = bxtm0;
        this.g = s;
        Objects.requireNonNull(bxrz.a);
        this.d = new bxrx(bxrz.a);
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public bxrz(bxtm bxtm0, byte[] arr_b) {
        this(bxtm0);
    }

    public bxrz(String s) {
        this(new ahfs(), s);
    }

    protected final bxtn A() {
        glzm glzm0 = this.h;
        Object object0 = this.d.mr();
        return this.c.a(glzm0, ((gmcg)object0), this.e, this.f);
    }

    public final bxtn B(glzm glzm0) {
        this.aq(glzm0);
        Object object0 = this.d.mr();
        return this.c.a(glzm0, ((gmcg)object0), this.e, this.f);
    }

    public static gmcg C() {
        return (gmcg)bxrz.a.mr();
    }

    public final void D(bxmg bxmg0) {
        this.f.add(bxmg0);
    }

    public final void E(bxsf bxsf0) {
        this.e.add(bxsf0);
    }

    public final void F(bbcu bbcu0, bxme bxme0, gfsi gfsi0, bxsb bxsb0) {
        this.E(new bxsd(bbcu0, bxme0, gfsi0, bxsb0));
    }

    public final void G(bbcu bbcu0, bxme bxme0, gfsi gfsi0, bxsc bxsc0) {
        this.E(new bxsd(bbcu0, bxme0, gfsi0, new bxsa(bxsc0)));
    }

    public final void H(bboh bboh0) {
        this.E(new bxsh(bboh0));
    }

    public final void I(bboh bboh0) {
        this.E(new bxsi(bboh0));
    }

    public final void J(bxnj bxnj0, String s, bxod bxod0, bxme bxme0) {
        this.E(new bxse(bxnj0, s, bxod0, bxme0));
    }

    public final void K(bboh bboh0) {
        this.E(new bxsj(bboh0));
    }

    public final ahfp L(String s, String s1, ClearTokenRequest clearTokenRequest0) {
        return (ahfp)this.B(new aejn(s, s1, clearTokenRequest0));
    }

    public final ahfp M(boolean z, boolean z1, String s, String s1) {
        return (ahfp)this.B(new aeos(z, z1, s, s1));
    }

    public final ahfp N() {
        return (ahfp)this.B(new aepg());
    }

    public final ahfp O(List list0) {
        return (ahfp)this.B(new aepq(list0));
    }

    public final ahfp P(aepy aepy0) {
        return (ahfp)this.B(new aeqd(aepy0));
    }

    public final ahfp Q(SavePasswordRequest savePasswordRequest0, String s, String s1, bxod bxod0, String s2) {
        return (ahfp)this.B(new aesd(savePasswordRequest0, s, s1, bxod0, s2));
    }

    public final ahfp R(kvx kvx0) {
        return (ahfp)this.B(new afbs(kvx0));
    }

    public final ahfp S(Bundle bundle0) {
        return (ahfp)this.B(new afbw(bundle0));
    }

    public final ahfp T(Account account0, String s, int v, String s1, List list0) {
        return (ahfp)this.B(new aglc(account0, s, v, s1, list0));
    }

    public final ahfp U(String s, BeginSignInRequest beginSignInRequest0, boolean z, String s1) {
        return (ahfp)this.B(new agol(s, beginSignInRequest0, z, s1));
    }

    public final ahfp V(String s, boolean z) {
        return (ahfp)this.B(new agpc(s, z));
    }

    public final ahfp W(agrg agrg0) {
        return (ahfp)this.B(new agrh(agrg0));
    }

    public final ahfp X(Account account0, gqlo gqlo0) {
        return (ahfp)this.B(new agyi(account0, gqlo0));
    }

    public final ahfp Y(String s, List list0) {
        return (ahfp)this.B(new agyq(s, list0));
    }

    public final ahfp Z(Account account0, CallingAppInfoCompat callingAppInfoCompat0, boolean z, boolean z1) {
        return (ahfp)this.B(new agyu(account0, callingAppInfoCompat0, z, z1));
    }

    public final ahfp aa(agzp agzp0) {
        return (ahfp)this.B(new agzq(agzp0));
    }

    public final ahfp ab(Account account0, gfsi gfsi0) {
        return (ahfp)this.B(new aepl(account0, gfsi0));
    }

    public final ahfp ac(String s, String s1, List list0) {
        return (ahfp)this.B(new agnu(s, s1, list0));
    }

    public final void ad(String s, bxjk bxjk0) {
        this.E(new bxsm(s, bxjk0));
    }

    public final void ae(boolean z) {
        this.E(new bxsn(z));
    }

    public final void af(bbcu bbcu0) {
        this.E(new bxsl(bbcu0, this.g));
    }

    public final bxrz ag(bbcu bbcu0) {
        this.am(bboh.c("Auth.Api.Credentials", bbcu0, this.g));
        return this;
    }

    public final bxrz ah(bbcu bbcu0) {
        this.ao("Auth.Api.Credentials", bbcu0);
        return this;
    }

    public final void ai(bxsb bxsb0) {
        ahfr ahfr0 = new ahfr();
        this.F(bbcu.cF, ahft.a, ahfr0, bxsb0);
    }

    public final void aj(bxsc bxsc0) {
        ahfr ahfr0 = new ahfr();
        this.G(bbcu.cF, ahft.a, ahfr0, bxsc0);
    }

    public final void ak(bbcu bbcu0, bxsb bxsb0) {
        ahfq ahfq0 = new ahfq();
        this.F(bbcu0, ahft.a, ahfq0, bxsb0);
    }

    public final void al(bbcu bbcu0, bxsc bxsc0) {
        ahfq ahfq0 = new ahfq();
        this.G(bbcu0, ahft.a, ahfq0, bxsc0);
    }

    public final void am(bboh bboh0) {
        this.K(bboh0);
        this.E(new bxsk(bboh0));
        this.I(bboh0);
        this.H(bboh0);
    }

    public final void an(bbcu bbcu0) {
        this.H(bboh.c("Auth.Api.Credentials", bbcu0, this.g));
    }

    public final void ao(String s, bbcu bbcu0) {
        this.I(bboh.c(s, bbcu0, this.g));
    }

    public final void ap(bxnj bxnj0, String s) {
        this.J(bxnj0, s, bxoc.a(AppContextProvider.a(), null), ahft.a);
    }

    protected bxrz aq(glzm glzm0) {
        this.h = glzm0;
        return this;
    }

    public ahfp ar(String s) {
        return (ahfp)this.B(new adxo(s));
    }
}

