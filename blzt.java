import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSessionIdExtension;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;
import java.util.List;

public abstract class blzt {
    public abstract blzs a();

    protected static hhri b(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(((PublicKeyCredentialDescriptor)object0).c());
        }
        return hhrs.g(arrayList0);
    }

    protected static hhrp c(AuthenticationExtensions authenticationExtensions0) {
        hhrp hhrp1;
        hhrj hhrj2;
        ArrayList arrayList0 = new ArrayList();
        if(authenticationExtensions0.c != null) {
            hhrj hhrj0 = new hhrj(true);
            arrayList0.add(new hhro(bmjm.A, hhrj0));
        }
        GoogleMultiAssertionExtension googleMultiAssertionExtension0 = authenticationExtensions0.d;
        if(googleMultiAssertionExtension0 != null) {
            hhrj hhrj1 = new hhrj(googleMultiAssertionExtension0.a);
            arrayList0.add(new hhro(bmjm.D, hhrj1));
        }
        GoogleSessionIdExtension googleSessionIdExtension0 = authenticationExtensions0.e;
        if(googleSessionIdExtension0 != null) {
            hhrn hhrn0 = new hhrn(googleSessionIdExtension0.a);
            arrayList0.add(new hhro(bmjm.E, hhrn0));
        }
        HmacSecretExtension hmacSecretExtension0 = authenticationExtensions0.l;
        if(hmacSecretExtension0 != null) {
            ByteString hfsf0 = hmacSecretExtension0.e;
            hhrq hhrq0 = bmjm.B;
            if(hfsf0 == null) {
                hhrj2 = new hhrj(true);
            }
            else {
                gftb.check(hmacSecretExtension0.f);
                gftb.check(hmacSecretExtension0.g);
                try {
                    hhro[] arr_hhro = new hhro[4];
                    hhrp hhrp0 = hhrs.q(hfsf0.toByteArray()).m();
                    arr_hhro[0] = new hhro(HmacSecretExtension.a, hhrp0);
                    hhrk hhrk0 = hhrs.k(hmacSecretExtension0.f.toByteArray());
                    arr_hhro[1] = new hhro(HmacSecretExtension.b, hhrk0);
                    hhrk hhrk1 = hhrs.k(hmacSecretExtension0.g.toByteArray());
                    arr_hhro[2] = new hhro(HmacSecretExtension.c, hhrk1);
                    hhrn hhrn1 = new hhrn(((long)hmacSecretExtension0.h));
                    arr_hhro[3] = new hhro(HmacSecretExtension.d, hhrn1);
                    hhrj2 = hhrs.o(arr_hhro);
                }
                catch(hhrh | hhrl | hhrr exception0) {
                    throw new IllegalStateException("Failed to encode hmac-secret extension map.", exception0);
                }
            }
            arrayList0.add(new hhro(hhrq0, hhrj2));
            return hhrs.n(arrayList0);
        }
        if(hsvg.g()) {
            PrfExtension prfExtension0 = authenticationExtensions0.j;
            if(prfExtension0 != null) {
                hhrq hhrq1 = bmjm.C;
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                try {
                    for(int v = 0; true; v += 2) {
                        byte[][] arr2_b = prfExtension0.a;
                        if(v >= arr2_b.length) {
                            break;
                        }
                        byte[] arr_b = arr2_b[v];
                        if(arr_b == null) {
                            arrayList1.add(new hhro(new hhrq("eval"), PrfExtension.e(arr2_b[v + 1])));
                        }
                        else {
                            arrayList2.add(new hhro(hhrk.k(arr_b), PrfExtension.e(arr2_b[v + 1])));
                        }
                    }
                    if(!arrayList2.isEmpty()) {
                        arrayList1.add(new hhro(new hhrq("evalByCredential"), hhrs.n(arrayList2)));
                    }
                    hhrp1 = hhrs.n(arrayList1);
                }
                catch(hhrh | hhrl exception1) {
                    throw new IllegalStateException("Failed to encode prf extension map.", exception1);
                }
                arrayList0.add(new hhro(hhrq1, hhrp1));
                return hhrs.n(arrayList0);
            }
        }
        return hhrs.n(arrayList0);
    }

    public abstract hhrp d();

    public final byte[] e() {
        byte[] arr_b = {this.a().h};
        hhrp hhrp0 = this.d();
        return hhrp0 == null ? arr_b : glwl.d(new byte[][]{arr_b, hhrp0.s()});
    }

    @Override
    public String toString() {
        return "Ctap2Command{type=" + this.a() + ", cborMap=" + this.d() + "}";
    }
}

