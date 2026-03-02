import android.net.Uri;
import com.google.android.gms.people.profile.AvatarChimeraActivity;

public final class egiy implements evqf {
    public final AvatarChimeraActivity a;

    public egiy(AvatarChimeraActivity avatarChimeraActivity0) {
        this.a = avatarChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((efnw)object0).b().b() == 1) {
            AvatarChimeraActivity avatarChimeraActivity0 = this.a;
            avatarChimeraActivity0.k = true;
            Uri uri0 = avatarChimeraActivity0.l;
            if(uri0 == null && avatarChimeraActivity0.m == null && !avatarChimeraActivity0.p) {
                new egji().show(avatarChimeraActivity0.getSupportFragmentManager(), "source_dialog");
                return;
            }
            if((uri0 != null || avatarChimeraActivity0.m != null) && !avatarChimeraActivity0.p && avatarChimeraActivity0.o == null) {
                if(uri0 != null) {
                    avatarChimeraActivity0.g(uri0);
                    return;
                }
                Uri uri1 = avatarChimeraActivity0.m;
                if(uri1 != null) {
                    avatarChimeraActivity0.g(uri1);
                }
            }
        }
    }
}

