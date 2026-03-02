public final class foco implements gful_cronetEngineProvider {
    public final focq a;

    public foco(focq focq0) {
        this.a = focq0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("implementation", String.class), new frpd("result", String.class), new frpd("number_of_owners", Integer.class), new frpd("app_package", String.class), new frpd("load_cached", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/og_android/load_owners_count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

