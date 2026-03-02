public final class fxbb implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxbb(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("namespace", String.class), new frpd("op_name", String.class)};
        Object object0 = this.a.a.e("/client_streamz/gmscore_location/cache/ops", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

