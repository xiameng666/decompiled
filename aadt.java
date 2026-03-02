public final class aadt implements aaej {
    public final aadv a;
    public final grwv b;

    public aadt(aadv aadv0, grwv grwv0) {
        this.a = aadv0;
        this.b = grwv0;
    }

    @Override  // aaej
    public final void a(Throwable throwable0) {
        this.a.d.d("Error starting native action %d", new Object[]{((int)this.b.c), throwable0});
        this.a.e.a(throwable0);
    }
}

