public enum azqp {
    DEFAULT(true, null),
    VERSION_TOO_LOW(true, null),
    STAMP_NOT_NEEDED(true, null),
    NO_STAMP(false, "The APK does not have a source stamp."),
    CANNOT_VERIFY(false, "Cannot verify the source stamp on the apk."),
    UNKNOWN_STAMP(false, "The APK is stamped with an unknown stamp."),
    MULTIPLE_SIGNERS_INVALID(false, "The APK that we checked the stamp on has more than one signer."),
    APK_NOT_SIGNED(false, "The APK that we checked the stamp on is not signed with a valid v2 or v3 signing certificate."),
    SIGNING_CERT_MISMATCH(false, "The certificate that signed APK is different than the certificate provided by the platform."),
    GENERIC_ERROR(false, "Generic error."),
    CERT_ENCODING_ERROR(false, "Signing cert cannot be encoded."),
    CERT_RETRIEVAL_ERROR(false, "Cannot retrieve certificate from platform.");

    public final boolean m;
    public final String n;

    private azqp(boolean z, String s1) {
        this.m = z;
        this.n = s1;
    }
}

