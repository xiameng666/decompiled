import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import j..util.Objects;
import java.util.Iterator;
import java.util.List;

final class dccv implements dizh {
    final Intent a;
    final NearbySharingChimeraService b;

    public dccv(NearbySharingChimeraService nearbySharingChimeraService0, Intent intent0) {
        this.a = intent0;
        Objects.requireNonNull(nearbySharingChimeraService0);
        this.b = nearbySharingChimeraService0;
        super();
    }

    @Override  // dizh
    public final void a() {
        dcvz.a.e().p("Failed to invalidate intent because we failed to cache the attachments from this intent.", new Object[0]);
    }

    @Override  // dizh
    public final void b(List list0) {
        Intent intent0;
        dftm dftm0 = this.b.a;
        Iterator iterator0 = list0.iterator();
        while(true) {
            intent0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Attachment attachment0 = (Attachment)object0;
            if(attachment0.i()) {
                intent0.putExtra("share_use_case", 4);
            }
            else if(attachment0.m()) {
                intent0.putExtra("share_use_case", 3);
            }
            else {
                if(hvqz.l() && TextUtils.equals("com.google.android.gms.nearby.sharing", intent0.getStringExtra("com.google.android.apps.nbu.files.intent.extra.SENDER_ID"))) {
                    intent0.putExtra("share_use_case", 5);
                    break;
                }
                intent0.putExtra("share_use_case", 1);
            }
        }
        dftm0.q(intent0);
        dcvz.a.b().p("Cached attachments finished.", new Object[0]);
    }

    @Override  // dizh
    public final void c() {
    }

    @Override  // dizh
    public final void d() {
        dcvz.a.b().p("Started download and cache attachments.", new Object[0]);
    }
}

