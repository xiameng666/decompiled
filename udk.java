import java.io.File;

public final class udk {
    private volatile ufa a;
    private final uff b;

    public udk(uff uff0) {
        this.b = uff0;
    }

    public final ufa a() {
        if(this.a == null) {
            synchronized(this) {
                if(this.a == null) {
                    File file0 = this.b.a.a.getCacheDir();
                    ufa ufa0 = null;
                    File file1 = file0 == null ? null : new File(file0, this.b.a.b);
                    if(file1 != null && (file1.isDirectory() || file1.mkdirs())) {
                        ufa0 = new ufg(file1);
                    }
                    this.a = ufa0;
                }
                if(this.a == null) {
                    this.a = new ufb();
                }
            }
            return this.a;
        }
        return this.a;
    }
}

