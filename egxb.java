final class egxb {
    public final int a;
    public final gfsx b;
    public final int c;
    public final gfsx d;
    public final long e;
    public final int f;

    public egxb() {
        throw null;
    }

    public egxb(int v, int v1, gfsx gfsx0, int v2, gfsx gfsx1, long v3) {
        this.f = v;
        this.a = v1;
        this.b = gfsx0;
        this.c = v2;
        this.d = gfsx1;
        this.e = v3;
    }

    static egxb a(int v, int v1, int v2, int v3) {
        return new egxb(v, v1, gfsx.m(Integer.valueOf(v2)), v3, gfqx.a, -1L);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof egxb) && this.f == ((egxb)object0).f && this.a == ((egxb)object0).a && this.b.equals(((egxb)object0).b) && this.c == ((egxb)object0).c && this.d.equals(((egxb)object0).d) && this.e == ((egxb)object0).e;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.e ^ this.e >>> 0x20)) ^ (((((this.f ^ 1000003) * 1000003 ^ this.a) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        switch(this.f) {
            case 1: {
                return "SyncUiModel{status=GENERIC_ERROR, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 2: {
                return "SyncUiModel{status=LAST_SYNC_SUCCESSFUL, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 3: {
                return "SyncUiModel{status=SYNC_IN_PROGRESS, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 4: {
                return "SyncUiModel{status=SYNC_OFF, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 5: {
                return "SyncUiModel{status=CONTACTS_PERMISSIONS_ERROR, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 6: {
                return "SyncUiModel{status=NEVER_SYNCED, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 7: {
                return "SyncUiModel{status=SYNC_PENDING_LAST_SYNC_SUCCESS, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 8: {
                return "SyncUiModel{status=SYNC_PENDING_LAST_SYNC_ERROR, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 9: {
                return "SyncUiModel{status=SYNC_START, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            case 10: {
                return "SyncUiModel{status=SYNC_UP, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
            default: {
                return "SyncUiModel{status=SYNC_DOWN, numContacts=" + this.a + ", numSyncedContacts=" + this.b.toString() + ", dataType=" + this.c + ", numNonDirtyContacts=" + this.d.toString() + ", lastSyncTime=" + this.e + "}";
            }
        }
    }
}

