import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri.Builder;
import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.wearable.MessageOptions;

public final class fcfe extends azts {
    final fdjo a;

    public fcfe(Context context0, aztr_settings aztr0) {
        super(context0, fcfo.a, fcfn.a, aztr0);
        this.a = new fdjo();
    }

    public final evql e(fcfd fcfd0, IntentFilter[] arr_intentFilter) {
        azyf azyf0 = azyg.b(fcfd0, this.B, "RequestListener");
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new fdjq(fcfd0, azyf0, arr_intentFilter);
        azyq0.b = new fdjr(fcfd0);
        azyq0.e = 24017;
        return this.iH(azyq0.a());
    }

    public final evql f(fcfd fcfd0, String s, String s1) {
        return this.e(fcfd0, new IntentFilter[]{fdlk.b("com.google.android.gms.wearable.REQUEST_RECEIVED", new Uri.Builder().scheme("wear").authority(s1).path(s).build(), 1)});
    }

    public final evql g(fcfd fcfd0) {
        azyd_linstner azyd0 = azyg.b(fcfd0, this.B, "RequestListener").listener_;
        kay.j(azyd0, "Key must not be null");
        return this.jm(azyd0, 24008);
    }

    public final evql h(String s, String s1, byte[] arr_b) {
        return batf.b(this.a.a(this.D, s, s1, arr_b), new fdjp());
    }

    public final evql i(String s, String s1, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new fdjt(this, s, s1, arr_b);
        azzc0.d = 24006;
        return this.iG(azzc0.a());
    }

    public final evql j(String s, String s1, byte[] arr_b, MessageOptions messageOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new fdju(this, s, s1, arr_b, messageOptions0);
        azzc0.d = 24006;
        azzc0.c = new Feature[]{fcfa.x};
        return this.iG(azzc0.a());
    }

    public final void k(fcfc fcfc0) {
        this.n(fcfc0, new IntentFilter[]{fdlk.a("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    public final evql l(fcfc fcfc0, Uri uri0) {
        kay.j(uri0, "uri must not be null");
        return this.n(fcfc0, new IntentFilter[]{fdlk.b("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri0, 0)});
    }

    public final void m(fcfc fcfc0) {
        azyd_linstner azyd0 = azyg.b(fcfc0, this.B, "MessageListener").listener_;
        kay.j(azyd0, "Key must not be null");
        this.jm(azyd0, 24007);
    }

    private final evql n(fcfc fcfc0, IntentFilter[] arr_intentFilter) {
        azyf azyf0 = azyg.b(fcfc0, this.B, "MessageListener");
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new fdjv(fcfc0, azyf0, arr_intentFilter);
        azyq0.b = new fdjw(fcfc0);
        azyq0.e = 0x5DD0;
        return this.iH(azyq0.a());
    }
}

