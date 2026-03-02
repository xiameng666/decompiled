public final class egzo {
    public static final egzo a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    static {
        egzn egzn0 = new egzn();
        int v = 1;
        egzn0.b(true);
        egzn0.c(true);
        egzn0.a = 1;
        egzn0.b = 2;
        egzn0.c = 2;
        egzo.a = egzn0.a();
        egzn egzn1 = new egzn();
        egzn1.b(((boolean)(hxds.a.b().a() ^ 1)));
        egzn1.c(((boolean)(hxds.c() ^ 1)));
        egzn1.a = hxds.c() ? 2 : 1;
        egzn1.b = hxds.a.b().d() ? 2 : 1;
        if(!hxds.e()) {
            v = 2;
        }
        egzn1.c = v;
        egzn1.a();
    }

    public egzo() {
        throw null;
    }

    public egzo(boolean z, boolean z1, int v, int v1, int v2) {
        this.b = z;
        this.c = z1;
        this.d = v;
        this.e = v1;
        this.f = v2;
    }

    public static egzo a() {
        hxds.d();
        return egzo.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof egzo) && this.b == ((egzo)object0).b && this.c == ((egzo)object0).c) {
            int v = this.d;
            int v1 = ((egzo)object0).d;
            if(v == 0) {
                throw null;
            }
            if(v == v1) {
                int v2 = this.e;
                int v3 = ((egzo)object0).e;
                if(v2 == 0) {
                    throw null;
                }
                if(v2 == v3) {
                    int v4 = this.f;
                    int v5 = ((egzo)object0).f;
                    if(v4 != 0) {
                        return v4 == v5;
                    }
                    throw null;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.d;
        if(v1 == 0) {
            throw null;
        }
        int v2 = this.b ? 0x4CF : 0x4D5;
        if(this.c) {
            v = 0x4CF;
        }
        int v3 = this.e;
        if(v3 == 0) {
            throw null;
        }
        int v4 = this.f;
        if(v4 != 0) {
            return v4 ^ ((v1 ^ ((v2 ^ 1000003) * 1000003 ^ v) * 1000003) * 1000003 ^ v3) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        String s1;
        String s;
        switch(this.d) {
            case 1: {
                s = "ALL_GROUPS";
                break;
            }
            case 2: {
                s = "ONLY_STAR_AND_MY_CONTACTS_GROUPS";
                break;
            }
            default: {
                s = "null";
            }
        }
        switch(this.e) {
            case 1: {
                s1 = "BASIC_CONTACT_FIELDS";
                break;
            }
            case 2: {
                s1 = "STANDARD_CONTACT_FIELDS";
                break;
            }
            default: {
                s1 = "null";
            }
        }
        switch(this.f) {
            case 1: {
                return "SyncServicePlan{shouldEnablePeriodicSync=" + this.b + ", shouldEnableSyncUp=" + this.c + ", groupSyncDownOption=" + s + ", contactFieldSyncOption=" + s1 + ", photoSyncOption=" + "ALWAYS_LOW_RES_PHOTOS" + "}";
            }
            case 2: {
                return "SyncServicePlan{shouldEnablePeriodicSync=" + this.b + ", shouldEnableSyncUp=" + this.c + ", groupSyncDownOption=" + s + ", contactFieldSyncOption=" + s1 + ", photoSyncOption=" + "HIGH_RES_PHOTO_OK" + "}";
            }
            default: {
                return "SyncServicePlan{shouldEnablePeriodicSync=" + this.b + ", shouldEnableSyncUp=" + this.c + ", groupSyncDownOption=" + s + ", contactFieldSyncOption=" + s1 + ", photoSyncOption=" + "null" + "}";
            }
        }
    }
}

