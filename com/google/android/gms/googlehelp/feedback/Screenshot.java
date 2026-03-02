package com.google.android.gms.googlehelp.feedback;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import bbcu;
import bboh;
import btnu;
import btnv;
import btnw;
import btnx;
import ccsb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import ggtj;
import hrnt;
import hsjm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Screenshot implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final bboh a;
    public int b;
    public int c;
    public String d;

    static {
        Screenshot.a = bboh.b("gH_Screenshot", bbcu.aw);
        Screenshot.CREATOR = new btnw();
    }

    public static AsyncTask a(File file0, String s, Screenshot screenshot0, boolean z, btnx btnx0) {
        File file1 = hrnt.j() ? new File(ccsb.a.b(file0, "reports")) : new File(file0, "reports");
        File file2 = hrnt.j() ? new File(ccsb.a.b(file1, s + ".bmp")) : new File(file1, s + ".bmp");
        return !file2.exists() || !file2.canRead() || !file2.canWrite() ? null : new btnv(file2, z, file0, s, screenshot0, btnx0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static Screenshot b(Bitmap bitmap0) {
        if(bitmap0 != null && !bitmap0.isRecycled()) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            bitmap0.compress(Bitmap.CompressFormat.JPEG, ((int)hsjm.b()), byteArrayOutputStream0);
            return Screenshot.d(byteArrayOutputStream0.toByteArray(), bitmap0.getWidth(), bitmap0.getHeight());
        }
        ((ggtj)Screenshot.a.i()).x("Screenshot is either null or recycled");
        return null;
    }

    public static Screenshot c(String s, int v, int v1) {
        Screenshot screenshot0 = new Screenshot();
        screenshot0.b = v;
        screenshot0.c = v1;
        screenshot0.d = s;
        return screenshot0;
    }

    public static Screenshot d(byte[] arr_b, int v, int v1) {
        return Screenshot.c(Base64.encodeToString(arr_b, 0), v, v1);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static void e(ErrorReport errorReport0, Screenshot screenshot0) {
        errorReport0.v = null;
        if(screenshot0 != null && !TextUtils.isEmpty(screenshot0.d)) {
            errorReport0.w = screenshot0.c;
            errorReport0.x = screenshot0.b;
            errorReport0.u = screenshot0.d;
            return;
        }
        errorReport0.w = 0;
        errorReport0.x = 0;
        errorReport0.u = null;
    }

    public static Bitmap f(byte[] arr_b, boolean z) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        int v = 1;
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
        int v1 = bitmapFactory$Options0.outWidth / 2;
        int v2 = bitmapFactory$Options0.outHeight / 2;
        if(z) {
            int v3 = bitmapFactory$Options0.outHeight;
            int v4 = bitmapFactory$Options0.outWidth;
            if(v3 > v2 || v4 > v1) {
                v = Math.max(Math.round(((float)v3) / ((float)v2)), Math.round(((float)v4) / ((float)v1)));
            }
        }
        bitmapFactory$Options0.inSampleSize = v;
        bitmapFactory$Options0.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
    }

    public static String g(File file0, Bitmap bitmap0) {
        File file1 = hrnt.j() ? new File(ccsb.a.b(file0, "reports")) : new File(file0, "reports");
        if(!file1.exists() && !file1.mkdirs()) {
            ((ggtj)Screenshot.a.i()).x("failed to create reports directory");
            return null;
        }
        if(bitmap0 != null && !bitmap0.isRecycled()) {
            String s = String.valueOf(System.currentTimeMillis());
            File file2 = hrnt.j() ? new File(ccsb.a.b(file1, s + ".bmp")) : new File(file1, s + ".bmp");
            File[] arr_file = file1.listFiles();
            for(int v = 0; v < arr_file.length; ++v) {
                File file3 = arr_file[v];
                if(file3.getName().endsWith(".bmp") && !file3.getName().equals(file2.getName())) {
                    file3.delete();
                }
                if(file3.getName().equals(file2.getName())) {
                    return s;
                }
            }
            btnu btnu0 = new btnu(file2, bitmap0);
            try {
                btnu0.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]).get(hsjm.a.l().o(), TimeUnit.MILLISECONDS);
                return s;
            }
            catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
                return null;
            }
        }
        ((ggtj)Screenshot.a.i()).x("Cannot save. Bitmap is null or recycled.");
        return null;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.d);
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
    }
}

