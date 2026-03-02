public final class fupd implements fuox {
    private final fuox a;

    public fupd(fuox fuox0) {
        this.a = fuox0;
    }

    public final CharSequence a(fuoz fuoz0) {
        CharSequence charSequence1;
        if(fuoz0 != null) {
            fuoz0.a();
            String[] arr_s = fuoz0.a();
            for(int v = 0; v < arr_s.length; ++v) {
                CharSequence charSequence0 = arr_s[v];
                if(charSequence0 == null || ((String)charSequence0).isEmpty() || ((String)charSequence0).equals(".")) {
                    charSequence0 = null;
                }
                else if(((String)charSequence0).length() > 2) {
                    gftb.q(((fupb)this.a).a.e);
                    bzs bzs0 = (bzs)((fupb)this.a).a.d.get();
                    if(bzs0 == null) {
                        charSequence1 = null;
                    }
                    else {
                        int v1 = ((String)charSequence0).length();
                        charSequence1 = null;
                        for(int v2 = 0; v2 < v1 && bzs0 != null; ++v2) {
                            fupk fupk0 = (fupk)bzs0.get(Character.valueOf(((String)charSequence0).charAt(v2)));
                            if(fupk0 == null) {
                                break;
                            }
                            String s = fupk0.a;
                            if(s != null) {
                                charSequence1 = s;
                            }
                            bzs0 = fupk0.b;
                        }
                    }
                    charSequence0 = charSequence1 == null ? new StringBuilder().appendCodePoint(((String)charSequence0).codePointAt(0)).toString() : charSequence1;
                }
                if(charSequence0 != null) {
                    return charSequence0;
                }
            }
        }
        return null;
    }

    public static final int b(String s) {
        return s == null ? fupc.a[0] : fupc.a[Math.abs(s.hashCode()) % 21];
    }
}

