import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

public final class bwbl {
    public static final int a;
    private static final bboh b;
    private final xob c;
    private final fhwb d;
    private final bvwy e;
    private final bwct f;
    private final bvwa g;

    static {
        bwbl.b = bboh.b("UiFlow", bbcu.ff);
        bwbl.a = 0x7F0B23BF;  // id:uiflow_text_view_max_lines_tag
    }

    public bwbl(bvwa bvwa0, xob xob0, fhwb fhwb0, bvwy bvwy0, bwct bwct0) {
        this.g = bvwa0;
        this.c = xob0;
        this.d = fhwb0;
        this.e = bvwy0;
        this.f = bwct0;
    }

    public final void a(hgme hgme0, View view0) {
        int v = hgme0.b;
        int v1 = hglq.a(v);
        if(v1 != 0) {
            int v2 = -1;
            int v3 = 3;
            switch(v1 - 1) {
                case 0: {
                    ((bvzg)this.g.a(bvzg.class)).a((hgme0.b == 1 ? ((hglz)hgme0.c) : hglz.a));
                    return;
                }
                case 1: {
                    if((v == 3 ? ((hglu)hgme0.c) : hglu.a).b) {
                        this.c.finishAndRemoveTask();
                        return;
                    }
                    this.c.finish();
                    return;
                }
                case 2: {
                    try {
                        hglw hglw0 = v == 4 ? ((hglw)hgme0.c) : hglw.a;
                        this.e((hglw0.b == null ? hgmz.a : hglw0.b));
                        this.d(0x1EDBA);
                    }
                    catch(SecurityException | IllegalStateException | ActivityNotFoundException exception0) {
                        if((hgme0.b == 4 ? ((hglw)hgme0.c) : hglw.a).c.isEmpty()) {
                            a.ae(bwbl.b.i(), "Failed to invoke the intent", exception0);
                            this.d(0x1EDBC);
                            return;
                        }
                        for(Object object0: (hgme0.b == 4 ? ((hglw)hgme0.c) : hglw.a).c) {
                            hgmz hgmz0 = (hgmz)object0;
                            try {
                                this.e(hgmz0);
                                this.d(0x1EDBB);
                                return;
                            }
                            catch(SecurityException | IllegalStateException | ActivityNotFoundException exception1) {
                                a.ae(bwbl.b.i(), "Failed to invoke fallback intent", exception1);
                            }
                        }
                        ((ggtj)bwbl.b.i()).x("Fallback intents invocation failed");
                        this.d(0x1EDBC);
                    }
                    return;
                }
                case 4: {
                    hglv hglv0 = v == 6 ? ((hglv)hgme0.c) : hglv.a;
                    String s = hglv0.c;
                    String s1 = (hglv0.b & 1) == 0 ? "utm_source=UiFlow" : hglv0.f;
                    if((hgme0.b == 6 ? ((hglv)hgme0.c) : hglv.a).d) {
                        Intent intent0 = bwcq.a(s, s1);
                        this.c.startActivityForResult(intent0, 0);
                        return;
                    }
                    ibuq.f(s, "packageName");
                    ibuq.f(s1, "referrer");
                    Intent intent1 = bwcq.c(bwcq.d(s, s1, bwcq.a));
                    this.c.startActivity(intent1);
                    return;
                }
                case 6: {
                    this.h((v == 8 ? ((hglt)hgme0.c) : hglt.a), view0, true);
                    return;
                }
                case 7: {
                    bwct bwct0 = this.f;
                    hgma hgma0 = v == 9 ? ((hgma)hgme0.c) : hgma.a;
                    ibuq.f(hgma0, "action");
                    ibuq.f(view0, "view");
                    hgmq hgmq0 = hgma0.b == null ? hgmq.a : hgma0.b;
                    ibuq.e(hgmq0, "getContent(...)");
                    bvxo bvxo0 = bwct0.c.a(hgmq0);
                    if(bvxo0 == null) {
                        ((ggtj)bwct.a.j()).x("PopupDialogActionHandler.handleAction Could not bind dialog content");
                        return;
                    }
                    LayoutInflater layoutInflater0 = LayoutInflater.from(bwct0.b);
                    View view1 = layoutInflater0.inflate(0x7F0E0C13, null);  // layout:up_dialog_fragment
                    ibuq.d(view1, "null cannot be cast to non-null type android.view.ViewGroup");
                    ibuq.c(layoutInflater0);
                    bvxo0.b(((ViewGroup)view1), layoutInflater0);
                    fyju fyju0 = new fyju(view0.getContext());
                    fyju0.Q(((ViewGroup)view1));
                    iw iw0 = fyju0.a();
                    ibxl ibxl0 = new ibxl(new ibxm(bwdz.e(((ViewGroup)view1)), true, bwcs.a));
                    while(ibxl0.hasNext()) {
                        Object object1 = ibxl0.next();
                        bwbx.b(((Button)object1), new bwcr(iw0));
                    }
                    return;
                }
                case 8: {
                    hgmd hgmd0 = v == 10 ? ((hgmd)hgme0.c) : hgmd.a;
                    this.f((hgmd0.b == null ? hgmn.a : hgmd0.b));
                    return;
                }
                case 9: {
                    for(Object object2: (v == 11 ? ((hgls)hgme0.c) : hgls.a).b) {
                        hgme hgme1 = (hgme)object2;
                        try {
                            this.a(hgme1, view0);
                        }
                        catch(SecurityException | IllegalStateException | ActivityNotFoundException exception2) {
                            a.ae(bwbl.b.i(), "Failed to perform composite action", exception2);
                            return;
                        }
                    }
                    return;
                }
                case 10: {
                    hgmc hgmc0 = v == 12 ? ((hgmc)hgme0.c) : hgmc.a;
                    switch(hgmc0.c) {
                        case 0: {
                            v3 = 2;
                            break;
                        }
                        case 1: {
                            break;
                        }
                        case 2: {
                            v3 = 4;
                            break;
                        }
                        default: {
                            v3 = 0;
                        }
                    }
                    if(v3 == 0) {
                        v3 = 1;
                    }
                    switch(hgmb.a(v3)) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            v2 = -2;
                            break;
                        }
                        default: {
                            v2 = 0;
                        }
                    }
                    fyxp.t(this.c.findViewById(0x7F0B23DC), hgmc0.b, v2).i();  // id:up_screen_container
                    return;
                }
                default: {
                    return;
                }
            }
        }
        throw null;
    }

    public final boolean b(hgme hgme0, View view0) {
        int v = hgme0.b;
        int v1 = hglq.a(v);
        if(v1 != 0) {
            switch(v1 - 1) {
                case 4: {
                    hglv hglv0 = v == 6 ? ((hglv)hgme0.c) : hglv.a;
                    return !hglv0.e || !bbmq.U(this.c, hglv0.c);
                }
                case 6: {
                    TextView textView0 = this.c((v == 8 ? ((hglt)hgme0.c) : hglt.a), view0);
                    if(textView0 == null) {
                        return false;
                    }
                    int v2 = textView0.getLineCount();
                    if(v2 == 1) {
                        return false;
                    }
                    textView0.setTag(bwbl.a, Integer.valueOf(v2));
                    textView0.setEllipsize(TextUtils.TruncateAt.END);
                    this.h((hgme0.b == 8 ? ((hglt)hgme0.c) : hglt.a), view0, false);
                    return true;
                }
                default: {
                    if(v1 - 1 != 9) {
                        return true;
                    }
                    for(Object object0: (v == 11 ? ((hgls)hgme0.c) : hgls.a).b) {
                        if(!this.b(((hgme)object0), view0)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        throw null;
    }

    private final TextView c(hglt hglt0, View view0) {
        if(!(view0.getParent() instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        return (TextView)this.e.b(hglt0.b, viewGroup0);
    }

    private final void d(int v) {
        fhvz fhvz0 = fhwa.a(v);
        fhvz0.c(fhwp.c());
        fhwa fhwa0 = fhvz0.a();
        this.d.a(fhwa0);
    }

    private final void e(hgmz hgmz0) {
        hgna hgna0;
        String s = hgmz0.e;
        hgnd hgnd0 = hgmz0.b == null ? hgnd.a : hgmz0.b;
        int v = hgmy.a(hgmz0.d) == 0 ? 1 : hgmy.a(hgmz0.d);
        xob xob0 = this.c;
        if(!hgnd0.e.isEmpty() && v != 1 && !bbmq.U(xob0, hgnd0.e)) {
            if(s.isEmpty()) {
                s = "utm_source=UiFlow";
            }
            xob0.startActivityForResult((v == 3 ? bwcq.b(hgnd0.e, s, hgnd0.d) : bwcq.a(hgnd0.e, s)), 0);
            return;
        }
        hgnd hgnd1 = hgmz0.b == null ? hgnd.a : hgmz0.b;
        Intent intent0 = new Intent();
        if(!hgnd1.c.isEmpty()) {
            intent0.setAction(hgnd1.c);
        }
        if((hgnd1.b & 0x40) != 0) {
            intent0.setType(hgnd1.i);
        }
        if(!hgnd1.d.isEmpty()) {
            intent0.setData(Uri.parse(hgnd1.d));
        }
        if(!hgnd1.e.isEmpty()) {
            intent0.setPackage(hgnd1.e);
        }
        if(!hgnd1.f.isEmpty()) {
            intent0.setComponent(ComponentName.unflattenFromString(hgnd1.f));
        }
        int v1 = hgnd1.g;
        if(v1 != 0) {
            intent0.setFlags(v1);
        }
        hgms hgms0 = null;
        if((hgnd1.b & 0x20) != 0) {
            for(Object object0: (hgnd1.h == null ? hgnc.a : hgnd1.h).b) {
                hgnb hgnb0 = (hgnb)object0;
                int v2 = hgnb0.b;
                if(v2 == 0) {
                    hgna0 = hgna.g;
                }
                else {
                    switch(v2) {
                        case 2: {
                            hgna0 = hgna.a;
                            break;
                        }
                        case 3: {
                            hgna0 = hgna.b;
                            break;
                        }
                        case 4: {
                            hgna0 = hgna.c;
                            break;
                        }
                        case 5: {
                            hgna0 = hgna.d;
                            break;
                        }
                        case 6: {
                            hgna0 = hgna.e;
                            break;
                        }
                        case 7: {
                            hgna0 = hgna.f;
                            break;
                        }
                        default: {
                            hgna0 = null;
                        }
                    }
                }
                switch(hgna0.ordinal()) {
                    case 0: {
                        intent0.putExtra(hgnb0.d, (hgnb0.b == 2 ? ((String)hgnb0.c) : ""));
                        break;
                    }
                    case 1: {
                        intent0.putExtra(hgnb0.d, (hgnb0.b == 3 ? ((ByteString)hgnb0.c) : ByteString.b).toByteArray());
                        break;
                    }
                    case 2: {
                        intent0.putExtra(hgnb0.d, (hgnb0.b == 4 ? ((int)(((Integer)hgnb0.c))) : 0));
                        break;
                    }
                    case 3: {
                        intent0.putExtra(hgnb0.d, (hgnb0.b == 5 ? ((long)(((Long)hgnb0.c))) : 0L));
                        break;
                    }
                    case 4: {
                        intent0.putExtra(hgnb0.d, (hgnb0.b == 6 ? ((Boolean)hgnb0.c).booleanValue() : false));
                        break;
                    }
                    case 5: {
                        intent0.putExtra(hgnb0.d, (hgnb0.b == 7 ? ((double)(((Double)hgnb0.c))) : 0.0));
                        break;
                    }
                    case 6: {
                        ((ggtj)bwco.a.i()).B("Failed to handle unsupported extra type %s", hgna0);
                    }
                }
            }
        }
        hgmw hgmw0 = hgmz0.c == null ? hgmw.a : hgmz0.c;
        switch(hgmw0.b) {
            case 0: {
                hgms0 = hgms.d;
                break;
            }
            case 1: {
                hgms0 = hgms.a;
                break;
            }
            case 2: {
                hgms0 = hgms.b;
                break;
            }
            case 3: {
                hgms0 = hgms.c;
            }
        }
        switch(hgms0.ordinal()) {
            case 0: {
                if((hgmw0.b == 1 ? ((hgmu)hgmw0.c) : hgmu.a).b) {
                    xob0.startActivityForResult(intent0, (hgmw0.b == 1 ? ((hgmu)hgmw0.c) : hgmu.a).c);
                    return;
                }
                xob0.startActivity(intent0);
                return;
            }
            case 1: {
                xob0.startService(intent0);
                return;
            }
            case 2: {
                if(((hgmw0.b == 3 ? ((hgmt)hgmw0.c) : hgmt.a).b & 1) != 0) {
                    xob0.sendBroadcast(intent0, (hgmw0.b == 3 ? ((hgmt)hgmw0.c) : hgmt.a).c);
                    return;
                }
                xob0.sendBroadcast(intent0);
                return;
            }
            case 3: {
                ((ggtj)bwco.a.i()).B("Failed to handle unsupported operation %s", hgms0);
            }
        }
    }

    private final void f(hgmn hgmn0) {
        ((bvze)this.g.a(bvze.class)).b(hgmn0);
    }

    private static void g(TextView textView0, int v, boolean z) {
        if(!z) {
            textView0.setMaxLines(v);
            return;
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{textView0.getLineCount(), v}).setDuration(300L);
        valueAnimator0.addUpdateListener(new bwbk(textView0));
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet0.play(valueAnimator0);
        animatorSet0.start();
    }

    private final void h(hglt hglt0, View view0, boolean z) {
        TextView textView0 = this.c(hglt0, view0);
        if(textView0 != null && (view0 instanceof MaterialButton)) {
            boolean z1 = textView0.getLineCount() == 1;
            String s = z1 ? hglt0.c : hglt0.d;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgmn.a).v_newBuilder();
            hgmm hgmm0 = hgmm.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgmn hgmn0 = (hgmn)hftp0.b_message;
            hgmn0.b = hgmm0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((hgmn)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgmn)hftp0.b_message).d = ((int)z) ^ 1;
            this.f(((hgmn)hftp0.N_build()));
            if(!z1) {
                bwbl.g(textView0, 1, ((boolean)(((int)z))));
                ((MaterialButton)view0).setText(0x7F1527FF);  // string:read_more "Read more"
                ((MaterialButton)view0).v(0x7F080B6E);  // drawable:quantum_gm_ic_expand_more_vd_theme_24
                return;
            }
            Object object0 = textView0.getTag(0x7F0B23BF);  // id:uiflow_text_view_max_lines_tag
            if((object0 instanceof Integer)) {
                bwbl.g(textView0, ((Integer)object0).intValue(), ((boolean)(((int)z))));
                ((MaterialButton)view0).setText(0x7F1527FE);  // string:read_less "Read less"
                ((MaterialButton)view0).v(0x7F080B6D);  // drawable:quantum_gm_ic_expand_less_vd_theme_24
            }
        }
    }
}

