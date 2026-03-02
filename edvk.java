import android.content.Intent;
import com.google.android.gms.pay.AddItemsConfig;
import com.google.android.gms.pay.ApiLoaderConfig;
import com.google.android.gms.pay.GridConfig;
import com.google.android.gms.pay.NavigationConfig;
import com.google.android.gms.pay.OnboardingConfig;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.PaymentMethodsConfig;
import com.google.android.gms.pay.PresentationConfig;
import com.google.android.gms.pay.SortOrderInfo;
import com.google.android.gms.pay.ValuablesConfig;
import com.google.android.gms.pay.WalletFrameworkConfig;
import com.google.android.gms.pay.WalletListConfig;
import java.util.ArrayList;

public final class edvk {
    public static Intent a(int v) {
        return edvk.b(false, v);
    }

    public static Intent b(boolean z, int v) {
        ArrayList arrayList0 = new ArrayList();
        if(((int)z) && hwwt.j()) {
            ApiLoaderConfig apiLoaderConfig0 = new ApiLoaderConfig();
            apiLoaderConfig0.a = 1;
            ValuablesConfig valuablesConfig0 = new ValuablesConfig();
            PassFilter passFilter0 = new PassFilter();
            passFilter0.h = 4;
            valuablesConfig0.a = passFilter0;
            apiLoaderConfig0.c = valuablesConfig0;
            arrayList0.add(apiLoaderConfig0);
        }
        else {
            ApiLoaderConfig apiLoaderConfig1 = new ApiLoaderConfig();
            apiLoaderConfig1.a = 1;
            arrayList0.add(apiLoaderConfig1);
        }
        if(((int)z)) {
            ApiLoaderConfig apiLoaderConfig2 = new ApiLoaderConfig();
            apiLoaderConfig2.a = 5;
            arrayList0.add(apiLoaderConfig2);
            ApiLoaderConfig apiLoaderConfig3 = new ApiLoaderConfig();
            apiLoaderConfig3.a = 6;
            arrayList0.add(apiLoaderConfig3);
        }
        else {
            ApiLoaderConfig apiLoaderConfig4 = new ApiLoaderConfig();
            apiLoaderConfig4.a = 3;
            PaymentMethodsConfig paymentMethodsConfig0 = new PaymentMethodsConfig();
            paymentMethodsConfig0.a = new int[]{1, 2, 6, 7};
            apiLoaderConfig4.b = paymentMethodsConfig0;
            arrayList0.add(apiLoaderConfig4);
        }
        if(((int)z) && hwwt.k()) {
            ApiLoaderConfig apiLoaderConfig5 = new ApiLoaderConfig();
            apiLoaderConfig5.a = 4;
            arrayList0.add(apiLoaderConfig5);
        }
        if(((int)z)) {
            ApiLoaderConfig apiLoaderConfig6 = new ApiLoaderConfig();
            apiLoaderConfig6.a = 2;
            arrayList0.add(apiLoaderConfig6);
        }
        if(((int)z) && hwwt.a.b().l()) {
            ApiLoaderConfig apiLoaderConfig7 = new ApiLoaderConfig();
            apiLoaderConfig7.a = 8;
            arrayList0.add(apiLoaderConfig7);
        }
        if(((int)z)) {
            ApiLoaderConfig apiLoaderConfig8 = new ApiLoaderConfig();
            apiLoaderConfig8.a = 7;
            arrayList0.add(apiLoaderConfig8);
        }
        dmrf dmrf0 = new dmrf();
        dmrf0.e(v);
        WalletFrameworkConfig walletFrameworkConfig0 = new WalletFrameworkConfig();
        WalletListConfig walletListConfig0 = new WalletListConfig();
        walletListConfig0.a = (ApiLoaderConfig[])arrayList0.toArray(new ApiLoaderConfig[0]);
        SortOrderInfo sortOrderInfo0 = new SortOrderInfo();
        sortOrderInfo0.a = 2;
        walletListConfig0.c = sortOrderInfo0;
        PresentationConfig presentationConfig0 = new PresentationConfig();
        presentationConfig0.a = 1;
        GridConfig gridConfig0 = new GridConfig();
        gridConfig0.a = 1;
        presentationConfig0.b = gridConfig0;
        walletListConfig0.b = presentationConfig0;
        walletFrameworkConfig0.b = walletListConfig0;
        NavigationConfig navigationConfig0 = new NavigationConfig();
        dlgj.b(navigationConfig0);
        dlgj.a(navigationConfig0);
        walletFrameworkConfig0.a = navigationConfig0;
        AddItemsConfig addItemsConfig0 = new AddItemsConfig();
        addItemsConfig0.a = true;
        walletFrameworkConfig0.d = addItemsConfig0;
        OnboardingConfig onboardingConfig0 = new OnboardingConfig();
        onboardingConfig0.a = ((int)z) ^ 1;
        walletFrameworkConfig0.c = onboardingConfig0;
        dmrf0.b.a.a = walletFrameworkConfig0;
        return dmrf0.c();
    }
}

