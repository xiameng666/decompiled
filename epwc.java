public final class epwc implements gful_cronetEngineProvider {
    public final epwe a;

    public epwc(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("third_party_account", String.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/accounts/third_party", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

