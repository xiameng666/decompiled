public final class focm implements gful_cronetEngineProvider {
    public final focq a;

    public focm(focq focq0) {
        this.a = focq0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("host_activity_or_fragment_name", String.class), new frpd("on_attach_called_count", Integer.class), new frpd("on_create_called_count", Integer.class), new frpd("on_view_created_called_count", Integer.class), new frpd("on_config_changed_called_count", Integer.class), new frpd("on_detach_called_count", Integer.class), new frpd("bento_intent_launcher_binder_bind_called_count", Integer.class), new frpd("bento_color_resolver_bind_call_count", Integer.class), new frpd("error_type", String.class)};
        Object object0 = this.a.a.e("/client_streamz/og_android/bento_unbound_flow_crash", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

