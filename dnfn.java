import java.util.Arrays;

public final class dnfn {
    public final fryk a;
    public final fryv b;
    public final fryv c;
    public final fryv d;
    public final fryv e;
    public final ibth f;
    public final dnkw g;
    public final int h;
    public final fhvp[] i;

    public dnfn() {
        this(null, null, null, null, null, 0, null, 0x1FF);
    }

    public dnfn(fryk fryk0, fryv fryv0, fryv fryv1, fryv fryv2, fryv fryv3, ibth ibth0, dnkw dnkw0, int v, fhvp[] arr_fhvp) {
        ibuq.f(fryk0, "startIcon");
        ibuq.f(fryv0, "startIconContentDescription");
        ibuq.f(fryv1, "title");
        ibuq.f(fryv2, "subtitle");
        ibuq.f(fryv3, "endText");
        ibuq.f(ibth0, "onClick");
        super();
        this.a = fryk0;
        this.b = fryv0;
        this.c = fryv1;
        this.d = fryv2;
        this.e = fryv3;
        this.f = ibth0;
        this.g = dnkw0;
        this.h = v;
        this.i = arr_fhvp;
    }

    public dnfn(fryv fryv0, fryv fryv1, fryv fryv2, ibth ibth0, dnkw dnkw0, int v, fhvp[] arr_fhvp, int v1) {
        fryh fryh0 = (v1 & 1) == 0 ? null : new fryh(0);
        fryu fryu0 = (v1 & 2) == 0 ? null : new fryu("");
        if((v1 & 4) != 0) {
            fryv0 = new fryu("");
        }
        fryv fryv3 = (v1 & 8) == 0 ? fryv1 : new fryu("");
        fryv fryv4 = (v1 & 16) == 0 ? fryv2 : new fryu("");
        ibth ibth1 = (v1 & 0x20) == 0 ? ibth0 : new dnfm();
        this(fryh0, fryu0, fryv0, fryv3, fryv4, ibth1, ((v1 & 0x40) == 0 ? dnkw0 : null), ((v1 & 0x80) == 0 ? v : 0), ((v1 & 0x100) == 0 ? arr_fhvp : null));
    }

    public static dnfn a(dnfn dnfn0, dnkw dnkw0) {
        ibuq.f(dnfn0.a, "startIcon");
        ibuq.f(dnfn0.b, "startIconContentDescription");
        ibuq.f(dnfn0.c, "title");
        ibuq.f(dnfn0.d, "subtitle");
        ibuq.f(dnfn0.e, "endText");
        ibuq.f(dnfn0.f, "onClick");
        return new dnfn(dnfn0.a, dnfn0.b, dnfn0.c, dnfn0.d, dnfn0.e, dnfn0.f, dnkw0, dnfn0.h, dnfn0.i);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dnfn)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dnfn)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dnfn)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dnfn)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dnfn)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dnfn)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((dnfn)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((dnfn)object0).g)) {
            return false;
        }
        return this.h == ((dnfn)object0).h ? ibuq.m(this.i, ((dnfn)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((fryh)this.a).a * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + this.h) * 0x1F;
        fhvp[] arr_fhvp = this.i;
        if(arr_fhvp != null) {
            v = Arrays.hashCode(arr_fhvp);
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.i);
        return "FopCardTransactionViewState(startIcon=" + this.a + ", startIconContentDescription=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", endText=" + this.e + ", onClick=" + this.f + ", transactionStatus=" + this.g + ", veLogConst=" + this.h + ", veLogMetadata=" + s + ")";
    }
}

