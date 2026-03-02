public final class fxbc implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxbc(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("namespace", String.class), new frpd("op_name", String.class)};
        Object object0 = this.a.a.b("/client_streamz/gmscore_location/cache/ops_time", arr_frpd);
        ((frpb)object0).d();
        return object0;
    }
}

