public final class dweg {
    public final fryy a;
    public final fryy b;
    public final frzf c;
    public final frzc d;
    public final frzf e;
    public final frzf f;

    public dweg() {
        this(null);
    }

    public dweg(fryy fryy0, fryy fryy1, frzf frzf0, frzc frzc0, frzf frzf1, frzf frzf2) {
        ibuq.f(fryy0, "acceptButtonState");
        ibuq.f(fryy1, "cancelButtonState");
        ibuq.f(frzf0, "noticeTextContainerState");
        ibuq.f(frzc0, "noticeTextState");
        ibuq.f(frzf1, "loadingContainerState");
        ibuq.f(frzf2, "progressBarState");
        super();
        this.a = fryy0;
        this.b = fryy1;
        this.c = frzf0;
        this.d = frzc0;
        this.e = frzf1;
        this.f = frzf2;
    }

    public dweg(byte[] arr_b) {
        this(new fryy(8, 14), new fryy(8, 14), new frzf(8), new frzc(0, null, 3), new frzf(null), new frzf(8));
    }

    public static dweg a(dweg dweg0, fryy fryy0, fryy fryy1, frzf frzf0, frzc frzc0, frzf frzf1, frzf frzf2, int v) {
        if((v & 1) != 0) {
            fryy0 = dweg0.a;
        }
        if((v & 2) != 0) {
            fryy1 = dweg0.b;
        }
        if((v & 4) != 0) {
            frzf0 = dweg0.c;
        }
        if((v & 8) != 0) {
            frzc0 = dweg0.d;
        }
        if((v & 16) != 0) {
            frzf1 = dweg0.e;
        }
        if((v & 0x20) != 0) {
            frzf2 = dweg0.f;
        }
        ibuq.f(fryy0, "acceptButtonState");
        ibuq.f(fryy1, "cancelButtonState");
        ibuq.f(frzf0, "noticeTextContainerState");
        ibuq.f(frzc0, "noticeTextState");
        ibuq.f(frzf1, "loadingContainerState");
        ibuq.f(frzf2, "progressBarState");
        return new dweg(fryy0, fryy1, frzf0, frzc0, frzf1, frzf2);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dweg)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dweg)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dweg)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dweg)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dweg)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((dweg)object0).e) ? ibuq.m(this.f, ((dweg)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.a) * 0x1F + this.d.hashCode()) * 0x1F + this.e.a) * 0x1F + this.f.a;
    }

    @Override
    public final String toString() {
        return "NoticeAcknowledgementScreenState(acceptButtonState=" + this.a + ", cancelButtonState=" + this.b + ", noticeTextContainerState=" + this.c + ", noticeTextState=" + this.d + ", loadingContainerState=" + this.e + ", progressBarState=" + this.f + ")";
    }
}

