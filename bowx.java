import com.google.android.gms.findmydevice.spot.ScanResult;

public final class bowx implements glzn {
    public final bowy a;
    public final byte[] b;
    public final fgvl c;

    public bowx(bowy bowy0, byte[] arr_b, fgvl fgvl0) {
        this.a = bowy0;
        this.b = arr_b;
        this.c = fgvl0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        ScanResult scanResult0 = new ScanResult();
        bnji.a(this.b, scanResult0);
        bnji.d(this.c.a.getRssi(), scanResult0);
        bnji.b(this.c.b().b(), scanResult0);
        bnji.c(this.c.a.getTimestampNanos(), scanResult0);
        return this.a.a.a.c.a(scanResult0, gfqx.a, haea.j);
    }
}

