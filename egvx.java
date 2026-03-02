final class egvx {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public egvx() {
        throw null;
    }

    public egvx(int v, String s, int v1, int v2) {
        this.d = v;
        this.a = s;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof egvx) && this.d == ((egvx)object0).d) {
            String s = this.a;
            if(s == null) {
                return ((egvx)object0).a == null ? this.b == ((egvx)object0).b && this.c == ((egvx)object0).c : false;
            }
            return s.equals(((egvx)object0).a) ? this.b == ((egvx)object0).b && this.c == ((egvx)object0).c : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.c ^ ((this.d ^ 1000003) * 1000003 * 1000003 ^ this.b) * 1000003 : this.c ^ ((this.a.hashCode() ^ (this.d ^ 1000003) * 1000003) * 1000003 ^ this.b) * 1000003;
    }

    @Override
    public final String toString() {
        switch(this.d) {
            case 1: {
                return "SheepdogModel{status=SHEEPDOG_ON, account=" + this.a + ", numContactsToBackup=" + this.b + ", numContactsToBackupForV2=" + this.c + "}";
            }
            case 2: {
                return "SheepdogModel{status=SHEEPDOG_ON_IN_OTHER_ACCOUNT, account=" + this.a + ", numContactsToBackup=" + this.b + ", numContactsToBackupForV2=" + this.c + "}";
            }
            case 3: {
                return "SheepdogModel{status=SHEEPDOG_V2_ON, account=" + this.a + ", numContactsToBackup=" + this.b + ", numContactsToBackupForV2=" + this.c + "}";
            }
            case 4: {
                return "SheepdogModel{status=SHEEPDOG_OFF, account=" + this.a + ", numContactsToBackup=" + this.b + ", numContactsToBackupForV2=" + this.c + "}";
            }
            case 5: {
                return "SheepdogModel{status=SHEEPDOG_PAUSED, account=" + this.a + ", numContactsToBackup=" + this.b + ", numContactsToBackupForV2=" + this.c + "}";
            }
            case 6: {
                return "SheepdogModel{status=SHEEPDOG_RELEVANT, account=" + this.a + ", numContactsToBackup=" + this.b + ", numContactsToBackupForV2=" + this.c + "}";
            }
            case 7: {
                return "SheepdogModel{status=SHEEPDOG_UNAVAILABLE, account=" + this.a + ", numContactsToBackup=" + this.b + ", numContactsToBackupForV2=" + this.c + "}";
            }
            default: {
                return "SheepdogModel{status=SHEEPDOG_V2_ON_IN_OTHER_ACCOUNT, account=" + this.a + ", numContactsToBackup=" + this.b + ", numContactsToBackupForV2=" + this.c + "}";
            }
        }
    }
}

