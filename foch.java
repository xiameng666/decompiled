public final class foch implements gful_cronetEngineProvider {
    public final focq a;

    public foch(focq focq0) {
        this.a = focq0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("app_package", String.class), new frpd("ve_enabled", Boolean.class), new frpd("ve_provided", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

