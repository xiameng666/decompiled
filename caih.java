import android.content.Context;
import com.google.android.gms.intrusiondetection.ui.retrieval.IntrusionDetectionRetrievalChimeraActivity;
import j..util.Objects;

final class caih implements acl {
    final caii a;

    public caih(caii caii0) {
        Objects.requireNonNull(caii0);
        this.a = caii0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        caii caii0 = this.a;
        if(!caii0.k) {
            caii0.k = true;
            ((caig)caii0.h()).d(((IntrusionDetectionRetrievalChimeraActivity)caii0));
        }
    }
}

