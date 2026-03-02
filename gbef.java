import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout.LayoutParams;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;

public final class gbef {
    public static final int a(hdqb hdqb0) {
        ibuq.f(hdqb0, "<this>");
        switch(hdqb0.ordinal()) {
            case 0: 
            case 1: {
                return -1;
            }
            case 2: {
                return 0;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 5: 
            case 6: {
                return 3;
            }
            case 7: {
                throw new IllegalArgumentException("Stretch not yet supported");
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public static final int b(hdqg hdqg0) {
        ibuq.f(hdqg0, "<this>");
        switch(hdqg0.ordinal()) {
            case 0: 
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public static final int c(hdqm hdqm0) {
        ibuq.f(hdqm0, "<this>");
        switch(hdqm0.ordinal()) {
            case 0: 
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public static final void d(gbet gbet0, gbee gbee0) {
        int v3;
        hdqb hdqb0;
        gbdq gbdq0 = gbet0.c.c();
        gbdq gbdq1 = gbdq0.d(18);
        int v = 2;
        if(gbdq1 == null) {
            if(gbet0.e(gbdq0, new int[]{9})) {
                int v5 = gbef.b(((hdqg)(((Enum)gbdq0.g(9, gbet0.d, hdqg.class)))));
                ((FlexboxLayout)gbee0.a).o(v5);
            }
            if(gbet0.e(gbdq0, new int[]{10})) {
                hdqc hdqc0 = (hdqc)gbdq0.e(10, gbet0.d, hdqc.class);
                FlexboxLayout flexboxLayout0 = (FlexboxLayout)gbee0.a;
                if(!flexboxLayout0.lO()) {
                    if((hdqc0.b & 2) == 0) {
                        hdqb0 = hdqb.c;
                    }
                    else {
                        hdqb0 = hdqb.b(hdqc0.d);
                        if(hdqb0 == null) {
                            hdqb0 = hdqb.a;
                        }
                    }
                }
                else if((hdqc0.b & 1) != 0) {
                    hdqb0 = hdqb.b(hdqc0.c);
                    if(hdqb0 == null) {
                        hdqb0 = hdqb.a;
                    }
                }
                else {
                    hdqb0 = hdqb.c;
                }
                ibuq.c(hdqb0);
                flexboxLayout0.e(gbef.a(hdqb0));
            }
        }
        else {
            if(gbet0.e(gbdq1, new int[]{1})) {
                int v1 = gbef.c(((hdqm)(((Enum)gbdq1.g(1, gbet0.d, hdqm.class)))));
                ((FlexboxLayout)gbee0.a).o(v1);
            }
            int v2 = 3;
            if(gbet0.e(gbdq1, new int[]{2})) {
                hdqj hdqj0 = (hdqj)(((Enum)gbdq1.g(2, gbet0.d, hdqj.class)));
                ViewGroup viewGroup0 = gbee0.a;
                ibuq.f(hdqj0, "<this>");
                switch(hdqj0.ordinal()) {
                    case 2: {
                        v3 = 0;
                        break;
                    }
                    case 3: {
                        v3 = 1;
                        break;
                    }
                    case 4: {
                        v3 = 2;
                        break;
                    }
                    case 0: 
                    case 1: 
                    case 5: {
                        v3 = 4;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                ((FlexboxLayout)viewGroup0).e(v3);
            }
            if(gbet0.e(gbdq1, new int[]{3})) {
                hdqo hdqo0 = (hdqo)(((Enum)gbdq1.g(3, gbet0.d, hdqo.class)));
                ViewGroup viewGroup1 = gbee0.a;
                ibuq.f(hdqo0, "<this>");
                switch(hdqo0.ordinal()) {
                    case 0: 
                    case 1: 
                    case 2: {
                        v2 = 0;
                        break;
                    }
                    case 3: {
                        v2 = 1;
                        break;
                    }
                    case 4: {
                        v2 = 2;
                        break;
                    }
                    case 5: {
                        v2 = 5;
                        break;
                    }
                    case 6: {
                        v2 = 4;
                        break;
                    }
                    case 7: {
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                ((FlexboxLayout)viewGroup1).t(v2);
            }
            if(gbet0.e(gbdq1, new int[]{4}) && gbdq1.l(4, gbet0.d)) {
                int v4 = gbez.c(gbdq1, 4, gbet0.d);
                gbxm gbxm0 = gbet0.g;
                if(gbxm0 != null) {
                    try {
                        gbxm0.u = v4;
                        hdrl hdrl0 = gbxm0.b;
                        ibuq.e(hdrl0, "getNode(...)");
                        gbxh gbxh0 = gbxm0.a(hdrl0, hdrl0);
                        if((gbxh0 instanceof gbxr)) {
                            hdrl hdrl1 = gbxm0.b;
                            ibuq.e(hdrl1, "getNode(...)");
                            ((gbxr)gbxh0).l(hdrl1, gbxm0.aV(), v4);
                        }
                    }
                    catch(gbxf gbxf0) {
                        Log.e("DelContainerPresenter", "current delegate could not handle current node; in bad state", gbxf0);
                        gavr.e("BE_DCP_06", gbxm0.a.a.g, null, "current delegate could not handle current node; in bad state", gbxf0, 4);
                        throw new ibnm();
                    }
                }
            }
            if(gbet0.e(gbdq1, new int[]{5})) {
                hdqr hdqr0 = (hdqr)(((Enum)gbdq1.g(5, gbet0.d, hdqr.class)));
                ViewGroup viewGroup2 = gbee0.a;
                ibuq.f(hdqr0, "<this>");
                switch(hdqr0.ordinal()) {
                    case 0: {
                        v = 0;
                        break;
                    }
                    case 1: {
                        v = 1;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                ((FlexboxLayout)viewGroup2).p(v);
            }
        }
    }

    public static final void e(gbet gbet0, FlexboxLayout flexboxLayout0) {
        ibuq.f(flexboxLayout0, "flexboxLayout");
        gbee gbee0 = gbed.a(flexboxLayout0);
        gbfj.d(gbet0, gbee0.a);
        gbef.d(gbet0, gbee0);
    }

    public static final void f(FlexboxLayout flexboxLayout0, gbet gbet0, View view0) {
        int v6;
        int v5;
        int v4;
        boolean z;
        FlexboxLayout.LayoutParams flexboxLayout$LayoutParams0;
        ibuq.f(flexboxLayout0, "parentLayout");
        ibuq.f(view0, "childView");
        gbed.a(flexboxLayout0);
        gbdq gbdq0 = gbet0.c.c();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        int v = 1;
        if((viewGroup$LayoutParams0 instanceof FlexboxLayout.LayoutParams)) {
            flexboxLayout$LayoutParams0 = (FlexboxLayout.LayoutParams)viewGroup$LayoutParams0;
            z = false;
        }
        else {
            flexboxLayout$LayoutParams0 = new FlexboxLayout.LayoutParams(-1, -2);
            z = true;
        }
        ibuq.f(flexboxLayout$LayoutParams0, "params");
        boolean z1 = gbfi.a(gbet0, gbdq0, flexboxLayout$LayoutParams0) || z;
        int v1 = gbet0.d;
        gbdq gbdq1 = gbdq0.d(12);
        if(gbdq1 == null) {
            v5 = 0;
        }
        else {
            int v2 = gbet0.d;
            gaxl.a();
            if(!hzmb.a.b().i() || !gbdq1.l(7, v2)) {
                if(gbet0.e(gbdq1, new int[]{1})) {
                    flexboxLayout$LayoutParams0.b = gbdq1.a(1, v2);
                    v4 = 1;
                }
                else {
                    v4 = 0;
                }
                if(gbet0.e(gbdq1, new int[]{2})) {
                    flexboxLayout$LayoutParams0.c = gbdq1.l(2, v2) ? gbdq1.a(2, v2) : 1.0f;
                    v4 = 1;
                }
                if(gbet0.e(gbdq1, new int[]{3})) {
                    flexboxLayout$LayoutParams0.e = gbdq1.l(3, v2) ? gbdq1.a(3, v2) : -1.0f;
                    v4 = 1;
                }
            }
            else if(gbet0.e(gbdq1, new int[]{7})) {
                int v3 = gbdq1.c(7, v2);
                flexboxLayout$LayoutParams0.e = 1.0f;
                flexboxLayout$LayoutParams0.b = (float)v3;
                flexboxLayout$LayoutParams0.c = 0.0f;
                v4 = 1;
            }
            else {
                v4 = 0;
            }
            if(!gbet0.e(gbdq1, new int[]{5}) && !gbet0.e(gbdq1, new int[]{4})) {
                v5 = v4;
            }
            else {
                if(gbdq1.l(5, v2)) {
                    hdqj hdqj0 = (hdqj)(((Enum)gbdq1.g(5, v2, hdqj.class)));
                    ibuq.f(hdqj0, "<this>");
                    switch(hdqj0.ordinal()) {
                        case 0: 
                        case 1: {
                            v6 = -1;
                            break;
                        }
                        case 2: {
                            v6 = 0;
                            break;
                        }
                        case 3: {
                            v6 = 1;
                            break;
                        }
                        case 4: {
                            v6 = 2;
                            break;
                        }
                        case 5: {
                            throw new IllegalArgumentException("Stretch not yet supported");
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
                else {
                    v6 = gbdq1.l(4, v2) ? gbef.a(((hdqb)(((Enum)gbdq1.g(4, v2, hdqb.class))))) : -1;
                }
                flexboxLayout$LayoutParams0.d = v6;
                v5 = 1;
            }
            if(gbet0.e(gbdq1, new int[]{6})) {
                flexboxLayout$LayoutParams0.a = gbdq1.l(6, v2) ? gbdq1.c(6, v2) : flexboxLayout$LayoutParams0.a;
                v5 = 1;
            }
        }
        if(gbdq0.l(5, v1) && gbet0.e(gbdq0, new int[]{5})) {
            flexboxLayout$LayoutParams0.h = gbez.c(gbdq0, 5, v1);
            v5 = 1;
        }
        if(gbdq0.l(8, v1) && gbet0.e(gbdq0, new int[]{8})) {
            flexboxLayout$LayoutParams0.i = gbez.c(gbdq0, 8, v1);
            v5 = 1;
        }
        if(gbdq0.l(4, v1) && gbet0.e(gbdq0, new int[]{4})) {
            flexboxLayout$LayoutParams0.f = gbez.c(gbdq0, 4, v1);
        }
        else {
            v = v5;
        }
        if(gbdq0.l(7, v1) && gbet0.e(gbdq0, new int[]{7})) {
            flexboxLayout$LayoutParams0.g = gbez.c(gbdq0, 7, v1);
            view0.setLayoutParams(flexboxLayout$LayoutParams0);
        }
        else if(v != 0 || z1) {
            view0.setLayoutParams(flexboxLayout$LayoutParams0);
        }
        gaxl.a();
        if(hzlv.g()) {
            ibuq.f(view0, "childView");
            if(gbet0.e(gbdq0, new int[]{16})) {
                List list0 = gbdq0.i(16, gbet0.d);
                ibuq.e(list0, "getListValue(...)");
                if(list0.isEmpty()) {
                    kex.b(view0, null);
                    return;
                }
                kex.b(view0, new gbec(list0));
            }
        }
    }
}

