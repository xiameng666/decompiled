public enum giah implements hfub {
    UNSPECIFIED(0),
    SAFETY_CENTER(1),
    PROMOTIONAL_NOTIFICATION(2),
    BBG1_OPT_IN(3),
    BACKUP_NOW_NOTIFICATION(4),
    GOOGLE_SETTINGS_BACKUP_CARD(5),
    GOOGLE_SETTINGS_BACKUP_ITEM(6),
    GOOGLE_ONE_APP(7),
    NO_BACKUP_NOTIFICATION(8),
    MISSING_BACKUP_ACCOUNT_NOTIFICATION(9),
    MMS_MSA_NOTIFICATION(10),
    ACCOUNT_CHANGE_INTENT_OPERATION(11),
    GMS_BACKUP_TRANSPORT(12),
    SETTINGS_BACKUP_OR_RESTORE_ITEM(13),
    HS_FLOW(14);

    public final int p;

    private giah(int v1) {
        this.p = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.p;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}

