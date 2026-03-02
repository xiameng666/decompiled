import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SassProcessChimeraActivity;
import j..util.Objects;

public final class cypg extends AudioDeviceCallback {
    final SassProcessChimeraActivity a;

    public cypg(SassProcessChimeraActivity sassProcessChimeraActivity0) {
        Objects.requireNonNull(sassProcessChimeraActivity0);
        this.a = sassProcessChimeraActivity0;
        super();
    }

    @Override  // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] arr_audioDeviceInfo) {
        super.onAudioDevicesAdded(arr_audioDeviceInfo);
        SassProcessChimeraActivity sassProcessChimeraActivity0 = this.a;
        if(sassProcessChimeraActivity0.a()) {
            ((ggtj)cyjh.a.d().ar(7980)).x("SassProcessChimeraActivity: onAudioDevicesAdded callback received and bt headset connected.");
            if(!sassProcessChimeraActivity0.isFinishing()) {
                sassProcessChimeraActivity0.finish();
            }
        }
    }
}

