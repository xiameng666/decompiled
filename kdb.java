import j..util.Objects;

public final class kdb {
    public final int a;
    public final int b;

    public kdb(int v, int v1) {
        gftb.b(kcz.e.contains(Integer.valueOf(v)), "Invalid channel number.");
        Integer integer0 = v1;
        gftb.b(kcz.f.contains(integer0) || kcz.g.contains(integer0), "Invalid preamble index.");
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kdb) ? this.a == ((kdb)object0).a && this.b == ((kdb)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "UwbComplexChannel{mChannel=" + this.a + ", mPreambleIndex=" + this.b + "}";
    }
}

