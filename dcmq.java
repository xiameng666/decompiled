public final class dcmq implements dcng {
    public final ichm a;

    public dcmq(ichm ichm0) {
        this.a = ichm0;
    }

    @Override  // dcng
    public final void a() {
        Object object0 = this.a.b(ibom.a);
        if(!icha.c(object0) && !(object0 instanceof icgy)) {
            throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
        }
    }
}

