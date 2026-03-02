public final class epvu implements gful_cronetEngineProvider {
    public final epwe a;

    public epvu(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("log_source_name", String.class), new frpd("consent_check_error", String.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/clearcut_logging/consent_check_error", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

