import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata.Builder;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState.Builder;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;

@Deprecated
public final class ie {
    static int a;
    public final hx b;
    private final ArrayList c;

    public ie(Context context0, ComponentName componentName0, PendingIntent pendingIntent0) {
        this.c = new ArrayList();
        if(context0 == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if(TextUtils.isEmpty("cast_rcn_media_session")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if(pendingIntent0 == null) {
            Intent intent0 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent0.setComponent(componentName0);
            pendingIntent0 = PendingIntent.getBroadcast(context0, 0, intent0, 0x2000000);
        }
        hz hz0 = new hz(context0);
        this.b = hz0;
        Handler handler0 = new Handler((Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper()));
        this.e(new ht(), handler0);
        hz0.a.setMediaButtonReceiver(pendingIntent0);
        MediaSessionCompat.Token mediaSessionCompat$Token0 = this.b();
        if(mediaSessionCompat$Token0 == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        DesugarCollections.synchronizedSet(new HashSet());
        new hs(context0, mediaSessionCompat$Token0);
        if(ie.a == 0) {
            ie.a = (int)(TypedValue.applyDimension(1, 320.0f, context0.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static Bundle a(Bundle bundle0) {
        if(bundle0 == null) {
            return null;
        }
        ie.c(bundle0);
        return bundle0;
    }

    public final MediaSessionCompat.Token b() {
        return this.b.b;
    }

    public static void c(Bundle bundle0) {
        if(bundle0 != null) {
            bundle0.setClassLoader(ie.class.getClassLoader());
        }
    }

    public final void d(boolean z) {
        this.b.a.setActive(z);
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ia)arrayList0.get(v1)).a();
        }
    }

    public final void e(hw hw0, Handler handler0) {
        hx hx0 = this.b;
        if(hw0 == null) {
            hx0.b(null, null);
            return;
        }
        if(handler0 == null) {
            handler0 = new Handler();
        }
        hx0.b(hw0, handler0);
    }

    public final void f(MediaMetadataCompat mediaMetadataCompat0) {
        hx hx0 = this.b;
        hx0.f = mediaMetadataCompat0;
        if(mediaMetadataCompat0.c == null) {
            MediaMetadata.Builder mediaMetadata$Builder0 = new MediaMetadata.Builder();
            Bundle bundle0 = mediaMetadataCompat0.b;
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Integer integer0 = (Integer)MediaMetadataCompat.a.get(s);
                if(integer0 == null) {
                    integer0 = (int)-1;
                }
                switch(((int)integer0)) {
                    case 0: {
                        mediaMetadata$Builder0.putLong(s, bundle0.getLong(s, 0L));
                        break;
                    }
                    case 1: {
                        mediaMetadata$Builder0.putText(s, bundle0.getCharSequence(s));
                        break;
                    }
                    case 2: {
                        mediaMetadata$Builder0.putBitmap(s, ((Bitmap)bundle0.getParcelable(s)));
                        break;
                    }
                    case 3: {
                        mediaMetadata$Builder0.putRating(s, ((Rating)bundle0.getParcelable(s)));
                        break;
                    }
                    default: {
                        Object object1 = bundle0.get(s);
                        if(object1 != null && !(object1 instanceof CharSequence)) {
                            if((object1 instanceof Long)) {
                                mediaMetadata$Builder0.putLong(s, ((Long)object1).longValue());
                            }
                            else if((object1 instanceof Bitmap)) {
                                mediaMetadata$Builder0.putBitmap(s, ((Bitmap)object1));
                            }
                            else {
                                if(!(object1 instanceof Rating)) {
                                    continue;
                                }
                                mediaMetadata$Builder0.putRating(s, ((Rating)object1));
                            }
                            continue;
                        }
                        else {
                            mediaMetadata$Builder0.putText(s, ((CharSequence)object1));
                            break;
                        }
                        mediaMetadata$Builder0.putLong(s, bundle0.getLong(s, 0L));
                        break;
                    }
                }
            }
            mediaMetadataCompat0.c = mediaMetadata$Builder0.build();
        }
        hx0.a.setMetadata(mediaMetadataCompat0.c);
    }

    public final void g(PlaybackStateCompat playbackStateCompat0) {
        MediaSession mediaSession0;
        hx hx0 = this.b;
        hx0.e = playbackStateCompat0;
        synchronized(hx0.c) {
            RemoteCallbackList remoteCallbackList0 = hx0.d;
            int v = remoteCallbackList0.beginBroadcast();
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                hk hk0 = (hk)remoteCallbackList0.getBroadcastItem(v);
                try {
                    hk0.a(playbackStateCompat0);
                }
                catch(RemoteException unused_ex) {
                }
            }
            hx0.d.finishBroadcast();
            mediaSession0 = hx0.a;
        }
        if(playbackStateCompat0.l == null) {
            PlaybackState.Builder playbackState$Builder0 = new PlaybackState.Builder();
            playbackState$Builder0.setState(playbackStateCompat0.a, playbackStateCompat0.b, playbackStateCompat0.d, playbackStateCompat0.h);
            playbackState$Builder0.setBufferedPosition(playbackStateCompat0.c);
            playbackState$Builder0.setActions(playbackStateCompat0.e);
            playbackState$Builder0.setErrorMessage(playbackStateCompat0.g);
            for(Object object1: playbackStateCompat0.i) {
                PlaybackStateCompat.CustomAction playbackStateCompat$CustomAction0 = (PlaybackStateCompat.CustomAction)object1;
                PlaybackState.CustomAction playbackState$CustomAction0 = playbackStateCompat$CustomAction0.e;
                if(playbackState$CustomAction0 == null) {
                    PlaybackState.CustomAction.Builder playbackState$CustomAction$Builder0 = new PlaybackState.CustomAction.Builder(playbackStateCompat$CustomAction0.a, playbackStateCompat$CustomAction0.b, playbackStateCompat$CustomAction0.c);
                    playbackState$CustomAction$Builder0.setExtras(playbackStateCompat$CustomAction0.d);
                    playbackState$CustomAction0 = playbackState$CustomAction$Builder0.build();
                }
                playbackState$Builder0.addCustomAction(playbackState$CustomAction0);
            }
            playbackState$Builder0.setActiveQueueItemId(playbackStateCompat0.j);
            playbackState$Builder0.setExtras(playbackStateCompat0.k);
            playbackStateCompat0.l = playbackState$Builder0.build();
        }
        mediaSession0.setPlaybackState(playbackStateCompat0.l);
    }
}

