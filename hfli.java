public final class hfli implements gfsi {
    public final String a;

    public hfli(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((hflp)object0).b <= 5443200000L) {
            return ((hflp)object0).a;
        }
        throw new gfuz("User consents fetched are stale for identifier: " + this.a);
    }
}

