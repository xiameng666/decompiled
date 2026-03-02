import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

public final class bmbq {
    public static final ggfp a;
    public static final ggfp b;
    public static final bboh c;
    public final byte[] d;
    public final String e;
    public final String f;
    private final String g;

    static {
        bmbq.a = new ggoh(bmjm.a);
        bmbq.b = ggfp.M(bmjm.a, bmjm.e, bmjm.f, bmjm.d);
        bmbq.c = bnaa.e("AuthenticatorPublicKeyCredentialUserEntity");
    }

    public bmbq(byte[] arr_b, String s, String s1, String s2) {
        gftb.check(arr_b);
        this.d = arr_b;
        this.e = s;
        this.g = s1;
        this.f = s2;
    }

    public final hhrs a() {
        ArrayList arrayList0 = new ArrayList();
        hhrk hhrk0 = hhrs.k(this.d);
        arrayList0.add(new hhro(bmjm.a, hhrk0));
        String s = this.e;
        if(s != null) {
            hhrq hhrq0 = new hhrq(s);
            arrayList0.add(new hhro(bmjm.d, hhrq0));
        }
        String s1 = this.f;
        if(s1 != null) {
            hhrq hhrq1 = new hhrq(s1);
            arrayList0.add(new hhro(bmjm.f, hhrq1));
        }
        String s2 = this.g;
        if(s2 != null) {
            hhrq hhrq2 = new hhrq(s2);
            arrayList0.add(new hhro(bmjm.e, hhrq2));
        }
        return hhrs.n(arrayList0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmbq) ? Arrays.equals(this.d, ((bmbq)object0).d) && Objects.equals(this.e, ((bmbq)object0).e) && Objects.equals(this.g, ((bmbq)object0).g) && Objects.equals(this.f, ((bmbq)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(this.d), this.e, this.g, this.f});
    }

    @Override
    public final String toString() {
        return "AuthenticatorPublicKeyCredentialUserEntity{id=" + bbmu.c(this.d) + ", name=\'" + this.e + "\', icon=\'" + this.g + "\', displayName=\'" + this.f + "\'}";
    }
}

