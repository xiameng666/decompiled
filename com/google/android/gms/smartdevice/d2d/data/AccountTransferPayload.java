package com.google.android.gms.smartdevice.d2d.data;

import a;
import amjr;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import baub;
import bbgs;
import bbgu;
import bxd;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqgq;
import erqc;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccountTransferPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public byte[] b;
    private static final erqc c;
    private static final Map d;

    static {
        AccountTransferPayload.c = new erqc(new String[]{"D2D", "AccountTransferPayload"});
        AccountTransferPayload.CREATOR = new eqgq();
        bxd bxd0 = new bxd();
        AccountTransferPayload.d = bxd0;
        bxd0.put("accountTransferMsg", new FastJsonResponse.Field(8, false, 8, false, "accountTransferMsg", 2, null));
    }

    public AccountTransferPayload() {
        this.a = new HashSet();
    }

    public AccountTransferPayload(AccountTransferMsg accountTransferMsg0) {
        byte[] arr_b;
        this.a = new HashSet();
        try {
            arr_b = accountTransferMsg0.toString().getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            Log.e("AUTH", "Error serializing object.", unsupportedEncodingException0);
            arr_b = null;
        }
        this.b = arr_b;
        this.a.add(Integer.valueOf(2));
    }

    public AccountTransferPayload(Set set0, byte[] arr_b) {
        this.a = set0;
        this.b = arr_b;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        if(v == 2) {
            return this.b;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + v);
    }

    @Override  // bbgi
    public final Map b() {
        return AccountTransferPayload.d;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void go(FastJsonResponse.Field fastJsonResponse$Field0, String s, byte[] arr_b) {
        int v = fastJsonResponse$Field0.g;
        if(v != 2) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a byte array"));
        }
        this.b = arr_b;
        this.a.add(Integer.valueOf(2));
    }

    public final AccountTransferMsg p() {
        if(this.b == null) {
            return null;
        }
        AccountTransferMsg accountTransferMsg0 = new AccountTransferMsg();
        try {
            byte[] arr_b = this.b;
            try {
                new bbgu().h(new ByteArrayInputStream(arr_b), accountTransferMsg0);
                return accountTransferMsg0;
            }
            catch(bbgs bbgs0) {
                throw new amjr(bbgs0.getMessage());
            }
        }
        catch(amjr amjr0) {
            AccountTransferPayload.c.g("Failed populating AccountTransferMsg from bytes", amjr0, new Object[0]);
            return null;
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        if(this.a.contains(Integer.valueOf(2))) {
            baub.i(parcel0, 2, this.b, true);
        }
        baub.c(parcel0, v1);
    }
}

