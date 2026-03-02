import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public final class hmli {
    public Object a;
    public final boolean b;
    public boolean c;
    public String d;
    public hmlh e;

    public hmli(Object object0) {
        this.b = false;
        this.c = false;
        this.a = object0;
    }

    public hmli(String s) {
        this.c = false;
        this.b = true;
        this.d = s;
    }

    public final int a(hmli hmli0) {
        return this.b(hmli0.a);
    }

    public final int b(Object object0) {
        Object object1 = this.a;
        if((object1 instanceof String)) {
            if((object0 instanceof String)) {
                return ((String)object1).compareTo(((String)object0));
            }
            if((object0 instanceof ByteBuffer)) {
                return ((String)object1).compareTo(hmlx.g(((ByteBuffer)object0).array()));
            }
            if((object0 instanceof hmkg)) {
                return ((String)object1).compareTo(((hmkg)object0).a.toString());
            }
            if((object0 instanceof BigDecimal)) {
                return ((String)object1).compareTo(object0.toString());
            }
            if((object0 instanceof Boolean)) {
                return ((String)object1).compareTo(object0.toString());
            }
            if((object0 instanceof hmkf)) {
                return ((String)object1).compareTo(object0.toString());
            }
            throw new IllegalArgumentException("Data type not supported");
        }
        if((object1 instanceof ByteBuffer)) {
            if((object0 instanceof ByteBuffer)) {
                return ((ByteBuffer)object1).compareTo(((ByteBuffer)object0));
            }
            if((object0 instanceof String)) {
                return ((ByteBuffer)object1).compareTo(ByteBuffer.wrap(((String)object0).getBytes(StandardCharsets.US_ASCII)));
            }
            if((object0 instanceof hmkg)) {
                return ((ByteBuffer)object1).compareTo(((hmkg)object0).b());
            }
            if((object0 instanceof BigDecimal)) {
                return ((ByteBuffer)object1).compareTo(ByteBuffer.wrap(((BigDecimal)object0).toBigInteger().toByteArray()));
            }
            if((object0 instanceof hmkf)) {
                return new hmkf(((ByteBuffer)object1)).a(((hmkf)object0));
            }
            throw new IllegalArgumentException("Data type not supported");
        }
        if((object1 instanceof hmkg)) {
            if((object0 instanceof hmkg)) {
                return ((hmkg)object1).a.compareTo(((hmkg)object0).a);
            }
            if((object0 instanceof BigDecimal)) {
                return ((hmkg)object1).a.compareTo(((BigDecimal)object0));
            }
            if((object0 instanceof String)) {
                return ((hmkg)object1).a.compareTo(new BigDecimal(((String)object0)));
            }
            if((object0 instanceof ByteBuffer)) {
                return ((hmkg)object1).a.compareTo(new BigDecimal(new BigInteger(((ByteBuffer)object0).array())));
            }
            if((object0 instanceof hmkf)) {
                return new hmkf(((hmkg)object1).a.longValue()).a(((hmkf)object0));
            }
            throw new IllegalArgumentException("Data type not supported");
        }
        if((object1 instanceof hmkf)) {
            if((object0 instanceof hmkf)) {
                return ((hmkf)object1).a(((hmkf)object0));
            }
            if((object0 instanceof String)) {
                return object1.toString().compareTo(((String)object0));
            }
            if((object0 instanceof hmkg)) {
                return ((hmkf)object1).b().a.compareTo(((hmkg)object0).a);
            }
            if(!(object0 instanceof ByteBuffer)) {
                throw new IllegalArgumentException("Data type not supported");
            }
            hmkf hmkf0 = new hmkf(((ByteBuffer)object0));
            return ((hmkf)this.a).a(hmkf0);
        }
        if((object1 instanceof BigDecimal)) {
            if((object0 instanceof BigDecimal)) {
                return ((BigDecimal)object1).compareTo(((BigDecimal)object0));
            }
            if((object0 instanceof String)) {
                return ((BigDecimal)object1).compareTo(new BigDecimal(((String)object0)));
            }
            if((object0 instanceof hmkg)) {
                return ((BigDecimal)object1).compareTo(((hmkg)object0).a);
            }
            if((object0 instanceof ByteBuffer)) {
                return ((BigDecimal)object1).compareTo(new BigDecimal(new BigInteger(((ByteBuffer)object0).array())));
            }
            if((object0 instanceof hmkf)) {
                return ((BigDecimal)object1).compareTo(((hmkf)object0).b().a);
            }
            throw new IllegalArgumentException("Data type not supported");
        }
        if((object1 instanceof Boolean)) {
            if((object0 instanceof Boolean)) {
                return ((Boolean)object1).compareTo(((Boolean)object0));
            }
            if((object0 instanceof String)) {
                return ((Boolean)object1).compareTo(Boolean.valueOf(Boolean.parseBoolean(((String)object0))));
            }
            throw new IllegalArgumentException("Data type not supported");
        }
        if((object1 instanceof JSONObject)) {
            if((object0 instanceof JSONObject)) {
                return object1.toString().compareTo(object0.toString());
            }
        }
        else if((object1 instanceof JSONArray) && (object0 instanceof JSONArray)) {
            return object1.toString().compareTo(object0.toString());
        }
        throw new IllegalArgumentException("Data type not supported");
    }

    public static hmli c(hmli hmli0) {
        hmkg hmkg0 = null;
        Object object0 = hmli0.a;
        if((object0 instanceof ByteBuffer)) {
            return new hmli(ByteBuffer.wrap(((byte[])((ByteBuffer)object0).array().clone())));
        }
        if((object0 instanceof hmkg)) {
            if(((hmkg)object0) != null) {
                hmkg0 = new hmkg(((hmkg)object0).b);
                hmkg0.a = ((hmkg)object0).a;
            }
            return new hmli(hmkg0);
        }
        if((object0 instanceof BigDecimal)) {
            return new hmli(new BigDecimal(object0.toString()));
        }
        if(!(object0 instanceof String)) {
            if((object0 instanceof hmle)) {
                hmle hmle0 = new hmle();
                ByteBuffer byteBuffer0 = ((hmle)object0).a;
                if(byteBuffer0 != null) {
                    hmle0.a = ByteBuffer.wrap(((byte[])byteBuffer0.array().clone()));
                }
                hmkh hmkh0 = ((hmle)object0).b;
                if(hmkh0 != null) {
                    hmkh hmkh1 = new hmkh(hmkh0.a);
                    hmkh1.b = hmkh0.b;
                    hmkh1.c = hmkh0.c;
                    hmle0.b = hmkh1;
                }
                hmle0.c = hmlm.a(((hmle)object0).c);
                return new hmli(hmle0);
            }
            if(!(object0 instanceof Boolean)) {
                if((object0 instanceof JSONObject)) {
                    return new hmli(new JSONObject(String.valueOf(hmli0.a)));
                }
                if((object0 instanceof JSONArray)) {
                    return new hmli(new JSONArray(String.valueOf(hmli0.a)));
                }
                if((object0 instanceof hmkf)) {
                    if(((hmkf)object0) != null) {
                        hmkg0 = new hmkf(((hmkf)object0).a.getTimeInMillis());
                        hmkg0.a = ((hmkf)object0).a;
                        hmkg0.b = ((hmkf)object0).b;
                        hmkg0.c = ((hmkf)object0).c;
                        hmkg0.d = ((hmkf)object0).d;
                        hmkg0.e = ((hmkf)object0).e;
                        hmkg0.f = ((hmkf)object0).f;
                    }
                    return new hmli(hmkg0);
                }
                if((object0 instanceof hmli)) {
                    return new hmli(((hmli)object0).a);
                }
                throw new IllegalArgumentException("Data type not supported");
            }
        }
        return new hmli(object0);
    }

    public final Object d(Object object0) {
        Object object1 = this.a;
        if((object1 instanceof String)) {
            if(!(object0 instanceof String)) {
                if((object0 instanceof ByteBuffer)) {
                    return ByteBuffer.wrap(((String)object1).getBytes(StandardCharsets.US_ASCII));
                }
                if((object0 instanceof Boolean)) {
                    return Boolean.valueOf(((String)object1));
                }
                if((object0 instanceof hmkg)) {
                    int v = ((hmkg)object0).b;
                    if(v == 3) {
                        return new hmkg(new BigDecimal(((String)object1)), 3);
                    }
                    if(v == 6) {
                        return new hmkg(new BigDecimal(((String)object1)), 6);
                    }
                    if(v == 4) {
                        return new hmkg(new BigDecimal(((String)object1)), 4);
                    }
                    if(v == 5) {
                        return new hmkg(new BigDecimal(((String)object1)), 5);
                    }
                    if(v == 2) {
                        return new hmkg(new BigDecimal(((String)object1)), 2);
                    }
                    if(v == 1) {
                        return new hmkg(new BigDecimal(((String)object1)), 1);
                    }
                    if(v == 11) {
                        return new hmkg(new BigDecimal(((String)object1)), 11);
                    }
                    return v == 10 ? new hmkg(new BigDecimal(((String)object1).toCharArray()), 10) : new hmkg(new BigDecimal(((String)object1)), 10);
                }
                if((object0 instanceof hmkf)) {
                    return new hmkf(((String)object1), "UTC", "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX", hmke.e);
                }
                throw new IllegalArgumentException("Data type conversion not supported");
            }
            return (String)object1;
        }
        if((object1 instanceof ByteBuffer)) {
            Object object2 = (ByteBuffer)object1;
            if((object0 instanceof String)) {
                try {
                    return new String(((ByteBuffer)object2).array(), StandardCharsets.US_ASCII);
                }
                catch(Exception exception0) {
                    throw new hmki(exception0.getMessage());
                }
            }
            if(!(object0 instanceof ByteBuffer)) {
                if((object0 instanceof hmkg)) {
                    int v1 = ((hmkg)object0).b;
                    if(v1 == 10) {
                        return new hmkg(new BigDecimal(hmlx.g(((ByteBuffer)object2).array())), 10);
                    }
                    if(v1 == 11) {
                        return new hmkg(new BigDecimal(new BigInteger(((ByteBuffer)object2).array())), 11);
                    }
                    if(v1 == 6) {
                        return new hmkg(new BigDecimal(hmli.f(((ByteBuffer)object2), 8).getLong()), 6);
                    }
                    if(v1 == 5) {
                        return new hmkg(BigDecimal.valueOf(hmli.f(((ByteBuffer)object2), 8).getDouble()), 5);
                    }
                    if(v1 == 2) {
                        return new hmkg(new BigDecimal(hmli.f(((ByteBuffer)object2), 2).getShort()), 2);
                    }
                    if(v1 == 1) {
                        return new hmkg(new BigDecimal(((ByteBuffer)object2).get()), 1);
                    }
                    if(v1 == 4) {
                        return new hmkg(BigDecimal.valueOf(hmli.f(((ByteBuffer)object2), 4).getFloat()), 4);
                    }
                    if(v1 == 3) {
                        return new hmkg(new BigDecimal(hmli.f(((ByteBuffer)object2), 4).getInt()), 3);
                    }
                }
                else if((object0 instanceof hmkf)) {
                    return new hmkf(((ByteBuffer)object2));
                }
                throw new IllegalArgumentException("Data type conversion not supported");
            }
            return object2;
        }
        if((object1 instanceof Byte)) {
            if(!(object0 instanceof Byte)) {
                if((object0 instanceof String)) {
                    return hmlx.g(new byte[]{((byte)(((Byte)object1)))});
                }
                if((object0 instanceof ByteBuffer)) {
                    return ByteBuffer.wrap(new byte[]{((byte)(((Byte)object1)))});
                }
                if(!(object0 instanceof hmkg)) {
                    throw new IllegalArgumentException("Data type conversion not supported");
                }
                int v2 = ((hmkg)object0).b;
                if(v2 == 6) {
                    return new hmkg(new BigDecimal(((Byte)object1).longValue()), 6);
                }
                if(v2 == 4) {
                    return new hmkg(BigDecimal.valueOf(((Byte)object1).floatValue()), 4);
                }
                if(v2 == 5) {
                    return new hmkg(BigDecimal.valueOf(((Byte)object1).doubleValue()), 5);
                }
                return v2 == 2 ? new hmkg(new BigDecimal(((Byte)object1).shortValue()), 2) : new hmkg(new BigDecimal(((byte)(((Byte)object1)))), 1);
            }
            return (Byte)object1;
        }
        if((object1 instanceof hmkg)) {
            if((object0 instanceof hmkg)) {
                int v3 = ((hmkg)object0).b;
                if(v3 == 3) {
                    return hmkg.a(Integer.valueOf(((hmkg)object1).a.intValue()));
                }
                if(v3 == 10) {
                    return hmkg.a(((hmkg)object1).a);
                }
                if(v3 == 6) {
                    return hmkg.a(Long.valueOf(((hmkg)object1).a.longValue()));
                }
                if(v3 == 4) {
                    return hmkg.a(Float.valueOf(((hmkg)object1).a.floatValue()));
                }
                if(v3 == 5) {
                    return hmkg.a(Double.valueOf(((hmkg)object1).a.doubleValue()));
                }
                if(v3 == 2) {
                    return hmkg.a(Short.valueOf(((hmkg)object1).a.shortValue()));
                }
                if(v3 == 1) {
                    return hmkg.a(Byte.valueOf(((hmkg)object1).a.byteValue()));
                }
                return v3 == 11 ? hmkg.a(((hmkg)object1).a.toBigInteger()) : ((hmkg)object1);
            }
            if((object0 instanceof String)) {
                return ((hmkg)object1).a.toString();
            }
            if((object0 instanceof ByteBuffer)) {
                return ((hmkg)object1).b();
            }
            if((object0 instanceof hmkf)) {
                return new hmkf(((hmkg)object1).a.longValue());
            }
            throw new IllegalArgumentException("Data type conversion not supported");
        }
        if((object1 instanceof BigDecimal)) {
            if((object0 instanceof String)) {
                return ((BigDecimal)object1).toString();
            }
            if((object0 instanceof ByteBuffer)) {
                return ByteBuffer.wrap(((BigDecimal)object1).toString().getBytes(StandardCharsets.US_ASCII));
            }
            if((object0 instanceof hmkg)) {
                int v4 = ((hmkg)object0).b;
                if(v4 == 3) {
                    return new hmkg(new BigDecimal(((BigDecimal)object1).intValue()), 3);
                }
                if(v4 == 6) {
                    return new hmkg(new BigDecimal(((BigDecimal)object1).longValue()), 6);
                }
                if(v4 == 4) {
                    return new hmkg(BigDecimal.valueOf(((BigDecimal)object1).floatValue()), 4);
                }
                if(v4 == 5) {
                    return new hmkg(BigDecimal.valueOf(((BigDecimal)object1).doubleValue()), 5);
                }
                return v4 == 1 ? new hmkg(new BigDecimal(((BigDecimal)object1).byteValue()), 1) : new hmkg(((BigDecimal)object1), 10);
            }
            if((object0 instanceof hmkf)) {
                return new hmkf(((BigDecimal)object1).longValue());
            }
            throw new IllegalArgumentException("Data type conversion not supported");
        }
        if((object1 instanceof hmkf)) {
            if(!(object0 instanceof hmkf)) {
                if((object0 instanceof String)) {
                    return ((hmkf)object1).toString();
                }
                if((object0 instanceof hmkg)) {
                    int v5 = ((hmkg)object0).b;
                    if(v5 == 3) {
                        return hmkg.a(Integer.valueOf(((hmkf)object1).b().a.intValue()));
                    }
                    if(v5 == 6) {
                        return hmkg.a(Long.valueOf(((hmkf)object1).b().a.longValue()));
                    }
                    if(v5 == 10) {
                        return ((hmkf)object1).b();
                    }
                    throw new IllegalArgumentException("Data type conversion not supported");
                }
                if(!(object0 instanceof ByteBuffer)) {
                    throw new IllegalArgumentException("Data type conversion not supported");
                }
                byte[] arr_b = new byte[((hmkf)object1).c];
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(8).putLong(((hmkf)object1).a.getTimeInMillis());
                byteBuffer0.position(8 - ((hmkf)object1).c);
                byteBuffer0.get(arr_b, 0, ((hmkf)object1).c);
                return ByteBuffer.wrap(arr_b);
            }
            return (hmkf)object1;
        }
        if((object1 instanceof Boolean)) {
            if(!(object0 instanceof Boolean)) {
                if((object0 instanceof String)) {
                    return ((Boolean)object1).toString();
                }
                throw new IllegalArgumentException("Data type conversion not supported");
            }
            return (Boolean)object1;
        }
        if((object1 instanceof JSONObject)) {
            if((object0 instanceof JSONObject)) {
                return object1;
            }
        }
        else if((object1 instanceof JSONArray) && (object0 instanceof JSONArray)) {
            return object1;
        }
        throw new IllegalArgumentException("Data type conversion not supported");
    }

    public final void e() {
        this.c = true;
    }

    private static final ByteBuffer f(ByteBuffer byteBuffer0, int v) {
        return byteBuffer0.array().length >= v ? byteBuffer0 : ByteBuffer.wrap(hmlx.l(byteBuffer0.array(), v));
    }

    @Override
    public final String toString() {
        Object object0 = this.a;
        if(object0 != null) {
            return (object0 instanceof ByteBuffer) ? hmlx.g(((ByteBuffer)object0).array()) : object0.toString();
        }
        return this.d;
    }
}

