package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class Subscription extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract PendingIntent a();

    public abstract String b();

    public final void d(Context context0, Bundle bundle0) {
        Intent intent0 = new Intent();
        intent0.setPackage(this.b());
        if(bundle0 != null) {
            intent0.putExtras(bundle0);
        }
        this.a().send(context0, 0, intent0);
    }
}

