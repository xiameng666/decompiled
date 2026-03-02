import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;

public final class ehfl {
    public static girk a(boolean z, gjgi gjgi0, girk girk0, Exception exception0, ehim ehim0, int v) {
        girk girk2;
        String s;
        egig.c("FSA2_GrpcExceptionHandler", String.format(Locale.US, "Exception when doing operation %s to dataType %s", ((int)girk0.j), ((int)gjgi0.k)), exception0);
        girk girk1 = girk.a;
        if((exception0 instanceof JSONException)) {
            ++((ehiv)ehim0).a.stats.numParseExceptions;
            s = "JSON_EXCEPTION";
            girk2 = girk1;
        }
        else if((exception0 instanceof ArrayStoreException)) {
            ++((ehiv)ehim0).a.stats.numParseExceptions;
            s = "ARRAY_STORE_EXCEPTION";
            girk2 = girk1;
        }
        else if((exception0 instanceof ehfd)) {
            ++((ehiv)ehim0).a.stats.numIoExceptions;
            s = "PEOPLE_SYNC_GRPC_EXCEPTION";
            girk2 = girk1;
        }
        else if((exception0 instanceof acse)) {
            ++((ehiv)ehim0).a.stats.numAuthExceptions;
            s = "GOOGLE_AUTH_EXCEPTION";
            girk2 = girk1;
        }
        else if((exception0 instanceof iapl)) {
            s = ((iapl)exception0).a.t.name();
        alab1:
            switch(((iapl)exception0).a.t.ordinal()) {
                case 3: {
                    egiv.R();
                    if(egiv.f().booleanValue()) {
                        ++((ehiv)ehim0).a.stats.numParseExceptions;
                    }
                    else {
                        ++((ehiv)ehim0).a.stats.numIoExceptions;
                    }
                    goto label_70;
                }
                case 5: {
                    switch(girk0.ordinal()) {
                        case 2: {
                            if(!z) {
                                if(gjgi0 != gjgi.d && gjgi0 != gjgi.j) {
                                    girk2 = girk.d;
                                }
                                else {
                                    ++((ehiv)ehim0).a.stats.numParseExceptions;
                                    girk2 = girk1;
                                }
                            }
                            else if(gjgi0 != gjgi.d && gjgi0 != gjgi.j || girk0 != girk.c) {
                                goto label_70;
                            }
                            else if(hxde.a.b().a()) {
                                girk2 = girk.d;
                            }
                            else {
                                ++((ehiv)ehim0).a.stats.numParseExceptions;
                                girk2 = girk1;
                            }
                            break alab1;
                        }
                        case 3: {
                            ehim0.h(girk0, gjgi0, z, 3, v);
                            girk2 = girk.d;
                            break alab1;
                        }
                        default: {
                            ++((ehiv)ehim0).a.stats.numParseExceptions;
                            girk2 = girk1;
                            break alab1;
                        }
                    }
                }
                case 6: {
                    ++((ehiv)ehim0).a.stats.numParseExceptions;
                    girk2 = girk1;
                    break;
                }
                case 8: {
                    ++((ehiv)ehim0).a.stats.numParseExceptions;
                    girk2 = girk1;
                    break;
                }
                case 9: 
                case 12: 
                case 15: {
                    ++((ehiv)ehim0).a.stats.numParseExceptions;
                    girk2 = girk1;
                    break;
                }
                default: {
                    ++((ehiv)ehim0).a.stats.numIoExceptions;
                    girk2 = girk1;
                }
            }
        }
        else {
            if((exception0 instanceof ehfa)) {
                ++((ehiv)ehim0).a.stats.numIoExceptions;
                s = String.valueOf(((ehfa)exception0).a);
            }
            else {
                ++((ehiv)ehim0).a.stats.numIoExceptions;
                s = "UNKNOWN_EXCEPTION";
            }
        label_70:
            girk2 = girk1;
        }
        if(girk2 == girk1) {
            ehim0.r(gjgi0, girk0, s, exception0);
            ehim0.h(girk0, gjgi0, z, 2, v);
        }
        return girk2;
    }

    public static List b(String s) {
        if(s != null && s.contains(hwzc.a.c().X())) {
            int v = s.indexOf("[");
            int v1 = s.indexOf("]", v);
            if(v >= 0 && v1 >= 0) {
                return Arrays.asList(s.substring(v + 1, v1).split(","));
            }
            egig.k("FSA2_GrpcExceptionHandler", "Unexpected error format for invalid group membership.");
            return new ArrayList();
        }
        return Arrays.asList(new String[0]);
    }
}

