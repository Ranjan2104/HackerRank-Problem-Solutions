import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;

public class D {
    InputStream is;
    PrintWriter out;
//    String INPUT = "777776999999999 777777999999999 ";
    String INPUT = "";
    
    void solve()
    {
        long l = nl(), r = nl();
        l = next(l);
        int rlen = Long.toString(r).length();
        int llen = Long.toString(l).length();
        int[] map = {-1, -1, 0, 1, -1, 2, -1, 3, -1, -1};
        int[] imap = {2, 3, 5, 7};
        int ct = 0;
        for(int len = llen;len <= rlen;len++){
            int[] a = new int[len];
            if(len == llen){
                long x = l;
                for(int i = len-1;i >= 0;i--){
                    int d = (int)(x % 10);
                    assert map[d] != -1;
                    a[i] = map[d];
                    x /= 10;
                }
            }
            do{
//                if(len > 1 && (a[len-1] == 0 || a[len-1] == 2))continue;
                
                long X = 0;
                for(int i = 0;i < len;i++){
                    X = X * 10 + imap[a[i]];
                }
                if(X > r)break;
                if(BigInteger.valueOf(X).isProbablePrime(30)){
                    ct++;
                }
            }while(inc(a, 4));
        }
        out.println(ct);
    }
    
    long next(long n)
    {
        char[] s =( "0" + Long.toString(n)).toCharArray();
        
        int[] next = {2, 2, 2, 3, 5, 5, 7, 7, 2, 2};
        for(int i = s.length-1;i >= 0;i--){
            if(i == 0 && s[i] == '0')break;
            if(s[i] > '9'){
                s[i] -= 10;
                s[i-1]++;
            }
            if(s[i] > '7'){
                s[i-1]++;
            }
            char t = (char)('0'+next[s[i]-'0']);
            if(t != s[i]){
                for(int j = i+1;j < s.length;j++)s[j] = '2';
            }
            s[i] = t;
        }
        return Long.parseLong(new String(s));
    }
    
    public static boolean inc(int[] a, int base) {
        int n = a.length;
        int i;
        for (i = n - 1; i >= 0 && a[i] == base - 1; i--)
            ;
        if (i == -1)
            return false;

        a[i]++;
        Arrays.fill(a, i + 1, n, 0);
        return true;
    }

    
    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception { new D().run(); }
    
    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    
    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }
    
    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }
    
    private int ni()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
}