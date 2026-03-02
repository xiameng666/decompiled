public enum fwzf {
    LOCATOR("NetworkLocationLocator", 1),
    @Deprecated
    ACTIVE_COLLECTOR("NetworkLocationActiveCollector", 1),
    BURST_COLLECTOR("NetworkLocationBurstCollector", 1),
    PASSIVE_COLLECTOR("NetworkLocationPassiveCollector", 1),
    @Deprecated
    DAILY_UPLOADER("NetworkLocationDailyUploader", 1),
    CALIBRATION_COLLECTOR("NetworkLocationCalibrationCollector", 1),
    SENSOR_COLLECTOR("NetworkLocationSCollector", 1),
    SENSOR_UPLOADER("NetworkLocationSensorUploader", 1),
    ACTIVITY_DETECTION("NetworkLocationActivityDetection", 0),
    IN_OUT_DOOR_COLLECTOR("NetworkLocationInOutCollector", 1),
    BURST_COLLECTION_TRIGGER("NetworkLocationBurstCollectionTrigger", 1),
    VEHICLE_EXIT_DETECTOR("NetworkLocationVehicleExitDetector", 0),
    @Deprecated
    GESTURE_DETECTOR("NetworkLocationGestureDetector", 0),
    GLS_QUERY("Gls-Query", 1),
    GLS_UPLOAD("Gls-Upload", 0),
    @Deprecated
    GLS_LOC_QUERY("Gls-LocQuery", 0),
    CALLBACK_RUNNER("CallbackRunner", 2),
    PENDING_INTENT("PendingIntentClient", 2),
    COLLECTIONLIB("CollectionLib", 2),
    COLLECTIONLIB_REPLAYER("CollectionLib-Replayer", 2),
    COLLECTIONLIB_SIG_COLLECTOR("CollectionLib-SigCollector", 2),
    SCANNER("NetworkLocationScanner", 3),
    WATCHDOG("NetworkLocationWatchdog", 1);

    public final String x;
    public final int y;

    private fwzf(String s1, int v1) {
        this.x = s1;
        this.y = v1;
    }
}

