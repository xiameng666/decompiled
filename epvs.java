public final class epvs implements gful_cronetEngineProvider {
    public final epwe a;

    public epvs(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("sdk", Integer.class)};
        Object object0 = this.a.a.b("/client_streamz/android_auth/smartdevice/fastpair/device_name_latency", arr_frpd);
        ((frpb)object0).d();
        return object0;
    }
}

