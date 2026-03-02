import android.media.AudioDeviceAttributes;
import android.media.AudioManager.MuteAwaitConnectionCallback;
import j..util.Objects;

public final class cyqs extends AudioManager.MuteAwaitConnectionCallback {
    final cyqr a;

    public cyqs(cyqt cyqt0, cyqr cyqr0) {
        this.a = cyqr0;
        Objects.requireNonNull(cyqt0);
        super();
    }

    public final void onMutedUntilConnection(AudioDeviceAttributes audioDeviceAttributes0, int[] arr_v) {
        super.onMutedUntilConnection(audioDeviceAttributes0, arr_v);
        ((ggtj)cyjh.a.d().ar(8044)).R("AudioManagerWrapper: onMutedUntilConnection called with usages %s, device=%s", arr_v, fgjo.c(audioDeviceAttributes0.getAddress()));
    }

    public final void onUnmutedEvent(int v, AudioDeviceAttributes audioDeviceAttributes0, int[] arr_v) {
        super.onUnmutedEvent(v, audioDeviceAttributes0, arr_v);
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == 1) {
                cust cust0 = cyjh.a;
                ((ggtj)cust0.d().ar(0x1F70)).z("AudioManagerWrapper: onUnmutedEvent called with unmuteEvent %d", v);
                if(v != 3) {
                    return;
                }
                cyqu cyqu0 = this.a.a;
                if(cyqu0.b != null && cyqu0.b.equals(audioDeviceAttributes0)) {
                    ((ggtj)cust0.d().ar(8050)).x("AudioManagerWrapper: onUnmutedEvent called but the cancel is called by us.");
                    cyqu0.b = null;
                    return;
                }
                if(cyqu0.c != null && cyqu0.c.equals(audioDeviceAttributes0)) {
                    cyqu0.c = null;
                    cyqu0.a.run();
                    return;
                }
                ((ggtj)cust0.d().ar(8049)).x("AudioManagerWrapper: onUnmutedEvent called with different candidate!");
                return;
            }
        }
        ((ggtj)cyjh.a.d().ar(8051)).x("AudioManagerWrapper: onUnmutedEvent called without USAGE_MEDIA");
    }
}

