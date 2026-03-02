package com.google.android.gms.wallet.dynamite;

import android.content.Context;
import android.view.ContextThemeWrapper;
import bjgw;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.dynamite.util.c;
import com.google.android.gms.wallet.dynamite.util.o;
import fbct;
import fbgx;
import fbhc;
import gftb;
import hztd;

public final class PayButtonCreatorChimeraImpl extends fbct {
    @Override  // fbcu
    public bjgw newPayButton(bjgw bjgw0, ButtonOptions buttonOptions0) {
        Context[] arr_context = (Context[])ObjectWrapper.a(bjgw0);
        gftb.check(arr_context);
        Context context0 = arr_context[0];
        gftb.check(context0);
        Context context1 = arr_context[1];
        gftb.check(context1);
        c.a(context1);
        fbhc fbhc0 = new fbhc(new ContextThemeWrapper(context0, (buttonOptions0.b == 2 ? 0x7F1605A9 : 0x7F1605A6)));  // style:PayButtonLightTheme
        fbhc0.a = context1;
        fbhc0.b = buttonOptions0;
        fbgx fbgx0 = fbhc0.b();
        if(hztd.f() && buttonOptions0.a == 9) {
            return new ObjectWrapper(fbhc0);
        }
        if(hztd.i()) {
            if(!o.a(buttonOptions0)) {
                fbgx0.f(6, 9, "Integrator has invalid AllowedPaymentMethods");
                return new ObjectWrapper(null);
            }
            return new ObjectWrapper(fbhc0);
        }
        if(!o.b(buttonOptions0.d)) {
            fbgx0.f(6, 9, "Integrator has invalid AllowedPaymentMethods");
            return new ObjectWrapper(null);
        }
        return new ObjectWrapper(fbhc0);
    }
}

