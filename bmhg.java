import com.google.android.gms.fido.fido2.api.common.Attachment;

public enum bmhg {
    UNUSED("", null),
    BLUETOOTH_LOW_ENERGY("ble", Attachment.b),
    NFC("nfc", Attachment.b),
    USB("usb", Attachment.b),
    CABLE("cable", Attachment.b),
    FINGERPRINT("fingerprint", Attachment.a),
    SCREEN_LOCK("screen_lock", Attachment.a),
    SILENT("silent", Attachment.a),
    DIRECT_TRANSFER("direct_transfer", null);

    public final Attachment j;
    private final String l;

    private bmhg(String s1, Attachment attachment0) {
        this.l = s1;
        this.j = attachment0;
    }

    public static bmhg a(String s) {
        bmhg[] arr_bmhg = bmhg.values();
        for(int v = 0; v < arr_bmhg.length; ++v) {
            bmhg bmhg0 = arr_bmhg[v];
            if(s.equals(bmhg0.l)) {
                return bmhg0;
            }
        }
        throw new bmhf(s);
    }

    @Override
    public final String toString() {
        return this.l;
    }
}

