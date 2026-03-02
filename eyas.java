import android.security.keystore.KeyGenParameterSpec.Builder;
import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore.Entry;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.KeyStore;

public final class eyas {
    private final expe a;
    private final exyg b;
    private final bboh c;
    private final frli d;

    public eyas(expe expe0, frli frli0, exyg exyg0, bboh bboh0) {
        this.a = expe0;
        this.d = frli0;
        this.b = exyg0;
        this.c = bboh0;
    }

    public final Object a(ibrl ibrl0) {
        int v2;
        int v1;
        KeyStore.PrivateKeyEntry keyStore$PrivateKeyEntry0;
        eyar eyar0;
        if((ibrl0 instanceof eyar)) {
            eyar0 = (eyar)ibrl0;
            int v = eyar0.c;
            if((v & 0x80000000) == 0) {
                eyar0 = new eyar(this, ibrl0);
            }
            else {
                eyar0.c = v - 0x80000000;
            }
        }
        else {
            eyar0 = new eyar(this, ibrl0);
        }
        Object object0 = eyar0.a;
        Object object1 = ibrx.a;
        switch(eyar0.c) {
            case 0: {
                ibnx.b(object0);
                expe expe0 = this.a;
                try {
                    KeyStore.Entry keyStore$Entry0 = ((KeyStore)((expa)expe0).c.a()).getEntry("ActiveUnlockLockscreenValidityKeyAlias", null);
                    ibuq.d(keyStore$Entry0, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
                    keyStore$PrivateKeyEntry0 = (KeyStore.PrivateKeyEntry)keyStore$Entry0;
                    goto label_21;
                }
                catch(Exception exception0) {
                    try {
                        throw new expf("Unable to retrieve PrivateKeyEntry.", exception0, expd.i);
                    label_21:
                        ibuq.e(keyStore$PrivateKeyEntry0.getPrivateKey(), "getPrivateKey(...)");
                        v1 = 1;
                        goto label_38;
                    }
                    catch(expf expf0) {
                    }
                }
                a.ae(((expa)expe0).b.j(), "Failed to get private key for lock screen", expf0);
                try {
                    KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0 = new KeyGenParameterSpec.Builder("ActiveUnlockLockscreenValidityKeyAlias", 8);
                    keyGenParameterSpec$Builder0.setDigests(new String[]{"SHA-256", "SHA-512"});
                    keyGenParameterSpec$Builder0.setUserAuthenticationRequired(true);
                    keyGenParameterSpec$Builder0.setUserAuthenticationParameters(((int)expa.a.getSeconds()), 1);
                    KeyGenParameterSpec keyGenParameterSpec0 = keyGenParameterSpec$Builder0.build();
                    ibuq.e(keyGenParameterSpec0, "build(...)");
                    ((expa)expe0).c(keyGenParameterSpec0);
                    v1 = 2;
                }
                catch(expf expf1) {
                    a.ae(((expa)expe0).b.j(), "Failed to generate key for lockscreen", expf1);
                    v1 = 3;
                }
            label_38:
                if(v1 == 1) {
                    return ibom.a;
                }
                gmcd gmcd0 = this.d.a();
                ibuq.e(gmcd0, "getData(...)");
                eyar0.d = v1;
                eyar0.c = 1;
                Object object2 = icpu.c(gmcd0, eyar0);
                if(object2 != object1) {
                    v2 = v1;
                    object0 = object2;
                    goto label_50;
                }
                return object1;
            }
            case 1: {
                v2 = eyar0.d;
                ibnx.b(object0);
            label_50:
                if(((eygt)object0).b) {
                    ((ggtj)this.c.h()).x("Lockscreen invalidated");
                    eyar0.d = v2;
                    eyar0.c = 2;
                    if(this.b.k(eyar0) != object1) {
                        goto label_58;
                    }
                }
                else {
                    goto label_58;
                }
                return object1;
            }
            case 2: {
                v2 = eyar0.d;
                ibnx.b(object0);
            label_58:
                eyaq eyaq0 = new eyaq(new eyap(v2));
                gmcd gmcd1 = this.d.b(eyaq0, gmap.a);
                eyar0.d = 0;
                eyar0.c = 3;
                return icpu.c(gmcd1, eyar0) != object1 ? ibom.a : object1;
            }
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

