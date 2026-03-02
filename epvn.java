public final class epvn implements gful_cronetEngineProvider {
    public final epwe a;

    public epvn(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("connection_type", String.class), new frpd("sdk", Integer.class), new frpd("status", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/nearby/connect", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

