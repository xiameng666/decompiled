public final class epvv implements gful_cronetEngineProvider {
    public final epwe a;

    public epvv(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("log_source_name", String.class), new frpd("status", String.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/clearcut_logging/logs_uploaded_during_periodic_task", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

