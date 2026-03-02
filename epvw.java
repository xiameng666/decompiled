public final class epvw implements gful_cronetEngineProvider {
    public final epwe a;

    public epvw(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("log_source_name", String.class), new frpd("is_uploaded_to_clearcut", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/clearcut_logging/logs_uploaded_from_buffer", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

