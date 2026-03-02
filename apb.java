public final class apb implements jqv {
    public final aqi a;

    public apb(aqi aqi0) {
        this.a = aqi0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        kay.d(this.a.n == null, "Camera can only be released once, so release completer should be null on creation.");
        this.a.n = jqt0;
        return "Release[camera=" + this.a + "]";
    }
}

