import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));

        int t = in.nextInt();
        while(t-- > 0){
        }
        out.flush();

        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}