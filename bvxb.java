import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;

public class bvxb extends bvvu {
    public bvws ag;
    private static final bboh ah;
    private hgni ai;
    public bvxp b;
    public fhwo c;
    public bvwy d;

    static {
        bvxb.ah = bboh.b("UiFlow", bbcu.ff);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        try {
            Bundle bundle1 = this.getArguments();
            if(bundle1 != null) {
                hftc hftc0 = hftc.a();
                this.ai = (hgni)hfxk.d(bundle1, "screen", ((MessageLite)hgni.a), hftc0);
            }
        }
        catch(hfur hfur0) {
            a.ae(bvxb.ah.j(), "Failed creating ScreenFragment", hfur0);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        GradientDrawable.Orientation gradientDrawable$Orientation0;
        int v1;
        if(this.ai == null) {
            return layoutInflater0.inflate(0x7F0E0C14, viewGroup0, false);  // layout:up_error_screen
        }
        View view0 = layoutInflater0.inflate(0x7F0E0907, viewGroup0, false);  // layout:screen_fragment
        view0.setTag(0x7F0B23DD, (this.ai.c == null ? hgnj.a : this.ai.c));  // id:up_screen_key_tag
        hgni hgni0 = this.ai;
        if((hgni0.b & 8) != 0) {
            this.c.b.e((hgni0.f == null ? hgno.a : hgni0.f).b).c(view0);
        }
        hgmq hgmq0 = this.ai.d == null ? hgmq.a : this.ai.d;
        if(this.getResources().getConfiguration().orientation == 2) {
            hgni hgni1 = this.ai;
            if((hgni1.b & 4) != 0) {
                hgmq0 = hgni1.e;
                if(hgmq0 == null) {
                    hgmq0 = hgmq.a;
                }
            }
        }
        bvxo bvxo0 = this.b.a(hgmq0);
        if(bvxo0 != null) {
            bvxo0.b(view0, layoutInflater0);
        }
        if((this.ai.b & 0x20) != 0) {
            MaterialCardView materialCardView0 = bwdz.b(((ViewGroup)view0));
            if(materialCardView0 != null) {
                hgmh hgmh0 = this.ai.h == null ? hgmh.a : this.ai.h;
                float f = materialCardView0.mi();
                ibuq.f(hgmh0, "<this>");
                int v = hgmh0.b;
                switch(v) {
                    case 0: {
                        v1 = 3;
                        break;
                    }
                    case 1: {
                        v1 = 1;
                        break;
                    }
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
                GradientDrawable gradientDrawable0 = null;
                if(v1 == 0) {
                    throw null;
                }
                switch(v1 - 1) {
                    case 0: {
                        Integer integer0 = Color.parseColor((v == 1 ? ((String)hgmh0.c) : ""));
                        gradientDrawable0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ibpo.aF(ibpo.g(new Integer[]{integer0, integer0})));
                        gradientDrawable0.setCornerRadius(f);
                        break;
                    }
                    case 1: {
                        switch((v == 2 ? ((hgmg)hgmh0.c) : hgmg.a).c) {
                            case 0: {
                                gradientDrawable0 = hgmf.a;
                                break;
                            }
                            case 1: {
                                gradientDrawable0 = hgmf.b;
                                break;
                            }
                            case 2: {
                                gradientDrawable0 = hgmf.c;
                                break;
                            }
                            case 3: {
                                gradientDrawable0 = hgmf.d;
                                break;
                            }
                            case 4: {
                                gradientDrawable0 = hgmf.e;
                                break;
                            }
                            case 5: {
                                gradientDrawable0 = hgmf.f;
                                break;
                            }
                            case 6: {
                                gradientDrawable0 = hgmf.g;
                                break;
                            }
                            case 7: {
                                gradientDrawable0 = hgmf.h;
                                break;
                            }
                            case 8: {
                                gradientDrawable0 = hgmf.i;
                            }
                        }
                        if(gradientDrawable0 == null) {
                            gradientDrawable0 = hgmf.j;
                        }
                        ibuq.e(gradientDrawable0, "getOrientation(...)");
                        switch(((hgmf)gradientDrawable0).ordinal()) {
                            case 1: {
                                gradientDrawable$Orientation0 = GradientDrawable.Orientation.BL_TR;
                                break;
                            }
                            case 2: {
                                gradientDrawable$Orientation0 = GradientDrawable.Orientation.BOTTOM_TOP;
                                break;
                            }
                            case 3: {
                                gradientDrawable$Orientation0 = GradientDrawable.Orientation.BR_TL;
                                break;
                            }
                            case 4: {
                                gradientDrawable$Orientation0 = GradientDrawable.Orientation.LEFT_RIGHT;
                                break;
                            }
                            case 5: {
                                gradientDrawable$Orientation0 = GradientDrawable.Orientation.RIGHT_LEFT;
                                break;
                            }
                            case 6: {
                                gradientDrawable$Orientation0 = GradientDrawable.Orientation.TL_BR;
                                break;
                            }
                            case 8: {
                                gradientDrawable$Orientation0 = GradientDrawable.Orientation.TR_BL;
                                break;
                            }
                            case 0: 
                            case 7: 
                            case 9: {
                                gradientDrawable$Orientation0 = GradientDrawable.Orientation.TOP_BOTTOM;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                        hfuo hfuo0 = (hgmh0.b == 2 ? ((hgmg)hgmh0.c) : hgmg.a).b;
                        ibuq.e(hfuo0, "getColorsList(...)");
                        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
                        for(Object object0: hfuo0) {
                            arrayList0.add(Integer.valueOf(Color.parseColor(((String)object0))));
                        }
                        gradientDrawable0 = new GradientDrawable(gradientDrawable$Orientation0, ibpo.aF(arrayList0));
                        gradientDrawable0.setCornerRadius(f);
                    }
                }
                if(gradientDrawable0 != null) {
                    materialCardView0.d(0);
                    materialCardView0.setBackgroundDrawable(gradientDrawable0);
                }
            }
        }
        int v2 = (this.ai.g == null ? hgnl.a : this.ai.g).e;
        if(v2 <= 0) {
            this.z();
            return view0;
        }
        if(viewGroup0 != null) {
            viewGroup0.postDelayed(() -> {
                hgni hgni0 = this.ai;
                if((hgni0.b & 16) != 0) {
                    hgnl hgnl0 = hgni0.g == null ? hgnl.a : hgni0.g;
                    Integer integer0 = this.d.c(hgnl0.c);
                    String s = hgnl0.b;
                    if(integer0 != null && !s.isEmpty()) {
                        bvws bvws0 = this.ag;
                        int v = (int)integer0;
                        boolean z = hgnl0.d;
                        bvwq bvwq0 = new bvwq();
                        String s1 = htwh.a.b().d();
                        frqm.d(bvws0.b, bvwq0, s1);
                        Activity activity0 = bvws0.c;
                        if(activity0 == null) {
                            throw new IllegalArgumentException("Client context is not set.");
                        }
                        if(TextUtils.isEmpty(s)) {
                            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
                        }
                        frqm.b(new frqx(activity0, s, new bvwr(bvws0, v), "AIzaSyD2sPA5joB8PMG0hPdSULdWvXEhnOdXJJY", null, z));
                    }
                }
            }, ((long)v2));
        }
        return view0;
    }

    public static bvxb y(hgni hgni0) {
        bvxb bvxb0 = new bvxb();
        Bundle bundle0 = new Bundle();
        hfxk.m(bundle0, "screen", ((MessageLite)hgni0));
        bvxb0.setArguments(bundle0);
        return bvxb0;
    }

    // Detected as a lambda impl.
    public final void z() {
        hgni hgni0 = this.ai;
        if((hgni0.b & 16) != 0) {
            hgnl hgnl0 = hgni0.g == null ? hgnl.a : hgni0.g;
            Integer integer0 = this.d.c(hgnl0.c);
            String s = hgnl0.b;
            if(integer0 != null && !s.isEmpty()) {
                bvws bvws0 = this.ag;
                int v = (int)integer0;
                boolean z = hgnl0.d;
                bvwq bvwq0 = new bvwq();
                String s1 = htwh.a.b().d();
                frqm.d(bvws0.b, bvwq0, s1);
                Activity activity0 = bvws0.c;
                if(activity0 == null) {
                    throw new IllegalArgumentException("Client context is not set.");
                }
                if(TextUtils.isEmpty(s)) {
                    throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
                }
                frqm.b(new frqx(activity0, s, new bvwr(bvws0, v), "AIzaSyD2sPA5joB8PMG0hPdSULdWvXEhnOdXJJY", null, z));
            }
        }
    }
}

