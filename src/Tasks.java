public class Tasks {
    public String task1(int x, int y) {
        if (x == 0 ) {
            throw new IllegalArgumentException("Диапозон X неприемлем == 0 ");
        }
        if( y == 0){
            throw new IllegalArgumentException("Диапозон Y неприемлем == 0 ");
        }
        if (x > 0 && y > 0) {
            return "1 координатная четверть";
        }
        if (x < 0 && y > 0) {
            return "2 координатная четверть";
        }
        if (x < 0 && y < 0) {
            return "3 координатная четверть";
        }
        if (x > 0 && y < 0) {
            return "4 координатная четверть";
        } else {
            return "0";
        }
    }

    public double task2(double a, double b){
        if (a < 0 ) {
            throw new IllegalArgumentException("Отрицательное значение");
        }
        if (a%2==0){
            return a*b;
        }
        else {
            return a+b;
        }
    }

    public int task3(int a, int b, int c ){
        if (a <= 0 ) {
            throw new IllegalArgumentException("Отрицательное значение");
        }
        if (b <= 0 ) {
            throw new IllegalArgumentException("Отрицательное значение");
        }
        if (c <= 0 ) {
            throw new IllegalArgumentException("Отрицательное значение");
        }

        int summ = 0;
        if(a > 0) summ +=a;
        if(b > 0) summ +=b;
        if(c > 0) summ +=c;
        return summ;
    }

    public int task4(int a, int b, int c){
        if (a * b * c > a + b + c){
            return a * b * c + 3;
        } else {
            return a + b + c + 3;}

    }

    public String task5(int value){

        if (value < 0 ) {
            throw new IllegalArgumentException("Недопустимо значение меньше 0");
        }

        if(value >= 0 && value <= 19){
            return "F";
        } else if (value >= 20 && value <= 39){
            return "E";
        } else if (value >= 40 && value <=59){
            return "D";
        } else if (value >= 60 && value <=74){
            return "C";
        } else if (value >= 75 && value <= 89){
            return "B";
        } else {
            return "A";
        }
    }
}
