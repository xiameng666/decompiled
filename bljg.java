import android.accounts.Account;
import android.content.Context;
import android.util.Pair;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;
import com.google.android.gms.fido.credentialstore.KeyData;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class bljg extends cjtm {
    public final gfsx a;
    public final bmde b;
    private static final bxos c;
    private final bnba d;
    private final bljz e;
    private final KeyCreationRequestOptions f;
    private final azts g;

    static {
        bnaa.d("GenerateKeyOperation");
        bljg.c = (bxos)bxos.a.b();
    }

    public bljg(bmde bmde0, KeyCreationRequestOptions keyCreationRequestOptions0, azug azug0) {
        super(0xD6, "GenerateKey", azug0);
        this.b = bmde0;
        this.f = keyCreationRequestOptions0;
        this.d = (bnba)bnba.e.b();
        this.a = (gfsx)blir.b.b();
        this.e = new bljz(AppContextProvider.a());
        this.g = (azts)bljx.a.b();
    }

    private static KeyPair b() {
        try {
            ECGenParameterSpec eCGenParameterSpec0 = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("EC");
            keyPairGenerator0.initialize(eCGenParameterSpec0);
            return keyPairGenerator0.generateKeyPair();
        }
        catch(NoSuchAlgorithmException | InvalidAlgorithmParameterException exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Failed to generate key pair for software key";
            throw bxly0.a();
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ProtoLiteBuilder hftp1;
        SharedKey sharedKey0;
        evql evql0;
        bmcs bmcs1;
        bmcs bmcs2;
        try {
            KeyCreationRequestOptions keyCreationRequestOptions0 = this.f;
            String s = keyCreationRequestOptions0.a;
            bmcs bmcs0 = bmcs.a(keyCreationRequestOptions0.c);
            gftb.z(s, "rpId cannot be null");
            gftb.b(((boolean)(s.trim().isEmpty() ^ 1)), "rpId cannot be empty");
            int v = bmcs0.f;
            boolean z = keyCreationRequestOptions0.b;
            if(z && bmcs0 != bmcs.d) {
                bxly bxly0 = new bxly();
                bxly0.a = 8;
                bxly0.b = "Discoverable credentials must be SYNCED";
                throw bxly0.a();
            }
            int[] arr_v = keyCreationRequestOptions0.d;
            if(arr_v != null) {
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= arr_v.length) {
                        bxly bxly1 = new bxly();
                        bxly1.a = 8;
                        bxly1.b = "No supported algorithm";
                        throw bxly1.a();
                    }
                    if(arr_v[v1] == -7) {
                        break;
                    }
                }
            }
            byte[] arr_b = new byte[0x20];
            new SecureRandom().nextBytes(arr_b);
            gftb.z(bmcs0, "keyStorageType cannot be null");
            gftb.z(s, "rpId cannot be null");
            String s1 = gfss.d('.').g(Integer.valueOf(v), ghjc.d.o(arr_b), new Object[]{s});
            switch(bmcs0.ordinal()) {
                case 1: {
                    KeyPair keyPair0 = bljg.b();
                    PublicKey publicKey1 = keyPair0.getPublic();
                    batl.r(s1, "keyStorageIdentifier cannot be empty");
                    batl.t(publicKey1, "publicKey cannot be null");
                    String s3 = s1.substring(2);
                    try {
                        bmcs2 = bmcs.a(Character.getNumericValue(s1.charAt(0)));
                    }
                    catch(IllegalArgumentException illegalArgumentException1) {
                        bxly bxly4 = new bxly();
                        bxly4.a = 8;
                        bxly4.c = illegalArgumentException1;
                        bxly4.b = "Unable to extract valid keyStorageType from keyStorageIdentifier";
                        throw bxly4.a();
                    }
                    gfsx gfsx0 = gfsx.m(keyPair0);
                    this.d.h(s1, new Date(System.currentTimeMillis()), gfsx0, keyCreationRequestOptions0.i);
                    evql0 = evrg.d(KeyData.d(bljv.b(bmcs2, ghjc.d.q(s3.substring(0, s3.indexOf(".") - 1)), bljv.a(s3.substring(s3.indexOf(".") + 1), publicKey1)), keyPair0, s1, null, null, keyCreationRequestOptions0.i));
                    evql0.z(new bljb(this));
                    return;
                }
                case 0: 
                case 2: {
                    this.e.b(s1, bmcs0);
                    PublicKey publicKey0 = bljz.e(s1);
                    if(publicKey0 == null) {
                        bxly bxly2 = new bxly();
                        bxly2.a = 8;
                        bxly2.b = "Failed to get public key from Android keystore";
                        throw bxly2.a();
                    }
                    batl.r(s1, "keyStorageIdentifier cannot be empty");
                    String s2 = s1.substring(2);
                    try {
                        bmcs1 = bmcs.a(Character.getNumericValue(s1.charAt(0)));
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        bxly bxly3 = new bxly();
                        bxly3.a = 8;
                        bxly3.c = illegalArgumentException0;
                        bxly3.b = "Unable to extract valid keyStorageType from keyStorageIdentifier";
                        throw bxly3.a();
                    }
                    this.d.h(s1, new Date(System.currentTimeMillis()), gfqx.a, keyCreationRequestOptions0.i);
                    evql0 = evrg.d(KeyData.c(bmcs0.f, bljv.b(bmcs1, ghjc.d.q(s2.substring(0, s2.indexOf(".") - 1)), bljv.a(s2.substring(s2.indexOf(".") + 1), publicKey0)), s1, null, null, keyCreationRequestOptions0.i));
                    evql0.z(new bljb(this));
                    return;
                }
                case 3: {
                    if(!this.a.i()) {
                        throw new UnsupportedOperationException("Feature disabled");
                    }
                    if(!z) {
                        bxly bxly5 = new bxly();
                        bxly5.a = 8;
                        bxly5.b = "SYNCED keys must be discoverable";
                        throw bxly5.a();
                    }
                    byte[] arr_b1 = keyCreationRequestOptions0.e;
                    if(arr_b1 == null) {
                        goto label_82;
                    }
                    String s4 = keyCreationRequestOptions0.f;
                    if(s4 == null) {
                        goto label_82;
                    }
                    String s5 = keyCreationRequestOptions0.g;
                    if(s5 == null) {
                        goto label_82;
                    }
                    Account account0 = keyCreationRequestOptions0.h;
                    if(account0 == null) {
                    label_82:
                        bxly bxly6 = new bxly();
                        bxly6.a = 8;
                        bxly6.b = "Metadata fields cannot be null for discoverable credentials";
                        throw bxly6.a();
                    }
                    KeyPair keyPair1 = bljg.b();
                    byte[] arr_b2 = keyPair1.getPrivate().getEncoded();
                    byte[] arr_b3 = new byte[16];
                    byte[] arr_b4 = new byte[16];
                    SecureRandom secureRandom0 = new SecureRandom();
                    secureRandom0.nextBytes(arr_b3);
                    secureRandom0.nextBytes(arr_b4);
                    long v2 = bljg.c.d();
                    long v3 = bljg.c.b(v2);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hery.a).v_newBuilder();
                    ByteString hfsf0 = ByteString.copyFrom(arr_b4);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery0 = (hery)hftp0.b_message;
                    hery0.b |= 1;
                    hery0.e = hfsf0;
                    ByteString hfsf1 = ByteString.copyFrom(arr_b3);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery1 = (hery)hftp0.b_message;
                    hery1.b |= 2;
                    hery1.f = hfsf1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery2 = (hery)hftp0.b_message;
                    s.getClass();
                    hery2.b |= 4;
                    hery2.g = s;
                    ByteString hfsf2 = ByteString.copyFrom(arr_b1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery3 = (hery)hftp0.b_message;
                    hery3.b |= 8;
                    hery3.h = hfsf2;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery4 = (hery)hftp0.b_message;
                    hery4.b |= 0x20;
                    hery4.k = s4;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery5 = (hery)hftp0.b_message;
                    hery5.b |= 0x40;
                    hery5.l = s5;
                    long v4 = System.currentTimeMillis();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery6 = (hery)hftp0.b_message;
                    hery6.b |= 16;
                    hery6.j = v4;
                    boolean z1 = keyCreationRequestOptions0.i;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery7 = (hery)hftp0.b_message;
                    hery7.b |= 0x80;
                    hery7.m = z1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery8 = (hery)hftp0.b_message;
                    hery8.b |= 0x100;
                    hery8.n = v2;
                    gmcd gmcd0 = fhra.b(this.g.jx(account0.name));
                    try {
                        List list0 = (List)((glyq)gmcd0).u();
                        if(list0.isEmpty()) {
                            bxly bxly7 = new bxly();
                            bxly7.a = 8;
                            bxly7.b = "No shared key available.";
                            throw bxly7.a();
                        }
                        sharedKey0 = (SharedKey)gggq.p(list0);
                    }
                    catch(ExecutionException | InterruptedException exception0) {
                        bxly bxly8 = new bxly();
                        bxly8.a = 8;
                        bxly8.c = exception0;
                        bxly8.b = "Failed to get shared key.";
                        throw bxly8.a();
                    }
                    byte[] arr_b5 = blpr.d(sharedKey0.b);
                    Pair pair0 = Pair.create(Integer.valueOf(sharedKey0.a), arr_b5);
                    if(hsvs.l()) {
                        int v5 = (int)(((Integer)pair0.first));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hery hery9 = (hery)hftp0.b_message;
                        hery9.b |= 0x200;
                        hery9.o = v5;
                    }
                    boolean z2 = keyCreationRequestOptions0.j;
                    if(z2) {
                        hftp1 = ((ProtoLiteMessage)herx.a).v_newBuilder();
                        ByteString hfsf3 = ByteString.copyFrom(arr_b2);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        herx herx0 = (herx)hftp1.b_message;
                        herx0.b |= 1;
                        herx0.c = hfsf3;
                        byte[] arr_b6 = new byte[0x20];
                        secureRandom0.nextBytes(arr_b6);
                        ByteString hfsf4 = ByteString.copyFrom(arr_b6);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        herx herx1 = (herx)hftp1.b_message;
                        herx1.b |= 2;
                        herx1.d = hfsf4;
                    }
                    else {
                        hftp1 = null;
                    }
                    byte[] arr_b7 = z2 ? null : blpr.e(((byte[])pair0.second), arr_b2, blpr.a, secureRandom0);
                    byte[] arr_b8 = z2 ? blpr.e(((byte[])pair0.second), ((herx)hftp1.N_build()).toBytesArray(), blpr.b, secureRandom0) : null;
                    if(z2) {
                        ByteString hfsf6 = ByteString.copyFrom(arr_b8);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hery)hftp0.b_message).c = 12;
                        ((hery)hftp0.b_message).d = hfsf6;
                    }
                    else {
                        ByteString hfsf5 = ByteString.copyFrom(arr_b7);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hery)hftp0.b_message).c = 9;
                        ((hery)hftp0.b_message).d = hfsf5;
                    }
                    evql0 = ((blir)this.a.d()).b(keyCreationRequestOptions0.h, null, s, keyCreationRequestOptions0.e).c(new blkp()).e(new bljf(this, hftp0, keyCreationRequestOptions0)).e(new blje(this, s, keyCreationRequestOptions0)).e(new bljd(this, keyCreationRequestOptions0)).c(new bljc(this, keyCreationRequestOptions0, arr_b3, keyPair1, arr_b7, arr_b8, v3));
                    evql0.z(new bljb(this));
                    return;
                }
                case 4: {
                    throw new IllegalStateException("Not supported key storage type");
                }
                default: {
                    throw new IllegalStateException("Not supported key storage type");
                }
            }
        }
        catch(bxma bxma0) {
            Status status0 = bxma0.a();
            this.b.a(status0, null, ApiMetadata.b);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, null, ApiMetadata.b);
    }
}

