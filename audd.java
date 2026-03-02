import android.content.Context;
import android.util.Base64;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import j..time.Duration;
import j..time.Instant;
import j..util.DateRetargetClass;
import j..util.DesugarDate;
import j..util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException.BasicReason;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class audd extends auqv {
    public static final String a;
    public byte[] b;
    public final Object c;
    public final Context d;
    public final auaf e;
    public final auxc f;
    public byte[] g;
    final auby h;
    private static final bboh i;
    private static final String[] j;
    private static final byte[] k;
    private static HashSet l;
    private static CertificateFactory m;
    private final CastDevice q;
    private int r;

    static {
        audd.i = bboh.b("DeviceAuthChannel", bbcu.cn);
        audd.a = "urn:x-cast:com.google.cast.tp.deviceauth";
        audd.j = new String[]{"success", "success with CRL download error", "success with invalid auth response CRL", "success with empty invalid auth response CRL", "success with time invalid auth response CRL", "success with allowed cert expiry", "error received", "client auth cert malformed", "client auth cert not X509", "client auth cert not trusted", "SSL cert not trusted", "response malformed", "device capability not supported", "CRL is invalid", "Empty CRL is invalid", "Crl is time invalid", "CRL revocation check failed", "Downloaded CRL revocation check failed", "peer certificate DER is invalid"};
        audd.k = new byte[]{6, 10, 43, 6, 1, 4, 1, -42, 0x79, 2, 5, 2};
        try {
            audd.l = new HashSet();
            audd.m = CertificateFactory.getInstance("X.509");
            X509Certificate x509Certificate0 = aude.b("MIIDwzCCAqugAwIBAgIBATANBgkqhkiG9w0BAQUFADB8MQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzETMBEGA1UECgwKR29vZ2xlIEluYzESMBAGA1UECwwJR29vZ2xlIFRWMRcwFQYDVQQDDA5FdXJla2EgUm9vdCBDQTAeFw0xMjEyMTcyMjM5MzNaFw0zMjEyMTIyMjM5MzNaMHwxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRMwEQYDVQQKDApHb29nbGUgSW5jMRIwEAYDVQQLDAlHb29nbGUgVFYxFzAVBgNVBAMMDkV1cmVrYSBSb290IENBMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuRHQ6hLcMuHfXDNrGXMdnZ7QOXa/pYQJpv1ubencjzZO6YgCvZ/06ET9TPWaAlZqRypjbFhFzHxmJNx5ecMqpLKLoPeitc0Gftu+7AyG8g0kYHSEyikjhALYp+078ewmR1TjsS3mZA/2csXpmFIXwPzyLCDIQPhHyTKeO5exi/WYJHBjZhnBUugEBT1fjbzYS693mG8feNG2UCdN5OwUaWcfWK+poBEmPJQyB3/X6Wkfrj9PY4qPidbyGXhcIY6xtlfYwOHufW7d8ToKavG6//mDL9y1pCAXYzbvyGIZzFbOsuoxiUt4WMG/AxOZ4BLyiKqblNrddnkXHjTRCsQHRQIDAQABo1AwTjAdBgNVHQ4EFgQURE4qR1jYuUiR9k/OdKkdMpqNjekwHwYDVR0jBBgwFoAURE4qR1jYuUiR9k/OdKkdMpqNjekwDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQUFAAOCAQEAP8gmoG5cBUB5oZipM95odIXurrccM1mwEd6f9E/T61EJfUd+blGF9FTNg5glsbqwV+yT2xLi7FFJepZzm8iWbYWM0+E9+jLiWAx3bYcMNAGqMKl24MDn214b6RAwpOAJSSa5WM1aB+VQdd6aO/ZTfrFTXkUnTxfjCDOyUAq79PwllyneQXUw+nc4qmWKc0/qEXvrfBdgJw68PnZS2IvtGvjrN7sR/a5wFwr+4K0Gsx9pinIEwsAzC9YvY0wzERS4YjaIxQNlARmj7wC7bw6S/zQcodYx0Fxen5l9x8q9fHIL9Fylfm4EqNKZLFEBFP6iSPB+voQNtNPi8w593ov1Mw==");
            audd.l.add(new TrustAnchor(x509Certificate0, null));
            X509Certificate x509Certificate1 = aude.b("MIIDxTCCAq2gAwIBAgIBAjANBgkqhkiG9w0BAQUFADB1MQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzETMBEGA1UECgwKR29vZ2xlIEluYzENMAsGA1UECwwEQ2FzdDEVMBMGA1UEAwwMQ2FzdCBSb290IENBMB4XDTE0MDQwMjE3MzQyNloXDTM0MDMyODE3MzQyNlowdTELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxEzARBgNVBAoMCkdvb2dsZSBJbmMxDTALBgNVBAsMBENhc3QxFTATBgNVBAMMDENhc3QgUm9vdCBDQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBALrZZZ3aOdPBd/bU0K6PWAhoOUqV7XDP/XkIqarl6binLaBnR4qeyc9wswWHaRHscJiXw+bDw+u9xrA9/E/BXjif2s9zMAZbeTfBXoyHR5SaQZIq1pXEcVwnXQixgMaSvRvjQZeh7HWfVZ4+n48cx2VkB9OzlqEEn5HE3gp7bNnIwHgxoBlCqeiD48788c7CLiRGlQkZysBGsuUButdP87/2aa2ZBPqgBzkO5t9RRwfA5KlcS5TFL7OgMH/nlWuyrzIN8YzVbct7R6cIq8sno03PSlrxBdH4YsUQKnRpquZLlvub2GPkWGbTrYpu/3te+aVWHi2CMVvw4iTmQUofrhMCAwEAAaNgMF4wDwYDVR0TBAgwBgEB/wIBAjAdBgNVHQ4EFgQUfJoefd95VLzXzF7KmYZFeWV0KBkwHwYDVR0jBBgwFoAUfJoefd95VLzXzF7KmYZFeWV0KBkwCwYDVR0PBAQDAgEGMA0GCSqGSIb3DQEBBQUAA4IBAQCA9Fr7PSgZUSDX1PsSl0pl8lg1kncwavHXtlEaf5rNx3sDQq1VagCv8OEGwr1reHXb/kERU0o5u5o6xlk0Lywz47LWXI/deOtxWznag5DFMeI/I+/a6ystd17ew0PSyWtZgsrV7fqhZFvL8Q0aYuGc6KcYcPBfF5b47Ybbrh3gzz5dLu4WbZUrPP2X8wVaJGhNObb45Fi69eAmeFHFW11OCeVsR4t6Wi6JU+bMNlsmPPhyQwKC0ivN8NOj7BM+UtWDPQfcHUNlejMCAaPOt9ZgUTsJwiOKMv6YGWBik4XNNEbb1SMPedp3ACoCbYNYzgN3NeGjIJPCSqKkRhx1LB9N");
            audd.l.add(new TrustAnchor(x509Certificate1, null));
        }
        catch(CertificateException certificateException0) {
            a.ae(audd.i.i(), "Error parsing built-in cert.", certificateException0);
        }
    }

    public audd(auby auby0, Context context0, CastDevice castDevice0, auxc auxc0, auaf auaf0, String s) {
        Objects.requireNonNull(auby0);
        this.h = auby0;
        super(audd.a, "DeviceAuthChannel", s);
        this.c = new Object();
        this.d = context0;
        this.q = castDevice0;
        this.f = auxc0;
        this.e = auaf0;
    }

    public static int a(byte[] arr_b, boolean z, TrustAnchor trustAnchor0, CertPath certPath0, long v, aurs aurs0) {
        if(arr_b != null) {
            geko geko0 = gekh.a(new audc(aurs0), true, geke.a);
            try {
                gekk gekk0 = geko0.a(arr_b, v);
            }
            catch(gekl unused_ex) {
                aurs0.j("Outcome Crl time invalid. Crl comes from auth response: %b", new Object[]{Boolean.valueOf(z)});
                return 15;
            }
            if(gekk0 == null) {
                aurs0.c("Outcome CRL invalid. Crl comes from auth response: %b", new Object[]{Boolean.valueOf(z)});
                return arr_b.length == 0 ? 14 : 13;
            }
            if(!gekk0.a(certPath0, trustAnchor0, v)) {
                aurs0.c("Outcome CRL revocation check failed. Crl comes from auth response: %b", new Object[]{Boolean.valueOf(z)});
                return z ? 16 : 17;
            }
            return 0;
        }
        return 1;
    }

    public static evql b(Context context0) {
        ProtoLiteMessage hftv0;
        hfsl hfsl0;
        hftc hftc0;
        byte[] arr_b;
        FileInputStream fileInputStream0;
        Object object1;
        evqp evqp0 = new evqp();
        aucw aucw0 = aucw.a();
        Context context1 = context0.getApplicationContext();
        evqp evqp1 = new evqp();
        synchronized(aucw0.b) {
            File file0 = aucw0.c(context1);
            object1 = null;
            if(file0 == null) {
            }
            else if(!file0.exists()) {
                aucw.a.m("A downloaded CRL bundle file does not exist.");
            }
            else {
                aucw.a.m("Reading bytes from downloaded file.");
                try {
                    fileInputStream0 = new FileInputStream(file0);
                    arr_b = ghjj.g(fileInputStream0);
                    goto label_22;
                }
                catch(IOException iOException0) {
                    goto label_25;
                }
            }
            goto label_92;
        }
        try {
            arr_b = ghjj.g(fileInputStream0);
            goto label_22;
        }
        catch(Throwable throwable1) {
            try {
                fileInputStream0.close();
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    try {
                        throwable1.addSuppressed(throwable2);
                        throw throwable1;
                    label_22:
                        fileInputStream0.close();
                        goto label_30;
                    }
                    catch(IOException iOException0) {
                    label_25:
                        aucw.a.e(iOException0, "Failed to read bytes from downloaded file.", new Object[0]);
                        goto label_92;
                    }
                }
                catch(Throwable throwable0) {
                }
            }
        }
        throw throwable0;
    label_30:
        geko geko0 = gekh.a(new geki(), true, geke.a);
        long v = Duration.ofMillis(System.currentTimeMillis()).toSeconds();
        try {
            gekk gekk0 = geko0.a(arr_b, v);
        }
        catch(gekl unused_ex) {
            aucw.a.g("CRL verification failed.", new Object[0]);
            goto label_92;
        }
        if(gekk0 == null) {
            aucw.a.g("CRL verification failed.", new Object[0]);
        }
        else {
            gehe gehe0 = aucw0.b(arr_b);
            if(gehe0 == null) {
                aucw.a.d("Failed to parse CRL bundle from bytes. Verification failed.", new Object[0]);
            }
            else {
                try {
                    Iterator iterator0 = gehe0.b.iterator();
                    while(true) {
                    label_40:
                        if(!iterator0.hasNext()) {
                            goto label_87;
                        }
                        Object object2 = iterator0.next();
                        ByteString hfsf0 = ((gehd)object2).c;
                        hftc0 = hftc.a();
                        hfsl0 = hfsf0.k();
                        hftv0 = ((ProtoLiteMessage)gehg.a).x_newMutableInstance();
                        break;
                    }
                }
                catch(hfur hfur0) {
                    aucw.a.e(hfur0, "Failed to parse TbsCrl.", new Object[0]);
                    goto label_87;
                }
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv0);
                    goto label_69;
                }
                catch(hfur hfur1) {
                }
                catch(hfwr hfwr0) {
                    goto label_56;
                }
                catch(IOException iOException1) {
                    goto label_60;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_66;
                }
                try {
                    if(hfur1.b) {
                        hfur1 = new hfur(hfur1);
                    }
                    hfur1.a = hftv0;
                    throw hfur1;
                label_56:
                    hfur hfur2 = hfwr0.a();
                    hfur2.a = hftv0;
                    throw hfur2;
                label_60:
                    if((iOException1.getCause() instanceof hfur)) {
                        throw (hfur)iOException1.getCause();
                    }
                    hfur hfur3 = new hfur(iOException1);
                    hfur3.a = hftv0;
                    throw hfur3;
                label_66:
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                catch(hfur hfur0) {
                    aucw.a.e(hfur0, "Failed to parse TbsCrl.", new Object[0]);
                    goto label_87;
                }
                try {
                label_69:
                    hfsl0.z(0);
                    goto label_74;
                }
                catch(hfur hfur4) {
                    try {
                        hfur4.a = hftv0;
                        throw hfur4;
                    label_74:
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        if(((gehg)hftv0).b != 0L) {
                            goto label_40;
                        }
                        long v1 = ((gehg)hftv0).d * 1000L;
                        goto label_81;
                    }
                    catch(hfur hfur0) {
                    }
                }
                aucw.a.e(hfur0, "Failed to parse TbsCrl.", new Object[0]);
                goto label_87;
            label_81:
                if(System.currentTimeMillis() < v1 - 259200000L) {
                    aucw.a.m("CRL bundle verified.");
                    object1 = gehe0;
                }
                else {
                    aucw.a.m("The last downloaded CRL bundle has expired.");
                    goto label_92;
                label_87:
                    aucw.a.m("The last downloaded CRL bundle has expired.");
                }
            }
        }
    label_92:
        if(object1 == null) {
            atzn.a().execute(new aucu(aucw0, context1, evqp1));
        }
        else {
            evqp1.b(object1);
        }
        aucz aucz0 = new aucz(evqp0);
        evqp1.a.b(aucz0);
        return evqp0.a;
    }

    public static evql d(Context context0, gegx gegx0, byte[] arr_b, byte[] arr_b1, CastDevice castDevice0, aurs aurs0) {
        boolean z;
        byte[] arr_b4;
        TrustAnchor trustAnchor0;
        PublicKey publicKey0;
        Date date0;
        CertPath certPath0;
        evqp evqp0 = new evqp();
        if(arr_b1 == null) {
            evqp0.b(Integer.valueOf(18));
            return evqp0.a;
        }
        byte[] arr_b2 = gegx0.g.toByteArray();
        int v = arr_b2 == null || arr_b2.length == 0 ? 1 : 0;
        if(((Boolean)avij.e().c.mr()).booleanValue()) {
        label_9:
            if(!Arrays.equals(arr_b2, arr_b)) {
                aurs0.c("%s sender nonce received", new Object[]{(1 == v ? "Empty" : "Unmatched")});
                evqp0.b(Integer.valueOf(11));
                return evqp0.a;
            }
        }
        else if(v == 0) {
            v = 0;
            goto label_9;
        }
        ArrayList arrayList0 = new ArrayList();
        try {
            if(gegx0.d.size() != 0) {
                arrayList0.add(aude.c(gegx0.d.toByteArray()));
            }
            for(Object object0: gegx0.e) {
                arrayList0.add(aude.c(((ByteString)object0).toByteArray()));
            }
        }
        catch(CertificateException certificateException0) {
            audd.p(aurs0, certificateException0);
            evqp0.b(Integer.valueOf(7));
            return evqp0.a;
        }
        catch(ClassCastException classCastException0) {
            audd.p(aurs0, classCastException0);
            evqp0.b(Integer.valueOf(8));
            return evqp0.a;
        }
        if(arrayList0.isEmpty()) {
            evqp0.b(Integer.valueOf(7));
            return evqp0.a;
        }
        try {
            certPath0 = audd.m.generateCertPath(arrayList0);
            PKIXParameters pKIXParameters0 = new PKIXParameters(audd.l);
            pKIXParameters0.setRevocationEnabled(false);
            if(hqrp.c() && !arrayList0.isEmpty()) {
                X509Certificate x509Certificate0 = (X509Certificate)arrayList0.get(0);
                Instant instant0 = DateRetargetClass.toInstant(x509Certificate0.getNotAfter());
                long v1 = Duration.between(DateRetargetClass.toInstant(x509Certificate0.getNotBefore()), DateRetargetClass.toInstant(x509Certificate0.getNotAfter())).toSeconds();
                Instant instant1 = DateRetargetClass.toInstant(x509Certificate0.getNotAfter()).plusSeconds(473040000L);
                Instant instant2 = instant0;
                for(Object object1: arrayList0) {
                    X509Certificate x509Certificate1 = (X509Certificate)object1;
                    if(DateRetargetClass.toInstant(x509Certificate1.getNotAfter()).isBefore(instant2)) {
                        instant2 = DateRetargetClass.toInstant(x509Certificate1.getNotAfter());
                    }
                    v1 = Math.min(v1, Duration.between(DateRetargetClass.toInstant(x509Certificate1.getNotBefore()), DateRetargetClass.toInstant(x509Certificate1.getNotAfter())).toSeconds());
                }
                if(audd.r(castDevice0)) {
                    date0 = DesugarDate.from(instant2.minus(Duration.ofDays(7L)));
                }
                else {
                    Instant instant3 = Instant.now();
                    date0 = instant2.isBefore(instant3) && instant3.isBefore(instant1) && v1 > 157680000L ? DesugarDate.from(instant2.minus(Duration.ofDays(7L))) : null;
                }
            }
            else {
                date0 = null;
            }
            if(date0 != null) {
                pKIXParameters0.setDate(date0);
            }
            PKIXCertPathValidatorResult pKIXCertPathValidatorResult0 = (PKIXCertPathValidatorResult)CertPathValidator.getInstance("PKIX").validate(certPath0, pKIXParameters0);
            publicKey0 = pKIXCertPathValidatorResult0.getPublicKey();
            trustAnchor0 = pKIXCertPathValidatorResult0.getTrustAnchor();
        }
        catch(CertificateException | InvalidAlgorithmParameterException | NoSuchAlgorithmException exception0) {
            audd.p(aurs0, exception0);
            evqp0.b(Integer.valueOf(7));
            return evqp0.a;
        }
        catch(CertPathValidatorException certPathValidatorException0) {
            if(!hqrp.c() && (audd.r(castDevice0) && certPathValidatorException0.getReason() == CertPathValidatorException.BasicReason.EXPIRED)) {
                audd.q(aurs0, certPathValidatorException0, audd.o(certPathValidatorException0) + " (ignored)");
                evqp0.b(Integer.valueOf(5));
                return evqp0.a;
            }
            audd.p(aurs0, certPathValidatorException0);
            evqp0.b(Integer.valueOf(9));
            return evqp0.a;
        }
        byte[] arr_b3 = gegx0.i.toByteArray();
        evqp evqp1 = new evqp();
        long v2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if(arr_b3.length == 0) {
            arr_b4 = arr_b3;
            z = false;
        }
        else {
            arr_b4 = arr_b3;
            z = true;
        }
        if(!z) {
            aurs0.c("CRL bundle from response is empty.", new Object[0]);
        }
        (arr_b3.length == 0 ? audd.b(context0) : evrg.d(arr_b4)).b(new audb(z, trustAnchor0, certPath0, v2, aurs0, context0, evqp1));
        aucy aucy0 = (Integer integer0) -> // This method was un-flattened
        {
            if(!audd.i(integer0.intValue())) {
                evqp0.b(integer0);
                return;
            }
            String s = audd.e(gegx0);
            if(s == null) {
                aurs0.d("Invalid algorithm", new Object[0]);
                evqp0.b(Integer.valueOf(11));
                return;
            }
            try {
                Signature signature0 = Signature.getInstance(s);
                signature0.initVerify(publicKey0);
                signature0.update(arr_b2);
                signature0.update(arr_b1);
                if(!signature0.verify(gegx0.c.toByteArray())) {
                    evqp0.b(Integer.valueOf(10));
                    return;
                }
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                a.e(audd.i.i(), "NoSuchAlgorithm: %s", s, noSuchAlgorithmException0);
                audd.p(aurs0, noSuchAlgorithmException0);
                evqp0.b(Integer.valueOf(11));
                return;
            }
            catch(InvalidKeyException invalidKeyException0) {
                audd.p(aurs0, invalidKeyException0);
                evqp0.b(Integer.valueOf(7));
                return;
            }
            catch(SignatureException signatureException0) {
                audd.p(aurs0, signatureException0);
                evqp0.b(Integer.valueOf(10));
                return;
            }
            if(castDevice0 != null && castDevice0.i(1)) {
                int v = arrayList0.size();
                int v1 = 0;
                while(v1 < v) {
                    X509Certificate x509Certificate0 = (X509Certificate)arrayList0.get(v1);
                    byte[] arr_b2 = audd.k;
                    byte[] arr_b3 = x509Certificate0.getExtensionValue("2.5.29.32");
                    if(arr_b3 != null) {
                        int v2 = 0;
                    label_37:
                        while(v2 < arr_b3.length - 11) {
                            int v3 = 0;
                            while(v3 < 12) {
                                if(arr_b3[v2 + v3] == arr_b2[v3]) {
                                    ++v3;
                                    continue;
                                }
                                ++v2;
                                continue label_37;
                            }
                            if(v2 < 0) {
                                break;
                            }
                            evqp0.b(Integer.valueOf(12));
                            return;
                        }
                    }
                    ++v1;
                }
            }
            evqp0.b(integer0);
        };
        evqp1.a.b(aucy0);
        return evqp0.a;
    }

    public static String e(gegx gegx0) {
        String s;
        int v = 1;
        switch((gehc.a(gegx0.f) == 0 ? 2 : gehc.a(gegx0.f)) - 1) {
            case 1: {
                s = "withRSA";
                break;
            }
            case 2: {
                s = "withRSAandMGF1";
                break;
            }
            default: {
                return null;
            }
        }
        int v1 = geha.a(gegx0.h);
        if(v1 != 0) {
            v = v1;
        }
        return v - 1 == 0 ? "SHA1" + s : "SHA256" + s;
    }

    @Override  // auqv
    public final void g(byte[] arr_b) {
        byte[] arr_b1;
        gegy gegy0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gegy.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gegy0 = (gegy)hftv0;
        }
        catch(hfur hfur0) {
            this.n.c("Received an unparseable protobuf (ignored): %s", new Object[]{hfur0.getMessage()});
            return;
        }
        if(arr_b.length <= 0x1000) {
            try {
                this.n.c("Received a protobuf: %s", new Object[]{((ProtoLiteMessage)gegy0).toString()});
            }
            catch(OutOfMemoryError unused_ex) {
                this.n.c("Received a very long protobuf", new Object[0]);
            }
        }
        else {
            this.n.c("Received a very long protobuf", new Object[0]);
        }
        int v = gegy0.b;
        if((v & 1) == 0) {
            if((v & 4) != 0) {
                gegw gegw0 = gegy0.e == null ? gegw.a : gegy0.e;
                this.r = gegv.a(gegw0.b) == 0 ? 1 : gegv.a(gegw0.b);
                this.h(6);
                return;
            }
            if((v & 2) != 0) {
                gegx gegx0 = gegy0.d == null ? gegx.a : gegy0.d;
                synchronized(this.c) {
                    arr_b1 = this.b;
                }
                byte[] arr_b2 = this.g;
                batl.s(arr_b2);
                audd.d(this.d, gegx0, arr_b1, arr_b2, this.q, this.n).b((/* MISSING LAMBDA PARAMETER */) -> {
                    gket gket0;
                    int v1;
                    boolean z = false;
                    if(audd.i(((Integer)object0).intValue())) {
                        this.n.c("Device authentication succeeded.", new Object[0]);
                    }
                    else if(((Integer)object0).intValue() == 6) {
                        this.n.c(String.format(Locale.ROOT, "Device authentication failed: %s - %s", audd.j[6], (this.r == 0 ? "null" : Integer.toString(this.r - 1))), new Object[0]);
                    }
                    else {
                        this.n.c(String.format(Locale.ROOT, "Device authentication failed: %d - %s", ((Integer)object0).intValue(), (((Integer)object0).intValue() < 0 || ((Integer)object0).intValue() > 18 ? "none/unknown" : audd.j[((Integer)object0).intValue()])), new Object[0]);
                    }
                    aucd aucd0 = this.h.a;
                    audd audd0 = aucd0.s;
                    if(audd0 != null) {
                        aucd0.Y(audd0);
                        aucd0.s = null;
                    }
                    if(audd.i(((Integer)object0).intValue())) {
                        this.n.c("authentication succeeded", new Object[0]);
                        if(((Integer)object0).intValue() == 1) {
                            z = true;
                        }
                        aucd0.I(z);
                        return;
                    }
                    if(aucd0.i) {
                        aucd0.k.n("Show an error message on the receiver due to auth failure (%d)", Integer.valueOf(((Integer)object0).intValue()));
                        aucd0.D();
                        LaunchOptions launchOptions0 = new LaunchOptions();
                        launchOptions0.a = true;
                        aucd0.L(aucd0.j, launchOptions0);
                        if(aucd0.z() != null) {
                            auct auct0 = aucd0.q;
                            if(auct0 != null) {
                                auct0.d();
                            }
                        }
                    }
                    switch(((Integer)object0).intValue()) {
                        case 0: {
                            v1 = 0;
                            break;
                        }
                        case 1: {
                            v1 = 0x8EF;
                            break;
                        }
                        case 2: {
                            v1 = 0x8F2;
                            break;
                        }
                        case 3: {
                            v1 = 0x8F3;
                            break;
                        }
                        case 4: {
                            v1 = 0x8F4;
                            break;
                        }
                        case 6: {
                            v1 = 0x8E5;
                            break;
                        }
                        case 7: {
                            v1 = 0x8E6;
                            break;
                        }
                        case 8: {
                            v1 = 0x8E7;
                            break;
                        }
                        case 9: {
                            v1 = 2280;
                            break;
                        }
                        case 10: {
                            v1 = 0x8E9;
                            break;
                        }
                        case 11: {
                            v1 = 0x8EA;
                            break;
                        }
                        case 12: {
                            v1 = 0x8EB;
                            break;
                        }
                        case 13: {
                            v1 = 0x8EC;
                            break;
                        }
                        case 14: {
                            v1 = 0x8F0;
                            break;
                        }
                        case 15: {
                            v1 = 0x8F5;
                            break;
                        }
                        case 16: {
                            v1 = 0x8ED;
                            break;
                        }
                        case 17: {
                            v1 = 0x8F1;
                            break;
                        }
                        case 18: {
                            v1 = 0x8EE;
                            break;
                        }
                        default: {
                            v1 = 0x8CF;
                        }
                    }
                    switch(((Integer)object0).intValue()) {
                        case 6: {
                            gket0 = gket.h;
                            break;
                        }
                        case 7: {
                            gket0 = gket.i;
                            break;
                        }
                        case 8: {
                            gket0 = gket.j;
                            break;
                        }
                        case 9: {
                            gket0 = gket.k;
                            break;
                        }
                        case 10: {
                            gket0 = gket.l;
                            break;
                        }
                        case 11: {
                            gket0 = gket.m;
                            break;
                        }
                        case 13: {
                            gket0 = gket.q;
                            break;
                        }
                        case 14: {
                            gket0 = gket.r;
                            break;
                        }
                        case 15: {
                            gket0 = gket.s;
                            break;
                        }
                        case 16: {
                            gket0 = gket.t;
                            break;
                        }
                        case 17: {
                            gket0 = gket.u;
                            break;
                        }
                        default: {
                            gket0 = gket.g;
                        }
                    }
                    aucd0.K(v1, false, gket0);
                });
                return;
            }
            this.n.c("Received DeviceAuthMessage with no response (ignored).", new Object[0]);
            return;
        }
        this.n.c("Received DeviceAuthMessage with challenge instead of response (ignored).", new Object[0]);
    }

    // Detected as a lambda impl.
    public final void h(int v) {
        gket gket0;
        int v1;
        boolean z = false;
        if(audd.i(v)) {
            this.n.c("Device authentication succeeded.", new Object[0]);
        }
        else if(v == 6) {
            this.n.c(String.format(Locale.ROOT, "Device authentication failed: %s - %s", audd.j[6], (this.r == 0 ? "null" : Integer.toString(this.r - 1))), new Object[0]);
        }
        else {
            this.n.c(String.format(Locale.ROOT, "Device authentication failed: %d - %s", v, (v < 0 || v > 18 ? "none/unknown" : audd.j[v])), new Object[0]);
        }
        aucd aucd0 = this.h.a;
        audd audd0 = aucd0.s;
        if(audd0 != null) {
            aucd0.Y(audd0);
            aucd0.s = null;
        }
        if(audd.i(v)) {
            this.n.c("authentication succeeded", new Object[0]);
            if(v == 1) {
                z = true;
            }
            aucd0.I(z);
            return;
        }
        if(aucd0.i) {
            aucd0.k.n("Show an error message on the receiver due to auth failure (%d)", Integer.valueOf(v));
            aucd0.D();
            LaunchOptions launchOptions0 = new LaunchOptions();
            launchOptions0.a = true;
            aucd0.L(aucd0.j, launchOptions0);
            if(aucd0.z() != null) {
                auct auct0 = aucd0.q;
                if(auct0 != null) {
                    auct0.d();
                }
            }
        }
        switch(v) {
            case 0: {
                v1 = 0;
                break;
            }
            case 1: {
                v1 = 0x8EF;
                break;
            }
            case 2: {
                v1 = 0x8F2;
                break;
            }
            case 3: {
                v1 = 0x8F3;
                break;
            }
            case 4: {
                v1 = 0x8F4;
                break;
            }
            case 6: {
                v1 = 0x8E5;
                break;
            }
            case 7: {
                v1 = 0x8E6;
                break;
            }
            case 8: {
                v1 = 0x8E7;
                break;
            }
            case 9: {
                v1 = 2280;
                break;
            }
            case 10: {
                v1 = 0x8E9;
                break;
            }
            case 11: {
                v1 = 0x8EA;
                break;
            }
            case 12: {
                v1 = 0x8EB;
                break;
            }
            case 13: {
                v1 = 0x8EC;
                break;
            }
            case 14: {
                v1 = 0x8F0;
                break;
            }
            case 15: {
                v1 = 0x8F5;
                break;
            }
            case 16: {
                v1 = 0x8ED;
                break;
            }
            case 17: {
                v1 = 0x8F1;
                break;
            }
            case 18: {
                v1 = 0x8EE;
                break;
            }
            default: {
                v1 = 0x8CF;
            }
        }
        switch(v) {
            case 6: {
                gket0 = gket.h;
                break;
            }
            case 7: {
                gket0 = gket.i;
                break;
            }
            case 8: {
                gket0 = gket.j;
                break;
            }
            case 9: {
                gket0 = gket.k;
                break;
            }
            case 10: {
                gket0 = gket.l;
                break;
            }
            case 11: {
                gket0 = gket.m;
                break;
            }
            case 13: {
                gket0 = gket.q;
                break;
            }
            case 14: {
                gket0 = gket.r;
                break;
            }
            case 15: {
                gket0 = gket.s;
                break;
            }
            case 16: {
                gket0 = gket.t;
                break;
            }
            case 17: {
                gket0 = gket.u;
                break;
            }
            default: {
                gket0 = gket.g;
            }
        }
        aucd0.K(v1, false, gket0);
    }

    public static boolean i(int v) {
        return v == 0 || v == 1 || (v == 2 || v == 3 || v == 4 || v == 5);
    }

    public final byte[] j(cjpc cjpc0) {
        byte[] arr_b = new byte[16];
        new SecureRandom().nextBytes(arr_b);
        cjpa cjpa0 = cjpc0.c();
        cjpa0.h("PREF_CAST_SENDER_NONCE", Base64.encodeToString(arr_b, 0));
        cjpd.f(cjpa0);
        cjpa cjpa1 = cjpc0.c();
        cjpa1.g("PREF_CAST_SENDER_NONCE_GENERATED_TIME", System.currentTimeMillis());
        cjpd.f(cjpa1);
        Object[] arr_object = {Arrays.toString(arr_b)};
        this.n.f("New nonce generated: %s", arr_object);
        return arr_b;
    }

    private static String o(Exception exception0) {
        String s = exception0.getMessage();
        return s == null ? "" : s;
    }

    private static void p(aurs aurs0, Exception exception0) {
        audd.q(aurs0, exception0, audd.o(exception0));
    }

    private static void q(aurs aurs0, Exception exception0, String s) {
        aurs0.g("%s: %s", new Object[]{exception0.getClass().getSimpleName(), s});
    }

    private static boolean r(CastDevice castDevice0) {
        if(castDevice0 != null) {
            CastEurekaInfo castEurekaInfo0 = castDevice0.d();
            if(castEurekaInfo0 != null) {
                return castEurekaInfo0.e == null ? false : new ArrayList(hqrp.a.b().a().b).contains(castEurekaInfo0.e);
            }
        }
        return false;
    }
}

