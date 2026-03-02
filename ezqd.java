public final class ezqd implements gful_cronetEngineProvider {
    public final ezqg a;

    public ezqd(ezqg ezqg0) {
        this.a = ezqg0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("setting", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/udc/udc_legacy_get_settings_api_calls", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

