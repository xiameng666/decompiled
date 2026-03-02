public enum bnfl {
    MULTI_TRANSPORT("multiple_transports"),
    NFC("nfc_instructions"),
    NFC_ENABLE("nfc_enable"),
    NFC_KEY_DISCOVERED("nfc_key_discovered"),
    NFC_REMOVE_KEY("nfc_remove_key"),
    USB("usb_instructions"),
    ESK("esk_instructions"),
    PIN_CREATE("client_pin_create"),
    PIN_CONFIRM("client_pin_confirm");

    public final String j;

    private bnfl(String s1) {
        this.j = s1;
    }

    @Override
    public final String toString() {
        return this.j;
    }
}

