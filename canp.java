import android.provider.MediaStore.Audio.Media;
import java.util.concurrent.Executor;

public final class canp extends canx {
    public canp(gopj gopj0, Executor executor0, capf capf0) {
        super(gopj0, executor0, capf0);
    }

    @Override  // canx
    public final gmcd a() {
        return this.e(this.b.f(new String[]{"MusicRecording"}), Integer.valueOf(2));
    }

    @Override  // canx
    public final gops b(capd capd0) {
        return canp.d(((capc)capd0));
    }

    public static final gops d(capc capc0) {
        gopw gopw0 = new gopw("MusicRecording");
        if(capc0.d().booleanValue()) {
            gopw0.j(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI + "/" + capc0.g);
            gopw0.k((capc0.b == null ? "Music" : capc0.b));
            String s = capc0.c;
            if(s != null) {
                gopw gopw1 = new gopw(null);
                gopw1.k(s);
                gopw0.g("inAlbum", new gopw[]{gopw1});
            }
            if(capc0.b()) {
                gopw0.f("albumId", new long[]{((long)capc0.d)});
            }
            String s1 = capc0.e;
            if(s1 != null) {
                gopw gopw2 = new gopw(null);
                gopw2.k(s1);
                gopw0.g("byArtist", new gopw[]{gopw2});
            }
            if(capc0.c()) {
                gopw0.f("artistId", new long[]{((long)capc0.f)});
            }
            return gopw0.a();
        }
        return null;
    }
}

