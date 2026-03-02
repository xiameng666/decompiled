package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dclt;
import gfuz;
import java.util.Arrays;
import java.util.Locale;

public class ShareTargetAction extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Icon b;
    public final PendingIntent c;
    public final String d;
    public final boolean e;

    static {
        ShareTargetAction.CREATOR = new dclt();
    }

    public ShareTargetAction(String s, Icon icon0, PendingIntent pendingIntent0, String s1, boolean z) {
        this.a = s;
        this.b = icon0;
        this.c = pendingIntent0;
        this.d = s1;
        this.e = z;
    }

    public final ShareTargetAction a() {
        try {
            return (ShareTargetAction)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new gfuz(cloneNotSupportedException0);
        }
    }

    @Override
    public final Object clone() {
        return this.a();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ShareTargetAction) && bata.b(this.a, ((ShareTargetAction)object0).a) && bata.b(this.b, ((ShareTargetAction)object0).b) && bata.b(this.c, ((ShareTargetAction)object0).c) && bata.b(this.d, ((ShareTargetAction)object0).d) && bata.b(Boolean.valueOf(this.e), Boolean.valueOf(((ShareTargetAction)object0).e));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e)});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "ShareTargetAction<title: %s, pendingIntent: %s, actionName: %s, isDefault: %s>", this.a, this.c, this.d, Boolean.valueOf(this.e));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.v(parcel0, 4, this.d, false);
        baub.e(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

