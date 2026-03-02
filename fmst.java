import android.os.Handler;
import android.view.View;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.richcard.ui.RichCardContentView;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class fmst implements fmoz {
    public final fmus a;

    public fmst(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        boolean z;
        if(!((gged_interceptors)object0).isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            flba.a();
            int v = (int)timeUnit0.toSeconds(System.currentTimeMillis());
            int v1 = ((gged_interceptors)object0).size();
            for(int v2 = 0; v2 < v1; ++v2) {
                fmga fmga0 = (fmga)((gged_interceptors)object0).get(v2);
                fmfx fmfx0 = fmga0.k;
                if(fmfx0.a() == fmfz.c) {
                    fmfw fmfw0 = fmfx0.b();
                    if(fmfw0.e != 0 && (!fmfw0.i.i() || ((int)(((Integer)fmfw0.i.d()))) < v)) {
                        arrayList0.add(fmga0);
                    }
                    else {
                        arrayList1.add(fmga0);
                    }
                }
            }
            fmus fmus0 = this.a;
            if(!arrayList0.isEmpty()) {
                fmus0.ak.q(fmus0.e, ((fmga[])arrayList0.toArray(new fmga[arrayList0.size()])));
            }
            if(!arrayList1.isEmpty() && (!fmus0.C.i() || !((fmga)fmus0.C.d()).a.equals(((fmga)arrayList1.get(0)).a))) {
                if(fmus0.G) {
                    fmus0.ak.N(fmus0.e, fmus0.b);
                }
                fmga fmga1 = (fmga)arrayList1.get(0);
                gged_interceptors gged0 = fmus0.A;
                int v3 = ((ggna)gged0).c;
                int v4 = 0;
                while(v4 < v3) {
                    fmnq fmnq0 = (fmnq)gged0.get(v4);
                    gfsx gfsx0 = fmjs.a(fmga1);
                    if(gfsx0.i() && ((fmlz)gfsx0.d()).b() == fmly.a) {
                        z = true;
                        gged_interceptors gged1 = ((fmlz)gfsx0.d()).c().a;
                        int v5 = 0;
                    alab1:
                        while(true) {
                            if(v5 >= ((ggna)gged1).c) {
                                goto label_51;
                            }
                            fmmj fmmj0 = (fmmj)gged1.get(v5);
                            switch(fmmj0.a().ordinal()) {
                                case 0: {
                                    goto label_40;
                                }
                                case 1: {
                                    z = fmom.a(fmmj0.c());
                                    goto label_51;
                                }
                            }
                            ++v5;
                            continue;
                        label_40:
                            gged_interceptors gged2 = fmmj0.b().a;
                            int v6 = 0;
                            while(v6 < ((ggna)gged2).c) {
                                if(fmom.a(((fmmo)gged2.get(v6)))) {
                                    ++v6;
                                    continue;
                                }
                                else {
                                    break alab1;
                                }
                                break;
                            }
                            ++v5;
                            continue;
                        }
                    }
                    z = false;
                label_51:
                    ++v4;
                    if(z) {
                        fmyo fmyo0 = fmus0.B;
                        View view0 = fmus0.a;
                        AccountContext accountContext0 = fmus0.e;
                        RichCardContentView richCardContentView0 = new RichCardContentView(view0.getContext());
                        gfsx gfsx1 = fmjs.a(fmga1);
                        richCardContentView0.a = false;
                        if(gfsx1.i()) {
                            richCardContentView0.a(((fmlz)gfsx1.d()), fmnq0.a, fmnq0.b, fmnq0.c, accountContext0, fmga1);
                        }
                        Runnable runnable0 = fmyo0.d;
                        Handler handler0 = fmyo0.c;
                        handler0.removeCallbacks(runnable0);
                        fmfx fmfx1 = fmga1.k;
                        int v7 = fmfx1.b().j;
                        OverlayView overlayView0 = fmyo0.a;
                        if(v7 == 5) {
                            overlayView0.b.setLayoutParams(overlayView0.d);
                        }
                        else {
                            overlayView0.b.setLayoutParams(overlayView0.c);
                        }
                        fmyq fmyq0 = new fmyq(overlayView0, (fmfx1.b().j == 5 ? overlayView0.e : 0));
                        overlayView0.b.setOutlineProvider(fmyq0);
                        overlayView0.b.setClipToOutline(true);
                        overlayView0.setClickable(true);
                        overlayView0.setBackgroundColor(overlayView0.getContext().getColor(0x7F060DA3));  // color:overlay_background_blocked_color
                        overlayView0.setVisibility(0);
                        overlayView0.a(fmfx1.b());
                        overlayView0.a.removeAllViews();
                        overlayView0.a.addView(richCardContentView0);
                        overlayView0.a.setVisibility(0);
                        overlayView0.b(fmfx1.b());
                        overlayView0.c(fmfx1.b(), new fmyl(fmyo0, fmga1));
                        overlayView0.setVisibility(0);
                        TimeUnit timeUnit1 = TimeUnit.SECONDS;
                        fmfw fmfw1 = fmfx1.b();
                        int v8 = -1;
                        if(fmfw1.e != 0) {
                            gfsx gfsx2 = fmfw1.i;
                            if(gfsx2.i()) {
                                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                                flba.a();
                                v8 = ((int)(((Integer)gfsx2.d()))) - ((int)timeUnit2.toSeconds(System.currentTimeMillis()));
                            }
                        }
                        long v9 = timeUnit1.toMillis(((long)v8));
                        if(v9 > 0L) {
                            handler0.postDelayed(runnable0, v9);
                        }
                        ((View)((ConversationView)view0).c).clearFocus();
                        fmro.c(view0);
                        ((ConversationView)view0).b();
                        fmus0.C = gfsx.m(fmga1);
                        fmus0.f.e(fmga1);
                        return;
                    }
                }
            }
        }
    }
}

