import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

public final class knn {
    public static final kle a(String s, String s1) {
        if(ibuq.m(s, "CREATE_CANCELED")) {
            return new klb(s1);
        }
        return ibuq.m(s, "CREATE_INTERRUPTED") ? new klf(s1) : new kli(s1);
    }

    public static final kln b(String s, String s1) {
        if(s != null) {
            switch(s.hashCode()) {
                case 0xA28AB13D: {
                    if(s.equals("GET_CANCELED_TAG")) {
                        return new klk(s1);
                    }
                    break;
                }
                case 0xF6C91299: {
                    if(s.equals("GET_INTERRUPTED")) {
                        return new klo(s1);
                    }
                    break;
                }
                case 0x77034D87: {
                    if(s.equals("GET_NO_CREDENTIALS")) {
                        return new kls(s1);
                    }
                    break;
                }
                default: {
                    return new klq(s1);
                }
            }
        }
        return new klq(s1);
    }

    public static final void c(ResultReceiver resultReceiver0, String s, String s1) {
        ibuq.f(resultReceiver0, "<this>");
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("FAILURE_RESPONSE", true);
        bundle0.putString("EXCEPTION_TYPE", s);
        bundle0.putString("EXCEPTION_MESSAGE", s1);
        resultReceiver0.send(0x7FFFFFFF, bundle0);
    }

    public static final void d(ResultReceiver resultReceiver0, int v, int v1, Intent intent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("FAILURE_RESPONSE", false);
        bundle0.putInt("ACTIVITY_REQUEST_CODE", v);
        bundle0.putParcelable("RESULT_DATA", intent0);
        resultReceiver0.send(v1, bundle0);
    }
}

