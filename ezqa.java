public final class ezqa implements gful_cronetEngineProvider {
    public final ezqg a;

    public ezqa(ezqg ezqg0) {
        this.a = ezqg0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("succeeded", Boolean.class), new frpd("push", Boolean.class), new frpd("periodic", Boolean.class), new frpd("forced", Boolean.class), new frpd("empty_cache", Boolean.class), new frpd("other_trigger", Boolean.class), new frpd("has_changes", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/udc/sync_attempts", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

