public enum bmky {
    MULTI_TRANSPORT("multiple_transports"),
    NFC("nfc_instructions"),
    NFC_ENABLE("nfc_enable"),
    NFC_KEY_DISCOVERED("nfc_key_discovered"),
    NFC_REMOVE_KEY("nfc_remove_key"),
    BLE("ble_instructions"),
    BLE_ENABLE("ble_enable"),
    BLE_PAIR("ble_pair_device"),
    BLE_PROCESS_REQUEST("ble_processing"),
    BLE_SELECT("ble_select_device"),
    USB("usb_instructions"),
    INTERNAL_TRANSPORT_USER_SELECTED("internal_transport_user_selected"),
    INTERNAL_TRANSPORT_CHALLENGE("internal_transport_challenge"),
    INTERNAL_TRANSPORT_CHALLENGE_COMPLETED("internal_transport_challenge_completed"),
    REQUEST_VALIDATION("request_validation");

    public final String p;

    private bmky(String s1) {
        this.p = s1;
    }

    @Override
    public final String toString() {
        return this.p;
    }
}

