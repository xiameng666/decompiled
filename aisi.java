import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aisi {
    private static final bboh a;
    private final aink b;
    private final String c;
    private final Signature[] d;
    private final PackageManager e;
    private final boolean f;
    private final aiqy g;

    static {
        aisi.a = aiqz.b("RestoreCredentialImpl");
    }

    public aisi(aink aink0, String s, Signature[] arr_signature, PackageManager packageManager0, boolean z, aiqy aiqy0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(arr_signature, "signatures");
        ibuq.f(packageManager0, "packageManager");
        ibuq.f(aiqy0, "eventLogger");
        super();
        this.b = aink0;
        this.c = s;
        this.d = arr_signature;
        this.e = packageManager0;
        this.f = z;
        this.g = aiqy0;
    }

    public final Object a(ClearRestoreCredentialRequest clearRestoreCredentialRequest0, ibrl ibrl0) {
        long v2;
        ProtoLiteBuilder hftp1;
        aiml aiml1;
        Object object2;
        aisd aisd0;
        if((ibrl0 instanceof aisd)) {
            aisd0 = (aisd)ibrl0;
            int v = aisd0.d;
            if((v & 0x80000000) == 0) {
                aisd0 = new aisd(this, ibrl0);
            }
            else {
                aisd0.d = v - 0x80000000;
            }
        }
        else {
            aisd0 = new aisd(this, ibrl0);
        }
        Object object0 = aisd0.b;
        Object object1 = ibrx.a;
        switch(aisd0.d) {
            case 0: {
                ibnx.b(object0);
                long v1 = SystemClock.elapsedRealtime();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wue.a).v_newBuilder();
                String s = this.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                wue wue0 = (wue)hftp0.b_message;
                s.getClass();
                wue0.b |= 1;
                wue0.c = s;
                if(clearRestoreCredentialRequest0.a.getBoolean("androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST")) {
                    bboh bboh0 = aisi.a;
                    gfsx gfsx0 = aizr.d(s, this.d, bboh0);
                    if(gfsx0.i()) {
                        ainm ainm0 = new ainm();
                        ainm0.b(ibpo.b(gfsx0.d()));
                        DeleteBytesRequest deleteBytesRequest0 = ainm0.a();
                        try {
                            gmcd gmcd0 = this.b.a(deleteBytesRequest0);
                            aisd0.e = hftp0;
                            aisd0.a = v1;
                            aisd0.d = 1;
                            object2 = icpu.c(gmcd0, aisd0);
                        }
                        catch(aiml aiml0) {
                            aiml1 = aiml0;
                            hftp1 = hftp0;
                            v2 = v1;
                            break;
                        }
                        if(object2 != object1) {
                            object0 = object2;
                            hftp1 = hftp0;
                            v2 = v1;
                            goto label_58;
                        }
                        return object1;
                    }
                    ((ggtj)bboh0.j()).x("Failed to get a valid package key from the package name and signatures.");
                    wue wue1 = aisi.g(hftp0, 4, v1);
                    this.g.c(wue1);
                    throw new aisc(40201);
                }
                ((ggtj)aisi.a.j()).x("Invalid clear restore credential request");
                wue wue2 = aisi.g(hftp0, 6, v1);
                this.g.c(wue2);
                throw new aisc(40200);
            }
            case 1: {
                try {
                    v2 = aisd0.a;
                    hftp1 = aisd0.e;
                    ibnx.b(object0);
                label_58:
                    ibuq.e(object0, "await(...)");
                    if(!((Boolean)object0).booleanValue()) {
                        goto label_66;
                    }
                    goto label_69;
                }
                catch(aiml aiml1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(aisi.a.i(), "Exception during deleting restore credential.", aiml1);
        wue wue3 = aisi.g(hftp1, 3, v2);
        this.g.c(wue3);
        throw new aisc(aiml1, 40201);
    label_66:
        wue wue4 = aisi.g(hftp1, 5, v2);
        this.g.c(wue4);
        return Boolean.valueOf(true);
    label_69:
        wue wue5 = aisi.g(hftp1, 2, v2);
        this.g.c(wue5);
        return Boolean.valueOf(true);
    }

    public final Object b(CreateRestoreCredentialRequest createRestoreCredentialRequest0, ibrl ibrl0) {
        int v5;
        long v4;
        ibns ibns1;
        ProtoLiteBuilder hftp2;
        boolean z3;
        long v3;
        ibns ibns0;
        long v2;
        Object object2;
        ArrayList arrayList0;
        List list0;
        byte[] arr_b;
        Signature[] arr_signature;
        kzc kzc0;
        kyy kyy0;
        String s3;
        boolean z2;
        boolean z1;
        String s2;
        Object object1;
        ProtoLiteBuilder hftp0;
        long v1;
        aise aise0;
        if((ibrl0 instanceof aise)) {
            aise0 = (aise)ibrl0;
            int v = aise0.g;
            if((v & 0x80000000) == 0) {
                aise0 = new aise(this, ibrl0);
            }
            else {
                aise0.g = v - 0x80000000;
            }
        }
        else {
            aise0 = new aise(this, ibrl0);
        }
        Object object0 = aise0.e;
        ibrx ibrx0 = ibrx.a;
        switch(aise0.g) {
            case 0: {
                ibnx.b(object0);
                v1 = SystemClock.elapsedRealtime();
                hftp0 = ((ProtoLiteMessage)wup.a).v_newBuilder();
                String s = this.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                wup wup0 = (wup)hftp0.b_message;
                s.getClass();
                wup0.b |= 1;
                wup0.c = s;
                boolean z = createRestoreCredentialRequest0.a.getBoolean("androidx.credentials.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD", false);
                String s1 = createRestoreCredentialRequest0.a.getString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST");
                if(s1 == null) {
                    goto label_57;
                }
                bboh bboh0 = aisi.a;
                object1 = aizr.d(s, this.d, bboh0);
                if(!((gfsx)object1).i()) {
                    goto label_53;
                }
                if(z) {
                    try {
                        gmcd gmcd0 = this.b.b();
                        aise0.h = hftp0;
                        aise0.b = s1;
                        aise0.c = object1;
                        aise0.a = v1;
                        aise0.d = true;
                        aise0.g = 1;
                        object0 = icpu.c(gmcd0, aise0);
                    }
                    catch(aiml aiml0) {
                        s2 = s1;
                        z1 = z;
                        a.ae(aisi.a.i(), "Exception when checking e2ee status.", aiml0);
                        z2 = false;
                        goto label_73;
                    }
                    if(object0 != ibrx0) {
                        s2 = s1;
                        z1 = z;
                        goto label_67;
                    }
                    return ibrx0;
                }
                else {
                    s2 = s1;
                    z1 = z;
                    goto label_78;
                label_53:
                    ((ggtj)bboh0.j()).x("Failed to get a valid package key from the package name and signatures.");
                    wup wup1 = aisi.h(hftp0, 5, v1, z);
                    this.g.f(wup1);
                    throw new aisc(40201);
                label_57:
                    ((ggtj)aisi.a.j()).x("Failed to find a valid request json as part of the request bundle.");
                    wup wup2 = aisi.h(hftp0, 6, v1, z);
                    this.g.f(wup2);
                    throw new aisc(40200);
                }
                goto label_78;
            }
            case 1: {
                z1 = aise0.d;
                v1 = aise0.a;
                object1 = aise0.c;
                s2 = (String)aise0.b;
                hftp0 = aise0.h;
                try {
                    ibnx.b(object0);
                label_67:
                    ibuq.e(object0, "await(...)");
                    z2 = ((Boolean)object0).booleanValue();
                }
                catch(aiml aiml0) {
                    a.ae(aisi.a.i(), "Exception when checking e2ee status.", aiml0);
                    z2 = false;
                }
            label_73:
                if(!z2) {
                    ((ggtj)aisi.a.i()).x("Backup was requested but the e2ee is not available on the device.");
                    wup wup3 = aisi.h(hftp0, 3, v1, z1);
                    this.g.f(wup3);
                    throw new aisc(40203);
                }
                try {
                label_78:
                    s3 = this.c;
                    ibuq.f(s2, "requestJson");
                    ibuq.f(this.d, "signatures");
                    ibuq.f(s3, "callingPackage");
                    kyy0 = new kyy(s2);
                    kzc0 = kyy0.b;
                    arr_signature = this.d;
                    arr_b = kzc0.a;
                    if(kzc0.a.length == 0 || kzc0.a.length > 0x40) {
                        ((ggtj)aisj.a.i()).x("The user id length is out of bounds");
                        throw new aisc(40202);
                    }
                    list0 = kyy0.d;
                    arrayList0 = new ArrayList();
                    Iterator iterator0 = list0.iterator();
                    while(true) {
                    label_92:
                        if(!iterator0.hasNext()) {
                            goto label_111;
                        }
                        object2 = iterator0.next();
                        kyz kyz0 = (kyz)object2;
                        if(ibuq.m(kyz0.a, "public-key")) {
                            break;
                        }
                        list0 = list0;
                        object1 = object1;
                        ibrx0 = ibrx0;
                    }
                }
                catch(aisc aisc0) {
                    goto label_199;
                }
                try {
                    v2 = v1;
                    if(((int)kyz0.b) == -7) {
                        arrayList0.add(object2);
                    }
                    list0 = list0;
                    object1 = object1;
                    ibrx0 = ibrx0;
                    v1 = v2;
                    goto label_92;
                label_111:
                    v2 = v1;
                    if(!list0.isEmpty() && arrayList0.isEmpty()) {
                        ((ggtj)aisj.a.i()).x("The provided credential parameters are unsupported");
                        throw new aisc(40202);
                    }
                    byte[] arr_b1 = new byte[0x20];
                    new SecureRandom().nextBytes(arr_b1);
                    ECGenParameterSpec eCGenParameterSpec0 = new ECGenParameterSpec("secp256r1");
                    KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("EC");
                    keyPairGenerator0.initialize(eCGenParameterSpec0);
                    KeyPair keyPair0 = keyPairGenerator0.genKeyPair();
                    ibuq.c(keyPair0);
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ajbh.a).v_newBuilder();
                    ibuq.f(hftp1, "builder");
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ajbh ajbh0 = (ajbh)hftp1.b_message;
                    ajbh0.b |= 1;
                    ajbh0.c = hfsf0;
                    String s4 = kyy0.a.a;
                    ibuq.f(s4, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ajbh ajbh1 = (ajbh)hftp1.b_message;
                    s4.getClass();
                    ajbh1.b |= 2;
                    ajbh1.d = s4;
                    ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ajbh ajbh2 = (ajbh)hftp1.b_message;
                    ajbh2.b |= 4;
                    ajbh2.e = hfsf1;
                    PrivateKey privateKey0 = keyPair0.getPrivate();
                    ibuq.d(privateKey0, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
                    ByteString hfsf2 = ByteString.copyFrom(((ECPrivateKey)privateKey0).getS().toByteArray());
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ajbh ajbh3 = (ajbh)hftp1.b_message;
                    ajbh3.b |= 8;
                    ajbh3.f = hfsf2;
                    ibuq.f(s3, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ajbh ajbh4 = (ajbh)hftp1.b_message;
                    s3.getClass();
                    ajbh4.b |= 16;
                    ajbh4.g = s3;
                    String s5 = ibzk.ab(kzc0.b, 0x40);
                    ibuq.f(s5, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ajbh ajbh5 = (ajbh)hftp1.b_message;
                    s5.getClass();
                    ajbh5.b |= 0x20;
                    ajbh5.h = s5;
                    ProtoLiteMessage hftv0 = hftp1.N_build();
                    ibuq.e(hftv0, "build(...)");
                    PublicKey publicKey0 = keyPair0.getPublic();
                    ibuq.d(publicKey0, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
                    BigInteger bigInteger0 = ((ECPublicKey)publicKey0).getW().getAffineX();
                    BigInteger bigInteger1 = ((ECPublicKey)publicKey0).getW().getAffineY();
                    byte[] arr_b2 = new bmbx(bmhq.d, bmbw.a, bigInteger0, bigInteger1).d();
                    ibuq.c(arr_b2);
                    String s6 = aisj.a(arr_signature);
                    kyu kyu0 = new kyu(kyy0, arr_b1, arr_b2, (s6 == null ? "" : s6), s3);
                    String s7 = Base64.encodeToString(arr_b1, 11);
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("id", s7);
                    jSONObject0.put("rawId", s7);
                    jSONObject0.put("type", "public-key");
                    jSONObject0.put("authenticatorAttachment", "platform");
                    String s8 = kyu0.a.toString();
                    ibuq.e(s8, "toString(...)");
                    byte[] arr_b3 = s8.getBytes(ibyo.a);
                    ibuq.e(arr_b3, "getBytes(...)");
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("clientDataJSON", kzd.b(arr_b3));
                    jSONObject1.put("attestationObject", kzd.b(kyu0.b));
                    jSONObject1.put("transports", new JSONArray(ibpo.g(new String[]{"internal", "hybrid"})));
                    jSONObject0.put("response", jSONObject1.put("publicKeyAlgorithm", -7).put("publicKey", Base64.encodeToString(arr_b2, 11)));
                    jSONObject0.put("clientExtensionResults", new JSONObject());
                    String s9 = jSONObject0.toString();
                    ibuq.e(s9, "toString(...)");
                    ibns0 = new ibns(s9, ((ajbh)hftv0));
                    goto label_202;
                }
                catch(aisc aisc0) {
                    v1 = v2;
                }
            label_199:
                wup wup4 = aisi.h(hftp0, 7, v1, z1);
                this.g.f(wup4);
                throw aisc0;
            label_202:
                aioe aioe0 = new aioe();
                aioe0.a = ((ajbh)ibns0.b).toBytesArray();
                aioe0.b(((String)((gfsx)object1).d()));
                aioe0.b = z1;
                StoreBytesData storeBytesData0 = aioe0.a();
                try {
                    v3 = v2;
                    gmcd gmcd1 = this.b.e(storeBytesData0);
                    aise0.h = hftp0;
                    aise0.b = ibns0;
                    aise0.c = null;
                    v3 = v2;
                    aise0.a = v3;
                    aise0.d = z1;
                    aise0.g = 2;
                    object0 = icpu.c(gmcd1, aise0);
                }
                catch(aiml aiml1) {
                    z3 = z1;
                    hftp2 = hftp0;
                    ibns1 = ibns0;
                    v4 = v3;
                    break;
                }
                if(object0 != ibrx0) {
                    z3 = z1;
                    hftp2 = hftp0;
                    ibns1 = ibns0;
                    v4 = v3;
                    goto label_236;
                }
                return ibrx0;
            }
            case 2: {
                z3 = aise0.d;
                v4 = aise0.a;
                ibns1 = (ibns)aise0.b;
                hftp2 = aise0.h;
                try {
                    ibnx.b(object0);
                label_236:
                    ibuq.e(object0, "await(...)");
                    v5 = ((Number)object0).intValue();
                    goto label_242;
                }
                catch(aiml aiml1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(aisi.a.i(), "Exception during store restore credential.", aiml1);
        v5 = 0;
    label_242:
        if(v5 != 0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE", ((String)ibns1.a));
            wup wup5 = aisi.h(hftp2, 2, v4, z3);
            this.g.f(wup5);
            return new CreateRestoreCredentialResponse(bundle0);
        }
        wup wup6 = aisi.h(hftp2, 4, v4, z3);
        this.g.f(wup6);
        throw new aisc(40201);
    }

    public final Object c(String s, Signature[] arr_signature, ibrl ibrl0) {
        RetrieveBytesResponse retrieveBytesResponse0;
        RetrieveBytesResponse.BlockstoreData retrieveBytesResponse$BlockstoreData0;
        Object object2;
        aisf aisf0;
        if((ibrl0 instanceof aisf)) {
            aisf0 = (aisf)ibrl0;
            int v = aisf0.d;
            if((v & 0x80000000) == 0) {
                aisf0 = new aisf(this, ibrl0);
            }
            else {
                aisf0.d = v - 0x80000000;
            }
        }
        else {
            aisf0 = new aisf(this, ibrl0);
        }
        Object object0 = aisf0.b;
        Object object1 = ibrx.a;
        switch(aisf0.d) {
            case 0: {
                ibnx.b(object0);
                if(hpsk.c()) {
                    if(this.f(s)) {
                        if(this.f) {
                            bboh bboh0 = aisi.a;
                            gfsx gfsx0 = aizr.d(s, arr_signature, bboh0);
                            if(gfsx0.i()) {
                                ainz ainz0 = new ainz();
                                ainz0.b(ibpo.b(gfsx0.d()));
                                RetrieveBytesRequest retrieveBytesRequest0 = ainz0.a();
                                try {
                                    gmcd gmcd0 = this.b.c(retrieveBytesRequest0);
                                    aisf0.a = gfsx0;
                                    aisf0.d = 1;
                                    object0 = icpu.c(gmcd0, aisf0);
                                    if(object0 == object1) {
                                        return object1;
                                    }
                                    object2 = gfsx0;
                                    retrieveBytesResponse$BlockstoreData0 = null;
                                    retrieveBytesResponse0 = (RetrieveBytesResponse)object0;
                                    goto label_47;
                                }
                                catch(aiml aiml0) {
                                    break;
                                }
                            }
                            ((ggtj)bboh0.j()).x("Failed to get a valid package key from the package name and signatures.");
                            throw new aisc(40201);
                        }
                        ((ggtj)aisi.a.i()).x("The API cannot be called from non-zero party apps.");
                        throw new aisc(40200);
                    }
                    ((ggtj)aisi.a.i()).x("The API cannot be called for non-debuggable apps.");
                    throw new aisc(40200);
                }
                ((ggtj)aisi.a.j()).x("Flag is disabled.");
                throw new aisc(17);
            }
            case 1: {
                try {
                    object2 = aisf0.a;
                    ibnx.b(object0);
                    retrieveBytesResponse$BlockstoreData0 = null;
                    retrieveBytesResponse0 = (RetrieveBytesResponse)object0;
                    goto label_47;
                }
                catch(aiml aiml0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(aisi.a.i(), "Exception during retrieve restore credential.", aiml0);
        throw new aisc(aiml0, 40201);
    label_47:
        if(retrieveBytesResponse0 != null) {
            Map map0 = retrieveBytesResponse0.a();
            if(map0 != null) {
                retrieveBytesResponse$BlockstoreData0 = (RetrieveBytesResponse.BlockstoreData)map0.get(((gfsx)object2).d());
            }
        }
        if(retrieveBytesResponse0 != null && retrieveBytesResponse$BlockstoreData0 != null) {
            ibuq.e(retrieveBytesResponse$BlockstoreData0.a, "getBytes(...)");
            return retrieveBytesResponse$BlockstoreData0.a;
        }
        ((ggtj)aisi.a.j()).x("Failed to retrieve the restore blob from block store.");
        return new byte[0];
    }

    public final Object d(GetRestoreCredentialRequest getRestoreCredentialRequest0, ibrl ibrl0) {
        RetrieveBytesResponse retrieveBytesResponse0;
        Object object3;
        String s2;
        long v2;
        ProtoLiteBuilder hftp1;
        Object object2;
        aisg aisg0;
        if((ibrl0 instanceof aisg)) {
            aisg0 = (aisg)ibrl0;
            int v = aisg0.e;
            if((v & 0x80000000) == 0) {
                aisg0 = new aisg(this, ibrl0);
            }
            else {
                aisg0.e = v - 0x80000000;
            }
        }
        else {
            aisg0 = new aisg(this, ibrl0);
        }
        Object object0 = aisg0.c;
        Object object1 = ibrx.a;
        switch(aisg0.e) {
            case 0: {
                ibnx.b(object0);
                long v1 = SystemClock.elapsedRealtime();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvc.a).v_newBuilder();
                String s = this.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                wvc wvc0 = (wvc)hftp0.b_message;
                s.getClass();
                wvc0.b |= 1;
                wvc0.c = s;
                String s1 = getRestoreCredentialRequest0.a.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_REQUEST");
                if(s1 != null) {
                    bboh bboh0 = aisi.a;
                    gfsx gfsx0 = aizr.d(s, this.d, bboh0);
                    if(gfsx0.i()) {
                        ainz ainz0 = new ainz();
                        ainz0.b(ibpo.b(gfsx0.d()));
                        RetrieveBytesRequest retrieveBytesRequest0 = ainz0.a();
                        try {
                            gmcd gmcd0 = this.b.c(retrieveBytesRequest0);
                            aisg0.g = hftp0;
                            aisg0.f = s1;
                            aisg0.b = gfsx0;
                            aisg0.a = v1;
                            aisg0.e = 1;
                            object2 = icpu.c(gmcd0, aisg0);
                        }
                        catch(aiml aiml0) {
                            hftp1 = hftp0;
                            v2 = v1;
                            break;
                        }
                        if(object2 != object1) {
                            s2 = s1;
                            object3 = gfsx0;
                            v2 = v1;
                            hftp1 = hftp0;
                            object0 = object2;
                            goto label_64;
                        }
                        return object1;
                    }
                    ((ggtj)bboh0.j()).x("Failed to get a valid package key from the package name and signatures.");
                    wvc wvc1 = aisi.i(hftp0, 4, v1);
                    this.g.i(wvc1);
                    throw new aisc(40201);
                }
                ((ggtj)aisi.a.j()).x("Failed to find a valid request json as part of the request bundle.");
                wvc wvc2 = aisi.i(hftp0, 6, v1);
                this.g.i(wvc2);
                throw new aisc(40200);
            }
            case 1: {
                try {
                    v2 = aisg0.a;
                    object3 = aisg0.b;
                    s2 = aisg0.f;
                    hftp1 = aisg0.g;
                    ibnx.b(object0);
                label_64:
                    ibuq.e(object0, "await(...)");
                    retrieveBytesResponse0 = (RetrieveBytesResponse)object0;
                    goto label_72;
                }
                catch(aiml aiml0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(aisi.a.i(), "Exception during retrieve restore credential.", aiml0);
        wvc wvc3 = aisi.i(hftp1, 3, v2);
        this.g.i(wvc3);
        throw new aisc(aiml0, 40201);
    label_72:
        RetrieveBytesResponse.BlockstoreData retrieveBytesResponse$BlockstoreData0 = (RetrieveBytesResponse.BlockstoreData)retrieveBytesResponse0.a().get(((gfsx)object3).d());
        if(retrieveBytesResponse$BlockstoreData0 == null) {
            ((ggtj)aisi.a.j()).x("Failed to retrieve the restore blob from block store.");
            wvc wvc4 = aisi.i(hftp1, 5, v2);
            this.g.i(wvc4);
            return new GetRestoreCredentialResponse(new Bundle());
        }
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ajbh.a), retrieveBytesResponse$BlockstoreData0.a, 0, retrieveBytesResponse$BlockstoreData0.a.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((ajbh)hftv0), "parseFrom(...)");
        ibuq.f(s2, "requestJson");
        ibuq.f(((ajbh)hftv0), "restoreKeyInfo");
        ibuq.f(this.d, "signatures");
        kza kza0 = new kza(s2);
        byte[] arr_b = ((ajbh)hftv0).f.toByteArray();
        ibuq.e(arr_b, "toByteArray(...)");
        AlgorithmParameters algorithmParameters0 = AlgorithmParameters.getInstance("EC");
        algorithmParameters0.init(new ECGenParameterSpec("secp256r1"));
        ECParameterSpec eCParameterSpec0 = (ECParameterSpec)algorithmParameters0.getParameterSpec(ECParameterSpec.class);
        ECPrivateKeySpec eCPrivateKeySpec0 = new ECPrivateKeySpec(new BigInteger(1, arr_b), eCParameterSpec0);
        PrivateKey privateKey0 = KeyFactory.getInstance("EC").generatePrivate(eCPrivateKeySpec0);
        ibuq.d(privateKey0, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        ByteString hfsf0 = ((ajbh)hftv0).e;
        ibuq.e(hfsf0, "getCredId(...)");
        ByteString hfsf1 = ((ajbh)hftv0).c;
        ibuq.e(hfsf1, "getUId(...)");
        byte[] arr_b1 = hfsf0.toByteArray();
        ibuq.e(arr_b1, "toByteArray(...)");
        String s3 = aisj.a(this.d);
        if(s3 == null) {
            s3 = "";
        }
        byte[] arr_b2 = hfsf1.toByteArray();
        ibuq.e(arr_b2, "toByteArray(...)");
        kyt kyt0 = new kyt(kza0, arr_b1, s3, arr_b2);
        java.security.Signature signature0 = java.security.Signature.getInstance("SHA256withECDSA");
        signature0.initSign(((ECPrivateKey)privateKey0));
        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
        String s4 = kyt0.b.toString();
        ibuq.e(s4, "toString(...)");
        byte[] arr_b3 = s4.getBytes(ibyo.a);
        ibuq.e(arr_b3, "getBytes(...)");
        byte[] arr_b4 = messageDigest0.digest(arr_b3);
        ibuq.e(arr_b4, "digest(...)");
        signature0.update(ibpg.k(kyt0.c, arr_b4));
        byte[] arr_b5 = signature0.sign();
        ibuq.e(arr_b5, "sign(...)");
        ibuq.f(arr_b5, "<set-?>");
        kyt0.d = arr_b5;
        byte[] arr_b6 = hfsf0.toByteArray();
        ibuq.e(arr_b6, "toByteArray(...)");
        ibuq.f(arr_b6, "rawId");
        String s5 = kzd.b(arr_b6);
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("id", s5);
        jSONObject0.put("rawId", s5);
        jSONObject0.put("type", "public-key");
        jSONObject0.put("authenticatorAttachment", "platform");
        String s6 = kyt0.b.toString();
        ibuq.e(s6, "toString(...)");
        byte[] arr_b7 = s6.getBytes(ibyo.a);
        ibuq.e(arr_b7, "getBytes(...)");
        JSONObject jSONObject1 = new JSONObject();
        jSONObject1.put("clientDataJSON", kzd.b(arr_b7));
        jSONObject1.put("authenticatorData", kzd.b(kyt0.c));
        jSONObject1.put("signature", kzd.b(kyt0.d));
        jSONObject1.put("userHandle", kzd.b(kyt0.a));
        jSONObject0.put("response", jSONObject1);
        jSONObject0.put("clientExtensionResults", new JSONObject());
        String s7 = jSONObject0.toString();
        ibuq.e(s7, "toString(...)");
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE", s7);
        wvc wvc5 = aisi.i(hftp1, 2, v2);
        this.g.i(wvc5);
        return new GetRestoreCredentialResponse(bundle0);
    }

    public final Object e(String s, Signature[] arr_signature, byte[] arr_b, boolean z, ibrl ibrl0) {
        aish aish0;
        if((ibrl0 instanceof aish)) {
            aish0 = (aish)ibrl0;
            int v = aish0.c;
            if((v & 0x80000000) == 0) {
                aish0 = new aish(this, ibrl0);
            }
            else {
                aish0.c = v - 0x80000000;
            }
        }
        else {
            aish0 = new aish(this, ibrl0);
        }
        Object object0 = aish0.a;
        Object object1 = ibrx.a;
        int v1 = 0;
        switch(aish0.c) {
            case 0: {
                ibnx.b(object0);
                if(hpsk.c()) {
                    if(this.f(s)) {
                        if(this.f) {
                            bboh bboh0 = aisi.a;
                            gfsx gfsx0 = aizr.d(s, arr_signature, bboh0);
                            if(gfsx0.i()) {
                                try {
                                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ajbh.a), arr_b, 0, arr_b.length, hftc.a);
                                    ProtoLiteMessage.P_makeImmutable(hftv0);
                                    ibuq.e(((ajbh)hftv0), "parseFrom(...)");
                                }
                                catch(hfur hfur0) {
                                    a.ae(aisi.a.i(), "The passed in restore key is not a valid restore key.", hfur0);
                                    throw new aisc(hfur0, 40200);
                                }
                                aioe aioe0 = new aioe();
                                aioe0.a = arr_b;
                                aioe0.b(((String)gfsx0.d()));
                                aioe0.b = z;
                                StoreBytesData storeBytesData0 = aioe0.a();
                                try {
                                    gmcd gmcd0 = this.b.e(storeBytesData0);
                                    aish0.c = 1;
                                    object0 = icpu.c(gmcd0, aish0);
                                    if(object0 == object1) {
                                        return object1;
                                    }
                                    goto label_47;
                                }
                                catch(aiml aiml0) {
                                    break;
                                }
                            }
                            ((ggtj)bboh0.j()).x("Failed to get a valid package key from the package name and signatures.");
                            throw new aisc(40201);
                        }
                        ((ggtj)aisi.a.i()).x("The API cannot be called from non-zero party apps.");
                        throw new aisc(40200);
                    }
                    ((ggtj)aisi.a.i()).x("The API cannot be called for non-debuggable apps.");
                    throw new aisc(40200);
                }
                ((ggtj)aisi.a.j()).x("Flag is disabled.");
                throw new aisc(17);
            }
            case 1: {
                try {
                    ibnx.b(object0);
                label_47:
                    ibuq.e(object0, "await(...)");
                    v1 = ((Number)object0).intValue();
                    goto label_52;
                }
                catch(aiml aiml0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(aisi.a.i(), "Exception during store restore credential.", aiml0);
    label_52:
        if(v1 != 0) {
            return new Integer(v1);
        }
        throw new aisc(40201);
    }

    private final boolean f(String s) {
        try {
            if((this.e.getApplicationInfo(s, 0).flags & 2) != 0) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            ((ggtj)aisi.a.j()).x("The package is not found.");
        }
        return false;
    }

    private static final wue g(ProtoLiteBuilder hftp0, int v, long v1) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wue)hftp0.b_message).d = v - 1;
        ((wue)hftp0.b_message).b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        long v2 = SystemClock.elapsedRealtime() - v1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvd wvd0 = (wvd)hftp1.b_message;
        wvd0.b |= 1;
        wvd0.c = (int)v2;
        wvd wvd1 = (wvd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wue wue0 = (wue)hftp0.b_message;
        wvd1.getClass();
        wue0.e = wvd1;
        wue0.b |= 4;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (wue)hftv0;
    }

    private static final wup h(ProtoLiteBuilder hftp0, int v, long v1, boolean z) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wun.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wun wun0 = (wun)hftp1.b_message;
        wun0.b |= 1;
        wun0.c = z;
        wun wun1 = (wun)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wup wup0 = (wup)hftp0.b_message;
        wun1.getClass();
        wup0.f = wun1;
        wup0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wup)hftp0.b_message).d = v - 1;
        ((wup)hftp0.b_message).b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        long v2 = SystemClock.elapsedRealtime() - v1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        wvd wvd0 = (wvd)hftp2.b_message;
        wvd0.b |= 1;
        wvd0.c = (int)v2;
        wvd wvd1 = (wvd)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wup wup1 = (wup)hftp0.b_message;
        wvd1.getClass();
        wup1.e = wvd1;
        wup1.b |= 4;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (wup)hftv0;
    }

    private static final wvc i(ProtoLiteBuilder hftp0, int v, long v1) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wvc)hftp0.b_message).d = v - 1;
        ((wvc)hftp0.b_message).b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        long v2 = SystemClock.elapsedRealtime() - v1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvd wvd0 = (wvd)hftp1.b_message;
        wvd0.b |= 1;
        wvd0.c = (int)v2;
        wvd wvd1 = (wvd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvc wvc0 = (wvc)hftp0.b_message;
        wvd1.getClass();
        wvc0.e = wvd1;
        wvc0.b |= 4;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (wvc)hftv0;
    }
}

