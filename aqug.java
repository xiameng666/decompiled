import com.google.android.libraries.photos.backup.api.BackupEnableRequest;

public final class aqug implements aquz {
    public final String a;
    public final aqvd b;

    public aqug(String s, aqvd aqvd0) {
        this.a = s;
        this.b = aqvd0;
    }

    @Override  // aquz
    public final Object a(fptf fptf0) {
        fptd fptd0 = new fptd(aquj.a, this.a, this.b.a);
        fptd0.d = true;
        return Boolean.valueOf(fptf0.d(new BackupEnableRequest(fptd0)));
    }
}

