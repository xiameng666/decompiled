public final class fxao implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxao(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("backend", String.class), new frpd("rpc_type", String.class)};
        Object object0 = this.a.a.b("/client_streamz/gmscore_location/rpc/latency", arr_frpd);
        ((frpb)object0).d();
        return object0;
    }
}

