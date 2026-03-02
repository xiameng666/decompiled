import android.content.Context;

public final class cpwt {
    public static void a(Context context0) {
        context0.getSharedPreferences("gms_icing_mdd_phenotype_config", 0).edit().clear().commit();
        context0.getSharedPreferences("gms_icing_mdd_phenotype_registrar", 0).edit().remove("registered_with_location").remove("cached_location_lat").remove("cached_location_lon").remove("cached_location_provider").apply();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwwf.a).v_newBuilder();
        einq einq0 = new einq(context0);
        if(huck.a.b().y()) {
            hftr hftr0 = (hftr)((ProtoLiteMessage)gobv.a).v_newBuilder();
            bwwf bwwf0 = (bwwf)hftp0.N_build();
            hftr0.n(bwwf.b, bwwf0);
            gobv gobv0 = (gobv)((ProtoLiteBuilder)hftr0).N_build();
            einq0.cC(fjpo.a(context0), gobv0, ((bwwf)hftp0.N_build()).toBytesArray());
            return;
        }
        einq0.g(fjpo.a(context0), ((bwwf)hftp0.N_build()).toBytesArray());
    }
}

