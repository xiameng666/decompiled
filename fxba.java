public final class fxba implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxba(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("scanner", String.class), new frpd("scan_type", String.class)};
        Object object0 = this.a.a.b("/client_streamz/gmscore_location/scan/latency", arr_frpd);
        ((frpb)object0).d();
        return object0;
    }
}

