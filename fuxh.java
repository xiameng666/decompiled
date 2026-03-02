public enum fuxh {
    IN_VEHICLE(0),
    ON_BICYCLE(1),
    ON_FOOT(2),
    STILL(3),
    UNKNOWN(4),
    TILTING(5),
    EXITING_VEHICLE(6),
    WALKING(7),
    RUNNING(8),
    OFF_BODY(9),
    @Deprecated
    TRUSTED_GAIT(10),
    @Deprecated
    FLOOR_CHANGE(11),
    @Deprecated
    ON_STAIRS(12),
    @Deprecated
    ON_ESCALATOR(13),
    @Deprecated
    IN_ELEVATOR(14),
    SLEEPING(15),
    IN_ROAD_VEHICLE(16),
    IN_RAIL_VEHICLE(17),
    IN_TWO_WHEELER_VEHICLE(18),
    IN_FOUR_WHEELER_VEHICLE(19),
    IN_CAR(20),
    IN_BUS(21),
    CAR_CRASH(22);

    public final int x;

    private fuxh(int v1) {
        this.x = v1;
    }
}

