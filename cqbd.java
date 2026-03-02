import android.content.Intent;
import java.util.concurrent.Executor;

public final class cqbd implements cqfg {
    public static final ggtl a;
    public final fiyj b;
    public final cmbm c;
    public final cqbs d;
    private final Executor e;

    static {
        cqbd.a = cqek.b();
    }

    public cqbd(cmbm cmbm0, cqbs cqbs0, Executor executor0, fiyj fiyj0) {
        this.c = cmbm0;
        this.d = cqbs0;
        this.e = executor0;
        this.b = fiyj0;
    }

    @Override  // cqfg
    public final cqgx a() {
        return cqgx.b;
    }

    @Override  // cqfg
    public final gmcd b(Intent intent0) {
        if(!intent0.hasExtra("user_id")) {
            return glzd.g(glzd.g(gmbt.h(gmbu.i(null)), new cqbb(this), gmap.a), new cqbc(this), gmap.a);
        }
        String s = intent0.getStringExtra("user_id");
        gftb.check(s);
        return glzd.g(glzd.g(gmbt.h(gmbu.m(new cqax(this, s), this.e)), new cqbb(this), gmap.a), new cqbc(this), gmap.a);
    }

    @Override  // cqfg
    public final boolean c(Intent intent0) {
        if(intent0.hasExtra("notification_type") && "sgbe_update_profile".equals(intent0.getStringExtra("notification_type"))) {
            return true;
        }
        cqbd.a.h().ar(7086).x("Message not relevant for profile sync, skipping push message handling...");
        return false;
    }
}

