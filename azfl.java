enum azfl implements azgc {
    PLC_HASH_COLLISION("PlcHashCollision", azbc.N),
    PLC_TO_BYTES_FAIL("PlcToByteFail", azbc.O),
    LOG_FILE_TOO_OLD("LogFileTooOld", azbc.P),
    CORRUPTED_PLC_FILE("CorruptedPlcFile", azbc.Q),
    FAIL_TO_DELETE_PLC_DIR("FailedToDeletePlcDir", azbc.R),
    DIR_HAS_NO_PLC_FILE("DirHasNoPlcFile", azbc.S),
    CORRUPTED_LOG_FILE_NAME("CorruptedLogFileName", azbc.T),
    CORRUPTED_LOG_FILE_CONTENTS("CorruptedLogFileContents", azbc.U),
    FAIL_TO_READ_PLC_FILE("FailedToReadPlcFile", azbc.V),
    FAIL_TO_PARSE_PLC_DIR_NAME("FailedToParsePlcDirName", azbc.W),
    PLC_HASH_MISMATCH("PlcHashMismatch", azbc.X),
    FAIL_TO_PARSE_PLC_PROTO("FailToParsePlcProto", azbc.Y),
    DIR_TRAVERSAL_ATTACK("DirTraversalAttack", azbc.Z),
    EMPTY_LOG_EVENT("EmptyLogEvent", azbc.aa);

    public final String o;
    public final azbc p;

    private azfl(String s1, azbc azbc0) {
        this.o = s1;
        this.p = azbc0;
    }

    @Override  // azgc
    public final azbc a() {
        return this.p;
    }

    @Override
    public final String toString() {
        return this.o;
    }
}

