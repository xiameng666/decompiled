package com.google.android.gms.auth.setup.d2d;

import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import xnz;

@GmsCoreVeId(257082)
public class SourceNfcHandlerChimeraActivity extends xnz {
    private final void a() {
        Toast.makeText(this, 0x7F1508E3, 0).show();  // string:common_something_went_wrong "Something went wrong"
        this.finish();
    }

    @Override  // xnz
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Parcelable[] arr_parcelable = this.getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if(arr_parcelable != null && arr_parcelable.length != 0) {
            NdefMessage ndefMessage0 = (NdefMessage)arr_parcelable[0];
            if(ndefMessage0 == null) {
                this.a();
                return;
            }
            NdefRecord[] arr_ndefRecord = ndefMessage0.getRecords();
            if(arr_ndefRecord != null && arr_ndefRecord.length > 0) {
                byte[] arr_b = arr_ndefRecord[0].getPayload();
                this.startActivity(new Intent().setClassName(this, "com.google.android.gms.auth.setup.d2d.SourceActivity").putExtra("payload", arr_b));
            }
            this.finish();
            return;
        }
        this.a();
    }
}

