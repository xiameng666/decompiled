package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import idpc;
import idph;
import idpi;
import idqg;
import idqi;
import idqt;
import idry;
import idsd;
import idsg;
import idtg;
import idur;
import idvi;
import idvk;
import idxc;
import idxs;
import idyk;
import idzh;
import ieav;
import iebd;
import iete;
import ietm;
import ieub;
import ieuc;
import iewl;
import iewn;
import iftq;
import j..util.DesugarCollections;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    private static Map componentKeySizes;
    private static final idyk ecDsaBrainpoolP256r1;
    private static final idyk ecDsaBrainpoolP384r1;
    private static final idyk ecDsaP256;
    private static final idyk ecDsaP384;
    private static final idyk ed25519;
    private static final idyk ed448;
    private static final idyk falcon512Identifier;
    private iewl helper;
    private static final idyk mlDsa44;
    private static final idyk mlDsa65;
    private static final idyk mlDsa87;
    private static Map pairings;
    private static final idyk rsa;

    static {
        idyk idyk0 = new idyk(idur.ao);
        KeyFactorySpi.mlDsa44 = idyk0;
        idyk idyk1 = new idyk(idur.ap);
        KeyFactorySpi.mlDsa65 = idyk1;
        idyk idyk2 = new idyk(idur.aq);
        KeyFactorySpi.mlDsa87 = idyk2;
        KeyFactorySpi.falcon512Identifier = new idyk(idtg.bg);
        idyk idyk3 = new idyk(iete.d);
        KeyFactorySpi.ed25519 = idyk3;
        ieav ieav0 = new ieav(idxc.H);
        idyk idyk4 = new idyk(iebd.l, ieav0);
        KeyFactorySpi.ecDsaP256 = idyk4;
        ieav ieav1 = new ieav(idxs.u);
        idyk idyk5 = new idyk(iebd.l, ieav1);
        KeyFactorySpi.ecDsaBrainpoolP256r1 = idyk5;
        idyk idyk6 = new idyk(idvi.d);
        KeyFactorySpi.rsa = idyk6;
        idyk idyk7 = new idyk(iete.e);
        KeyFactorySpi.ed448 = idyk7;
        ieav ieav2 = new ieav(idxc.A);
        idyk idyk8 = new idyk(iebd.l, ieav2);
        KeyFactorySpi.ecDsaP384 = idyk8;
        ieav ieav3 = new ieav(idxs.y);
        idyk idyk9 = new idyk(iebd.l, ieav3);
        KeyFactorySpi.ecDsaBrainpoolP384r1 = idyk9;
        KeyFactorySpi.pairings = new HashMap();
        KeyFactorySpi.componentKeySizes = new HashMap();
        KeyFactorySpi.pairings.put(ietm.F, new idyk[]{idyk0, idyk6});
        KeyFactorySpi.pairings.put(ietm.G, new idyk[]{idyk0, idyk6});
        KeyFactorySpi.pairings.put(ietm.H, new idyk[]{idyk0, idyk3});
        KeyFactorySpi.pairings.put(ietm.I, new idyk[]{idyk0, idyk4});
        KeyFactorySpi.pairings.put(ietm.J, new idyk[]{idyk1, idyk6});
        KeyFactorySpi.pairings.put(ietm.K, new idyk[]{idyk1, idyk6});
        KeyFactorySpi.pairings.put(ietm.L, new idyk[]{idyk1, idyk6});
        KeyFactorySpi.pairings.put(ietm.M, new idyk[]{idyk1, idyk6});
        KeyFactorySpi.pairings.put(ietm.N, new idyk[]{idyk1, idyk8});
        KeyFactorySpi.pairings.put(ietm.O, new idyk[]{idyk1, idyk5});
        KeyFactorySpi.pairings.put(ietm.P, new idyk[]{idyk1, idyk3});
        KeyFactorySpi.pairings.put(ietm.Q, new idyk[]{idyk2, idyk8});
        KeyFactorySpi.pairings.put(ietm.R, new idyk[]{idyk2, idyk9});
        KeyFactorySpi.pairings.put(ietm.S, new idyk[]{idyk2, idyk7});
        KeyFactorySpi.pairings.put(ietm.T, new idyk[]{idyk0, idyk6});
        KeyFactorySpi.pairings.put(ietm.U, new idyk[]{idyk0, idyk6});
        KeyFactorySpi.pairings.put(ietm.V, new idyk[]{idyk0, idyk3});
        KeyFactorySpi.pairings.put(ietm.W, new idyk[]{idyk0, idyk4});
        KeyFactorySpi.pairings.put(ietm.X, new idyk[]{idyk1, idyk6});
        KeyFactorySpi.pairings.put(ietm.Y, new idyk[]{idyk1, idyk6});
        KeyFactorySpi.pairings.put(ietm.Z, new idyk[]{idyk1, idyk6});
        KeyFactorySpi.pairings.put(ietm.aa, new idyk[]{idyk1, idyk6});
        KeyFactorySpi.pairings.put(ietm.ab, new idyk[]{idyk1, idyk8});
        KeyFactorySpi.pairings.put(ietm.ac, new idyk[]{idyk1, idyk5});
        KeyFactorySpi.pairings.put(ietm.ad, new idyk[]{idyk1, idyk3});
        KeyFactorySpi.pairings.put(ietm.ae, new idyk[]{idyk2, idyk8});
        KeyFactorySpi.pairings.put(ietm.af, new idyk[]{idyk2, idyk9});
        KeyFactorySpi.pairings.put(ietm.ag, new idyk[]{idyk2, idyk7});
        KeyFactorySpi.componentKeySizes.put(ietm.F, new int[]{0x530, 0x10C});
        KeyFactorySpi.componentKeySizes.put(ietm.G, new int[]{0x520, 284});
        KeyFactorySpi.componentKeySizes.put(ietm.H, new int[]{0x520, 0x20});
        KeyFactorySpi.componentKeySizes.put(ietm.I, new int[]{0x520, 76});
        KeyFactorySpi.componentKeySizes.put(ietm.J, new int[]{0x7A0, 0x100});
        KeyFactorySpi.componentKeySizes.put(ietm.K, new int[]{0x7A0, 0x100});
        KeyFactorySpi.componentKeySizes.put(ietm.L, new int[]{0x7A0, 542});
        KeyFactorySpi.componentKeySizes.put(ietm.M, new int[]{0x7A0, 542});
        KeyFactorySpi.componentKeySizes.put(ietm.N, new int[]{0x7A0, 87});
        KeyFactorySpi.componentKeySizes.put(ietm.O, new int[]{0x7A0, 76});
        KeyFactorySpi.componentKeySizes.put(ietm.P, new int[]{0x7A0, 0x20});
        KeyFactorySpi.componentKeySizes.put(ietm.Q, new int[]{0xA20, 87});
        KeyFactorySpi.componentKeySizes.put(ietm.R, new int[]{0xA20, 87});
        KeyFactorySpi.componentKeySizes.put(ietm.S, new int[]{0xA20, 57});
        KeyFactorySpi.componentKeySizes.put(ietm.T, new int[]{0x530, 0x10C});
        KeyFactorySpi.componentKeySizes.put(ietm.U, new int[]{0x520, 284});
        KeyFactorySpi.componentKeySizes.put(ietm.V, new int[]{0x520, 0x20});
        KeyFactorySpi.componentKeySizes.put(ietm.W, new int[]{0x520, 76});
        KeyFactorySpi.componentKeySizes.put(ietm.X, new int[]{0x7A0, 0x100});
        KeyFactorySpi.componentKeySizes.put(ietm.Y, new int[]{0x7A0, 0x100});
        KeyFactorySpi.componentKeySizes.put(ietm.Z, new int[]{0x7A0, 542});
        KeyFactorySpi.componentKeySizes.put(ietm.aa, new int[]{0x7A0, 542});
        KeyFactorySpi.componentKeySizes.put(ietm.ab, new int[]{0x7A0, 87});
        KeyFactorySpi.componentKeySizes.put(ietm.ac, new int[]{0x7A0, 76});
        KeyFactorySpi.componentKeySizes.put(ietm.ad, new int[]{0x7A0, 0x20});
        KeyFactorySpi.componentKeySizes.put(ietm.ae, new int[]{0xA20, 87});
        KeyFactorySpi.componentKeySizes.put(ietm.af, new int[]{0xA20, 87});
        KeyFactorySpi.componentKeySizes.put(ietm.ag, new int[]{0xA20, 57});
    }

    public KeyFactorySpi() {
        this(null);
    }

    public KeyFactorySpi(iewl iewl0) {
        this.helper = iewl0;
    }

    @Override
    protected Key engineTranslateKey(Key key0) {
        if(this.helper == null) {
            this.helper = new iewn();
        }
        try {
            if((key0 instanceof PrivateKey)) {
                return this.generatePrivate(idvk.d(key0.getEncoded()));
            }
            if((key0 instanceof PublicKey)) {
                return this.generatePublic(idzh.b(key0.getEncoded()));
            }
        }
        catch(IOException iOException0) {
            throw new InvalidKeyException("Key could not be parsed: " + iOException0.getMessage());
        }
        throw new InvalidKeyException("Key not recognized");
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(idvk idvk0) {
        idqt idqt0;
        if(this.helper == null) {
            this.helper = new iewn();
        }
        idqg idqg0 = idvk0.b.a;
        int v = 0;
        if(!ietm.B.y(idqg0) && !ietm.C.y(idqg0)) {
            try {
                idph idph0 = idvk0.b();
                idqt0 = (idph0 instanceof idqi) ? idsg.m(idqi.g(idph0).b) : idsg.m(idph0);
                goto label_16;
            }
            catch(Exception unused_ex) {
                try {
                    idpi idpi0 = new idpi();
                    byte[] arr_b = idvk0.c().b;
                    idpi0.b(new idsd(iftq.q(arr_b, 0, 0x20)));
                    idpi0.b(new idsd(iftq.q(arr_b, 0x20, arr_b.length)));
                    idqt0 = new idsg(idpi0);
                label_16:
                    List list0 = this.getKeyFactoriesFromIdentifier(idqg0);
                    PrivateKey[] arr_privateKey = new PrivateKey[idqt0.b()];
                    idyk[] arr_idyk = (idyk[])KeyFactorySpi.pairings.get(idqg0);
                    while(v < idqt0.b()) {
                        if((idqt0.h(v) instanceof idqi)) {
                            idpi idpi1 = new idpi(3);
                            idpi1.b(idvk0.a);
                            idpi1.b(arr_idyk[v]);
                            idpi1.b(idqt0.h(v));
                            PKCS8EncodedKeySpec pKCS8EncodedKeySpec0 = new PKCS8EncodedKeySpec(idvk.d(new idsg(idpi1)).u());
                            arr_privateKey[v] = ((KeyFactory)list0.get(v)).generatePrivate(pKCS8EncodedKeySpec0);
                        }
                        else {
                            PKCS8EncodedKeySpec pKCS8EncodedKeySpec1 = new PKCS8EncodedKeySpec(idvk.d(idqt.m(idqt0.h(v))).u());
                            arr_privateKey[v] = ((KeyFactory)list0.get(v)).generatePrivate(pKCS8EncodedKeySpec1);
                        }
                        ++v;
                    }
                    return new ieub(idqg0, arr_privateKey);
                }
                catch(GeneralSecurityException generalSecurityException0) {
                }
            }
            throw new IOException(generalSecurityException0.getMessage(), generalSecurityException0);
        }
        idqt idqt1 = idsg.m(idvk0.b());
        PrivateKey[] arr_privateKey1 = new PrivateKey[idqt1.b()];
        while(v != idqt1.b()) {
            idvk idvk1 = idvk.d(idqt.m(idqt1.h(v)));
            try {
                arr_privateKey1[v] = this.helper.b(idvk1.b.a.b()).generatePrivate(new PKCS8EncodedKeySpec(idvk1.u()));
                ++v;
            }
            catch(Exception exception0) {
                throw new IOException("cannot decode generic composite: " + exception0.getMessage(), exception0);
            }
        }
        return new ieub(ietm.C, arr_privateKey1);
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(idzh idzh0) {
        idqt idqt0;
        byte[][] arr2_b;
        idqg idqg0;
        if(this.helper == null) {
            this.helper = new iewn();
        }
        try {
            idqg0 = idzh0.a.a;
            arr2_b = new byte[2][];
            idqt0 = idsg.m(idzh0.b.m());
        }
        catch(Exception unused_ex) {
            arr2_b = this.split(idqg0, idzh0.b);
            idqt0 = null;
        }
        int v = 0;
        if(!ietm.B.y(idqg0) && !ietm.C.y(idqg0)) {
            try {
                int v1 = idqt0 == null ? arr2_b.length : idqt0.b();
                List list0 = this.getKeyFactoriesFromIdentifier(idqg0);
                idpc[] arr_idpc = new idpc[v1];
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(idqt0 == null) {
                        arr_idpc[v2] = new idry(arr2_b[v2]);
                    }
                    else if((idqt0.h(v2) instanceof idsd)) {
                        arr_idpc[v2] = new idry(((idsd)idqt0.h(v2)).b);
                    }
                    else {
                        arr_idpc[v2] = (idry)idqt0.h(v2);
                    }
                }
                X509EncodedKeySpec[] arr_x509EncodedKeySpec = this.getKeysSpecs(idqg0, arr_idpc);
                PublicKey[] arr_publicKey = new PublicKey[v1];
                while(v < v1) {
                    arr_publicKey[v] = ((KeyFactory)list0.get(v)).generatePublic(arr_x509EncodedKeySpec[v]);
                    ++v;
                }
                return new ieuc(idqg0, arr_publicKey);
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new IOException(generalSecurityException0.getMessage(), generalSecurityException0);
            }
        }
        idqt idqt1 = idqt.m(idzh0.b.m());
        PublicKey[] arr_publicKey1 = new PublicKey[idqt1.b()];
        while(v != idqt1.b()) {
            idzh idzh1 = idzh.b(idqt1.h(v));
            try {
                arr_publicKey1[v] = this.helper.b(idzh1.a.a.b()).generatePublic(new X509EncodedKeySpec(idzh1.u()));
                ++v;
            }
            catch(Exception exception0) {
                throw new IOException("cannot decode generic composite: " + exception0.getMessage(), exception0);
            }
        }
        return new ieuc(ietm.C, arr_publicKey1);
    }

    private List getKeyFactoriesFromIdentifier(idqg idqg0) {
        ArrayList arrayList0 = new ArrayList();
        new ArrayList();
        String[] arr_s = CompositeIndex.getPairing(idqg0);
        if(arr_s == null) {
            throw new NoSuchAlgorithmException("Cannot create KeyFactories. Unsupported algorithm identifier.");
        }
        arrayList0.add(this.helper.b(CompositeIndex.getBaseName(arr_s[0])));
        arrayList0.add(this.helper.b(CompositeIndex.getBaseName(arr_s[1])));
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    private X509EncodedKeySpec[] getKeysSpecs(idqg idqg0, idpc[] arr_idpc) {
        X509EncodedKeySpec[] arr_x509EncodedKeySpec = new X509EncodedKeySpec[arr_idpc.length];
        new idzh[arr_idpc.length];
        idyk[] arr_idyk = (idyk[])KeyFactorySpi.pairings.get(idqg0);
        if(arr_idyk == null) {
            throw new IOException("Cannot create key specs. Unsupported algorithm identifier.");
        }
        idzh idzh0 = new idzh(arr_idyk[0], arr_idpc[0]);
        idzh idzh1 = new idzh(arr_idyk[1], arr_idpc[1]);
        arr_x509EncodedKeySpec[0] = new X509EncodedKeySpec(idzh0.u());
        arr_x509EncodedKeySpec[1] = new X509EncodedKeySpec(idzh1.u());
        return arr_x509EncodedKeySpec;
    }

    public byte[][] split(idqg idqg0, idpc idpc0) {
        int[] arr_v = (int[])KeyFactorySpi.componentKeySizes.get(idqg0);
        idpc0.n();
        return new byte[][]{new byte[arr_v[0]], new byte[arr_v[1]]};
    }
}

