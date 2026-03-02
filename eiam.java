public final class eiam {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;
    private final int g;
    private final int h;

    public eiam(Integer integer0, Integer integer1, Integer integer2, Integer integer3, Integer integer4, String s) {
        this.g = 0x7F140152;  // raw:inner_star
        this.h = 0x7F14022C;  // raw:outer_star
        this.a = integer0;
        this.b = integer1;
        this.c = integer2;
        this.d = integer3;
        this.e = integer4;
        this.f = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eiam)) {
            return false;
        }
        if(!ibuq.m(this.a, ((eiam)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((eiam)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((eiam)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((eiam)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((eiam)object0).e) ? ibuq.m(this.f, ((eiam)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() + 1837447206) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        int v1 = 0;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        String s = this.f;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "ProximityUiConfig(innerStarRes=2132017490, outerStarRes=2132017708, outerCompassRes=" + this.a + ", innerCompassRes=" + this.b + ", innerCompassCelebrationRes=" + this.c + ", dialPrecisionRes=" + this.d + ", deviceImageResourceId=" + this.e + ", glideUrl=" + this.f + ")";
    }
}

