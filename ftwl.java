public final class ftwl {
    public final ftwm a;
    public final fryv b;
    public final fryk c;
    public final fryv d;
    public final fryk e;
    public final ibth f;

    public ftwl() {
        this(null, null, null, null, null, null, 0x3F);
    }

    public ftwl(ftwm ftwm0, fryv fryv0, fryk fryk0, fryv fryv1, fryk fryk1, ibth ibth0) {
        ibuq.f(ftwm0, "calloutType");
        ibuq.f(fryv0, "message");
        ibuq.f(fryk0, "icon");
        ibuq.f(fryv1, "actionText");
        ibuq.f(fryk1, "actionIcon");
        super();
        this.a = ftwm0;
        this.b = fryv0;
        this.c = fryk0;
        this.d = fryv1;
        this.e = fryk1;
        this.f = ibth0;
    }

    public ftwl(ftwm ftwm0, fryv fryv0, fryk fryk0, fryv fryv1, fryk fryk1, ibth ibth0, int v) {
        if((v & 1) != 0) {
            ftwm0 = ftwm.a;
        }
        if((v & 2) != 0) {
            fryv0 = new fryu("");
        }
        if((v & 4) != 0) {
            fryk0 = new fryh(0);
        }
        if((v & 8) != 0) {
            fryv1 = new fryu("");
        }
        if((v & 16) != 0) {
            fryk1 = new fryh(0);
        }
        if((v & 0x20) != 0) {
            ibth0 = null;
        }
        this(ftwm0, fryv0, fryk0, fryv1, fryk1, ibth0);
    }

    public static ftwl a(ftwl ftwl0, ftwm ftwm0, fryv fryv0, fryk fryk0, fryv fryv1, fryk fryk1, ibth ibth0, int v) {
        if((v & 1) != 0) {
            ftwm0 = ftwl0.a;
        }
        if((v & 2) != 0) {
            fryv0 = ftwl0.b;
        }
        if((v & 4) != 0) {
            fryk0 = ftwl0.c;
        }
        if((v & 8) != 0) {
            fryv1 = ftwl0.d;
        }
        if((v & 16) != 0) {
            fryk1 = ftwl0.e;
        }
        if((v & 0x20) != 0) {
            ibth0 = ftwl0.f;
        }
        ibuq.f(ftwm0, "calloutType");
        ibuq.f(fryv0, "message");
        ibuq.f(fryk0, "icon");
        ibuq.f(fryv1, "actionText");
        ibuq.f(fryk1, "actionIcon");
        return new ftwl(ftwm0, fryv0, fryk0, fryv1, fryk1, ibth0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftwl)) {
            return false;
        }
        if(this.a != ((ftwl)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftwl)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ftwl)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((ftwl)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((ftwl)object0).e) ? ibuq.m(this.f, ((ftwl)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + ((fryh)this.c).a) * 0x1F + this.d.hashCode()) * 0x1F + ((fryh)this.e).a;
        return this.f == null ? v * 0x1F : v * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "CalloutState(calloutType=" + this.a + ", message=" + this.b + ", icon=" + this.c + ", actionText=" + this.d + ", actionIcon=" + this.e + ", onActionClicked=" + this.f + ")";
    }
}

