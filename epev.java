public enum epev {
    TERMS_OF_SERVICE(0x7F152B35, "setup_google_tos_url", "https://www.google.com/intl/%s/policies/terms/embedded", "file:///android_asset/html/en_us/google-tos.html"),  // string:setupservices_google_terms_of_service_title "Google Terms of Service"
    TERMS_OF_SERVICE_AUTO(0x7F152B35, "setup_google_tos_url", "https://policies.google.com/terms/embedded?color_scheme=dark", null),  // string:setupservices_google_terms_of_service_title "Google Terms of Service"
    TERMS_OF_SERVICE_GERMANY(0x7F152B35, "setup_google_tos_url_germany", "https://accounts.google.com/TOS?loc=DE&hl=de", null),  // string:setupservices_google_terms_of_service_title "Google Terms of Service"
    PRIVACY_POLICY(0x7F152AD1, "setup_google_privacy_url", "https://policies.google.com/privacy/embedded?hl=%s", "file:///android_asset/html/en_us/google-privacy.html"),  // string:setupservices_google_privacy_policy_title "Google Privacy Policy"
    PRIVACY_POLICY_AUTO(0x7F152AD1, "setup_google_privacy_url", "https://policies.google.com/privacy/embedded?color_scheme=dark", null),  // string:setupservices_google_privacy_policy_title "Google Privacy Policy"
    PRIVACY_POLICY_GERMANY(0x7F152AD1, "setup_google_privacy_url_germany", "https://accounts.google.com/TOS?loc=DE&privacy=true", null),  // string:setupservices_google_privacy_policy_title "Google Privacy Policy"
    PRIVACY_POLICY_KIDS(0x7F152AD1, "setup_google_privacy_url_kids", "https://support.google.com/families?p=accountpolicies", null),  // string:setupservices_google_privacy_policy_title "Google Privacy Policy"
    ADDITIONAL_PRIVACY_KOREA(0x7F152A76, "personal_info_url_korea", "https://www.google.co.kr/intl/ko/policies/privacy/additional/", null),  // string:setupservices_additional_privacy_title "Additional Privacy Information"
    LOCATION_TOS_KOREA(0x7F152B4F, "location_tos_url_korea", "https://www.google.co.kr/intl/ko/policies/terms/location/", null),  // string:setupservices_location_tos_title "Location Terms of Service"
    APP_PERMISSIONS_KOREA(0x7F152AC8, "auth_google_app_permissions_url", "https://support.google.com/googleplay/?p=core_app_permissions", null),  // string:setupservices_google_access_right_title "Access Rights of Google apps"
    AUTOMOTIVE_MAPS_TOS(0x7F152AA0, null, "https://www.google.com/help/terms_maps/?color_scheme=dark", null),  // string:setupservices_auto_maps_tos_title "Maps Terms of Service"
    GOOGLE_DATA_USE(0x7F152AC9, "how_google_uses_data_url", "http://support.google.com/pixelphone?p=usage_diagnostic_data", "http://support.google.com/googlepixeltablet?p=data_collection", null),  // string:setupservices_google_data_use_title "Learn more about how Google uses this 
                                                                                                                                                                                                     // data"
    SAFTY_DATA(0x7F152AD2, "google_safety_data_url", "http://support.google.com/pixelphone?p=safety_data&hl=%s", "http://support.google.com/googlepixeltablet?p=safety_metrics&hl=%s", null),  // string:setupservices_google_safety_data_title "Safety data"
    LOCATION_ACCURACY(0x7F152ACB, "google_location_accuracy_url", "https://support.google.com/android/?p=location_accuracy-embedded&hl=%s", "https://support.google.com/android/?p=location_accuracy-embedded&hl=%s", "g.co/Android/LocationAccuracy", null),  // string:setupservices_google_location_accuracy_title "How Location Accuracy processes 
                                                                                                                                                                                                                                                               // your data"
    CHROME_TOS(0x7F152AB4, null, "https://www.google.com/intl/en-us/chrome/terms/", null);  // string:setupservices_chrome_tos_title "Chrome Terms of Service"

    public final int p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    static {
        bboh.b("AndroidPolicy", bbcu.dR);
    }

    private epev(int v1, String s1, String s2, String s3) {
        this(v1, s1, s2, null, s3);
    }

    private epev(int v1, String s1, String s2, String s3, String s4) {
        this(v1, s1, s2, s3, null, s4);
    }

    private epev(int v1, String s1, String s2, String s3, String s4, String s5) {
        this.p = v1;
        this.q = s1;
        this.r = s2;
        this.s = s3;
        this.t = s4;
        this.u = s5;
    }
}

