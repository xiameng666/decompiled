public final class aoy implements jqv {
    public final aqi a;

    public aoy(aqi aqi0) {
        this.a = aqi0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        apf apf0 = new apf(this.a, jqt0);
        this.a.c.execute(apf0);
        return "Release[request=" + this.a.l.getAndIncrement() + "]";
    }
}

