public final class bvmw implements gful_cronetEngineProvider {
    public final bvmx a;

    public bvmw(bvmx bvmx0) {
        this.a = bvmx0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("kind", String.class), new frpd("url", String.class), new frpd("result", String.class)};
        Object object0 = this.a.a.b("/client_streamz/gmscore_growth/remote_asset_load/latency", arr_frpd);
        ((frpb)object0).d();
        return object0;
    }
}

