import android.net.Uri;
import java.io.File;

public final class fmil implements gfsi {
    public final fmiv a;
    public final fmga b;
    public final fmjm c;

    public fmil(fmiv fmiv0, fmga fmga0, fmjm fmjm0) {
        this.a = fmiv0;
        this.b = fmga0;
        this.c = fmjm0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fmix fmix0 = (fmix)object0;
        File file0 = new File(this.a.j(this.b.c, this.c.a));
        File file1 = new File(this.a.b(this.b.c, this.c.a));
        file1.getParentFile().mkdirs();
        file0.renameTo(file1);
        return Uri.fromFile(new File(file1.getAbsolutePath())).toString();
    }
}

