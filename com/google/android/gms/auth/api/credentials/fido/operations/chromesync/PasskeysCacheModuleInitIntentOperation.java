package com.google.android.gms.auth.api.credentials.fido.operations.chromesync;

import aflt;
import android.content.Intent;
import avzf;
import cljp;
import clks;
import clkz;
import clla;

public final class PasskeysCacheModuleInitIntentOperation extends avzf {
    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        if(!aflt.g()) {
            return;
        }
        clks clks0 = new clks();
        clks0.w(PasskeysCacheUpdateService.class.getName());
        clks0.v(2);
        clks0.p = true;
        clks0.t("PasskeysCacheUpdateTask");
        clks0.a = clkz.k;
        clks0.l(true);
        clla clla0 = clks0.a();
        cljp.a(this).f(clla0);
    }
}

