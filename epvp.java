public final class epvp implements gful_cronetEngineProvider {
    public final epwe a;

    public epvp(epwe epwe0) {
        this.a = epwe0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("status_code", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/smartdevice/accounts/user_credential_status", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

