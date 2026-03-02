public final class ephi implements epga {
    final ichm a;

    public ephi(ichm ichm0) {
        this.a = ichm0;
        super();
    }

    @Override  // epga
    public final void a(epfz epfz0) {
        ibuq.f(epfz0, "event");
        Object object0 = ichd.a(this.a, epfz0);
        if(!(object0 instanceof icgy) && !icha.c(object0)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}

