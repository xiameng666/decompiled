import android.content.Context;
import com.google.android.gms.googleone.smui.SmuiChimeraActivity;
import j..util.Objects;

final class buig implements acl {
    final buih a;

    public buig(buih buih0) {
        Objects.requireNonNull(buih0);
        this.a = buih0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        buih buih0 = this.a;
        if(!buih0.j) {
            buih0.j = true;
            ((buiq)buih0.h()).d(((SmuiChimeraActivity)buih0));
        }
    }
}

