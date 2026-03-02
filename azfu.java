import java.io.File;

final class azfu {
    public final File a;
    private String b;

    public azfu(File file0) {
        this.b = null;
        this.a = file0;
    }

    public azfu(File file0, String s, String s1, String s2) {
        this(new File(file0.getAbsolutePath() + "/" + s + "/" + s1 + "/" + s2));
        this.b = s1;
    }

    final File a() {
        return new File(this.a, "play_logger_context.pb");
    }

    final Iterable b() {
        return gggq.d(azfp.a(this.a), new azft());
    }

    final String c() {
        if(this.b == null) {
            File file0 = this.a.getParentFile();
            gftb.check(file0);
            this.b = file0.getName();
        }
        return this.b;
    }

    final String d() {
        return this.a.getName();
    }
}

