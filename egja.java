import android.content.Intent;
import com.google.android.gms.people.profile.AvatarChimeraActivity;

public final class egja implements evqf {
    public final AvatarChimeraActivity a;

    public egja(AvatarChimeraActivity avatarChimeraActivity0) {
        this.a = avatarChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.a();
        Intent intent0 = new Intent();
        intent0.putExtra("com.google.android.gms.people.profile.EXTRA_AVATAR_URL", ((eghd)object0).b);
        this.a.n(7, this.a.l != null);
        this.a.setResult(-1, intent0);
        this.a.finish();
    }
}

