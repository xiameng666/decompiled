public final class dnfl {
    public final dnfj a;
    public final dnlr b;

    public dnfl() {
        this(null);
    }

    public dnfl(dnfj dnfj0, dnlr dnlr0) {
        this.a = dnfj0;
        this.b = dnlr0;
    }

    public dnfl(byte[] arr_b) {
        this(null, null);
    }

    public static dnfl a(dnfl dnfl0, dnfj dnfj0, dnlr dnlr0, int v) {
        if((v & 1) != 0) {
            dnfj0 = dnfl0.a;
        }
        if((v & 2) != 0) {
            dnlr0 = dnfl0.b;
        }
        return new dnfl(dnfj0, dnlr0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dnfl)) {
            return false;
        }
        return ibuq.m(this.a, ((dnfl)object0).a) ? ibuq.m(this.b, ((dnfl)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        dnlr dnlr0 = this.b;
        if(dnlr0 != null) {
            v = dnlr0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "FopCardScreenState(recentActivity=" + this.a + ", cardRewardsPreview=" + this.b + ")";
    }
}

