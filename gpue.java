final class gpue {
    public final boolean a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final int f;

    public gpue() {
        throw null;
    }

    public gpue(int v, boolean z, double f, double f1, double f2, double f3) {
        this.f = v;
        this.a = z;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof gpue)) {
            int v = this.f;
            int v1 = ((gpue)object0).f;
            if(v != 0) {
                return v == v1 && this.a == ((gpue)object0).a && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(((gpue)object0).b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(((gpue)object0).c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(((gpue)object0).d) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(((gpue)object0).e);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.f;
        if(v != 0) {
            return this.a ? ((int)(Double.doubleToLongBits(this.e) ^ Double.doubleToLongBits(this.e) >>> 0x20)) ^ (((((v ^ 1000003) * 1000003 ^ 0x4CF) * 1000003 ^ ((int)(Double.doubleToLongBits(this.b) ^ Double.doubleToLongBits(this.b) >>> 0x20))) * 1000003 ^ ((int)(Double.doubleToLongBits(this.c) ^ Double.doubleToLongBits(this.c) >>> 0x20))) * 1000003 ^ ((int)(Double.doubleToLongBits(this.d) ^ Double.doubleToLongBits(this.d) >>> 0x20))) * 1000003 : ((int)(Double.doubleToLongBits(this.e) ^ Double.doubleToLongBits(this.e) >>> 0x20)) ^ (((((v ^ 1000003) * 1000003 ^ 0x4D5) * 1000003 ^ ((int)(Double.doubleToLongBits(this.b) ^ Double.doubleToLongBits(this.b) >>> 0x20))) * 1000003 ^ ((int)(Double.doubleToLongBits(this.c) ^ Double.doubleToLongBits(this.c) >>> 0x20))) * 1000003 ^ ((int)(Double.doubleToLongBits(this.d) ^ Double.doubleToLongBits(this.d) >>> 0x20))) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        switch(this.f) {
            case 1: {
                return "PrimaryFailoverSelection{reason=PRIMARY_POSITION_NULL, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            case 2: {
                return "PrimaryFailoverSelection{reason=FAILOVER_POSITION_NULL, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            case 3: {
                return "PrimaryFailoverSelection{reason=TRUST_CELL, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            case 4: {
                return "PrimaryFailoverSelection{reason=LARGE_DISTANCE, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            case 5: {
                return "PrimaryFailoverSelection{reason=DELTA_TIME_BETWEEN_PRIMARY_FAILOVER_IS_SMALL, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            case 6: {
                return "PrimaryFailoverSelection{reason=MAX_POSSIBLE_DISTANCE_LESS_THAN_OR_EQUAL_ACTUAL_DISTANCE, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            case 7: {
                return "PrimaryFailoverSelection{reason=MAX_POSSIBLE_DISTANCE_GREATER_THAN_ACTUAL_DISTANCE, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            case 8: {
                return "PrimaryFailoverSelection{reason=ADJUSTED_PRIMARY_ACCURACY_BETTER_THAN_FAILOVER, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            case 9: {
                return "PrimaryFailoverSelection{reason=PRIMARY_OLDER_AND_LOW_ACCURACY, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
            default: {
                return "PrimaryFailoverSelection{reason=null, usePrimary=" + this.a + ", primaryToFailoverDistanceM=" + this.b + ", maxDistanceM=" + this.c + ", maxPossibleDistanceM=" + this.d + ", minPrimaryToFailoverDistanceM=" + this.e + "}";
            }
        }
    }
}

