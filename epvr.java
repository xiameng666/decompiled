public final class epvr implements gful_cronetEngineProvider {
    public final epwe a;

    public epvr(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("num_retries", Integer.class), new frpd("original_status", Integer.class), new frpd("final_status", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/nearby/connection_retries", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

