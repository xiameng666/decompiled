import android.content.Context;
import com.google.android.gmscore.integ.modules.nearby.src.jni.webrtc.NearbyAudioDecoderFactoryFactory;
import com.google.android.gmscore.integ.modules.nearby.src.jni.webrtc.NearbyAudioEncoderFactoryFactory;
import j..time.Duration;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.DataChannel;
import org.webrtc.PeerConnection.AdapterType;
import org.webrtc.PeerConnection.PeerConnectionState;
import org.webrtc.PeerConnection.RTCConfiguration;
import org.webrtc.PeerConnection.SdpSemantics;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory.Options;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SessionDescription;

public final class czyb {
    static PeerConnectionFactory a;
    public final Context b;
    public final String c;
    public final PeerConnection d;
    public final AtomicReference e;
    public final czys f;
    final czyp g;
    public final Executor h;
    public final czno i;
    private static final AtomicBoolean j;
    private static NearbyAudioEncoderFactoryFactory k;
    private static NearbyAudioDecoderFactoryFactory l;
    private czya m;
    private final Executor n;
    private final czza o;

    static {
        czyb.j = new AtomicBoolean(true);
    }

    private czyb(Context context0, String s, czys czys0, czyp czyp0, List list0, Executor executor0, Executor executor1, boolean z, czno czno0) {
        this.e = new AtomicReference(PeerConnection.AdapterType.a);
        this.o = new czza();
        this.b = context0;
        this.c = s;
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
        czxy czxy0 = new czxy(this);
        PeerConnection peerConnection0 = czyb.o(context0, z).a(peerConnection$RTCConfiguration0, czxy0);
        if(peerConnection0 == null) {
            throw new IllegalStateException();
        }
        this.d = peerConnection0;
        this.m = czya.a;
        this.f = czys0;
        this.h = executor0;
        this.n = executor1;
        this.i = czno0;
    }

    public final czya a() {
        synchronized(this) {
        }
        return this.m;
    }

    public final SessionDescription b() {
        SessionDescription sessionDescription0;
        synchronized(this) {
            if(!this.j(czya.d, czya.e)) {
                return null;
            }
            gmcu gmcu0 = new gmcu();
            this.g(new czxm(this, gmcu0));
            sessionDescription0 = (SessionDescription)cuuc.h("createAnswer", gmcu0, hvog.aH());
        }
        return sessionDescription0;
    }

    public final SessionDescription c(String s) {
        synchronized(this) {
            if(!this.j(czya.a, czya.b)) {
                return null;
            }
            DataChannel dataChannel0 = (DataChannel)cuuc.h("createDataChannel", jqy.a(new czxn(this)), hvog.aH());
            if(dataChannel0 != null && this.i(dataChannel0)) {
                gmcu gmcu0 = new gmcu();
                this.g(new czxo(this, gmcu0));
                try {
                    return (SessionDescription)gmcu0.v(hvog.aH(), TimeUnit.MILLISECONDS);
                }
                catch(InterruptedException unused_ex) {
                    czke.s(s, 4, gymt.f, gymd.t);
                    Thread.currentThread().interrupt();
                }
                catch(ExecutionException unused_ex) {
                    czke.s(s, 4, gymt.f, gymd.u);
                }
                catch(TimeoutException unused_ex) {
                    czke.s(s, 4, gymt.f, gymd.y);
                }
                return null;
            }
        }
        return null;
    }

    public final SessionDescription d(SessionDescription sessionDescription0) {
        SessionDescription sessionDescription1;
        synchronized(this) {
            if(!this.j(czya.c, czya.f)) {
                return null;
            }
            sessionDescription1 = this.f(sessionDescription0);
        }
        return sessionDescription1;
    }

    public final SessionDescription e(SessionDescription sessionDescription0) {
        SessionDescription sessionDescription1;
        synchronized(this) {
            gmcu gmcu0 = new gmcu();
            this.g(new czxs(this, gmcu0, sessionDescription0));
            sessionDescription1 = (SessionDescription)cuuc.h("setLocalSessionDescription", gmcu0, hvog.aH());
        }
        return sessionDescription1;
    }

    final SessionDescription f(SessionDescription sessionDescription0) {
        gmcu gmcu0 = new gmcu();
        this.g(new czxr(this, gmcu0, sessionDescription0));
        return (SessionDescription)cuuc.h("setRemoteSessionDescription", gmcu0, hvog.aH());
    }

    public final void g(Runnable runnable0) {
        this.n.execute(runnable0);
    }

    public final void h(PeerConnection.PeerConnectionState peerConnection$PeerConnectionState0) {
        synchronized(this) {
            if(peerConnection$PeerConnectionState0 == PeerConnection.PeerConnectionState.c && hvol.aN()) {
                Duration duration0 = Duration.ofSeconds(hvog.W());
                this.o.b(this.d, duration0, Boolean.valueOf(true));
            }
            if(peerConnection$PeerConnectionState0 == PeerConnection.PeerConnectionState.f || peerConnection$PeerConnectionState0 == PeerConnection.PeerConnectionState.e || peerConnection$PeerConnectionState0 == PeerConnection.PeerConnectionState.d) {
                this.k();
                if(hvol.aN()) {
                    this.o.a();
                }
            }
        }
    }

    final boolean i(DataChannel dataChannel0) {
        gfsx gfsx0 = this.g.a(dataChannel0).a;
        czze czze0 = gfsx0.i() ? ((czze)gfsx0.d()) : null;
        if(czze0 == null) {
            return false;
        }
        czze0.k = new czxz(this, dataChannel0);
        return true;
    }

    final boolean j(czya czya0, czya czya1) {
        if(czya0 != this.m) {
            czkq.a.e().j("Invalid state transition to %s: current state is %s but expected %s.", czya1, this.m, czya0);
            return false;
        }
        this.m = czya1;
        return true;
    }

    public final void k() {
        synchronized(this) {
            czya czya0 = czya.h;
            if(this.m == czya0) {
                return;
            }
            this.m = czya0;
            this.g(new czxk(this));
            czkq.a.b().p("Closed WebRTC connection.", new Object[0]);
        }
    }

    public final void l(SessionDescription sessionDescription0) {
        synchronized(this) {
            if(!this.j(czya.a, czya.d)) {
                return;
            }
            this.f(sessionDescription0);
        }
    }

    public final void m(List list0) {
        synchronized(this) {
            if(this.m == czya.h) {
                czkq.a.e().p("You cannot add ice candidates to a disconnected session.", new Object[0]);
                return;
            }
            if(((Boolean)cuuc.h("onRemoteIceCandidatesReceived", jqy.a(new czxq(this, list0)), hvog.aH())) != null) {
            }
        }
    }

    public static czle n(Context context0, String s, czys czys0, czyp czyp0, List list0, Executor executor0, Executor executor1, String s1, boolean z, czno czno0) {
        try {
            return new czle(new czyb(context0, s, czys0, czyp0, list0, executor0, executor1, z, czno0), gyxo.b);
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

    private static PeerConnectionFactory o(Context context0, boolean z) {
        synchronized(czyb.class) {
            if(czyb.a != null) {
                AtomicBoolean atomicBoolean0 = czyb.j;
                if(atomicBoolean0.get() != z) {
                    PeerConnectionFactory peerConnectionFactory0 = czyb.a;
                    batl.s(peerConnectionFactory0);
                    peerConnectionFactory0.c();
                    czyb.a = null;
                    czkq.a.b().i("Disposed peerConnectionFactory because isCellularAllowed has changed from %b to %b.", atomicBoolean0, Boolean.valueOf(z));
                }
            }
            if(czyb.a == null) {
                PeerConnectionFactory.d(new igso(context0));
                if(czyb.k == null) {
                    czyb.k = NearbyAudioEncoderFactoryFactory.b();
                }
                if(czyb.l == null) {
                    czyb.l = new NearbyAudioDecoderFactoryFactory();
                }
                PeerConnectionFactory.Options peerConnectionFactory$Options0 = new PeerConnectionFactory.Options();
                if(!z) {
                    peerConnectionFactory$Options0.a = 4;
                }
                czyb.j.set(z);
                igsn igsn0 = new igsn();
                igsn0.c(czyb.k);
                igsn0.b(czyb.l);
                igsn0.a = peerConnectionFactory$Options0;
                czyb.a = igsn0.a();
            }
        }
        return czyb.a;
    }
}

