public enum bngn {
    NFC_ENABLE_FRAGMENT("NfcEnable"),
    NFC_INSTRUCTIONS_FRAGMENT("NfcInstructions"),
    TRANSPORT_SELECTION_FRAGMENT("TransportSelection"),
    USB_INSTRUCTIONS_FRAGMENT("UsbInstructions"),
    PIN_CREATION_FRAGMENT("PinCreation"),
    PIN_CONFIRMATION_FRAGMENT("PinConfirmation");

    public final String g;

    private bngn(String s1) {
        this.g = s1;
    }

    @Override
    public final String toString() {
        return this.g;
    }
}

