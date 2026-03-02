import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import java.util.concurrent.atomic.AtomicReference;

public final class hm extends Binder implements ho {
    public final AtomicReference a;

    public hm() {
        this.attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    public hm(hx hx0) {
        this.attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(hx0);
    }

    @Override  // ho
    public final void a(hk hk0) {
        hx hx0 = (hx)this.a.get();
        if(hx0 == null) {
            return;
        }
        lvk lvk0 = new lvk(Binder.getCallingPid(), Binder.getCallingUid());
        hx0.d.register(hk0, lvk0);
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        int v6;
        if(v > 0 && v <= 0xFFFFFF) {
            parcel0.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if(v == 0x5F4E5446) {
            parcel1.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        int v2 = -1;
        PlaybackStateCompat playbackStateCompat0 = null;
        switch(v) {
            case 1: {
                parcel0.readString();
                Bundle bundle0 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                MediaSessionCompat.ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper0 = (MediaSessionCompat.ResultReceiverWrapper)hn.a(parcel0, MediaSessionCompat.ResultReceiverWrapper.CREATOR);
                throw new AssertionError();
            }
            case 2: {
                KeyEvent keyEvent0 = (KeyEvent)hn.a(parcel0, KeyEvent.CREATOR);
                throw new AssertionError();
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    playbackStateCompat0 = iInterface0 != null && (iInterface0 instanceof hk) ? ((hk)iInterface0) : new hh(iBinder0);
                }
                this.a(((hk)playbackStateCompat0));
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    playbackStateCompat0 = iInterface1 != null && (iInterface1 instanceof hk) ? ((hk)iInterface1) : new hh(iBinder1);
                }
                hx hx0 = (hx)this.a.get();
                if(hx0 != null) {
                    hx0.d.unregister(((IInterface)playbackStateCompat0));
                    Binder.getCallingPid();
                    Binder.getCallingUid();
                }
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                throw new AssertionError();
            }
            case 6: {
                throw new AssertionError();
            }
            case 7: {
                throw new AssertionError();
            }
            case 8: {
                throw new AssertionError();
            }
            case 9: {
                throw new AssertionError();
            }
            case 10: {
                throw new AssertionError();
            }
            case 11: {
                parcel0.readInt();
                parcel0.readInt();
                parcel0.readString();
                throw new AssertionError();
            }
            case 12: {
                parcel0.readInt();
                parcel0.readInt();
                parcel0.readString();
                throw new AssertionError();
            }
            case 13: {
                throw new AssertionError();
            }
            case 14: {
                parcel0.readString();
                Bundle bundle1 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                throw new AssertionError();
            }
            case 15: {
                parcel0.readString();
                Bundle bundle2 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                throw new AssertionError();
            }
            case 16: {
                Uri uri0 = (Uri)hn.a(parcel0, Uri.CREATOR);
                Bundle bundle3 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                throw new AssertionError();
            }
            case 17: {
                parcel0.readLong();
                throw new AssertionError();
            }
            case 18: {
                throw new AssertionError();
            }
            case 19: {
                throw new AssertionError();
            }
            case 20: {
                throw new AssertionError();
            }
            case 21: {
                throw new AssertionError();
            }
            case 22: {
                throw new AssertionError();
            }
            case 23: {
                throw new AssertionError();
            }
            case 24: {
                parcel0.readLong();
                throw new AssertionError();
            }
            case 25: {
                RatingCompat ratingCompat0 = (RatingCompat)hn.a(parcel0, RatingCompat.CREATOR);
                throw new AssertionError();
            }
            case 26: {
                parcel0.readString();
                Bundle bundle4 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                throw new AssertionError();
            }
            case 27: {
                throw new AssertionError();
            }
            case 28: {
                hx hx1 = (hx)this.a.get();
                if(hx1 != null) {
                    playbackStateCompat0 = hx1.e;
                    MediaMetadataCompat mediaMetadataCompat0 = hx1.f;
                    if(playbackStateCompat0 != null) {
                        long v3 = playbackStateCompat0.b;
                        long v4 = -1L;
                        if(v3 != -1L) {
                            int v5 = playbackStateCompat0.a;
                            switch(v5) {
                                case 3: 
                                case 4: {
                                    v6 = v5;
                                    goto label_93;
                                }
                                case 5: {
                                    v6 = 5;
                                label_93:
                                    long v7 = playbackStateCompat0.h;
                                    long v8 = 0L;
                                    if(v7 > 0L) {
                                        float f = playbackStateCompat0.d;
                                        long v9 = SystemClock.elapsedRealtime();
                                        if(mediaMetadataCompat0 != null) {
                                            Bundle bundle5 = mediaMetadataCompat0.b;
                                            if(bundle5.containsKey("android.media.metadata.DURATION")) {
                                                v4 = bundle5.getLong("android.media.metadata.DURATION", 0L);
                                            }
                                        }
                                        long v10 = ((long)(((float)(v9 - v7)) * f)) + v3;
                                        if(v4 >= 0L && v10 > v4) {
                                            v8 = v4;
                                        }
                                        else if(v10 >= 0L) {
                                            v8 = v10;
                                        }
                                        ih ih0 = new ih(playbackStateCompat0);
                                        ih0.c(v6, v8, f, v9);
                                        playbackStateCompat0 = ih0.a();
                                    }
                                }
                            }
                        }
                    }
                }
                parcel1.writeNoException();
                hn.b(parcel1, playbackStateCompat0);
                return true;
            }
            case 29: {
                parcel1.writeNoException();
                parcel1.writeInt(-1);
                return true;
            }
            case 30: {
                throw new AssertionError();
            }
            case 0x1F: {
                throw new AssertionError();
            }
            case 0x20: {
                hx hx2 = (hx)this.a.get();
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 33: {
                throw new AssertionError();
            }
            case 34: {
                parcel0.readString();
                Bundle bundle6 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                throw new AssertionError();
            }
            case 35: {
                parcel0.readString();
                Bundle bundle7 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                throw new AssertionError();
            }
            case 36: {
                Uri uri1 = (Uri)hn.a(parcel0, Uri.CREATOR);
                Bundle bundle8 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                throw new AssertionError();
            }
            case 37: {
                if(((hx)this.a.get()) != null) {
                    v2 = 0;
                }
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            case 38: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 39: {
                parcel0.readInt();
                throw new AssertionError();
            }
            case 40: {
                parcel0.readInt();
                parcel1.writeNoException();
                return true;
            }
            case 41: {
                MediaDescriptionCompat mediaDescriptionCompat0 = (MediaDescriptionCompat)hn.a(parcel0, MediaDescriptionCompat.CREATOR);
                throw new AssertionError();
            }
            case 42: {
                MediaDescriptionCompat mediaDescriptionCompat1 = (MediaDescriptionCompat)hn.a(parcel0, MediaDescriptionCompat.CREATOR);
                parcel0.readInt();
                throw new AssertionError();
            }
            case 43: {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat)hn.a(parcel0, MediaDescriptionCompat.CREATOR);
                throw new AssertionError();
            }
            case 44: {
                parcel0.readInt();
                throw new AssertionError();
            }
            case 45: {
                hx hx3 = (hx)this.a.get();
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 46: {
                parcel0.readInt();
                throw new AssertionError();
            }
            case 0x2F: {
                if(((hx)this.a.get()) != null) {
                    v2 = 0;
                }
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            case 0x30: {
                parcel0.readInt();
                throw new AssertionError();
            }
            case 49: {
                parcel0.readFloat();
                throw new AssertionError();
            }
            case 50: {
                hx hx4 = (hx)this.a.get();
                parcel1.writeNoException();
                hn.b(parcel1, null);
                return true;
            }
            case 51: {
                RatingCompat ratingCompat1 = (RatingCompat)hn.a(parcel0, RatingCompat.CREATOR);
                Bundle bundle9 = (Bundle)hn.a(parcel0, Bundle.CREATOR);
                throw new AssertionError();
            }
            default: {
                return super.onTransact(v, parcel0, parcel1, v1);
            }
        }
    }
}

