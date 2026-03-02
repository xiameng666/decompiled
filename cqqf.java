import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.Settings.System;
import com.google.android.gms.mdm.util.BaseDeviceRinger.1;
import com.google.android.gms.mdm.util.BaseDeviceRinger.3;
import java.io.IOException;
import java.util.logging.Level;
import jeb.synthetic.TWR;

public final class cqqf implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    public final AudioManager a;
    public MediaPlayer b;
    public cqqe c;
    public cqqc d;
    public final MediaRouter e;
    public final Runnable f;
    public final BroadcastReceiver g;
    public int h;
    public int i;
    public MediaRouter.RouteInfo j;
    public final cqqd k;
    protected final String l;
    public final Context m;
    private static final bboh n;
    private static final IntentFilter o;
    private static final int[] p;

    static {
        cqqf.n = bboh.a("MDM");
        cqqf.o = new BaseDeviceRinger.1();
        cqqf.p = new int[]{1, 4, 2};
    }

    public cqqf(Context context0, cqqd cqqd0, String s) {
        this.f = new cqqb(this);
        BaseDeviceRinger.3 baseDeviceRinger$30 = new BaseDeviceRinger.3(this);
        this.g = baseDeviceRinger$30;
        this.h = -1;
        this.i = -1;
        this.j = null;
        this.m = context0;
        this.k = cqqd0;
        this.l = s;
        this.a = (AudioManager)context0.getSystemService("audio");
        jwe.b(context0, baseDeviceRinger$30, cqqf.o, 2);
        this.e = (MediaRouter)context0.getSystemService("media_router");
    }

    protected final boolean a() {
        Cursor cursor0;
        if(!fhcd.g(this.m)) {
            try {
                RingtoneManager ringtoneManager0 = new RingtoneManager(this.m);
                cursor0 = null;
                cursor0 = ringtoneManager0.getCursor();
                int v = 0;
                while(true) {
                    if(v >= cursor0.getCount()) {
                        goto label_17;
                    }
                    cursor0.moveToPosition(v);
                    if("Orion".equals(cursor0.getString(1)) && this.b(ringtoneManager0.getRingtoneUri(v))) {
                        break;
                    }
                    ++v;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
            return true;
        label_17:
            cursor0.close();
        }
        else if(this.b(Settings.System.DEFAULT_RINGTONE_URI)) {
            return true;
        }
        int[] arr_v = cqqf.p;
        for(int v1 = 0; v1 < 3; ++v1) {
            if(this.b(RingtoneManager.getActualDefaultRingtoneUri(this.m, arr_v[v1]))) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(Uri uri0) {
        if(uri0 != null) {
            try {
                if(!fhcd.g(this.m)) {
                    uri0 = MediaStore.getRedactedUri(this.m.getContentResolver(), uri0);
                }
                this.b.setDataSource(this.m, uri0);
                return true;
            }
            catch(RuntimeException | IOException exception0) {
                ((ggtj)cqqf.n.g(Level.SEVERE).s(exception0)).x("Failed to retrieve requested ringtone");
                this.b.reset();
            }
        }
        return false;
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        cqqt.a("Error playing ringtone, what: %s extra: %s", new Object[]{v, v1});
        this.k.c();
        return true;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        try {
            mediaPlayer0.start();
        }
        catch(IllegalStateException unused_ex) {
            cqqt.a("Error starting playing ringtone.", new Object[0]);
            this.k.c();
        }
    }
}

