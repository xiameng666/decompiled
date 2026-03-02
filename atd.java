public final class atd implements jqv {
    public final atk a;

    public atd(atk atk0) {
        this.a = atk0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        synchronized(this.a.a) {
            kay.d(this.a.f == null, "Release completer expected to be null");
            this.a.f = jqt0;
        }
        return a.i(this.a, "Release[session=", "]");
    }
}

