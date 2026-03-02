import android.content.Context;
import com.google.android.gmscore.integ.modules.nearby.src.jni.webrtc.NearbyAudioDecoderFactoryFactory;
import com.google.android.gmscore.integ.modules.nearby.src.jni.webrtc.NearbyAudioEncoderFactoryFactory;
import j..time.Duration;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.DataChannel;
import org.webrtc.PeerConnection.AdapterType;
import org.webrtc.PeerConnection.PeerConnectionState;
import org.webrtc.PeerConnection.RTCConfiguration;
import org.webrtc.PeerConnection.SdpSemantics;
import org.webrtc.PeerConnection.SignalingState;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory.Options;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SessionDescription.Type;
import org.webrtc.SessionDescription;

public final class czyo {
    static PeerConnectionFactory a;
    public final Context b;
    public final PeerConnection c;
    public boolean d;
    public final AtomicReference e;
    public final czys f;
    final czyp g;
    czyt h;
    public final Executor i;
    public final czos j;
    private static final AtomicBoolean k;
    private static NearbyAudioEncoderFactoryFactory l;
    private static NearbyAudioDecoderFactoryFactory m;
    private boolean n;
    private final boolean o;
    private final Executor p;
    private final czza q;
    private int r;

    static {
        czyo.k = new AtomicBoolean(true);
    }

    private czyo(Context context0, czys czys0, czyp czyp0, List list0, Executor executor0, Executor executor1, boolean z, czos czos0, czyt czyt0, boolean z1) {
        this.d = false;
        this.n = false;
        this.e = new AtomicReference(PeerConnection.AdapterType.a);
        this.q = new czza();
        this.b = context0;
        this.g = czyp0;
        PeerConnection.RTCConfiguration peerConnection$RTCConfiguration0 = new PeerConnection.RTCConfiguration(list0);
        peerConnection$RTCConfiguration0.q = PeerConnection.SdpSemantics.b;
        if(hvog.aa() != -1L) {
            peerConnection$RTCConfiguration0.g = (int)hvog.aa();
        }
        if(hvog.Y() != -1L) {
            peerConnection$RTCConfiguration0.k = (int)hvog.Y();
        }
        if(hvog.Z() != -1L) {
            peerConnection$RTCConfiguration0.l = (int)hvog.Z();
        }
        if(hvog.ab() != -1L) {
            peerConnection$RTCConfiguration0.n = (int)hvog.ab();
        }
        if(hvog.ac() != -1L) {
            peerConnection$RTCConfiguration0.m = (int)hvog.ac();
        }
        peerConnection$RTCConfiguration0.o = true;
        czym czym0 = new czym(this);
        PeerConnection peerConnection0 = czyo.k(context0, z).a(peerConnection$RTCConfiguration0, czym0);
        if(peerConnection0 == null) {
            throw new IllegalStateException();
        }
        this.c = peerConnection0;
        this.r = 1;
        this.f = czys0;
        this.i = executor0;
        this.p = executor1;
        this.j = czos0;
        this.h = czyt0;
        this.o = z1;
    }

    public final void a() {
        synchronized(this) {
            if(this.c.nativeConnectionState() != PeerConnection.PeerConnectionState.c) {
                this.f();
            }
        }
    }

    public final void b(Runnable runnable0) {
        this.p.execute(runnable0);
    }

    public final void c(SessionDescription sessionDescription0) {
        boolean z = true;
        synchronized(this) {
            boolean z1 = !this.d && (this.c.nativeSignalingState() == PeerConnection.SignalingState.a || this.n);
            SessionDescription.Type sessionDescription$Type0 = sessionDescription0.a;
            boolean z2 = sessionDescription$Type0 == SessionDescription.Type.a && !z1;
            boolean z3 = !this.o && z2;
            cunf cunf0 = czkq.a;
            cunf0.b().k("Received WebRTC session description, type=%s, readyForOffer=%s, offerCollision=%s, ignoreOffer=%s", sessionDescription$Type0, Boolean.valueOf(z1), Boolean.valueOf(z2), Boolean.valueOf(z3));
            if(z3) {
                cunf0.b().p("Ignoring WebRTC offer due to a collison", new Object[0]);
                return;
            }
            if(sessionDescription$Type0 != SessionDescription.Type.c) {
                z = false;
            }
            this.n = z;
            this.b(new czyc(this, sessionDescription0));
        }
    }

    public final void d(PeerConnection.PeerConnectionState peerConnection$PeerConnectionState0) {
        synchronized(this) {
            if(peerConnection$PeerConnectionState0 == PeerConnection.PeerConnectionState.c && hvol.aN()) {
                Duration duration0 = Duration.ofSeconds(hvog.W());
                this.q.b(this.c, duration0, Boolean.valueOf(true));
            }
            if(peerConnection$PeerConnectionState0 == PeerConnection.PeerConnectionState.f || peerConnection$PeerConnectionState0 == PeerConnection.PeerConnectionState.e || peerConnection$PeerConnectionState0 == PeerConnection.PeerConnectionState.d) {
                this.f();
                if(hvol.aN()) {
                    this.q.a();
                }
            }
        }
    }

    static void e(czyo czyo0) {
        czyo0.n = false;
    }

    public final void f() {
        synchronized(this) {
            if(this.r == 2) {
                return;
            }
            this.r = 2;
            this.b(new czyh(this));
            czkq.a.b().p("Closed WebRTC connection.", new Object[0]);
        }
    }

    public final void g() {
        synchronized(this) {
            DataChannel dataChannel0 = (DataChannel)cuuc.h("createDataChannel", jqy.a(new czyd(this)), hvog.aH());
            if(dataChannel0 != null) {
                this.h(dataChannel0);
            }
        }
    }

    final void h(DataChannel dataChannel0) {
        gfsx gfsx0 = this.g.a(dataChannel0).a;
        czze czze0 = gfsx0.i() ? ((czze)gfsx0.d()) : null;
        if(czze0 == null) {
            return;
        }
        czze0.k = new czyn(this);
    }

    public final void i(List list0) {
        synchronized(this) {
            if(this.r == 2) {
                czkq.a.e().p("You cannot add ice candidates to a disconnected session.", new Object[0]);
                return;
            }
            if(((Boolean)cuuc.h("onRemoteIceCandidatesReceived", jqy.a(new czyf(this, list0)), hvog.aH())) != null) {
            }
        }
    }

    public static czle j(Context context0, String s, czys czys0, czyp czyp0, List list0, Executor executor0, Executor executor1, String s1, boolean z, czos czos0, czyt czyt0, boolean z1) {
        try {
            return new czle(new czyo(context0, czys0, czyp0, list0, executor0, executor1, z, czos0, czyt0, z1), gyxo.b);
        }
        catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            czkq.a.e().f(unsatisfiedLinkError0).p("Failed to load jingle_peerconnection_so.", new Object[0]);
            czke.b(new cvae(s, 4, s1), gymt.f, gymd.bv, null);
            return new czle(gyxo.db);
        }
        catch(IllegalStateException illegalStateException0) {
            czkq.a.c().f(illegalStateException0).p("Failed to create a PeerConnection.", new Object[0]);
            return new czle(gyxo.eb);
        }
    }

    private static PeerConnectionFactory k(Context context0, boolean z) {
        synchronized(czyo.class) {
            if(czyo.a != null) {
                AtomicBoolean atomicBoolean0 = czyo.k;
                if(atomicBoolean0.get() != z) {
                    PeerConnectionFactory peerConnectionFactory0 = czyo.a;
                    batl.s(peerConnectionFactory0);
                    peerConnectionFactory0.c();
                    czyo.a = null;
                    czkq.a.b().i("Disposed peerConnectionFactory because isCellularAllowed has changed from %b to %b.", atomicBoolean0, Boolean.valueOf(z));
                }
            }
            if(czyo.a == null) {
                PeerConnectionFactory.d(new igso(context0));
                if(czyo.l == null) {
                    czyo.l = NearbyAudioEncoderFactoryFactory.b();
                }
                if(czyo.m == null) {
                    czyo.m = new NearbyAudioDecoderFactoryFactory();
                }
                PeerConnectionFactory.Options peerConnectionFactory$Options0 = new PeerConnectionFactory.Options();
                if(!z) {
                    peerConnectionFactory$Options0.a = 4;
                }
                czyo.k.set(z);
                igsn igsn0 = new igsn();
                igsn0.c(czyo.l);
                igsn0.b(czyo.m);
                igsn0.a = peerConnectionFactory$Options0;
                czyo.a = igsn0.a();
            }
        }
        return czyo.a;
    }
}

