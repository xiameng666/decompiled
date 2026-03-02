import android.bluetooth.le.ScanRecord;
import android.os.ParcelUuid;
import j..util.Objects;

public final class eigg {
    private final eigf a;

    public eigg(eigf eigf0) {
        this.a = eigf0;
    }

    public static eigg a(ScanRecord scanRecord0) {
        return scanRecord0 == null || scanRecord0.getBytes() == null ? null : new eigg(new eigd(scanRecord0));
    }

    public final byte[] b(ParcelUuid parcelUuid0) {
        return this.a.a(parcelUuid0);
    }

    public final byte[] c() {
        return this.a.b();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof eigg) ? Objects.equals(this.a, ((eigg)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}

