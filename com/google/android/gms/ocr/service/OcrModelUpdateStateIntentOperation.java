package com.google.android.gms.ocr.service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import azts;
import azty;
import azzc;
import bavt;
import bawr;
import bawz;
import bbmq;
import bbpz;
import ccsb;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;
import csop;
import dkmb;
import dkmc;
import dkme;
import dkml;
import dkmw;
import evrg;
import favj;
import hrnt;
import hvuq;
import hvut;
import java.io.File;

public class OcrModelUpdateStateIntentOperation extends IntentOperation {
    public static final int a;
    private static final String b;
    private dkme c;

    static {
        OcrModelUpdateStateIntentOperation.b = bbpz.f("com.google.android.gms.ocr");
    }

    public OcrModelUpdateStateIntentOperation() {
    }

    public OcrModelUpdateStateIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.gms.ocr.MODEL_UPDATE_ACTION".equals(s) && !"com.google.gservices.intent.action.GSERVICES_CHANGED".equals(s) && (!"com.google.android.gms.phenotype.COMMITTED".equals(s) && !OcrModelUpdateStateIntentOperation.b.equals(s) || !"com.google.android.gms.ocr".equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
            return;
        }
        boolean z = dkmb.a(this, new dkmw(), new dkmc(this.getPackageManager()));
        bbmq.G(this, "com.google.android.gms.ocr.SecuredCreditCardOcrActivity", z);
        bbmq.G(this, "com.google.android.gms.ocr.GiftCardOcrActivity", (!z || !hvut.a.b().b() ? z : favj.a(this, new TextRecognizerOptions()).c()));
        if(hvuq.c()) {
            Log.i("OcrModelUpStIntentOp", "Downloading text recognizer");
            this.sendBroadcast(new Intent("com.google.android.gms.vision.DEPENDENCY").setPackage("com.google.android.gms").putExtra("com.google.android.gms.vision.DEPENDENCIES", "ocr"));
            if(this.c == null) {
                this.c = new dkme(this);
            }
            bavt bavt0 = this.c.a;
            ApiFeatureRequest apiFeatureRequest0 = bawz.g(new azty[]{this.c.a()});
            if(apiFeatureRequest0.a.isEmpty()) {
                evrg.d(null);
            }
            else {
                azzc azzc0 = new azzc();
                azzc0.c = new Feature[]{csop.a};
                azzc0.d = 27302;
                azzc0.b = false;
                azzc0.a = new bawr(((bawz)bavt0), apiFeatureRequest0);
                ((azts)bavt0).iG(azzc0.a());
            }
        }
        Context context0 = this.getApplicationContext();
        File[] arr_file = (hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), "commerce_ocr")) : new File(context0.getFilesDir(), "commerce_ocr")).listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file0 = arr_file[v];
                String s1 = file0.getName();
                if(!"params_expdate_c45e5b7.dat".equals(s1) && !"params_chname_convnet.dat.gz".equals(s1)) {
                    Log.i("OcrModelUpStIntentOp", "Deleting " + file0.getName());
                    file0.delete();
                }
            }
        }
        dkml dkml0 = new dkml(this.getApplicationContext(), z);
        dkml0.c(3);
        dkml0.d(3);
    }
}

