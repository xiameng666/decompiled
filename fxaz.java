public final class fxaz implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxaz(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("status", String.class), new frpd("backend", String.class), new frpd("rpc_type", String.class)};
        Object object0 = this.a.a.e("/client_streamz/gmscore_location/rpc/count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

