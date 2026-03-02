public enum gzan implements hfub {
    UNKNOWN_SERVER_ACTION(0),
    UPLOAD_CERTIFICATES(1),
    DOWNLOAD_CERTIFICATES(2),
    CHECK_REACHABILITY(3),
    UPLOAD_CONTACTS(4),
    UPDATE_DEVICE_NAME(5),
    UPLOAD_SENDER_CERTIFICATES(6),
    DOWNLOAD_SENDER_CERTIFICATES(7),
    UPLOAD_CONTACTS_AND_CERTIFICATES(8),
    LIST_REACHABLE_PHONE_NUMBERS(9),
    LIST_MY_DEVICES(10),
    LIST_CONTACT_PEOPLE(11),
    DOWNLOAD_CERTIFICATES_INFO(12);

    public final int n;

    private gzan(int v1) {
        this.n = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.n;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}

