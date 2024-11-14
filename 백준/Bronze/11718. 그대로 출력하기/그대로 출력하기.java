import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s;

        while((s = br.readLine()) != null){
            sb.append(s).append("\n");
        }


        bw.write(sb + "\n");

        br.close();
        bw.close();
    }
}