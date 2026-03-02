import android.provider.MediaStore.Audio.Artists;
import android.text.TextUtils;
import java.util.concurrent.Executor;

public final class cano extends canx {
    public cano(gopj gopj0, Executor executor0, capf capf0) {
        super(gopj0, executor0, capf0);
    }

    @Override  // canx
    public final gmcd a() {
        return this.e(this.b.f(new String[]{"MusicGroup"}), Integer.valueOf(caok.b.d));
    }

    @Override  // canx
    protected final gops b(capd capd0) {
        if(((caoy)capd0).d().booleanValue()) {
            String s = ((caoy)capd0).a;
            if(!TextUtils.isEmpty(s)) {
                gopw gopw0 = new gopw(null);
                gopw0.j(MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI + "/" + ((caoy)capd0).g);
                gopw0.k(s);
                return gopw0.a();
            }
        }
        return null;
    }

    @Override  // canx
    protected final boolean c() {
        return false;
    }
}

