public final class ezyq {
    public static final fagu a;
    public static final fagu b;
    public static final fagk c;
    public static final fagl d;
    public static final fagl e;
    public static final fagl f;
    public static final fago g;
    public static final fago h;
    public static final fago i;
    public static final fagf j;
    public static final fagf k;
    public static final fagf l;
    public static final fagq m;
    public static final fagl n;
    public static final fagf o;

    static {
        ezyq.a = new fagu("execution.current_execution_id", "");
        ezyq.b = new fagu("execution.current_action_name", "");
        ezyq.c = new fagk("execution.current_action_params");
        Integer integer0 = (int)0;
        ezyq.d = new fagl("execution.download_retry_count", integer0);
        ezyq.e = new fagl("execution.download_payload_metadata_retry_count", integer0);
        ezyq.f = new fagl("execution.digest_verification_fail_count", integer0);
        ezyq.g = new fago("execution.package_metadata_proto", ((MessageLite)fafv.a));
        ezyq.h = new fago("execution.ota_metadata_proto", ((MessageLite)hlnn.a));
        ezyq.i = new fago("execution.ab_payload_spec", ((MessageLite)fafn.a));
        Boolean boolean0 = Boolean.valueOf(false);
        ezyq.j = new fagf("execution.ab_update_started", boolean0);
        ezyq.k = new fagf("execution.non_ab_update_scheduled", boolean0);
        ezyq.l = new fagf("execution.package_files_created", Boolean.valueOf(true));
        ezyq.m = new fagq("execution.downloads_attempted_at");
        ezyq.n = new fagl("execution.switch_slot_status", integer0);
        ezyq.o = new fagf("execution.ab_payload_metadata_downloaded", boolean0);
    }
}

