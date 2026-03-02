public final class eypl {
    public final boolean a;
    public final boolean b;

    public eypl(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eypl)) {
            return false;
        }
        return this.a == ((eypl)object0).a ? this.b == ((eypl)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return eypk.a(this.a) * 0x1F + eypk.a(this.b);
    }

    @Override
    public final String toString() {
        return "DistanceBasedRelockSettingUiState(isSupported=" + this.a + ", isActive=" + this.b + ")";
    }
}

