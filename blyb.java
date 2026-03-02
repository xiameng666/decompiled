import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

public final class blyb extends Exception {
    public final short a;

    public blyb(short v, Throwable throwable0) {
        super(throwable0);
        this.a = v;
    }

    public final ErrorResponseData a() {
        int v = this.a;
        switch(v) {
            case 0x6A80: {
                return new ErrorResponseData(ErrorCode.c, String.format("Low level error 0x%s", Integer.toHexString(0x6A80)));
            }
            case 0x6D00: {
                return new ErrorResponseData(ErrorCode.e, "Device ineligible.");
            }
            default: {
                return new ErrorResponseData(ErrorCode.b, String.format("Low level error 0x%s", Integer.toHexString(v)));
            }
        }
    }
}

