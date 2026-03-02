import j..util.Objects;

public final class kuy {
    public final int a;

    static {
        ibns[] arr_ibns = new ibns[2];
        Integer integer0 = (int)2;
        arr_ibns[0] = new ibns(integer0, integer0);
        Integer integer1 = (int)1;
        arr_ibns[1] = new ibns(integer1, integer1);
        ibpz.h(arr_ibns);
    }

    public kuy(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof kuy) && this.a == ((kuy)object0).a;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a)});
    }
}

