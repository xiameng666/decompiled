public final class epvq implements gful_cronetEngineProvider {
    public final epwe a;

    public epvq(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("error_code", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/accounts/account_status_error", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

