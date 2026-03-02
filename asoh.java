public final class asoh {
    public final String a;
    public final asoi b;
    public final asoi c;
    public final asoj d;
    private final String e;

    public asoh(String s, String s1, asoi asoi0, asoi asoi1, asoj asoj0) {
        ibuq.f(s, "accountName");
        ibuq.f(asoi0, "deviceBackupState");
        ibuq.f(asoi1, "photosBackupState");
        ibuq.f(asoj0, "storageState");
        super();
        this.a = s;
        this.e = s1;
        this.b = asoi0;
        this.c = asoi1;
        this.d = asoj0;
    }

    public final boolean a() {
        return ibuq.m(this.a, this.e);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof asoh)) {
            return false;
        }
        if(!ibuq.m(this.a, ((asoh)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.e, ((asoh)object0).e)) {
            return false;
        }
        if(this.b != ((asoh)object0).b) {
            return false;
        }
        return this.c == ((asoh)object0).c ? this.d == ((asoh)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.e == null ? ((v * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode() : (((v + this.e.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "BackupContextualCardData(accountName=" + this.a + ", backupAccountName=" + this.e + ", deviceBackupState=" + this.b + ", photosBackupState=" + this.c + ", storageState=" + this.d + ")";
    }
}

