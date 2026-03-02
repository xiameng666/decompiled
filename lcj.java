import java.io.File;

public final class lcj implements ibth {
    public final File a;

    public lcj(File file0) {
        this.a = file0;
    }

    @Override  // ibth
    public final Object a() {
        synchronized(lcl.b) {
            String s = this.a.getAbsolutePath();
            lcl.a.remove(s);
        }
        return ibom.a;
    }
}

