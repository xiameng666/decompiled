package com.google.android.gms.common.images;

import a;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.Pair;
import bapm;
import bbcu;
import bbdg;
import bbev;
import bbew;
import bbfo;
import bboh;
import ccmg;
import ccmp;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.chimera.IntentOperation;
import ggtj;
import java.io.FileNotFoundException;
import java.io.IOException;
import jeb.synthetic.TWR;

public class ImageIntentOperation extends IntentOperation {
    private static final bboh a;
    private ccmg b;

    static {
        ImageIntentOperation.a = bboh.b("ImageIntentOp", bbcu.N);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = new ccmp();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ImageIntentOperation imageIntentOperation0;
        Uri uri1;
        AssetFileDescriptor assetFileDescriptor0;
        byte[] arr_b;
        int v;
        Object object0;
        Cursor cursor0;
        Pair pair0;
        bapm bapm0;
        Parcelable parcelable0 = intent0.getParcelableExtra("com.google.android.gms.extras.resultReceiver");
        Parcelable parcelable1 = intent0.getParcelableExtra("com.google.android.gms.extras.uri");
        if(parcelable0 != null && parcelable1 != null && (parcelable0 instanceof ResultReceiver) && (parcelable1 instanceof Uri)) {
            Uri uri0 = (Uri)parcelable1;
            ResultReceiver resultReceiver0 = (ResultReceiver)parcelable0;
            try {
                String s = uri0.getAuthority();
                if("content".equals(uri0.getScheme()) && s != null && s.equals("com.google.android.gms.games.background")) {
                    bapm0 = bapm.a(this);
                    if("android.resource".equals(uri0.getScheme())) {
                        pair0 = Pair.create(Integer.valueOf(1), null);
                    }
                    else {
                        cursor0 = this.getContentResolver().query(uri0, bapm.a, null, null, null);
                        if(cursor0 == null) {
                            goto label_21;
                        }
                        else {
                            goto label_13;
                        }
                    }
                    goto label_30;
                }
                else {
                    goto label_66;
                }
                goto label_69;
            }
            catch(IOException iOException0) {
                goto label_89;
            }
            try {
            label_13:
                if(cursor0.moveToFirst()) {
                    object0 = cursor0.getString(0);
                    v = cursor0.getInt(1);
                    goto label_16;
                }
                else {
                    goto label_19;
                }
                goto label_30;
            }
            catch(Throwable throwable0) {
                goto label_24;
            }
            try {
            label_16:
                cursor0.close();
                pair0 = Pair.create(Integer.valueOf(v), object0);
                goto label_30;
            }
            catch(IOException iOException0) {
                goto label_89;
            }
            try {
            label_19:
                Log.w("ImageBroker", a.ab(uri0, "No image store record found for image ID "));
                goto label_27;
            label_21:
                Log.w("ImageBroker", a.ab(uri0, "No image store record found for image ID "));
                goto label_27;
            }
            catch(Throwable throwable0) {
                try {
                label_24:
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    throw throwable0;
                label_27:
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    pair0 = null;
                label_30:
                    if(pair0 == null) {
                        uri1 = uri0;
                        imageIntentOperation0 = this;
                    label_65:
                        goto label_68;
                    label_66:
                        uri1 = uri0;
                        imageIntentOperation0 = this;
                        goto label_68;
                    }
                    else {
                        int v1 = (int)(((Integer)pair0.first));
                        String s1 = (String)pair0.second;
                        if(v1 == 0) {
                            if(s1 == null) {
                                Log.e("ImageBroker", "No local image data and no external image URL found for image " + uri0.toString());
                                uri1 = uri0;
                                imageIntentOperation0 = this;
                                goto label_65;
                            }
                            else {
                                try {
                                    arr_b = bapm0.b.p(this, uri0, s1);
                                }
                                catch(VolleyError unused_ex) {
                                    Log.w("ImageBroker", "Error retrieving image at URL " + s1);
                                    arr_b = null;
                                }
                                if(arr_b == null) {
                                    uri1 = uri0;
                                    imageIntentOperation0 = this;
                                    goto label_68;
                                }
                                else {
                                    uri1 = uri0;
                                    imageIntentOperation0 = this;
                                    try {
                                    label_56:
                                        assetFileDescriptor0 = imageIntentOperation0.getContentResolver().openAssetFileDescriptor(uri1, "r");
                                    }
                                    catch(FileNotFoundException unused_ex) {
                                        Log.e("ImageBroker", "Fetched image data was not stored for image URI " + uri1.toString());
                                        goto label_65;
                                    }
                                }
                            }
                        }
                        else if(v1 == 2 && s1 != null) {
                            RequestFuture requestFuture0 = RequestFuture.newFuture();
                            uri1 = uri0;
                            imageIntentOperation0 = this;
                            bbfo bbfo0 = new bbfo(imageIntentOperation0, uri1, s1, false, new bbev(bapm0.b, s1, requestFuture0), new bbew(bapm0.b, s1, requestFuture0), bapm0.b.d, bapm0.b.e);
                            bapm0.b.q(bbfo0, null);
                            goto label_56;
                        }
                        else {
                            uri1 = uri0;
                            imageIntentOperation0 = this;
                            goto label_56;
                        }
                    }
                    goto label_69;
                }
                catch(IOException iOException0) {
                    goto label_89;
                }
            }
        label_68:
            assetFileDescriptor0 = null;
            try {
            label_69:
                if(assetFileDescriptor0 == null) {
                    ((ggtj)ImageIntentOperation.a.j()).B("Failed LoadImageOperation for %s", uri1);
                }
                Bundle bundle0 = new Bundle();
                if(assetFileDescriptor0 == null) {
                    bundle0.putParcelable("com.google.android.gms.extra.fileDescriptor", null);
                }
                else {
                    bundle0.putParcelable("com.google.android.gms.extra.fileDescriptor", assetFileDescriptor0.getParcelFileDescriptor());
                    bundle0.putLong("assetFdStartOffset", assetFileDescriptor0.getStartOffset());
                    bundle0.putLong("assetFdLength", assetFileDescriptor0.getDeclaredLength());
                }
                resultReceiver0.send(0, bundle0);
                if(assetFileDescriptor0 != null) {
                    imageIntentOperation0.b.a(bbdg.vp);
                }
                goto label_85;
            }
            catch(Throwable throwable1) {
                try {
                    TWR.safeClose$NT(assetFileDescriptor0, throwable1);
                    throw throwable1;
                label_85:
                    if(assetFileDescriptor0 != null) {
                        assetFileDescriptor0.close();
                        return;
                    }
                    return;
                }
                catch(IOException iOException0) {
                }
            }
        label_89:
            Log.e("ImageIntentOp", "Failed to close file", iOException0);
        }
    }
}

