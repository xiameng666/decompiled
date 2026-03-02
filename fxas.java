public final class fxas implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxas(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("cache_name", String.class)};
        Object object0 = this.a.a.b("/client_streamz/gmscore_location/floorlabels/cache_fullness", arr_frpd);
        ((frpb)object0).d();
        return object0;
    }
}

