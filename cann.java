import android.provider.MediaStore.Audio.Albums;
import java.util.concurrent.Executor;

public final class cann extends canx {
    public cann(gopj gopj0, Executor executor0, capf capf0) {
        super(gopj0, executor0, capf0);
    }

    @Override  // canx
    public final gmcd a() {
        return this.e(this.b.f(new String[]{"MusicAlbum"}), Integer.valueOf(caok.a.d));
    }

    @Override  // canx
    protected final gops b(capd capd0) {
        if(!((caow)capd0).d().booleanValue()) {
            return null;
        }
        gopw gopw0 = new gopw(null);
        gopw0.j(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI + "/" + ((caow)capd0).g);
        String s = ((caow)capd0).a;
        if(s == null) {
            s = "Untitled Album";
        }
        gopw0.k(s);
        Integer integer0 = ((caow)capd0).c;
        if(integer0 != null) {
            gopw0.f("numTracks", new long[]{((long)(((int)integer0)))});
        }
        String s1 = ((caow)capd0).b;
        if(s1 != null) {
            gopw gopw1 = new gopw(null);
            gopw1.k(s1);
            gopw0.g("byArtist", new gopw[]{gopw1});
        }
        return gopw0.a();
    }

    @Override  // canx
    protected final boolean c() {
        return false;
    }
}

