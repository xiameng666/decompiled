public final class ezqe implements gful_cronetEngineProvider {
    public final ezqg a;

    public ezqe(ezqg ezqg0) {
        this.a = ezqg0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("dummy", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/udc/udc_legacy_api_traffic", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

