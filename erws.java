public final class erws {
    public final boolean a;
    public final Boolean b;
    public final ervi c;
    public final boolean d;
    public final String e;
    public final boolean f;
    private final String g;
    private final ibts h;

    public erws() {
        this(null, null, false, 0xFF);
    }

    public erws(ervi ervi0, String s, boolean z, int v) {
        this(false, null, ((v & 8) == 0 ? ervi0 : null), (v & 16) != 0, null, ((v & 0x40) == 0 ? s : null), ((boolean)(((v & 0x80) == 0 ? 1 : 0) & ((int)z))));
    }

    public erws(boolean z, Boolean boolean0, ervi ervi0, boolean z1, ibts ibts0, String s, boolean z2) {
        this.a = z;
        this.b = boolean0;
        this.g = null;
        this.c = ervi0;
        this.d = z1;
        this.h = ibts0;
        this.e = s;
        this.f = z2;
    }

    public static erws a(erws erws0, boolean z, Boolean boolean0, ervi ervi0, boolean z1, ibts ibts0, String s, boolean z2, int v) {
        if((v & 1) != 0) {
            z = erws0.a;
        }
        if((v & 2) != 0) {
            boolean0 = erws0.b;
        }
        if((v & 8) != 0) {
            ervi0 = erws0.c;
        }
        if((v & 16) != 0) {
            z1 = erws0.d;
        }
        if((v & 0x20) != 0) {
            ibts0 = erws0.h;
        }
        if((v & 0x40) != 0) {
            s = erws0.e;
        }
        if((v & 0x80) != 0) {
            z2 = erws0.f;
        }
        return new erws(z, boolean0, ervi0, z1, ibts0, s, z2);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof erws)) {
            return false;
        }
        if(this.a != ((erws)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((erws)object0).b)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.c, ((erws)object0).c)) {
            return false;
        }
        if(this.d != ((erws)object0).d) {
            return false;
        }
        if(!ibuq.m(this.h, ((erws)object0).h)) {
            return false;
        }
        return ibuq.m(this.e, ((erws)object0).e) ? this.f == ((erws)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((erwr.a(this.a) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 961 + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + erwr.a(this.d)) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F;
        String s = this.e;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 + v) * 0x1F + erwr.a(this.f);
    }

    @Override
    public final String toString() {
        return "SpatulaSwitchState(isUpdating=" + this.a + ", isChecked=" + this.b + ", errorMessage=null, recoveryOption=" + this.c + ", isChangeable=" + this.d + ", onCheckedChange=" + this.h + ", accountName=" + this.e + ", isSupervised=" + this.f + ")";
    }
}

