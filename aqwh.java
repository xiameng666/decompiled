public enum aqwh {
    BACKUP,
    RESTORE,
    LIST_DEVICES,
    CLEAR_DEVICE,
    GET_APP_BACKUP_STATS,
    SECONDARY_KEY_ROTATION_REQUEST,
    GET_APP_KEY_DENYLIST_INFO,
    UPDATE_BACKUP_TIMESTAMP,
    GET_D2D_DENY_LISTED_APPS,
    UNKNOWN;

    public static aqwh a(aqff aqff0) {
        if(aqff0.h()) {
            return aqwh.c;
        }
        if(aqff0.d()) {
            return aqwh.d;
        }
        if(aqff0.j()) {
            return aqwh.h;
        }
        if(aqff0.g()) {
            return aqwh.i;
        }
        for(Object object0: aqff0.hx()) {
            if((((aqet)object0).b & 4) == 0) {
                if(((aqet)object0).e.size() <= 0 && ((aqet)object0).g.size() <= 0 && ((aqet)object0).f.size() <= 0) {
                    continue;
                }
                return aqwh.a;
            }
            return aqwh.b;
        }
        if(hqml.a.b().c()) {
            if(aqff0.e()) {
                return aqwh.e;
            }
            if(aqff0.i()) {
                return aqwh.f;
            }
        }
        return !hqkv.c() || !aqff0.f() ? aqwh.j : aqwh.g;
    }
}

