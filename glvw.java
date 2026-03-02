public final class glvw implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(glvz.a.h(((String)object0)) && !((String)object0).isEmpty()) {
            return (String)object0;
        }
        StringBuilder stringBuilder0 = new StringBuilder(((String)object0).length() + 16);
        stringBuilder0.append('\"');
        for(int v = 0; v < ((String)object0).length(); ++v) {
            int v1 = ((String)object0).charAt(v);
            switch(v1) {
                case 34: {
                    v1 = 34;
                    stringBuilder0.append('\\');
                    break;
                }
                case 13: 
                case 92: {
                    stringBuilder0.append('\\');
                }
            }
            stringBuilder0.append(((char)v1));
        }
        stringBuilder0.append('\"');
        return stringBuilder0.toString();
    }
}

