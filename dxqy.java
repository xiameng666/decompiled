public final class dxqy {
    public final ftix a;
    public final boolean b;
    public final boolean c;

    public dxqy() {
        this(null);
    }

    public dxqy(ftix ftix0, boolean z, boolean z1) {
        this.a = ftix0;
        this.b = z;
        this.c = z1;
    }

    public dxqy(byte[] arr_b) {
        this(null, false, false);
    }

    public static dxqy a(dxqy dxqy0, ftix ftix0, boolean z, boolean z1, int v) {
        if((v & 1) != 0) {
            ftix0 = dxqy0.a;
        }
        if((v & 2) != 0) {
            z = dxqy0.b;
        }
        if((v & 4) != 0) {
            z1 = dxqy0.c;
        }
        return new dxqy(ftix0, z, z1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dxqy)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dxqy)object0).a)) {
            return false;
        }
        return this.b == ((dxqy)object0).b ? this.c == ((dxqy)object0).c : false;
    }

    @Override
    public final int hashCode() {
        ftix ftix0 = this.a;
        if(ftix0 == null) {
            return dxqx.a(this.b) * 0x1F + dxqx.a(this.c);
        }
        if(((ProtoLiteMessage)ftix0).isImmutable()) {
            return (((ProtoLiteMessage)ftix0).s() * 0x1F + dxqx.a(this.b)) * 0x1F + dxqx.a(this.c);
        }
        int v = ftix0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)ftix0).s();
            ftix0.memoizedHashCode = v;
        }
        return (v * 0x1F + dxqx.a(this.b)) * 0x1F + dxqx.a(this.c);
    }

    @Override
    public final String toString() {
        return "SimplifiedTopupScreenState(lastTopupSettings=" + this.a + ", showLoadingScreen=" + this.b + ", showLoadingSpinner=" + this.c + ")";
    }
}

