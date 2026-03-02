import android.content.Context;
import android.security.keystore.KeyGenParameterSpec.Builder;
import com.google.android.gms.mdocstore.OperatingStatus;
import com.google.android.gms.mdocstore.types.AuthenticationData;
import com.google.android.gms.mdocstore.types.CryptoSchemeId;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.mdocstore.types.SignedPublicKey;
import j..time.Instant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class dtyc implements dtto {
    public final cqxc a;
    public static final int b;
    private static final bboh c;
    private final dtpl d;
    private final dual e;
    private final ebib f;
    private final dtrf g;
    private final dtss h;
    private final dtvv i;
    private final Context j;
    private final ibrt k;
    private final String l;
    private final icck m;

    static {
        dtyc.c = bboh.b("Pay", bbcu.cZ);
    }

    public dtyc(dtpl dtpl0, cqxc cqxc0, dual dual0, ebib ebib0, dtrf dtrf0, dtss dtss0, dtvv dtvv0, Context context0, ibrt ibrt0, String s) {
        ibuq.f(cqxc0, "mdocStoreClient");
        super();
        this.d = dtpl0;
        this.a = cqxc0;
        this.e = dual0;
        this.f = ebib0;
        this.g = dtrf0;
        this.h = dtss0;
        this.i = dtvv0;
        this.j = context0;
        this.k = ibrt0;
        this.l = s;
        this.m = iccl.b(ibrt0);
    }

    @Override  // dtto
    public final void a(gtxg gtxg0, gtxd gtxd0, byte[] arr_b) {
        ibuq.f(gtxd0, "metadata");
        dtxv dtxv0 = new dtxv(this, gtxg0, gtxd0, arr_b, null);
        icpu.e(this.m, dtxv0).get();
    }

    @Override  // dtto
    public final void b(ProvisioningId provisioningId0, byte[] arr_b) {
        if(!dtqh.a()) {
            return;
        }
        dtxx dtxx0 = new dtxx(this, provisioningId0, arr_b, null);
        icpu.e(this.m, dtxx0).get();
    }

    public final Object c(gtxg gtxg0, gtxd gtxd0, byte[] arr_b, ibrl ibrl0) {
        String s29;
        hkaa hkaa2;
        AtomicBoolean atomicBoolean5;
        AtomicBoolean atomicBoolean4;
        Object object11;
        AtomicBoolean atomicBoolean3;
        Object object10;
        String s28;
        int v9;
        ByteString hfsf3;
        gtxc gtxc3;
        ByteString hfsf2;
        String s25;
        List list0;
        gtxc gtxc1;
        hkaa hkaa0;
        String s24;
        JSONArray jSONArray2;
        ibps ibps0;
        gtxd gtxd7;
        String s19;
        gtxg gtxg7;
        Object object8;
        Collection collection6;
        String s12;
        byte[] arr_b6;
        Iterator iterator1;
        igkb igkb0;
        dtxs dtxs2;
        gtxc gtxc0;
        Object object5;
        hkas hkas4;
        Collection collection4;
        dtxs dtxs0;
        Collection collection2;
        hkas hkas2;
        String s4;
        gtxg gtxg5;
        gtxd gtxd5;
        byte[] arr_b4;
        hkas hkas1;
        Collection collection1;
        gtxd gtxd3;
        String s2;
        Collection collection0;
        gtxg gtxg3;
        Object object1;
        byte[] arr_b1;
        String s;
        dtxw dtxw0;
        gtxg gtxg1 = gtxg0;
        gtxd gtxd1 = gtxd0;
        if((ibrl0 instanceof dtxw)) {
            dtxw0 = (dtxw)ibrl0;
            int v = dtxw0.k;
            if((v & 0x80000000) == 0) {
                dtxw0 = new dtxw(this, ibrl0);
            }
            else {
                dtxw0.k = v - 0x80000000;
            }
        }
        else {
            dtxw0 = new dtxw(this, ibrl0);
        }
        Object object0 = dtxw0.i;
        ibrx ibrx0 = ibrx.a;
        switch(dtxw0.k) {
            case 0: {
                ibnx.b(object0);
                if(!dtqh.a()) {
                    return ibom.a;
                }
                if(hkat.a(gtxd1.m) != 4) {
                    throw new dtzv("Cannot refresh non OpenId4Vci mdoc", 10);
                }
                s = gtxg1.b;
                ibuq.e(s, "getProvisioningIdString(...)");
                ProvisioningId provisioningId0 = new ProvisioningId(s);
                evql evql0 = this.a.g(provisioningId0);
                dtxw0.a = gtxg1;
                dtxw0.b = gtxd1;
                arr_b1 = arr_b;
                dtxw0.c = arr_b1;
                dtxw0.d = s;
                dtxw0.k = 1;
                object1 = fsdk.a(evql0, dtxw0);
                if(object1 != ibrx0) {
                    goto label_42;
                }
                return ibrx0;
            }
            case 1: {
                String s1 = (String)dtxw0.d;
                byte[] arr_b2 = (byte[])dtxw0.c;
                gtxd gtxd2 = (gtxd)dtxw0.b;
                gtxg gtxg2 = (gtxg)dtxw0.a;
                ibnx.b(object0);
                s = s1;
                gtxg1 = gtxg2;
                arr_b1 = arr_b2;
                gtxd1 = gtxd2;
                object1 = ((ibnw)object0).a;
            label_42:
                ibnx.b(object1);
                if(((Collection)object1).isEmpty()) {
                    return ibom.a;
                }
                dtxw0.a = gtxg1;
                dtxw0.b = gtxd1;
                dtxw0.c = arr_b1;
                dtxw0.d = s;
                dtxw0.e = (Collection)object1;
                dtxw0.k = 2;
                Object object2 = this.d(gtxd1, dtxw0);
                if(object2 != ibrx0) {
                    gtxg3 = gtxg1;
                    collection0 = (Collection)object1;
                    s2 = s;
                    object0 = object2;
                    gtxd3 = gtxd1;
                    goto label_69;
                }
                return ibrx0;
            }
            case 2: {
                collection0 = (Collection)dtxw0.e;
                String s3 = (String)dtxw0.d;
                byte[] arr_b3 = (byte[])dtxw0.c;
                gtxd gtxd4 = (gtxd)dtxw0.b;
                gtxg gtxg4 = (gtxg)dtxw0.a;
                ibnx.b(object0);
                gtxg3 = gtxg4;
                gtxd3 = gtxd4;
                arr_b1 = arr_b3;
                s2 = s3;
            label_69:
                hkas hkas0 = (hkas)object0;
                dtxw0.a = gtxg3;
                dtxw0.b = gtxd3;
                dtxw0.c = arr_b1;
                dtxw0.d = s2;
                dtxw0.e = collection0;
                dtxw0.f = hkas0;
                dtxw0.k = 3;
                object0 = this.e(s2, dtxw0);
                if(object0 != ibrx0) {
                    collection1 = collection0;
                    hkas1 = hkas0;
                    goto label_89;
                }
                return ibrx0;
            }
            case 3: {
                hkas1 = (hkas)dtxw0.f;
                collection1 = (Collection)dtxw0.e;
                s2 = (String)dtxw0.d;
                arr_b1 = (byte[])dtxw0.c;
                gtxd3 = (gtxd)dtxw0.b;
                gtxg3 = (gtxg)dtxw0.a;
                ibnx.b(object0);
            label_89:
                dtxw0.a = gtxg3;
                dtxw0.b = gtxd3;
                dtxw0.c = arr_b1;
                dtxw0.d = s2;
                dtxw0.e = collection1;
                dtxw0.f = hkas1;
                dtxw0.g = (dtxs)object0;
                dtxw0.k = 4;
                Object object3 = this.f(s2, gtxd3, dtxw0);
                if(object3 != ibrx0) {
                    arr_b4 = arr_b1;
                    gtxd5 = gtxd3;
                    gtxg5 = gtxg3;
                    s4 = s2;
                    hkas2 = hkas1;
                    collection2 = collection1;
                    dtxs0 = (dtxs)object0;
                    object0 = object3;
                    goto label_123;
                }
                return ibrx0;
            }
            case 4: {
                dtxs dtxs1 = (dtxs)dtxw0.g;
                hkas hkas3 = (hkas)dtxw0.f;
                Collection collection3 = (Collection)dtxw0.e;
                String s5 = (String)dtxw0.d;
                byte[] arr_b5 = (byte[])dtxw0.c;
                gtxd gtxd6 = (gtxd)dtxw0.b;
                gtxg gtxg6 = (gtxg)dtxw0.a;
                ibnx.b(object0);
                dtxs0 = dtxs1;
                collection2 = collection3;
                hkas2 = hkas3;
                s4 = s5;
                gtxd5 = gtxd6;
                arr_b4 = arr_b5;
                gtxg5 = gtxg6;
            label_123:
                ByteString hfsf0 = hkas2.b;
                ibuq.e(hfsf0, "getIssuerToken(...)");
                dtxw0.a = gtxg5;
                dtxw0.b = gtxd5;
                dtxw0.c = arr_b4;
                dtxw0.d = s4;
                dtxw0.e = collection2;
                dtxw0.f = hkas2;
                dtxw0.g = dtxs0;
                dtxw0.l = (gtxc)object0;
                dtxw0.k = 5;
                icbk icbk0 = new icbk(ibsc.c(dtxw0), 1);
                icbk0.z();
                dtpm dtpm0 = new dtpm(icbk0);
                this.d.d(s4, hfsf0, dtpm0);
                Object object4 = icbk0.k();
                if(object4 == ibrx0) {
                    ibsi.b(dtxw0);
                }
                if(object4 != ibrx0) {
                    collection4 = collection2;
                    hkas4 = hkas2;
                    object5 = object4;
                    gtxc0 = (gtxc)object0;
                    dtxs2 = dtxs0;
                    goto label_162;
                }
                return ibrx0;
            }
            case 5: {
                gtxc0 = dtxw0.l;
                dtxs dtxs3 = (dtxs)dtxw0.g;
                hkas hkas5 = (hkas)dtxw0.f;
                Collection collection5 = (Collection)dtxw0.e;
                s4 = (String)dtxw0.d;
                arr_b4 = (byte[])dtxw0.c;
                gtxd5 = (gtxd)dtxw0.b;
                gtxg5 = (gtxg)dtxw0.a;
                ibnx.b(object0);
                hkas4 = hkas5;
                object5 = object0;
                dtxs2 = dtxs3;
                collection4 = collection5;
            label_162:
                String s6 = gtxc0.f;
                ibuq.e(s6, "getTransactionId(...)");
                if(s6.length() != 0) {
                    throw new ibnr("An operation is not implemented: Deferred transaction not supported");
                }
                String s7 = hkas4.g;
                ibuq.e(s7, "getCredentialIdentifier(...)");
                String s8 = hkas4.f;
                ibuq.e(s8, "getCredentialConfigurationId(...)");
                String s9 = ((hjzw)object5).b.toStringUtf8();
                KeyStore keyStore0 = eaqq.b();
                KeyPairGenerator keyPairGenerator0 = eaqq.a();
                keyPairGenerator0.initialize(new KeyGenParameterSpec.Builder("pay_open_id_attestation_key", 12).setDigests(new String[]{"SHA-256", "SHA-512"}).build());
                KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
                Certificate[] arr_certificate = keyStore0.getCertificateChain("pay_open_id_attestation_key");
                if(arr_certificate == null) {
                    throw new GeneralSecurityException("No certificates found for key");
                }
                dtxo dtxo0 = new dtxo(keyPair0, gged_interceptors.k(arr_certificate));
                JSONObject jSONObject0 = new JSONObject();
                JSONArray jSONArray0 = new JSONArray();
                Iterator iterator0 = collection4.iterator();
                while(iterator0.hasNext()) {
                    Object object6 = iterator0.next();
                    PublicKey publicKey0 = ((Certificate)object6).getPublicKey();
                    if(RSAPublicKey.class.isInstance(publicKey0)) {
                        igkb0 = new igkb(((RSAPublicKey)publicKey0));
                        iterator1 = iterator0;
                        jSONArray0.put(new JSONObject(igkb0.f(igjv.b)));
                        iterator0 = iterator1;
                        continue;
                    }
                    if(ECPublicKey.class.isInstance(publicKey0)) {
                        igkb0 = new igjt(((ECPublicKey)publicKey0));
                        iterator1 = iterator0;
                        jSONArray0.put(new JSONObject(igkb0.f(igjv.b)));
                        iterator0 = iterator1;
                        continue;
                    }
                    if(PublicKey.class.isInstance(publicKey0)) {
                        iterator1 = iterator0;
                        String s10 = publicKey0.getAlgorithm();
                        if(!igjy.d.contains(s10)) {
                            throw new iglc("Unsupported or unknown public key (alg=" + publicKey0.getAlgorithm() + ") " + publicKey0);
                        }
                        igkb0 = new igjy(publicKey0);
                        jSONArray0.put(new JSONObject(igkb0.f(igjv.b)));
                        iterator0 = iterator1;
                        continue;
                    }
                    iterator1 = iterator0;
                    if(PrivateKey.class.isInstance(publicKey0)) {
                        throw new iglc("A JsonWebKey instance needs to be created from a public or symmetric key.");
                    }
                    igkb0 = new igjz(publicKey0);
                    jSONArray0.put(new JSONObject(igkb0.f(igjv.b)));
                    iterator0 = iterator1;
                    continue;
                }
                jSONObject0.put("attested_keys", jSONArray0);
                jSONObject0.put("nonce", s9);
                jSONObject0.put("iat", System.currentTimeMillis() / 1000L);
                String s11 = jSONObject0.toString();
                igkm igkm0 = new igkm(null);
                igkm0.b("alg", "ES256");
                int v1 = ((ggna)dtxo0.b).c;
                X509Certificate[] arr_x509Certificate = new X509Certificate[v1];
                ggqk ggqk0 = dtxo0.b.E();
                for(int v2 = 0; v2 < v1; ++v2) {
                    Object object7 = ggqk0.next();
                    arr_x509Certificate[v2] = (X509Certificate)object7;
                }
                ArrayList arrayList0 = new ArrayList();
                try {
                    CertificateFactory.getInstance("X.509");
                }
                catch(CertificateException certificateException0) {
                    throw new IllegalStateException("Couldn\'t find X.509 CertificateFactory!?!", certificateException0);
                }
                for(int v3 = 0; v3 < v1; ++v3) {
                    arrayList0.add(igkv.a(arr_x509Certificate[v3]));
                }
                igkm0.b.b("x5c", arrayList0);
                igkm0.b("typ", "keyattestation+jwt");
                igkm0.g = igle.b(s11, igkm0.h);
                PrivateKey privateKey0 = dtxo0.a.getPrivate();
                if(privateKey0 != null) {
                    Key key0 = igkm0.d;
                    if(key0 != null) {
                        privateKey0.equals(key0);
                    }
                }
                igkm0.d = privateKey0;
                igkh igkh0 = igkm0.d();
                Key key1 = igkm0.d;
                igkh0.e(key1);
                igja igja0 = igkh0.c(key1, igkm0.f);
                if(igkm0.e()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        byteArrayOutputStream0.write(igle.a(igkm0.a()));
                        byteArrayOutputStream0.write(46);
                        byteArrayOutputStream0.write(igkm0.g);
                        arr_b6 = byteArrayOutputStream0.toByteArray();
                    }
                    catch(IOException iOException0) {
                        throw new iglc("This should never happen from a ByteArrayOutputStream", iOException0);
                    }
                }
                else {
                    arr_b6 = igle.a(igkk.a(new String[]{igkm0.a(), igkm0.c()}));
                }
                igkm0.c = igkm0.d().f(igja0, arr_b6);
                if(igkm0.e()) {
                    s12 = igle.c(igkm0.g);
                    if(s12.contains(".")) {
                        throw new iglc("per https://tools.ietf.org/html/rfc7797#section-5.2 when using the JWS Compact Serialization, unencoded non-detached payloads using period (\'.\') characters would cause parsing errors; such payloads MUST NOT be used with the JWS Compact Serialization.");
                    }
                }
                else {
                    s12 = igkm0.c();
                }
                dtxr dtxr0 = new dtxr(s7, s8, new dtxq(igkk.a(new String[]{igkm0.a(), s12, igkm0.a.a(igkm0.c)})), dtxs2);
                dtpl dtpl0 = this.d;
                String s13 = gtxc0.c;
                ibuq.e(s13, "getAccessToken(...)");
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("credential_identifier", dtxr0.a);
                jSONObject1.put("credential_configuration_id", dtxr0.b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("proof_type", "attestation");
                jSONObject2.put("attestation", dtxr0.c.a);
                jSONObject1.put("proof", jSONObject2);
                String s14 = jSONObject1.toString();
                ibuq.e(s14, "toString(...)");
                if(dtxs2.a != null) {
                    throw new ibnr("An operation is not implemented: Encryption not supported");
                }
                String s15 = gtxc0.c;
                ibuq.e(s15, "getAccessToken(...)");
                MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
                ibuq.e(messageDigest0, "getInstance(...)");
                byte[] arr_b7 = s15.getBytes(ibyo.a);
                ibuq.e(arr_b7, "getBytes(...)");
                byte[] arr_b8 = messageDigest0.digest(arr_b7);
                ibuq.e(arr_b8, "digest(...)");
                String s16 = dtyc.h(arr_b8);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("ath", dtyc.i(s16));
                byte[] arr_b9 = ((hjzw)object5).b.toByteArray();
                ibuq.e(arr_b9, "toByteArray(...)");
                jSONObject3.put("nonce", dtyc.h(arr_b9));
                String s17 = jSONObject3.toString();
                ibuq.e(s17, "toString(...)");
                String s18 = dtyc.i(s17);
                dtxw0 = dtxw0;
                dtxw0.a = gtxg5;
                dtxw0.b = gtxd5;
                dtxw0.c = s4;
                collection6 = collection4;
                dtxw0.d = collection6;
                dtxw0.e = gtxc0;
                dtxw0.f = null;
                dtxw0.g = null;
                dtxw0.l = null;
                dtxw0.k = 6;
                icbk icbk1 = new icbk(ibsc.c(dtxw0), 1);
                icbk1.z();
                dtpn dtpn0 = new dtpn(icbk1);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjzy.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hjzy hjzy0 = (hjzy)hftp0.b_message;
                s4.getClass();
                hjzy0.e = s4;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjzx.a).v_newBuilder();
                hkax hkax0 = dtpl0.h(null, s13, s18);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hjzx hjzx0 = (hjzx)hftp1.b_message;
                hkax0.getClass();
                hjzx0.e = hkax0;
                hjzx0.b |= 1;
                hkbf hkbf0 = dtpl.m(s14, 0x1B0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hjzx hjzx1 = (hjzx)hftp1.b_message;
                hkbf0.getClass();
                hjzx1.d = hkbf0;
                hjzx1.c = 2;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hjzy hjzy1 = (hjzy)hftp0.b_message;
                hjzx hjzx2 = (hjzx)hftp1.N_build();
                hjzx2.getClass();
                hjzy1.d = hjzx2;
                hjzy1.c = 7;
                if(arr_b4 != null) {
                    hkbg hkbg0 = dtpl.n(arr_b4, 437);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hjzy hjzy2 = (hjzy)hftp0.b_message;
                    hkbg0.getClass();
                    hjzy2.g = hkbg0;
                    hjzy2.b |= 4;
                }
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ggeo ggeo0 = dtpl.p();
                dptv.p(dtpl0.c, dpuj.n, ((MessageLite)hftv0), ((MessageLite)hkaa.a), dtpn0, ggeo0, 0L, gtmu.b);
                object0 = icbk1.k();
                if(object0 == ibrx.a) {
                    ibsi.b(dtxw0);
                }
                object8 = ibrx0;
                if(object0 != object8) {
                    gtxg7 = gtxg5;
                    s19 = s4;
                    gtxd7 = gtxd5;
                    goto label_366;
                }
                return object8;
            }
            case 6: {
                gtxc0 = (gtxc)dtxw0.e;
                Collection collection7 = (Collection)dtxw0.d;
                String s20 = (String)dtxw0.c;
                gtxd gtxd8 = (gtxd)dtxw0.b;
                gtxg gtxg8 = (gtxg)dtxw0.a;
                ibnx.b(object0);
                s19 = s20;
                gtxd7 = gtxd8;
                gtxg7 = gtxg8;
                collection6 = collection7;
                object8 = ibrx0;
            label_366:
                int v4 = 2;
                int v5 = (((hkaa)object0).c == 7 ? ((hjzz)((hkaa)object0).d) : hjzz.a).b;
                if(v5 == 0) {
                    v4 = 3;
                }
                else {
                    switch(v5) {
                        case 1: {
                            v4 = 1;
                            break;
                        }
                        case 2: {
                            break;
                        }
                        default: {
                            v4 = 0;
                        }
                    }
                }
                if(v4 == 0) {
                    throw null;
                }
                switch(v4 - 1) {
                    case 0: {
                        hjzz hjzz0 = ((hkaa)object0).c == 7 ? ((hjzz)((hkaa)object0).d) : hjzz.a;
                        heal heal0 = hjzz0.b == 1 ? ((heal)hjzz0.c) : heal.a;
                        ByteString hfsf1 = heal0.b == 1 ? ((ByteString)heal0.c) : ByteString.b;
                        ibuq.e(hfsf1, "getUnencryptedPayload(...)");
                        JSONObject jSONObject4 = new JSONObject(hfsf1.toStringUtf8());
                        String s21 = jSONObject4.optString("transaction_id");
                        ibuq.e(s21, "optString(...)");
                        if(s21.length() != 0) {
                            throw new ibnr("An operation is not implemented: Deferred transaction not supported");
                        }
                        String s22 = jSONObject4.optString("error");
                        ibuq.e(s22, "optString(...)");
                        if(s22.length() != 0) {
                            goto label_436;
                        }
                        String s23 = ((hkaa)object0).g;
                        ibuq.e(s23, "getVersionId(...)");
                        if(s23.length() == 0) {
                            throw new dtzv("No versionId in credential response", 13);
                        }
                        ArrayList arrayList1 = new ArrayList();
                        JSONArray jSONArray1 = jSONObject4.optJSONArray("credentials");
                        if(jSONArray1 == null) {
                            ibps0 = ibps.a;
                        }
                        else {
                            int v6 = jSONArray1.length();
                            if(v6 >= 0) {
                                int v7 = 0;
                                while(true) {
                                    JSONObject jSONObject5 = jSONArray1.optJSONObject(v7);
                                    if(jSONObject5 == null) {
                                        jSONArray2 = jSONArray1;
                                        s24 = null;
                                    }
                                    else {
                                        jSONArray2 = jSONArray1;
                                        s24 = jSONObject5.optString("credential");
                                    }
                                    if(s24 != null && s24.length() != 0) {
                                        try {
                                            arrayList1.add(ghjc.d.q(s24));
                                        }
                                        catch(IllegalArgumentException unused_ex) {
                                            ((ggtj)dtyc.c.j()).x("Failed to decode credential");
                                        }
                                    }
                                    if(v7 == v6) {
                                        break;
                                    }
                                    ++v7;
                                    jSONArray1 = jSONArray2;
                                }
                            }
                            ibps0 = arrayList1;
                        }
                        if(ibps0.isEmpty()) {
                            throw new dtzv("No MSOs in response", 19);
                        }
                        ibuq.c(collection6);
                        dtxw0.a = gtxg7;
                        dtxw0.b = gtxd7;
                        dtxw0.c = s19;
                        dtxw0.d = gtxc0;
                        dtxw0.e = (hkaa)object0;
                        dtxw0.f = s23;
                        dtxw0.g = ibps0;
                        dtxw0.k = 7;
                        if(this.g(s19, collection6, ibps0, dtxw0) != object8) {
                            hkaa0 = (hkaa)object0;
                            gtxc1 = gtxc0;
                            list0 = ibps0;
                            s25 = s23;
                            goto label_454;
                        label_436:
                            String s26 = String.format("Issuer error received \'%s\'", Arrays.copyOf(new Object[]{s22}, 1));
                            ibuq.e(s26, "format(...)");
                            throw new dtzv(s26, 17);
                        }
                        return object8;
                    }
                    case 1: {
                        break;
                    }
                    default: {
                        throw new dtzv("No response data", 18);
                    }
                }
                throw new ibnr("An operation is not implemented: Decryption not supported");
            }
            case 7: {
                list0 = (List)dtxw0.g;
                String s27 = (String)dtxw0.f;
                hkaa hkaa1 = (hkaa)dtxw0.e;
                gtxc gtxc2 = (gtxc)dtxw0.d;
                s19 = (String)dtxw0.c;
                gtxd7 = (gtxd)dtxw0.b;
                gtxg7 = (gtxg)dtxw0.a;
                ibnx.b(object0);
                gtxc1 = gtxc2;
                hkaa0 = hkaa1;
                s25 = s27;
                object8 = ibrx0;
            label_454:
                byte[] arr_b10 = (byte[])list0.get(list0.size() - 1);
                heal heal1 = hkaa0.i == null ? heal.a : hkaa0.i;
                if(heal1 == null) {
                    hfsf2 = gtxd7.h;
                    ibuq.e(hfsf2, "getDocumentAttributes(...)");
                }
                else {
                    hfsf2 = heal1.b == 1 ? ((ByteString)heal1.c) : ByteString.b;
                    if(hfsf2 == null) {
                        hfsf2 = gtxd7.h;
                        ibuq.e(hfsf2, "getDocumentAttributes(...)");
                    }
                }
                int v8 = dtss.a(arr_b10);
                gtxf gtxf0 = gtxf.b(gtxg7.h) == null ? gtxf.f : gtxf.b(gtxg7.h);
                evql evql1 = this.a.p(gtxf0, arr_b10);
                dtxw0.a = s19;
                dtxw0.b = gtxc1;
                dtxw0.c = hkaa0;
                dtxw0.d = s25;
                dtxw0.e = hfsf2;
                dtxw0.f = null;
                dtxw0.g = null;
                dtxw0.h = v8;
                dtxw0.k = 8;
                Object object9 = fsdk.a(evql1, dtxw0);
                if(object9 != object8) {
                    gtxc3 = gtxc1;
                    hfsf3 = hfsf2;
                    v9 = v8;
                    s28 = s19;
                    object10 = object9;
                    goto label_496;
                }
                return object8;
            }
            case 8: {
                int v10 = dtxw0.h;
                ByteString hfsf4 = (ByteString)dtxw0.e;
                s25 = (String)dtxw0.d;
                hkaa0 = (hkaa)dtxw0.c;
                gtxc gtxc4 = (gtxc)dtxw0.b;
                s28 = (String)dtxw0.a;
                ibnx.b(object0);
                object10 = ((ibnw)object0).a;
                v9 = v10;
                hfsf3 = hfsf4;
                object8 = ibrx0;
                gtxc3 = gtxc4;
            label_496:
                ibnx.b(object10);
                AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
                AtomicBoolean atomicBoolean1 = new AtomicBoolean(false);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                ProvisioningId provisioningId1 = new ProvisioningId(s28);
                dtxp dtxp0 = new dtxp(atomicBoolean0, atomicBoolean2, v9, atomicBoolean1, s25, hkaa0, hfsf3, gtxc3, ((gtwu)object10));
                atomicBoolean3 = atomicBoolean2;
                evql evql2 = this.e.a(provisioningId1, dtxp0);
                dtxw0.a = s28;
                dtxw0.b = hkaa0;
                dtxw0.c = atomicBoolean0;
                dtxw0.d = atomicBoolean1;
                dtxw0.e = atomicBoolean3;
                dtxw0.k = 9;
                object11 = fsdk.a(evql2, dtxw0);
                if(object11 != object8) {
                    atomicBoolean4 = atomicBoolean1;
                    atomicBoolean5 = atomicBoolean0;
                    hkaa2 = hkaa0;
                    s29 = s28;
                    break;
                }
                return object8;
            }
            case 9: {
                atomicBoolean3 = (AtomicBoolean)dtxw0.e;
                atomicBoolean4 = (AtomicBoolean)dtxw0.d;
                atomicBoolean5 = (AtomicBoolean)dtxw0.c;
                hkaa2 = (hkaa)dtxw0.b;
                s29 = (String)dtxw0.a;
                ibnx.b(object0);
                object11 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object11);
        if(atomicBoolean5.get()) {
            ProvisioningId provisioningId2 = new ProvisioningId(s29);
            OperatingStatus operatingStatus0 = new OperatingStatus();
            operatingStatus0.a = 3;
            this.a.b(provisioningId2, operatingStatus0);
            this.i.a(s29, this.l, this.j);
        }
        else if(atomicBoolean3.get()) {
            this.i.b(s29, this.l, this.j, false);
        }
        if(atomicBoolean4.get()) {
            String s30 = hkaa2.g;
            ibuq.e(s30, "getVersionId(...)");
            ebib ebib0 = this.f;
            String s31 = this.l;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtxl.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gtxl gtxl0 = (gtxl)hftp2.b_message;
            s30.getClass();
            gtxl0.b = s30;
            ebib0.e(s29, s31, ((gtxl)hftp2.N_build()));
        }
        dtrd dtrd0 = new dtrd("Clear credential from Credman on MSO refresh: Success", "Clear credential from Credman on MSO refresh: Failure");
        this.g.f(dtrd0);
        return ibom.a;
    }

    public final Object d(gtxd gtxd0, ibrl ibrl0) {
        dtxy dtxy0;
        if((ibrl0 instanceof dtxy)) {
            dtxy0 = (dtxy)ibrl0;
            int v = dtxy0.c;
            if((v & 0x80000000) == 0) {
                dtxy0 = new dtxy(this, ibrl0);
            }
            else {
                dtxy0.c = v - 0x80000000;
            }
        }
        else {
            dtxy0 = new dtxy(this, ibrl0);
        }
        Object object0 = dtxy0.a;
        Object object1 = ibrx.a;
        switch(dtxy0.c) {
            case 0: {
                ibnx.b(object0);
                dtpl dtpl0 = this.d;
                dtxy0.d = gtxd0;
                dtxy0.c = 1;
                icbk icbk0 = new icbk(ibsc.c(dtxy0), 1);
                icbk0.z();
                dtpp dtpp0 = new dtpp(icbk0);
                dpuj dpuj0 = dpuj.ak;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkal.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = dtpl0.l();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkal hkal0 = (hkal)hftp0.b_message;
                hkaw hkaw0 = (hkaw)hftp1.N_build();
                hkaw0.getClass();
                hkal0.c = hkaw0;
                hkal0.b |= 2;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                dptv.l(dtpl0.c, dpuj0, ((MessageLite)hftv0), ((MessageLite)hkam.a), dtpp0);
                object0 = icbk0.k();
                if(object0 == object1) {
                    ibsi.b(dtxy0);
                }
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                gtxd0 = dtxy0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        for(Object object2: ((hkam)object0).b) {
            Object object3 = (hkas)object2;
            if(ibuq.m(object3.e, (gtxd0.n == null ? gtxc.a : gtxd0.n).g)) {
                ibuq.c(object3);
                return object3;
            }
        }
        throw new dtzv("Issuer not supported", 12);
    }

    public final Object e(String s, ibrl ibrl0) {
        Object object3;
        Object object2;
        dtxz dtxz0;
        if((ibrl0 instanceof dtxz)) {
            dtxz0 = (dtxz)ibrl0;
            int v = dtxz0.c;
            if((v & 0x80000000) == 0) {
                dtxz0 = new dtxz(this, ibrl0);
            }
            else {
                dtxz0.c = v - 0x80000000;
            }
        }
        else {
            dtxz0 = new dtxz(this, ibrl0);
        }
        Object object0 = dtxz0.a;
        Object object1 = ibrx.a;
        dtxt dtxt0 = null;
        switch(dtxz0.c) {
            case 0: {
                ibnx.b(object0);
                dtpl dtpl0 = this.d;
                dtxz0.d = s;
                dtxz0.c = 1;
                icbk icbk0 = new icbk(ibsc.c(dtxz0), 1);
                icbk0.z();
                dtpo dtpo0 = new dtpo(icbk0);
                dpuj dpuj0 = dpuj.ai;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkag.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkag hkag0 = (hkag)hftp0.b_message;
                s.getClass();
                hkag0.b |= 4;
                hkag0.c = s;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                dptv.l(dtpl0.c, dpuj0, ((MessageLite)hftv0), ((MessageLite)hkah.a), dtpo0);
                object0 = icbk0.k();
                if(object0 == object1) {
                    ibsi.b(dtxz0);
                }
                if(object0 == object1) {
                    return object1;
                }
                goto label_38;
            }
            case 1: {
                s = dtxz0.d;
                ibnx.b(object0);
            label_38:
                ProvisioningId provisioningId0 = new ProvisioningId(s);
                byte[] arr_b = ((hkah)object0).toBytesArray();
                evql evql0 = this.a.o(provisioningId0, arr_b);
                dtxz0.d = null;
                dtxz0.c = 2;
                object2 = fsdk.a(evql0, dtxz0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_48;
            }
            case 2: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_48:
                ibnx.b(object2);
                evql evql1 = this.a.i(((CryptoSchemeId)object2));
                dtxz0.c = 3;
                object3 = fsdk.a(evql1, dtxz0);
                if(object3 == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object3);
        byte[] arr_b1 = ((SignedPublicKey)object3).a;
        if(arr_b1 == null) {
            ((ggtj)dtyc.c.h()).x("Signed public key was null for the crypto scheme");
        }
        if(arr_b1 != null) {
            dtxt0 = new dtxt(ByteString.copyFrom(arr_b1));
        }
        return new dtxs(dtxt0);
    }

    public final Object f(String s, gtxd gtxd0, ibrl ibrl0) {
        dtya dtya0;
        if((ibrl0 instanceof dtya)) {
            dtya0 = (dtya)ibrl0;
            int v = dtya0.c;
            if((v & 0x80000000) == 0) {
                dtya0 = new dtya(this, ibrl0);
            }
            else {
                dtya0.c = v - 0x80000000;
            }
        }
        else {
            dtya0 = new dtya(this, ibrl0);
        }
        Object object0 = dtya0.a;
        Object object1 = ibrx.a;
        switch(dtya0.c) {
            case 0: {
                ibnx.b(object0);
                Instant instant0 = Instant.now();
                ibuq.e(instant0, "now(...)");
                gtxc gtxc0 = gtxd0.n == null ? gtxc.a : gtxd0.n;
                ibuq.e(gtxc0, "getOpenId4VciParams(...)");
                Instant instant1 = Instant.ofEpochSecond(gtxc0.d);
                ibuq.e(instant1, "ofEpochSecond(...)");
                String s1 = gtxc0.c;
                ibuq.e(s1, "getAccessToken(...)");
                if(s1.length() != 0 && instant0.isAfter(instant1)) {
                    Object object2 = gtxd0.n == null ? gtxc.a : gtxd0.n;
                    ibuq.e(object2, "getOpenId4VciParams(...)");
                    return object2;
                }
                String s2 = gtxc0.e;
                ibuq.e(s2, "getRefreshToken(...)");
                if(s2.length() == 0) {
                    throw new dtzv("No refresh token", 11);
                }
                dtpl dtpl0 = this.d;
                String s3 = gtxc0.e;
                ibuq.e(s3, "getRefreshToken(...)");
                dtya0.c = 1;
                icbk icbk0 = new icbk(ibsc.c(dtya0), 1);
                icbk0.z();
                dtpq dtpq0 = new dtpq(icbk0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkbh.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkbh hkbh0 = (hkbh)hftp0.b_message;
                s.getClass();
                hkbh0.b |= 1;
                hkbh0.c = s;
                hkax hkax0 = dtpl0.h(s3, null, "fake_dpop");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkbh hkbh1 = (hkbh)hftp0.b_message;
                hkax0.getClass();
                hkbh1.d = hkax0;
                hkbh1.b |= 2;
                hkbh hkbh2 = (hkbh)hftp0.N_build();
                dptv.l(dtpl0.c, dpuj.ao, ((MessageLite)hkbh2), ((MessageLite)hkbi.a), dtpq0);
                object0 = icbk0.k();
                if(object0 == object1) {
                    ibsi.b(dtya0);
                }
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s4 = ((hkbi)object0).b;
        ibuq.e(s4, "getAccessToken(...)");
        if(s4.length() == 0) {
            throw new dtzv("Invalid access token", 14);
        }
        if(((hkbi)object0).d <= 0L) {
            throw new dtzv("Invalid access token expiry", 15);
        }
        long v1 = ((hkbi)object0).d;
        Instant instant2 = Instant.ofEpochMilli(System.currentTimeMillis()).plusSeconds(v1);
        ibuq.e(instant2, "plusSeconds(...)");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtxc.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        String s5 = ((hkbi)object0).b;
        ibuq.e(s5, "getAccessToken(...)");
        ibuq.f(s5, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtxc gtxc1 = (gtxc)hftp1.b_message;
        s5.getClass();
        gtxc1.b |= 1;
        gtxc1.c = s5;
        long v2 = instant2.getEpochSecond();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtxc gtxc2 = (gtxc)hftp1.b_message;
        gtxc2.b |= 2;
        gtxc2.d = v2;
        String s6 = ((hkbi)object0).c;
        ibuq.e(s6, "getRefreshToken(...)");
        if(s6.length() != 0) {
            String s7 = ((hkbi)object0).c;
            ibuq.e(s7, "getRefreshToken(...)");
            ibuq.f(s7, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gtxc gtxc3 = (gtxc)hftp1.b_message;
            s7.getClass();
            gtxc3.b |= 4;
            gtxc3.e = s7;
        }
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gtxc)hftv0;
    }

    public final Object g(String s, Collection collection0, List list0, ibrl ibrl0) {
        Object object4;
        Object object2;
        dtyb dtyb0;
        if((ibrl0 instanceof dtyb)) {
            dtyb0 = (dtyb)ibrl0;
            int v = dtyb0.d;
            if((v & 0x80000000) == 0) {
                dtyb0 = new dtyb(this, ibrl0);
            }
            else {
                dtyb0.d = v - 0x80000000;
            }
        }
        else {
            dtyb0 = new dtyb(this, ibrl0);
        }
        Object object0 = dtyb0.b;
        Object object1 = ibrx.a;
        switch(dtyb0.d) {
            case 0: {
                ibnx.b(object0);
                if(collection0.size() != list0.size()) {
                    ((ggtj)dtyc.c.j()).x("Proofs and MSOs sizes do not match");
                }
                int v1 = 0;
                List list1 = list0.subList(0, Math.min(collection0.size(), list0.size()));
                object2 = new ArrayList(ibpo.q(list1, 10));
                for(Object object3: list1) {
                    if(v1 < 0) {
                        ibpo.m();
                    }
                    ((Collection)object2).add(new AuthenticationData(((Certificate)ibpo.P(collection0, v1)).getEncoded(), ((byte[])object3), duao.a(((byte[])object3))));
                    ++v1;
                }
                ProvisioningId provisioningId0 = new ProvisioningId(s);
                evql evql0 = this.a.t(provisioningId0, ((List)object2));
                dtyb0.e = s;
                dtyb0.a = object2;
                dtyb0.d = 1;
                object4 = fsdk.a(evql0, dtyb0);
                if(object4 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                Object object5 = dtyb0.a;
                String s1 = dtyb0.e;
                ibnx.b(object0);
                object4 = ((ibnw)object0).a;
                object2 = object5;
                s = s1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object4);
        AuthenticationData authenticationData0 = (AuthenticationData)ibpo.R(((List)object2));
        this.f.d(s, this.l, authenticationData0);
        return ibom.a;
    }

    private static final String h(byte[] arr_b) {
        return ghjc.d.o(arr_b);
    }

    private static final String i(String s) {
        byte[] arr_b = s.getBytes(ibyo.a);
        ibuq.e(arr_b, "getBytes(...)");
        return dtyc.h(arr_b);
    }
}

