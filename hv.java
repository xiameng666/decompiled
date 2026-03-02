import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession.Callback;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

final class hv extends MediaSession.Callback {
    final hw a;

    public hv(hw hw0) {
        this.a = hw0;
        super();
    }

    private final hx a() {
        hx hx0;
        synchronized(this.a.a) {
            hx0 = (hx)this.a.c.get();
        }
        if(hx0 != null) {
            hw hw0 = hx0.a();
            return this.a == hw0 ? hx0 : null;
        }
        return null;
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onCommand(String s, Bundle bundle0, ResultReceiver resultReceiver0) {
        pcg pcg0;
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        ie.c(bundle0);
        try {
            if(s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle1 = new Bundle();
                ho ho0 = hx0.b.a();
                bundle1.putBinder("android.support.v4.media.session.EXTRA_BINDER", (ho0 == null ? null : ho0.asBinder()));
                synchronized(hx0.b.a) {
                    pcg0 = hx0.b.d;
                }
                if(pcg0 == null) {
                    bundle1.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
                }
                else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("a", new ParcelImpl(pcg0));
                    bundle1.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
                }
                resultReceiver0.send(0, bundle1);
            }
            else if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat)bundle0.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
            }
            else if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                MediaDescriptionCompat mediaDescriptionCompat0 = (MediaDescriptionCompat)bundle0.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                bundle0.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            }
            else if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                MediaDescriptionCompat mediaDescriptionCompat1 = (MediaDescriptionCompat)bundle0.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
            }
        }
        catch(BadParcelableException unused_ex) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onCustomAction(String s, Bundle bundle0) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        ie.c(bundle0);
        try {
            if(s.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                Uri uri0 = (Uri)bundle0.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                ie.c(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            }
            else if(!s.equals("android.support.v4.media.session.action.PREPARE")) {
                if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle0.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    ie.c(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                }
                else if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle0.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    ie.c(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                }
                else if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    Uri uri1 = (Uri)bundle0.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    ie.c(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                }
                else if(s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle0.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
                else if(s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle0.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                }
                else if(s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle0.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                }
                else if(s.equals("android.support.v4.media.session.action.SET_RATING")) {
                    RatingCompat ratingCompat0 = (RatingCompat)bundle0.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    ie.c(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                }
                else if(s.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle0.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                }
                else {
                    this.a.g(s);
                }
            }
        }
        catch(BadParcelableException unused_ex) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onFastForward() {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final boolean onMediaButtonEvent(Intent intent0) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return false;
        }
        hx0.d();
        return this.a.f(intent0) || super.onMediaButtonEvent(intent0);
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPause() {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        this.a.a();
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPlay() {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        this.a.b();
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPlayFromMediaId(String s, Bundle bundle0) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        ie.c(bundle0);
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPlayFromSearch(String s, Bundle bundle0) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        ie.c(bundle0);
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPlayFromUri(Uri uri0, Bundle bundle0) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        ie.c(bundle0);
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPrepare() {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPrepareFromMediaId(String s, Bundle bundle0) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        ie.c(bundle0);
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPrepareFromSearch(String s, Bundle bundle0) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        ie.c(bundle0);
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onPrepareFromUri(Uri uri0, Bundle bundle0) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        ie.c(bundle0);
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onRewind() {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onSeekTo(long v) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        this.a.c(v);
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onSetPlaybackSpeed(float f) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onSetRating(Rating rating0) {
        float f2;
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        if(rating0 != null) {
            int v = rating0.getRatingStyle();
            RatingCompat ratingCompat0 = null;
            if(rating0.isRated()) {
                float f = 1.0f;
                switch(v) {
                    case 1: {
                        if(!rating0.hasHeart()) {
                            f = 0.0f;
                        }
                        new RatingCompat(1, f).a = rating0;
                        break;
                    }
                    case 2: {
                        if(!rating0.isThumbUp()) {
                            f = 0.0f;
                        }
                        new RatingCompat(2, f).a = rating0;
                        break;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        float f1 = rating0.getStarRating();
                        switch(v) {
                            case 3: {
                                f2 = 3.0f;
                                goto label_27;
                            }
                            case 4: {
                                f2 = 4.0f;
                                goto label_27;
                            }
                            case 5: {
                                f2 = 5.0f;
                            label_27:
                                if(f1 >= 0.0f && f1 <= f2) {
                                    ratingCompat0 = new RatingCompat(v, f1);
                                }
                                else {
                                    Log.e("Rating", "Trying to set out of range star-based rating");
                                }
                                goto label_41;
                            }
                            default: {
                                Log.e("Rating", a.f(v, "Invalid rating style (", ") for a star rating"));
                                goto label_41;
                            }
                        }
                    }
                    case 6: {
                        float f3 = rating0.getPercentRating();
                        if(f3 >= 0.0f && f3 <= 100.0f) {
                            ratingCompat0 = new RatingCompat(6, f3);
                        }
                        else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        goto label_41;
                    }
                }
            }
            else {
                switch(v) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: {
                        ratingCompat0 = new RatingCompat(v, -1.0f);
                    }
                }
            label_41:
                ratingCompat0.a = rating0;
            }
        }
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onSkipToNext() {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        this.a.d();
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onSkipToPrevious() {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        this.a.e();
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onSkipToQueueItem(long v) {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        hx0.d();
    }

    @Override  // android.media.session.MediaSession$Callback
    public final void onStop() {
        hx hx0 = this.a();
        if(hx0 == null) {
            return;
        }
        hx0.d();
    }
}

