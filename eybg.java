public final class eybg {
    public final int a;
    public final String b;
    public final exjx c;

    public eybg(int v, String s, exjx exjx0) {
        ibuq.f(exjx0, "rangingMethod");
        super();
        this.a = v;
        this.b = s;
        this.c = exjx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eybg)) {
            return false;
        }
        if(this.a != ((eybg)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((eybg)object0).b) ? this.c == ((eybg)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.a * 0x1F * 0x1F + this.c.hashCode() : (this.a * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ProximityIntentData(notificationId=" + this.a + ", bluetoothAddress=" + this.b + ", rangingMethod=" + this.c + ")";
    }
}

