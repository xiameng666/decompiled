import android.accounts.Account;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import java.lang.reflect.InvocationTargetException;

public final class buqw extends buqy {
    public static final bboh a;
    public bujj ag;
    public bujx ah;
    public tyb ai;
    public cmec aj;
    public buqq ak;
    private String al;
    private Account am;
    private View an;
    private ProgressBar ao;
    private TextView ap;
    private View aq;
    private static final hfid ar;
    public buhr b;
    public ImageView c;
    public ExoPlayer d;

    static {
        buqw.a = bboh.b("MediaViewerFrag", bbcu.hd);
        buqw.ar = new hfid(null);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        hiwu hiwu0;
        super.onCreate(bundle0);
        this.al = this.ag.a;
        try {
            Bundle bundle1 = this.getArguments();
            gftb.check(bundle1);
            hftc hftc0 = hftc.a();
            buhr buhr0 = (buhr)hfxk.d(bundle1, "smuiMediaViewerFragmentArgs", ((MessageLite)buhr.a), hftc0);
            this.b = buhr0;
            hiwu0 = buhr0.c;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException(hfur0);
        }
        if(hiwu0 == null) {
            hiwu0 = hiwu.a;
        }
        gftb.b(hiwu0.c == 9 || (this.b.c == null ? hiwu.a : this.b.c).c == 8, "Missing image viewer or video player.");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        boolean z;
        View view0 = layoutInflater0.cloneInContext(fyhn.a(new ContextThemeWrapper(this.requireContext(), 0x7F160C70))).inflate(0x7F0E0593, viewGroup0, false);  // style:Theme.GoogleMaterial3.DayNight.NoActionBar
        this.an = view0;
        this.ao = (ProgressBar)kfb.b(view0, 0x7F0B183C);  // id:loading_circle
        this.ap = (TextView)kfb.b(this.an, 0x7F0B1093);  // id:data_error
        this.aq = (View)kfb.b(this.an, 0x7F0B1092);  // id:data_container
        this.am = new Account(this.al, "com.google");
        hiwu hiwu0 = this.b.c == null ? hiwu.a : this.b.c;
        int v = hiwu0.c;
        if(v == 9) {
            ImageView imageView0 = (ImageView)kfb.b(this.an, 0x7F0B18E5);  // id:media_viewer_imageview
            this.c = imageView0;
            imageView0.setVisibility(0);
            if(!this.b.e.isEmpty()) {
                this.c.setContentDescription(this.b.e);
            }
            hiwg hiwg0 = hiwu0.c == 9 ? ((hiwg)hiwu0.d) : hiwg.a;
            String s = ghiq.a((hiwg0.b == null ? ghip.a : hiwg0.b)).b;
            if(!gfta.c(s)) {
                Uri uri0 = Uri.parse(s);
                uoy uoy0 = (uoy)new uoy().L(new uko());
                if(buqw.ar.i(uri0)) {
                    gmbu.t(this.ah.a(this.am), new buqt(this, s, uoy0), this.an.getContext().getMainExecutor());
                }
                else {
                    this.ai.h(s).b(uoy0).k(this.c);
                    hiwq hiwq0 = this.b.d == null ? hiwq.a : this.b.d;
                    this.ak.c(hjbx.f, hgeg.m, hjaw.b, (hiwo.b(hiwq0.c) == null ? hiwo.l : hiwo.b(hiwq0.c)).name());
                }
            }
        }
        else if(v == 8) {
            mdq.b(0, 0, "bufferForPlaybackMs", "0");
            mdq.b(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
            mdq.b(50000, 0, "minBufferMs", "bufferForPlaybackMs");
            mdq.b(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            mdq.b(50000, 50000, "maxBufferMs", "minBufferMs");
            mdq mdq0 = new mdq(new mtr(), 50000, 0, 0, 2000);
            med med0 = new med(this.requireContext());
            gftb.q(((boolean)(med0.n ^ 1)));
            med0.f = new mdw(mdq0);
            gftb.q(((boolean)(med0.n ^ 1)));
            med0.n = true;
            this.d = new mfs(med0);
            PlayerView playerView0 = (PlayerView)kfb.b(this.an, 0x7F0B18E6);  // id:media_viewer_player_view
            if(!this.b.e.isEmpty()) {
                playerView0.setContentDescription(this.b.e);
            }
            playerView0.setVisibility(0);
            nld nld0 = playerView0.f;
            gftb.q(nld0 != null);
            playerView0.setClickable(true);
            if(!playerView0.l) {
                playerView0.l = true;
                if(playerView0.r()) {
                    nld0.d(playerView0.k);
                }
                else if(nld0 != null) {
                    nld0.b();
                    nld0.d(null);
                }
                playerView0.j();
            }
            ExoPlayer exoPlayer0 = this.d;
            gftb.q(Looper.myLooper() == Looper.getMainLooper());
            if(exoPlayer0 == null) {
                z = true;
            }
            else {
                Looper looper0 = Looper.getMainLooper();
                z = ((mfs)exoPlayer0).k == looper0;
            }
            gftb.checkTrue(z);
            lxl lxl0 = playerView0.k;
            if(lxl0 != exoPlayer0) {
                if(lxl0 != null) {
                    lxl0.P(playerView0.a);
                    if(lxl0.l(27)) {
                        View view1 = playerView0.c;
                        if((view1 instanceof TextureView)) {
                            ((mfs)lxl0).as();
                            if(((TextureView)view1) != null && ((TextureView)view1) == ((mfs)lxl0).F) {
                                ((mfs)lxl0).ag();
                            }
                        }
                        else if((view1 instanceof SurfaceView)) {
                            ((mfs)lxl0).as();
                            SurfaceHolder surfaceHolder0 = ((SurfaceView)view1) == null ? null : ((SurfaceView)view1).getHolder();
                            ((mfs)lxl0).as();
                            if(surfaceHolder0 != null && surfaceHolder0 == ((mfs)lxl0).C) {
                                ((mfs)lxl0).ag();
                            }
                        }
                    }
                    if(playerView0.h != null && playerView0.h.isAssignableFrom(lxl0.getClass())) {
                        try {
                            gftb.check(playerView0.i);
                            playerView0.i.invoke(lxl0, 0);
                        }
                        catch(IllegalAccessException | InvocationTargetException exception0) {
                            throw new RuntimeException(exception0);
                        }
                    }
                }
                SubtitleView subtitleView0 = playerView0.e;
                if(subtitleView0 != null) {
                    subtitleView0.a(null);
                }
                playerView0.k = exoPlayer0;
                if(playerView0.r()) {
                    playerView0.f.d(exoPlayer0);
                }
                playerView0.i();
                playerView0.l();
                playerView0.m(true);
                if(exoPlayer0 == null) {
                    playerView0.c();
                }
                else {
                    if(exoPlayer0.l(27)) {
                        View view2 = playerView0.c;
                        if((view2 instanceof TextureView)) {
                            ((mfs)exoPlayer0).as();
                            if(((TextureView)view2) == null) {
                                ((mfs)exoPlayer0).ag();
                            }
                            else {
                                ((mfs)exoPlayer0).ai();
                                ((mfs)exoPlayer0).F = (TextureView)view2;
                                if(((TextureView)view2).getSurfaceTextureListener() != null) {
                                    lzz.e("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
                                }
                                ((TextureView)view2).setSurfaceTextureListener(((mfs)exoPlayer0).n);
                                SurfaceTexture surfaceTexture0 = ((TextureView)view2).isAvailable() ? ((TextureView)view2).getSurfaceTexture() : null;
                                if(surfaceTexture0 == null) {
                                    ((mfs)exoPlayer0).am(null);
                                    ((mfs)exoPlayer0).ah(0, 0);
                                }
                                else {
                                    ((mfs)exoPlayer0).al(surfaceTexture0);
                                    ((mfs)exoPlayer0).ah(((TextureView)view2).getWidth(), ((TextureView)view2).getHeight());
                                }
                            }
                        }
                        else if((view2 instanceof SurfaceView)) {
                            ((mfs)exoPlayer0).as();
                            if((((SurfaceView)view2) instanceof mvk)) {
                                ((mfs)exoPlayer0).ai();
                                ((mfs)exoPlayer0).am(((SurfaceView)view2));
                                ((mfs)exoPlayer0).ak(((SurfaceView)view2).getHolder());
                            }
                            else if((((SurfaceView)view2) instanceof mxb)) {
                                ((mfs)exoPlayer0).ai();
                                ((mfs)exoPlayer0).D = (mxb)(((SurfaceView)view2));
                                mhg mhg0 = ((mfs)exoPlayer0).ae(((mfs)exoPlayer0).o);
                                mhg0.e(10000);
                                mhg0.d(((mfs)exoPlayer0).D);
                                mhg0.c();
                                ((mfs)exoPlayer0).D.a.add(((mfs)exoPlayer0).n);
                                ((mfs)exoPlayer0).am(((mfs)exoPlayer0).D.e);
                                ((mfs)exoPlayer0).ak(((SurfaceView)view2).getHolder());
                            }
                            else {
                                SurfaceHolder surfaceHolder1 = ((SurfaceView)view2) == null ? null : ((SurfaceView)view2).getHolder();
                                ((mfs)exoPlayer0).as();
                                if(surfaceHolder1 == null) {
                                    ((mfs)exoPlayer0).ag();
                                }
                                else {
                                    ((mfs)exoPlayer0).ai();
                                    ((mfs)exoPlayer0).E = true;
                                    ((mfs)exoPlayer0).C = surfaceHolder1;
                                    surfaceHolder1.addCallback(((mfs)exoPlayer0).n);
                                    Surface surface0 = surfaceHolder1.getSurface();
                                    if(surface0 != null && surface0.isValid()) {
                                        ((mfs)exoPlayer0).am(surface0);
                                        Rect rect0 = surfaceHolder1.getSurfaceFrame();
                                        ((mfs)exoPlayer0).ah(rect0.width(), rect0.height());
                                    }
                                    else {
                                        ((mfs)exoPlayer0).am(null);
                                        ((mfs)exoPlayer0).ah(0, 0);
                                    }
                                }
                            }
                        }
                        if(exoPlayer0.l(30)) {
                            lxw lxw0 = exoPlayer0.M();
                            int v1 = 0;
                        alab1:
                            while(true) {
                                gged_interceptors gged0 = lxw0.b;
                                if(v1 >= gged0.size()) {
                                    break;
                                }
                                if(((lxv)gged0.get(v1)).a() == 2) {
                                    lxv lxv0 = (lxv)gged0.get(v1);
                                    int v2 = 0;
                                    while(v2 < lxv0.c.length) {
                                        if(!lxv0.d(v2)) {
                                            ++v2;
                                            continue;
                                        }
                                        playerView0.h();
                                        break alab1;
                                    }
                                }
                                ++v1;
                            }
                        }
                        else {
                            playerView0.h();
                        }
                    }
                    if(subtitleView0 != null && exoPlayer0.l(28)) {
                        ((mfs)exoPlayer0).as();
                        subtitleView0.a(((mfs)exoPlayer0).H.b);
                    }
                    exoPlayer0.N(playerView0.a);
                    if(playerView0.h != null && playerView0.h.isAssignableFrom(exoPlayer0.getClass())) {
                        try {
                            gftb.check(playerView0.i);
                            gftb.check(playerView0.j);
                            playerView0.i.invoke(exoPlayer0, playerView0.j);
                        }
                        catch(IllegalAccessException | InvocationTargetException exception1) {
                            throw new RuntimeException(exception1);
                        }
                    }
                    playerView0.e(false);
                }
            }
            this.d.N(new buqs(this));
            hfuo hfuo0 = (hiwu0.c == 8 ? ((hiwj)hiwu0.d) : hiwj.a).b;
            if(!hfuo0.isEmpty()) {
                gmbu.t(this.ah.a(this.am), new buqv(this, hfuo0, new clht(Looper.getMainLooper())), this.an.getContext().getMainExecutor());
            }
        }
        this.y(1);
        this.aj.g(this.an, 95510);
        return this.an;
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        ExoPlayer exoPlayer0 = this.d;
        if(exoPlayer0 != null) {
            String s = lwv.a();
            lzz.d("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(exoPlayer0)) + " [AndroidXMedia3/1.8.0] [" + mau.a + "] [" + s + "]");
            ((mfs)exoPlayer0).as();
            ((mfs)exoPlayer0).p.a(false);
            ((mfs)exoPlayer0).q.a(false);
            ((mfs)exoPlayer0).s.c.i();
            ((mfs)exoPlayer0).s.a.P(((mfs)exoPlayer0).s);
            mge mge0 = ((mfs)exoPlayer0).g;
            if(!mge0.k && mge0.g.getThread().isAlive()) {
                mge0.k = true;
                lzi lzi0 = new lzi();
                mge0.f.d(7, lzi0).b();
                if(!lzi0.c(500L)) {
                    mel mel0 = new mel();
                    ((mfs)exoPlayer0).h.e(10, mel0);
                }
            }
            ((mfs)exoPlayer0).h.d();
            ((mfs)exoPlayer0).f.i();
            ((mtt)((mfs)exoPlayer0).l).g.a(((mfs)exoPlayer0).N);
            ((mfs)exoPlayer0).K = mfs.ac(((mfs)exoPlayer0).K, 1);
            ((mfs)exoPlayer0).K = ((mfs)exoPlayer0).K.b(((mfs)exoPlayer0).K.c);
            ((mfs)exoPlayer0).K.r = ((mfs)exoPlayer0).K.t;
            ((mfs)exoPlayer0).K.s = 0L;
            lzq lzq0 = ((mfs)exoPlayer0).N.f;
            gftb.check(lzq0);
            lzq0.h(new mjw(((mfs)exoPlayer0).N));
            ((mfs)exoPlayer0).ai();
            Surface surface0 = ((mfs)exoPlayer0).B;
            if(surface0 != null) {
                surface0.release();
                ((mfs)exoPlayer0).B = null;
            }
            ((mfs)exoPlayer0).H = lys.a;
        }
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        ExoPlayer exoPlayer0 = this.d;
        if(exoPlayer0 != null) {
            exoPlayer0.d();
        }
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        ExoPlayer exoPlayer0 = this.d;
        if(exoPlayer0 != null) {
            exoPlayer0.e();
        }
    }

    public final void y(int v) {
        int v1 = 0;
        this.ao.setVisibility((v == 1 ? 0 : 8));
        this.ap.setVisibility((v == 2 ? 0 : 8));
        View view0 = this.aq;
        if(v != 3) {
            v1 = 8;
        }
        view0.setVisibility(v1);
    }
}

