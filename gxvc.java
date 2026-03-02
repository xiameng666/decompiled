public final class gxvc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public gxvc() {
        throw null;
    }

    public gxvc(boolean z, boolean z1, boolean z2, boolean z3) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gxvc) && this.a == ((gxvc)object0).a && this.b == ((gxvc)object0).b && this.c == ((gxvc)object0).c && this.d == ((gxvc)object0).d;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.a ? 0x4CF : 0x4D5;
        int v2 = this.b ? 0x4CF : 0x4D5;
        int v3 = this.c ? 0x4CF : 0x4D5;
        if(this.d) {
            v = 0x4CF;
        }
        return (((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "FlagWrapper{isBlackListDeviceType=" + this.a + ", isManagedProfile=" + this.b + ", isCloneProfile=" + this.c + ", isPrimaryProfile=" + this.d + "}";
    }
}

