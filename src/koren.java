public class koren {

        public static void main(String[] args) {
            int perimetr = 1000;
            int max_count = 0;
            int max_i = 0;
            for (int i = 10; i <= perimetr; i++) {
                int tmp_count = 0;
                for (int a = 1; a < i / 2; a++)
                    for (int b = a + 1; b <= i - a - b; b++) {
                        double tmp = Math.sqrt((a * a) + (b * b));
                        int c = i - a - b;
                        if (c == tmp) tmp_count++;
                    }
                if (max_count < tmp_count) {
                    max_count = tmp_count;
                    max_i = i;
                }
            }
            System.out.println(max_count + " " + max_i);
        }
    }
