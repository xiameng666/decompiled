import android.media.AudioRecord.Builder;
import android.os.SystemClock;
import j..util.Objects;
import java.util.Locale;

final class fvop implements Runnable {
    final int a;
    final fvor b;

    public fvop(fvor fvor0, int v) {
        this.a = v;
        Objects.requireNonNull(fvor0);
        this.b = fvor0;
        super();
    }

    @Override
    public final void run() {
        fvor fvor0 = this.b;
        int v = this.a;
        while(fvor.a) {
            try {
                fvor.b = new AudioRecord.Builder().setAudioSource(fvor0.d()).setAudioFormat(fvor0.g()).setBufferSizeInBytes(v).setContext(fvor0.d).build();
                if(fvor.b.getState() != 0) {
                    fvor.b.startRecording();
                    if(fvor.b.getRecordingState() == 1) {
                        fvor.b.release();
                    }
                    else {
                        goto label_11;
                    }
                }
            }
            catch(IllegalStateException unused_ex) {
                fvor.b.release();
            }
            goto label_28;
        label_11:
            long v1 = SystemClock.elapsedRealtime();
            int v2 = fvor.b.getChannelCount();
            int v3 = fvor.b.getBufferSizeInFrames();
            int v4 = fvor0.d();
            int v5 = fvor0.f();
            fvlm fvlm0 = new fvlm(fvor0.m, v4, v5, v2);
            fvor0.m.post(fvlm0);
            if(fvor.b.getRoutedDevice() != null) {
                Locale.getDefault();
                fvor.b.getRoutedDevice().getProductName();
                fvor.b.getRoutedDevice().getType();
            }
            boolean z = fvor0.h(v3, v2, v1);
            if(z) {
                try {
                    fvor.b.stop();
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            fvor.b.release();
            fvor.b = null;
            if(!z) {
            label_28:
                Locale.getDefault();
                try {
                    Thread.sleep(1000L);
                }
                catch(InterruptedException unused_ex) {
                }
            }
        }
    }
}

