public final class azlo implements gful_cronetEngineProvider {
    public final azlr a;

    public azlo(azlr azlr0) {
        this.a = azlr0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("error_type", String.class), new frpd("customer_id", Integer.class), new frpd("project_id", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/gmscore_cobalt/logger/error_count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

