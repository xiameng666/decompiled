public final class gbbh {
    public static String a(int v) {
        switch(v) {
            case 1: 
            case 2: {
                return "oauth2:https://www.googleapis.com/auth/sierra";
            }
            case 22: 
            case 24: {
                return "";
            }
            default: {
                return "oauth2:https://www.googleapis.com/auth/sierrasandbox";
            }
        }
    }

    public static String b(String s) {
        return "Bearer " + s;
    }

    public static byte[] c(hhna hhna0, int v) {
        for(Object object0: hhna0.d) {
            hfrn hfrn0 = (hfrn)object0;
            if(hfrn0.b.equals((v == 0 ? "type.googleapis.com/moneta.orchestration2.framework.errors.OrchestrationPayload" : "type.googleapis.com/moneta.serving.errors.PublicPaymentsError"))) {
                return hfrn0.c.toByteArray();
            }
        }
        return null;
    }
}

