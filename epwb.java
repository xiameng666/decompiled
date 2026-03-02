public final class epwb implements gful_cronetEngineProvider {
    public final epwe a;

    public epwb(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("error_code", Integer.class), new frpd("sdk", Integer.class), new frpd("module_version", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/clap/error", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

