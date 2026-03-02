import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.wearable.node.PairingService.1;
import j..util.Objects;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class fdxz implements fduo, ffmj {
    public static final IntentFilter a;
    public final Context b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final BroadcastReceiver e;
    public final fdye f;
    private final SharedPreferences g;
    private final boolean h;
    private final gful_cronetEngineProvider i;
    private final gful_cronetEngineProvider j;

    static {
        fdxz.a = new IntentFilter("com.google.android.checkin.CHECKIN_COMPLETE");
    }

    public fdxz(Context context0, SharedPreferences sharedPreferences0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, fdye fdye0, boolean z) {
        this.c = new AtomicReference();
        this.d = new AtomicReference();
        this.e = new PairingService.1(this);
        this.b = context0;
        this.g = sharedPreferences0;
        this.i = gful0;
        this.j = gful1;
        this.f = fdye0;
        this.h = z;
    }

    public final String a() {
        return this.g.getBoolean("network_server_assigned", false) ? this.g.getString("network_id", null) : null;
    }

    public static String b(byte[] arr_b) {
        return Base64.encodeToString(arr_b, 3);
    }

    final KeyPair c() {
        try {
            KeyPair keyPair0 = this.i();
            if(keyPair0 == null) {
                KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("EC");
                keyPairGenerator0.initialize(new ECGenParameterSpec("secp256r1"));
                keyPair0 = keyPairGenerator0.generateKeyPair();
                byte[] arr_b = keyPair0.getPrivate().getEncoded();
                byte[] arr_b1 = keyPair0.getPublic().getEncoded();
                String s = keyPair0.getPrivate().getAlgorithm();
                this.g.edit().putString("private_key", new String(Base64.encode(arr_b, 3))).putString("public_key", new String(Base64.encode(arr_b1, 3))).putString("algorithm", s).commit();
            }
            return keyPair0;
        }
        catch(NoSuchAlgorithmException | InvalidAlgorithmParameterException exception0) {
            throw new IllegalStateException("error while creating keypair", exception0);
        }
    }

    public final void d() {
        if(this.h) {
            long v = (long)((fdru)this.i).b();
            if(Long.compare(v, 0L) != 0) {
                String s = ((fdrt)this.j).b();
                if(!TextUtils.isEmpty(s)) {
                    String s1 = this.f.a().a;
                    AtomicReference atomicReference0 = this.d;
                    fcez fcez0 = fdur.c(((fdvl)atomicReference0.get()), s1, "/pairing/public_key");
                    if(fcez0 != null && (!fcez0.u("androidId") || !s.equals(fcez0.d(s)))) {
                        fcez0 = null;
                    }
                    if(fcez0 == null) {
                        fcez fcez1 = new fcez();
                        PublicKey publicKey0 = this.c().getPublic();
                        fcez1.r("androidId", v);
                        fcez1.s("registrationId", s);
                        fcez1.k("encodedPublicKey", publicKey0.getEncoded());
                        fcez1.s("algorithm", publicKey0.getAlgorithm());
                        fdur.j(((fdvl)atomicReference0.get()), s1, "/pairing/public_key", fcez1);
                        if(Log.isLoggable("pairingservice", 2)) {
                            Log.v("pairingservice", "ensurePublicKeyDataItemWritten: wrote " + fcez1.toString());
                        }
                    }
                    else if(Log.isLoggable("pairingservice", 2)) {
                        Log.v("pairingservice", "ensurePublicKeyDataItemWritten: already written");
                    }
                }
                else if(Log.isLoggable("pairingservice", 3)) {
                    Log.d("pairingservice", a.u(v, "ensurePublicKeyDataItemWritten: not writing because GcmRegistrationId is not set for AndroidId: "));
                }
            }
            else if(Log.isLoggable("pairingservice", 3)) {
                Log.d("pairingservice", "ensurePublicKeyDataItemWritten: not writing because AndroidId is not set");
            }
        }
        else if(Log.isLoggable("pairingservice", 2)) {
            Log.v("pairingservice", "ensurePublicKeyDataItemWritten: not writing since this is not a watch");
        }
    }

    public final void f(fcez fcez0) {
        String s = fcez0.d("networkId");
        if(Log.isLoggable("pairingservice", 2)) {
            Log.v("pairingservice", "handleEnrolled: found enrolled dataItem for network " + s);
        }
        String s1 = this.a();
        if(gfta.c(s1)) {
            if(Log.isLoggable("pairingservice", 2)) {
                Log.v("pairingservice", "handleEnrolled: now enrolled to network " + s);
            }
            this.g(s);
            fdsh fdsh0 = (fdsh)this.c.get();
            fdsh0.i.f(4);
            fdsh0.v.d();
            fdsh0.i.f(2);
            return;
        }
        if(Log.isLoggable("pairingservice", 2)) {
            Log.v("pairingservice", a.a(s1, "handleEnrolled: already paired to network ", ", not doing anything"));
        }
    }

    public final void g(String s) {
        if(Log.isLoggable("pairingservice", 3)) {
            Log.d("pairingservice", "setIsPaired: paired to network " + s);
        }
        String s1 = this.a();
        this.g.edit().putString("network_id", s).apply();
        int v = TextUtils.isEmpty(s);
        this.g.edit().putBoolean("network_server_assigned", ((boolean)(v ^ 1))).apply();
        if(v != 0) {
            fdxw fdxw0 = new fdxw(this, this.f.a().a, s1);
            clhl.b.b(clhr.b).submit(fdxw0);
        }
    }

    public final void h(String s, String s1) {
        AtomicReference atomicReference0 = this.d;
        if(fdur.c(((fdvl)atomicReference0.get()), s1, "/enrolled") == null) {
            fcez fcez0 = new fcez();
            fcez0.s("networkId", s);
            fdur.j(((fdvl)atomicReference0.get()), s1, "/enrolled", fcez0);
        }
    }

    private final KeyPair i() {
        try {
            String s = this.g.getString("private_key", null);
            String s1 = this.g.getString("public_key", null);
            String s2 = this.g.getString("algorithm", null);
            if(s != null && s1 != null && s2 != null) {
                byte[] arr_b = Base64.decode(s, 3);
                byte[] arr_b1 = Base64.decode(s1, 3);
                KeyFactory keyFactory0 = KeyFactory.getInstance(s2);
                return new KeyPair(keyFactory0.generatePublic(new X509EncodedKeySpec(arr_b1)), keyFactory0.generatePrivate(new PKCS8EncodedKeySpec(arr_b)));
            }
        }
        catch(NoSuchAlgorithmException | InvalidKeySpecException unused_ex) {
            Log.e("pairingservice", "loadKeyPair: failed loading and parsing the keys");
        }
        return null;
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("network id: " + this.a());
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        String s = this.f.a().a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            if(hzyg.g() && Objects.equals(fduq0.b.b, "/enrolled") && Log.isLoggable("pairingservice", 4)) {
                Log.i("pairingservice", "onDataItemChanged encountered enroll marker: " + fduq0);
            }
            fcez fcez0 = fdur.b(fduq0, s, "/enrolled");
            if(fcez0 != null) {
                this.f(fcez0);
            }
            else if(!fduq0.c && fduq0.b.b.equals("/pairing/public_key")) {
                if(Log.isLoggable("pairingservice", 3)) {
                    Log.d("pairingservice", "onDataItemChanged: public key received for node " + fduq0.b.a);
                }
                fdsh fdsh0 = (fdsh)this.c.get();
                fdsh0.v.d();
                fdsh0.i.f(2);
            }
        }
    }
}

