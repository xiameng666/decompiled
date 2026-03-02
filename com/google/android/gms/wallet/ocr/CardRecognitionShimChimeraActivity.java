package com.google.android.gms.wallet.ocr;

import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import batl;
import bauc;
import bbsr;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.wallet.CreditCardExpirationDate;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import dkhl;
import gftb;
import j..util.Objects;
import java.util.Arrays;
import xni;

public class CardRecognitionShimChimeraActivity extends xni {
    private final void a(int v) {
        Intent intent0 = new Intent();
        intent0.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", v);
        this.setResult(1, intent0);
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1001) {
            boolean z = false;
            switch(v1) {
                case -1: {
                    if(intent0 != null && intent0.hasExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT")) {
                        CreditCardOcrResult creditCardOcrResult0 = (CreditCardOcrResult)intent0.getParcelableExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT");
                        gftb.z(creditCardOcrResult0, "CreditCardOcrResult must be non-nul if the resultCode is RESULT_OK.");
                        PaymentCardRecognitionResult paymentCardRecognitionResult0 = new PaymentCardRecognitionResult();
                        Objects.requireNonNull(paymentCardRecognitionResult0);
                        paymentCardRecognitionResult0.a = creditCardOcrResult0.a;
                        int v2 = creditCardOcrResult0.b;
                        if(v2 != -1) {
                            int v3 = creditCardOcrResult0.c;
                            if(v3 != -1) {
                                if(v2 > 0 && v2 <= 12) {
                                    z = true;
                                }
                                batl.b(z);
                                paymentCardRecognitionResult0.b = new CreditCardExpirationDate(v2, v3);
                            }
                        }
                        batl.q(paymentCardRecognitionResult0.a);
                        Intent intent1 = new Intent();
                        bauc.l(paymentCardRecognitionResult0, intent1, "com.google.android.gms.wallet.PaymentCardRecognitionResult");
                        this.setResult(-1, intent1);
                        break;
                    }
                    this.a(8);
                    throw new IllegalArgumentException("OcrShimChimeraActivity receives successful callback from CREDIT_CARD_OCR, but data is null or data doesn\'t have EXTRA_CREDIT_CARD_OCR_RESULT field.");
                }
                case 0: {
                    this.setResult(0, new Intent().putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 0x1A0));
                    break;
                }
                default: {
                    if(v1 != 10004 && v1 != 10007) {
                        this.a(8);
                    }
                    else {
                        this.setResult(0, new Intent().putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 0x1A0));
                    }
                }
            }
            this.finish();
            return;
        }
        this.a(8);
        this.finish();
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        int v1;
        int v = 3;
        this.setTheme(0x7F160ECF);  // style:Theme_Wallet_Blank
        super.onCreate(bundle0);
        this.setTitle("");
        if(bundle0 == null) {
            if(this.getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", 3) == 3) {
                v = 4;
            }
            String s = this.getCallingPackage();
            String s1 = null;
            if(!TextUtils.isEmpty(s)) {
                try {
                    s1 = bbsr.b(this).g(s).toString();
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.e("OcrShimChimeraActivity", "Failed to find application name.", packageManager$NameNotFoundException0);
                }
            }
            String s2 = this.getIntent().getStringExtra("callerPackageName");
            gftb.b(((boolean)(TextUtils.isEmpty(s2) ^ 1)), "The caller package name is absent while creating this PendingIntent.");
            gftb.check(s2);
            if(s2.equals(s)) {
                v1 = TextUtils.isEmpty(s1) ? 0x19F : 0;
            }
            else {
                v1 = 414;
            }
            if(v1 == 0) {
                dkhl dkhl0 = new dkhl(this);
                dkhl0.b.addAll(Arrays.asList(new Integer[]{v}));
                gftb.check(s);
                dkhl0.e(s);
                gftb.check(s1);
                batl.c(((boolean)(TextUtils.isEmpty(s1) ^ 1)), "A non-empty appLabel is required.");
                dkhl0.a.putExtra("com.google.android.gms.ocr.INTEGRATOR_APP_LABEL", s1);
                dkhl0.g(2);
                this.startActivityForResult(((Intent)Objects.requireNonNull(dkhl0.a())), 1001);
                return;
            }
            this.a(v1);
            this.finish();
        }
    }
}

