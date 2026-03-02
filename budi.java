import com.google.android.gms.googleone.StorageQuotaInfo;

public final class budi {
    public final String a;
    public final StorageQuotaInfo b;

    public budi(String s, StorageQuotaInfo storageQuotaInfo0) {
        ibuq.f(s, "accountName");
        ibuq.f(storageQuotaInfo0, "storageQuotaInfo");
        super();
        this.a = s;
        this.b = storageQuotaInfo0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof budi)) {
            return false;
        }
        return ibuq.m(this.a, ((budi)object0).a) ? ibuq.m(this.b, ((budi)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AccountStorageQuotaInfo(accountName=" + this.a + ", storageQuotaInfo=" + this.b + ")";
    }
}

