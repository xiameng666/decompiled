public enum fuwu {
    PHONE_ACTIVITY_DNN(1501260402953L, 0x46B27F67L, "phone_activity_dnn.model.uncompressed"),
    PHONE_TWO_WHEELER_DNN(0x1604D40B8E5L, 0x7FF4624DL, "two_wheeler_dnn.model.jpg"),
    PHONE_ACTIVITY_CNN(1539060079283L, 3380417373L, "phone_activity_cnn.model.uncompressed"),
    PHONE_ACTIVITY(0x14C5D9D6A26L, "phone_activity.model.jpg"),
    PHONE_BAR_GRU_FOR_CHRE_DNN(0x166C89BBE6FL, "phone_bar_gru_for_chre_dnn.model.uncompressed"),
    PHONE_BAR_GRU_BATCH_FOR_OAR_DNN(1539020598205L, "phone_bar_gru_batch_for_oar_dnn.model.uncompressed"),
    PHONE_BAR_GRU_NON_BATCH_FOR_OAR_DNN(1539020353818L, "phone_bar_gru_non_batch_for_oar_dnn.model.uncompressed"),
    PHONE_BAR_GRU_BATCH_FOR_OAR_CNN(1539094352990L, "phone_bar_gru_batch_for_oar_cnn.model.uncompressed"),
    PHONE_BAR_GRU_NON_BATCH_FOR_OAR_CNN(1539094289514L, "phone_bar_gru_non_batch_for_oar_cnn.model.uncompressed"),
    WATCH_ACTIVITY(0x157537F3A54L, "watch_activity.model.jpg"),
    PHONE_POSITION(0x14CA0FDEE27L, "phone_position.model.jpg"),
    PHONE_POSITION_IN_VEHICLE(0x14CA0FD7FC2L, "phone_position_in_vehicle.model.jpg"),
    PHONE_POCKET_WALKING(0x15628FAF75DL, "phone_pocket_walking.model.jpg"),
    PHONE_SLEEP_DNN(0x16D751B47B0L, 0xE38F4E8BL, "sleep_activity_dnn.model.uncompressed"),
    WATCH_REP_SEGMENTATION(0x15135FEF182L, "rep_segmentation.model.jpg"),
    WATCH_AUTOFIT_EXERCISE(0x1552D59A45FL, "autofit_exercise.model.jpg"),
    PHONE_ACTIVITY_CONTEXT_HUB(1464026440157L, "context_hub_phone_activity.model.jpg");

    public final long r;
    public final long s;
    public final String t;

    private fuwu(long v1, long v2, String s1) {
        this.r = v1;
        this.s = v2;
        this.t = "armodel/" + s1;
    }

    private fuwu(long v1, String s1) {
        this(v1, -1L, s1);
    }
}

