import android.os.PersistableBundle;
import android.util.Log;
import android.uwb.RangingReport;
import android.uwb.RangingSession.Callback;
import android.uwb.RangingSession;
import android.uwb.UwbAddress;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class kct implements RangingSession.Callback {
    final kcu a;
    final djgk b;

    public kct(kcu kcu0, djgk djgk0) {
        this.b = djgk0;
        Objects.requireNonNull(kcu0);
        this.a = kcu0;
        super();
    }

    public final void onClosed(int v, PersistableBundle persistableBundle0) {
        kdd kdd0 = this.a.p();
        kco kco0 = new kco(this, this.b, kdd0);
        this.a.q(kco0);
        this.a.g = null;
        this.a.b.b(Boolean.valueOf(true));
    }

    public final void onControleeAddFailed(int v, PersistableBundle persistableBundle0) {
        this.a.b.a(Boolean.valueOf(false));
    }

    public final void onControleeAdded(PersistableBundle persistableBundle0) {
        this.a.b.a(Boolean.valueOf(true));
    }

    public final void onControleeRemoveFailed(int v, PersistableBundle persistableBundle0) {
        this.a.b.b(Boolean.valueOf(false));
    }

    public final void onControleeRemoved(PersistableBundle persistableBundle0) {
        int v = persistableBundle0.getInt("mac_address_mode");
        long v1 = persistableBundle0.getLong("address");
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.putLong(v1);
        hjli hjli0 = new hjli(UwbAddress.fromBytes(Arrays.copyOf(byteBuffer0.array(), (v == 0 ? 2 : 8))), persistableBundle0.getInt("reason"));
        if(hjli0.b == 2) {
            this.a.b.b(Boolean.valueOf(true));
            return;
        }
        kcs kcs0 = new kcs(this, hjli0, this.b);
        this.a.q(kcs0);
    }

    public final void onOpenFailed(int v, PersistableBundle persistableBundle0) {
        Log.i("UwbBackend", String.format("Session open failed: reason %s", v));
        int v1 = kbr.a(v) == 0 ? 2 : kbr.a(v);
        kcp kcp0 = new kcp(this, this.b, v1);
        this.a.q(kcp0);
        this.a.g = null;
        this.a.b.a(Boolean.valueOf(false));
    }

    public final void onOpened(RangingSession rangingSession0) {
        this.a.g = rangingSession0;
        this.a.b.b(Boolean.valueOf(true));
    }

    public final void onRangingRoundsUpdateDtTagStatus(PersistableBundle persistableBundle0) {
        this.a.b.a(Boolean.valueOf(true));
    }

    public final void onReconfigureFailed(int v, PersistableBundle persistableBundle0) {
        this.a.b.b(Boolean.valueOf(false));
    }

    public final void onReconfigured(PersistableBundle persistableBundle0) {
        this.a.b.b(Boolean.valueOf(true));
    }

    public final void onReportReceived(RangingReport rangingReport0) {
        kcu kcu0 = this.a;
        if(kcu0.j) {
            kcu0.q(new kcq(this, rangingReport0, this.b));
        }
    }

    public final void onStartFailed(int v, PersistableBundle persistableBundle0) {
        int v1 = kbr.a(v) == 1 ? kbr.a(v) : 2;
        kcr kcr0 = new kcr(this, this.b, v1);
        kcu kcu0 = this.a;
        kcu0.q(kcr0);
        RangingSession rangingSession0 = kcu0.g;
        if(rangingSession0 != null) {
            rangingSession0.close();
        }
        kcu0.g = null;
        kcu0.b.a(Boolean.valueOf(false));
    }

    public final void onStarted(PersistableBundle persistableBundle0) {
        kdd kdd0 = this.a.p();
        this.b.a(kdd0);
        this.a.h.set(true);
        this.a.b.a(Boolean.valueOf(true));
    }

    public final void onStopFailed(int v, PersistableBundle persistableBundle0) {
        this.a.b.b(Boolean.valueOf(false));
    }

    public final void onStopped(int v, PersistableBundle persistableBundle0) {
        int v1 = kbr.a(v);
        kcu kcu0 = this.a;
        kdd kdd0 = kcu0.p();
        kcu0.q(new kcn(this, this.b, kdd0, v1));
        if(v1 == 4) {
            kbu kbu0 = kcu0.b;
            if(kbu0.d) {
                kbu0.a(Boolean.valueOf(true));
            }
        }
    }
}

