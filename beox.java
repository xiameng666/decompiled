public final class beox implements gfsi {
    public final bedv a;

    public beox(bedv bedv0) {
        this.a = bedv0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return ((gged_interceptors)this.a.b).contains(((bevq)object0)) ? ((bevq)object0) : new bevr(((bevq)object0).a, ((bevq)object0).b);
    }
}

