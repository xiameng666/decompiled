import j..time.Duration;

public final class akse {
    public final aksg a;
    public final Duration b;
    public final boolean c;
    public final int d;

    public akse(aksg aksg0, int v, Duration duration0, boolean z) {
        this.a = aksg0;
        this.d = v;
        this.b = duration0;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof akse)) {
            return false;
        }
        if(!ibuq.m(this.a, ((akse)object0).a)) {
            return false;
        }
        if(this.d != ((akse)object0).d) {
            return false;
        }
        return ibuq.m(this.b, ((akse)object0).b) ? this.c == ((akse)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.d) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F;
        return this.c ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        return "PhoneskyDpcInstallEvent(eventType=" + this.a + ", eventResult=" + Integer.toString(this.d - 1) + ", duration=" + this.b + ", updated=" + this.c + ")";
    }
}

