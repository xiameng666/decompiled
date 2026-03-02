import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.InstantIndexingIntentOperation;
import j..util.Objects;

final class camc implements Runnable {
    final Context a;
    final camd b;

    public camc(camd camd0, Context context0) {
        this.a = context0;
        Objects.requireNonNull(camd0);
        this.b = camd0;
        super();
    }

    @Override
    public final void run() {
        Context context0 = this.a;
        Intent intent0 = IntentOperation.getStartIntent(context0, InstantIndexingIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.INSTANT_INDEX");
        if(intent0 != null) {
            context0.startService(intent0);
            this.b.c.set(false);
        }
    }
}

