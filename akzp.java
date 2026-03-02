import android.content.Context;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;

public final class akzp implements akty {
    RemoteDevice a;
    public byte[] b;
    private static final baun c;
    private final List d;
    private final cchj e;
    private final ajes f;
    private final hhsp g;

    static {
        akzp.c = new baun("ProximityAuth", new String[]{"ResponderAuthenticator"});
    }

    public akzp(Context context0, List list0) {
        hhsp hhsp0 = new hhsp();
        cchj cchj0 = cchj.b(context0);
        ajes ajes0 = new ajes(context0);
        super();
        this.g = hhsp0;
        this.d = list0;
        this.e = cchj0;
        this.f = ajes0;
    }

    @Override  // akty
    public final alaa a(byte[] arr_b, String s) {
        this.g(hhso.c);
        akzp.c.h("Encrypting %s bytes to send to remote device.", new Object[]{((int)arr_b.length)});
        gftb.check(arr_b);
        hhso hhso0 = this.g.a;
        gftb.u(hhso0 == hhso.c, "wrong state: %s", hhso0);
        return new alaa(this.g.b.k(arr_b), s);
    }

    @Override  // akty
    public final byte[] b(alaa alaa0) {
        akzp.c.h("Decrypting %s bytes received from remote device.", new Object[]{((int)alaa0.a.length)});
        this.g(hhso.c);
        try {
            hhso hhso0 = this.g.a;
            gftb.u(hhso0 == hhso.c, "wrong state: %s", hhso0);
            return this.g.b.j(alaa0.a);
        }
        catch(SignatureException signatureException0) {
            throw new akyq("Error when decoding the message.", signatureException0);
        }
    }

    public final alaa c(alaa alaa0) {
        boolean z = false;
        akzp.c.h("Handling [Initiator Hello] from remote device.", new Object[0]);
        this.g(hhso.a);
        this.a = this.f(alaa0.a);
        hhsp hhsp0 = this.g;
        hhso hhso0 = hhsp0.a;
        if(hhso0 == hhso.b) {
            z = true;
        }
        gftb.u(z, "wrong state: %s", hhso0);
        this.b = hhsp0.c;
        return new alaa(hhsp0.c, "auth");
    }

    public final void d(alaa alaa0) {
        akzp.c.h("Handling [Initiator Auth] from remote device.", new Object[0]);
        this.g(hhso.b);
        try {
            this.g.c(alaa0.a);
        }
        catch(SignatureException | hhti exception0) {
            throw new akyq("Error when finishing initialization of the secure channel.", exception0);
        }
    }

    public final boolean e() {
        return this.g.a != hhso.a;
    }

    private final RemoteDevice f(byte[] arr_b) {
        List list0 = this.d;
        if(!list0.isEmpty()) {
            try {
                hhsp hhsp0 = this.g;
                ArrayList arrayList0 = new ArrayList(list0.size());
                for(Object object0: list0) {
                    RemoteDevice remoteDevice0 = (RemoteDevice)object0;
                    byte[] arr_b1 = akxa.a(AppContextProvider.a(), remoteDevice0.e);
                    if(arr_b1 == null) {
                        akzp.c.m("Skipping secret key for %s since key is null.", new Object[]{remoteDevice0.b});
                    }
                    else {
                        arrayList0.add(new SecretKeySpec(arr_b1, "AES"));
                    }
                }
                batl.b(arr_b.length > 0);
                int v = hhsp0.b(arr_b, arrayList0, akzo.a(this.e, this.f, arr_b));
                if(v < 0) {
                    akzp.c.m("No authorized devices can be found for current connection.", new Object[0]);
                    return null;
                }
                return (RemoteDevice)list0.get(v);
            }
            catch(NoSuchAlgorithmException | SignatureException | hhti exception0) {
                throw new akyq("Error when initializing the secure channel.", exception0);
            }
        }
        throw new akyq("No authorized devices were found.");
    }

    private final void g(hhso hhso0) {
        hhso hhso1 = this.g.a;
        if(hhso1 == hhso0) {
            return;
        }
        throw new akyq(String.format("Expected state %s, but in current state %s", hhso0, hhso1));
    }
}

