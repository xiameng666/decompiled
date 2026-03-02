import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.uiflows.addaccount.AddAccountController;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import j..util.Collection.-EL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class alwz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        alxb alxb0 = alxc.a();
        alxb0.d(AppContextProvider.a());
        alxb0.a = new ajcs(AppContextProvider.a());
        alxb0.b = new alxl(AppContextProvider.a());
        alxb0.h((hoxf.n() ? bbmn.s(AppContextProvider.a()) : bags.h(AppContextProvider.a())));
        alxb0.c = (AccountAuthenticatorResponse)parcel0.readParcelable(AccountAuthenticatorResponse.class.getClassLoader());
        alxb0.d = parcel0.readString();
        boolean z = true;
        alxb0.j(parcel0.readByte() != 0);
        alxb0.f(parcel0.readByte() != 0);
        alxb0.b(parcel0.readByte() != 0);
        alxb0.p(parcel0.readByte() != 0);
        alxb0.f = bagx.b(((Bundle)parcel0.readParcelable(Bundle.class.getClassLoader())));
        alxb0.l(parcel0.readByte() != 0);
        alxb0.g = parcel0.readString();
        alxb0.h = parcel0.readString();
        alxb0.i = parcel0.readString();
        String[] arr_s = parcel0.createStringArray();
        List list0 = arr_s == null ? new ArrayList() : Arrays.asList(arr_s);
        alxb0.c(((gged_interceptors)Collection.-EL.stream(list0).filter(new alxa()).collect(ggaf.a)));
        alxb0.e = parcel0.readString();
        alxb0.j = parcel0.readString();
        boolean z1 = parcel0.readByte() != 0;
        Intent intent0 = (Intent)parcel0.readParcelable(Intent.class.getClassLoader());
        Account account0 = (Account)parcel0.readParcelable(Account.class.getClassLoader());
        boolean z2 = parcel0.readByte() != 0;
        Intent intent1 = (Intent)parcel0.readParcelable(Intent.class.getClassLoader());
        String s = parcel0.readString();
        boolean z3 = hphd.c() && parcel0.readByte() != 0;
        boolean z4 = parcel0.readByte() != 0;
        boolean z5 = parcel0.readByte() != 0;
        boolean z6 = parcel0.readByte() != 0;
        String s1 = parcel0.readString();
        boolean z7 = parcel0.readByte() != 0;
        alxb0.i(parcel0.readByte() != 0);
        alxb0.n(parcel0.readByte() != 0);
        alxb0.m(parcel0.readByte() != 0);
        alxb0.k(parcel0.readByte() != 0);
        alxb0.k = ManagedAuthOptions.b(parcel0.createByteArray());
        alxb0.l = D2dOptions.a(parcel0.createByteArray());
        Bundle bundle0 = (Bundle)parcel0.readParcelable(alxy.class.getClassLoader());
        alxy alxy0 = bundle0 == null ? new alxy(0) : alxy.a(Integer.valueOf(bundle0.getInt("desired_flow", 0)));
        alxb0.m = parcel0.readString();
        alxb0.o(parcel0.readInt());
        alxb0.e(parcel0.readByte() != 0);
        if(parcel0.readByte() == 0) {
            z = false;
        }
        alxb0.g(z);
        return new AddAccountController(alxb0.a(), z1, intent0, account0, z2, intent1, s, z3, z4, z5, z6, s1, z7, alxy0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AddAccountController[v];
    }
}

