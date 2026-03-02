import android.net.Uri;
import com.google.android.gms.mdd.MddFile;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class cpya implements glzn {
    public final cpyc a;
    public final List b;
    public final fjbm c;
    public final AtomicReference d;

    public cpya(cpyc cpyc0, List list0, fjbm fjbm0, AtomicReference atomicReference0) {
        this.a = cpyc0;
        this.b = list0;
        this.c = fjbm0;
        this.d = atomicReference0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((Uri)object0) != null) {
            this.b.add(new MddFile(this.c.c, ((Uri)object0).toString()));
            return gmbx.a;
        }
        this.d.set(glsl.h);
        throw new cjuh(13, "GetFileGroupOp : " + this.a.b.a + " Failed to get file uris");
    }
}

