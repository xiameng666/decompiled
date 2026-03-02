import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.PeerConnection.AdapterType;

final class czyn implements czyx {
    final czyo a;

    public czyn(czyo czyo0) {
        Objects.requireNonNull(czyo0);
        this.a = czyo0;
        super();
    }

    @Override  // czyx
    public final void a(czze czze0) {
        int v1;
        czyo czyo0 = this.a;
        AtomicReference atomicReference0 = czyo0.e;
        int v = 8;
        switch(((PeerConnection.AdapterType)atomicReference0.get()).ordinal()) {
            case 1: {
                v1 = 9;
                break;
            }
            case 2: {
                v1 = 7;
                break;
            }
            case 4: {
                v1 = 10;
                break;
            }
            case 5: {
                v1 = 11;
                break;
            }
            case 6: {
                v1 = 12;
                break;
            }
            case 3: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                v1 = 8;
                break;
            }
            default: {
                v1 = 1;
            }
        }
        czze0.f = v1;
        switch(((PeerConnection.AdapterType)atomicReference0.get()).ordinal()) {
            case 2: {
                v = czmk.ad(dack.a(czyo0.b.getApplicationContext()).a());
                break;
            }
            case 3: {
                ConnectivityManager connectivityManager0 = (ConnectivityManager)czyo0.b.getSystemService("connectivity");
                if(connectivityManager0 == null) {
                    v = 1;
                }
                else {
                    NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                    if(networkInfo0 != null && networkInfo0.isConnected() && networkInfo0.getType() == 0) {
                        switch(networkInfo0.getSubtype()) {
                            case 1: 
                            case 2: 
                            case 4: 
                            case 7: 
                            case 11: 
                            case 16: {
                                goto label_34;
                            }
                            case 3: 
                            case 5: 
                            case 6: 
                            case 8: 
                            case 9: 
                            case 10: 
                            case 12: 
                            case 14: 
                            case 15: 
                            case 17: {
                                goto label_36;
                            }
                            case 13: 
                            case 18: 
                            case 19: {
                                goto label_38;
                            }
                            case 20: {
                                break;
                            }
                            default: {
                                v = 1;
                            }
                        }
                    }
                    else {
                        v = 1;
                    }
                }
                break;
            }
            case 7: {
            label_34:
                v = 5;
                break;
            }
            case 8: {
            label_36:
                v = 6;
                break;
            }
            case 9: {
            label_38:
                v = 7;
                break;
            }
            case 10: {
                break;
            }
            default: {
                v = 1;
            }
        }
        czze0.g = v;
        czze0.b = ((PeerConnection.AdapterType)atomicReference0.get()).ordinal() == 2 ? dack.a(czyo0.b.getApplicationContext()).a() : -1;
        czkq.a.b().p("Data channel state changed to connected.", new Object[0]);
        czyo0.g.c(czze0);
    }

    @Override  // czyx
    public final void b(czze czze0) {
        this.a.g.b(czze0);
    }
}

