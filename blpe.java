import android.accounts.Account;
import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.credentialstore.KeyData;
import com.google.android.gms.fido.credentialstore.KeyMetadata;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.concurrent.Executor;

public final class blpe {
    public static final baun a;
    public static final bxoq b;
    public final bmco c;
    private final Context d;

    static {
        blpe.a = new baun("CredentialStore", new String[0]);
        blpe.b = new bxop(((gful_cronetEngineProvider)new bloy()));
    }

    public blpe(Context context0) {
        bmdz bmdz0 = new bmdz(context0);
        super();
        this.c = bmdz0;
        this.d = context0;
    }

    public final evql a(Executor executor0, Account account0, gfsx gfsx0, gfsx gfsx1) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmdo(((bmdz)this.c), executor0, account0, gfsx1);
        azzc0.d = 5431;
        azzc0.c = new Feature[]{blfo.e};
        azzd azzd0 = azzc0.a();
        return ((azts)this.c).iG(azzd0).c(new blpa());
    }

    public final evql b(Account account0, hery hery0) {
        batl.t(hery0, "passkey cannot be null");
        blpe.a.d("updatePasskey", new Object[0]);
        azzc azzc0 = new azzc();
        azzc0.a = new bmds(((bmdz)this.c), account0, hery0);
        azzc0.c = new Feature[]{blfo.f};
        azzc0.d = 5435;
        azzd azzd0 = azzc0.a();
        return ((azts)this.c).iG(azzd0);
    }

    // Detected as a lambda impl.
    public final gfsx c(KeyData keyData0) {
        blpj blpj0;
        if(keyData0 != null) {
            KeyMetadata keyMetadata0 = keyData0.k;
            if(keyMetadata0 == null || !keyMetadata0.d) {
                byte[] arr_b = keyData0.g;
                if(arr_b != null) {
                    byte[] arr_b1 = keyData0.h;
                    if(arr_b1 != null) {
                        new Pair(arr_b, arr_b1);
                    }
                }
                switch(keyData0.a.ordinal()) {
                    case 1: {
                        if(keyData0.b) {
                            gftb.check(keyData0.i);
                            return gfsx.m(new blph(this.d, keyData0.c, keyData0.i, keyData0.p, keyData0.k));
                        }
                        KeyPair keyPair0 = new KeyPair(keyData0.d, keyData0.e);
                        return gfsx.m(new blpk(this.c, keyData0.c, keyPair0, keyData0.f, keyData0.l));
                    }
                    case 0: 
                    case 2: {
                        try {
                            if(keyData0.b) {
                                gftb.check(keyData0.i);
                                blpj0 = new blpf(this.d, keyData0.c, keyData0.i);
                            }
                            else {
                                blpj0 = new blpj(this.d, keyData0.c, keyData0.f, keyData0.l);
                            }
                            return gfsx.m(blpj0);
                        }
                        catch(bxma bxma0) {
                            throw new gmdd(bxma0);
                        }
                    }
                    case 3: {
                        if(keyMetadata0 != null) {
                            gftb.check(keyData0.i);
                            return !hsvd.a.b().s() || !keyData0.l ? gfsx.m(new blpq(this.d, keyData0.c, keyData0.d, keyData0.m, keyData0.n, keyMetadata0, keyData0.i, false, keyData0.o)) : gfsx.m(new blpq(this.d, keyData0.c, keyData0.d, keyData0.m, keyData0.n, keyMetadata0, keyData0.i, true, keyData0.o));
                        }
                        break;
                    }
                    case 4: {
                        if(hstg.c()) {
                            gftb.check(keyData0.i);
                            return gfsx.m(new blov(this.d, keyData0.c, keyData0.i));
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unsupported key storage type: " + keyData0.a);
                    }
                }
            }
        }
        return gfqx.a;
    }

    public final gmcd d(String s, byte[] arr_b) {
        batl.r(s, "rpId cannot be empty");
        batl.t(arr_b, "keyHandle cannot be null");
        if(arr_b.length == 0) {
            return gmbu.i(gfqx.a);
        }
        String s1 = Arrays.toString(arr_b);
        blpe.a.d("getKey with rpId " + s + " with keyHandle " + s1, new Object[0]);
        azzc azzc0 = new azzc();
        azzc0.a = new bmdp(((bmdz)this.c), s, arr_b);
        azzc0.d = 5402;
        azzd azzd0 = azzc0.a();
        return glzd.f(fhra.b(((azts)this.c).iG(azzd0)), (KeyData keyData0) -> {
            blpj blpj0;
            if(keyData0 != null) {
                KeyMetadata keyMetadata0 = keyData0.k;
                if(keyMetadata0 == null || !keyMetadata0.d) {
                    byte[] arr_b = keyData0.g;
                    if(arr_b != null) {
                        byte[] arr_b1 = keyData0.h;
                        if(arr_b1 != null) {
                            new Pair(arr_b, arr_b1);
                        }
                    }
                    switch(keyData0.a.ordinal()) {
                        case 1: {
                            if(keyData0.b) {
                                gftb.check(keyData0.i);
                                return gfsx.m(new blph(this.d, keyData0.c, keyData0.i, keyData0.p, keyData0.k));
                            }
                            KeyPair keyPair0 = new KeyPair(keyData0.d, keyData0.e);
                            return gfsx.m(new blpk(this.c, keyData0.c, keyPair0, keyData0.f, keyData0.l));
                        }
                        case 0: 
                        case 2: {
                            try {
                                if(keyData0.b) {
                                    gftb.check(keyData0.i);
                                    blpj0 = new blpf(this.d, keyData0.c, keyData0.i);
                                }
                                else {
                                    blpj0 = new blpj(this.d, keyData0.c, keyData0.f, keyData0.l);
                                }
                                return gfsx.m(blpj0);
                            }
                            catch(bxma bxma0) {
                                throw new gmdd(bxma0);
                            }
                        }
                        case 3: {
                            if(keyMetadata0 != null) {
                                gftb.check(keyData0.i);
                                return !hsvd.a.b().s() || !keyData0.l ? gfsx.m(new blpq(this.d, keyData0.c, keyData0.d, keyData0.m, keyData0.n, keyMetadata0, keyData0.i, false, keyData0.o)) : gfsx.m(new blpq(this.d, keyData0.c, keyData0.d, keyData0.m, keyData0.n, keyMetadata0, keyData0.i, true, keyData0.o));
                            }
                            break;
                        }
                        case 4: {
                            if(hstg.c()) {
                                gftb.check(keyData0.i);
                                return gfsx.m(new blov(this.d, keyData0.c, keyData0.i));
                            }
                            break;
                        }
                        default: {
                            throw new IllegalStateException("Unsupported key storage type: " + keyData0.a);
                        }
                    }
                }
            }
            return gfqx.a;
        }, gmap.a);
    }

    public final gmcd e(String s) {
        batl.r(s, "rpId cannot be empty");
        blpe.a.d("listKeys with rpId " + s, new Object[0]);
        azzc azzc0 = new azzc();
        azzc0.a = new bmdm(((bmdz)this.c), s);
        azzc0.d = 5406;
        azzd azzd0 = azzc0.a();
        return glzd.f(fhra.b(((azts)this.c).iG(azzd0)), new blox(this), gmap.a);
    }
}

