import java.util.Arrays;

public final class fuat implements fulf {
    public final fryv a;
    public final fryv b;
    public final fubd c;
    public final fuca d;
    public final int e;
    public final fhvp[] f;
    public final ibth g;
    public final ftzw h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public boolean l;
    public fule m;
    public final boolean n;

    public fuat() {
        this(null, null, null, null, 0, null, null, null, null, false, false, false, null, false, 0x3FFF);
    }

    public fuat(fryv fryv0, fryv fryv1, fubd fubd0, fuca fuca0, int v, fhvp[] arr_fhvp, ibth ibth0, ftzw ftzw0, String s, boolean z, boolean z1, boolean z2, fule fule0) {
        ibuq.f(fule0, "position");
        this(fryv0, fryv1, fubd0, fuca0, v, arr_fhvp, ibth0, ftzw0, s, z, z1, z2, fule0, false, 0x2000);
    }

    public fuat(fryv fryv0, fryv fryv1, fubd fubd0, fuca fuca0, int v, fhvp[] arr_fhvp, ibth ibth0, ftzw ftzw0, String s, boolean z, boolean z1, boolean z2, fule fule0, boolean z3) {
        ibuq.f(fule0, "position");
        super();
        this.a = fryv0;
        this.b = fryv1;
        this.c = fubd0;
        this.d = fuca0;
        this.e = v;
        this.f = arr_fhvp;
        this.g = ibth0;
        this.h = ftzw0;
        this.i = s;
        this.j = z;
        this.k = z1;
        this.l = z2;
        this.m = fule0;
        this.n = z3;
    }

    public fuat(fryv fryv0, fryv fryv1, fubd fubd0, fuca fuca0, int v, fhvp[] arr_fhvp, ibth ibth0, ftzw ftzw0, String s, boolean z, boolean z1, boolean z2, fule fule0, boolean z3, int v1) {
        this((1 == (v1 & 1) ? null : fryv0), ((v1 & 2) == 0 ? fryv1 : null), ((v1 & 4) == 0 ? fubd0 : null), ((v1 & 8) == 0 ? fuca0 : null), ((v1 & 16) == 0 ? v : 0), ((v1 & 0x20) == 0 ? arr_fhvp : null), ((v1 & 0x40) == 0 ? ibth0 : null), ((v1 & 0x80) == 0 ? ftzw0 : null), ((v1 & 0x100) == 0 ? s : null), ((boolean)(((v1 & 0x200) == 0 ? 1 : 0) & ((int)z))), ((boolean)(((v1 & 0x400) == 0 ? 1 : 0) & ((int)z1))), ((boolean)(((v1 & 0x800) == 0 ? 1 : 0) & ((int)z2))), ((v1 & 0x1000) == 0 ? fule0 : fule.a), ((boolean)(((v1 & 0x2000) == 0 ? 1 : 0) & ((int)z3))));
    }

    @Override  // fulf
    public final void a(fule fule0) {
        ibuq.f(fule0, "<set-?>");
        this.m = fule0;
    }

    @Override  // fulf
    public final void b() {
        this.l = true;
    }

    public final fuat c(boolean z) {
        return (this.d instanceof fubx) ? fuat.d(this, null, null, fubx.b(((fubx)this.d), z), null, false, false, null, 0x3FF7) : this;
    }

    public static fuat d(fuat fuat0, fryv fryv0, fubd fubd0, fuca fuca0, ibth ibth0, boolean z, boolean z1, fule fule0, int v) {
        String s = null;
        fryv fryv1 = (v & 1) == 0 ? null : fuat0.a;
        fryv fryv2 = (v & 2) == 0 ? fryv0 : fuat0.b;
        fubd fubd1 = (v & 4) == 0 ? fubd0 : fuat0.c;
        fuca fuca1 = (v & 8) == 0 ? fuca0 : fuat0.d;
        boolean z2 = false;
        int v1 = (v & 16) == 0 ? 0 : fuat0.e;
        fhvp[] arr_fhvp = (v & 0x20) == 0 ? null : fuat0.f;
        ibth ibth1 = (v & 0x40) == 0 ? ibth0 : fuat0.g;
        ftzw ftzw0 = (v & 0x80) == 0 ? null : fuat0.h;
        if((v & 0x100) != 0) {
            s = fuat0.i;
        }
        boolean z3 = (v & 0x200) == 0 ? z : fuat0.j;
        if((v & 0x400) != 0) {
            z2 = fuat0.k;
        }
        boolean z4 = (v & 0x800) == 0 ? z1 : fuat0.l;
        fule fule1 = (v & 0x1000) == 0 ? fule0 : fuat0.m;
        ibuq.f(fule1, "position");
        return new fuat(fryv1, fryv2, fubd1, fuca1, v1, arr_fhvp, ibth1, ftzw0, s, z3, z2, z4, fule1, fuat0.n);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuat)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuat)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fuat)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fuat)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fuat)object0).d)) {
            return false;
        }
        if(this.e != ((fuat)object0).e) {
            return false;
        }
        if(!ibuq.m(this.f, ((fuat)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((fuat)object0).g)) {
            return false;
        }
        if(!ibuq.m(this.h, ((fuat)object0).h)) {
            return false;
        }
        if(!ibuq.m(this.i, ((fuat)object0).i)) {
            return false;
        }
        if(this.j != ((fuat)object0).j) {
            return false;
        }
        if(this.k != ((fuat)object0).k) {
            return false;
        }
        if(this.l != ((fuat)object0).l) {
            return false;
        }
        return this.m == ((fuat)object0).m ? this.n == ((fuat)object0).n : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + this.e) * 0x1F;
        int v2 = this.f == null ? 0 : Arrays.hashCode(this.f);
        int v3 = this.g == null ? 0 : this.g.hashCode();
        int v4 = this.h == null ? 0 : this.h.hashCode();
        String s = this.i;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v) * 0x1F + fuas.a(this.j)) * 0x1F + fuas.a(this.k)) * 0x1F + fuas.a(this.l)) * 0x1F + this.m.hashCode()) * 0x1F + fuas.a(this.n);
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.f);
        return "RowSecondaryState(title=" + this.a + ", subtitle=" + this.b + ", leadingElement=" + this.c + ", trailingElement=" + this.d + ", veLogConst=" + this.e + ", veLogMetadata=" + s + ", onClick=" + this.g + ", actionButton=" + this.h + ", tag=" + this.i + ", isCompact=" + this.j + ", isLarge=" + this.k + ", isContained=" + this.l + ", position=" + this.m + ", isSelected=" + this.n + ")";
    }
}

