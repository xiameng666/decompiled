public final class eyja {
    public final eyjx a;
    public final exwv b;
    public final iccs c;
    public final exjx d;
    public final exod e;
    public final eyjz f;
    public final Boolean g;
    public final icbr h;

    public eyja(eyjx eyjx0, exwv exwv0, exjx exjx0, eyjz eyjz0, int v) {
        this(eyjx0, ((v & 2) == 0 ? exwv0 : null), null, null, ((v & 16) == 0 ? exjx0 : null), null, ((v & 0x40) == 0 ? eyjz0 : null), null);
    }

    public eyja(eyjx eyjx0, exwv exwv0, icbr icbr0, iccs iccs0, exjx exjx0, exod exod0, eyjz eyjz0, Boolean boolean0) {
        ibuq.f(eyjx0, "unlockResultCode");
        super();
        this.a = eyjx0;
        this.b = exwv0;
        this.h = icbr0;
        this.c = iccs0;
        this.d = exjx0;
        this.e = exod0;
        this.f = eyjz0;
        this.g = boolean0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eyja)) {
            return false;
        }
        if(this.a != ((eyja)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((eyja)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.h, ((eyja)object0).h)) {
            return false;
        }
        if(!ibuq.m(this.c, ((eyja)object0).c)) {
            return false;
        }
        if(this.d != ((eyja)object0).d) {
            return false;
        }
        if(!ibuq.m(this.e, ((eyja)object0).e)) {
            return false;
        }
        return ibuq.m(this.f, ((eyja)object0).f) ? ibuq.m(this.g, ((eyja)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v6;
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.h == null ? 0 : this.h.hashCode();
        int v4 = this.c == null ? 0 : this.c.hashCode();
        int v5 = this.d == null ? 0 : this.d.hashCode();
        exod exod0 = this.e;
        if(exod0 == null) {
            v6 = 0;
        }
        else if(((ProtoLiteMessage)exod0).isImmutable()) {
            v6 = ((ProtoLiteMessage)exod0).s();
        }
        else {
            int v7 = exod0.memoizedHashCode;
            if(v7 == 0) {
                v7 = ((ProtoLiteMessage)exod0).s();
                exod0.memoizedHashCode = v7;
            }
            v6 = v7;
        }
        int v8 = this.f == null ? 0 : this.f.hashCode();
        Boolean boolean0 = this.g;
        if(boolean0 != null) {
            v1 = boolean0.hashCode();
        }
        return ((((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v8) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "UnlockResult(unlockResultCode=" + this.a + ", device=" + this.b + ", unlockUsed=" + this.h + ", relockRequested=" + this.c + ", rangingMethod=" + this.d + ", rangingCapabilityInfo=" + this.e + ", inPocketResult=" + this.f + ", isDistanceBasedRelock=" + this.g + ")";
    }
}

