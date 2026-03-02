import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.gms.people.profile.AvatarChimeraActivity;
import j..util.Objects;
import java.io.IOException;
import java.io.OutputStream;

public final class egjd implements gmbg {
    final AvatarChimeraActivity a;

    public egjd(AvatarChimeraActivity avatarChimeraActivity0) {
        Objects.requireNonNull(avatarChimeraActivity0);
        this.a = avatarChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        egig.b("Error when fetching remote image; Exception: %s", throwable0.toString());
        this.a.l();
        this.a.i();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((byte[])object0) != AvatarChimeraActivity.j && ((byte[])object0) != null) {
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(((byte[])object0), 0, ((byte[])object0).length);
            if(bitmap0 == null) {
                egig.k("People.Avatar", "Failed to decode remote photo");
                this.a.l();
                this.a.i();
                return;
            }
            AvatarChimeraActivity avatarChimeraActivity0 = this.a;
            Uri uri0 = egjg.a(avatarChimeraActivity0, "remote-avatar.jpg");
            if(uri0 != null) {
                try(OutputStream outputStream0 = fqbf.e(avatarChimeraActivity0.q, uri0, fqbe.a)) {
                    int v = (int)hxgf.b();
                    bitmap0.compress(Bitmap.CompressFormat.JPEG, v, outputStream0);
                    avatarChimeraActivity0.m = uri0;
                    avatarChimeraActivity0.g(avatarChimeraActivity0.m);
                }
                catch(IOException iOException0) {
                    egig.c("People.Avatar", "Failed to compress remove photo to temp file", iOException0);
                }
                return;
            }
            egig.k("People.Avatar", "Failed to get temp file for remote photo");
            avatarChimeraActivity0.l();
            avatarChimeraActivity0.i();
            return;
        }
        egig.k("People.Avatar", "Failed to load remote photo from image server.");
        this.a.l();
        this.a.i();
    }
}

