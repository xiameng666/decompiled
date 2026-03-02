package com.google.android.chimera.licenses;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import com.google.android.chimera.config.InvalidConfigException;
import ggdy;
import java.io.IOException;
import java.util.List;
import wxp;
import wyc;
import wzq;
import xdp;
import xeb;
import xed;
import xjx;

@ChimeraApiVersion(added = 0x71L)
public class ChimeraLicenses {
    private static Resources a(Context context0, xeb xeb0) {
        wzq wzq0 = wzq.p(context0, xeb0, wxp.b());
        if(wzq0 != null) {
            return wzq0.c();
        }
        throw new xdp("Malformed apk descriptor");
    }

    private static xeb b(ChimeraLicenseSource chimeraLicenseSource0) {
        xed xed0 = wyc.f().k();
        int v = xed0.a();
        xeb xeb0 = new xeb();
        for(int v1 = 0; v1 < v; ++v1) {
            xed0.h(xeb0, v1);
            if(chimeraLicenseSource0.getKey().equals(xeb0.l())) {
                return xeb0;
            }
        }
        throw new InvalidConfigException("Could not find module APK: " + chimeraLicenseSource0);
    }

    public static List loadLicenseSources(Context context0) {
        ggdy ggdy0 = new ggdy();
        xed xed0 = wyc.f().k();
        int v = xed0.a();
        xeb xeb0 = new xeb();
        for(int v1 = 0; v1 < v; ++v1) {
            xed0.h(xeb0, v1);
            wzq wzq0 = wzq.p(context0, xeb0, wxp.b());
            if(wzq0 != null) {
                try {
                    if(xjx.d(wzq0.c(), xeb0.k())) {
                        ggdy0.i(new ChimeraLicenseSource(xeb0.l(), xeb0.k()));
                    }
                    continue;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                catch(xdp unused_ex) {
                    continue;
                }
                Log.e("ChimeraLicenses", "Failed checking " + xeb0.l() + " for license data");
            }
        }
        return ggdy0.h();
    }

    public static String loadLicenseText(Context context0, ChimeraLicense chimeraLicense0) {
        try {
            xeb xeb0 = ChimeraLicenses.b(chimeraLicense0.getSource());
            return xjx.a(ChimeraLicenses.a(context0, xeb0), xeb0.k(), chimeraLicense0.getData());
        }
        catch(xdp | PackageManager.NameNotFoundException exception0) {
            throw new IOException("Failed loading license text for " + chimeraLicense0, exception0);
        }
    }

    public static List loadLicenses(Context context0, ChimeraLicenseSource chimeraLicenseSource0) {
        try {
            xeb xeb0 = ChimeraLicenses.b(chimeraLicenseSource0);
            ggdy ggdy0 = new ggdy();
            try {
                List list0 = xjx.b(ChimeraLicenses.a(context0, xeb0), xeb0.k());
            }
            catch(xdp | PackageManager.NameNotFoundException exception0) {
                throw new IOException("Failed loading licenses from " + xeb0.l(), exception0);
            }
            for(Object object0: list0) {
                ggdy0.i(new ChimeraLicense(((License)object0), chimeraLicenseSource0));
            }
            return ggdy0.h();
        }
        catch(IOException iOException0) {
            throw new IOException("Failed fetching licenses for " + chimeraLicenseSource0, iOException0);
        }
    }
}

