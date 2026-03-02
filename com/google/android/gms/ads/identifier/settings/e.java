package com.google.android.gms.ads.identifier.settings;

import android.content.pm.PackageInfo;
import android.net.Uri.Builder;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import bbms;
import ccsb;
import ccsd;
import frbo;
import frbx;
import frcp;
import frcr;
import frcz;
import frfr;
import frga;
import frgg;
import frgm;
import frgn;
import frgo;
import ggdy;
import ghjj;
import gmbs;
import hosu;
import hrnt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import jeb.synthetic.TWR;

public final class e {
    private static frbx a;

    public static byte[] a(PackageInfo packageInfo0, String s) {
        try {
            if(hosu.a.e().D()) {
                Uri.Builder uri$Builder0 = new Uri.Builder().scheme("file").authority("").path("/");
                ggdy ggdy0 = new ggdy();
                uri$Builder0.path(packageInfo0.applicationInfo.sourceDir);
                Uri uri0 = frgn.a(frcp.a(uri$Builder0, ggdy0), frgo.b);
                frbx frbx0 = e.b();
                frcz frcz0 = new frcz(uri0);
                frfr frfr0 = new frfr();
                frfr0.b = new frbo[]{frcz0};
                InputStream inputStream0 = (InputStream)frbx0.d(uri0, frfr0);
                TWR.declareResource(inputStream0);
                TWR.useResource$NT(inputStream0);
                ghjj.j(inputStream0);
                String s1 = frgm.g(((Uri)gmbs.b(frcz0.a, IOException.class)));
                if(s1 == null) {
                    TWR.useResource$NT(inputStream0);
                    Log.d("ApkHashUtils", "Digest cannot be found in computed uri");
                    return null;
                }
                TWR.useResource$NT(inputStream0);
                return Base64.decode(s1, 2);
            }
            File file0 = hrnt.i() ? new File(ccsb.a.a(packageInfo0.applicationInfo.sourceDir)) : new File(packageInfo0.applicationInfo.sourceDir);
            byte[] arr_b = new byte[0x4000];
            MessageDigest messageDigest0 = bbms.g("SHA-256");
            if(messageDigest0 == null) {
                Log.d("ApkHashUtils", String.format("Hashing algorithm cannot be found"));
                return null;
            }
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            try {
                for(int v = fileInputStream0.read(arr_b); v != -1; v = fileInputStream0.read(arr_b)) {
                    messageDigest0.update(arr_b, 0, v);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(fileInputStream0, throwable0);
                throw throwable0;
            }
            fileInputStream0.close();
            return messageDigest0.digest();
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            Log.w("HashAPK", String.format("NoSuchAlgorithmException %s", noSuchAlgorithmException0));
            return null;
        }
        catch(IOException unused_ex) {
            Log.w("HashAPK", String.format("Failed to hash package %s", s));
            return null;
        }
    }

    private static frbx b() {
        synchronized(e.class) {
            if(e.a == null) {
                frga[] arr_frga = new frga[1];
                ccsd ccsd0 = hrnt.f() ? new ccsd(new frcr()) : new frcr();
                arr_frga[0] = ccsd0;
                e.a = new frbx(Arrays.asList(arr_frga), Arrays.asList(new frgg[]{new frgm()}));
            }
        }
        return e.a;
    }
}

