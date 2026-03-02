import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.UnsignedExtensionOutputs;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class bmal extends blzv {
    static final hhrs a;
    static final hhrs b;
    static final hhrs c;
    static final hhrs d;
    static final hhrs e;
    static final hhrs f;
    static final hhrs g;
    static final hhrs h;
    public final PublicKeyCredentialDescriptor i;
    public final byte[] j;
    public final byte[] k;
    public final bmbq l;
    public final Integer m;
    public final UnsignedExtensionOutputs n;
    private static final ggfp o;
    private static final ggfp p;
    private static final bboh q;
    private final Boolean r;
    private final byte[] s;

    static {
        hhrn hhrn0 = new hhrn(1L);
        bmal.a = hhrn0;
        hhrn hhrn1 = new hhrn(2L);
        bmal.b = hhrn1;
        hhrn hhrn2 = new hhrn(3L);
        bmal.c = hhrn2;
        hhrn hhrn3 = new hhrn(4L);
        bmal.d = hhrn3;
        hhrn hhrn4 = new hhrn(5L);
        bmal.e = hhrn4;
        hhrn hhrn5 = new hhrn(6L);
        bmal.f = hhrn5;
        hhrn hhrn6 = new hhrn(7L);
        bmal.g = hhrn6;
        hhrn hhrn7 = new hhrn(8L);
        bmal.h = hhrn7;
        bmal.o = ggfp.K(hhrn1, hhrn2);
        bmal.p = ggfp.O(hhrn0, hhrn1, hhrn2, hhrn3, hhrn4, hhrn5, new hhrs[]{hhrn6, hhrn7});
        bmal.q = bnaa.e("AuthenticatorAssertionResponseData");
    }

    public bmal(PublicKeyCredentialDescriptor publicKeyCredentialDescriptor0, byte[] arr_b, byte[] arr_b1, bmbq bmbq0, Integer integer0, Boolean boolean0, byte[] arr_b2, UnsignedExtensionOutputs unsignedExtensionOutputs0) {
        this.i = publicKeyCredentialDescriptor0;
        this.j = arr_b;
        this.k = arr_b1;
        this.l = bmbq0;
        this.m = integer0;
        this.r = boolean0;
        this.s = arr_b2;
        this.n = unsignedExtensionOutputs0;
    }

    @Override  // blzv
    public final hhrp a() {
        try {
            ArrayList arrayList0 = new ArrayList();
            hhrk hhrk0 = hhrs.k(this.j);
            arrayList0.add(new hhro(bmal.b, hhrk0));
            hhrk hhrk1 = hhrs.k(this.k);
            arrayList0.add(new hhro(bmal.c, hhrk1));
            PublicKeyCredentialDescriptor publicKeyCredentialDescriptor0 = this.i;
            if(publicKeyCredentialDescriptor0 != null) {
                hhrp hhrp0 = publicKeyCredentialDescriptor0.c();
                arrayList0.add(new hhro(bmal.a, hhrp0));
            }
            Integer integer0 = this.m;
            if(integer0 != null) {
                arrayList0.add(new hhro(bmal.e, new hhrn(((long)(((int)integer0))))));
            }
            bmbq bmbq0 = this.l;
            if(bmbq0 != null) {
                hhrs hhrs0 = bmbq0.a();
                arrayList0.add(new hhro(bmal.d, hhrs0));
            }
            Boolean boolean0 = this.r;
            if(boolean0 != null) {
                arrayList0.add(new hhro(bmal.f, new hhrj(boolean0.booleanValue())));
            }
            byte[] arr_b = this.s;
            if(arr_b != null) {
                hhrk hhrk2 = hhrs.k(arr_b);
                arrayList0.add(new hhro(bmal.g, hhrk2));
            }
            UnsignedExtensionOutputs unsignedExtensionOutputs0 = this.n;
            if(unsignedExtensionOutputs0 != null) {
                hhrs hhrs1 = unsignedExtensionOutputs0.b();
                arrayList0.add(new hhro(bmal.h, hhrs1));
            }
            return hhrs.n(arrayList0);
        }
        catch(hhrh | hhrr exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public static bmal b(hhrs hhrs0, blzt blzt0) {
        boolean z = false;
        batl.b((blzt0 instanceof bmae) || (blzt0 instanceof bmag));
        ggfz ggfz0 = blzq.d(hhrs0, "Response data for AuthenticatorGet*Assertion not encoded in CBOR map");
        ggnk ggnk0 = ggfz0.d;
        if(!ggnk0.containsAll(bmal.o)) {
            throw new blzy("Response map for AuthenticatorGet*Assertion is missing one or more of the authData and signature required fields");
        }
        ggqj ggqj0 = ggog.d(ggnk0, bmal.p).c();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            ((ggtj)((ggtj)bmal.q.h()).ar(0xE64)).B("Unrecognized key present in response map: %s", ((hhrs)object0));
        }
        bmak bmak0 = new bmak();
        hhrs hhrs1 = (hhrs)ggfz0.get(bmal.b);
        bmak0.b(blzq.g(hhrs1, a.O(hhrs1, "Response map for AuthenticatorGet*Assertion contains a non-bytestring CBOR value: ", " for authData label")));
        hhrs hhrs2 = (hhrs)ggfz0.get(bmal.c);
        bmak0.d(blzq.g(hhrs2, a.O(hhrs2, "Response map for AuthenticatorGet*Assertion contains a non-bytestring CBOR value: ", " for signature label")));
        hhrs hhrs3 = bmal.a;
        if(ggfz0.containsKey(hhrs3)) {
            try {
                bmak0.a = PublicKeyCredentialDescriptor.a(((hhrs)ggfz0.get(hhrs3)));
                goto label_27;
            }
            catch(bmil bmil0) {
                throw new blzy("Response data for AuthenticatorGet*Assertion included invalid high-level data structures", bmil0);
            }
        }
        if((blzt0 instanceof bmae) || (blzt0 instanceof bmag)) {
            z = true;
        }
        batl.b(z);
        if(!(blzt0 instanceof bmag)) {
            List list0 = ((bmae)blzt0).m;
            if(list0 != null && list0.size() == 1) {
            label_27:
                hhrs hhrs4 = bmal.d;
                if(ggfz0.containsKey(hhrs4)) {
                    try {
                        hhrs hhrs5 = (hhrs)ggfz0.get(hhrs4);
                        gftb.check(hhrs5);
                        if(!(hhrs5 instanceof hhrp)) {
                            throw new IOException("CBOR value representing user entity isn\'t a CBOR map");
                        }
                        ggfz ggfz1 = ((hhrp)hhrs5).a;
                        ggnk ggnk1 = ggfz1.d;
                        if(!ggnk1.containsAll(bmbq.a)) {
                            throw new IOException("CBOR map representing user entity doesn\'t contain id label");
                        }
                        ggqj ggqj1 = ggog.d(ggnk1, bmbq.b).c();
                        while(ggqj1.hasNext()) {
                            Object object1 = ggqj1.next();
                            ((ggtj)bmbq.c.h()).B("Unrecognized key present in user entity map: %s", ((hhrs)object1));
                        }
                        bmbp bmbp0 = new bmbp();
                        hhrs hhrs6 = (hhrs)ggfz1.get(bmjm.a);
                        gftb.check(hhrs6);
                        if(!(hhrs6 instanceof hhrk)) {
                            throw new IOException("Found a non-bytestring CBOR value: " + hhrs6 + " for id label in map for user entity");
                        }
                        bmbp0.b(((hhrk)hhrs6).a.toByteArray());
                        hhrq hhrq0 = bmjm.e;
                        if(ggfz1.containsKey(hhrq0)) {
                            hhrs hhrs7 = (hhrs)ggfz1.get(hhrq0);
                            gftb.check(hhrs7);
                            if(!(hhrs7 instanceof hhrq)) {
                                throw new IOException("Found a non-textstring CBOR value: " + hhrs7 + " for icon label in map for user entity");
                            }
                            bmbp0.b = ((hhrq)hhrs7).a;
                        }
                        hhrq hhrq1 = bmjm.d;
                        if(ggfz1.containsKey(hhrq1)) {
                            hhrs hhrs8 = (hhrs)ggfz1.get(hhrq1);
                            gftb.check(hhrs8);
                            if(!(hhrs8 instanceof hhrq)) {
                                throw new IOException("Found a non-textstring CBOR value: " + hhrs8 + " for name label in map for user entity");
                            }
                            bmbp0.a = ((hhrq)hhrs8).a;
                        }
                        hhrq hhrq2 = bmjm.f;
                        if(ggfz1.containsKey(hhrq2)) {
                            hhrs hhrs9 = (hhrs)ggfz1.get(hhrq2);
                            gftb.check(hhrs9);
                            if(!(hhrs9 instanceof hhrq)) {
                                throw new IOException("Found a non-textstring CBOR value: " + hhrs9 + " for displayName label in map for user entity");
                            }
                            bmbp0.c = ((hhrq)hhrs9).a;
                        }
                        bmak0.b = bmbp0.a();
                    }
                    catch(IOException iOException0) {
                        throw new blzy("Response data for AuthenticatorGet*Assertion included invalid high-level data structures", iOException0);
                    }
                }
                hhrs hhrs10 = bmal.e;
                if(ggfz0.containsKey(hhrs10)) {
                    if(!(blzt0 instanceof bmae)) {
                        throw new blzy("Response data for AuthenticatorGet*Assertion included numberOfCredentials field when it was not appropriate to do so");
                    }
                    hhrs hhrs11 = (hhrs)ggfz0.get(hhrs10);
                    batl.s(((bmae)blzt0));
                    long v = blzq.a(hhrs11, a.O(hhrs11, "Response map for AuthenticatorGetAssertion contains a non-integer CBOR value: ", " for numberOfCredentials label"));
                    if(v <= 0L) {
                        throw new blzy(a.O(hhrs11, "Response map for AuthenticatorGetAssertion contains a non-positive integer: ", " for numberOfCredentials label"));
                    }
                    List list1 = ((bmae)blzt0).m;
                    if(list1 != null && v > ((long)list1.size())) {
                        throw new blzy("Response map for AuthenticatorGetAssertion contains a numberOfCredentials parameter whose value: " + hhrs11 + " exceeds the size of the allowList: " + list1.size());
                    }
                    if(v > 25L) {
                        throw new blzy(a.O(hhrs11, "Response map for AuthenticatorGetAssertion contains an extremely large integer: ", " for numberOfCredentials label"));
                    }
                    bmak0.c(((int)v));
                }
                hhrs hhrs12 = bmal.f;
                if(ggfz0.containsKey(hhrs12)) {
                    if(!(blzt0 instanceof bmae)) {
                        throw new blzy("Response map for AuthenticatorGet*Assertion included userSelected field when it was not appropriate to do so");
                    }
                    hhrs hhrs13 = (hhrs)ggfz0.get(hhrs12);
                    bmak0.c = Boolean.valueOf(blzq.f(hhrs13, String.format("Response map for AuthenticatorGet*Assertion contains a non-boolean CBOR value: %s for %s label", hhrs13, "userSelected")));
                }
                hhrs hhrs14 = bmal.g;
                if(ggfz0.containsKey(hhrs14)) {
                    hhrs hhrs15 = (hhrs)ggfz0.get(hhrs14);
                    bmak0.d = blzq.g(hhrs15, String.format("Response map for AuthenticatorGet*Assertion contains a non-bytestring CBOR value: %s for %s label", hhrs15, "largeBlobKey"));
                }
                hhrs hhrs16 = bmal.h;
                if(ggfz0.containsKey(hhrs16)) {
                    try {
                        bmak0.e = UnsignedExtensionOutputs.a(((hhrs)ggfz0.get(hhrs16)));
                        return bmak0.a();
                    }
                    catch(hhrh | hhrr exception0) {
                        throw new blzy("Response data for UnsignedExtensionOutput in AuthenticatorGet*Assertion included invalid high-level data structures", exception0);
                    }
                }
                return bmak0.a();
            }
        }
        throw new blzy("Response data for AuthenticatorGet*Assertion is missing the expected credential descriptor field");
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmal) ? Arrays.equals(this.j, ((bmal)object0).j) && Arrays.equals(this.k, ((bmal)object0).k) && Objects.equals(this.m, ((bmal)object0).m) && Objects.equals(this.l, ((bmal)object0).l) && Objects.equals(this.i, ((bmal)object0).i) && Objects.equals(this.r, ((bmal)object0).r) && Arrays.equals(this.s, ((bmal)object0).s) && Objects.equals(this.n, ((bmal)object0).n) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.j);
        Integer integer1 = Arrays.hashCode(this.k);
        Integer integer2 = Arrays.hashCode(this.s);
        return Objects.hash(new Object[]{integer0, integer1, this.m, this.l, this.i, this.r, integer2, this.n});
    }

    @Override
    public final String toString() {
        String s = bbmu.c(this.j);
        String s1 = bbmu.c(this.k);
        String s2 = bbmu.c(this.s);
        return "AuthenticatorAssertionResponseData{\n credentialDescriptor=" + this.i + ", \n authData=" + s + ", \n signature=" + s1 + ", \n user=" + this.l + ", \n numberOfCredentials=" + this.m + ", \n userSelected=" + this.r + ", \n largeBlobKey=" + s2 + ", \n unsignedExtensionOutputs=" + this.n + "}";
    }
}

