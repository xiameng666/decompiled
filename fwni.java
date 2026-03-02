public final class fwni implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        fwbj_FusedOrientationManager fwbj0 = (fwbj_FusedOrientationManager)object0;
        fwbg_OrientationCallback fwbg0 = new fwbg_OrientationCallback(fwbj0);
        fwbj0.g_engineBase.f_registerCallback(fwbg0);
        fwbj0.h_config.e = fwbj0.g_engineBase.a_getEngineType();
        gkqc gkqc0 = (gkqc)((ProtoLiteMessage)gkqo.a).v_newBuilder();
        gkqc0.a(fwbj0.h_config.a());
        gkqo gkqo0 = (gkqo)((ProtoLiteBuilder)gkqc0).N_build();
        fwbj0.h_config.b(gkqo0);
    }
}

