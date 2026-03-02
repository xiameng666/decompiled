import android.content.Context;
import java.io.File;

public final class cwlr {
    public static File a(Context context0, String s) {
        File file0 = cwlr.b(context0);
        if(!file0.exists() && !file0.mkdirs()) {
            cwfa.a.g().B("AnimationPathUtil: Failed to create animation dir at %s", file0);
            file0 = null;
        }
        if(file0 == null) {
            return null;
        }
        return hrnt.i() ? new File(ccsb.a.b(file0, gfqz.c(s) + ".webp")) : new File(file0, gfqz.c(s) + ".webp");
    }

    public static File b(Context context0) {
        return hrnt.i() ? new File(ccsb.a.b(context0.getCacheDir(), "fastpair_animation")) : new File(context0.getCacheDir(), "fastpair_animation");
    }

    public static boolean c(Context context0) {
        return !bbnp.j(context0) && !bbnp.f(context0) && hvpp.a.f().aq() && hvpp.aQ();
    }
}

