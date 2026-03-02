import android.os.Parcelable.Creator;

public final class gpmq {
    public static final gpmr a(String s, Parcelable.Creator parcelable$Creator0) {
        String s1 = s + "-bin";
        return new gpmr(new iaob(s1, new iasf(parcelable$Creator0, false)), new ialn("REQ-" + s1), new ialn("RESH-" + s1), new ialn("REST-" + s1));
    }
}

