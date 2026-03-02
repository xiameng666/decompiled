public final class fxay implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxay(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("lookup_type", String.class), new frpd("informative_hit", Boolean.class), new frpd("uninformative_hit", Boolean.class), new frpd("queued_for_download", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/gmscore_location/frewle/hit_count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

