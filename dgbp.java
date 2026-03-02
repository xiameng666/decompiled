public final class dgbp implements ibtx {
    public final dgcp a;

    public dgbp(dgcp dgcp0) {
        this.a = dgcp0;
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ibuq.f(((String)object0), "endpointId");
        ibuq.f(((icig)object1), "events");
        dgcp dgcp0 = this.a;
        dfsk dfsk0 = dgcp0.b;
        String s = dfsk0.i();
        if(ibzk.D(s)) {
            s = null;
        }
        dglu dglu0 = new dglu(((String)object0), ((icig)object1), dgcp0.g);
        int v = dfsk0.a();
        return new dgop(dgcp0.a, s, dglu0, dgcp0.l, ((dgfy)object2), v);
    }
}

