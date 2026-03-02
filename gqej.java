final class gqej extends gqad {
    @Override  // gqad
    public final Object a(gqff gqff0) {
        int v = gqff0.u();
        if(v == 9) {
            gqff0.p();
            return null;
        }
        return v == 6 ? Boolean.valueOf(Boolean.parseBoolean(gqff0.j())) : Boolean.valueOf(gqff0.t());
    }

    @Override  // gqad
    public final void b(gqfh gqfh0, Object object0) {
        if(((Boolean)object0) == null) {
            gqfh0.j();
            return;
        }
        gqfh0.d();
        gqfh0.a();
        gqfh0.a.write((((Boolean)object0).booleanValue() ? "true" : "false"));
    }
}

