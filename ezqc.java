public final class ezqc implements gful_cronetEngineProvider {
    public final ezqg a;

    public ezqc(ezqg ezqg0) {
        this.a = ezqg0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("hit", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/udc/udc_ctx_manager_cache_accesses", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

