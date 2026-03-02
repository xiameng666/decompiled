public final class aigl implements gful_cronetEngineProvider {
    public final aigo a;

    public aigl(aigo aigo0) {
        this.a = aigo0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("bad_it", Boolean.class), new frpd("bad_itmetadata", Boolean.class), new frpd("bad_expiry", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/android_auth/auth_attenuation/malformed_server_response", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

