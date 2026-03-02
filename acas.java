import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;
import j..util.Objects;

public final class acas implements View.OnClickListener {
    final AppInviteChimeraActivity a;

    public acas(AppInviteChimeraActivity appInviteChimeraActivity0) {
        Objects.requireNonNull(appInviteChimeraActivity0);
        this.a = appInviteChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ca ca0 = new ca(this.a.getSupportFragmentManager());
        ca0.o(this.a.o);
        ca0.b();
    }
}

