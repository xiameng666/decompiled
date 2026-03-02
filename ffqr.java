public final class ffqr implements gful_cronetEngineProvider {
    public final ffqs a;

    public ffqr(ffqs ffqs0) {
        this.a = ffqs0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("role", String.class), new frpd("error", String.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/account_transfer/com_google/errors", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

