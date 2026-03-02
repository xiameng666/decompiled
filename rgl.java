import j..time.Instant;
import j..util.DesugarDate;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class rgl {
    public static final rgj a(rgp rgp0, rgn rgn0) {
        rga rga0;
        int v3;
        rfu rfu0;
        PKIXCertPathValidatorResult pKIXCertPathValidatorResult0;
        CertPathValidator certPathValidator0 = CertPathValidator.getInstance("KeyAttestation");
        PKIXParameters pKIXParameters0 = new PKIXParameters(expj.a());
        Instant instant0 = Instant.now();
        ibuq.e(instant0, "now(...)");
        pKIXParameters0.setDate(DesugarDate.from(instant0));
        pKIXParameters0.addCertPathChecker(new rgt(ibpu.a));
        try {
            CertPathValidatorResult certPathValidatorResult0 = certPathValidator0.validate(rgp0, pKIXParameters0);
            ibuq.d(certPathValidatorResult0, "null cannot be cast to non-null type java.security.cert.PKIXCertPathValidatorResult");
            pKIXCertPathValidatorResult0 = (PKIXCertPathValidatorResult)certPathValidatorResult0;
        }
        catch(CertPathValidatorException unused_ex) {
            return rgh.a;
        }
        try {
            X509Certificate x509Certificate0 = (X509Certificate)rgp0.getCertificates().get(0);
            ibuq.f(x509Certificate0, "<this>");
            ibuq.f(x509Certificate0, "cert");
            byte[] arr_b = idqi.g(x509Certificate0.getExtensionValue(rfu.a.b())).b;
            ibuq.c(arr_b);
            ibuq.f(arr_b, "bytes");
            try {
                idqt idqt0 = idqt.m(arr_b);
                ibuq.e(idqt0, "getInstance(...)");
                if(idqt0.b() != 8) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                idph idph0 = idqt0.h(0);
                ibuq.e(idph0, "getObjectAt(...)");
                BigInteger bigInteger0 = rft.d(idph0);
                idph idph1 = idqt0.h(1);
                ibuq.e(idph1, "getObjectAt(...)");
                int v = rft.g(idph1);
                idph idph2 = idqt0.h(2);
                ibuq.e(idph2, "getObjectAt(...)");
                BigInteger bigInteger1 = rft.d(idph2);
                idph idph3 = idqt0.h(3);
                ibuq.e(idph3, "getObjectAt(...)");
                int v1 = rft.g(idph3);
                idph idph4 = idqt0.h(4);
                ibuq.e(idph4, "getObjectAt(...)");
                ByteString hfsf0 = rft.b(idph4);
                idph idph5 = idqt0.h(5);
                ibuq.e(idph5, "getObjectAt(...)");
                ByteString hfsf1 = rft.b(idph5);
                idph idph6 = idqt0.h(6);
                ibuq.e(idph6, "getObjectAt(...)");
                rfr rfr0 = rft.f(idph6);
                idph idph7 = idqt0.h(7);
                ibuq.e(idph7, "getObjectAt(...)");
                rfu0 = new rfu(bigInteger0, v, bigInteger1, v1, hfsf0, hfsf1, rfr0, rft.f(idph7));
            }
            catch(NullPointerException nullPointerException0) {
                throw new IllegalArgumentException(nullPointerException0);
            }
        }
        catch(Exception exception0) {
            return new rgg(exception0);
        }
        ByteString hfsf2 = rfu0.b;
        if(hfsf2.equals(rgn0.a)) {
            rfr rfr1 = rfu0.c;
            rfw rfw0 = rfr1.a;
            if(rfw0 != null && rfw0 == rfw.a) {
                int v2 = rfu0.d;
                if(v2 == rfu0.e) {
                    String s = null;
                    rgb rgb0 = rfr1.b;
                    if(rgb0 == null) {
                        return new rgf("hardwareEnforced.rootOfTrust is null");
                    }
                    if(rgu.b(((X509Certificate)ibpo.W(rgp0.getCertificates()))) == 3) {
                        X509Certificate x509Certificate1 = (X509Certificate)rgp0.getCertificates().get(1);
                        ibuq.f(x509Certificate1, "<this>");
                        ibuq.f(x509Certificate1, "cert");
                        byte[] arr_b1 = x509Certificate1.getExtensionValue(rga.a.b());
                        if(arr_b1 == null) {
                            rga0 = null;
                        }
                        else {
                            try {
                                byte[] arr_b2 = idqi.g(arr_b1).b;
                                ibuq.c(arr_b2);
                                ibuq.f(arr_b2, "data");
                                List list0 = new qin(new ByteArrayInputStream(arr_b2)).b();
                                if(list0.size() != 1) {
                                    throw new qip(a.S(list0, "Byte stream cannot be decoded properly. Expected 1 item, found "));
                                }
                                boolean z = false;
                                Object object0 = list0.get(0);
                                ibuq.e(object0, "get(...)");
                                qjf qjf0 = ((qjd)object0).c;
                                if(qjf0 != qjf.f) {
                                    throw new qip("Expected a map, got " + qjf0.name());
                                }
                                ibuq.d(((qjd)object0), "null cannot be cast to non-null type co.nstant.in.cbor.model.Map");
                                if(((qjg)(((qjd)object0))).a.size() <= 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                qjd qjd0 = ((qjg)(((qjd)object0))).a(new qjo(1L));
                                ibuq.e(qjd0, "get(...)");
                                ibuq.f(qjd0, "<this>");
                                qjf qjf1 = qjd0.c;
                                if(qjf1 == qjf.a) {
                                    v3 = ((qjo)qjd0).a.intValue();
                                }
                                else {
                                    if(qjf1 != qjf.b) {
                                        Objects.toString(qjf1);
                                        throw new qip("Expected a number, got " + qjf1);
                                    }
                                    v3 = ((qjh)qjd0).a.intValue();
                                }
                                qjd qjd1 = ((qjg)(((qjd)object0))).a(new qjo(2L));
                                if(qjd1 != null) {
                                    if(qjd1.c != qjf.h || ((qjk)qjd1).j != qjl.a) {
                                        throw new IllegalStateException("Must be a SimpleValueType, was " + new ibuk(qjd1.getClass()).c());
                                    }
                                    qjj qjj0 = ((qji)qjd1).g;
                                    qjj qjj1 = qjj.b;
                                    if(qjj0 != qjj1 && qjj0 != qjj.a) {
                                        throw new IllegalStateException("Must be either TRUE or FALSE value");
                                    }
                                    if(qjj0 == qjj1) {
                                        z = true;
                                    }
                                }
                                qjd qjd2 = ((qjg)(((qjd)object0))).a(new qjo(3L));
                                if(qjd2 != null) {
                                    qjf qjf2 = qjd2.c;
                                    if(qjf2 != qjf.d) {
                                        throw new qip("Expected a unicode string, got " + qjf2.name());
                                    }
                                    s = ((qjn)qjd2).a;
                                    ibuq.e(s, "getString(...)");
                                }
                                rga0 = new rga(v3, z, s);
                            }
                            catch(qip qip0) {
                                throw new IllegalArgumentException(qip0);
                            }
                        }
                    }
                    else {
                        rga0 = null;
                    }
                    PublicKey publicKey0 = pKIXCertPathValidatorResult0.getPublicKey();
                    ibuq.e(publicKey0, "getPublicKey(...)");
                    Set set0 = ibqg.d(new String[]{rfr1.g, rfr1.k});
                    rfs rfs0 = new rfs(rfr1.c, rfr1.d, rfr1.e, rfr1.f, set0, rfr1.h, rfr1.i, rfr1.j);
                    return new rgi(publicKey0, hfsf2, v2, rgb0.a, rga0, rfs0);
                }
                return new rgf("attestationSecurityLevel != keyMintSecurityLevel: " + rgc.a(rfu0.d) + " != " + rgc.a(rfu0.e));
            }
            Objects.toString(rfw0);
            return new rgf("origin != GENERATED: " + rfw0);
        }
        return rge.a;
    }
}

