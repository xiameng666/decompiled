public final class aawd {
    public static final aaex a(grxr grxr0, boolean z, zoh zoh0, boolean z1) {
        znf znf1;
        znj znj0;
        if(hoju.d()) {
            grxw grxw0 = grxr0.e == null ? grxw.a : grxr0.e;
            ibuq.e(grxw0, "getResourceKey(...)");
            grxo grxo0 = grxr0.c == 17 ? ((grxo)grxr0.d) : grxo.a;
            ibuq.e(grxo0, "getPromptItem(...)");
            switch(grxo0.c) {
                case 200: {
                    znj0 = znj.a;
                    break;
                }
                case 300: {
                    znj0 = znh.a;
                    break;
                }
                case 400: {
                    znj0 = znk.a;
                    break;
                }
                default: {
                    znj0 = zni.a;
                }
            }
            grxo grxo1 = grxr0.c == 17 ? ((grxo)grxr0.d) : grxo.a;
            grwe grwe0 = grxo1.d == null ? grwe.a : grxo1.d;
            ibuq.e(grwe0, "getIcon(...)");
            zhr zhr0 = zhy.a(grwe0);
            String s = (grxr0.c == 17 ? ((grxo)grxr0.d) : grxo.a).e;
            ibuq.e(s, "getTitle(...)");
            grxo grxo2 = grxr0.c == 17 ? ((grxo)grxr0.d) : grxo.a;
            grxl grxl0 = grxo2.f == null ? grxl.a : grxo2.f;
            znf znf0 = null;
            ibuq.e(grxl0, "getMainBlock(...)");
            int v = grxl0.b;
            if(v == 1) {
                String s1 = ((grxn)grxl0.c).b;
                ibuq.e(s1, "getText(...)");
                znf1 = new znf(s1);
            }
            else {
                if(v == 2) {
                    grxp grxp0 = (grxp)grxl0.c;
                    if((grxp0.b & 16) != 0) {
                        String s2 = (grxp0.c == null ? grxh.a : grxp0.c).h;
                        ibuq.e(s2, "getLabelText(...)");
                        int v1 = grxl0.b;
                        grxp grxp1 = v1 == 2 ? ((grxp)grxl0.c) : grxp.a;
                        float f = (grxp1.c == null ? grxh.a : grxp1.c).c;
                        grxp grxp2 = v1 == 2 ? ((grxp)grxl0.c) : grxp.a;
                        grxh grxh0 = grxp2.c == null ? grxh.a : grxp2.c;
                        gsad gsad0 = grxh0.e == null ? gsad.a : grxh0.e;
                        ibuq.e(gsad0, "getProgressThemedColor(...)");
                        zhx zhx0 = zib.a(gsad0);
                        grxp grxp3 = grxl0.b == 2 ? ((grxp)grxl0.c) : grxp.a;
                        grxh grxh1 = grxp3.c == null ? grxh.a : grxp3.c;
                        gsad gsad1 = grxh1.g == null ? gsad.a : grxh1.g;
                        ibuq.e(gsad1, "getBackgroundThemedColor(...)");
                        znf0 = new zng(s2, f, zhx0, zib.a(gsad1));
                    }
                }
                znf1 = znf0;
            }
            grxo grxo3 = grxr0.c == 17 ? ((grxo)grxr0.d) : grxo.a;
            ibuq.e(grxo3, "getPromptItem(...)");
            ggdy ggdy0 = new ggdy();
            zht zht0 = zhz.a((grxo3.h == null ? grwp.a : grxo3.h));
            zht zht1 = zhz.a((grxo3.k == null ? grwp.a : grxo3.k));
            if(grxo3.i) {
                String s3 = grxo3.j;
                ibuq.e(s3, "getSecondaryButtonText(...)");
                if(!ibzk.D(s3)) {
                    String s4 = grxo3.j;
                    ibuq.e(s4, "getSecondaryButtonText(...)");
                    ggdy0.i(new zna(s4));
                    goto label_68;
                }
                goto label_61;
            }
            else {
            label_61:
                if(zht1 != null) {
                    String s5 = grxo3.j;
                    ibuq.e(s5, "getSecondaryButtonText(...)");
                    if(!ibzk.D(s5)) {
                        String s6 = grxo3.j;
                        ibuq.e(s6, "getSecondaryButtonText(...)");
                        ggdy0.i(new znc(s6, zht1));
                    }
                }
            }
        label_68:
            if(zht0 != null) {
                String s7 = grxo3.g;
                ibuq.e(s7, "getCallToActionText(...)");
                if(!ibzk.D(s7)) {
                    if(grxo3.l) {
                        String s8 = grxo3.g;
                        ibuq.e(s8, "getCallToActionText(...)");
                        ggdy0.i(new znc(s8, zht0));
                    }
                    else {
                        String s9 = grxo3.g;
                        ibuq.e(s9, "getCallToActionText(...)");
                        ggdy0.i(new znb(s9, zht0));
                    }
                }
            }
            gged_interceptors gged0 = ggdy0.h();
            ibuq.e(gged0, "build(...)");
            return new znn(grxw0, znj0, zhr0, s, znf1, gged0, zoh0, z, z1);
        }
        grxw grxw1 = grxr0.e == null ? grxw.a : grxr0.e;
        ibuq.e(grxw1, "getResourceKey(...)");
        grxo grxo4 = grxr0.c == 17 ? ((grxo)grxr0.d) : grxo.a;
        ibuq.e(grxo4, "getPromptItem(...)");
        return new znm(grxw1, grxo4, zoh0, z);
    }
}

