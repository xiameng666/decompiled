import java.util.List;

public final class bdtw {
    public static final String a(List list0, goz goz0) {
        String s;
        goz0.M(-626820462);
        switch(list0.size()) {
            case 0: {
                goz0.M(0xBFAF29FC);
                goz0.A();
                throw new IllegalStateException("Cannot create section summary of empty list");
            }
            case 1: {
                goz0.M(-1079036550);
                s = isq.d(0x7F1526EB, new Object[]{((bdtx)list0.get(0)).a}, goz0);  // string:pwm_import_credentials_result_screen_section_summary_single_credential "%1$s"
                goz0.A();
                break;
            }
            case 2: {
                goz0.M(0xBFAF4890);
                s = isq.d(0x7F1526EC, new Object[]{((bdtx)list0.get(0)).a, ((bdtx)list0.get(1)).a}, goz0);  // string:pwm_import_credentials_result_screen_section_summary_two_credentials "%1$s, 
                                                                                                            // %2$s"
                goz0.A();
                break;
            }
            default: {
                goz0.M(0xBFAF5EB1);
                s = isq.d(0x7F1526EA, new Object[]{((bdtx)list0.get(0)).a, ((bdtx)list0.get(1)).a}, goz0);  // string:pwm_import_credentials_result_screen_section_summary_more_credentials "%1$s, 
                                                                                                            // %2$s, and others"
                goz0.A();
            }
        }
        goz0.A();
        return s;
    }
}

