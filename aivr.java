public final class aivr {
    public final long a;
    public final String b;
    public final int c;
    public final int d;

    public aivr() {
        throw null;
    }

    public aivr(int v, long v1, int v2, String s) {
        this.c = v;
        this.a = v1;
        this.d = v2;
        this.b = s;
    }

    public static aivq a() {
        aivq aivq0 = new aivq();
        aivq0.b(0L);
        aivq0.c = 1;
        aivq0.a = null;
        aivq0.b = 1;
        return aivq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aivr)) {
            int v = this.c;
            int v1 = ((aivr)object0).c;
            if(v == 0) {
                throw null;
            }
            if(v == v1 && this.a == ((aivr)object0).a) {
                int v2 = this.d;
                int v3 = ((aivr)object0).d;
                if(v2 == 0) {
                    throw null;
                }
                if(v2 == v3) {
                    return this.b == null ? ((aivr)object0).b == null : this.b.equals(((aivr)object0).b);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.c;
        if(v == 0) {
            throw null;
        }
        long v1 = this.a;
        int v2 = this.d;
        if(v2 != 0) {
            return this.b == null ? (((v ^ 1000003) * 1000003 ^ ((int)(v1 ^ v1 >>> 0x20))) * 1000003 ^ v2) * 1000003 : this.b.hashCode() ^ (((v ^ 1000003) * 1000003 ^ ((int)(v1 ^ v1 >>> 0x20))) * 1000003 ^ v2) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        String s;
        switch(this.c) {
            case 1: {
                s = "UNKNOWN";
                break;
            }
            case 2: {
                s = "SINGLE_DEVICE";
                break;
            }
            default: {
                s = "null";
            }
        }
        long v = this.a;
        int v1 = this.d;
        switch(v1) {
            case 1: {
                return "CloudSyncRestoreRequest{restoreMode=" + s + ", androidId=" + v + ", restoreTriggerType=" + "UNKNOWN" + ", restoreAccountName=" + this.b + "}";
            }
            case 2: {
                return "CloudSyncRestoreRequest{restoreMode=" + s + ", androidId=" + v + ", restoreTriggerType=" + "FOLSOM_SUCCESS_RECOVERY" + ", restoreAccountName=" + this.b + "}";
            }
            default: {
                return v1 == 3 ? "CloudSyncRestoreRequest{restoreMode=" + s + ", androidId=" + v + ", restoreTriggerType=" + "NOTIFICATION_API" + ", restoreAccountName=" + this.b + "}" : "CloudSyncRestoreRequest{restoreMode=" + s + ", androidId=" + v + ", restoreTriggerType=" + "null" + ", restoreAccountName=" + this.b + "}";
            }
        }
    }
}

