public final class azlp implements gful_cronetEngineProvider {
    public final azlr a;

    public azlp(azlr azlr0) {
        this.a = azlr0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("error_type", String.class), new frpd("customer_id", Integer.class), new frpd("project_id", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/gmscore_cobalt/periodic_job/error_count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

