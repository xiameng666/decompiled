import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UnsignedExtensionOutputs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import jeb.synthetic.FIN;

public final class bmar {
    public static blzu a(byte[] arr_b, blzt blzt0) {
        bmcb bmcb0;
        bmgm bmgm1;
        bmbw bmbw0;
        bmcb bmcb1;
        bmgm bmgm0;
        int v2;
        hhrv hhrv0;
        UnsignedExtensionOutputs unsignedExtensionOutputs0;
        byte[] arr_b2;
        if(arr_b == null || arr_b.length <= 0) {
            bmzx.c("UNKNOWN", "CTAP_INVALID_PAYLOAD");
        }
        batl.b(arr_b != null && arr_b.length > 0);
        if(blzt0 == null) {
            bmzx.c("UNKNOWN", "CTAP_INVALID_COMMAND");
        }
        batl.s(blzt0);
        blzx blzx0 = blzx.a(arr_b[0]);
        if(blzx0 == blzx.a) {
            int v1 = arr_b.length;
            if(v1 != 1) {
                goto label_13;
            }
            if(!(blzt0 instanceof bmai) && !(blzt0 instanceof bmac)) {
                v1 = 1;
            label_13:
                hhrs hhrs0 = hhrs.q(Arrays.copyOfRange(arr_b, 1, v1));
                switch(blzt0.a().ordinal()) {
                    case 0: {
                        ggfz ggfz0 = blzq.d(hhrs0, "Response data for AuthenticatorMakeCredential not encoded in CBOR map");
                        ggnk ggnk0 = ggfz0.d;
                        if(!ggnk0.containsAll(bmap.g)) {
                            throw new blzy("Response map for AuthenticatorMakeCredential does not contain required keys");
                        }
                        ggqj ggqj0 = ggog.d(ggnk0, bmap.h).c();
                        while(ggqj0.hasNext()) {
                            Object object0 = ggqj0.next();
                            ((ggtj)((ggtj)bmap.i.j()).ar(0xE6B)).B("Unrecognized key present in response map: %s", ((hhrs)object0));
                        }
                        byte[] arr_b1 = blzq.g(((hhrs)ggfz0.get(bmap.b)), bmap.b(((hhrs)ggfz0.get(bmap.b)), "authData", "non-bytestring"));
                        batl.b(arr_b1 != null);
                        String s = blzq.e(((hhrs)ggfz0.get(bmap.a)), "Response map for AuthenticatorMakeCredential contains a non-textstring CBOR value for format label");
                        boolean z = true;
                        hhrs hhrs1 = (hhrs)ggfz0.get(bmap.c);
                        batl.s(hhrs1);
                        try {
                            arr_b2 = hhrs1.s();
                        }
                        catch(hhrm hhrm0) {
                            throw new RuntimeException(hhrm0);
                        }
                        if(arr_b2 == null) {
                            z = false;
                        }
                        batl.b(z);
                        Boolean boolean0 = ggfz0.containsKey(bmap.d) ? Boolean.valueOf(blzq.f(((hhrs)ggfz0.get(bmap.d)), bmap.b(((hhrs)ggfz0.get(bmap.d)), "epAtt", "non-boolean"))) : null;
                        byte[] arr_b3 = ggfz0.containsKey(bmap.e) ? blzq.g(((hhrs)ggfz0.get(bmap.e)), bmap.b(((hhrs)ggfz0.get(bmap.e)), "largeBlobKey", "non-bytestring")) : null;
                        hhrs hhrs2 = bmap.f;
                        if(ggfz0.containsKey(hhrs2)) {
                            try {
                                unsignedExtensionOutputs0 = UnsignedExtensionOutputs.a(((hhrs)ggfz0.get(hhrs2)));
                            }
                            catch(hhrh | hhrr exception0) {
                                throw new blzy("Cannot parse unsigned extension outputs", exception0);
                            }
                        }
                        else {
                            unsignedExtensionOutputs0 = null;
                        }
                        batl.l(arr_b1 != null);
                        return new blzu(blzx0, new bmap(arr_b1, s, arr_b2, boolean0, arr_b3, unsignedExtensionOutputs0));
                    }
                    case 3: {
                        return new blzu(blzx0, bmao.b(hhrs0));
                    }
                    case 4: {
                        ggfz ggfz1 = blzq.d(hhrs0, "Invalid AuthenticatorClientPin response map.");
                        ggqj ggqj1 = ggog.d(ggfz1.d, bmam.g).c();
                        while(ggqj1.hasNext()) {
                            Object object1 = ggqj1.next();
                            ((ggtj)((ggtj)bmam.a.j()).ar(0xE65)).B("Unknown key present in response map: %s", ((hhrs)object1));
                        }
                        try {
                            hhrn hhrn0 = bmam.b;
                            if(ggfz1.containsKey(hhrn0)) {
                                hhrv0 = new hhrv(new ByteArrayInputStream(((hhrs)ggfz1.get(hhrn0)).s()));
                                v2 = FIN.finallyOpen$NT();
                                switch(((int)hhrv0.b())) {
                                    case 4: {
                                        SparseArray sparseArray0 = new SparseArray();
                                        for(int v3 = 0; v3 < 4; ++v3) {
                                            int v4 = bmbv.a(hhrv0);
                                            if(sparseArray0.get(v4) != null) {
                                                throw new IOException("COSE data for an RSA key must not contain two identical labels");
                                            }
                                            switch(v4) {
                                                case -2: {
                                                    byte[] arr_b4 = hhrv0.h();
                                                    byte[] arr_b5 = new byte[8];
                                                    Arrays.fill(arr_b5, 0);
                                                    System.arraycopy(arr_b4, 0, arr_b5, 8 - arr_b4.length, arr_b4.length);
                                                    sparseArray0.put(-2, Long.valueOf(glxd.c(arr_b5)));
                                                    break;
                                                }
                                                case -1: {
                                                    sparseArray0.put(-1, new BigInteger(1, hhrv0.h()));
                                                    break;
                                                }
                                                case 1: {
                                                    int v5 = bmbv.a(hhrv0);
                                                    if(v5 != 3) {
                                                        throw new IOException("Invalid key type: " + v5);
                                                    }
                                                    sparseArray0.put(1, Integer.valueOf(3));
                                                    break;
                                                }
                                                case 3: {
                                                    int v6 = bmbv.a(hhrv0);
                                                    try {
                                                        bmgm0 = bmgl.a(v6);
                                                    }
                                                    catch(bmhm bmhm0) {
                                                        throw new IOException(bmhm0);
                                                    }
                                                    if(!(bmgm0 instanceof bmiu)) {
                                                        throw new IOException("Algorithm identifier parsed from RSA key either invalid or not supported");
                                                    }
                                                    sparseArray0.put(3, bmgm0);
                                                    break;
                                                }
                                                default: {
                                                    throw new IOException("Illegal key " + v4 + " in the CBOR map of RSA credential public key");
                                                }
                                            }
                                        }
                                        bmcb1 = new bmcb(((bmiu)sparseArray0.get(3)), ((BigInteger)sparseArray0.get(-1)), ((Long)sparseArray0.get(-2)));
                                        goto label_138;
                                    }
                                    case 5: {
                                        SparseArray sparseArray1 = new SparseArray();
                                        int v7 = 0;
                                        for(int v = 0; v7 < 5; v = 0) {
                                            int v8 = bmbv.a(hhrv0);
                                            if(sparseArray1.get(v8) != null) {
                                                throw new IOException("COSE data for an ECC key must not contain two identical labels");
                                            }
                                            switch(v8) {
                                                case -3: {
                                                    sparseArray1.put(-3, new BigInteger(1, hhrv0.h()));
                                                    break;
                                                }
                                                case -2: {
                                                    sparseArray1.put(-2, new BigInteger(1, hhrv0.h()));
                                                    break;
                                                }
                                                case -1: {
                                                    int v9 = bmbv.a(hhrv0);
                                                    bmbw[] arr_bmbw = bmbw.values();
                                                    while(true) {
                                                        if(v >= arr_bmbw.length) {
                                                            throw new IllegalArgumentException("Failed to parse curve from given value: " + v9);
                                                        }
                                                        bmbw0 = arr_bmbw[v];
                                                        if(bmbw0.d == v9) {
                                                            break;
                                                        }
                                                        ++v;
                                                    }
                                                    sparseArray1.put(-1, bmbw0);
                                                    break;
                                                }
                                                case 1: {
                                                    int v10 = bmbv.a(hhrv0);
                                                    if(v10 != 2) {
                                                        throw new IOException("Invalid key type: " + v10);
                                                    }
                                                    sparseArray1.put(1, Integer.valueOf(2));
                                                    break;
                                                }
                                                case 3: {
                                                    int v11 = bmbv.a(hhrv0);
                                                    try {
                                                        bmgm1 = bmgl.a(v11);
                                                    }
                                                    catch(bmhm bmhm1) {
                                                        throw new IOException(bmhm1);
                                                    }
                                                    if(!(bmgm1 instanceof bmhq)) {
                                                        throw new IOException("Algorithm identifier parsed from EC2 key either invalid or not supported");
                                                    }
                                                    sparseArray1.put(3, bmgm1);
                                                    break;
                                                }
                                                default: {
                                                    throw new IOException("Illegal key " + v8 + " in the CBOR map of ECC credential public key");
                                                }
                                            }
                                            ++v7;
                                        }
                                        bmcb1 = new bmbx(((bmhq)sparseArray1.get(3)), ((bmbw)sparseArray1.get(-1)), ((BigInteger)sparseArray1.get(-2)), ((BigInteger)sparseArray1.get(-3)));
                                        goto label_138;
                                    }
                                    default: {
                                        throw new IOException("The number of entries in the map must be either 4 or 5");
                                    }
                                }
                            }
                            else {
                                bmcb0 = null;
                            }
                            goto label_142;
                        }
                        catch(blzy | hhrr | hhrm exception1) {
                            throw new IOException(exception1.getMessage(), exception1);
                        }
                        try {
                        label_138:
                            FIN.finallyCodeBegin$NT(v2);
                            hhrv0.close();
                            FIN.finallyCodeEnd$NT(v2);
                            goto label_141;
                        }
                        catch(IOException unused_ex) {
                        label_141:
                            bmcb0 = bmcb1;
                            try {
                            label_142:
                                return new blzu(blzx0, new bmam(bmcb0, (ggfz1.containsKey(bmam.c) ? ((hhrs)ggfz1.get(bmam.c)).j().d() : null), (ggfz1.containsKey(bmam.d) ? ((long)((hhrs)ggfz1.get(bmam.d)).l().a) : null), (ggfz1.containsKey(bmam.e) ? Boolean.valueOf(((hhrs)ggfz1.get(bmam.e)).i().a) : null), (ggfz1.containsKey(bmam.f) ? ((long)((hhrs)ggfz1.get(bmam.f)).l().a) : null)));
                            }
                            catch(blzy | hhrr | hhrm exception1) {
                                throw new IOException(exception1.getMessage(), exception1);
                            }
                        }
                        catch(hhrr exception1) {
                            throw new IOException(exception1.getMessage(), exception1);
                        }
                    }
                    case 1: 
                    case 6: {
                        return new blzu(blzx0, bmal.b(hhrs0, blzt0));
                    }
                    default: {
                        bmzx.c("UNKNOWN", "CTAP_INVALID_COMMAND");
                        throw new IllegalStateException("Unrecognizable input command type: " + blzt0.a());
                    }
                }
            }
        }
        return new blzu(blzx0, null);
    }
}

