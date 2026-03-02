public final class epmu implements ibth {
    public final epna a;
    public final epmv b;

    public epmu(epna epna0, epmv epmv0) {
        this.a = epna0;
        this.b = epmv0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.a.getContentResolver().unregisterContentObserver(this.b);
        this.a.a(false);
        return ibom.a;
    }
}

