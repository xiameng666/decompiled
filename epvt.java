public final class epvt implements gful_cronetEngineProvider {
    public final epwe a;

    public epvt(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("log_source_name", String.class), new frpd("status", String.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/clearcut_logging/direct_log_attempts", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

