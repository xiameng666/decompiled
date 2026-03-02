package com.google.android.gms.ocr.credit;

import android.content.Intent;
import android.os.Bundle;
import bbdg;
import bbmq;
import ccmq;
import com.google.android.gms.ocr.RecognitionScreen;
import dkkw;
import gaec;
import gayy;
import hbye;
import hvvh;
import java.util.ArrayList;

public class SecuredCreditCardOcrChimeraActivity extends dkkw {
    private final boolean o() {
        int v = this.getIntent().getIntExtra("com.google.android.gms.ocr.THEME", 0);
        hvvh hvvh0 = hvvh.a;
        int v1 = hvvh0.b().b().b.contains(Integer.valueOf(v));
        if(v == 4) {
            v1 &= gaec.t(this);
        }
        Bundle bundle0 = this.getIntent().getBundleExtra("com.google.android.gms.ocr.RECOGNITION");
        if(bundle0 != null) {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = bundle0.getParcelableArrayList("com.google.android.gms.ocr.RECOGNITION_SCREENS");
            if(arrayList1.isEmpty()) {
                int[] arr_v = bundle0.getIntArray("com.google.android.gms.ocr.RECOGNITION_SCREENTYPES");
                for(int v4 = 0; v4 < arr_v.length; ++v4) {
                    arrayList0.add(Integer.valueOf(arr_v[v4]));
                }
            }
            else {
                int v2 = arrayList1.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    arrayList0.add(Integer.valueOf(((RecognitionScreen)arrayList1.get(v3)).c));
                }
            }
            v1 &= hvvh0.b().a().b.containsAll(arrayList0);
        }
        return !this.getIntent().getBooleanExtra("com.google.android.gms.ocr.PREVIEW_AGGREGATED_EXP_DATE", false) && !this.getIntent().getBooleanExtra("com.google.android.gms.ocr.PREVIEW_AGGREGATED_NAME", false) ? v1 != 0 : hvvh0.b().e() & v1;
    }

    @Override  // xnb
    public final void onBackPressed() {
        this.l(null, 0);
        super.onBackPressed();
    }

    @Override  // dkkw
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.bE);
        bbmq.A(this);
        if(hvvh.c() && this.o()) {
            gayy.h(this.g(), hbye.eO);
        }
        if(hvvh.a.b().c() && this.o()) {
            super.m(bundle0);
            Intent intent0 = this.getIntent();
            intent0.setAction("com.google.android.gms.wallet.ACTION_SHIM_CREDIT_CARD_OCR");
            intent0.setComponent(null);
            intent0.setFlags(0x2000000);
            this.startActivity(intent0);
            this.finish();
            return;
        }
        super.onCreate(bundle0);
    }
}

