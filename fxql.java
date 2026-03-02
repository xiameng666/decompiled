import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.places.personalized.UserPlace;
import com.google.android.gms.location.places.personalized.UserPlacesResult;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fxql {
    public static final String[] a(Account account0, Context context0) {
        cnoc cnoc0 = new cnoc();
        cnoc0.d = account0.name;
        cnmr cnmr0 = cnnx.a(context0, new cnod(cnoc0));
        azzc azzc0 = new azzc();
        azzc0.a = new cnmn(cnmr0);
        azzc0.d = 0x7E3C;
        evql evql0 = cnmr0.iG(azzc0.a());
        try {
            evrg.o(evql0, hzek.a.i().L(), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            fxqw.f(("Exception on getUserPlaces:" + exception0.toString()));
            return null;
        }
        List list0 = ((UserPlacesResult)((azui)evql0.j()).a).b;
        if(list0 != null) {
            if(list0.isEmpty()) {
                return null;
            }
            String[] arr_s = new String[2];
            for(Object object0: list0) {
                UserPlace userPlace0 = (UserPlace)object0;
                String s = userPlace0.a;
                if(s != null) {
                    List list1 = userPlace0.b;
                    if(list1 != null && !list1.isEmpty()) {
                        if(list1.contains(Integer.valueOf(1))) {
                            arr_s[0] = s;
                        }
                        if(list1.contains(Integer.valueOf(2))) {
                            arr_s[1] = s;
                        }
                    }
                }
            }
            return arr_s[0] != null || arr_s[1] != null ? arr_s : null;
        }
        return null;
    }
}

