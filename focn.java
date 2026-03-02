public final class focn implements gful_cronetEngineProvider {
    public final focq a;

    public focn(focq focq0) {
        this.a = focq0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("result", String.class), new frpd("has_category_launcher", Boolean.class), new frpd("has_category_info", Boolean.class), new frpd("user_in_target_user_profiles", Boolean.class), new frpd("api_version", Integer.class), new frpd("app_package", String.class)};
        Object object0 = this.a.a.e("/client_streamz/og_android/switch_profile", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

