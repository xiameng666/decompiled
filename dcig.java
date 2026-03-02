import android.content.Intent;
import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dcig implements Runnable {
    public final dcii a;
    public final int b;
    public final ShareTarget c;

    public dcig(dcii dcii0, int v, ShareTarget shareTarget0) {
        this.a = dcii0;
        this.b = v;
        this.c = shareTarget0;
    }

    @Override
    public final void run() {
        this.a.b.e("nearby_sharing", this.b);
        Intent intent0 = new Intent("com.google.android.gms.nearby.sharing.ACTION_AUTO_DISMISS").putExtra("share_target_bytes", dcii.r(this.c)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", this.c.e().size()).putExtra("notification_id", this.b);
        cutr.d(this.a.a, intent0);
    }
}

