package com.google.android.gms.autofill.util;

import amnu;
import amnv;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import aqbb;
import hqbf;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class CardNetwork implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        CardNetwork.CREATOR = new aqbb();
    }

    public abstract int a();

    public abstract String b();

    public Pattern c() {
        try {
            return Pattern.compile((this.b() + ".*"));
        }
        catch(PatternSyntaxException unused_ex) {
            return null;
        }
    }

    public static amnv d(Context context0, int v) {
        Integer integer0 = CardNetwork.f(v);
        return hqbf.y() ? amnv.d(integer0.intValue(), CardNetwork.e(context0, v), amnu.c) : amnv.c("com.google.android.gms", integer0.intValue(), CardNetwork.e(context0, v));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static CharSequence e(Context context0, int v) {
        switch(v) {
            case 1: {
                return "Amex";
            }
            case 2: {
                return "DinersClub";
            }
            case 3: {
                return "Discover";
            }
            case 4: {
                return "JCB";
            }
            case 5: {
                return "MasterCard";
            }
            case 7: {
                return "Solo";
            }
            case 8: {
                return "Visa";
            }
            case 9: {
                return "Elo";
            }
            case 10: {
                return "Interac";
            }
            case 11: {
                return "EFTPOS";
            }
            case 13: {
                return "Maestro";
            }
            case 14: {
                return "UnionPay";
            }
            case 23: {
                return "Verve";
            }
            default: {
                return context0.getText(0x7F150801);  // string:common_card "Card"
            }
        }
    }

    public static Integer f(int v) {
        switch(v) {
            case 1: {
                return (int)0x7F081095;
            }
            case 2: {
                return (int)0x7F081097;
            }
            case 3: {
                return (int)0x7F081098;
            }
            case 4: {
                return (int)0x7F08109B;
            }
            case 5: {
                return (int)0x7F08109C;
            }
            case 8: {
                return (int)0x7F08109E;
            }
            case 9: {
                return (int)0x7F081099;
            }
            case 23: {
                return (int)0x7F08109D;
            }
            default: {
                return (int)0x7F08109A;
            }
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a());
        parcel0.writeString(this.b());
    }
}

