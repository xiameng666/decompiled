import j..time.Duration;

public final class aksb {
    public final aksa a;
    public final Boolean b;
    public final Duration c;
    public final aksn d;
    public final int e;

    public aksb(aksa aksa0, int v, Boolean boolean0, Duration duration0, aksn aksn0) {
        this.a = aksa0;
        this.e = v;
        this.b = boolean0;
        this.c = duration0;
        this.d = aksn0;
    }

    public static final aksb a(aksa aksa0, aksn aksn0) {
        return new aksb(aksa0, 0, null, null, aksn0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aksb)) {
            return false;
        }
        if(!ibuq.m(this.a, ((aksb)object0).a)) {
            return false;
        }
        if(this.e != ((aksb)object0).e) {
            return false;
        }
        if(!ibuq.m(this.b, ((aksb)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((aksb)object0).c) ? ibuq.m(this.d, ((aksb)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = this.e;
        int v2 = 0;
        if(v1 == 0) {
            v1 = 0;
        }
        int v3 = this.b == null ? 0 : this.b.hashCode();
        int v4 = this.c == null ? 0 : this.c.hashCode();
        aksn aksn0 = this.d;
        if(aksn0 != null) {
            v2 = aksn0.hashCode();
        }
        return (((v + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2;
    }

    @Override
    public final String toString() {
        return "DynamoLogEvent(eventType=" + this.a + ", eventResult=" + (this.e == 0 ? "null" : Integer.toString(this.e - 1)) + ", fallbackStrategyToPlatform=" + this.b + ", duration=" + this.c + ", suwChecks=" + this.d + ")";
    }
}

