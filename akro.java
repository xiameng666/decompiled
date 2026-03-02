import java.util.Arrays;

public final class akro {
    public final byte[] a;
    public final boolean b;
    public final boolean c;
    public final Boolean d;

    public akro(byte[] arr_b, boolean z, boolean z1, Boolean boolean0) {
        this.a = arr_b;
        this.b = z;
        this.c = z1;
        this.d = boolean0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof akro)) {
            return false;
        }
        if(!ibuq.m(this.a, ((akro)object0).a)) {
            return false;
        }
        if(this.b != ((akro)object0).b) {
            return false;
        }
        return this.c == ((akro)object0).c ? ibuq.m(this.d, ((akro)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : Arrays.hashCode(this.a);
        boolean z = this.b;
        boolean z1 = this.c;
        Boolean boolean0 = this.d;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return ((v1 * 0x1F + akrn.a(z)) * 0x1F + akrn.a(z1)) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "PackageData(packageInfoBytes=" + Arrays.toString(this.a) + ", isUnicornAccount=" + this.b + ", forceDeviceOwner=" + this.c + ", isGetTokenDmRequired=" + this.d + ")";
    }
}

