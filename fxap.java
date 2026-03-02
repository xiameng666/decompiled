public final class fxap implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxap(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("namespace", String.class)};
        Object object0 = this.a.a.b("/client_streamz/gmscore_location/cache/hit_ratio", arr_frpd);
        ((frpb)object0).d();
        return object0;
    }
}

