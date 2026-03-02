import androidx.appsearch.safeparcel.PackageIdentifierParcel;

public final class afj {
    public final PackageIdentifierParcel a;

    public afj(PackageIdentifierParcel packageIdentifierParcel0) {
        kay.i(packageIdentifierParcel0);
        this.a = packageIdentifierParcel0;
    }

    public afj(String s, byte[] arr_b) {
        kay.i(s);
        kay.i(arr_b);
        this.a = new PackageIdentifierParcel(s, arr_b);
    }

    public final String a() {
        return this.a.a;
    }

    public final byte[] b() {
        return this.a.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof afj) ? this.a.equals(((afj)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

