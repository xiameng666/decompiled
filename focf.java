public final class focf implements gful_cronetEngineProvider {
    public final focq a;

    public focf(focq focq0) {
        this.a = focq0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("result", String.class), new frpd("app_package", String.class)};
        Object object0 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

