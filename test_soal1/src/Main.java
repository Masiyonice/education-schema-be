public class Main {

    //function no 2

    static void datachecking(Object[] obj, int index){
        String abcd = obj[index].getClass().getSimpleName();
        if(obj[index].getClass().getSimpleName().equals("Integer")){
            int temp = (int) obj[index];
            if( temp < 0){
                System.out.println("Tidak bisa di validasi sistem");
            }else{
                System.out.println("index ke "+ index +" adalah "+ abcd + " dengan data "+ obj[index]);
            }
        }else {
            System.out.println("index ke "+ index +" adalah "+ abcd + " dengan data "+ obj[index]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Soal no 1

        int[] data = {1, 2, 4, 3, 10, 11, 20, 5, 100, 200};

        //loop pertama untuk nilai parameter pertama
        for(int i = 0; i < data.length;i++){

            //loop kedua untuk nilai parameter kedua

            for(int j = 0; j < data.length; j++) {

                /* jika data dengan indeks ke i adalah 5 dan data dengan indeks ke j adalah 11 (begitu sebaliknya)
                 maka akan mengeluarkan nilai fizzbuz
                */
                if ((data[i] == 5 && data[j] == 11)||(data[i] == 11 && data[j] == 5)) {
                    System.out.println(data[i]+" "+data[j] + " = FizzBuzz ");
                }
                // jika data indek ke i atau j adalah 11 akan memberi output Buzz
                else if (data[i] == 11 || data[j] ==11){
                    System.out.println(data[i]+" "+data[j] + " = Buzz ");
                }
                // jika data indek ke i atau j adalah 5 akan memberi output Fizz
                else if (data[i] == 5 || data[j] == 5) {
                    System.out.println(data[i]+" "+data[j] + " = Fizz ");
                }
            }
        }

      // Soal no 2

        Object[] data2 = new Object[]{1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1};

        datachecking(data2, 0);
        datachecking(data2, 1);
        datachecking(data2, 2);
        datachecking(data2, data2.length-1);

    }
}