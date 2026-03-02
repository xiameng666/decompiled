package org.bouncycastle.jcajce.provider.asymmetric.edec;

import idph;
import idpx;
import idqg;
import idqi;
import idqm;
import idqt;
import idtu;
import iduc;
import idug;
import idux;
import idvi;
import idvk;
import idvn;
import idvt;
import idyk;
import idys;
import idzh;
import idzs;
import idzv;
import ieav;
import ieax;
import iebd;
import ienr;
import ienx;
import ieny;
import ieoe;
import ieof;
import ieok;
import ieol;
import ieoo;
import ieop;
import ieor;
import ieot;
import ieox;
import ieoy;
import iepz;
import ieqd;
import ieqf;
import iesa;
import iesn;
import iesq;
import iete;
import iett;
import ietu;
import ietv;
import iftq;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

class EdECUtil {
    public static ienr generatePrivateKeyParameter(PrivateKey privateKey0) {
        BigInteger bigInteger1;
        ieol ieol0;
        if((privateKey0 instanceof BCXDHPrivateKey)) {
            return ((BCXDHPrivateKey)privateKey0).engineGetKeyParameters();
        }
        if((privateKey0 instanceof BCEdDSAPrivateKey)) {
            return ((BCEdDSAPrivateKey)privateKey0).engineGetKeyParameters();
        }
        try {
            byte[] arr_b = privateKey0.getEncoded();
            if(arr_b == null) {
                throw new InvalidKeyException("no encoding for EdEC/XDH private key");
            }
            if(arr_b.length == 0) {
                throw new IllegalArgumentException("privateKeyInfoData array empty");
            }
            idvk idvk0 = idvk.d(idqm.w(arr_b));
            if(idvk0 == null) {
                throw new IllegalArgumentException("keyInfo argument null");
            }
            ieoe ieoe0 = null;
            idyk idyk0 = idvk0.b;
            idqg idqg0 = idyk0.a;
            if(!idqg0.y(idvi.d) && !idqg0.y(idvi.l) && !idqg0.y(idzs.aad)) {
                if(idqg0.y(idvi.t)) {
                    idux idux0 = idux.d(idyk0.b);
                    idpx idpx0 = (idpx)idvk0.b();
                    BigInteger bigInteger0 = idux0.b();
                    int v = bigInteger0 == null ? 0 : bigInteger0.intValue();
                    ienx ienx0 = new ienx(idux0.c(), idux0.a(), v);
                    return new ieny(idpx0.m(), ienx0);
                }
                if(idqg0.y(ietu.i)) {
                    iett iett0 = iett.c(idyk0.b);
                    return new ieoy(((idpx)idvk0.b()).m(), new ieox(iett0.b(), iett0.a()));
                }
                if(idqg0.y(iebd.R)) {
                    idpx idpx1 = (idpx)idvk0.b();
                    idph idph0 = idyk0.b;
                    if(idph0 != null) {
                        idys idys0 = idys.d(idph0.p());
                        ieoe0 = new ieoe(idys0.b(), idys0.c(), idys0.a());
                    }
                    return new ieof(idpx1.m(), ieoe0);
                }
                if(idqg0.y(iebd.l)) {
                    idvt idvt0 = idvt.d(idvk0.b());
                    ieav ieav0 = ieav.a(idyk0.b.p());
                    ieok ieok0 = ieav0.c() ? ieoo.d(idqg.h(ieav0.a)) : new ieok(ieax.a(ieav0.a));
                    return new ieop(idvt0.a(), ieok0);
                }
                if(idqg0.y(iete.b)) {
                    return idvk0.a() == 0x20 ? new ieqd(idvk0.c().b) : new ieqd(iesa.a(idvk0));
                }
                if(idqg0.y(iete.c)) {
                    return idvk0.a() == 56 ? new ieqf(idvk0.c().b) : new ieqf(iesa.a(idvk0));
                }
                if(idqg0.y(iete.d)) {
                    return new ieor(iesa.a(idvk0));
                }
                if(idqg0.y(iete.e)) {
                    return new ieot(iesa.a(idvk0));
                }
                if(!idqg0.y(idtu.m) && !idqg0.y(ietv.h) && !idqg0.y(ietv.g)) {
                    throw new RuntimeException("algorithm identifier in private key not recognised");
                }
                idph idph1 = idyk0.b;
                idug idug0 = idug.a(idph1);
                idqm idqm0 = idph1.p();
                if((idqm0 instanceof idqt)) {
                    switch(idqt.m(idqm0).b()) {
                        case 2: 
                        case 3: {
                            ieax ieax0 = iduc.e(idug0.a);
                            ieol0 = new ieol(new ieoo(idug0.a, ieax0), idug0.a, idug0.b, idug0.c);
                            if(idvk0.a() != 0x20 && idvk0.a() != 0x40) {
                                idph idph2 = idvk0.b();
                                bigInteger1 = (idph2 instanceof idpx) ? idpx.n(idph2).j() : new BigInteger(1, iftq.r(idqi.g(idph2).b));
                            }
                            else {
                                bigInteger1 = new BigInteger(1, iftq.r(idvk0.c().b));
                            }
                            break;
                        }
                        default: {
                            goto label_65;
                        }
                    }
                }
                else {
                label_65:
                    ieav ieav1 = ieav.a(idyk0.b);
                    if(ieav1.c()) {
                        idqg idqg1 = idqg.h(ieav1.a);
                        ieoe0 = new ieol(new ieoo(idqg1, idzv.d(idqg1)), idug0.a, idug0.b, idug0.c);
                    }
                    else if(!ieav1.b()) {
                        ieoe0 = new ieol(new ieoo(idqg0, ieax.a(ieav1.a)), idug0.a, idug0.b, idug0.c);
                    }
                    idph idph3 = idvk0.b();
                    bigInteger1 = (idph3 instanceof idpx) ? idpx.n(idph3).m() : idvt.d(idph3).a();
                    ieol0 = ieoe0;
                }
                return new ieop(bigInteger1, new ieol(ieol0, idug0.a, idug0.b, idug0.c));
            }
            idvn idvn0 = idvn.a(idvk0.b());
            return new iepz(idvn0.a, idvn0.b, idvn0.c, idvn0.d, idvn0.e, idvn0.f, idvn0.g, idvn0.h);
        }
        catch(Exception exception0) {
            throw new InvalidKeyException("cannot identify EdEC/XDH private key: " + exception0.getMessage());
        }
    }

    public static ienr generatePublicKeyParameter(PublicKey publicKey0) {
        if((publicKey0 instanceof BCXDHPublicKey)) {
            return ((BCXDHPublicKey)publicKey0).engineGetKeyParameters();
        }
        if((publicKey0 instanceof BCEdDSAPublicKey)) {
            return ((BCEdDSAPublicKey)publicKey0).engineGetKeyParameters();
        }
        try {
            byte[] arr_b = publicKey0.getEncoded();
            if(arr_b == null) {
                throw new InvalidKeyException("no encoding for EdEC/XDH public key");
            }
            if(arr_b.length == 0) {
                throw new IllegalArgumentException("keyInfoData array empty");
            }
            idzh idzh0 = idzh.b(idqm.w(arr_b));
            if(idzh0 == null) {
                throw new IllegalArgumentException("keyInfo argument null");
            }
            idyk idyk0 = idzh0.a;
            iesn iesn0 = (iesn)iesq.a.get(idyk0.a);
            if(iesn0 != null) {
                return iesn0.a(idzh0);
            }
            throw new IOException("algorithm identifier in public key not recognised: " + idyk0.a);
        }
        catch(Exception exception0) {
            throw new InvalidKeyException("cannot identify EdEC/XDH public key: " + exception0.getMessage());
        }
    }
}

