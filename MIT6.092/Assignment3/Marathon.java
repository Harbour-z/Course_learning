class Marathon {
    public static int bestrunner(int[] times) {
        int num=0;
        int mintime = times[1];
        for(int i=1;i<=times.length -1;i++){
            if(times[i] < mintime){
                mintime = times[i];
                num = i;
            }
        }
        return num;
    }
    public static int secondrunner(int mini,int[] times){
        int num = 0;
        // To be implement;
    }
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };
        int num = bestrunner(times);
        System.out.println(names[num]+" "+times[num]);


    }
} 