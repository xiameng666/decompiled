public enum tft {
    TIMER_EXPIRED(1001, "Timer Expired"),
    PAYMENT_FAILED(1002, "Payment Failed"),
    NO_SUCH_CARD(1004, "Card not available"),
    PAYMENT_KEY_NOT_AVAILABLE(1005, "Payment Key Not available"),
    INTERNAL_ERROR(1007, "Internal Error"),
    INVALID_CVM(0x3F0, "Invalid CVM"),
    NO_NFC_ADAPTER_FOUND(1009, "NFC Adapter is not found"),
    NFC_ADAPTER_DISABLED(1010, "NFC Adapter is disabled"),
    DECLINED(0x3F3, "Transaction is declined by card"),
    CDCVM_REQUIRED(0x3F4, "Consumer Device CVM is required"),
    NFC_LINK_LOST(0x3F5, "NFC link is lost"),
    UNKNOWN_AID(0x3F6, "AID is unknown"),
    PAYMENT_TERMINATED(0x3F7, "Payment terminated"),
    ERROR_INVALID_INPUT(0x3F8, "Error invalid input"),
    ERROR_STATE(0x3F9, "Error state"),
    DISABLED_CARD(0x3FA, "Disabled card"),
    THRESHOLD_EXCEEDED_1(0x3FB, "Threshold 1 exceeded"),
    THRESHOLD_EXCEEDED_2(1020, "Threshold 2 exceeded");

    private final int t;
    private final String u;

    private tft(int v1, String s1) {
        this.t = v1;
        this.u = s1;
    }

    @Override
    public final String toString() {
        return this.t + ": " + this.u;
    }
}

