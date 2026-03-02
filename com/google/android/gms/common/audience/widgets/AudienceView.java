package com.google.android.gms.common.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import azqk;
import bafb;
import bafc;
import bafd;
import baff;
import bafh;
import batl;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class AudienceView extends FrameLayout {
    public final bafd a;
    public bafh b;
    private static Context c;
    private final Context d;

    public AudienceView(Context context0) {
        this(context0, null, 0);
    }

    public AudienceView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public AudienceView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        Pair pair0 = AudienceView.b(context0);
        bafd bafd0 = (bafd)pair0.first;
        this.a = bafd0;
        Context context1 = (Context)pair0.second;
        this.d = context1;
        try {
            bafd0.c(new ObjectWrapper(this.getContext()), new ObjectWrapper(context1), new baff(this));
            this.addView(((View)ObjectWrapper.a(bafd0.b())));
        }
        catch(RemoteException unused_ex) {
        }
    }

    public final void a(Audience audience0) {
        try {
            this.a.e(audience0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    private static Pair b(Context context0) {
        Object object0;
        if(AudienceView.c == null) {
            AudienceView.c = azqk.b(context0);
        }
        Context context1 = AudienceView.c;
        if(context1 != null) {
            ClassLoader classLoader0 = context1.getClassLoader();
            try {
                IBinder iBinder0 = (IBinder)classLoader0.loadClass("com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost").newInstance();
                if(iBinder0 == null) {
                    object0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                    object0 = (iInterface0 instanceof bafd) ? ((bafd)iInterface0) : new bafb(iBinder0);
                }
                return new Pair(object0, AudienceView.c);
            }
            catch(ClassNotFoundException | InstantiationException | IllegalAccessException unused_ex) {
            }
        }
        return new Pair(new bafc(), context0);
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        Bundle bundle0 = (Bundle)parcelable0;
        Parcelable parcelable1 = bundle0.getParcelable("parent");
        batl.s(parcelable1);
        super.onRestoreInstanceState(parcelable1);
        try {
            Bundle bundle1 = bundle0.getBundle("impl");
            batl.s(bundle1);
            this.a.d(bundle1);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("parent", super.onSaveInstanceState());
        try {
            ((Bundle)parcelable0).putBundle("impl", this.a.a());
        }
        catch(RemoteException unused_ex) {
        }
        return parcelable0;
    }
}

