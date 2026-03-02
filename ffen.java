import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import j..util.Objects;

final class ffen extends ffgn {
    final ChannelEventParcelable a;
    final fdrq b;
    final String c;
    final String d;
    final int e;
    final int f;

    public ffen(ffep ffep0, String s, Intent intent0, ChannelEventParcelable channelEventParcelable0, fdrq fdrq0, String s1, String s2, int v, int v1) {
        this.a = channelEventParcelable0;
        this.b = fdrq0;
        this.c = s1;
        this.d = s2;
        this.e = v;
        this.f = v1;
        Objects.requireNonNull(ffep0);
        super(s, intent0);
    }

    @Override  // ffgn
    public final String a() {
        return "token=" + this.b.toString() + ", path=" + this.c + ", nodeId=" + this.d + ", closeReason=" + this.e + ", appErrorCode=" + this.f;
    }

    @Override  // ffgn
    public final void b(fffu fffu0, fdjb fdjb0) {
        fdjb0.a(this.a);
    }

    @Override  // ffgn
    public final boolean c() {
        return true;
    }

    @Override  // ffgn
    public final boolean d(IntentFilter[] arr_intentFilter, boolean z, String s, String s1) {
        return s == null ? super.d(arr_intentFilter, z, null, s1) : s.equals(this.a.a.a);
    }
}

