package com.google.android.gms.backup.g1.restore.photos;

import android.content.Intent;
import android.os.Looper;
import arzm;
import asdc;
import clht;
import com.google.android.chimera.IntentOperation;
import com.google.android.libraries.photos.restore.api.StatusResult;
import fpuk;
import gged_interceptors;

public final class PhotosRestoreResultIntentOperation extends IntentOperation {
    private static final gged_interceptors a;
    private static final gged_interceptors b;

    static {
        PhotosRestoreResultIntentOperation.a = gged_interceptors.p(fpuk.g, fpuk.e, fpuk.h, fpuk.j, fpuk.i);
        PhotosRestoreResultIntentOperation.b = gged_interceptors.l(fpuk.f);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        Object object0 = null;
        if(intent0 != null) {
            StatusResult statusResult0 = (StatusResult)intent0.getParcelableExtra("com.google.android.libraries.photos.restore.EXTRA_STATUS_RESULT");
            if(statusResult0 != null) {
                object0 = statusResult0.a;
            }
        }
        if(PhotosRestoreResultIntentOperation.a.contains(object0)) {
            new clht(Looper.getMainLooper()).post(new arzm(this));
            return;
        }
        if(PhotosRestoreResultIntentOperation.b.contains(object0)) {
            asdc.a.e(this, true);
        }
    }
}

