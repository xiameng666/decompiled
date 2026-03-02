import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra;
import java.util.ArrayList;

public final class esmd {
    public static CardIconMessage a(String s, int v, int[] arr_v) {
        CardIconMessage cardIconMessage0 = new CardIconMessage();
        cardIconMessage0.c = s;
        cardIconMessage0.b = v;
        cardIconMessage0.a = arr_v;
        return cardIconMessage0;
    }

    public static etrt b(String s, Bitmap bitmap0, String s1, Intent[] arr_intent) {
        WalletCardIntentExtra[] arr_walletCardIntentExtra;
        etrt etrt0 = new etrt();
        etrt0.a(s);
        QuickAccessWalletCard quickAccessWalletCard0 = etrt0.a;
        quickAccessWalletCard0.b = bitmap0;
        quickAccessWalletCard0.c = s1;
        WalletCardIntent[] arr_walletCardIntent = new WalletCardIntent[2];
        int v = 0;
        while(v < 2) {
            Intent intent0 = arr_intent[v];
            ComponentName componentName0 = intent0.getComponent();
            if(componentName0 == null) {
                throw new IllegalArgumentException("Intents must be fully qualified");
            }
            String s2 = intent0.getAction();
            if(s2 == null) {
                throw new IllegalArgumentException("Intent requires an action");
            }
            WalletCardIntent walletCardIntent0 = new WalletCardIntent();
            walletCardIntent0.a = componentName0.getClassName();
            walletCardIntent0.b = s2;
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 == null) {
                arr_walletCardIntentExtra = new WalletCardIntentExtra[0];
            }
            else {
                ArrayList arrayList0 = new ArrayList(bundle0.size());
                for(Object object0: bundle0.keySet()) {
                    WalletCardIntentExtra walletCardIntentExtra0 = new WalletCardIntentExtra();
                    walletCardIntentExtra0.a = (String)object0;
                    Object object1 = bundle0.get(((String)object0));
                    if(object1 == null) {
                        continue;
                    }
                    if((object1 instanceof Integer)) {
                        walletCardIntentExtra0.b = 4;
                        walletCardIntentExtra0.f = (int)(((Integer)object1));
                        arrayList0.add(walletCardIntentExtra0);
                        continue;
                    }
                    if((object1 instanceof Long)) {
                        walletCardIntentExtra0.b = 5;
                        walletCardIntentExtra0.g = (long)(((Long)object1));
                        arrayList0.add(walletCardIntentExtra0);
                        continue;
                    }
                    if((object1 instanceof String)) {
                        walletCardIntentExtra0.b = 1;
                        walletCardIntentExtra0.c = (String)object1;
                        arrayList0.add(walletCardIntentExtra0);
                        continue;
                    }
                    if((object1 instanceof byte[])) {
                        walletCardIntentExtra0.b = 2;
                        walletCardIntentExtra0.d = (byte[])object1;
                        arrayList0.add(walletCardIntentExtra0);
                        continue;
                    }
                    if(!(object1 instanceof Boolean)) {
                        throw new IllegalArgumentException("Unhandled extra of type " + object1.getClass());
                    }
                    walletCardIntentExtra0.b = 3;
                    walletCardIntentExtra0.e = ((Boolean)object1).booleanValue();
                    arrayList0.add(walletCardIntentExtra0);
                    continue;
                }
                arr_walletCardIntentExtra = (WalletCardIntentExtra[])arrayList0.toArray(new WalletCardIntentExtra[0]);
            }
            walletCardIntent0.c = arr_walletCardIntentExtra;
            arr_walletCardIntent[v] = walletCardIntent0;
            ++v;
            continue;
        }
        quickAccessWalletCard0.d = arr_walletCardIntent;
        return etrt0;
    }
}

