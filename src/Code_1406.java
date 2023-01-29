import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Code_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder(str);
        int cursor = sb.length();

        int num = Integer.parseInt(bf.readLine());
        for(int i = 0; i < num; i++) {
            String[] input = bf.readLine().split(" ");
            switch (input[0]) {
                case "L":
                    if(cursor > 0) cursor--;
                    break;
                case "D":
                    if(cursor < sb.length()) cursor++;
                    break;
                case "B":
                    if(cursor != 0) sb.deleteCharAt(--cursor);
                    break;
                case "P":
                    sb.insert(cursor++, input[1]);
                    break;
            }
        }
        System.out.println(sb);
    }
}
