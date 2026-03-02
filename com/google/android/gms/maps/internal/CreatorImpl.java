package com.google.android.gms.maps.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import away;
import bjgw;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import cppd;
import cppe;
import cppg;
import cpph;
import cppk;
import cppl;
import cpps;
import cppt;
import cppv;
import cppw;
import cprb;
import cprc;
import cpre;
import cprf;
import cpss;
import cpst;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
public class CreatorImpl extends cppk {
    public cppl a;
    private int b;
    private final Set c;

    public CreatorImpl() {
        this.b = -1;
        this.a = null;
        this.c = Collections.newSetFromMap(new WeakHashMap());
    }

    public final bjgw a(cppd cppd0) {
        if(this.a != null) {
            return new ObjectWrapper(cppd0.b());
        }
        bjgw bjgw0 = new cppe(cppd0);
        this.c.add(bjgw0);
        return bjgw0;
    }

    @Override  // cppl
    public void addInternalUsageAttributionId(bjgw bjgw0, String s) {
    }

    private static Object c(Class class0) {
        try {
            return class0.newInstance();
        }
        catch(IllegalAccessException illegalAccessException0) {
            RemoteException remoteException0 = new RemoteException();
            remoteException0.initCause(illegalAccessException0);
            throw remoteException0;
        }
        catch(InstantiationException instantiationException0) {
            RemoteException remoteException1 = new RemoteException();
            remoteException1.initCause(instantiationException0);
            throw remoteException1;
        }
    }

    private final void d(Context context0) {
        Object object0;
        if(this.a == null) {
            try {
                Context context1 = away.a(context0, "com.google.android.gms.maps_dynamite");
                if(context1 == null) {
                    throw new RemoteException();
                }
                ClassLoader classLoader0 = context1.getClassLoader();
                Resources resources0 = context1.getResources();
                try {
                    object0 = CreatorImpl.c(classLoader0.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    RemoteException remoteException0 = new RemoteException();
                    remoteException0.initCause(classNotFoundException0);
                    throw remoteException0;
                }
                cppl cppl0 = cppk.asInterface(((IBinder)object0));
                this.a = cppl0;
                cppl0.initV2(new ObjectWrapper(resources0), this.b);
                Set set0 = this.c;
                for(Object object1: set0) {
                    cppe cppe0 = (cppe)object1;
                    Object object2 = cppe0.a;
                    if((object2 instanceof cppd)) {
                        cppe0.a = ((cppd)object2).b();
                    }
                }
                set0.clear();
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    @Override  // cppl
    public int getRendererType() {
        return 1;
    }

    @Override  // cppl
    public void init(bjgw bjgw0) {
        this.initV2(bjgw0, 0);
    }

    @Override  // cppl
    public void initV2(bjgw bjgw0, int v) {
        this.b = v;
    }

    @Override  // cppl
    public void logInitialization(bjgw bjgw0, int v) {
    }

    @Override  // cppl
    public cpst newBitmapDescriptorFactoryDelegate() {
        return new cpss(this);
    }

    @Override  // cppl
    public cpph newCameraUpdateFactoryDelegate() {
        return new cppg(this);
    }

    @Override  // cppl
    public cppt newMapFragmentDelegate(bjgw bjgw0) {
        this.d(((Activity)ObjectWrapper.a(bjgw0)));
        cppl cppl0 = this.a;
        return cppl0 == null ? new cpps(((Context)ObjectWrapper.a(bjgw0))) : cppl0.newMapFragmentDelegate(bjgw0);
    }

    @Override  // cppl
    public cppw newMapViewDelegate(bjgw bjgw0, GoogleMapOptions googleMapOptions0) {
        this.d(((Context)ObjectWrapper.a(bjgw0)).getApplicationContext());
        cppl cppl0 = this.a;
        return cppl0 == null ? new cppv(((Context)ObjectWrapper.a(bjgw0))) : cppl0.newMapViewDelegate(bjgw0, googleMapOptions0);
    }

    @Override  // cppl
    public cprc newStreetViewPanoramaFragmentDelegate(bjgw bjgw0) {
        this.d(((Activity)ObjectWrapper.a(bjgw0)));
        cppl cppl0 = this.a;
        return cppl0 == null ? new cprb(((Context)ObjectWrapper.a(bjgw0))) : cppl0.newStreetViewPanoramaFragmentDelegate(bjgw0);
    }

    @Override  // cppl
    public cprf newStreetViewPanoramaViewDelegate(bjgw bjgw0, StreetViewPanoramaOptions streetViewPanoramaOptions0) {
        this.d(((Context)ObjectWrapper.a(bjgw0)).getApplicationContext());
        cppl cppl0 = this.a;
        return cppl0 == null ? new cpre(((Context)ObjectWrapper.a(bjgw0))) : cppl0.newStreetViewPanoramaViewDelegate(bjgw0, streetViewPanoramaOptions0);
    }

    @Override  // cppl
    public void preInit(bjgw bjgw0) {
    }
}

