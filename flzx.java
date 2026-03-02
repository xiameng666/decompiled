import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class flzx implements glzm {
    public final flzz a;
    public final AccountContext b;
    public final fmga c;
    public final gfsx d;

    public flzx(flzz flzz0, AccountContext accountContext0, fmga fmga0, gfsx gfsx0) {
        this.a = flzz0;
        this.b = accountContext0;
        this.c = fmga0;
        this.d = gfsx0;
    }

    @Override  // glzm
    public final gmcd a() {
        Object object0 = this.d.d();
        flqv flqv0 = flqw.a();
        flqv0.a = "ImageDownload";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        UUID uUID0 = UUID.randomUUID();
        fmaf fmaf0 = new fmaf(this.b, ((String)object0), this.c);
        flvd flvd0 = this.a.c.a;
        gpgz gpgz0 = flvd0.d.d;
        return gpgz0 == null ? flvd0.b(uUID0, fmaf0, gmbu.i(new flve(hnvu.a(flvd0.d.c))), this.b, flqw0, true) : flvd0.b(uUID0, fmaf0, gmbu.i(flvd0.d.a(hnvu.a(gpgz0.a(hobf.m)))), this.b, flqw0, true);
    }
}

