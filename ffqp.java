public final class ffqp implements gful_cronetEngineProvider {
    public final ffqs a;

    public ffqp(ffqs ffqs0) {
        this.a = ffqs0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("role", String.class), new frpd("success", String.class), new frpd("num_authenticators", Integer.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/account_transfer/status", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

