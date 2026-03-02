public final class dukt {
    public final fryv a;
    public final fryk b;
    public final ftxi c;
    public final duld d;
    public final fryv e;
    public final ftuw f;
    public final duku g;
    public final ibth h;
    public final int i;
    private final fryv j;

    public dukt(fryv fryv0, fryk fryk0, ftxi ftxi0, duld duld0, fryv fryv1, ftuw ftuw0, duku duku0, ibth ibth0, int v) {
        ibuq.f(duku0, "variant");
        ibuq.f(ibth0, "onDismissRequest");
        super();
        this.a = fryv0;
        this.b = fryk0;
        this.c = ftxi0;
        this.d = duld0;
        this.e = fryv1;
        this.j = null;
        this.f = ftuw0;
        this.g = duku0;
        this.h = ibth0;
        this.i = v;
    }

    public dukt(fryv fryv0, fryk fryk0, ftxi ftxi0, duld duld0, fryv fryv1, ftuw ftuw0, duku duku0, ibth ibth0, int v, byte[] arr_b) {
        duld duld1 = (v & 8) == 0 ? duld0 : new duld(new fryu(""), null, 14);
        duku duku1 = (v & 0x80) == 0 ? duku0 : duku.a;
        ibth ibth1 = (v & 0x100) == 0 ? ibth0 : new duks();
        this(fryv0, ((v & 2) == 0 ? fryk0 : null), ((v & 4) == 0 ? ftxi0 : null), duld1, ((v & 16) == 0 ? fryv1 : null), ((v & 0x40) == 0 ? ftuw0 : null), duku1, ibth1, 0);
    }

    public static dukt a(dukt dukt0, int v) {
        ibuq.f(dukt0.g, "variant");
        ibuq.f(dukt0.h, "onDismissRequest");
        return new dukt(dukt0.a, dukt0.b, dukt0.c, dukt0.d, dukt0.e, dukt0.f, dukt0.g, dukt0.h, v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dukt)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dukt)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dukt)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dukt)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dukt)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dukt)object0).e)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.f, ((dukt)object0).f)) {
            return false;
        }
        if(this.g != ((dukt)object0).g) {
            return false;
        }
        return ibuq.m(this.h, ((dukt)object0).h) ? this.i == ((dukt)object0).i : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.d.hashCode()) * 0x1F;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        ftuw ftuw0 = this.f;
        if(ftuw0 != null) {
            v = ftuw0.hashCode();
        }
        return ((((v1 + v2) * 961 + v) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode()) * 0x1F + this.i;
    }

    @Override
    public final String toString() {
        return "PresentationBottomSheetState(title=" + this.a + ", requesterIcon=" + this.b + ", fopRowState=" + this.c + ", dataElementsState=" + this.d + ", privacyPolicy=" + this.e + ", warningText=null, actionBarState=" + this.f + ", variant=" + this.g + ", onDismissRequest=" + this.h + ", visibility=" + this.i + ")";
    }
}

