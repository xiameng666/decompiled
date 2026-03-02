import android.provider.MediaStore.Audio.Playlists;
import android.text.TextUtils;
import java.util.concurrent.Executor;

public final class canq extends canx {
    public canq(gopj gopj0, Executor executor0, capf capf0) {
        super(gopj0, executor0, capf0);
    }

    @Override  // canx
    public final gmcd a() {
        return this.e(this.b.f(new String[]{"MusicPlaylist"}), Integer.valueOf(caok.c.d));
    }

    @Override  // canx
    protected final gops b(capd capd0) {
        if(((capb)capd0).d().booleanValue()) {
            String s = ((capb)capd0).a;
            if(!TextUtils.isEmpty(s)) {
                String s1 = String.valueOf(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI);
                gopw gopw0 = new gopw("MusicPlaylist");
                gopw0.j(s1 + "/" + ((capb)capd0).g);
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

