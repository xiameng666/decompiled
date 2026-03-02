import android.content.ContentResolver;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class eguy implements DialogInterface.OnClickListener {
    public final egrw a;

    public eguy(egrw egrw0) {
        this.a = egrw0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        egrw egrw0 = this.a;
        if(egrw0 != null) {
            ContentResolver.setMasterSyncAutomatically(true);
            ContentResolver.setSyncAutomatically(egrw0.a, "com.android.contacts", true);
            egrw0.C();
            if(egrw0.aq) {
                if(egrw0.aj) {
                    egrw0.ai.setOnClickListener(null);
                }
                else {
                    egrw0.ag.setOnClickListener(null);
                }
            }
            if(egrw0.aj) {
                egrw0.b.q(false);
                egrw0.b.p();
            }
            egrw0.B(false);
            egrw0.E(17);
            if(egrw0.ap.i()) {
                ((egik)egrw0.ap.d()).e();
            }
            if(hwyq.a.b().a()) {
                egrw0.b.n();
            }
        }
    }
}

