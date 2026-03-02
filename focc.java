public final class focc implements gful_cronetEngineProvider {
    public final focq a;

    public focc(focq focq0) {
        this.a = focq0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("implementation", String.class), new frpd("avatar_size", String.class), new frpd("result", String.class), new frpd("app_package", String.class), new frpd("load_cached", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

