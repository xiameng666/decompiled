public final class ezqb implements gful_cronetEngineProvider {
    public final ezqg a;

    public ezqb(ezqg ezqg0) {
        this.a = ezqg0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("hit", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/udc/udc_custom_cache_accesses", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

