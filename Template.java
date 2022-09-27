import java.io.*;
import java.util.StringTokenizer;

public class Template {
    //input shenanigans
      /*
         Random stuff to try when stuck:
            -if it's 2C then it's dp
            -for combo/probability problems, expand the given form we're interested in
            -make everything the same then build an answer (constructive, make everything 0 then do something)
            -something appears in parts of 2 --> model as graph
            -assume a greedy then try to show why it works
            -find way to simplify into one variable if multiple exist
            -treat it like fmc (note any passing thoughts/algo that could be used so you can revisit them)
            -find lower and upper bounds on answer
            -figure out what ur trying to find and isolate it
            -see what observations you have and come up with more continuations
            -work backwards (in constructive, go from the goal to the start)
            -turn into prefix/suffix sum argument (often works if problem revolves around adjacent array elements)
            -instead of solving for answer, try solving for complement (ex, find n-(min) instead of max)
            -draw something
            -simulate a process
            -dont implement something unless if ur fairly confident its correct
            -after 3 bad submissions move on to next problem if applicable
            -do something instead of nothing and stay organized
            -write stuff down
         Random stuff to check when wa:
            -if code is way too long/cancer then reassess
            -switched N/M
            -int overflow
            -switched variables
            -wrong MOD
            -hardcoded edge case incorrectly
         Random stuff to check when tle:
            -continue instead of break
            -condition in for/while loop bad
         Random stuff to check when rte:
            -switched N/M
            -long to int/int overflow
            -division by 0
            -edge case for empty list/data structure/N=1
      */
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // your solution goes here

        out.close();
    }

    public static void printArr(long[] arr, PrintWriter out) {
        out.print("[");
        out.flush();
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]);
            out.print(" ");
            out.flush();
        }
        out.print("]");
        out.flush();

    }

    public static void printArr(double[] arr, PrintWriter out) {
        out.print("[");
        out.flush();
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]);
            out.print(" ");
            out.flush();
        }
        out.println("]");
        out.flush();
    }

    public static void printArr(int[] arr, PrintWriter out) {
        out.print("[");
        out.flush();
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]);
            out.print(" ");
            out.flush();
        }
        out.println("]");
        out.flush();
    }

    public static class FastScanner {
        private BufferedReader br;
        private StringTokenizer st;

        public FastScanner(Reader reader) {
            br = new BufferedReader(reader);
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int[] readIntArray(int arrLength) {
            int[] arr = new int[arrLength];
            for (int i = 0; i < arrLength; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public double[] readLongArr(int arrLength) {
            double[] arr = new double[arrLength];
            for (int i = 0; i < arrLength; i++) {
                arr[i] = nextDouble();
            }
            return arr;

        }

        public long[] nextLongArr(int arrLength) {
            long[] arr = new long[arrLength];
            for (int i = 0; i < arrLength; i++) {
                arr[i] = nextLong();
            }
            return arr;

        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}


