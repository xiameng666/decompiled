public final class epsg implements gftc {
    public final String a;

    public epsg(String s) {
        this.a = s;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return this.a.equalsIgnoreCase(((String)object0));
    }
}

