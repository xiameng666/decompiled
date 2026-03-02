import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class bmae extends blzt {
    public static final hhrn a;
    public static final hhrn b;
    public static final hhrn c;
    public static final hhrn d;
    public static final hhrn e;
    static final hhrn f;
    static final hhrn g;
    public static final ggfp h;
    public static final ggfp i;
    public static final bboh j;
    public final String k;
    public final byte[] l;
    public final List m;
    public final AuthenticationExtensions n;
    public final boolean o;
    public final boolean p;
    private final byte[] q;
    private final Integer r;

    static {
        hhrn hhrn0 = new hhrn(1L);
        bmae.a = hhrn0;
        hhrn hhrn1 = new hhrn(2L);
        bmae.b = hhrn1;
        hhrn hhrn2 = new hhrn(3L);
        bmae.c = hhrn2;
        hhrn hhrn3 = new hhrn(4L);
        bmae.d = hhrn3;
        hhrn hhrn4 = new hhrn(5L);
        bmae.e = hhrn4;
        hhrn hhrn5 = new hhrn(6L);
        bmae.f = hhrn5;
        hhrn hhrn6 = new hhrn(7L);
        bmae.g = hhrn6;
        bmae.h = ggfp.K(hhrn0, hhrn1);
        bmae.i = ggfp.O(hhrn0, hhrn1, hhrn2, hhrn3, hhrn4, hhrn5, new hhrs[]{hhrn6});
        bmae.j = bnaa.e("AuthenticatorGetAssertionCommand");
    }

    public bmae(String s, byte[] arr_b, List list0, AuthenticationExtensions authenticationExtensions0, boolean z, boolean z1, byte[] arr_b1, Integer integer0) {
        this.k = s;
        this.l = arr_b;
        this.m = list0;
        this.n = authenticationExtensions0;
        this.o = z;
        this.p = z1;
        this.q = arr_b1;
        this.r = integer0;
    }

    @Override  // blzt
    public final blzs a() {
        return blzs.b;
    }

    @Override  // blzt
    public final hhrp d() {
        hhrp hhrp1;
        batl.s(this.k);
        batl.s(this.l);
        ArrayList arrayList0 = new ArrayList();
        try {
            hhrq hhrq0 = new hhrq(this.k);
            arrayList0.add(new hhro(bmae.a, hhrq0));
            hhrk hhrk0 = hhrs.k(this.l);
            arrayList0.add(new hhro(bmae.b, hhrk0));
            List list0 = this.m;
            if(list0 != null) {
                hhri hhri0 = bmae.b(list0);
                arrayList0.add(new hhro(bmae.c, hhri0));
            }
            AuthenticationExtensions authenticationExtensions0 = this.n;
            if(authenticationExtensions0 != null) {
                hhrp hhrp0 = bmae.c(authenticationExtensions0);
                arrayList0.add(new hhro(bmae.d, hhrp0));
            }
            boolean z = this.o;
            boolean z1 = this.p;
            if(!z) {
            label_22:
                ArrayList arrayList1 = new ArrayList();
                if(!z) {
                    hhrj hhrj0 = new hhrj(false);
                    arrayList1.add(new hhro(bmjm.k, hhrj0));
                }
                if(z1) {
                    hhrj hhrj1 = new hhrj(true);
                    arrayList1.add(new hhro(bmjm.l, hhrj1));
                }
                hhrp1 = hhrs.n(arrayList1);
            }
            else if(!z1) {
                hhrp1 = null;
            }
            else {
                z1 = true;
                goto label_22;
            }
            if(hhrp1 != null) {
                arrayList0.add(new hhro(bmae.e, hhrp1));
            }
            byte[] arr_b = this.q;
            if(arr_b != null) {
                hhrk hhrk1 = hhrs.k(arr_b);
                arrayList0.add(new hhro(bmae.f, hhrk1));
            }
            Integer integer0 = this.r;
            if(integer0 != null) {
                arrayList0.add(new hhro(bmae.g, new hhrn(((long)(((int)integer0))))));
            }
            return hhrs.n(arrayList0);
        }
        catch(hhrh hhrh0) {
            throw new RuntimeException(hhrh0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmae) ? Objects.equals(this.k, ((bmae)object0).k) && Arrays.equals(this.l, ((bmae)object0).l) && Objects.equals(this.m, ((bmae)object0).m) && Objects.equals(this.n, ((bmae)object0).n) && this.o == ((bmae)object0).o && this.p == ((bmae)object0).p && Arrays.equals(this.q, ((bmae)object0).q) && Objects.equals(this.r, ((bmae)object0).r) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.l);
        Integer integer1 = Arrays.hashCode(this.q);
        return Objects.hash(new Object[]{this.k, integer0, this.m, this.n, Boolean.valueOf(this.o), Boolean.valueOf(this.p), integer1, this.r});
    }

    @Override  // blzt
    public final String toString() {
        String s = bbmu.c(this.l);
        String s1 = bbmu.c(this.q);
        return "AuthenticatorGetAssertionCommand{\n rpId=\'" + this.k + "\', \n clientDataHash=" + s + ", \n allowList=" + this.m + ", \n extensions=" + this.n + ", \n userPresenceRequired=" + this.o + ", \n userVerificationRequired=" + this.p + ", \n pinAuth=" + s1 + ", \n pinProtocol=" + this.r + "}" + super.toString();
    }
}

