import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class bmah extends blzt {
    private static final hhrn a;
    private static final hhrn b;
    private static final hhrn c;
    private static final hhrn d;
    private static final hhrn e;
    private static final hhrn f;
    private static final hhrn g;
    private static final hhrn h;
    private static final hhrn i;
    private final byte[] j;
    private final PublicKeyCredentialRpEntity k;
    private final PublicKeyCredentialUserEntity l;
    private final List m;
    private final List n;
    private final AuthenticationExtensions o;
    private final boolean p;
    private final boolean q;
    private final byte[] r;
    private final Integer s;

    static {
        bmah.a = new hhrn(1L);
        bmah.b = new hhrn(2L);
        bmah.c = new hhrn(3L);
        bmah.d = new hhrn(4L);
        bmah.e = new hhrn(5L);
        bmah.f = new hhrn(6L);
        bmah.g = new hhrn(7L);
        bmah.h = new hhrn(8L);
        bmah.i = new hhrn(9L);
    }

    public bmah(byte[] arr_b, PublicKeyCredentialRpEntity publicKeyCredentialRpEntity0, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity0, List list0, List list1, AuthenticationExtensions authenticationExtensions0, boolean z, boolean z1, byte[] arr_b1, Integer integer0) {
        this.j = arr_b;
        this.k = publicKeyCredentialRpEntity0;
        this.l = publicKeyCredentialUserEntity0;
        this.m = list0;
        this.n = list1;
        this.o = authenticationExtensions0;
        this.p = z;
        this.q = z1;
        this.r = arr_b1;
        this.s = integer0;
    }

    @Override  // blzt
    public final blzs a() {
        return blzs.a;
    }

    @Override  // blzt
    public final hhrp d() {
        hhrp hhrp1;
        ArrayList arrayList0 = new ArrayList();
        try {
            hhrk hhrk0 = hhrs.k(this.j);
            arrayList0.add(new hhro(bmah.a, hhrk0));
            hhrn hhrn0 = bmah.b;
            ArrayList arrayList1 = new ArrayList();
            hhrq hhrq0 = bmjm.a;
            arrayList1.add(new hhro(hhrq0, new hhrq(this.k.a)));
            hhrq hhrq1 = bmjm.d;
            arrayList1.add(new hhro(hhrq1, new hhrq(this.k.b)));
            String s = this.k.c;
            if(s != null) {
                hhrq hhrq2 = new hhrq(s);
                arrayList1.add(new hhro(bmjm.e, hhrq2));
            }
            arrayList0.add(new hhro(hhrn0, hhrs.n(arrayList1)));
            hhrn hhrn1 = bmah.c;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new hhro(hhrq0, hhrs.k(this.l.a.toByteArray())));
            arrayList2.add(new hhro(hhrq1, new hhrq(this.l.b)));
            hhrq hhrq3 = new hhrq(this.l.d);
            arrayList2.add(new hhro(bmjm.f, hhrq3));
            String s1 = this.l.c;
            if(s1 != null) {
                hhrq hhrq4 = new hhrq(s1);
                arrayList2.add(new hhro(bmjm.e, hhrq4));
            }
            arrayList0.add(new hhro(hhrn1, hhrs.n(arrayList2)));
            hhrn hhrn2 = bmah.d;
            ArrayList arrayList3 = new ArrayList();
            for(Object object0: this.m) {
                arrayList3.add(((PublicKeyCredentialParameters)object0).c());
            }
            arrayList0.add(new hhro(hhrn2, hhrs.g(arrayList3)));
            List list0 = this.n;
            if(list0 != null) {
                hhri hhri0 = blzt.b(list0);
                arrayList0.add(new hhro(bmah.e, hhri0));
            }
            AuthenticationExtensions authenticationExtensions0 = this.o;
            if(authenticationExtensions0 != null) {
                hhrp hhrp0 = bmah.c(authenticationExtensions0);
                arrayList0.add(new hhro(bmah.f, hhrp0));
            }
            boolean z = this.p;
            boolean z1 = this.q;
            if(z) {
            label_48:
                ArrayList arrayList4 = new ArrayList();
                if(z) {
                    hhrj hhrj0 = new hhrj(true);
                    arrayList4.add(new hhro(bmjm.i, hhrj0));
                }
                if(z1) {
                    hhrj hhrj1 = new hhrj(true);
                    arrayList4.add(new hhro(bmjm.l, hhrj1));
                }
                hhrp1 = hhrs.n(arrayList4);
            }
            else if(!z1) {
                hhrp1 = null;
            }
            else {
                z1 = true;
                goto label_48;
            }
            if(hhrp1 != null) {
                arrayList0.add(new hhro(bmah.g, hhrp1));
            }
            byte[] arr_b = this.r;
            if(arr_b != null) {
                hhrk hhrk1 = hhrs.k(arr_b);
                arrayList0.add(new hhro(bmah.h, hhrk1));
            }
            Integer integer0 = this.s;
            if(integer0 != null) {
                arrayList0.add(new hhro(bmah.i, new hhrn(((long)(((int)integer0))))));
            }
            return hhrs.n(arrayList0);
        }
        catch(hhrh hhrh0) {
            throw new RuntimeException(hhrh0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmah) ? Arrays.equals(this.j, ((bmah)object0).j) && Objects.equals(this.k, ((bmah)object0).k) && Objects.equals(this.l, ((bmah)object0).l) && Objects.equals(this.m, ((bmah)object0).m) && Objects.equals(this.n, ((bmah)object0).n) && Objects.equals(this.o, ((bmah)object0).o) && this.p == ((bmah)object0).p && this.q == ((bmah)object0).q && Arrays.equals(this.r, ((bmah)object0).r) && Objects.equals(this.s, ((bmah)object0).s) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.j);
        Integer integer1 = Arrays.hashCode(this.r);
        return Objects.hash(new Object[]{integer0, this.k, this.l, this.m, this.n, this.o, Boolean.valueOf(this.p), Boolean.valueOf(this.q), integer1, this.s});
    }

    @Override  // blzt
    public final String toString() {
        String s = bbmu.c(this.j);
        String s1 = bbmu.c(this.r);
        return "AuthenticatorMakeCredentialCommand{\n clientDataHash=" + s + ", \n rp=" + this.k.toString() + ", \n user=" + this.l.toString() + ", \n publicKeyCredParams=" + this.m.toString() + ", \n excludeList=" + this.n + ", \n extensions=" + this.o + ", \n keyResidenceRequired=" + this.p + ", \n userVerificationRequired=" + this.q + ", \n pinAuth=" + s1 + ", \n pinProtocol=" + this.s + "}" + super.toString();
    }
}

