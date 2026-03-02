import android.nfc.tech.IsoDep;

public final class bmau {
    public final IsoDep a;

    public bmau(IsoDep isoDep0) {
        this.a = isoDep0;
    }

    public final byte[] a(byte[] arr_b) {
        return this.a.transceive(arr_b);
    }

    public final void b() {
        this.a.setTimeout(800);
    }
}

