import android.content.Intent;
import android.nfc.NfcAdapter.ReaderCallback;
import android.nfc.Tag;
import com.google.android.chimera.android.Activity;

public final class ddyj implements NfcAdapter.ReaderCallback {
    public final Activity a;

    public ddyj(Activity activity0) {
        this.a = activity0;
    }

    @Override  // android.nfc.NfcAdapter$ReaderCallback
    public final void onTagDiscovered(Tag tag0) {
        ibuq.c(tag0);
        Intent intent0 = new Intent("android.nfc.action.TAG_DISCOVERED");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("android.nfc.extra.TAG", tag0);
        this.a.sendBroadcast(intent0);
    }
}

