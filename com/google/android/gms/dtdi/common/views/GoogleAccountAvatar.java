package com.google.android.gms.dtdi.common.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bblp;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import fngs;
import fntn;
import fnub;
import foew;
import ibuq;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GoogleAccountAvatar extends FrameLayout {
    public final AccountParticleDisc a;

    public GoogleAccountAvatar(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, null, 14, null);
    }

    public GoogleAccountAvatar(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, null, 12, null);
    }

    public GoogleAccountAvatar(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, null, 8, null);
    }

    public GoogleAccountAvatar(Context context0, AttributeSet attributeSet0, int v, ExecutorService executorService0) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        AccountParticleDisc accountParticleDisc0 = new AccountParticleDisc(context0, attributeSet0, v);
        this.a = accountParticleDisc0;
        fntn fntn0 = new fntn();
        if(executorService0 == null) {
            executorService0 = new bblp(1, 9);
        }
        Context context1 = context0.getApplicationContext();
        foew foew0 = new foew();
        foew0.a = executorService0;
        fnub fnub0 = new fnub(context1, foew0.a());
        accountParticleDisc0.h(new fngs(context0.getApplicationContext(), executorService0, fntn0, fnub0), fntn0);
    }

    public GoogleAccountAvatar(Context context0, AttributeSet attributeSet0, int v, ExecutorService executorService0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            executorService0 = null;
        }
        this(context0, attributeSet0, v, executorService0);
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.addView(this.a);
    }
}

