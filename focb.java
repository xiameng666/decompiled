public final class focb implements gful_cronetEngineProvider {
    public final focq a;

    public focb(focq focq0) {
        this.a = focq0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("app_package", String.class)};
        Object object0 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

