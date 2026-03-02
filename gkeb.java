public enum gkeb implements hfub {
    UNKNOWN_CONTEXT(0),
    NOW_SERVICE(1),
    CALL_MANAGER(2),
    @Deprecated
    VANAGON_LIFETIME(3),
    ACTIVATION(4),
    @Deprecated
    PROJECTED_LIFETIME(5),
    STARTUP_PERF(6),
    LIFETIME(7),
    DIAGNOSTICS(8),
    LOCATION(9),
    SETTINGS(10),
    HATS_SURVEY(11),
    PERMISSIONS(12),
    MESSAGING(13),
    AUTO_LAUNCH(14),
    PLAY_STORE(15),
    CLOUD_CARD_SERVICE(16),
    NOTIFICATION_LISTENER(17),
    EXPERIMENT(18),
    MEDIA_SESSION(19),
    DRIVING_MODE(20),
    @Deprecated
    MEDIA_BROWSE(21),
    LENS_SWITCHER(22),
    BLUETOOTH(23),
    DRIVING_MODE_GEARHEAD_SETTING_COPIER(24),
    DRIVING_MODE_DND_SETTING_COPIER(25),
    COMPATIBLE_APPS(26),
    CAR_SERVICE(27),
    FZERO(28),
    CRASH_CONTEXT(29),
    DRIVING_MODE_LOCATION(30),
    SYSTEM_UI(0x1F),
    WIRELESS(0x20),
    PROCESS_PRIORITY(33),
    CALL_CLIENT_CALL_ADAPTER(34),
    TESTING(35),
    LOCAL_ICS_CALL_ADAPTER(36),
    STARTUP_MEASURE(37),
    ASSISTANT_EDUCATION(38),
    ASSISTANT_SUGGESTION(39),
    HEAD_UNIT_UPDATER(40),
    PROJECTION_CONTEXT(41);

    private final int R;

    private gkeb(int v1) {
        this.R = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.R;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.R);
    }
}

