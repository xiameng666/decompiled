import android.media.AudioAttributes.Builder;
import android.media.AudioDeviceInfo;
import android.media.MediaRouter.RouteInfo;
import j..util.Objects;

public final class cqqi extends cqqc {
    final cqqf a;

    public cqqi(cqqf cqqf0) {
        Objects.requireNonNull(cqqf0);
        this.a = cqqf0;
        super();
    }

    @Override  // cqqc
    protected final void a(Boolean boolean0) {
        boolean z = boolean0.booleanValue();
        cqqt.c("Starting ringer [useRingtone=%s]", new Object[]{boolean0});
        cqqf cqqf0 = this.a;
        cqqf0.h = cqqf0.a.getStreamVolume(4);
        bayn bayn0 = bayn.f(cqqf0.m);
        int v = bayn0 == null ? 0 : bayn0.a();
        if(v == 0 || v == 3) {
            int v1 = cqqf0.a.getRingerMode();
            cqqf0.i = v1;
            if(v1 != 2) {
                try {
                    cqqf0.a.setRingerMode(2);
                }
                catch(SecurityException unused_ex) {
                    cqig cqig0 = cqia.a();
                    boolean z1 = cqqg.a(cqqf0.m);
                    cqig0.a(new hltz[]{hltz.w}, null, null, null, cqqf0.l, null, z1);
                }
            }
        }
        try {
            int v2 = cqqf0.a.getStreamMaxVolume(4);
            cqqf0.a.setStreamVolume(4, v2, 0);
        }
        catch(SecurityException unused_ex) {
            cqqt.d("Could not set stream volume", new Object[0]);
        }
        cqqf0.j = cqqf0.e.getSelectedRoute(1);
        MediaRouter.RouteInfo mediaRouter$RouteInfo0 = cqqf0.e.getDefaultRoute();
        cqqf0.e.selectRoute(1, mediaRouter$RouteInfo0);
        if(z) {
            try {
                cqqf0.b.setOnErrorListener(cqqf0);
                cqqf0.b.setOnPreparedListener(cqqf0);
                AudioDeviceInfo[] arr_audioDeviceInfo = cqqf0.a.getDevices(2);
                AudioDeviceInfo audioDeviceInfo0 = null;
                for(int v3 = 0; v3 < arr_audioDeviceInfo.length; ++v3) {
                    AudioDeviceInfo audioDeviceInfo1 = arr_audioDeviceInfo[v3];
                    if(audioDeviceInfo1.getType() == 2) {
                        audioDeviceInfo0 = audioDeviceInfo1;
                    }
                    if(audioDeviceInfo1.getType() == 24) {
                        audioDeviceInfo0 = audioDeviceInfo1;
                        break;
                    }
                }
                cqqf0.b.setPreferredDevice(audioDeviceInfo0);
                AudioAttributes.Builder audioAttributes$Builder0 = new AudioAttributes.Builder();
                audioAttributes$Builder0.setUsage(4);
                audioAttributes$Builder0.setContentType(2).setFlags(0xC1);
                cqqf0.b.setAudioAttributes(audioAttributes$Builder0.build());
                cqqf0.b.setLooping(true);
                cqqf0.b.prepareAsync();
            }
            catch(IllegalStateException unused_ex) {
                cqqt.a("Error preparing ringtone.", new Object[0]);
                cqqf0.k.c();
            }
        }
        else {
            cqqf0.c = new cqqe();
            cqqf0.c.start();
        }
        new clht().postDelayed(this.a.f, 300000L);
    }

    @Override  // cqqc
    protected final Boolean b() {
        if(hxwi.a.c().j()) {
            try {
                return Boolean.valueOf(this.a.a());
            }
            catch(RuntimeException runtimeException0) {
                cqqt.b(runtimeException0, "Exception while setting the ringtone.", new Object[0]);
                throw runtimeException0;
            }
        }
        return Boolean.valueOf(this.a.a());
    }

    @Override  // cqqc
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        return this.b();
    }

    @Override  // cqqc
    protected final void onPostExecute(Object object0) {
        this.a(((Boolean)object0));
    }
}

