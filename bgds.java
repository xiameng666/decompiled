import java.util.List;

public final class bgds implements bgdv {
    public final boolean a;
    public final bgax b;
    public final boolean c;
    public final List d;

    public bgds(boolean z, bgax bgax0, boolean z1, List list0) {
        this.a = z;
        this.b = bgax0;
        this.c = z1;
        this.d = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bgds)) {
            return false;
        }
        if(this.a != ((bgds)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((bgds)object0).b)) {
            return false;
        }
        return this.c == ((bgds)object0).c ? ibuq.m(this.d, ((bgds)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return ((bgdr.a(this.a) * 0x1F + this.b.hashCode()) * 0x1F + bgdr.a(this.c)) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "CredentialsAvailableScreenState(isRefreshing=" + this.a + ", credentialFilterState=" + this.b + ", showBatchUpload=" + this.c + ", credentials=" + this.d + ")";
    }
}

