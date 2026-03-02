package com.google.android.gms.auth.managed.services;

import akiz;
import aklm;
import android.content.Context;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import bbcu;
import bboh;
import cclw;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import gfqs;
import ggtj;
import ghgc;
import hfuo;
import hpxf;
import ibps;
import ibuq;
import iccl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class DeviceSecurityPostureService extends cjtg {
    private static final bboh a;

    static {
        DeviceSecurityPostureService.a = bboh.b("AuthManaged", bbcu.gi);
    }

    public DeviceSecurityPostureService() {
        super(373, "com.google.android.gms.auth.managed.START_DEVICE_POSTURE_SERVICE", Collections.EMPTY_SET, 3, 10);
    }

    @Override  // cjtg
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ArrayList arrayList0;
        ibps ibps0;
        ibuq.f(getServiceRequest0, "request");
        hpxf hpxf0 = hpxf.a;
        if(hpxf0.b().c()) {
            hfuo hfuo0 = hpxf0.b().b().b;
            ibuq.e(hfuo0, "getAppInfosList(...)");
            if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
                for(Object object0: hfuo0) {
                    akiz akiz0 = (akiz)object0;
                    if(ibuq.m(akiz0.b, getServiceRequest0.f)) {
                        String s = akiz0.b;
                        ibuq.e(s, "getPackageName(...)");
                        SigningInfo signingInfo0 = Build.VERSION.SDK_INT < 33 ? this.getApplicationContext().getPackageManager().getPackageInfo(s, 0x8000000).signingInfo : this.getApplicationContext().getPackageManager().getPackageInfo(s, PackageManager.PackageInfoFlags.of(0x8000000L)).signingInfo;
                        int v = 0;
                        if(signingInfo0 == null) {
                            ibps0 = ibps.a;
                        }
                        else {
                            if(signingInfo0.hasMultipleSigners()) {
                                Signature[] arr_signature = signingInfo0.getApkContentsSigners();
                                ibuq.e(arr_signature, "getApkContentsSigners(...)");
                                arrayList0 = new ArrayList(arr_signature.length);
                                while(v < arr_signature.length) {
                                    byte[] arr_b = arr_signature[v].toByteArray();
                                    arrayList0.add(ghgc.a.a(arr_b).toString());
                                    ++v;
                                }
                            }
                            else {
                                Signature[] arr_signature1 = signingInfo0.getSigningCertificateHistory();
                                ibuq.e(arr_signature1, "getSigningCertificateHistory(...)");
                                arrayList0 = new ArrayList(arr_signature1.length);
                                while(v < arr_signature1.length) {
                                    byte[] arr_b1 = arr_signature1[v].toByteArray();
                                    arrayList0.add(ghgc.a.a(arr_b1).toString());
                                    ++v;
                                }
                            }
                            ibps0 = arrayList0;
                        }
                        if(ibps0.contains(akiz0.c)) {
                            Context context0 = this.getApplicationContext();
                            ibuq.e(context0, "getApplicationContext(...)");
                            cjts cjts0 = this.l();
                            String s1 = getServiceRequest0.f;
                            ibuq.e(s1, "getCallingPackage(...)");
                            String s2 = getServiceRequest0.p;
                            iccl.b(cclw.c);
                            cjtn0.c(new aklm(context0, cjts0, gfqs.a, s1, s2));
                            return;
                        }
                    }
                }
            }
            ((ggtj)DeviceSecurityPostureService.a.j()).B("Package %s is not allowed to use DevicePosture API", getServiceRequest0.f);
            cjtn0.a(21701, null);
            return;
        }
        cjtn0.a(21700, null);
    }
}

