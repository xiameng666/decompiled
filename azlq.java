public final class azlq implements gful_cronetEngineProvider {
    public final azlr a;

    public azlq(azlr azlr0) {
        this.a = azlr0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("error_type", String.class)};
        Object object0 = this.a.a.e("/client_streamz/gmscore_cobalt/consent_change_intent_operation/unhandled_intent_count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

