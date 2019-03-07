public class main {
    public static void main(String[] args) {
        int[] tab = {1, 10, 7, 55, 66, 8, 10};

        Sortable sc = new Sortable() {
            @Override
            public void sort(int[] tab) {
                int n = tab.length;
                do {
                    for (int i = 0; i < n - 1; i++) {
                        if (tab[i] > tab[i + 1]) {
                            int temp = tab[i];
                            tab[i] = tab[i + 1];
                            tab[i + 1] = temp;
                        }

                    }
                    n = n - 1;
                } while (n > 1);
            }


        };
        sc.sort(tab);
        for (int tmp: tab){
            System.out.println(tmp);
        }
    }
}
