import android.content.Context;
import android.content.res.Resources.NotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public final class ehkc {
    public static final int a;
    private static final bboh b;

    static {
        ehkc.b = bboh.b("LoadBlacklist", bbcu.f);
    }

    public static final Set a(Context context0) {
        BufferedReader bufferedReader1;
        Set set0 = new HashSet();
        BufferedReader bufferedReader0 = null;
        try {
            bufferedReader1 = new BufferedReader(new InputStreamReader(context0.getResources().openRawResource(0x7F140247)));  // raw:romanesco_backup_contacts_blacklist_account_types
            goto label_6;
        }
        catch(IOException | Resources.NotFoundException exception0) {
            goto label_12;
            try {
                while(true) {
                label_6:
                    String s = bufferedReader1.readLine();
                    if(s == null) {
                        goto label_22;
                    }
                    set0.add(s);
                }
            }
            catch(IOException | Resources.NotFoundException exception0) {
            }
            catch(Throwable throwable0) {
                bufferedReader0 = bufferedReader1;
                bbpb.b(bufferedReader0);
                throw throwable0;
            }
            bufferedReader0 = bufferedReader1;
            try {
            label_12:
                ((ggtj)((ggtj)((ggtj)ehkc.b.i()).s(exception0)).ar(0x318E)).x("Failed to read blacklist from file.");
                goto label_16;
            }
            catch(Throwable throwable0) {
            }
            bbpb.b(bufferedReader0);
            throw throwable0;
        }
        catch(Throwable throwable0) {
            bbpb.b(bufferedReader0);
            throw throwable0;
        }
    label_16:
        bbpb.b(bufferedReader0);
        return set0;
    label_22:
        bbpb.b(bufferedReader1);
        return set0;
    }
}

