public final class bff implements kar {
    public final bfq a;

    public bff(bfq bfq0) {
        this.a = bfq0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        this.a.c(((bgt)object0));
        bge bge0 = this.a.g;
        kay.d(bge0.a == null, "Pending request should be null");
        bge0.a = (bgt)object0;
    }
}

