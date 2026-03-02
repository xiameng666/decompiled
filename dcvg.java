public final class dcvg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public dcvg() {
        this(-1, 0, 0, 0, 0);
    }

    public dcvg(int v, int v1, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dcvg)) {
            return false;
        }
        if(this.a != ((dcvg)object0).a) {
            return false;
        }
        if(this.b != ((dcvg)object0).b) {
            return false;
        }
        if(this.c != ((dcvg)object0).c) {
            return false;
        }
        return this.d == ((dcvg)object0).d ? this.e == ((dcvg)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return (((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e;
    }

    @Override
    public final String toString() {
        return "ConnectionInfo(connectionMode=" + this.a + ", connectionMedium=" + this.b + ", mediumFrequency=" + this.c + ", localStaFrequency=" + this.d + ", remoteStaFrequency=" + this.e + ")";
    }
}

