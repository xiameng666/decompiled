import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import java.util.List;

public final class gbej {
    public static void a(gbet gbet0, View view0) {
        gbej.b(gbet0, view0, new gbeh());
    }

    public static void b(gbet gbet0, View view0, ibnf ibnf0) {
        int v13;
        int v11;
        int v12;
        int v7;
        int v5;
        int v4;
        int v1;
        FrameLayout.LayoutParams frameLayout$LayoutParams0;
        gbdq gbdq0 = gbet0.c.c();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        int v = 1;
        if((viewGroup$LayoutParams0 instanceof FrameLayout.LayoutParams)) {
            frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)viewGroup$LayoutParams0;
            v1 = 0;
        }
        else {
            frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)ibnf0.get();
            v1 = 1;
        }
        int v2 = v1 | gbfi.a(gbet0, gbdq0, frameLayout$LayoutParams0);
        int v3 = gbet0.d;
        gaxl.a();
        if(!hzjo.c() && gbet0.e(gbdq0, new int[]{10})) {
            v4 = gbdu.a(((hdqc)gbdq0.e(10, v3, hdqc.class)), 49);
            frameLayout$LayoutParams0.gravity = v4;
            v5 = 1;
        }
        else {
            v4 = 49;
            v5 = 0;
        }
        gbdq gbdq1 = gbdq0.d(14);
        if(gbdq1 != null && (gbet0.e(gbdq1, new int[]{4}) || gbet0.e(gbdq1, new int[]{5}))) {
            hdrh hdrh0 = (hdrh)gbdq1.g(4, v3, hdrh.class);
            int v6 = 0x30;
            switch(((hdrh)gbdq1.g(5, v3, hdrh.class)).ordinal()) {
                case 0: 
                case 1: {
                    break;
                }
                case 2: {
                    v6 = 16;
                    break;
                }
                case 3: {
                    v6 = 80;
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            switch(hdrh0.ordinal()) {
                case 1: {
                    v7 = 0x800003;
                    break;
                }
                case 0: 
                case 2: {
                    v7 = 1;
                    break;
                }
                case 3: {
                    v7 = 0x800005;
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            int v8 = v7 | v6;
            if(v4 == 49 || v8 != 49) {
                frameLayout$LayoutParams0.gravity = v8;
            }
            v5 = 1;
        }
        int v9 = v2 | v5;
        gbdq gbdq2 = gbdq0.d(14);
        if(gbdq2 != null) {
            gbdq gbdq3 = gbdq0.d(1);
            int v10 = gbet0.d;
            boolean z = gbet0.e(gbdq2, new int[]{2});
            boolean z1 = gbdq3 != null && gbet0.e(gbdq3, new int[]{1});
            if(z) {
                if(z1) {
                    v12 = frameLayout$LayoutParams0.topMargin;
                }
                else if(gbdq3 != null) {
                    v12 = gbez.c(gbdq3, 1, v10);
                }
                else {
                    v12 = 0;
                }
                frameLayout$LayoutParams0.topMargin = v12 + gbez.c(gbdq2, 2, v10);
                v11 = 1;
            }
            else if(!z1) {
                v11 = 0;
            }
            else {
                frameLayout$LayoutParams0.topMargin += gbez.c(gbdq2, 2, v10);
                v11 = 1;
            }
            boolean z2 = gbet0.e(gbdq2, new int[]{1});
            boolean z3 = gbdq3 != null && gbet0.e(gbdq3, new int[]{3});
            if(z2) {
                if(z3) {
                    v13 = frameLayout$LayoutParams0.getMarginStart();
                }
                else if(gbdq3 != null) {
                    v13 = gbez.c(gbdq3, 3, v10);
                }
                else {
                    v13 = 0;
                }
                frameLayout$LayoutParams0.setMarginStart(v13 + gbez.c(gbdq2, 1, v10));
            }
            else if(!z3) {
                v = v11;
            }
            else {
                frameLayout$LayoutParams0.setMarginStart(frameLayout$LayoutParams0.getMarginStart() + gbez.c(gbdq2, 1, v10));
            }
            v9 |= v;
        }
        if(v9 != 0) {
            view0.setLayoutParams(frameLayout$LayoutParams0);
        }
        gaxl.a();
        if(hzlv.g() && gbet0.e(gbdq0, new int[]{16})) {
            List list0 = gbdq0.i(16, gbet0.d);
            if(list0.isEmpty()) {
                kex.b(view0, null);
                return;
            }
            kex.b(view0, new gbei(view0, list0));
        }
    }
}

