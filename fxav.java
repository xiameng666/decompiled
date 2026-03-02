public final class fxav implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxav(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("has_floor_models", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/gmscore_location/frewle/tile_download_count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

