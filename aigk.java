public final class aigk implements gful_cronetEngineProvider {
    public final aigo a;

    public aigk(aigo aigo0) {
        this.a = aigo0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("error", String.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/auth_attenuation/caveat_hmac_failed", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

