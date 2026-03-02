import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.google.android.gms.cast.activity.CastPopupChimeraActivity;

public final class atue extends atuu {
    private final avjh a;

    public atue(CastPopupChimeraActivity castPopupChimeraActivity0) {
        super(castPopupChimeraActivity0);
        this.a = new avjh("CastConsentActivity");
    }

    @Override  // atuu
    public final void g(Bundle bundle0) {
        this.a.m("Requesting for MediaProjection.");
        Intent intent0 = ((MediaProjectionManager)this.j.getSystemService("media_projection")).createScreenCaptureIntent();
        this.j.startActivityForResult(intent0, 2);
    }

    @Override  // atuu
    public final void q(int v, int v1, Intent intent0) {
        this.a.p("onActivityResult: requestCode=%d resultCode=%d", Integer.valueOf(v), Integer.valueOf(v1));
        if(v == 2) {
            Intent intent1 = new Intent();
            intent1.putExtra("com.google.android.gms.media.USER_CONSENT_REQUEST_RESULT", v1);
            intent1.setAction("com.google.android.gms.cast.media.PROJECT");
            if(v1 == -1) {
                intent1.putExtra("extra_projection_intent", intent0);
            }
            intent1.setPackage("com.google.android.gms");
            this.j.sendBroadcast(intent1);
        }
        this.j.finish();
    }
}

