import com.google.android.gms.accountsettings.mg.ui.main.MainChimeraActivity;

public final class aasn implements lqj {
    public final MainChimeraActivity a;

    public aasn(MainChimeraActivity mainChimeraActivity0) {
        this.a = mainChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        grxw grxw0;
        MainChimeraActivity mainChimeraActivity0 = this.a;
        if(!aakv.b(mainChimeraActivity0, "navigation")) {
            if(((aano)object0) == aano.a) {
                du du0 = mainChimeraActivity0.getSupportFragmentManager().h("onboarding");
                if(du0 != null) {
                    ca ca0 = new ca(mainChimeraActivity0.getSupportFragmentManager());
                    ca0.o(du0);
                    ca0.f();
                }
            }
            else {
                if(((aano)object0) == aano.b && !aakv.b(mainChimeraActivity0, "splashScreen")) {
                    mainChimeraActivity0.g(new aakb(), "splashScreen", aaku.f);
                    return;
                }
                if(((aano)object0) == aano.c && !aakv.b(mainChimeraActivity0, "onboarding")) {
                    if(mainChimeraActivity0.getResources().getConfiguration().orientation == 1) {
                        mainChimeraActivity0.setRequestedOrientation(1);
                        mainChimeraActivity0.g(new aaif(), "onboarding", aaku.g);
                        return;
                    }
                    mainChimeraActivity0.g(aahu.y(MainChimeraActivity.j), "navigation", mainChimeraActivity0.a());
                    return;
                }
                if(((aano)object0) == aano.d) {
                    if(aakv.b(mainChimeraActivity0, "onboarding")) {
                        zho zho0 = (zho)mainChimeraActivity0.k.b.b.ij();
                        grxw0 = zho0 == null ? null : zhp.b(zho0.a());
                        if(grxw0 == null) {
                            grxu grxu0 = (grxu)((ProtoLiteMessage)grxw.a).v_newBuilder();
                            if(!grxu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)grxu0).ensureMutable();
                            }
                            grxw grxw1 = (grxw)grxu0.b_message;
                            grxw1.b |= 1;
                            grxw1.c = 0;
                            grxw0 = (grxw)((ProtoLiteBuilder)grxu0).N_build();
                        }
                    }
                    else {
                        grxw0 = MainChimeraActivity.j;
                    }
                    mainChimeraActivity0.setRequestedOrientation(-1);
                    mainChimeraActivity0.g(aahu.y(grxw0), "navigation", mainChimeraActivity0.a());
                }
            }
        }
    }
}

