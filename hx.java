import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

public class hx {
    public final MediaSession a;
    final MediaSessionCompat.Token b;
    final Object c;
    public final RemoteCallbackList d;
    PlaybackStateCompat e;
    MediaMetadataCompat f;
    hw g;
    public final hm h;

    public hx(Context context0) {
        this.c = new Object();
        this.d = new RemoteCallbackList();
        MediaSession mediaSession0 = this.c(context0);
        this.a = mediaSession0;
        hm hm0 = new hm(this);
        this.h = hm0;
        this.b = new MediaSessionCompat.Token(mediaSession0.getSessionToken(), hm0);
        mediaSession0.setFlags(3);
    }

    public final hw a() {
        synchronized(this.c) {
        }
        return this.g;
    }

    public final void b(hw hw0, Handler handler0) {
        synchronized(this.c) {
            this.g = hw0;
            hu hu0 = null;
            this.a.setCallback((hw0 == null ? null : hw0.b), handler0);
            if(hw0 != null) {
                synchronized(hw0.a) {
                    hw0.c = new WeakReference(this);
                    hu hu1 = hw0.d;
                    if(hu1 != null) {
                        hu1.removeCallbacksAndMessages(null);
                    }
                    if(handler0 != null) {
                        hu0 = new hu(hw0, handler0.getLooper());
                    }
                    hw0.d = hu0;
                }
            }
        }
    }

    public MediaSession c(Context context0) {
        return new MediaSession(context0, "cast_rcn_media_session");
    }

    public void d() {
        synchronized(this.c) {
        }
    }
}

