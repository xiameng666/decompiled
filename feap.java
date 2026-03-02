public class feap extends fean {
    public final fewy a;

    public feap(String s, fewy fewy0) {
        super(s);
        this.a = fewy0;
    }

    public static String b(fewy fewy0) {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        switch((feww.b(fewy0.c) == 0 ? 1 : feww.b(fewy0.c)) - 2) {
            case -1: {
                s = "Unrecognized";
                break;
            }
            case 1: {
                s = "GetAccounts";
                break;
            }
            case 2: {
                s = "GetAccountsResponse";
                break;
            }
            case 3: {
                s = "RemoveAccounts";
                break;
            }
            case 4: {
                s = "RemoveAccountsConfirm";
                break;
            }
            case 5: {
                s = "Cancel";
                break;
            }
            case 6: {
                s = "RemoteError";
                break;
            }
            default: {
                s = "Unspecified";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append('(');
        if((fewy0.b & 2) == 0) {
            feao feao0 = new feao(fewy0.d);
            new gfss(", ").h(stringBuilder0, feao0);
        }
        else {
            stringBuilder0.append(fewy0.e);
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    @Override
    public final String getMessage() {
        return super.getMessage() + ": " + feap.b(this.a);
    }
}

