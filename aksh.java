import j..time.Duration;

public final class aksh {
    public final aksk a;
    public final icxq b;
    public final icxr c;
    public final Duration d;
    public final Duration e;

    public aksh(aksk aksk0, icxq icxq0, icxr icxr0, Duration duration0, Duration duration1) {
        ibuq.f(icxq0, "request");
        ibuq.f(icxr0, "response");
        super();
        this.a = aksk0;
        this.b = icxq0;
        this.c = icxr0;
        this.d = duration0;
        this.e = duration1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aksh)) {
            return false;
        }
        if(!ibuq.m(this.a, ((aksh)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((aksh)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((aksh)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((aksh)object0).d) ? ibuq.m(this.e, ((aksh)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v3;
        int v1;
        int v = this.a.hashCode() * 0x1F;
        icxq icxq0 = this.b;
        if(((ProtoLiteMessage)icxq0).isImmutable()) {
            v1 = ((ProtoLiteMessage)icxq0).s();
        }
        else {
            int v2 = icxq0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)icxq0).s();
                icxq0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        icxr icxr0 = this.c;
        if(((ProtoLiteMessage)icxr0).isImmutable()) {
            v3 = ((ProtoLiteMessage)icxr0).s();
        }
        else {
            int v4 = icxr0.memoizedHashCode;
            if(v4 == 0) {
                v4 = ((ProtoLiteMessage)icxr0).s();
                icxr0.memoizedHashCode = v4;
            }
            v3 = v4;
        }
        int v5 = 0;
        int v6 = this.d == null ? 0 : this.d.hashCode();
        Duration duration0 = this.e;
        if(duration0 != null) {
            v5 = duration0.hashCode();
        }
        return (((v + v1) * 0x1F + v3) * 0x1F + v6) * 0x1F + v5;
    }

    @Override
    public final String toString() {
        return "PrepareEnvironmentEvent(eventType=" + this.a + ", request=" + this.b + ", response=" + this.c + ", duration=" + this.d + ", installDuration=" + this.e + ")";
    }
}

