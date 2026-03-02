public final class ezqf implements gful_cronetEngineProvider {
    public final ezqg a;

    public ezqf(ezqg ezqg0) {
        this.a = ezqg0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("operation", String.class), new frpd("status", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/udc/facs_api_traffic", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

