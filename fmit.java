import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.io.File;

public final class fmit implements gfsi {
    public final fmiv a;
    public final String b;
    public final fmga c;
    public final fmjo d;
    public final AccountContext e;

    public fmit(fmiv fmiv0, String s, fmga fmga0, fmjo fmjo0, AccountContext accountContext0) {
        this.a = fmiv0;
        this.b = s;
        this.c = fmga0;
        this.d = fmjo0;
        this.e = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fmix fmix0 = (fmix)object0;
        File file0 = new File(this.b);
        fmiv fmiv0 = this.a;
        fmiv0.d().mkdirs();
        String s = fmiv0.d().getAbsolutePath();
        fmga fmga0 = this.c;
        File file1 = new File(s + File.separator + fmiv.h(fmga0.c.a()) + fmiv.g(fmga0.c) + "_" + file0.getName());
        file0.renameTo(file1);
        String s1 = file1.getAbsolutePath();
        fmjo fmjo0 = this.d;
        gfsx gfsx0 = fmjo0.c;
        if(!gfsx0.i()) {
            Uri uri0 = Uri.fromFile(new File(s1));
            int v = (int)iadl.e();
            int v1 = (int)iadl.d();
            long v2 = iadl.c();
            int v3 = (int)iadl.b();
            byte[] arr_b = fmif.a(fmiv0.b, uri0, v, v1, v2, v3);
            if(arr_b == null) {
                flbj.c("PhotosMsgController", "Failed to regenerate thumbnail");
            }
            else {
                gfsx0 = gfsx.m(arr_b);
            }
        }
        fmjn fmjn0 = new fmjn(fmjo0);
        fmjn0.b = Uri.fromFile(new File(s1)).toString();
        fmjn0.b(1);
        if(gfsx0 == null) {
            throw new NullPointerException("Null thumbnail");
        }
        fmjn0.c = gfsx0;
        fmjo fmjo1 = fmjn0.a();
        fmfm fmfm0 = new fmfm(fmga0);
        fmfo fmfo0 = new fmfo();
        fmfo0.c("photos");
        fmfo0.b(((byte[])fmia.c(fmjo1).d()));
        fmfm0.q(fmfo0.a());
        Object object1 = fmfm0.a();
        fmiv0.f.b(this.e).V(((fmga)object1));
        return object1;
    }
}

