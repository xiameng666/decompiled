public final class fxar implements gful_cronetEngineProvider {
    public final fxbd a;

    public fxar(fxbd fxbd0) {
        this.a = fxbd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("blocked_location", Boolean.class), new frpd("in_vehicle", Boolean.class), new frpd("num_aps", Integer.class), new frpd("used_cell_evidence", Boolean.class), new frpd("used_gps_evidence", Boolean.class), new frpd("consecutive_blocked_locations", Integer.class), new frpd("has_pseudo_ground_truth", Boolean.class), new frpd("has_ap_consistent_with_pseudo_ground_truth", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/gmscore_location/fusedfrewle/outlier_run_count", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

